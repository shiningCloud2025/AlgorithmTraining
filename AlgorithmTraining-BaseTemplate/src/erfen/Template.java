package erfen;

/**
 * 二分模版
 * @author shiningCloud2025
 */
public class Template {
    // TODO: 二分查找:主要用于在一段具有二段性的序列上查找某个特定的值
    //  例题:有一个有序的数组[1,3,5,6,7,9,10],查找9的位置.
    //  我们可以先定位到中间的6,因为9>6,因此6的左边是不可能有9的,因此我们只查找右半边.
    //   迭代这个过程,每次可以排除现有数据的一半，因此时间复杂度为O(log2n)

    // TODO : 二分查找的难点:
    //  1.代码容易死循环
    //  2.二段性不好判断(最典型的就是寻找峰值那道题)


    // TODO: 二分查找代码模版:
    // TODO:第一种:靠左 r = mid  l =mid+1
//    int base1(int l,int r){
//        while(l<r){
//            int mid = (l+r)/2;
//            if(check(mid)) r = mid;
//            else l = mid+1;
//        }
//        return r;
//    }

    // TODO: 第二种:靠右 r = mid-1 l = mid
//    int base2(int l,int r){
//        while(l<r){
//            int mid = (l+r+1)/2;
//            if (check(mid)) r=mid-1;
//            else l=mid;
//        }
//        return r;
//    }

    // TODO:二分查找核心点
    //  1.靠左还是靠右
    //  2.对应的mid和l、r写对
}
