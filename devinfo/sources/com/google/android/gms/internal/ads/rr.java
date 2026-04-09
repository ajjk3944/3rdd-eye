package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rr implements bb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fr f15740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sr f15741c;

    public /* synthetic */ rr(sr srVar, fr frVar, int i4) {
        this.f15739a = i4;
        this.f15740b = frVar;
        this.f15741c = srVar;
    }

    @Override // bb.e
    public final void i(pa.a aVar) {
        switch (this.f15739a) {
            case 0:
                try {
                    String canonicalName = this.f15741c.f16516a.getClass().getCanonicalName();
                    int i4 = aVar.f31511a;
                    int i10 = aVar.f31511a;
                    String str = aVar.f31512b;
                    String str2 = aVar.f31513c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i4).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb2.append(canonicalName);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i4);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str2);
                    za.i.c(sb2.toString());
                    fr frVar = this.f15740b;
                    frVar.I3(aVar.a());
                    frVar.a4(i10, str);
                    frVar.P1(i10);
                    break;
                } catch (RemoteException e2) {
                    za.i.f("", e2);
                    return;
                }
            default:
                try {
                    String canonicalName2 = this.f15741c.f16516a.getClass().getCanonicalName();
                    int i11 = aVar.f31511a;
                    int i12 = aVar.f31511a;
                    String str3 = aVar.f31512b;
                    String str4 = aVar.f31513c;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i11).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb3.append(canonicalName2);
                    sb3.append("failed to load mediation ad: ErrorCode = ");
                    sb3.append(i11);
                    sb3.append(". ErrorMessage = ");
                    sb3.append(str3);
                    sb3.append(". ErrorDomain = ");
                    sb3.append(str4);
                    za.i.c(sb3.toString());
                    fr frVar2 = this.f15740b;
                    frVar2.I3(aVar.a());
                    frVar2.a4(i12, str3);
                    frVar2.P1(i12);
                    break;
                } catch (RemoteException e10) {
                    za.i.f("", e10);
                }
        }
    }

    @Override // bb.e
    public final /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f15739a) {
            case 0:
                fr frVar = this.f15740b;
                try {
                    this.f15741c.g = (bb.a0) obj;
                    frVar.A1();
                } catch (RemoteException e2) {
                    za.i.f("", e2);
                }
                return new nr(frVar);
            default:
                fr frVar2 = this.f15740b;
                try {
                    this.f15741c.f16523i = (bb.h) obj;
                    frVar2.A1();
                } catch (RemoteException e10) {
                    za.i.f("", e10);
                }
                return new nr(frVar2);
        }
    }
}
