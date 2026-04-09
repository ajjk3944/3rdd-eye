package androidx.media3.exoplayer.trackselection;

import a5.d0;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.a1;
import androidx.media3.common.b1;
import androidx.media3.common.c1;
import androidx.media3.common.e1;
import d5.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import o5.h1;
import oe.e0;
import oe.f0;
import oe.h0;
import oe.t0;

/* loaded from: classes.dex */
public class DefaultTrackSelector extends y {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1857a = 0;
    private androidx.media3.common.f audioAttributes;
    public final Context context;
    private final boolean deviceIsTV;
    private final Object lock;
    private l parameters;
    private p spatializer;
    private final ExoTrackSelection$Factory trackSelectionFactory;
    private static final t0 FORMAT_VALUE_ORDERING = t0.a(new d(1));
    private static final t0 NO_ORDER = t0.a(new d(2));

    private DefaultTrackSelector(e1 e1Var, ExoTrackSelection$Factory exoTrackSelection$Factory, Context context) {
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = exoTrackSelection$Factory;
        if (e1Var instanceof l) {
            this.parameters = (l) e1Var;
        } else {
            l lVar = context != null ? new l(new k(context)) : l.f1901l0;
            lVar.getClass();
            k kVar = new k(lVar);
            kVar.a(e1Var);
            this.parameters = new l(kVar);
        }
        this.audioAttributes = androidx.media3.common.f.B;
        boolean z10 = context != null && d0.E(context);
        this.deviceIsTV = z10;
        if (!z10 && context != null && d0.f105a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.spatializer = audioManager != null ? new p(audioManager.getSpatializer()) : null;
        }
        if (this.parameters.f1907f0 && context == null) {
            a5.a.B(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    private static void applyLegacyRendererOverrides(x xVar, l lVar, u[] uVarArr) {
        int i10 = xVar.f1929a;
        for (int i11 = 0; i11 < i10; i11++) {
            h1 h1Var = xVar.f1931c[i11];
            Map map = (Map) lVar.f1911j0.get(i11);
            if (map != null && map.containsKey(h1Var)) {
                Map map2 = (Map) lVar.f1911j0.get(i11);
                if (map2 != null) {
                }
                uVarArr[i11] = null;
            }
        }
    }

    private static void applyTrackSelectionOverrides(x xVar, e1 e1Var, u[] uVarArr) {
        int i10 = xVar.f1929a;
        h1[] h1VarArr = xVar.f1931c;
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            collectTrackSelectionOverrides(h1VarArr[i11], e1Var, map);
        }
        collectTrackSelectionOverrides(xVar.f1934f, e1Var, map);
        for (int i12 = 0; i12 < i10; i12++) {
        }
    }

    private static void collectTrackSelectionOverrides(h1 h1Var, e1 e1Var, Map<Integer, c1> map) {
        for (int i10 = 0; i10 < h1Var.f18958a; i10++) {
        }
    }

    public static int getFormatLanguageScore(androidx.media3.common.r rVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(rVar.f1786g)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(rVar.f1786g);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (z10 && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        int i10 = d0.f105a;
        return strNormalizeUndeterminedLanguageToNull2.split("-", 2)[0].equals(strNormalizeUndeterminedLanguageToNull.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(b1 b1Var, int i10, int i11, boolean z10) {
        int i12 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i13 = 0; i13 < b1Var.f1572a; i13++) {
                androidx.media3.common.r rVar = b1Var.f1575r[i13];
                int i14 = rVar.M;
                int i15 = rVar.N;
                if (i14 > 0 && i15 > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z10, i10, i11, i14, i15);
                    int i16 = rVar.M;
                    int i17 = i16 * i15;
                    if (i16 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i15 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i17 < i12) {
                        i12 = i17;
                    }
                }
            }
        }
        return i12;
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
            int r4 = a5.d0.f(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = a5.d0.f(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(androidx.media3.common.r rVar) {
        boolean z10;
        p pVar;
        p pVar2;
        synchronized (this.lock) {
            try {
                if (this.parameters.f1907f0 && !this.deviceIsTV && rVar.U > 2 && (!isDolbyAudio(rVar) || (d0.f105a >= 32 && (pVar2 = this.spatializer) != null && pVar2.f1915b))) {
                    z10 = d0.f105a >= 32 && (pVar = this.spatializer) != null && pVar.f1915b && pVar.f1914a.isAvailable() && this.spatializer.f1914a.isEnabled() && this.spatializer.a(this.audioAttributes, rVar);
                }
            } finally {
            }
        }
        return z10;
    }

    private static boolean isDolbyAudio(androidx.media3.common.r rVar) {
        String str = rVar.H;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    public static boolean isSupported(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List lambda$selectAudioTrack$3(l lVar, boolean z10, int i10, b1 b1Var, int[] iArr) {
        f fVar = new f(this);
        f0 f0Var = h0.f19336d;
        oe.s.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < b1Var.f1572a) {
            l lVar2 = lVar;
            boolean z11 = z10;
            int i13 = i10;
            b1 b1Var2 = b1Var;
            i iVar = new i(i13, b1Var2, i11, lVar2, iArr[i11], z11, fVar);
            int i14 = i12 + 1;
            if (objArrCopyOf.length < i14) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, e0.e(objArrCopyOf.length, i14));
            }
            objArrCopyOf[i12] = iVar;
            i11++;
            i12 = i14;
            i10 = i13;
            b1Var = b1Var2;
            lVar = lVar2;
            z10 = z11;
        }
        return h0.k(i12, objArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List lambda$selectTextTrack$4(l lVar, String str, int i10, b1 b1Var, int[] iArr) {
        f0 f0Var = h0.f19336d;
        oe.s.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < b1Var.f1572a) {
            l lVar2 = lVar;
            String str2 = str;
            int i13 = i10;
            b1 b1Var2 = b1Var;
            q qVar = new q(i13, b1Var2, i11, lVar2, iArr[i11], str2);
            int i14 = i12 + 1;
            if (objArrCopyOf.length < i14) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, e0.e(objArrCopyOf.length, i14));
            }
            objArrCopyOf[i12] = qVar;
            i11++;
            i12 = i14;
            i10 = i13;
            b1Var = b1Var2;
            lVar = lVar2;
            str = str2;
        }
        return h0.k(i12, objArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List lambda$selectVideoTrack$2(l lVar, int[] iArr, int i10, b1 b1Var, int[] iArr2) {
        int i11;
        int i12 = iArr[i10];
        int maxVideoPixelsToRetainForViewport = getMaxVideoPixelsToRetainForViewport(b1Var, lVar.E, lVar.F, lVar.G);
        oe.s.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i13 = 0;
        int i14 = 0;
        while (i13 < b1Var.f1572a) {
            androidx.media3.common.r rVar = b1Var.f1575r[i13];
            int i15 = rVar.M;
            int i16 = (i15 == -1 || (i11 = rVar.N) == -1) ? -1 : i15 * i11;
            boolean z10 = maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (i16 != -1 && i16 <= maxVideoPixelsToRetainForViewport);
            l lVar2 = lVar;
            int i17 = i10;
            b1 b1Var2 = b1Var;
            t tVar = new t(i17, b1Var2, i13, lVar2, iArr2[i13], i12, z10);
            int i18 = i14 + 1;
            if (objArrCopyOf.length < i18) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, e0.e(objArrCopyOf.length, i18));
            }
            objArrCopyOf[i14] = tVar;
            i13++;
            i14 = i18;
            i10 = i17;
            b1Var = b1Var2;
            lVar = lVar2;
        }
        return h0.k(i14, objArrCopyOf);
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

    private static void maybeConfigureRenderersForTunneling(x xVar, int[][][] iArr, w0[] w0VarArr, v[] vVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < xVar.f1929a; i12++) {
            int i13 = xVar.f1930b[i12];
            v vVar = vVarArr[i12];
            if ((i13 == 1 || i13 == 2) && vVar != null && rendererSupportsTunneling(iArr[i12], xVar.f1931c[i12], vVar)) {
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
            w0 w0Var = new w0(true);
            w0VarArr[i11] = w0Var;
            w0VarArr[i10] = w0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z10;
        p pVar;
        synchronized (this.lock) {
            try {
                z10 = this.parameters.f1907f0 && !this.deviceIsTV && d0.f105a >= 32 && (pVar = this.spatializer) != null && pVar.f1915b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, h1 h1Var, v vVar) {
        if (vVar == null) {
            return false;
        }
        int iB = h1Var.b(vVar.getTrackGroup());
        for (int i10 = 0; i10 < vVar.length(); i10++) {
            if ((iArr[iB][vVar.getIndexInTrackGroup(i10)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends s> Pair<u, Integer> selectTracksForType(int i10, x xVar, int[][][] iArr, r rVar, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccessP;
        x xVar2 = xVar;
        ArrayList arrayList = new ArrayList();
        int i12 = xVar2.f1929a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == xVar2.f1930b[i13]) {
                h1 h1Var = xVar2.f1931c[i13];
                for (int i14 = 0; i14 < h1Var.f18958a; i14++) {
                    b1 b1VarA = h1Var.a(i14);
                    List listB = rVar.b(i13, b1VarA, iArr[i13][i14]);
                    int i15 = b1VarA.f1572a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        s sVar = (s) listB.get(i16);
                        int iA = sVar.a();
                        if (zArr[i16] || iA == 0) {
                            i11 = i12;
                        } else {
                            if (iA == 1) {
                                randomAccessP = h0.p(sVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(sVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    s sVar2 = (s) listB.get(i17);
                                    int i18 = i12;
                                    if (sVar2.a() == 2 && sVar.b(sVar2)) {
                                        arrayList2.add(sVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccessP = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccessP);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            xVar2 = xVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((s) list.get(i19)).f1922g;
        }
        s sVar3 = (s) list.get(0);
        return Pair.create(new u(0, sVar3.f1921d, iArr2), Integer.valueOf(sVar3.f1920a));
    }

    private void setParametersInternal(l lVar) {
        boolean zEquals;
        lVar.getClass();
        synchronized (this.lock) {
            zEquals = this.parameters.equals(lVar);
            this.parameters = lVar;
        }
        if (zEquals) {
            return;
        }
        if (lVar.f1907f0 && this.context == null) {
            a5.a.B(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
        invalidate();
    }

    public k buildUponParameters() {
        l parameters = getParameters();
        parameters.getClass();
        return new k(parameters);
    }

    @Override // androidx.media3.exoplayer.trackselection.b0
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.b0
    public void release() {
        p pVar;
        o oVar;
        synchronized (this.lock) {
            try {
                if (d0.f105a >= 32 && (pVar = this.spatializer) != null && (oVar = pVar.f1917d) != null && pVar.f1916c != null) {
                    pVar.f1914a.removeOnSpatializerStateChangedListener(oVar);
                    pVar.f1916c.removeCallbacksAndMessages(null);
                    pVar.f1916c = null;
                    pVar.f1917d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.release();
    }

    public u[] selectAllTracks(x xVar, int[][][] iArr, int[] iArr2, l lVar) throws d5.f {
        String str;
        int i10 = xVar.f1929a;
        u[] uVarArr = new u[i10];
        Pair<u, Integer> pairSelectVideoTrack = selectVideoTrack(xVar, iArr, iArr2, lVar);
        if (pairSelectVideoTrack != null) {
            uVarArr[((Integer) pairSelectVideoTrack.second).intValue()] = (u) pairSelectVideoTrack.first;
        }
        Pair<u, Integer> pairSelectAudioTrack = selectAudioTrack(xVar, iArr, iArr2, lVar);
        if (pairSelectAudioTrack != null) {
            uVarArr[((Integer) pairSelectAudioTrack.second).intValue()] = (u) pairSelectAudioTrack.first;
        }
        if (pairSelectAudioTrack == null) {
            str = null;
        } else {
            Object obj = pairSelectAudioTrack.first;
            b1 b1Var = ((u) obj).f1926a;
            str = b1Var.f1575r[((u) obj).f1927b[0]].f1786g;
        }
        Pair<u, Integer> pairSelectTextTrack = selectTextTrack(xVar, iArr, lVar, str);
        if (pairSelectTextTrack != null) {
            uVarArr[((Integer) pairSelectTextTrack.second).intValue()] = (u) pairSelectTextTrack.first;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = xVar.f1930b[i11];
            if (i12 != 2 && i12 != 1 && i12 != 3) {
                uVarArr[i11] = selectOtherTrack(i12, xVar.f1931c[i11], iArr[i11], lVar);
            }
        }
        return uVarArr;
    }

    public Pair<u, Integer> selectAudioTrack(x xVar, int[][][] iArr, int[] iArr2, l lVar) throws d5.f {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < xVar.f1929a) {
                if (2 == xVar.f1930b[i10] && xVar.f1931c[i10].f18958a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, xVar, iArr, new g(this, lVar, z10), new d(3));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.media3.exoplayer.trackselection.u selectOtherTrack(int r16, o5.h1 r17, int[][] r18, androidx.media3.exoplayer.trackselection.l r19) throws d5.f {
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
            int r7 = r0.f18958a
            if (r3 >= r7) goto L53
            androidx.media3.common.b1 r7 = r0.a(r3)
            r8 = r18[r3]
            r9 = r2
        L13:
            int r10 = r7.f1572a
            if (r9 >= r10) goto L4e
            r10 = r8[r9]
            r11 = r19
            boolean r12 = r11.f1908g0
            boolean r10 = isSupported(r10, r12)
            if (r10 == 0) goto L4b
            androidx.media3.common.r[] r10 = r7.f1575r
            r10 = r10[r9]
            androidx.media3.exoplayer.trackselection.j r12 = new androidx.media3.exoplayer.trackselection.j
            r13 = r8[r9]
            r12.<init>(r13, r10)
            if (r6 == 0) goto L48
            boolean r10 = r12.f1900d
            boolean r13 = r6.f1900d
            oe.y r14 = oe.a0.f19295a
            oe.a0 r10 = r14.c(r10, r13)
            boolean r13 = r12.f1899a
            boolean r14 = r6.f1899a
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
            androidx.media3.exoplayer.trackselection.u r0 = new androidx.media3.exoplayer.trackselection.u
            int[] r1 = new int[]{r5}
            r0.<init>(r2, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.selectOtherTrack(int, o5.h1, int[][], androidx.media3.exoplayer.trackselection.l):androidx.media3.exoplayer.trackselection.u");
    }

    public Pair<u, Integer> selectTextTrack(x xVar, int[][][] iArr, l lVar, String str) throws d5.f {
        return selectTracksForType(3, xVar, iArr, new h(lVar, 1, str), new d(5));
    }

    @Override // androidx.media3.exoplayer.trackselection.y
    public final Pair<w0[], v[]> selectTracks(x xVar, int[][][] iArr, int[] iArr2, o5.z zVar, a1 a1Var) throws d5.f {
        l lVar;
        p pVar;
        synchronized (this.lock) {
            try {
                lVar = this.parameters;
                if (lVar.f1907f0 && d0.f105a >= 32 && (pVar = this.spatializer) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    a5.a.j(looperMyLooper);
                    if (pVar.f1917d == null && pVar.f1916c == null) {
                        pVar.f1917d = new o(this);
                        Handler handler = new Handler(looperMyLooper);
                        pVar.f1916c = handler;
                        pVar.f1914a.addOnSpatializerStateChangedListener(new f5.x(handler), pVar.f1917d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i10 = xVar.f1929a;
        u[] uVarArrSelectAllTracks = selectAllTracks(xVar, iArr, iArr2, lVar);
        applyTrackSelectionOverrides(xVar, lVar, uVarArrSelectAllTracks);
        applyLegacyRendererOverrides(xVar, lVar, uVarArrSelectAllTracks);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = xVar.f1930b[i11];
            if (lVar.f1912k0.get(i11) || lVar.V.contains(Integer.valueOf(i12))) {
                uVarArrSelectAllTracks[i11] = null;
            }
        }
        v[] vVarArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(uVarArrSelectAllTracks, getBandwidthMeter(), zVar, a1Var);
        w0[] w0VarArr = new w0[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            w0VarArr[i13] = (lVar.f1912k0.get(i13) || lVar.V.contains(Integer.valueOf(xVar.f1930b[i13])) || (xVar.f1930b[i13] != -2 && vVarArrCreateTrackSelections[i13] == null)) ? null : w0.f7096b;
        }
        if (lVar.f1909h0) {
            maybeConfigureRenderersForTunneling(xVar, iArr, w0VarArr, vVarArrCreateTrackSelections);
        }
        return Pair.create(w0VarArr, vVarArrCreateTrackSelections);
    }

    public Pair<u, Integer> selectVideoTrack(x xVar, int[][][] iArr, int[] iArr2, l lVar) throws d5.f {
        return selectTracksForType(2, xVar, iArr, new h(lVar, 0, iArr2), new d(4));
    }

    @Override // androidx.media3.exoplayer.trackselection.b0
    public void setAudioAttributes(androidx.media3.common.f fVar) {
        boolean zEquals;
        synchronized (this.lock) {
            zEquals = this.audioAttributes.equals(fVar);
            this.audioAttributes = fVar;
        }
        if (zEquals) {
            return;
        }
        maybeInvalidateForAudioChannelCountConstraints();
    }

    @Override // androidx.media3.exoplayer.trackselection.b0
    public void setParameters(e1 e1Var) {
        if (e1Var instanceof l) {
            setParametersInternal((l) e1Var);
        }
        k kVar = new k(getParameters());
        kVar.a(e1Var);
        setParametersInternal(new l(kVar));
    }

    @Override // androidx.media3.exoplayer.trackselection.b0
    public l getParameters() {
        l lVar;
        synchronized (this.lock) {
            lVar = this.parameters;
        }
        return lVar;
    }

    @Deprecated
    public void setParameters(m mVar) {
        throw null;
    }

    public void setParameters(k kVar) {
        kVar.getClass();
        setParametersInternal(new l(kVar));
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(l.f1901l0, new b(0));
    }

    public DefaultTrackSelector(Context context) {
        this(context, new b(0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultTrackSelector(Context context, ExoTrackSelection$Factory exoTrackSelection$Factory) {
        this(context, new l(new k(context)), exoTrackSelection$Factory);
        l lVar = l.f1901l0;
    }

    public DefaultTrackSelector(Context context, e1 e1Var) {
        this(context, e1Var, new b(0));
    }

    @Deprecated
    public DefaultTrackSelector(e1 e1Var, ExoTrackSelection$Factory exoTrackSelection$Factory) {
        this(e1Var, exoTrackSelection$Factory, (Context) null);
    }

    public DefaultTrackSelector(Context context, e1 e1Var, ExoTrackSelection$Factory exoTrackSelection$Factory) {
        this(e1Var, exoTrackSelection$Factory, context);
    }
}
