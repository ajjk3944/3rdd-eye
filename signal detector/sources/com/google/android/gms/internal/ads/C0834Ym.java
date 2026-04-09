package com.google.android.gms.internal.ads;

import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0834Ym implements InterfaceC1864sh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0851Zm f12700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0828Yg f12701c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2000v8 f12702d;

    public /* synthetic */ C0834Ym(C0851Zm c0851Zm, InterfaceC0828Yg interfaceC0828Yg, C2000v8 c2000v8, int i) {
        this.f12699a = i;
        this.f12700b = c0851Zm;
        this.f12701c = interfaceC0828Yg;
        this.f12702d = c2000v8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1864sh
    public final void l(String str, int i, String str2, boolean z6) {
        switch (this.f12699a) {
            case 0:
                C0851Zm c0851Zm = this.f12700b;
                C2000v8 c2000v8 = this.f12702d;
                if (!z6) {
                    c0851Zm.getClass();
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Html video Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    c2000v8.c(new C0736Sq(1, A.f.p(sb, ", Failing URL: ", str2)));
                    break;
                } else {
                    q2.Y0 y02 = c0851Zm.f12949a.f13479a;
                    if (y02 != null) {
                        InterfaceC0828Yg interfaceC0828Yg = this.f12701c;
                        if (interfaceC0828Yg.g() != null) {
                            interfaceC0828Yg.g().L3(y02);
                        }
                    }
                    c2000v8.d();
                    break;
                }
            default:
                C0851Zm c0851Zm2 = this.f12700b;
                c0851Zm2.getClass();
                C0960bu c0960bu = c0851Zm2.f12949a;
                boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8587E4)).booleanValue();
                InterfaceC0828Yg interfaceC0828Yg2 = this.f12701c;
                C2000v8 c2000v82 = this.f12702d;
                if (!zBooleanValue) {
                    q2.Y0 y03 = c0960bu.f13479a;
                    if (y03 != null && interfaceC0828Yg2.g() != null) {
                        interfaceC0828Yg2.g().L3(y03);
                    }
                    c2000v82.d();
                    break;
                } else if (!z6) {
                    int length2 = String.valueOf(i).length();
                    StringBuilder sb2 = new StringBuilder(length2 + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Native Video WebView failed to load. Error code: ");
                    sb2.append(i);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    c2000v82.c(new C0736Sq(1, A.f.p(sb2, ", Failing URL: ", str2)));
                    break;
                } else {
                    q2.Y0 y04 = c0960bu.f13479a;
                    if (y04 != null && interfaceC0828Yg2.g() != null) {
                        interfaceC0828Yg2.g().L3(y04);
                    }
                    c2000v82.d();
                    break;
                }
                break;
        }
    }
}
