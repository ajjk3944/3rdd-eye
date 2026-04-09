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
import u.C2936e;
import u.C2940i;

/* renamed from: com.google.android.gms.internal.ads.fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1171fn extends B7 implements InterfaceC0839Za {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14138a;

    /* renamed from: b, reason: collision with root package name */
    public final C1492lm f14139b;

    /* renamed from: c, reason: collision with root package name */
    public C1977um f14140c;

    /* renamed from: d, reason: collision with root package name */
    public C1278hm f14141d;

    public BinderC1171fn(Context context, C1492lm c1492lm, C1977um c1977um, C1278hm c1278hm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f14138a = context;
        this.f14139b = c1492lm;
        this.f14140c = c1977um;
        this.f14141d = c1278hm;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) throws SecurityException {
        List<String> arrayList;
        String str;
        C1278hm c1278hm;
        C1977um c1977um;
        InterfaceC0601La interfaceC0601LaA = null;
        int i3 = 0;
        switch (i) {
            case 1:
                String string = parcel.readString();
                C7.f(parcel);
                String str2 = (String) this.f14139b.z().get(string);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String string2 = parcel.readString();
                C7.f(parcel);
                InterfaceC0635Na interfaceC0635Na = (InterfaceC0635Na) this.f14139b.x().get(string2);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0635Na);
                return true;
            case 3:
                try {
                    C1492lm c1492lm = this.f14139b;
                    C2940i c2940iX = c1492lm.x();
                    C2940i c2940iZ = c1492lm.z();
                    String[] strArr = new String[c2940iX.f23705c + c2940iZ.f23705c];
                    int i6 = 0;
                    for (int i7 = 0; i7 < c2940iX.f23705c; i7++) {
                        strArr[i6] = (String) c2940iX.f(i7);
                        i6++;
                    }
                    while (i3 < c2940iZ.f23705c) {
                        strArr[i6] = (String) c2940iZ.f(i3);
                        i6++;
                        i3++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e6) {
                    p2.j.f22785C.f22795h.f("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e6);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String strQ = this.f14139b.q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 5:
                String string3 = parcel.readString();
                C7.f(parcel);
                C1278hm c1278hm2 = this.f14141d;
                if (c1278hm2 != null) {
                    c1278hm2.i(string3);
                }
                parcel2.writeNoException();
                return true;
            case 6:
                h();
                parcel2.writeNoException();
                return true;
            case 7:
                q2.B0 b0X = this.f14139b.X();
                parcel2.writeNoException();
                C7.e(parcel2, b0X);
                return true;
            case 8:
                C1278hm c1278hm3 = this.f14141d;
                if (c1278hm3 != null) {
                    c1278hm3.t();
                }
                this.f14141d = null;
                this.f14140c = null;
                parcel2.writeNoException();
                return true;
            case 9:
                S2.a aVarO2 = o2();
                parcel2.writeNoException();
                C7.e(parcel2, aVarO2);
                return true;
            case 10:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                boolean zL = L(aVarD1);
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                C1278hm c1278hm4 = this.f14141d;
                if (c1278hm4 == null || c1278hm4.f14570p.c()) {
                    C1492lm c1492lm2 = this.f14139b;
                    if (c1492lm2.t() != null && c1492lm2.r() == null) {
                        i3 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = C7.f7544a;
                parcel2.writeInt(i3);
                return true;
            case 13:
                C1492lm c1492lm3 = this.f14139b;
                C0837Yp c0837YpW = c1492lm3.w();
                if (c0837YpW != null) {
                    C1437kl c1437kl = p2.j.f22785C.f22810x;
                    Rv rv = c0837YpW.f12708a;
                    c1437kl.getClass();
                    C1437kl.j(rv);
                    if (c1492lm3.t() != null) {
                        c1492lm3.t().a("onSdkLoaded", new C2936e(0));
                    }
                    i3 = 1;
                } else {
                    u2.k.h("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = C7.f7544a;
                parcel2.writeInt(i3);
                return true;
            case 14:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                Object objN1 = S2.b.n1(aVarD12);
                if ((objN1 instanceof View) && this.f14139b.w() != null && (c1278hm = this.f14141d) != null) {
                    c1278hm.h((View) objN1);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    C1492lm c1492lm4 = this.f14139b;
                    synchronized (c1492lm4) {
                        str = c1492lm4.f15458y;
                    }
                    if (Objects.equals(str, "Google")) {
                        u2.k.h("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        u2.k.h("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        C1278hm c1278hm5 = this.f14141d;
                        if (c1278hm5 != null) {
                            c1278hm5.g(str, false);
                        }
                    }
                } catch (NullPointerException e7) {
                    p2.j.f22785C.f22795h.f("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e7);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    interfaceC0601LaA = this.f14141d.f14562F.a();
                } catch (NullPointerException e8) {
                    p2.j.f22785C.f22795h.f("InternalNativeCustomTemplateAdShim.getMediaContent", e8);
                }
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0601LaA);
                return true;
            case 17:
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                Object objN12 = S2.b.n1(aVarD13);
                if ((objN12 instanceof ViewGroup) && (c1977um = this.f14140c) != null && c1977um.c((ViewGroup) objN12, false)) {
                    this.f14139b.s().m0(new L6(20, this));
                    i3 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0839Za
    public final boolean L(S2.a aVar) throws SecurityException {
        C1977um c1977um;
        Object objN1 = S2.b.n1(aVar);
        if (!(objN1 instanceof ViewGroup) || (c1977um = this.f14140c) == null || !c1977um.c((ViewGroup) objN1, true)) {
            return false;
        }
        this.f14139b.r().m0(new L6(20, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0839Za
    public final String g() {
        return this.f14139b.q();
    }

    public final void h() {
        C1278hm c1278hm = this.f14141d;
        if (c1278hm != null) {
            synchronized (c1278hm) {
                if (c1278hm.f14579y) {
                    return;
                }
                c1278hm.f14568n.Z();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0839Za
    public final S2.a o2() {
        return new S2.b(this.f14138a);
    }
}
