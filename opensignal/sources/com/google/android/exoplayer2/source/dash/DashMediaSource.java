package com.google.android.exoplayer2.source.dash;

import a2.g;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import ba.i;
import bb.b;
import bb.d;
import bb.j;
import bb.k;
import bb.p;
import bb.r;
import cb.c;
import cb.u;
import cg.e;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.y0;
import io.sentry.android.core.e0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import om.f;
import pb.f0;
import pb.g0;
import pb.h0;
import pb.m;
import pb.n;
import pb.n0;
import pb.o0;
import pb.p0;
import pb.q0;
import pb.t0;
import pb.u0;
import pb.y;
import pb.z;
import qb.v;
import ya.a;
import ya.a0;
import ya.c0;
import ya.h;
import ya.t;

/* loaded from: classes.dex */
public final class DashMediaSource extends a {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;

    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final bb.a baseUrlExclusionList;
    private final b chunkSourceFactory;
    private final h compositeSequenceableLoaderFactory;
    private n dataSource;
    private final ba.h drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private l0 liveConfiguration;
    private final f0 loadErrorHandlingPolicy;
    private n0 loader;
    private c manifest;
    private final j manifestCallback;
    private final m manifestDataSourceFactory;
    private final a0 manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final o0 manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final p0 manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    private final com.google.android.exoplayer2.n0 mediaItem;
    private u0 mediaTransferListener;
    private final SparseArray<d> periodsById;
    private final p playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    public static final class Factory implements c0 {
        private final b chunkSourceFactory;
        private h compositeSequenceableLoaderFactory;
        private i drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private f0 loadErrorHandlingPolicy;
        private final m manifestDataSourceFactory;
        private p0 manifestParser;
        private List<StreamKey> streamKeys;
        private Object tag;
        private long targetLiveOffsetOverrideMs;
        private boolean usingCustomDrmSessionManagerProvider;

        public Factory(m mVar) {
            this(new g(mVar), mVar);
        }

        @Deprecated
        /* renamed from: createMediaSource, reason: merged with bridge method [inline-methods] */
        public DashMediaSource m7createMediaSource(Uri uri) {
            List list = Collections.EMPTY_LIST;
            Map map = Collections.EMPTY_MAP;
            return m8createMediaSource(new com.google.android.exoplayer2.n0("", new k0(Long.MIN_VALUE), uri != null ? new m0(uri, "application/dash+xml", null, null, list, list, this.tag) : null, new l0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), com.google.android.exoplayer2.p0.f4365s));
        }

        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory setCompositeSequenceableLoaderFactory(h hVar) {
            if (hVar == null) {
                hVar = new sm.m();
            }
            this.compositeSequenceableLoaderFactory = hVar;
            return this;
        }

        public Factory setFallbackTargetLiveOffsetMs(long j) {
            this.fallbackTargetLiveOffsetMs = j;
            return this;
        }

        @Deprecated
        public Factory setLivePresentationDelayMs(long j, boolean z10) {
            this.targetLiveOffsetOverrideMs = z10 ? j : -9223372036854775807L;
            if (!z10) {
                setFallbackTargetLiveOffsetMs(j);
            }
            return this;
        }

        public Factory setManifestParser(p0 p0Var) {
            this.manifestParser = p0Var;
            return this;
        }

        @Deprecated
        /* renamed from: setStreamKeys, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ c0 m14setStreamKeys(List list) {
            return setStreamKeys((List<StreamKey>) list);
        }

        @Deprecated
        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Factory(b bVar, m mVar) {
            bVar.getClass();
            this.chunkSourceFactory = bVar;
            this.manifestDataSourceFactory = mVar;
            this.drmSessionManagerProvider = new ba.a();
            this.loadErrorHandlingPolicy = new sm.m();
            this.targetLiveOffsetOverrideMs = -9223372036854775807L;
            this.fallbackTargetLiveOffsetMs = 30000L;
            this.compositeSequenceableLoaderFactory = new sm.m();
            this.streamKeys = Collections.EMPTY_LIST;
        }

        /* renamed from: setDrmHttpDataSourceFactory, reason: merged with bridge method [inline-methods] */
        public Factory m9setDrmHttpDataSourceFactory(z zVar) {
            if (!this.usingCustomDrmSessionManagerProvider) {
                ((ba.a) this.drmSessionManagerProvider).f2483b = zVar;
            }
            return this;
        }

