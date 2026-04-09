package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163ff implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14106a;

    /* renamed from: b, reason: collision with root package name */
    public final C1907tN f14107b;

    /* renamed from: c, reason: collision with root package name */
    public final C1907tN f14108c;

    public /* synthetic */ C1163ff(C1907tN c1907tN, C1907tN c1907tN2, int i) {
        this.f14106a = i;
        this.f14107b = c1907tN;
        this.f14108c = c1907tN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f14106a) {
            case 0:
                return new SharedPreferencesOnSharedPreferenceChangeListenerC1108ef((Context) this.f14107b.f16902a, (C2909E) this.f14108c.f16902a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.f14107b.f16902a;
                Xx xx = (Xx) this.f14108c.f16902a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                A.f.w(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb.append(")");
                return new C1612ny(executorService, sb.toString(), xx.P());
            case 2:
                return new C1517mA((Context) this.f14107b.f16902a, (ExecutorService) this.f14108c.f16902a);
            default:
                return new C1679pA((Context) this.f14107b.f16902a, (ExecutorService) this.f14108c.f16902a);
        }
    }
}
