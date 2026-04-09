package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ve1 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public ve1(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static ve1 a(kz2 kz2Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            kz2Var.G(4);
            int iK = (kz2Var.K() & 3) + 1;
            if (iK == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iK2 = kz2Var.K() & 31;
            for (int i9 = 0; i9 < iK2; i9++) {
                int iL = kz2Var.L();
                int i10 = kz2Var.b;
                kz2Var.G(iL);
                byte[] bArr = kz2Var.a;
                byte[] bArr2 = mo2.a;
                byte[] bArr3 = new byte[iL + 4];
                System.arraycopy(mo2.a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i10, bArr3, 4, iL);
                arrayList.add(bArr3);
            }
            int iK3 = kz2Var.K();
            for (int i11 = 0; i11 < iK3; i11++) {
                int iL2 = kz2Var.L();
                int i12 = kz2Var.b;
                kz2Var.G(iL2);
                byte[] bArr4 = kz2Var.a;
                byte[] bArr5 = mo2.a;
                byte[] bArr6 = new byte[iL2 + 4];
                System.arraycopy(mo2.a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i12, bArr6, 4, iL2);
                arrayList.add(bArr6);
            }
            if (iK2 > 0) {
                x93 x93VarO = wl2.O((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i13 = x93VarO.e;
                int i14 = x93VarO.f;
                int i15 = x93VarO.h + 8;
                int i16 = x93VarO.i + 8;
                int i17 = x93VarO.j;
                int i18 = x93VarO.k;
                int i19 = x93VarO.l;
                int i20 = x93VarO.m;
                float f2 = x93VarO.g;
                int i21 = x93VarO.a;
                int i22 = x93VarO.b;
                int i23 = x93VarO.c;
                byte[] bArr7 = mo2.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new ve1(arrayList, iK, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw lq1.a(e, "Error parsing AVC config");
        }
    }
}
