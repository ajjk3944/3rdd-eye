package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14849c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14850d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14851e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14852f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14853g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14854h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14855j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14856k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14857l;

    public C1345j0(ArrayList arrayList, int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f2, String str) {
        this.f14847a = arrayList;
        this.f14848b = i;
        this.f14849c = i3;
        this.f14850d = i6;
        this.f14851e = i7;
        this.f14852f = i8;
        this.f14853g = i9;
        this.f14854h = i10;
        this.i = i11;
        this.f14855j = i12;
        this.f14856k = f2;
        this.f14857l = str;
    }

    public static C1345j0 a(C2036vr c2036vr) throws P4 {
        String str;
        int i;
        int i3;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        int i11;
        try {
            c2036vr.G(4);
            int iK = (c2036vr.K() & 3) + 1;
            if (iK == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iK2 = c2036vr.K() & 31;
            for (int i12 = 0; i12 < iK2; i12++) {
                int iL = c2036vr.L();
                int i13 = c2036vr.f17355b;
                c2036vr.G(iL);
                byte[] bArr = c2036vr.f17354a;
                byte[] bArr2 = AbstractC1224gm.f14369a;
                byte[] bArr3 = new byte[iL + 4];
                System.arraycopy(AbstractC1224gm.f14369a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i13, bArr3, 4, iL);
                arrayList.add(bArr3);
            }
            int iK3 = c2036vr.K();
            for (int i14 = 0; i14 < iK3; i14++) {
                int iL2 = c2036vr.L();
                int i15 = c2036vr.f17355b;
                c2036vr.G(iL2);
                byte[] bArr4 = c2036vr.f17354a;
                byte[] bArr5 = AbstractC1224gm.f14369a;
                byte[] bArr6 = new byte[iL2 + 4];
                System.arraycopy(AbstractC1224gm.f14369a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i15, bArr6, 4, iL2);
                arrayList.add(bArr6);
            }
            if (iK2 > 0) {
                Xz xzD = AbstractC2022vd.D(5, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i16 = xzD.f12532e;
                int i17 = xzD.f12533f;
                int i18 = xzD.f12535h + 8;
                int i19 = xzD.i + 8;
                int i20 = xzD.f12536j;
                int i21 = xzD.f12537k;
                int i22 = xzD.f12538l;
                int i23 = xzD.f12539m;
                float f5 = xzD.f12534g;
                int i24 = xzD.f12528a;
                int i25 = xzD.f12529b;
                int i26 = xzD.f12530c;
                byte[] bArr7 = AbstractC1224gm.f14369a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i24), Integer.valueOf(i25), Integer.valueOf(i26));
                i9 = i23;
                f2 = f5;
                i10 = i21;
                i11 = i22;
                i7 = i19;
                i8 = i20;
                i3 = i17;
                i6 = i18;
                i = i16;
            } else {
                str = null;
                i = -1;
                i3 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = 16;
                f2 = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new C1345j0(arrayList, iK, i, i3, i6, i7, i8, i10, i11, i9, f2, str);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw P4.a(e6, "Error parsing AVC config");
        }
    }
}