        /* renamed from: setDrmSessionManager, reason: merged with bridge method [inline-methods] */
        public Factory m10setDrmSessionManager(ba.h hVar) {
            if (hVar == null) {
                m11setDrmSessionManagerProvider((i) null);
                return this;
            }
            m11setDrmSessionManagerProvider((i) new bb.h(hVar, 0));
            return this;
        }

        /* renamed from: setDrmSessionManagerProvider, reason: merged with bridge method [inline-methods] */
        public Factory m11setDrmSessionManagerProvider(i iVar) {
            if (iVar != null) {
                this.drmSessionManagerProvider = iVar;
                this.usingCustomDrmSessionManagerProvider = true;
                return this;
            }
            this.drmSessionManagerProvider = new ba.a();
            this.usingCustomDrmSessionManagerProvider = false;
            return this;
        }

        /* renamed from: setDrmUserAgent, reason: merged with bridge method [inline-methods] */
        public Factory m12setDrmUserAgent(String str) {
            if (!this.usingCustomDrmSessionManagerProvider) {
                ((ba.a) this.drmSessionManagerProvider).getClass();
            }
            return this;
        }

        /* renamed from: setLoadErrorHandlingPolicy, reason: merged with bridge method [inline-methods] */
        public Factory m13setLoadErrorHandlingPolicy(f0 f0Var) {
            if (f0Var == null) {
                f0Var = new sm.m();
            }
            this.loadErrorHandlingPolicy = f0Var;
            return this;
        }

        @Deprecated
        public Factory setStreamKeys(List<StreamKey> list) {
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            this.streamKeys = list;
            return this;
        }

