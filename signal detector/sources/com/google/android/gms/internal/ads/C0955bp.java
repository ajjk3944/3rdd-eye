package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.bp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0955bp implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1807re f13473b;

    public /* synthetic */ C0955bp(C1807re c1807re, int i) {
        this.f13472a = i;
        this.f13473b = c1807re;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final /* synthetic */ InterfaceFutureC2326a b(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f13472a) {
            case 0:
                return AbstractC1984ut.e(new C1818rp(inputStream, this.f13473b));
            case 1:
                return AbstractC1984ut.e(new C1818rp(inputStream, this.f13473b));
            default:
                String str = new String(BC.a(inputStream), StandardCharsets.UTF_8);
                C1807re c1807re = this.f13473b;
                c1807re.f16584j = str;
                return AbstractC1984ut.e(c1807re);
        }
    }
}
