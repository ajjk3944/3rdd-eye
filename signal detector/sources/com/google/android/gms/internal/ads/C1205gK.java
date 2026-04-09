package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205gK implements XD {

    /* renamed from: a, reason: collision with root package name */
    public final XD f14259a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f14260b = Uri.EMPTY;

    public C1205gK(XD xd) {
        this.f14259a = xd;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) {
        XD xd = this.f14259a;
        this.f14260b = te.f11361a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jA = xd.a(te);
            Uri uriF = xd.f();
            if (uriF != null) {
                this.f14260b = uriF;
            }
            xd.h();
            return jA;
        } catch (Throwable th) {
            Uri uriF2 = xd.f();
            if (uriF2 != null) {
                this.f14260b = uriF2;
            }
            xd.h();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void c(InterfaceC1958uK interfaceC1958uK) {
        interfaceC1958uK.getClass();
        this.f14259a.c(interfaceC1958uK);
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) {
        return this.f14259a.d(i, i3, bArr);
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f14259a.f();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Map h() {
        return this.f14259a.h();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        this.f14259a.m();
    }
}