        public DashMediaSource createMediaSource(c cVar) {
            List listUnmodifiableList;
            List list = Collections.EMPTY_LIST;
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            List<StreamKey> list2 = this.streamKeys;
            if (list2 != null && !list2.isEmpty()) {
                listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list2));
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            return createMediaSource(cVar, new com.google.android.exoplayer2.n0("DashMediaSource", new k0(Long.MIN_VALUE), uri != null ? new m0(uri, "application/dash+xml", null, null, listUnmodifiableList, list, this.tag) : null, new l0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), com.google.android.exoplayer2.p0.f4365s));
        }

        public DashMediaSource createMediaSource(c cVar, com.google.android.exoplayer2.n0 n0Var) {
            List<StreamKey> list;
            c cVarB = cVar;
            qb.b.g(!cVarB.f3537d);
            m0 m0Var = n0Var.f4336b;
            long j = n0Var.f4337c.f4228a;
            if (m0Var != null && !m0Var.f4236c.isEmpty()) {
                list = m0Var.f4236c;
            } else {
                list = this.streamKeys;
            }
            if (!list.isEmpty()) {
                cVarB = cVarB.a(list);
            }
            c cVar2 = cVarB;
            boolean z10 = m0Var != null;
            boolean z11 = z10 && m0Var.f4238e != null;
            boolean z12 = j != -9223372036854775807L;
            j0 j0VarA = n0Var.a();
            j0VarA.f4186c = "application/dash+xml";
            j0VarA.f4185b = z10 ? m0Var.f4234a : Uri.EMPTY;
            j0VarA.f4190g = z11 ? m0Var.f4238e : this.tag;
            if (!z12) {
                j = this.targetLiveOffsetOverrideMs;
            }
            j0VarA.f4192i = j;
            j0VarA.b(list);
            com.google.android.exoplayer2.n0 n0VarA = j0VarA.a();
            return new DashMediaSource(n0VarA, cVar2, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.drmSessionManagerProvider.a(n0VarA), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, null);
        }

        /* renamed from: createMediaSource, reason: merged with bridge method [inline-methods] */
        public DashMediaSource m8createMediaSource(com.google.android.exoplayer2.n0 n0Var) {
            com.google.android.exoplayer2.n0 n0VarA = n0Var;
            m0 m0Var = n0VarA.f4336b;
            m0Var.getClass();
            p0 dashManifestParser = this.manifestParser;
            if (dashManifestParser == null) {
                dashManifestParser = new DashManifestParser();
            }
            List list = m0Var.f4236c;
            List<StreamKey> list2 = m0Var.f4236c;
            List<StreamKey> list3 = list.isEmpty() ? this.streamKeys : list2;
            p0 fVar = !list3.isEmpty() ? new f(dashManifestParser, 26, list3) : dashManifestParser;
            boolean z10 = false;
            boolean z11 = m0Var.f4238e == null && this.tag != null;
            boolean z12 = list2.isEmpty() && !list3.isEmpty();
            if (n0VarA.f4337c.f4228a == -9223372036854775807L && this.targetLiveOffsetOverrideMs != -9223372036854775807L) {
                z10 = true;
            }
            if (z11 || z12 || z10) {
                j0 j0VarA = n0VarA.a();
                if (z11) {
                    j0VarA.f4190g = this.tag;
                }
                if (z12) {
                    j0VarA.b(list3);
                }
                if (z10) {
                    j0VarA.f4192i = this.targetLiveOffsetOverrideMs;
                }
                n0VarA = j0VarA.a();
            }
            com.google.android.exoplayer2.n0 n0Var2 = n0VarA;
            return new DashMediaSource(n0Var2, null, this.manifestDataSourceFactory, fVar, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.drmSessionManagerProvider.a(n0Var2), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ba.h lambda$setDrmSessionManager$0(ba.h hVar, com.google.android.exoplayer2.n0 n0Var) {
            return hVar;
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.dash");
    }

    public /* synthetic */ DashMediaSource(com.google.android.exoplayer2.n0 n0Var, c cVar, m mVar, p0 p0Var, b bVar, h hVar, ba.h hVar2, f0 f0Var, long j, bb.f fVar) {
        this(n0Var, cVar, mVar, p0Var, bVar, hVar, hVar2, f0Var, j);
    }

    private static long getAvailableEndTimeInManifestUs(cb.g gVar, long j, long j7) {
        long j10 = gVar.f3560b;
        List list = gVar.f3561c;
        long jC = com.google.android.exoplayer2.h.c(j10);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < list.size(); i10++) {
            cb.a aVar = (cb.a) list.get(i10);
            List list2 = aVar.f3526c;
            if ((!zHasVideoOrAudioAdaptationSets || aVar.f3525b != 3) && !list2.isEmpty()) {
                DashSegmentIndex index = ((Representation) list2.get(0)).getIndex();
                if (index == null) {
                    return jC + j;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(j, j7);
                if (availableSegmentCount == 0) {
                    return jC;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(j, j7) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, index.getDurationUs(firstAvailableSegmentNum, j) + index.getTimeUs(firstAvailableSegmentNum) + jC);
            }
        }
        return jMin;
    }

    private static long getAvailableStartTimeInManifestUs(cb.g gVar, long j, long j7) {
        long j10 = gVar.f3560b;
        List list = gVar.f3561c;
        long jC = com.google.android.exoplayer2.h.c(j10);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(gVar);
        long jMax = jC;
        for (int i10 = 0; i10 < list.size(); i10++) {
            cb.a aVar = (cb.a) list.get(i10);
            List list2 = aVar.f3526c;
            if ((!zHasVideoOrAudioAdaptationSets || aVar.f3525b != 3) && !list2.isEmpty()) {
                DashSegmentIndex index = ((Representation) list2.get(0)).getIndex();
                if (index == null || index.getAvailableSegmentCount(j, j7) == 0) {
                    return jC;
                }
                jMax = Math.max(jMax, index.getTimeUs(index.getFirstAvailableSegmentNum(j, j7)) + jC);
            }
        }
        return jMax;
    }

    private static long getIntervalUntilNextManifestRefreshMs(c cVar, long j) {
        DashSegmentIndex index;
        int size = cVar.f3544m.size() - 1;
        cb.g gVarC = cVar.c(size);
        long j7 = gVarC.f3560b;
        List list = gVarC.f3561c;
        long jC = com.google.android.exoplayer2.h.c(j7);
        long jE = cVar.e(size);
        long jC2 = com.google.android.exoplayer2.h.c(j);
        long jC3 = com.google.android.exoplayer2.h.c(cVar.f3534a);
        long jC4 = com.google.android.exoplayer2.h.c(DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS);
        for (int i10 = 0; i10 < list.size(); i10++) {
            List list2 = ((cb.a) list.get(i10)).f3526c;
            if (!list2.isEmpty() && (index = ((Representation) list2.get(0)).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = (index.getNextSegmentAvailableTimeUs(jE, jC2) + (jC3 + jC)) - jC2;
                if (nextSegmentAvailableTimeUs < jC4 - 100000 || (nextSegmentAvailableTimeUs > jC4 && nextSegmentAvailableTimeUs < 100000 + jC4)) {
                    jC4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        return kc.f.s(jC4);
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private static boolean hasVideoOrAudioAdaptationSets(cb.g gVar) {
        for (int i10 = 0; i10 < gVar.f3561c.size(); i10++) {
            int i11 = ((cb.a) gVar.f3561c.get(i10)).f3525b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIndexExplicit(cb.g gVar) {
        for (int i10 = 0; i10 < gVar.f3561c.size(); i10++) {
            DashSegmentIndex index = ((Representation) ((cb.a) gVar.f3561c.get(i10)).f3526c.get(0)).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        processManifest(false);
    }

    private void loadNtpTimeOffset() {
        boolean z10;
        n0 n0Var = this.loader;
        bb.f fVar = new bb.f(this);
        synchronized (qb.b.f20765h) {
            z10 = qb.b.f20766i;
        }
        if (z10) {
            fVar.a();
            return;
        }
        if (n0Var == null) {
            n0Var = new n0("SntpClient");
        }
        n0Var.f(new ee.f(22), new o2.g(9, fVar), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(IOException iOException) {
        qb.b.q("DashMediaSource", "Failed to resolve time offset.", iOException);
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolved(long j) {
        this.elapsedRealtimeOffsetMs = j;
        processManifest(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    private void processManifest(boolean z10) {
        long j;
        long j7;
        long j10;
        boolean z11;
        boolean z12 = false;
        int i10 = 0;
        while (i10 < this.periodsById.size()) {
            int iKeyAt = this.periodsById.keyAt(i10);
            if (iKeyAt >= this.firstPeriodId) {
                d dVarValueAt = this.periodsById.valueAt(i10);
                c cVar = this.manifest;
                int i11 = iKeyAt - this.firstPeriodId;
                dVarValueAt.Q = cVar;
                dVarValueAt.R = i11;
                r rVar = dVarValueAt.I;
                rVar.f2569x = z12;
                rVar.F = cVar;
                Iterator it = rVar.f2567g.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < ((c) rVar.F).f3541h) {
                        it.remove();
                    }
                }
                ab.j[] jVarArr = dVarValueAt.N;
                if (jVarArr != null) {
                    int length = jVarArr.length;
                    for (?? r10 = z12; r10 < length; r10++) {
                        bb.m mVar = jVarArr[r10].f319x;
                        k[] kVarArr = (k[]) mVar.k;
                        try {
                            mVar.f2550m = cVar;
                            mVar.f2544e = i11;
                            long jE = cVar.e(i11);
                            ArrayList arrayListA = mVar.a();
                            for (?? r15 = z12; r15 < kVarArr.length; r15++) {
                                try {
                                    kVarArr[r15] = kVarArr[r15].a(jE, (Representation) arrayListA.get(((ob.c) ((ob.f) mVar.f2549l)).f19230c[r15]));
                                } catch (ya.b e4) {
                                    e = e4;
                                    mVar.f2551n = e;
                                    z12 = false;
                                }
                            }
                        } catch (ya.b e10) {
                            e = e10;
                        }
                        z12 = false;
                    }
                    z11 = true;
                    dVarValueAt.M.c(dVarValueAt);
                } else {
                    z11 = true;
                }
                dVarValueAt.S = cVar.c(i11).f3562d;
                for (bb.n nVar : dVarValueAt.O) {
                    Iterator it2 = dVarValueAt.S.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            cb.f fVar = (cb.f) it2.next();
                            if (fVar.a().equals(nVar.f2556x.a())) {
                                nVar.c(fVar, (cVar.f3537d && i11 == cVar.f3544m.size() + (-1)) ? z11 : false);
                            }
                        }
                    }
                }
            }
            i10++;
            z12 = false;
        }
        cb.g gVarC = this.manifest.c(0);
        int size = this.manifest.f3544m.size() - 1;
        cb.g gVarC2 = this.manifest.c(size);
        long jE2 = this.manifest.e(size);
        long jC = com.google.android.exoplayer2.h.c(v.s(this.elapsedRealtimeOffsetMs));
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(gVarC, this.manifest.e(0), jC);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(gVarC2, jE2, jC);
        boolean z13 = this.manifest.f3537d && !isIndexExplicit(gVarC2);
        if (z13) {
            long j11 = this.manifest.f3539f;
            if (j11 != -9223372036854775807L) {
                availableStartTimeInManifestUs = Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - com.google.android.exoplayer2.h.c(j11));
            }
        }
        long j12 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        c cVar2 = this.manifest;
        long j13 = availableStartTimeInManifestUs;
        if (cVar2.f3537d) {
            qb.b.j(cVar2.f3534a != -9223372036854775807L);
            long jC2 = (jC - com.google.android.exoplayer2.h.c(this.manifest.f3534a)) - j13;
            updateMediaItemLiveConfiguration(jC2, j12);
            long jD = com.google.android.exoplayer2.h.d(j13) + this.manifest.f3534a;
            long jC3 = jC2 - com.google.android.exoplayer2.h.c(this.liveConfiguration.f4228a);
            j = -9223372036854775807L;
            long jMin = Math.min(MIN_LIVE_DEFAULT_START_POSITION_US, j12 / 2);
            j7 = jC3 < jMin ? jMin : jC3;
            j10 = jD;
        } else {
            j = -9223372036854775807L;
            j7 = 0;
            j10 = -9223372036854775807L;
        }
        long jC4 = j13 - com.google.android.exoplayer2.h.c(gVarC.f3560b);
        c cVar3 = this.manifest;
        refreshSourceInfo(new bb.g(cVar3.f3534a, j10, this.elapsedRealtimeOffsetMs, this.firstPeriodId, jC4, j12, j7, cVar3, this.mediaItem, cVar3.f3537d ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z13) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, getIntervalUntilNextManifestRefreshMs(this.manifest, v.s(this.elapsedRealtimeOffsetMs)));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z10) {
            c cVar4 = this.manifest;
            if (cVar4.f3537d) {
                long j14 = cVar4.f3538e;
                if (j14 != j) {
                    if (j14 == 0) {
                        j14 = DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS;
                    }
                    scheduleManifestRefresh(Math.max(0L, (this.manifestLoadStartTimestampMs + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void resolveUtcTimingElement(u uVar) {
        String str = uVar.f3599a;
        if (v.a(str, "urn:mpeg:dash:utc:direct:2014") || v.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(uVar);
            return;
        }
        if (v.a(str, "urn:mpeg:dash:utc:http-iso:2014") || v.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(uVar, new bb.i());
            return;
        }
        if (v.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || v.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(uVar, new e());
        } else if (v.a(str, "urn:mpeg:dash:utc:ntp:2014") || v.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(u uVar) {
        try {
            onUtcTimestampResolved(v.E(uVar.f3600b) - this.manifestLoadEndTimestampMs);
        } catch (y0 e4) {
            onUtcTimestampResolutionError(e4);
        }
    }

    private void resolveUtcTimingElementHttp(u uVar, p0 p0Var) {
        startLoading(new q0(this.dataSource, Uri.parse(uVar.f3600b), 5, p0Var), new b9.e(4, this), 1);
    }

    private void scheduleManifestRefresh(long j) {
        this.handler.postDelayed(this.refreshManifestRunnable, j);
    }

    private <T> void startLoading(q0 q0Var, g0 g0Var, int i10) {
        long jF = this.loader.f(q0Var, g0Var, i10);
        a0 a0Var = this.manifestEventDispatcher;
        long j = q0Var.f20405a;
        a0Var.k(new ya.m(q0Var.f20406d, jF), q0Var.f20407g, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.c()) {
            return;
        }
        if (this.loader.d()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new q0(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, ((sm.m) this.loadErrorHandlingPolicy).q(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateMediaItemLiveConfiguration(long r14, long r16) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.updateMediaItemLiveConfiguration(long, long):void");
    }

    @Override // ya.x
    public t createPeriod(ya.v vVar, pb.b bVar, long j) {
        int iIntValue = ((Integer) vVar.f26177a).intValue() - this.firstPeriodId;
        a0 a0VarCreateEventDispatcher = createEventDispatcher(vVar, this.manifest.c(iIntValue).f3560b);
        ba.d dVarCreateDrmEventDispatcher = createDrmEventDispatcher(vVar);
        int i10 = this.firstPeriodId + iIntValue;
        d dVar = new d(i10, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.drmSessionManager, dVarCreateDrmEventDispatcher, this.loadErrorHandlingPolicy, a0VarCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, bVar, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback);
        this.periodsById.put(i10, dVar);
        return dVar;
    }

    @Override // ya.x
    public /* bridge */ /* synthetic */ w1 getInitialTimeline() {
        return null;
    }

    @Override // ya.x
    public com.google.android.exoplayer2.n0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // ya.x
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return true;
    }

    @Override // ya.x
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.manifestLoadErrorThrower.a();
    }

    public void onDashManifestPublishTimeExpired(long j) {
        long j7 = this.expiredManifestPublishTimeUs;
        if (j7 == -9223372036854775807L || j7 < j) {
            this.expiredManifestPublishTimeUs = j;
        }
    }

    public void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    public void onLoadCanceled(q0 q0Var, long j, long j7) {
        long j10 = q0Var.f20405a;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        this.loadErrorHandlingPolicy.getClass();
        this.manifestEventDispatcher.d(mVar, q0Var.f20407g, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void onManifestLoadCompleted(q0 q0Var, long j, long j7) {
        long j10 = q0Var.f20405a;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        this.loadErrorHandlingPolicy.getClass();
        this.manifestEventDispatcher.f(mVar, q0Var.f20407g, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        c cVar2 = (c) q0Var.f20410y;
        c cVar3 = this.manifest;
        int size = cVar3 == null ? 0 : cVar3.f3544m.size();
        long j11 = cVar2.c(0).f3560b;
        int i10 = 0;
        while (i10 < size && this.manifest.c(i10).f3560b < j11) {
            i10++;
        }
        if (cVar2.f3537d) {
            if (size - i10 > cVar2.f3544m.size()) {
                e0.p("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j12 = this.expiredManifestPublishTimeUs;
                if (j12 != -9223372036854775807L) {
                    long j13 = cVar2.f3541h;
                    if (1000 * j13 <= j12) {
                        StringBuilder sb2 = new StringBuilder(73);
                        sb2.append("Loaded stale dynamic manifest: ");
                        sb2.append(j13);
                        sb2.append(", ");
                        sb2.append(j12);
                        e0.p("DashMediaSource", sb2.toString());
                    }
                }
                this.staleManifestReloadAttempt = 0;
            }
            int i11 = this.staleManifestReloadAttempt;
            this.staleManifestReloadAttempt = i11 + 1;
            if (i11 < ((sm.m) this.loadErrorHandlingPolicy).q(q0Var.f20407g)) {
                scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                return;
            } else {
                this.manifestFatalError = new androidx.datastore.preferences.protobuf.m();
                return;
            }
        }
        this.manifest = cVar2;
        this.manifestLoadPending = cVar2.f3537d & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j - j7;
        this.manifestLoadEndTimestampMs = j;
        synchronized (this.manifestUriLock) {
            try {
                if (((Uri) q0Var.f20406d.f17422f) == this.manifestUri) {
                    Uri uri2 = this.manifest.k;
                    if (uri2 == null) {
                        uri2 = q0Var.f20408r.f20432g;
                    }
                    this.manifestUri = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size != 0) {
            this.firstPeriodId += i10;
            processManifest(true);
            return;
        }
        c cVar4 = this.manifest;
        if (!cVar4.f3537d) {
            processManifest(true);
            return;
        }
        u uVar = cVar4.f3542i;
        if (uVar != null) {
            resolveUtcTimingElement(uVar);
        } else {
            loadNtpTimeOffset();
        }
    }

    public h0 onManifestLoadError(q0 q0Var, long j, long j7, IOException iOException, int i10) {
        long j10 = q0Var.f20405a;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        int i11 = q0Var.f20407g;
        ((sm.m) this.loadErrorHandlingPolicy).getClass();
        long jMin = ((iOException instanceof y0) || (iOException instanceof FileNotFoundException) || (iOException instanceof y) || (iOException instanceof pb.m0)) ? -9223372036854775807L : Math.min((i10 - 1) * 1000, 5000);
        h0 h0Var = jMin == -9223372036854775807L ? n0.f20392y : new h0(0, jMin);
        boolean zA = h0Var.a();
        this.manifestEventDispatcher.i(mVar, i11, iOException, !zA);
        if (!zA) {
            this.loadErrorHandlingPolicy.getClass();
        }
        return h0Var;
    }

    public void onUtcTimestampLoadCompleted(q0 q0Var, long j, long j7) {
        long j10 = q0Var.f20405a;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        this.loadErrorHandlingPolicy.getClass();
        this.manifestEventDispatcher.f(mVar, q0Var.f20407g, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        onUtcTimestampResolved(((Long) q0Var.f20410y).longValue() - j);
    }

    public h0 onUtcTimestampLoadError(q0 q0Var, long j, long j7, IOException iOException) {
        a0 a0Var = this.manifestEventDispatcher;
        long j10 = q0Var.f20405a;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        a0Var.i(new ya.m(cVar, j, j7, t0Var.f20431d), q0Var.f20407g, iOException, true);
        this.loadErrorHandlingPolicy.getClass();
        onUtcTimestampResolutionError(iOException);
        return n0.f20391x;
    }

    @Override // ya.a
    public void prepareSourceInternal(u0 u0Var) {
        this.mediaTransferListener = u0Var;
        this.drmSessionManager.prepare();
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.a();
        this.loader = new n0("DashMediaSource");
        this.handler = v.l(null);
        startLoadingManifest();
    }

    @Override // ya.x
    public void releasePeriod(t tVar) {
        d dVar = (d) tVar;
        r rVar = dVar.I;
        rVar.f2570y = true;
        rVar.f2566d.removeCallbacksAndMessages(null);
        for (ab.j jVar : dVar.N) {
            jVar.z(dVar);
        }
        dVar.M = null;
        this.periodsById.remove(dVar.f2511a);
    }

    @Override // ya.a
    public void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        n0 n0Var = this.loader;
        if (n0Var != null) {
            n0Var.e(null);
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifest = this.sideloadedManifest ? this.manifest : null;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.firstPeriodId = 0;
        this.periodsById.clear();
        bb.a aVar = this.baseUrlExclusionList;
        aVar.f2500a.clear();
        aVar.f2501b.clear();
        aVar.f2502c.clear();
        this.drmSessionManager.release();
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    private DashMediaSource(com.google.android.exoplayer2.n0 n0Var, c cVar, m mVar, p0 p0Var, b bVar, h hVar, ba.h hVar2, f0 f0Var, long j) {
        this.mediaItem = n0Var;
        this.liveConfiguration = n0Var.f4337c;
        m0 m0Var = n0Var.f4336b;
        m0Var.getClass();
        Uri uri = m0Var.f4234a;
        this.manifestUri = uri;
        this.initialManifestUri = uri;
        this.manifest = cVar;
        this.manifestDataSourceFactory = mVar;
        this.manifestParser = p0Var;
        this.chunkSourceFactory = bVar;
        this.drmSessionManager = hVar2;
        this.loadErrorHandlingPolicy = f0Var;
        this.fallbackTargetLiveOffsetMs = j;
        this.compositeSequenceableLoaderFactory = hVar;
        this.baseUrlExclusionList = new bb.a();
        boolean z10 = cVar != null;
        this.sideloadedManifest = z10;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new g(this);
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        if (z10) {
            qb.b.j(true ^ cVar.f3537d);
            this.manifestCallback = null;
            this.refreshManifestRunnable = null;
            this.simulateManifestRefreshRunnable = null;
            this.manifestLoadErrorThrower = new e();
            return;
        }
        this.manifestCallback = new j(this);
        this.manifestLoadErrorThrower = new b9.c(6, this);
        final int i10 = 0;
        this.refreshManifestRunnable = new Runnable(this) { // from class: bb.e

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ DashMediaSource f2518d;

            {
                this.f2518d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f2518d.startLoadingManifest();
                        break;
                    default:
                        this.f2518d.lambda$new$0();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.simulateManifestRefreshRunnable = new Runnable(this) { // from class: bb.e

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ DashMediaSource f2518d;

            {
                this.f2518d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f2518d.startLoadingManifest();
                        break;
                    default:
                        this.f2518d.lambda$new$0();
                        break;
                }
            }
        };
    }
}
