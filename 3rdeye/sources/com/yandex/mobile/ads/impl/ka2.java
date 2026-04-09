package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class ka2 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private final ja2 f29573b;

    /* renamed from: c, reason: collision with root package name */
    private final a f29574c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f29575c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f29576d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f29577e;

        /* renamed from: b, reason: collision with root package name */
        private final int f29578b;

        static {
            a aVar = new a(0, 1, "VERIFICATION_REJECTED");
            a aVar2 = new a(1, 2, "VERIFICATION_NOT_SUPPORTED");
            f29575c = aVar2;
            a aVar3 = new a(2, 3, "ERROR_RESOURCE_LOAD");
            f29576d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f29577e = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, int i10, String str) {
            this.f29578b = i10;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f29577e.clone();
        }

        public final int a() {
            return this.f29578b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ka2(ja2 verification, a reason) {
        kotlin.jvm.internal.l.f(verification, "verification");
        kotlin.jvm.internal.l.f(reason, "reason");
        String strName = reason.name();
        Locale US = Locale.US;
        kotlin.jvm.internal.l.e(US, "US");
        String lowerCase = strName.toLowerCase(US);
        kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        super("Verification not executed with reason = ".concat(lowerCase));
        this.f29573b = verification;
        this.f29574c = reason;
    }

    public final a a() {
        return this.f29574c;
    }

    public final ja2 b() {
        return this.f29573b;
    }
}
