package capstone_april;

//sort the customers in the ecommerce website based on priority
// id           type            price           time
//101          regular          500             2
//102          prime            200             1
//103          prime            700             3
//104          regular          800             4
//105          prime            700             2


import java.util.Locale;

public class problem09 {
    static class Customer {
        int id;
        String type;
        int price;
        int time;

        Customer(int id, String type, int price, int time) {
            this.id = id;
            this.type = type;
            this.price = price;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Customer{id=" + id + ", type='" + type + "', price=" + price + ", time=" + time + "}";
        }
    }

    // Priority: prime first, then higher price, then lower time, then lower id.
    private static int compareCustomerPriority(Customer a, Customer b) {
        boolean aPrime = "prime".equals(a.type.toLowerCase(Locale.ROOT));
        boolean bPrime = "prime".equals(b.type.toLowerCase(Locale.ROOT));

        if (aPrime != bPrime) {
            return aPrime ? -1 : 1;
        }
        if (a.price != b.price) {
            return Integer.compare(b.price, a.price);
        }
        if (a.time != b.time) {
            return Integer.compare(a.time, b.time);
        }
        return Integer.compare(a.id, b.id);
    }

    private static void mergeSort(Customer[] customers, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(customers, left, mid);
        mergeSort(customers, mid + 1, right);
        merge(customers, left, mid, right);
    }

    private static void merge(Customer[] customers, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        Customer[] leftHalf = new Customer[leftSize];
        Customer[] rightHalf = new Customer[rightSize];

        System.arraycopy(customers, left, leftHalf, 0, leftSize);
        System.arraycopy(customers, mid + 1, rightHalf, 0, rightSize);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {
            if (compareCustomerPriority(leftHalf[i], rightHalf[j]) <= 0) {
                customers[k++] = leftHalf[i++];
            } else {
                customers[k++] = rightHalf[j++];
            }
        }

        while (i < leftSize) {
            customers[k++] = leftHalf[i++];
        }
        while (j < rightSize) {
            customers[k++] = rightHalf[j++];
        }
    }

    public static void main(String[] args) {
        Customer[] customers = {
                new Customer(101, "regular", 500, 2),
                new Customer(102, "prime", 200, 1),
                new Customer(103, "prime", 700, 3),
                new Customer(104, "regular", 800, 4),
                new Customer(105, "prime", 700, 2)
        };
        mergeSort(customers, 0, customers.length - 1);

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
