package com.google.common.collect;

import java.util.Queue;

/* loaded from: classes2.dex */
public abstract class w extends q implements Queue {
    @Override // java.util.Queue
    public Object element() {
        return x().element();
    }

    @Override // java.util.Queue
    public Object peek() {
        return x().peek();
    }

    @Override // java.util.Queue
    public Object poll() {
        return x().poll();
    }

    @Override // java.util.Queue
    public Object remove() {
        return x().remove();
    }

    public abstract Queue x();
}
