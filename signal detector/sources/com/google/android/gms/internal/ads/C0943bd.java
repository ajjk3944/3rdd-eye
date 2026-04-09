package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j2.C2545a;
import w2.InterfaceC2973e;

/* renamed from: com.google.android.gms.internal.ads.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943bd implements InterfaceC2973e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0688Qc f13393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0997cd f13394c;

    public /* synthetic */ C0943bd(BinderC0997cd binderC0997cd, InterfaceC0688Qc interfaceC0688Qc, int i) {
        this.f13392a = i;
        this.f13393b = interfaceC0688Qc;
        this.f13394c = binderC0997cd;
    }

    @Override // w2.InterfaceC2973e
    public final void k(C2545a c2545a) {
        switch (this.f13392a) {
            case 0:
                try {
                    String canonicalName = this.f13394c.f13576a.getClass().getCanonicalName();
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
                    InterfaceC0688Qc interfaceC0688Qc = this.f13393b;
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
                    String canonicalName2 = this.f13394c.f13576a.getClass().getCanonicalName();
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
                    InterfaceC0688Qc interfaceC0688Qc2 = this.f13393b;
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
                    String canonicalName3 = this.f13394c.f13576a.getClass().getCanonicalName();
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
                    InterfaceC0688Qc interfaceC0688Qc3 = this.f13393b;
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
    public final /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f13392a) {
            case 0:
                InterfaceC0688Qc interfaceC0688Qc = this.f13393b;
                try {
                    this.f13394c.f13581f = (i2.h) obj;
                    interfaceC0688Qc.h();
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                }
                return new C0824Yc(interfaceC0688Qc);
            case 1:
                throw new ClassCastException();
            default:
                InterfaceC0688Qc interfaceC0688Qc2 = this.f13393b;
                try {
                    this.f13394c.i = (i2.c) obj;
                    interfaceC0688Qc2.h();
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                }
                return new C0824Yc(interfaceC0688Qc2);
        }
    }
}
