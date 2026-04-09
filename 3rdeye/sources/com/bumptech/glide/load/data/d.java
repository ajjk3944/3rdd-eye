package com.bumptech.glide.load.data;

/* compiled from: DataFetcher.java */
/* loaded from: classes.dex */
public interface d<T> {

    /* compiled from: DataFetcher.java */
    public interface a<T> {
        void c(Exception exc);

        void f(T t10);
    }

    Class<T> a();

    void b();

    void cancel();

    L2.a d();

    void e(com.bumptech.glide.h hVar, a<? super T> aVar);
}
