package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class lf1 {
    public static int a(Rect viewRect, List overlappingRects) {
        kotlin.jvm.internal.l.f(viewRect, "viewRect");
        kotlin.jvm.internal.l.f(overlappingRects, "overlappingRects");
        TreeSet treeSet = new TreeSet();
        treeSet.add(Integer.valueOf(viewRect.left));
        treeSet.add(Integer.valueOf(viewRect.right));
        Iterator it = overlappingRects.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next();
            treeSet.add(Integer.valueOf(rect.left));
            treeSet.add(Integer.valueOf(rect.right));
        }
        ArrayList arrayList = new ArrayList(treeSet);
        TreeSet treeSet2 = new TreeSet();
        treeSet2.add(Integer.valueOf(viewRect.top));
        treeSet2.add(Integer.valueOf(viewRect.bottom));
        Iterator it2 = overlappingRects.iterator();
        while (it2.hasNext()) {
            Rect rect2 = (Rect) it2.next();
            treeSet2.add(Integer.valueOf(rect2.top));
            treeSet2.add(Integer.valueOf(rect2.bottom));
        }
        ArrayList arrayList2 = new ArrayList(treeSet2);
        viewRect.left = Collections.binarySearch(arrayList, Integer.valueOf(viewRect.left));
        viewRect.top = Collections.binarySearch(arrayList2, Integer.valueOf(viewRect.top));
        viewRect.right = Collections.binarySearch(arrayList, Integer.valueOf(viewRect.right));
        viewRect.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(viewRect.bottom));
        Iterator it3 = overlappingRects.iterator();
        while (it3.hasNext()) {
            Rect rect3 = (Rect) it3.next();
            rect3.left = Collections.binarySearch(arrayList, Integer.valueOf(rect3.left));
            rect3.top = Collections.binarySearch(arrayList2, Integer.valueOf(rect3.top));
            rect3.right = Collections.binarySearch(arrayList, Integer.valueOf(rect3.right));
            rect3.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(rect3.bottom));
        }
        int size = arrayList.size() - 1;
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            bArr[i] = new byte[arrayList2.size() - 1];
        }
        Iterator it4 = overlappingRects.iterator();
        while (it4.hasNext()) {
            Rect rect4 = (Rect) it4.next();
            int i10 = rect4.right;
            for (int i11 = rect4.left; i11 < i10; i11++) {
                int i12 = rect4.bottom;
                for (int i13 = rect4.top; i13 < i12; i13++) {
                    bArr[i11][i13] = 1;
                }
            }
        }
        int size2 = arrayList.size() - 1;
        int iIntValue = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            int size3 = arrayList2.size() - 1;
            for (int i15 = 0; i15 < size3; i15++) {
                if (bArr[i14][i15] == 1) {
                    iIntValue = ((((Number) arrayList2.get(i15 + 1)).intValue() - ((Number) arrayList2.get(i15)).intValue()) * (((Number) arrayList.get(i14 + 1)).intValue() - ((Number) arrayList.get(i14)).intValue())) + iIntValue;
                }
            }
        }
        return iIntValue;
    }
}
