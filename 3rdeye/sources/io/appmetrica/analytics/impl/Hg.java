package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Hg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39578a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f39579b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4739kb f39580c;

    /* renamed from: d, reason: collision with root package name */
    public final Wc f39581d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39582e;

    /* renamed from: f, reason: collision with root package name */
    public final String f39583f;

    /* renamed from: g, reason: collision with root package name */
    public final String f39584g;

    public Hg(Context context, SafePackageManager safePackageManager, InterfaceC4739kb interfaceC4739kb) {
        this.f39578a = context;
        this.f39579b = safePackageManager;
        this.f39580c = interfaceC4739kb;
        Wc wc = new Wc(0);
        wc.a(EnumC5077xg.f42079d, 1);
        wc.a(EnumC5077xg.f42078c, 2);
        this.f39581d = wc;
        this.f39582e = TimeUnit.DAYS.toSeconds(1L);
        this.f39583f = "com.android.vending";
        this.f39584g = "com.huawei.appmarket";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5102yg a(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Hg.a(java.util.List):io.appmetrica.analytics.impl.yg");
    }

    public /* synthetic */ Hg(Context context) {
        this(context, new SafePackageManager(), AbstractC4962t1.a());
    }

    public static final int a(Hg hg, C5102yg c5102yg, C5102yg c5102yg2) {
        int iSignum = Long.signum(c5102yg.f42144c - c5102yg2.f42144c);
        return iSignum == 0 ? ((Number) hg.f39581d.a(c5102yg.f42145d)).intValue() - ((Number) hg.f39581d.a(c5102yg2.f42145d)).intValue() : iSignum;
    }
}
