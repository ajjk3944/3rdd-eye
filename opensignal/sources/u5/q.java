package u5;

import androidx.media3.common.k0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final List f23312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23313b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23314c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23315d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23316e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23317f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23318g;

    public q(List list, int i10, float f10, String str, int i11, int i12, int i13) {
        this.f23312a = list;
        this.f23313b = i10;
        this.f23314c = f10;
        this.f23318g = str;
        this.f23315d = i11;
        this.f23316e = i12;
        this.f23317f = i13;
    }

    public static q a(a5.v vVar) throws k0 {
        boolean z10;
        int i10;
        try {
            vVar.F(21);
            int iT = vVar.t() & 3;
            int iT2 = vVar.t();
            int i11 = vVar.f166b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z10 = true;
                if (i13 >= iT2) {
                    break;
                }
                vVar.F(1);
                int iY = vVar.y();
                for (int i15 = 0; i15 < iY; i15++) {
                    int iY2 = vVar.y();
                    i14 += iY2 + 4;
                    vVar.F(iY2);
                }
                i13++;
            }
            vVar.E(i11);
            byte[] bArr = new byte[i14];
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f10 = 1.0f;
            String strC = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 < iT2) {
                int iT3 = vVar.t() & 63;
                int iY3 = vVar.y();
                int i21 = i12;
                while (i21 < iY3) {
                    int iY4 = vVar.y();
                    boolean z11 = z10;
                    int i22 = iT;
                    System.arraycopy(b.f23265t, i12, bArr, i20, 4);
                    int i23 = i20 + 4;
                    System.arraycopy(vVar.f165a, vVar.f166b, bArr, i23, iY4);
                    if (iT3 == 33 && i21 == 0) {
                        t tVarO = b.o(bArr, i23, i23 + iY4);
                        i16 = tVarO.j;
                        i10 = iT2;
                        i17 = tVarO.k;
                        i18 = tVarO.f23340l;
                        f10 = tVarO.f23339i;
                        strC = a5.a.c(tVarO.f23331a, tVarO.f23332b, tVarO.f23333c, tVarO.f23334d, tVarO.f23335e, tVarO.f23336f);
                    } else {
                        i10 = iT2;
                    }
                    i20 = i23 + iY4;
                    vVar.F(iY4);
                    i21++;
                    z10 = z11;
                    iT = i22;
                    iT2 = i10;
                    i12 = 0;
                }
                i19++;
                i12 = 0;
            }
            return new q(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iT + 1, f10, strC, i16, i17, i18);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw k0.a(e4, "Error parsing HEVC config");
        }
    }
}
