package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        ObservableArrayList observableArrayList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            observableArrayList.add(arrayList.get(i10).freeze());
        }
        return observableArrayList;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        ObservableArrayList observableArrayList = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            observableArrayList.add(it.next().freeze());
        }
        return observableArrayList;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        ObservableArrayList observableArrayList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            observableArrayList.add(e10.freeze());
        }
        return observableArrayList;
    }
}
