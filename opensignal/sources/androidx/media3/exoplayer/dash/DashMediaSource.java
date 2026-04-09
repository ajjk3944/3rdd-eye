package androidx.media3.exoplayer.dash;

import a5.d0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.a1;
import androidx.media3.common.c0;
import androidx.media3.common.g0;
import androidx.media3.common.k0;
import androidx.media3.common.v;
import androidx.media3.common.x;
import androidx.media3.common.z;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import b5.a0;
import b5.b0;
import b5.g;
import b5.h;
import b9.e;
import bb.r;
import g5.b;
import g5.d;
import g5.f;
import g5.i;
import g5.m;
import h5.c;
import h5.l;
import h5.u;
import i5.j;
import io.sentry.t;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o5.a;
import o5.e0;
import o5.k;
import o5.y;
import oe.f0;
import oe.h0;
import oe.u0;
import r5.n;
import r5.o;
import r5.p;
import r5.q;

/* loaded from: classes.dex */
public final class DashMediaSource extends a {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;

    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final g5.a baseUrlExclusionList;
    private final b chunkSourceFactory;
    private final k compositeSequenceableLoaderFactory;
    private h dataSource;
    private final j drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private z liveConfiguration;
    private final r5.h loadErrorHandlingPolicy;
    private n loader;
    private c manifest;
    private final i manifestCallback;
    private final g manifestDataSourceFactory;
    private final e0 manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final o manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final p manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    private final androidx.media3.common.e0 mediaItem;
    private b0 mediaTransferListener;
    private final SparseArray<d> periodsById;
    private final m playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    public static final class Factory implements y {
        private final b chunkSourceFactory;
        private k compositeSequenceableLoaderFactory;
        private i5.k drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private r5.h loadErrorHandlingPolicy;
        private final g manifestDataSourceFactory;
        private p manifestParser;

        public Factory(g gVar) {
            this(new e(26, gVar), gVar);
        }

        public DashMediaSource createMediaSource(c cVar) {
            v vVar = new v();
            f0 f0Var = h0.f19336d;
            u0 u0Var = u0.f19383x;
            List list = Collections.EMPTY_LIST;
            u0 u0Var2 = u0.f19383x;
            c0 c0Var = c0.f1577g;
            Uri uri = Uri.EMPTY;
            return createMediaSource(cVar, new androidx.media3.common.e0("DashMediaSource", new x(vVar), uri != null ? new androidx.media3.common.b0(uri, "application/dash+xml", null, list, u0Var2) : null, new z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), g0.f1655e0, c0Var));
        }

        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory setCompositeSequenceableLoaderFactory(k kVar) {
            a5.a.h(kVar, "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.compositeSequenceableLoaderFactory = kVar;
            return this;
        }

        public Factory setFallbackTargetLiveOffsetMs(long j) {
            this.fallbackTargetLiveOffsetMs = j;
            return this;
        }

        public Factory setManifestParser(p pVar) {
            this.manifestParser = pVar;
            return this;
        }

        public Factory(b bVar, g gVar) {
            bVar.getClass();
            this.chunkSourceFactory = bVar;
            this.manifestDataSourceFactory = gVar;
            this.drmSessionManagerProvider = new i5.c();
            this.loadErrorHandlingPolicy = new df.c();
            this.fallbackTargetLiveOffsetMs = 30000L;
            this.compositeSequenceableLoaderFactory = new et.d();
        }

        /* renamed from: setDrmSessionManagerProvider, reason: merged with bridge method [inline-methods] */
        public Factory m2setDrmSessionManagerProvider(i5.k kVar) {
            a5.a.h(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.drmSessionManagerProvider = kVar;
            return this;
        }

        /* renamed from: setLoadErrorHandlingPolicy, reason: merged with bridge method [inline-methods] */
        public Factory m3setLoadErrorHandlingPolicy(r5.h hVar) {
            a5.a.h(hVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.loadErrorHandlingPolicy = hVar;
            return this;
        }

        public DashMediaSource createMediaSource(c cVar, androidx.media3.common.e0 e0Var) {
            a5.a.e(!cVar.f9911d);
            al.c cVarA = e0Var.a();
            cVarA.f822d = "application/dash+xml";
            if (e0Var.f1608d == null) {
                cVarA.f821c = Uri.EMPTY;
            }
            androidx.media3.common.e0 e0VarD = cVarA.d();
            return new DashMediaSource(e0VarD, cVar, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, ((i5.c) this.drmSessionManagerProvider).c(e0VarD), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, null);
        }

        @Override // o5.y
        public DashMediaSource createMediaSource(androidx.media3.common.e0 e0Var) {
            e0Var.f1608d.getClass();
            p dashManifestParser = this.manifestParser;
            if (dashManifestParser == null) {
                dashManifestParser = new DashManifestParser();
            }
            List list = e0Var.f1608d.f1562c;
            return new DashMediaSource(e0Var, null, this.manifestDataSourceFactory, !list.isEmpty() ? new t(dashManifestParser, list) : dashManifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, ((i5.c) this.drmSessionManagerProvider).c(e0Var), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, null);
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer.dash");
    }

    public /* synthetic */ DashMediaSource(androidx.media3.common.e0 e0Var, c cVar, g gVar, p pVar, b bVar, k kVar, j jVar, r5.h hVar, long j, f fVar) {
        this(e0Var, cVar, gVar, pVar, bVar, kVar, jVar, hVar, j);
    }

    private static long getAvailableEndTimeInManifestUs(h5.g gVar, long j, long j7) {
        long j10 = gVar.f9933b;
        List list = gVar.f9934c;
        long jG = d0.G(j10);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < list.size(); i10++) {
            h5.a aVar = (h5.a) list.get(i10);
            List list2 = aVar.f9900c;
            int i11 = aVar.f9899b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z10) && !list2.isEmpty()) {
                DashSegmentIndex dashSegmentIndexB = ((l) list2.get(0)).b();
                if (dashSegmentIndexB == null) {
                    return jG + j;
                }
                long availableSegmentCount = dashSegmentIndexB.getAvailableSegmentCount(j, j7);
                if (availableSegmentCount == 0) {
                    return jG;
                }
                long firstAvailableSegmentNum = (dashSegmentIndexB.getFirstAvailableSegmentNum(j, j7) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, dashSegmentIndexB.getDurationUs(firstAvailableSegmentNum, j) + dashSegmentIndexB.getTimeUs(firstAvailableSegmentNum) + jG);
            }
        }
        return jMin;
    }

