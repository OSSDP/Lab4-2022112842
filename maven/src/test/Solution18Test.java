import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *测试用例设计的总体原则:
 * 测试用例的设计考虑的因素有：数组长度（短、中等、长）；数组中数据正负情况（全正、含0、含负数）
 * 按照等价类划分原则，我们不必按照笛卡尔积划分，只需涵盖所有等价类即可。因此可以设计五个测试用例：
 *             数组中只含有一个数；数组中含有超过10个数；数组中含0；数组中含负数；数组最普通（无前面四种特例。
 */
class Solution18Test {
    //测试数组中只含有一个数的情况
    @Test
    void test_single() {
        int[] nums1 = {9};
        int[] ret1 = {1};
        assertArrayEquals(ret1,Solution18.productExceptSelf(nums1));
    }

    //测试数组中含有超过10个数的情况
    @Test
    void test_long() {
        int[] nums2 = {2,5,7,9,8,4,6,7,2,3,4,5};
        int[] ret2 = {50803200,20321280,14515200,11289600,12700800,25401600,
                16934400,14515200,50803200,33868800,25401600,20321280};
        assertArrayEquals(ret2,Solution18.productExceptSelf(nums2));
    }

    //测试数组中含0的情况
    @Test
    void test_zero() {
        int[] nums3 = {1,0,2,4};
        int[] ret3 = {0,8,0,0};
        assertArrayEquals(ret3, Solution18.productExceptSelf(nums3));
    }

    //测试数组中含负数的情况
    @Test
    void test_negative() {
        int[] num4 = {4,-6,-2,-1,3};
        int[] ret4 = {-36,24,72,144,-48};
        assertArrayEquals(ret4,Solution18.productExceptSelf(num4));
    }

    //测试最普通的情况
    @Test
    void test_normal() {
        int[] nums5 = {4,2,3,7,5};
        int[] ret5 = {252,504,336,144,168};
        assertArrayEquals(ret5,Solution18.productExceptSelf(nums5));
    }
}