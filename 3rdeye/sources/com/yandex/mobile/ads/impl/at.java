package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    private final a f24804a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24805b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24806b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24807c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f24808d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f24809e;

        static {
            a aVar = new a(0, "PERCENTS");
            f24806b = aVar;
            a aVar2 = new a(1, "MILLISECONDS");
            f24807c = aVar2;
            a aVar3 = new a(2, "POSITION");
            f24808d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f24809e = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24809e.clone();
        }
    }

    public at(a positionType, long j4) {
        kotlin.jvm.internal.l.f(positionType, "positionType");
        this.f24804a = positionType;
        this.f24805b = j4;
    }

    public final a a() {
        return this.f24804a;
    }

    public final long b() {
        return this.f24805b;
    }
}