    private static long getAvailableStartTimeInManifestUs(h5.g gVar, long j, long j7) {
        long j10 = gVar.f9933b;
        List list = gVar.f9934c;
        long jG = d0.G(j10);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(gVar);
        long jMax = jG;
        for (int i10 = 0; i10 < list.size(); i10++) {
            h5.a aVar = (h5.a) list.get(i10);
            List list2 = aVar.f9900c;
            int i11 = aVar.f9899b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z10) && !list2.isEmpty()) {
                DashSegmentIndex dashSegmentIndexB = ((l) list2.get(0)).b();
                if (dashSegmentIndexB == null || dashSegmentIndexB.getAvailableSegmentCount(j, j7) == 0) {
                    return jG;
                }
                jMax = Math.max(jMax, dashSegmentIndexB.getTimeUs(dashSegmentIndexB.getFirstAvailableSegmentNum(j, j7)) + jG);
            }
        }
        return jMax;
    }

    private static long getIntervalUntilNextManifestRefreshMs(c cVar, long j) {
        DashSegmentIndex dashSegmentIndexB;
        int size = cVar.f9918m.size() - 1;
        h5.g gVarB = cVar.b(size);
        long j7 = gVarB.f9933b;
        List list = gVarB.f9934c;
        long jG = d0.G(j7);
        long jD = cVar.d(size);
        long jG2 = d0.G(j);
        long jG3 = d0.G(cVar.f9908a);
        long jG4 = d0.G(DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS);
        for (int i10 = 0; i10 < list.size(); i10++) {
            List list2 = ((h5.a) list.get(i10)).f9900c;
            if (!list2.isEmpty() && (dashSegmentIndexB = ((l) list2.get(0)).b()) != null) {
                long nextSegmentAvailableTimeUs = (dashSegmentIndexB.getNextSegmentAvailableTimeUs(jD, jG2) + (jG3 + jG)) - jG2;
                if (nextSegmentAvailableTimeUs < jG4 - 100000 || (nextSegmentAvailableTimeUs > jG4 && nextSegmentAvailableTimeUs < 100000 + jG4)) {
                    jG4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        return kc.f.s(jG4);
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private static boolean hasVideoOrAudioAdaptationSets(h5.g gVar) {
        for (int i10 = 0; i10 < gVar.f9934c.size(); i10++) {
            int i11 = ((h5.a) gVar.f9934c.get(i10)).f9899b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIndexExplicit(h5.g gVar) {
        for (int i10 = 0; i10 < gVar.f9934c.size(); i10++) {
            DashSegmentIndex dashSegmentIndexB = ((l) ((h5.a) gVar.f9934c.get(i10)).f9900c.get(0)).b();
            if (dashSegmentIndexB == null || dashSegmentIndexB.isExplicit()) {
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
        n nVar = this.loader;
        f fVar = new f(this);
        synchronized (androidx.media3.exoplayer.util.c.f1938b) {
            z10 = androidx.media3.exoplayer.util.c.f1939c;
        }
        if (z10) {
            fVar.a();
            return;
        }
        if (nVar == null) {
            nVar = new n("SntpClient");
        }
        nVar.f(new ee.f(2), new b9.c(5, fVar), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(IOException iOException) {
        a5.a.n("DashMediaSource", "Failed to resolve time offset.", iOException);
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
    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.media3.exoplayer.trackselection.TrackSelection, androidx.media3.exoplayer.trackselection.v] */
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
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < ((c) rVar.F).f9915h) {
                        it.remove();
                    }
                }
                p5.i[] iVarArr = dVarValueAt.N;
                if (iVarArr != null) {
                    int length = iVarArr.length;
                    for (?? r10 = z12; r10 < length; r10++) {
                        bb.m mVar = iVarArr[r10].f20279x;
                        bb.k[] kVarArr = (bb.k[]) mVar.k;
                        try {
                            mVar.f2550m = cVar;
                            mVar.f2544e = i11;
                            long jD = cVar.d(i11);
                            ArrayList arrayListA = mVar.a();
                            for (?? r15 = z12; r15 < kVarArr.length; r15++) {
                                try {
                                    kVarArr[r15] = kVarArr[r15].b(jD, (l) arrayListA.get(((androidx.media3.exoplayer.trackselection.v) mVar.f2549l).getIndexInTrackGroup(r15)));
                                } catch (o5.b e4) {
                                    e = e4;
                                    mVar.f2551n = e;
                                    z12 = false;
                                }
                            }
                        } catch (o5.b e10) {
                            e = e10;
                        }
                        z12 = false;
                    }
                    z11 = true;
                    dVarValueAt.M.r(dVarValueAt);
                } else {
                    z11 = true;
                }
                dVarValueAt.S = cVar.b(i11).f9935d;
                for (g5.k kVar : dVarValueAt.O) {
                    Iterator it2 = dVarValueAt.S.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            h5.f fVar = (h5.f) it2.next();
                            if (fVar.a().equals(kVar.f9365x.a())) {
                                kVar.c(fVar, (cVar.f9911d && i11 == cVar.f9918m.size() + (-1)) ? z11 : false);
                            }
                        }
                    }
                }
            }
            i10++;
            z12 = false;
        }
        h5.g gVarB = this.manifest.b(0);
        int size = this.manifest.f9918m.size() - 1;
        h5.g gVarB2 = this.manifest.b(size);
        long jD2 = this.manifest.d(size);
        long jG = d0.G(d0.u(this.elapsedRealtimeOffsetMs));
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(gVarB, this.manifest.d(0), jG);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(gVarB2, jD2, jG);
        boolean z13 = this.manifest.f9911d && !isIndexExplicit(gVarB2);
        if (z13) {
            long j11 = this.manifest.f9913f;
            if (j11 != -9223372036854775807L) {
                availableStartTimeInManifestUs = Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - d0.G(j11));
            }
        }
        long j12 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        c cVar2 = this.manifest;
        long j13 = availableStartTimeInManifestUs;
        if (cVar2.f9911d) {
            a5.a.i(cVar2.f9908a != -9223372036854775807L);
            long jG2 = (jG - d0.G(this.manifest.f9908a)) - j13;
            updateLiveConfiguration(jG2, j12);
            long jP = d0.P(j13) + this.manifest.f9908a;
            long jG3 = jG2 - d0.G(this.liveConfiguration.f1834a);
            j = -9223372036854775807L;
            long jMin = Math.min(MIN_LIVE_DEFAULT_START_POSITION_US, j12 / 2);
            j7 = jG3 < jMin ? jMin : jG3;
            j10 = jP;
        } else {
            j = -9223372036854775807L;
            j7 = 0;
            j10 = -9223372036854775807L;
        }
        long jG4 = j13 - d0.G(gVarB.f9933b);
        c cVar3 = this.manifest;
        refreshSourceInfo(new g5.g(cVar3.f9908a, j10, this.elapsedRealtimeOffsetMs, this.firstPeriodId, jG4, j12, j7, cVar3, this.mediaItem, cVar3.f9911d ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z13) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, getIntervalUntilNextManifestRefreshMs(this.manifest, d0.u(this.elapsedRealtimeOffsetMs)));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z10) {
            c cVar4 = this.manifest;
            if (cVar4.f9911d) {
                long j14 = cVar4.f9912e;
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
        String str = uVar.f9975a;
        if (d0.a(str, "urn:mpeg:dash:utc:direct:2014") || d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(uVar);
            return;
        }
        if (d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(uVar, new g5.h());
            return;
        }
        if (d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(uVar, new io.sentry.hints.i(8));
        } else if (d0.a(str, "urn:mpeg:dash:utc:ntp:2014") || d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(u uVar) {
        try {
            onUtcTimestampResolved(d0.J(uVar.f9976b) - this.manifestLoadEndTimestampMs);
        } catch (k0 e4) {
            onUtcTimestampResolutionError(e4);
        }
    }

    private void resolveUtcTimingElementHttp(u uVar, p pVar) {
        startLoading(new q(this.dataSource, Uri.parse(uVar.f9976b), 5, pVar), new b9.c(23, this), 1);
    }

    private void scheduleManifestRefresh(long j) {
        this.handler.postDelayed(this.refreshManifestRunnable, j);
    }

    private <T> void startLoading(q qVar, r5.i iVar, int i10) {
        long jF = this.loader.f(qVar, iVar, i10);
        e0 e0Var = this.manifestEventDispatcher;
        long j = qVar.f21253a;
        e0Var.k(new o5.q(qVar.f21254d, jF), qVar.f21255g, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
        startLoading(new q(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, ((df.c) this.loadErrorHandlingPolicy).u(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateLiveConfiguration(long r21, long r23) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.updateLiveConfiguration(long, long):void");
    }

    @Override // o5.b0
    public o5.x createPeriod(o5.z zVar, r5.b bVar, long j) {
        int iIntValue = ((Integer) zVar.f1689a).intValue() - this.firstPeriodId;
        e0 e0VarCreateEventDispatcher = createEventDispatcher(zVar, this.manifest.b(iIntValue).f9933b);
        i5.f fVarCreateDrmEventDispatcher = createDrmEventDispatcher(zVar);
        int i10 = this.firstPeriodId + iIntValue;
        d dVar = new d(i10, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.drmSessionManager, fVarCreateDrmEventDispatcher, this.loadErrorHandlingPolicy, e0VarCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, bVar, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback, getPlayerId());
        this.periodsById.put(i10, dVar);
        return dVar;
    }

    @Override // o5.b0
    public /* bridge */ /* synthetic */ a1 getInitialTimeline() {
        return null;
    }

    @Override // o5.b0
    public androidx.media3.common.e0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // o5.b0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return true;
    }

    @Override // o5.b0
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

    public void onLoadCanceled(q qVar, long j, long j7) {
        long j10 = qVar.f21253a;
        b5.k kVar = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar, j, j7, a0Var.f2420d);
        this.loadErrorHandlingPolicy.getClass();
        this.manifestEventDispatcher.d(qVar2, qVar.f21255g, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void onManifestLoadCompleted(q qVar, long j, long j7) {
        long j10 = qVar.f21253a;
        b5.k kVar = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar, j, j7, a0Var.f2420d);
        this.loadErrorHandlingPolicy.getClass();
        this.manifestEventDispatcher.f(qVar2, qVar.f21255g, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        c cVar = (c) qVar.f21258y;
        c cVar2 = this.manifest;
        int size = cVar2 == null ? 0 : cVar2.f9918m.size();
        long j11 = cVar.b(0).f9933b;
        int i10 = 0;
        while (i10 < size && this.manifest.b(i10).f9933b < j11) {
            i10++;
        }
        if (cVar.f9911d) {
            if (size - i10 > cVar.f9918m.size()) {
                a5.a.B("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j12 = this.expiredManifestPublishTimeUs;
                if (j12 == -9223372036854775807L || cVar.f9915h * 1000 > j12) {
                    this.staleManifestReloadAttempt = 0;
                } else {
                    a5.a.B("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f9915h + ", " + this.expiredManifestPublishTimeUs);
                }
            }
            int i11 = this.staleManifestReloadAttempt;
            this.staleManifestReloadAttempt = i11 + 1;
            if (i11 < ((df.c) this.loadErrorHandlingPolicy).u(qVar.f21255g)) {
                scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                return;
            } else {
                this.manifestFatalError = new androidx.datastore.preferences.protobuf.m();
                return;
            }
        }
        this.manifest = cVar;
        this.manifestLoadPending = cVar.f9911d & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j - j7;
        this.manifestLoadEndTimestampMs = j;
        synchronized (this.manifestUriLock) {
            try {
                if (qVar.f21254d.f2443a == this.manifestUri) {
                    Uri uri2 = this.manifest.k;
                    if (uri2 == null) {
                        uri2 = qVar.f21256r.f2421g;
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
        c cVar3 = this.manifest;
        if (!cVar3.f9911d) {
            processManifest(true);
            return;
        }
        u uVar = cVar3.f9916i;
        if (uVar != null) {
            resolveUtcTimingElement(uVar);
        } else {
            loadNtpTimeOffset();
        }
    }

    public r5.j onManifestLoadError(q qVar, long j, long j7, IOException iOException, int i10) {
        long jMin;
        long j10 = qVar.f21253a;
        b5.k kVar = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar, j, j7, a0Var.f2420d);
        int i11 = qVar.f21255g;
        ((df.c) this.loadErrorHandlingPolicy).getClass();
        if ((iOException instanceof k0) || (iOException instanceof FileNotFoundException) || (iOException instanceof b5.t) || (iOException instanceof r5.m)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = b5.i.f2434d;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof b5.i) && ((b5.i) cause).f2435a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        r5.j jVar = jMin == -9223372036854775807L ? n.f21249y : new r5.j(0, jMin);
        boolean zA = jVar.a();
        this.manifestEventDispatcher.i(qVar2, i11, iOException, !zA);
        if (!zA) {
            this.loadErrorHandlingPolicy.getClass();
        }
        return jVar;
    }

    public void onUtcTimestampLoadCompleted(q qVar, long j, long j7) {
        long j10 = qVar.f21253a;
        b5.k kVar = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar, j, j7, a0Var.f2420d);
        this.loadErrorHandlingPolicy.getClass();
        this.manifestEventDispatcher.f(qVar2, qVar.f21255g, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        onUtcTimestampResolved(((Long) qVar.f21258y).longValue() - j);
    }

    public r5.j onUtcTimestampLoadError(q qVar, long j, long j7, IOException iOException) {
        e0 e0Var = this.manifestEventDispatcher;
        long j10 = qVar.f21253a;
        b5.k kVar = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        e0Var.i(new o5.q(kVar, j, j7, a0Var.f2420d), qVar.f21255g, iOException, true);
        this.loadErrorHandlingPolicy.getClass();
        onUtcTimestampResolutionError(iOException);
        return n.f21248x;
    }

    @Override // o5.a
    public void prepareSourceInternal(b0 b0Var) {
        this.mediaTransferListener = b0Var;
        this.drmSessionManager.a(Looper.myLooper(), getPlayerId());
        this.drmSessionManager.prepare();
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.a();
        this.loader = new n("DashMediaSource");
        this.handler = d0.k(null);
        startLoadingManifest();
    }

    @Override // o5.b0
    public void releasePeriod(o5.x xVar) {
        d dVar = (d) xVar;
        r rVar = dVar.I;
        rVar.f2570y = true;
        rVar.f2566d.removeCallbacksAndMessages(null);
        for (p5.i iVar : dVar.N) {
            iVar.z(dVar);
        }
        dVar.M = null;
        this.periodsById.remove(dVar.f9344a);
    }

    @Override // o5.a
    public void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        n nVar = this.loader;
        if (nVar != null) {
            nVar.e(null);
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
        g5.a aVar = this.baseUrlExclusionList;
        aVar.f9333a.clear();
        aVar.f9334b.clear();
        aVar.f9335c.clear();
        this.drmSessionManager.release();
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    private DashMediaSource(androidx.media3.common.e0 e0Var, c cVar, g gVar, p pVar, b bVar, k kVar, j jVar, r5.h hVar, long j) {
        this.mediaItem = e0Var;
        this.liveConfiguration = e0Var.f1609g;
        androidx.media3.common.b0 b0Var = e0Var.f1608d;
        b0Var.getClass();
        Uri uri = b0Var.f1560a;
        this.manifestUri = uri;
        this.initialManifestUri = uri;
        this.manifest = cVar;
        this.manifestDataSourceFactory = gVar;
        this.manifestParser = pVar;
        this.chunkSourceFactory = bVar;
        this.drmSessionManager = jVar;
        this.loadErrorHandlingPolicy = hVar;
        this.fallbackTargetLiveOffsetMs = j;
        this.compositeSequenceableLoaderFactory = kVar;
        this.baseUrlExclusionList = new g5.a();
        boolean z10 = cVar != null;
        this.sideloadedManifest = z10;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new e(25, this);
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        if (z10) {
            a5.a.i(true ^ cVar.f9911d);
            this.manifestCallback = null;
            this.refreshManifestRunnable = null;
            this.simulateManifestRefreshRunnable = null;
            this.manifestLoadErrorThrower = new ee.f(23);
            return;
        }
        this.manifestCallback = new i(this);
        this.manifestLoadErrorThrower = new a2.g(this);
        final int i10 = 0;
        this.refreshManifestRunnable = new Runnable(this) { // from class: g5.e

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ DashMediaSource f9351d;

            {
                this.f9351d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f9351d.startLoadingManifest();
                        break;
                    default:
                        this.f9351d.lambda$new$0();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.simulateManifestRefreshRunnable = new Runnable(this) { // from class: g5.e

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ DashMediaSource f9351d;

            {
                this.f9351d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f9351d.startLoadingManifest();
                        break;
                    default:
                        this.f9351d.lambda$new$0();
                        break;
                }
            }
        };
    }
}
