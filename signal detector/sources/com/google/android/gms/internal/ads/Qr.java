package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class Qr implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10718a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10719b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10720c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10721d;

    public Qr(C0538Hf c0538Hf, ScheduledExecutorService scheduledExecutorService, ID id) {
        this.f10718a = 5;
        this.f10719b = c0538Hf;
        this.f10721d = scheduledExecutorService;
        this.f10720c = id;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    @Override // com.google.android.gms.internal.ads.Ms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f4.InterfaceFutureC2326a a() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Qr.a():f4.a");
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        switch (this.f10718a) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 29;
            case 3:
                return 34;
            case 4:
                return 38;
            default:
                return 43;
        }
    }

    public /* synthetic */ Qr(Object obj, Object obj2, Object obj3, int i) {
        this.f10718a = i;
        this.f10719b = obj;
        this.f10720c = obj2;
        this.f10721d = obj3;
    }
}
