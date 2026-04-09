package ob;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.l1;
import com.google.android.exoplayer2.m1;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.w1;
import ya.v;

/* loaded from: classes.dex */
public abstract class i extends m {
    private h currentMappedTrackInfo;

    public final h getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // ob.m
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (h) obj;
    }

    public abstract Pair selectTracks(h hVar, int[][][] iArr, int[] iArr2, v vVar, w1 w1Var);

    @Override // ob.m
    public final n selectTracks(l1[] l1VarArr, TrackGroupArray trackGroupArray, v vVar, w1 w1Var) throws com.google.android.exoplayer2.n {
        int[] iArr;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int i10 = 1;
        int[] iArr2 = new int[l1VarArr.length + 1];
        int length = l1VarArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr3 = new int[l1VarArr.length + 1][][];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = trackGroupArray2.f4457a;
            trackGroupArr[i12] = new TrackGroup[i13];
            iArr3[i12] = new int[i13][];
        }
        int length2 = l1VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            iArr4[i14] = l1VarArr[i14].d();
        }
        int i15 = 0;
        while (i15 < trackGroupArray2.f4457a) {
            TrackGroup trackGroup = trackGroupArray2.f4458d[i15];
            Format[] formatArr = trackGroup.f4454d;
            int i16 = trackGroup.f4453a;
            int i17 = qb.m.g(formatArr[i11].H) == 5 ? i10 : i11;
            int length3 = l1VarArr.length;
            int i18 = i10;
            int i19 = i11;
            int i20 = i19;
            while (i19 < l1VarArr.length) {
                l1 l1Var = l1VarArr[i19];
                int iMax = i11;
                while (i11 < i16) {
                    iMax = Math.max(iMax, l1Var.f(formatArr[i11]) & 7);
                    i11++;
                    iArr2 = iArr2;
                }
                int[] iArr5 = iArr2;
                int i21 = iArr5[i19] == 0 ? i18 : 0;
                if (iMax > i20 || (iMax == i20 && i17 != 0 && i18 == 0 && i21 != 0)) {
                    i20 = iMax;
                    i18 = i21;
                    length3 = i19;
                }
                i19++;
                iArr2 = iArr5;
                i11 = 0;
            }
            int[] iArr6 = iArr2;
            if (length3 == l1VarArr.length) {
                iArr = new int[i16];
            } else {
                l1 l1Var2 = l1VarArr[length3];
                int[] iArr7 = new int[i16];
                for (int i22 = 0; i22 < i16; i22++) {
                    iArr7[i22] = l1Var2.f(formatArr[i22]);
                }
                iArr = iArr7;
            }
            int i23 = iArr6[length3];
            trackGroupArr[length3][i23] = trackGroup;
            iArr3[length3][i23] = iArr;
            iArr6[length3] = i23 + 1;
            i15++;
            trackGroupArray2 = trackGroupArray;
            i10 = i18;
            iArr2 = iArr6;
            i11 = 0;
        }
        int[] iArr8 = iArr2;
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[l1VarArr.length];
        String[] strArr = new String[l1VarArr.length];
        int[] iArr9 = new int[l1VarArr.length];
        for (int i24 = 0; i24 < l1VarArr.length; i24++) {
            int i25 = iArr8[i24];
            trackGroupArrayArr[i24] = new TrackGroupArray((TrackGroup[]) qb.v.D(i25, trackGroupArr[i24]));
            iArr3[i24] = (int[][]) qb.v.D(i25, iArr3[i24]);
            strArr[i24] = l1VarArr[i24].getName();
            iArr9[i24] = ((com.google.android.exoplayer2.g) l1VarArr[i24]).f4136a;
        }
        h hVar = new h(strArr, iArr9, trackGroupArrayArr, iArr4, iArr3, new TrackGroupArray((TrackGroup[]) qb.v.D(iArr8[l1VarArr.length], trackGroupArr[l1VarArr.length])));
        Pair pairSelectTracks = selectTracks(hVar, iArr3, iArr4, vVar, w1Var);
        return new n((m1[]) pairSelectTracks.first, (f[]) pairSelectTracks.second, hVar);
    }
}
