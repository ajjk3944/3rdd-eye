package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public interface c82 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25568b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25569c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f25570d;

        static {
            a aVar = new a(0, "AD");
            f25568b = aVar;
            a aVar2 = new a(1, "PASSBACK");
            f25569c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f25570d = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25570d.clone();
        }
    }

    a a();

    String a(Context context, C4072a3 c4072a3, zw1 zw1Var);

    String a(C4072a3 c4072a3);
}
