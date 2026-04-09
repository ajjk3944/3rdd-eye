package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class np {

    /* renamed from: a, reason: collision with root package name */
    private final a f30962a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30963b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30964b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f30965c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f30966d;

        static {
            a aVar = new a(0, "TEXT");
            f30964b = aVar;
            a aVar2 = new a(1, "IMAGE");
            f30965c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f30966d = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f30966d.clone();
        }
    }

    public np(a type, String str) {
        kotlin.jvm.internal.l.f(type, "type");
        this.f30962a = type;
        this.f30963b = str;
    }

    public final String a() {
        return this.f30963b;
    }

    public final a b() {
        return this.f30962a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        return this.f30962a == npVar.f30962a && kotlin.jvm.internal.l.b(this.f30963b, npVar.f30963b);
    }

    public final int hashCode() {
        int iHashCode = this.f30962a.hashCode() * 31;
        String str = this.f30963b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.f30962a + ", text=" + this.f30963b + ")";
    }
}
