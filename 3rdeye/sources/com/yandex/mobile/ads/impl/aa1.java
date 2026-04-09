package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface aa1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24579b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24580c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f24581d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f24582e;

        static {
            a aVar = new a(0, "FIXED");
            f24579b = aVar;
            a aVar2 = new a(1, "FIXED_RATIO");
            f24580c = aVar2;
            a aVar3 = new a(2, "PREFERRED_RATIO");
            f24581d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f24582e = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24582e.clone();
        }
    }

    public interface b {
        a getType();
    }

    b getSizeConstraintType();

    float getValue();
}
