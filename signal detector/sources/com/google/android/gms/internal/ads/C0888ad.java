package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j2.C2545a;
import w2.InterfaceC2973e;

/* renamed from: com.google.android.gms.internal.ads.ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888ad implements InterfaceC2973e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0688Qc f13146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0997cd f13147c;

    public /* synthetic */ C0888ad(BinderC0997cd binderC0997cd, InterfaceC0688Qc interfaceC0688Qc, int i) {
        this.f13145a = i;
        this.f13146b = interfaceC0688Qc;
        this.f13147c = binderC0997cd;
    }

    @Override // w2.InterfaceC2973e
    public final void k(C2545a c2545a) {
        switch (this.f13145a) {
            case 0:
                try {
                    String canonicalName = this.f13147c.f13576a.getClass().getCanonicalName();
                    int i = c2545a.f21321b;
                    String str = (String) c2545a.f21322c;
                    String str2 = (String) c2545a.f21323d;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to loaded mediation ad: ErrorCode = ");
                    sb.append(i);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    u2.k.c(sb.toString());
                    InterfaceC0688Qc interfaceC0688Qc = this.f13146b;
                    interfaceC0688Qc.d3(c2545a.b());
                    interfaceC0688Qc.D3(i, str);
                    interfaceC0688Qc.o0(i);
                    break;
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                    return;
                }
            case 1:
                try {
                    String canonicalName2 = this.f13147c.f13576a.getClass().getCanonicalName();
                    int i3 = c2545a.f21321b;
                    String str3 = (String) c2545a.f21322c;
                    String str4 = (String) c2545a.f21323d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i3).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i3);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    u2.k.c(sb2.toString());
                    InterfaceC0688Qc interfaceC0688Qc2 = this.f13146b;
                    interfaceC0688Qc2.d3(c2545a.b());
                    interfaceC0688Qc2.D3(i3, str3);
                    interfaceC0688Qc2.o0(i3);
                    break;
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                    return;
                }
            default:
                try {
                    String canonicalName3 = this.f13147c.f13576a.getClass().getCanonicalName();
                    int i6 = c2545a.f21321b;
                    String str5 = (String) c2545a.f21322c;
                    String str6 = (String) c2545a.f21323d;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName3).length() + 41 + String.valueOf(i6).length() + 17 + String.valueOf(str5).length() + 16 + String.valueOf(str6).length());
                    sb3.append(canonicalName3);
                    sb3.append("failed to load mediation ad: ErrorCode = ");
                    sb3.append(i6);
                    sb3.append(". ErrorMessage = ");
                    sb3.append(str5);
                    sb3.append(". ErrorDomain = ");
                    sb3.append(str6);
                    u2.k.c(sb3.toString());
                    InterfaceC0688Qc interfaceC0688Qc3 = this.f13146b;
                    interfaceC0688Qc3.d3(c2545a.b());
                    interfaceC0688Qc3.D3(i6, str5);
                    interfaceC0688Qc3.o0(i6);
                    break;
                } catch (RemoteException e8) {
                    u2.k.f("", e8);
                }
        }
    }

    @Override // w2.InterfaceC2973e
    public final Object onSuccess(Object obj) {
        switch (this.f13145a) {
            case 0:
                InterfaceC0688Qc interfaceC0688Qc = this.f13146b;
                i2.f fVar = (i2.f) obj;
                try {
                    this.f13147c.f13580e = fVar.f20564e;
                    interfaceC0688Qc.h();
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                }
                return new C0824Yc(interfaceC0688Qc);
            case 1:
                InterfaceC0688Qc interfaceC0688Qc2 = this.f13146b;
                try {
                    this.f13147c.f13582g = (w2.w) obj;
                    interfaceC0688Qc2.h();
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                }
                return new C0824Yc(interfaceC0688Qc2);
            default:
                InterfaceC0688Qc interfaceC0688Qc3 = this.f13146b;
                try {
                    this.f13147c.f13583h = (i2.m) obj;
                    interfaceC0688Qc3.h();
                } catch (RemoteException e8) {
                    u2.k.f("", e8);
                }
                return new C0809Xe(interfaceC0688Qc3);
        }
    }
}
