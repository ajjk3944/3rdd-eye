package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class vt {

    /* renamed from: a, reason: collision with root package name */
    private final a f34660a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34661b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f34662b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f34663c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f34664d;

        static {
            a aVar = new a(0, "TEXT");
            f34662b = aVar;
            a aVar2 = new a(1, "IMAGE");
            f34663c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f34664d = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f34664d.clone();
        }
    }

    public vt(a type, String str) {
        kotlin.jvm.internal.l.f(type, "type");
        this.f34660a = type;
        this.f34661b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt)) {
            return false;
        }
        vt vtVar = (vt) obj;
        return this.f34660a == vtVar.f34660a && kotlin.jvm.internal.l.b(this.f34661b, vtVar.f34661b);
    }

    public final int hashCode() {
        int iHashCode = this.f34660a.hashCode() * 31;
        String str = this.f34661b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.f34660a + ", text=" + this.f34661b + ")";
    }
}
