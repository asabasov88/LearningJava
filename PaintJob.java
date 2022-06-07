package com.learningparsinginjava;

public class PaintJob {

    public static void main(String[] args) {

        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        System.out.println(getBucketCount(3.26, 0.75));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {

            return -1;

        }

        double wallArea = width * height;
        double bucketCount = (wallArea / areaPerBucket) - (double) extraBuckets;

        if (bucketCount % 2 == 0) {

            return (int) bucketCount;

        } else {

            return (int) bucketCount + 1;

        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {

            return -1;

        }

        double wallArea = width * height;
        double bucketCount = ((wallArea / areaPerBucket));

        if (bucketCount % 2 == 0) {

            return (int) bucketCount;

        } else {

            return (int) bucketCount + 1;

        }

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {

            return -1;

        }

        double bucketCount = area / areaPerBucket;

        if (bucketCount % 2 == 0) {

            return (int) bucketCount;

        } else {

            return (int) bucketCount + 1;

        }

    }

}
