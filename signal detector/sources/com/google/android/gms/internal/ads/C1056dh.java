package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1056dh implements InterfaceC1864sh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2000v8 f13792b;

    public /* synthetic */ C1056dh(C2000v8 c2000v8, int i) {
        this.f13791a = i;
        this.f13792b = c2000v8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1864sh
    public final void l(String str, int i, String str2, boolean z6) {
        switch (this.f13791a) {
            case 0:
                this.f13792b.d();
                break;
            default:
                C2000v8 c2000v8 = this.f13792b;
                if (!z6) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Image Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    c2000v8.c(new C0736Sq(1, A.f.p(sb, ", Failing URL: ", str2)));
                    break;
                } else {
                    c2000v8.d();
                    break;
                }
        }
    }
}
