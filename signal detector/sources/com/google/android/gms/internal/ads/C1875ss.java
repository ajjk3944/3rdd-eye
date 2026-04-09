package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1875ss implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16811a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f16812b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f16813c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16814d;

    public C1875ss(String str, Bundle bundle, String str2) {
        this.f16812b = str;
        this.f16813c = bundle;
        this.f16814d = str2;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        switch (this.f16811a) {
            case 0:
                Bundle bundle = ((C0797Wj) obj).f12308a;
                bundle.putString("consent_string", this.f16812b);
                bundle.putString("fc_consent", this.f16814d);
                Bundle bundle2 = this.f16813c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                    break;
                }
                break;
            default:
                Bundle bundle3 = ((C0797Wj) obj).f12308a;
                bundle3.putString("rtb", this.f16812b);
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8675T4)).booleanValue()) {
                    String str = this.f16814d;
                    if (!str.isEmpty()) {
                        bundle3.putString("cld_status", str);
                    }
                }
                Bundle bundle4 = this.f16813c;
                if (!bundle4.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle4);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        int i = this.f16811a;
    }

    public /* synthetic */ C1875ss(String str, String str2, Bundle bundle) {
        this.f16812b = str;
        this.f16814d = str2;
        this.f16813c = bundle;
    }
}
