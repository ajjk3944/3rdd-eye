package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13706a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13707b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13708c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13709d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13710e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13711f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13712h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13713i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final float f13714k;

    /* renamed from: l, reason: collision with root package name */
    public final String f13715l;

    public m1(ArrayList arrayList, int i4, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f13706a = arrayList;
        this.f13707b = i4;
        this.f13708c = i10;
        this.f13709d = i11;
        this.f13710e = i12;
        this.f13711f = i13;
        this.g = i14;
        this.f13712h = i15;
        this.f13713i = i16;
        this.j = i17;
        this.f13714k = f10;
        this.f13715l = str;
    }

    public static m1 a(sk0 sk0Var) throws ua {
        String str;
        int i4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            sk0Var.G(4);
            int iK = (sk0Var.K() & 3) + 1;
            if (iK == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iK2 = sk0Var.K() & 31;
            for (int i17 = 0; i17 < iK2; i17++) {
                int iL = sk0Var.L();
                int i18 = sk0Var.f16447b;
                sk0Var.G(iL);
                byte[] bArr = sk0Var.f16446a;
                byte[] bArr2 = ba0.f9638a;
                byte[] bArr3 = new byte[iL + 4];
                System.arraycopy(ba0.f9638a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i18, bArr3, 4, iL);
                arrayList.add(bArr3);
            }
            int iK3 = sk0Var.K();
            for (int i19 = 0; i19 < iK3; i19++) {
                int iL2 = sk0Var.L();
                int i20 = sk0Var.f16447b;
                sk0Var.G(iL2);
                byte[] bArr4 = sk0Var.f16446a;
                byte[] bArr5 = ba0.f9638a;
                byte[] bArr6 = new byte[iL2 + 4];
                System.arraycopy(ba0.f9638a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i20, bArr6, 4, iL2);
                arrayList.add(bArr6);
            }
            if (iK2 > 0) {
                k11 k11VarC = ls.C(5, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i21 = k11VarC.f12976e;
                int i22 = k11VarC.f12977f;
                int i23 = k11VarC.f12978h + 8;
                int i24 = k11VarC.f12979i + 8;
                int i25 = k11VarC.j;
                int i26 = k11VarC.f12980k;
                int i27 = k11VarC.f12981l;
                int i28 = k11VarC.f12982m;
                float f11 = k11VarC.g;
                int i29 = k11VarC.f12972a;
                int i30 = k11VarC.f12973b;
                int i31 = k11VarC.f12974c;
                byte[] bArr7 = ba0.f9638a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i29), Integer.valueOf(i30), Integer.valueOf(i31));
                i14 = i28;
                f10 = f11;
                i15 = i26;
                i16 = i27;
                i12 = i24;
                i13 = i25;
                i10 = i22;
                i11 = i23;
                i4 = i21;
            } else {
                str = null;
                i4 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                f10 = 1.0f;
                i15 = -1;
                i16 = -1;
            }
            return new m1(arrayList, iK, i4, i10, i11, i12, i13, i15, i16, i14, f10, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ua.a(e2, "Error parsing AVC config");
        }
    }
}
