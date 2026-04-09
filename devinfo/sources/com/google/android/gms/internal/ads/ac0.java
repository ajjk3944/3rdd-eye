package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ac0 extends mg implements jn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9299a;

    /* renamed from: b, reason: collision with root package name */
    public final ga0 f9300b;

    /* renamed from: c, reason: collision with root package name */
    public pa0 f9301c;

    /* renamed from: d, reason: collision with root package name */
    public ca0 f9302d;

    public ac0(Context context, ga0 ga0Var, pa0 pa0Var, ca0 ca0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f9299a = context;
        this.f9300b = ga0Var;
        this.f9301c = pa0Var;
        this.f9302d = ca0Var;
    }

    public final void A1() {
        ca0 ca0Var = this.f9302d;
        if (ca0Var != null) {
            synchronized (ca0Var) {
                if (ca0Var.f10035y) {
                    return;
                }
                ca0Var.f10024n.K();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final vb.a K2() {
        return new vb.b(this.f9299a);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final boolean V(vb.a aVar) throws SecurityException {
        pa0 pa0Var;
        Object objU0 = vb.b.U0(aVar);
        if (!(objU0 instanceof ViewGroup) || (pa0Var = this.f9301c) == null || !pa0Var.c((ViewGroup) objU0, false)) {
            return false;
        }
        this.f9300b.s().b0(new fk0(28, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) throws SecurityException {
        List<String> arrayList;
        String str;
        ca0 ca0Var;
        vm vmVarA = null;
        int i10 = 0;
        switch (i4) {
            case 1:
                String string = parcel.readString();
                ng.f(parcel);
                String str2 = (String) this.f9300b.z().get(string);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String string2 = parcel.readString();
                ng.f(parcel);
                xm xmVar = (xm) this.f9300b.x().get(string2);
                parcel2.writeNoException();
                ng.e(parcel2, xmVar);
                return true;
            case 3:
                try {
                    ga0 ga0Var = this.f9300b;
                    x.n0 n0VarX = ga0Var.x();
                    x.n0 n0VarZ = ga0Var.z();
                    String[] strArr = new String[n0VarX.f36920c + n0VarZ.f36920c];
                    int i11 = 0;
                    for (int i12 = 0; i12 < n0VarX.f36920c; i12++) {
                        strArr[i11] = (String) n0VarX.f(i12);
                        i11++;
                    }
                    while (i10 < n0VarZ.f36920c) {
                        strArr[i11] = (String) n0VarZ.f(i10);
                        i11++;
                        i10++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e2) {
                    ua.j.C.f35265h.f("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e2);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String strQ = this.f9300b.q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 5:
                String string3 = parcel.readString();
                ng.f(parcel);
                ca0 ca0Var2 = this.f9302d;
                if (ca0Var2 != null) {
                    ca0Var2.i(string3);
                }
                parcel2.writeNoException();
                return true;
            case 6:
                A1();
                parcel2.writeNoException();
                return true;
            case 7:
                va.a2 a2VarX = this.f9300b.X();
                parcel2.writeNoException();
                ng.e(parcel2, a2VarX);
                return true;
            case 8:
                ca0 ca0Var3 = this.f9302d;
                if (ca0Var3 != null) {
                    ca0Var3.s();
                }
                this.f9302d = null;
                this.f9301c = null;
                parcel2.writeNoException();
                return true;
            case 9:
                vb.a aVarK2 = K2();
                parcel2.writeNoException();
                ng.e(parcel2, aVarK2);
                return true;
            case 10:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                boolean zV = v(aVarR0);
                parcel2.writeNoException();
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                ca0 ca0Var4 = this.f9302d;
                if (ca0Var4 == null || ca0Var4.f10026p.c()) {
                    ga0 ga0Var2 = this.f9300b;
                    if (ga0Var2.t() != null && ga0Var2.r() == null) {
                        i10 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = ng.f14287a;
                parcel2.writeInt(i10);
                return true;
            case 13:
                ga0 ga0Var3 = this.f9300b;
                xh0 xh0VarW = ga0Var3.w();
                if (xh0VarW != null) {
                    h80 h80Var = ua.j.C.f35280x;
                    vt0 vt0Var = xh0VarW.f18390a;
                    h80Var.getClass();
                    h80.j(vt0Var);
                    if (ga0Var3.t() != null) {
                        ga0Var3.t().a("onSdkLoaded", new x.e(0));
                    }
                    i10 = 1;
                } else {
                    za.i.h("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = ng.f14287a;
                parcel2.writeInt(i10);
                return true;
            case 14:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                Object objU0 = vb.b.U0(aVarR02);
                if ((objU0 instanceof View) && this.f9300b.w() != null && (ca0Var = this.f9302d) != null) {
                    ca0Var.h((View) objU0);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    ga0 ga0Var4 = this.f9300b;
                    synchronized (ga0Var4) {
                        str = ga0Var4.f11435y;
                    }
                    if (Objects.equals(str, "Google")) {
                        za.i.h("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        za.i.h("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        ca0 ca0Var5 = this.f9302d;
                        if (ca0Var5 != null) {
                            ca0Var5.g(str, false);
                        }
                    }
                } catch (NullPointerException e10) {
                    ua.j.C.f35265h.f("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e10);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    vmVarA = this.f9302d.F.a();
                } catch (NullPointerException e11) {
                    ua.j.C.f35265h.f("InternalNativeCustomTemplateAdShim.getMediaContent", e11);
                }
                parcel2.writeNoException();
                ng.e(parcel2, vmVarA);
                return true;
            case 17:
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                boolean zV2 = V(aVarR03);
                parcel2.writeNoException();
                parcel2.writeInt(zV2 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final boolean v(vb.a aVar) throws SecurityException {
        pa0 pa0Var;
        Object objU0 = vb.b.U0(aVar);
        if (!(objU0 instanceof ViewGroup) || (pa0Var = this.f9301c) == null || !pa0Var.c((ViewGroup) objU0, true)) {
            return false;
        }
        this.f9300b.r().b0(new fk0(28, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final String z1() {
        return this.f9300b.q();
    }
}
