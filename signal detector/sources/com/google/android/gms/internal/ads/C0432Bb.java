package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Bb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0432Bb implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2189yi f7366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7367c;

    public /* synthetic */ C0432Bb(C2189yi c2189yi, String str, int i) {
        this.f7365a = i;
        this.f7366b = c2189yi;
        this.f7367c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        int i = this.f7365a;
        String str = this.f7367c;
        C2189yi c2189yi = this.f7366b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                C2128xb c2128xb = AbstractC0449Cb.f7599a;
                return (((Boolean) C2841s.f23267e.f23270c.a(H9.mb)).booleanValue() && c2189yi != null && C2189yi.b(str)) ? c2189yi.a(str2, q2.r.f23260g.f23265e) : AbstractC1984ut.e(str2);
            default:
                ((C0623Mf) c2189yi.f17745e).a(new RunnableC2135xi(c2189yi, (Throwable) obj, 1));
                return AbstractC1984ut.e(str);
        }
    }
}
