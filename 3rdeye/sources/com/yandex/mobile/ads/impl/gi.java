package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.u31;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class gi {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f27750a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27751b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27752c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27753d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27754e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27755f;

    private gi(ArrayList arrayList, int i, int i10, int i11, float f10, String str) {
        this.f27750a = arrayList;
        this.f27751b = i;
        this.f27752c = i10;
        this.f27753d = i11;
        this.f27754e = f10;
        this.f27755f = str;
    }

    public static gi a(uf1 uf1Var) throws yf1 {
        String str;
        int i;
        float f10;
        int i10;
        try {
            uf1Var.f(4);
            int iT = (uf1Var.t() & 3) + 1;
            if (iT == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT2 = uf1Var.t() & 31;
            for (int i11 = 0; i11 < iT2; i11++) {
                int iZ = uf1Var.z();
                int iD = uf1Var.d();
                uf1Var.f(iZ);
                arrayList.add(iq.a(uf1Var.c(), iD, iZ));
            }
            int iT3 = uf1Var.t();
            for (int i12 = 0; i12 < iT3; i12++) {
                int iZ2 = uf1Var.z();
                int iD2 = uf1Var.d();
                uf1Var.f(iZ2);
                arrayList.add(iq.a(uf1Var.c(), iD2, iZ2));
            }
            if (iT2 > 0) {
                u31.c cVarB = u31.b((byte[]) arrayList.get(0), iT, ((byte[]) arrayList.get(0)).length);
                int i13 = cVarB.f33916e;
                int i14 = cVarB.f33917f;
                float f11 = cVarB.f33918g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(cVarB.f33912a), Integer.valueOf(cVarB.f33913b), Integer.valueOf(cVarB.f33914c));
                i = i14;
                f10 = f11;
                i10 = i13;
            } else {
                str = null;
                i = -1;
                f10 = 1.0f;
                i10 = -1;
            }
            return new gi(arrayList, iT, i10, i, f10, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw yf1.a("Error parsing AVC config", e4);
        }
    }
}
