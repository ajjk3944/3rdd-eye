package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class Zc {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f40466c;

    /* renamed from: a, reason: collision with root package name */
    public final String f40467a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40468b;

    static {
        SparseArray sparseArray = new SparseArray();
        f40466c = sparseArray;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Zc("jvm", "binder"));
        sparseArray.put(5890, new Zc("jvm", "file"));
        sparseArray.put(5889, new Zc("jvm", "file"));
        sparseArray.put(5897, new Zc("jni_native", "file"));
        sparseArray.put(5898, new Zc("jni_native", "file"));
    }

    public Zc(String str, String str2) {
        this.f40467a = str;
        this.f40468b = str2;
    }
}
