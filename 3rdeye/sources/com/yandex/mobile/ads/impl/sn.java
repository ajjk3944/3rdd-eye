package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public abstract class sn implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private a f33140b = a.f33141b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f33141b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f33142c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f33143d;

        static {
            a aVar = new a(0, "ACTIVE");
            f33141b = aVar;
            a aVar2 = new a(1, "CANCELED");
            f33142c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f33143d = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f33143d.clone();
        }
    }

    public final void a() {
        this.f33140b = a.f33142c;
    }

    public final boolean b() {
        return this.f33140b == a.f33141b;
    }
}
