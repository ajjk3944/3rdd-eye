package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.m1;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.w1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import lf.t1;
import ob.h;
import ob.i;
import oe.t0;
import qb.v;

/* loaded from: classes.dex */
public class DefaultTrackSelector extends i {
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4553a = 0;
    private final AtomicReference<Parameters> parametersReference;
    private final ExoTrackSelection$Factory trackSelectionFactory;
    private static final int[] NO_TRACKS = new int[0];
    private static final t0 FORMAT_VALUE_ORDERING = t0.a(new androidx.media3.exoplayer.trackselection.d(26));
    private static final t0 NO_ORDER = t0.a(new androidx.media3.exoplayer.trackselection.d(27));

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new d();

        /* renamed from: a, reason: collision with root package name */
        public final int f4560a;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f4561d;

        /* renamed from: g, reason: collision with root package name */
        public final int f4562g;

        public SelectionOverride(Parcel parcel) {
            this.f4560a = parcel.readInt();
            int[] iArr = new int[parcel.readByte()];
            this.f4561d = iArr;
            parcel.readIntArray(iArr);
            this.f4562g = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.f4560a == selectionOverride.f4560a && Arrays.equals(this.f4561d, selectionOverride.f4561d) && this.f4562g == selectionOverride.f4562g) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f4561d) + (this.f4560a * 31)) * 31) + this.f4562g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4560a);
            int[] iArr = this.f4561d;
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(iArr);
            parcel.writeInt(this.f4562g);
        }
    }

    public DefaultTrackSelector(Parameters parameters, ExoTrackSelection$Factory exoTrackSelection$Factory) {
        this.trackSelectionFactory = exoTrackSelection$Factory;
        this.parametersReference = new AtomicReference<>(parameters);
    }

    private static void filterAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!isSupportedAdaptiveVideoTrack(trackGroup.f4454d[iIntValue], str, iArr[iIntValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list.remove(size);
            }
        }
    }

    private static int[] getAdaptiveAudioTracks(TrackGroup trackGroup, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        Format format = trackGroup.f4454d[i10];
        int i12 = trackGroup.f4453a;
        int[] iArr2 = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i10 || isSupportedAdaptiveAudioTrack(trackGroup.f4454d[i14], iArr[i14], format, i11, z10, z11, z12)) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        return Arrays.copyOf(iArr2, i13);
    }

    private static int getAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int iIntValue = list.get(i20).intValue();
            if (isSupportedAdaptiveVideoTrack(trackGroup.f4454d[iIntValue], str, iArr[iIntValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    private static int[] getAdaptiveVideoTracksForGroup(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        TrackGroup trackGroup2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int[] iArr2;
        int i30;
        int i31;
        HashSet hashSet;
        TrackGroup trackGroup3 = trackGroup;
        if (trackGroup3.f4453a < 2) {
            return NO_TRACKS;
        }
        List<Integer> viewportFilteredTrackIndices = getViewportFilteredTrackIndices(trackGroup3, i19, i20, z11);
        if (viewportFilteredTrackIndices.size() < 2) {
            return NO_TRACKS;
        }
        if (z10) {
            str = null;
            trackGroup2 = trackGroup;
            i21 = i10;
            i22 = i11;
            i23 = i12;
            i24 = i13;
            i25 = i14;
            i26 = i15;
            i27 = i16;
            i28 = i17;
            i29 = i18;
            iArr2 = iArr;
        } else {
            HashSet hashSet2 = new HashSet();
            int i32 = 0;
            String str2 = null;
            int i33 = 0;
            while (i33 < viewportFilteredTrackIndices.size()) {
                String str3 = trackGroup3.f4454d[viewportFilteredTrackIndices.get(i33).intValue()].H;
                if (hashSet2.add(str3)) {
                    i30 = i33;
                    i31 = i32;
                    hashSet = hashSet2;
                    int adaptiveVideoTrackCountForMimeType = getAdaptiveVideoTrackCountForMimeType(trackGroup3, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, viewportFilteredTrackIndices);
                    if (adaptiveVideoTrackCountForMimeType > i31) {
                        str2 = str3;
                        i32 = adaptiveVideoTrackCountForMimeType;
                    }
                    i33 = i30 + 1;
                    trackGroup3 = trackGroup;
                    hashSet2 = hashSet;
                } else {
                    i30 = i33;
                    i31 = i32;
                    hashSet = hashSet2;
                }
                i32 = i31;
                i33 = i30 + 1;
                trackGroup3 = trackGroup;
                hashSet2 = hashSet;
            }
            str = str2;
            trackGroup2 = trackGroup;
            iArr2 = iArr;
            i21 = i10;
            i22 = i11;
            i23 = i12;
            i24 = i13;
            i25 = i14;
            i26 = i15;
            i27 = i16;
            i28 = i17;
            i29 = i18;
        }
        filterAdaptiveVideoTrackCountForMimeType(trackGroup2, iArr2, i21, str, i22, i23, i24, i25, i26, i27, i28, i29, viewportFilteredTrackIndices);
        return viewportFilteredTrackIndices.size() < 2 ? NO_TRACKS : t1.H(viewportFilteredTrackIndices);
    }

    public static int getFormatLanguageScore(Format format, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f4024g)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.f4024g);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (z10 && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        int i10 = v.f20828a;
        return strNormalizeUndeterminedLanguageToNull2.split("-", 2)[0].equals(strNormalizeUndeterminedLanguageToNull.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = qb.v.f(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = qb.v.f(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> getViewportFilteredTrackIndices(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        int i12;
        int i13 = trackGroup.f4453a;
        Format[] formatArr = trackGroup.f4454d;
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(Integer.valueOf(i14));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < i13; i16++) {
                Format format = formatArr[i16];
                int i17 = format.M;
                int i18 = format.N;
                if (i17 > 0 && i18 > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z10, i10, i11, i17, i18);
                    int i19 = format.M;
                    int i20 = i19 * i18;
                    if (i19 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i18 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i20 < i15) {
                        i15 = i20;
                    }
                }
            }
            if (i15 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Format format2 = formatArr[((Integer) arrayList.get(size)).intValue()];
                    int i21 = format2.M;
                    int i22 = (i21 == -1 || (i12 = format2.N) == -1) ? -1 : i21 * i12;
                    if (i22 == -1 || i22 > i15) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean isSupported(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    private static boolean isSupportedAdaptiveAudioTrack(Format format, int i10, Format format2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        String str;
        int i13;
        if (isSupported(i10, false) && (i12 = format.D) != -1 && i12 <= i11 && ((z12 || ((i13 = format.U) != -1 && i13 == format2.U)) && (z10 || ((str = format.H) != null && TextUtils.equals(str, format2.H))))) {
            if (z11) {
                return true;
            }
            int i14 = format.V;
            if (i14 != -1 && i14 == format2.V) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSupportedAdaptiveVideoTrack(Format format, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        int i21;
        int i22;
        if ((format.f4026x & 16384) == 0 && isSupported(i10, false) && (i10 & i11) != 0 && ((str == null || v.a(format.H, str)) && (((i20 = format.M) == -1 || (i16 <= i20 && i20 <= i12)) && ((i21 = format.N) == -1 || (i17 <= i21 && i21 <= i13))))) {
            float f10 = format.O;
            if ((f10 == -1.0f || (i18 <= f10 && f10 <= i14)) && (i22 = format.D) != -1 && i19 <= i22 && i22 <= i15) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(Integer num, Integer num2) {
        return 0;
    }

    private static void maybeConfigureRenderersForTunneling(h hVar, int[][][] iArr, m1[] m1VarArr, ob.f[] fVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < hVar.f19240a; i12++) {
            int i13 = hVar.f19242c[i12];
            ob.f fVar = fVarArr[i12];
            if ((i13 == 1 || i13 == 2) && fVar != null && rendererSupportsTunneling(iArr[i12], hVar.f19243d[i12], fVar)) {
                if (i13 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            m1 m1Var = new m1(true);
            m1VarArr[i11] = m1Var;
            m1VarArr[i10] = m1Var;
        }
    }

    public static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ob.f fVar) {
        if (fVar == null) {
            return false;
        }
        ob.c cVar = (ob.c) fVar;
        int iD = trackGroupArray.d(cVar.f19228a);
        int i10 = 0;
        while (true) {
            int[] iArr2 = cVar.f19230c;
            if (i10 >= iArr2.length) {
                return true;
            }
            if ((iArr[iD][iArr2[i10]] & 32) != 32) {
                return false;
            }
            i10++;
        }
    }

    private static ob.e selectAdaptiveVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int i11 = parameters.V ? 24 : 16;
        int i12 = 0;
        boolean z10 = parameters.U && (i10 & i11) != 0;
        int i13 = 0;
        while (i13 < trackGroupArray2.f4457a) {
            TrackGroup trackGroup = trackGroupArray2.f4458d[i13];
            int i14 = i12;
            int[] adaptiveVideoTracksForGroup = getAdaptiveVideoTracksForGroup(trackGroup, iArr[i13], z10, i11, parameters.f4563a, parameters.f4564d, parameters.f4565g, parameters.f4566r, parameters.f4567x, parameters.f4568y, parameters.B, parameters.D, parameters.E, parameters.F, parameters.G);
            if (adaptiveVideoTracksForGroup.length > 0) {
                return new ob.e(trackGroup, adaptiveVideoTracksForGroup, i14);
            }
            i13++;
            i12 = i14;
            trackGroupArray2 = trackGroupArray;
        }
        return null;
    }

    private static ob.e selectFixedVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        int i10 = -1;
        TrackGroup trackGroup = null;
        f fVar = null;
        for (int i11 = 0; i11 < trackGroupArray.f4457a; i11++) {
            TrackGroup trackGroup2 = trackGroupArray.f4458d[i11];
            List<Integer> viewportFilteredTrackIndices = getViewportFilteredTrackIndices(trackGroup2, parameters.E, parameters.F, parameters.G);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < trackGroup2.f4453a; i12++) {
                Format format = trackGroup2.f4454d[i12];
                if ((format.f4026x & 16384) == 0 && isSupported(iArr2[i12], parameters.f4555a0)) {
                    f fVar2 = new f(format, parameters, iArr2[i12], viewportFilteredTrackIndices.contains(Integer.valueOf(i12)));
                    if ((fVar2.f4585a || parameters.T) && (fVar == null || fVar2.a(fVar) > 0)) {
                        trackGroup = trackGroup2;
                        i10 = i12;
                        fVar = fVar2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ob.e(trackGroup, new int[]{i10}, 0);
    }

    public c buildUponParameters() {
        Parameters parameters = getParameters();
        parameters.getClass();
        return new c(parameters);
    }

    public Parameters getParameters() {
        return this.parametersReference.get();
    }

    public ob.e[] selectAllTracks(h hVar, int[][][] iArr, int[] iArr2, Parameters parameters) throws n {
        int i10;
        String str;
        a aVar;
        int i11;
        int i12 = hVar.f19240a;
        int[] iArr3 = hVar.f19242c;
        TrackGroupArray[] trackGroupArrayArr = hVar.f19243d;
        ob.e[] eVarArr = new ob.e[i12];
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            if (2 == iArr3[i13]) {
                if (!z10) {
                    ob.e eVarSelectVideoTrack = selectVideoTrack(trackGroupArrayArr[i13], iArr[i13], iArr2[i13], parameters, true);
                    eVarArr[i13] = eVarSelectVideoTrack;
                    z10 = eVarSelectVideoTrack != null;
                }
                z11 |= trackGroupArrayArr[i13].f4457a > 0;
            }
            i13++;
        }
        int i14 = -1;
        int i15 = 0;
        String str2 = null;
        a aVar2 = null;
        while (i15 < i12) {
            if (1 == iArr3[i15]) {
                str = str2;
                aVar = aVar2;
                i11 = i14;
                i10 = i15;
                Pair<ob.e, a> pairSelectAudioTrack = selectAudioTrack(trackGroupArrayArr[i15], iArr[i15], iArr2[i15], parameters, parameters.f4557c0 || !z11);
                if (pairSelectAudioTrack != null && (aVar == null || ((a) pairSelectAudioTrack.second).a(aVar) > 0)) {
                    if (i11 != -1) {
                        eVarArr[i11] = null;
                    }
                    ob.e eVar = (ob.e) pairSelectAudioTrack.first;
                    eVarArr[i10] = eVar;
                    String str3 = eVar.f19237a.f4454d[eVar.f19238b[0]].f4024g;
                    aVar2 = (a) pairSelectAudioTrack.second;
                    str2 = str3;
                    i14 = i10;
                }
                i15 = i10 + 1;
            } else {
                i10 = i15;
                str = str2;
                aVar = aVar2;
                i11 = i14;
            }
            str2 = str;
            i14 = i11;
            aVar2 = aVar;
            i15 = i10 + 1;
        }
        String str4 = str2;
        int i16 = -1;
        e eVar2 = null;
        for (int i17 = 0; i17 < i12; i17++) {
            int i18 = iArr3[i17];
            if (i18 != 1 && i18 != 2) {
                if (i18 != 3) {
                    eVarArr[i17] = selectOtherTrack(i18, trackGroupArrayArr[i17], iArr[i17], parameters);
                } else {
                    Pair<ob.e, e> pairSelectTextTrack = selectTextTrack(trackGroupArrayArr[i17], iArr[i17], parameters, str4);
                    if (pairSelectTextTrack != null && (eVar2 == null || ((e) pairSelectTextTrack.second).compareTo(eVar2) > 0)) {
                        if (i16 != -1) {
                            eVarArr[i16] = null;
                        }
                        eVarArr[i17] = (ob.e) pairSelectTextTrack.first;
                        eVar2 = (e) pairSelectTextTrack.second;
                        i16 = i17;
                    }
                }
            }
        }
        return eVarArr;
    }

    public Pair<ob.e, a> selectAudioTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws n {
        TrackGroup[] trackGroupArr;
        ob.e eVar = null;
        int i11 = -1;
        int i12 = -1;
        a aVar = null;
        int i13 = 0;
        while (true) {
            int i14 = trackGroupArray.f4457a;
            trackGroupArr = trackGroupArray.f4458d;
            if (i13 >= i14) {
                break;
            }
            TrackGroup trackGroup = trackGroupArr[i13];
            int[] iArr2 = iArr[i13];
            for (int i15 = 0; i15 < trackGroup.f4453a; i15++) {
                if (isSupported(iArr2[i15], parameters.f4555a0)) {
                    a aVar2 = new a(trackGroup.f4454d[i15], parameters, iArr2[i15]);
                    if ((aVar2.f4569a || parameters.W) && (aVar == null || aVar2.a(aVar) > 0)) {
                        i11 = i13;
                        i12 = i15;
                        aVar = aVar2;
                    }
                }
            }
            i13++;
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup trackGroup2 = trackGroupArr[i11];
        if (!parameters.R && !parameters.Q && z10) {
            int[] adaptiveAudioTracks = getAdaptiveAudioTracks(trackGroup2, iArr[i11], i12, parameters.L, parameters.X, parameters.Y, parameters.Z);
            if (adaptiveAudioTracks.length > 1) {
                eVar = new ob.e(trackGroup2, adaptiveAudioTracks, 0);
            }
        }
        if (eVar == null) {
            eVar = new ob.e(trackGroup2, new int[]{i12}, 0);
        }
        aVar.getClass();
        return Pair.create(eVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ob.e selectOtherTrack(int r16, com.google.android.exoplayer2.source.TrackGroupArray r17, int[][] r18, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r19) throws com.google.android.exoplayer2.n {
        /*
            r15 = this;
            r0 = r17
            r1 = 0
            r2 = 0
            r4 = r1
            r6 = r4
            r3 = r2
            r5 = r3
        L8:
            int r7 = r0.f4457a
            if (r3 >= r7) goto L53
            com.google.android.exoplayer2.source.TrackGroup[] r7 = r0.f4458d
            r7 = r7[r3]
            r8 = r18[r3]
            r9 = r2
        L13:
            int r10 = r7.f4453a
            if (r9 >= r10) goto L4e
            r10 = r8[r9]
            r11 = r19
            boolean r12 = r11.f4555a0
            boolean r10 = isSupported(r10, r12)
            if (r10 == 0) goto L4b
            com.google.android.exoplayer2.Format[] r10 = r7.f4454d
            r10 = r10[r9]
            ob.d r12 = new ob.d
            r13 = r8[r9]
            r12.<init>(r10, r13)
            if (r6 == 0) goto L48
            boolean r10 = r12.f19236d
            boolean r13 = r6.f19236d
            oe.y r14 = oe.a0.f19295a
            oe.a0 r10 = r14.c(r10, r13)
            boolean r13 = r12.f19235a
            boolean r14 = r6.f19235a
            oe.a0 r10 = r10.c(r13, r14)
            int r10 = r10.e()
            if (r10 <= 0) goto L4b
        L48:
            r4 = r7
            r5 = r9
            r6 = r12
        L4b:
            int r9 = r9 + 1
            goto L13
        L4e:
            r11 = r19
            int r3 = r3 + 1
            goto L8
        L53:
            if (r4 != 0) goto L56
            return r1
        L56:
            ob.e r0 = new ob.e
            int[] r1 = new int[]{r5}
            r0.<init>(r4, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.selectOtherTrack(int, com.google.android.exoplayer2.source.TrackGroupArray, int[][], com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters):ob.e");
    }

    public Pair<ob.e, e> selectTextTrack(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters, String str) throws n {
        int i10 = -1;
        TrackGroup trackGroup = null;
        e eVar = null;
        for (int i11 = 0; i11 < trackGroupArray.f4457a; i11++) {
            TrackGroup trackGroup2 = trackGroupArray.f4458d[i11];
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < trackGroup2.f4453a; i12++) {
                if (isSupported(iArr2[i12], parameters.f4555a0)) {
                    e eVar2 = new e(trackGroup2.f4454d[i12], parameters, iArr2[i12], str);
                    if (eVar2.f4579a && (eVar == null || eVar2.compareTo(eVar) > 0)) {
                        trackGroup = trackGroup2;
                        i10 = i12;
                        eVar = eVar2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        ob.e eVar3 = new ob.e(trackGroup, new int[]{i10}, 0);
        eVar.getClass();
        return Pair.create(eVar3, eVar);
    }

    @Override // ob.i
    public final Pair<m1[], ob.f[]> selectTracks(h hVar, int[][][] iArr, int[] iArr2, ya.v vVar, w1 w1Var) throws n {
        Parameters parameters = this.parametersReference.get();
        int i10 = hVar.f19240a;
        ob.e[] eVarArrSelectAllTracks = selectAllTracks(hVar, iArr, iArr2, parameters);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            SparseBooleanArray sparseBooleanArray = parameters.f4559e0;
            SparseArray sparseArray = parameters.f4558d0;
            if (sparseBooleanArray.get(i11)) {
                eVarArrSelectAllTracks[i11] = null;
            } else {
                TrackGroupArray trackGroupArray = hVar.f19243d[i11];
                Map map = (Map) sparseArray.get(i11);
                if (map != null && map.containsKey(trackGroupArray)) {
                    Map map2 = (Map) sparseArray.get(i11);
                    SelectionOverride selectionOverride = map2 != null ? (SelectionOverride) map2.get(trackGroupArray) : null;
                    eVarArrSelectAllTracks[i11] = selectionOverride != null ? new ob.e(trackGroupArray.f4458d[selectionOverride.f4560a], selectionOverride.f4561d, selectionOverride.f4562g) : null;
                }
            }
            i11++;
        }
        ob.f[] fVarArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(eVarArrSelectAllTracks, getBandwidthMeter(), vVar, w1Var);
        m1[] m1VarArr = new m1[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            m1VarArr[i12] = (parameters.f4559e0.get(i12) || (hVar.f19242c[i12] != 7 && fVarArrCreateTrackSelections[i12] == null)) ? null : m1.f4239b;
        }
        if (parameters.f4556b0) {
            maybeConfigureRenderersForTunneling(hVar, iArr, m1VarArr, fVarArrCreateTrackSelections);
        }
        return Pair.create(m1VarArr, fVarArrCreateTrackSelections);
    }

    public ob.e selectVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws n {
        ob.e eVarSelectAdaptiveVideoTrack = (parameters.R || parameters.Q || !z10) ? null : selectAdaptiveVideoTrack(trackGroupArray, iArr, i10, parameters);
        return eVarSelectAdaptiveVideoTrack == null ? selectFixedVideoTrack(trackGroupArray, iArr, parameters) : eVarSelectAdaptiveVideoTrack;
    }

    public void setParameters(Parameters parameters) {
        parameters.getClass();
        if (this.parametersReference.getAndSet(parameters).equals(parameters)) {
            return;
        }
        invalidate();
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.f4554f0, new androidx.media3.exoplayer.trackselection.b(1));
    }

    public void setParameters(c cVar) {
        cVar.getClass();
        setParameters(new Parameters(cVar));
    }

    @Deprecated
    public DefaultTrackSelector(ExoTrackSelection$Factory exoTrackSelection$Factory) {
        this(Parameters.f4554f0, exoTrackSelection$Factory);
    }

    public DefaultTrackSelector(Context context) {
        this(context, new androidx.media3.exoplayer.trackselection.b(1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultTrackSelector(Context context, ExoTrackSelection$Factory exoTrackSelection$Factory) {
        this(new Parameters(new c(context)), exoTrackSelection$Factory);
        Parameters parameters = Parameters.f4554f0;
    }

    public static final class Parameters extends TrackSelectionParameters implements Parcelable {
        public final int S;
        public final boolean T;
        public final boolean U;
        public final boolean V;
        public final boolean W;
        public final boolean X;
        public final boolean Y;
        public final boolean Z;

        /* renamed from: a0, reason: collision with root package name */
        public final boolean f4555a0;

        /* renamed from: b0, reason: collision with root package name */
        public final boolean f4556b0;

        /* renamed from: c0, reason: collision with root package name */
        public final boolean f4557c0;

        /* renamed from: d0, reason: collision with root package name */
        public final SparseArray f4558d0;

        /* renamed from: e0, reason: collision with root package name */
        public final SparseBooleanArray f4559e0;

        /* renamed from: f0, reason: collision with root package name */
        public static final Parameters f4554f0 = new Parameters(new c());
        public static final Parcelable.Creator<Parameters> CREATOR = new b();

        public Parameters(c cVar) {
            super(cVar);
            this.T = cVar.f4575w;
            this.U = cVar.f4576x;
            this.V = cVar.f4577y;
            this.W = cVar.f4578z;
            this.X = cVar.A;
            this.Y = cVar.B;
            this.Z = cVar.C;
            this.S = cVar.D;
            this.f4555a0 = cVar.E;
            this.f4556b0 = cVar.F;
            this.f4557c0 = cVar.G;
            this.f4558d0 = cVar.H;
            this.f4559e0 = cVar.I;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.T == parameters.T && this.U == parameters.U && this.V == parameters.V && this.W == parameters.W && this.X == parameters.X && this.Y == parameters.Y && this.Z == parameters.Z && this.S == parameters.S && this.f4555a0 == parameters.f4555a0 && this.f4556b0 == parameters.f4556b0 && this.f4557c0 == parameters.f4557c0) {
                    SparseBooleanArray sparseBooleanArray = parameters.f4559e0;
                    SparseBooleanArray sparseBooleanArray2 = this.f4559e0;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                SparseArray sparseArray = parameters.f4558d0;
                                SparseArray sparseArray2 = this.f4558d0;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                        if (iIndexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i11);
                                            Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                                                    if (!map2.containsKey(trackGroupArray) || !v.a(entry.getValue(), map2.get(trackGroupArray))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) < 0) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + this.S) * 31) + (this.f4555a0 ? 1 : 0)) * 31) + (this.f4556b0 ? 1 : 0)) * 31) + (this.f4557c0 ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            int i11 = v.f20828a;
            parcel.writeInt(this.T ? 1 : 0);
            parcel.writeInt(this.U ? 1 : 0);
            parcel.writeInt(this.V ? 1 : 0);
            parcel.writeInt(this.W ? 1 : 0);
            parcel.writeInt(this.X ? 1 : 0);
            parcel.writeInt(this.Y ? 1 : 0);
            parcel.writeInt(this.Z ? 1 : 0);
            parcel.writeInt(this.S);
            parcel.writeInt(this.f4555a0 ? 1 : 0);
            parcel.writeInt(this.f4556b0 ? 1 : 0);
            parcel.writeInt(this.f4557c0 ? 1 : 0);
            SparseArray sparseArray = this.f4558d0;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseArray.keyAt(i12);
                Map map = (Map) sparseArray.valueAt(i12);
                int size2 = map.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : map.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f4559e0);
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            int i10 = v.f20828a;
            this.T = parcel.readInt() != 0;
            this.U = parcel.readInt() != 0;
            this.V = parcel.readInt() != 0;
            this.W = parcel.readInt() != 0;
            this.X = parcel.readInt() != 0;
            this.Y = parcel.readInt() != 0;
            this.Z = parcel.readInt() != 0;
            this.S = parcel.readInt();
            this.f4555a0 = parcel.readInt() != 0;
            this.f4556b0 = parcel.readInt() != 0;
            this.f4557c0 = parcel.readInt() != 0;
            int i11 = parcel.readInt();
            SparseArray sparseArray = new SparseArray(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                HashMap map = new HashMap(i14);
                for (int i15 = 0; i15 < i14; i15++) {
                    TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                    trackGroupArray.getClass();
                    map.put(trackGroupArray, (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i13, map);
            }
            this.f4558d0 = sparseArray;
            this.f4559e0 = parcel.readSparseBooleanArray();
        }
    }
}
