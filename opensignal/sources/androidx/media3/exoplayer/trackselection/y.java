package androidx.media3.exoplayer.trackselection;

import a5.d0;
import android.util.Pair;
import androidx.media3.common.a1;
import androidx.media3.common.b1;
import androidx.media3.common.f1;
import androidx.media3.common.g1;
import d5.v0;
import d5.w0;
import java.util.Arrays;
import java.util.List;
import o5.h1;
import oe.e0;
import oe.f0;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public abstract class y extends b0 {
    private x currentMappedTrackInfo;

    public final x getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // androidx.media3.exoplayer.trackselection.b0
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (x) obj;
    }

    public abstract Pair selectTracks(x xVar, int[][][] iArr, int[] iArr2, o5.z zVar, a1 a1Var);

    @Override // androidx.media3.exoplayer.trackselection.b0
    public final c0 selectTracks(v0[] v0VarArr, h1 h1Var, o5.z zVar, a1 a1Var) throws d5.f {
        int[][][] iArr;
        h1[] h1VarArr;
        boolean z10;
        u0 u0VarP;
        int[] iArr2;
        h1 h1Var2 = h1Var;
        boolean z11 = true;
        int[] iArr3 = new int[v0VarArr.length + 1];
        int length = v0VarArr.length + 1;
        b1[][] b1VarArr = new b1[length][];
        int[][][] iArr4 = new int[v0VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = h1Var2.f18958a;
            b1VarArr[i10] = new b1[i11];
            iArr4[i10] = new int[i11][];
        }
        int length2 = v0VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            iArr5[i12] = v0VarArr[i12].d();
        }
        int i13 = 0;
        while (i13 < h1Var2.f18958a) {
            b1 b1VarA = h1Var2.a(i13);
            int i14 = b1VarA.f1574g;
            androidx.media3.common.r[] rVarArr = b1VarA.f1575r;
            int i15 = b1VarA.f1572a;
            boolean z12 = i14 == 5 ? z11 : false;
            int length3 = v0VarArr.length;
            boolean z13 = z11;
            int i16 = 0;
            int i17 = 0;
            while (i16 < v0VarArr.length) {
                v0 v0Var = v0VarArr[i16];
                int iMax = 0;
                int i18 = 0;
                while (i18 < i15) {
                    iMax = Math.max(iMax, v0Var.j(rVarArr[i18]) & 7);
                    i18++;
                    iArr3 = iArr3;
                }
                int[] iArr6 = iArr3;
                boolean z14 = iArr6[i16] == 0 ? z13 : false;
                if (iMax > i17 || (iMax == i17 && z12 && !z13 && z14)) {
                    i17 = iMax;
                    z13 = z14;
                    length3 = i16;
                }
                i16++;
                iArr3 = iArr6;
            }
            int[] iArr7 = iArr3;
            if (length3 == v0VarArr.length) {
                iArr2 = new int[i15];
            } else {
                v0 v0Var2 = v0VarArr[length3];
                int[] iArr8 = new int[i15];
                for (int i19 = 0; i19 < i15; i19++) {
                    iArr8[i19] = v0Var2.j(rVarArr[i19]);
                }
                iArr2 = iArr8;
            }
            int i20 = iArr7[length3];
            b1VarArr[length3][i20] = b1VarA;
            iArr4[length3][i20] = iArr2;
            iArr7[length3] = i20 + 1;
            i13++;
            h1Var2 = h1Var;
            z11 = z13;
            iArr3 = iArr7;
        }
        int[] iArr9 = iArr3;
        boolean z15 = z11;
        h1[] h1VarArr2 = new h1[v0VarArr.length];
        String[] strArr = new String[v0VarArr.length];
        int[] iArr10 = new int[v0VarArr.length];
        for (int i21 = 0; i21 < v0VarArr.length; i21++) {
            int i22 = iArr9[i21];
            h1VarArr2[i21] = new h1((b1[]) d0.I(i22, b1VarArr[i21]));
            iArr4[i21] = (int[][]) d0.I(i22, iArr4[i21]);
            strArr[i21] = v0VarArr[i21].getName();
            iArr10[i21] = ((d5.b) v0VarArr[i21]).f6925a;
        }
        x xVar = new x(iArr10, h1VarArr2, iArr5, iArr4, new h1((b1[]) d0.I(iArr9[v0VarArr.length], b1VarArr[v0VarArr.length])));
        Pair pairSelectTracks = selectTracks(xVar, iArr4, iArr5, zVar, a1Var);
        TrackSelection[] trackSelectionArr = (TrackSelection[]) pairSelectTracks.second;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i23 = 0; i23 < trackSelectionArr.length; i23++) {
            TrackSelection trackSelection = trackSelectionArr[i23];
            if (trackSelection != null) {
                u0VarP = h0.p(trackSelection);
            } else {
                f0 f0Var = h0.f19336d;
                u0VarP = u0.f19383x;
            }
            listArr[i23] = u0VarP;
        }
        e0 e0Var = new e0();
        int i24 = 0;
        while (i24 < xVar.f1929a) {
            h1[] h1VarArr3 = xVar.f1931c;
            h1 h1Var3 = h1VarArr3[i24];
            List list = listArr[i24];
            int i25 = 0;
            while (i25 < h1Var3.f18958a) {
                b1 b1VarA2 = h1Var3.a(i25);
                int i26 = b1VarA2.f1572a;
                int i27 = h1VarArr3[i24].a(i25).f1572a;
                int[] iArr11 = new int[i27];
                int i28 = 0;
                int i29 = 0;
                while (true) {
                    iArr = xVar.f1933e;
                    if (i28 >= i27) {
                        break;
                    }
                    List[] listArr2 = listArr;
                    if ((iArr[i24][i25][i28] & 7) == 4) {
                        iArr11[i29] = i28;
                        i29++;
                    }
                    i28++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr11, i29);
                int iMin = 16;
                String str = null;
                int i30 = i24;
                int i31 = 0;
                boolean z16 = false;
                int i32 = 0;
                while (i31 < iArrCopyOf.length) {
                    int[] iArr12 = iArrCopyOf;
                    String str2 = h1VarArr3[i30].a(i25).f1575r[iArrCopyOf[i31]].H;
                    int i33 = i32 + 1;
                    if (i32 == 0) {
                        str = str2;
                    } else {
                        z16 |= !d0.a(str, str2);
                    }
                    iMin = Math.min(iMin, iArr[i30][i25][i31] & 24);
                    i31++;
                    iArrCopyOf = iArr12;
                    i32 = i33;
                }
                if (z16) {
                    iMin = Math.min(iMin, xVar.f1932d[i30]);
                }
                boolean z17 = iMin != 0 ? z15 : false;
                int[] iArr13 = new int[i26];
                boolean[] zArr = new boolean[i26];
                int i34 = 0;
                while (i34 < i26) {
                    iArr13[i34] = iArr[i30][i25][i34] & 7;
                    int i35 = 0;
                    while (true) {
                        if (i35 >= list.size()) {
                            h1VarArr = h1VarArr3;
                            z10 = false;
                            break;
                        }
                        TrackSelection trackSelection2 = (TrackSelection) list.get(i35);
                        h1VarArr = h1VarArr3;
                        if (trackSelection2.getTrackGroup().equals(b1VarA2) && trackSelection2.indexOf(i34) != -1) {
                            z10 = z15;
                            break;
                        }
                        i35++;
                        h1VarArr3 = h1VarArr;
                    }
                    zArr[i34] = z10;
                    i34++;
                    h1VarArr3 = h1VarArr;
                }
                e0Var.a(new f1(b1VarA2, z17, iArr13, zArr));
                i25++;
                i24 = i30;
                listArr = listArr3;
                h1VarArr3 = h1VarArr3;
            }
            i24++;
        }
        int i36 = 0;
        while (true) {
            h1 h1Var4 = xVar.f1934f;
            if (i36 >= h1Var4.f18958a) {
                return new c0((w0[]) pairSelectTracks.first, (v[]) pairSelectTracks.second, new g1(e0Var.d()), xVar);
            }
            b1 b1VarA3 = h1Var4.a(i36);
            int i37 = b1VarA3.f1572a;
            int[] iArr14 = new int[i37];
            Arrays.fill(iArr14, 0);
            e0Var.a(new f1(b1VarA3, false, iArr14, new boolean[i37]));
            i36++;
        }
    }
}
