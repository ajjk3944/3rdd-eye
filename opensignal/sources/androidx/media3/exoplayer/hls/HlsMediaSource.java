package androidx.media3.exoplayer.hls;

import a5.d0;
import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.a0;
import androidx.media3.common.a1;
import androidx.media3.common.e0;
import androidx.media3.common.z;
import b5.b0;
import b5.g;
import et.d;
import i.g0;
import i4.b;
import i5.c;
import i5.j;
import io.sentry.android.core.u0;
import j5.h;
import j5.i;
import j5.m;
import j5.r;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k5.e;
import k5.l;
import k5.p;
import k5.q;
import k5.s;
import k5.t;
import o5.c1;
import o5.k;
import o5.x;
import o5.y;
import oe.h0;
import r5.n;
import sm.f;

/* loaded from: classes.dex */
public final class HlsMediaSource extends o5.a implements s {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;
    private final k compositeSequenceableLoaderFactory;
    private final h dataSourceFactory;
    private final j drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final i extractorFactory;
    private z liveConfiguration;
    private final r5.h loadErrorHandlingPolicy;
    private final a0 localConfiguration;
    private final e0 mediaItem;
    private b0 mediaTransferListener;
    private final int metadataType;
    private final t playlistTracker;
    private final boolean useSessionKeys;

    public static final class Factory implements y {
        private boolean allowChunklessPreparation;
        private k compositeSequenceableLoaderFactory;
        private i5.k drmSessionManagerProvider;
        private long elapsedRealTimeOffsetMs;
        private i extractorFactory;
        private final h hlsDataSourceFactory;
        private r5.h loadErrorHandlingPolicy;
        private int metadataType;
        private p playlistParserFactory;
        private q playlistTrackerFactory;
        private boolean useSessionKeys;

        public Factory(g gVar) {
            this(new g0(gVar));
        }

        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public Factory setAllowChunklessPreparation(boolean z10) {
            this.allowChunklessPreparation = z10;
            return this;
        }

        public Factory setCompositeSequenceableLoaderFactory(k kVar) {
            a5.a.h(kVar, "HlsMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.compositeSequenceableLoaderFactory = kVar;
            return this;
        }

        public Factory setElapsedRealTimeOffsetMs(long j) {
            this.elapsedRealTimeOffsetMs = j;
            return this;
        }

        public Factory setExtractorFactory(i iVar) {
            if (iVar == null) {
                iVar = i.f13287a;
            }
            this.extractorFactory = iVar;
            return this;
        }

        public Factory setMetadataType(int i10) {
            this.metadataType = i10;
            return this;
        }

        public Factory setPlaylistParserFactory(p pVar) {
            a5.a.h(pVar, "HlsMediaSource.Factory#setPlaylistParserFactory no longer handles null by instantiating a new DefaultHlsPlaylistParserFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.playlistParserFactory = pVar;
            return this;
        }

        public Factory setPlaylistTrackerFactory(q qVar) {
            a5.a.h(qVar, "HlsMediaSource.Factory#setPlaylistTrackerFactory no longer handles null by defaulting to DefaultHlsPlaylistTracker.FACTORY. Explicitly pass a reference to this instance in order to retain the old behavior.");
            this.playlistTrackerFactory = qVar;
            return this;
        }

        public Factory setUseSessionKeys(boolean z10) {
            this.useSessionKeys = z10;
            return this;
        }

        public Factory(h hVar) {
            hVar.getClass();
            this.hlsDataSourceFactory = hVar;
            this.drmSessionManagerProvider = new c();
            this.playlistParserFactory = new f(12);
            this.playlistTrackerFactory = k5.c.K;
            this.extractorFactory = i.f13287a;
            this.loadErrorHandlingPolicy = new df.c();
            this.compositeSequenceableLoaderFactory = new d();
            this.metadataType = 1;
            this.elapsedRealTimeOffsetMs = -9223372036854775807L;
            this.allowChunklessPreparation = true;
        }

        @Override // o5.y
        public HlsMediaSource createMediaSource(e0 e0Var) {
            e0Var.f1608d.getClass();
            p bVar = this.playlistParserFactory;
            List list = e0Var.f1608d.f1562c;
            if (!list.isEmpty()) {
                bVar = new b(bVar, list);
            }
            h hVar = this.hlsDataSourceFactory;
            i iVar = this.extractorFactory;
            k kVar = this.compositeSequenceableLoaderFactory;
            j jVarC = ((c) this.drmSessionManagerProvider).c(e0Var);
            r5.h hVar2 = this.loadErrorHandlingPolicy;
            q qVar = this.playlistTrackerFactory;
            h hVar3 = this.hlsDataSourceFactory;
            ((u0) qVar).getClass();
            return new HlsMediaSource(e0Var, hVar, iVar, kVar, jVarC, hVar2, new k5.c(hVar3, hVar2, bVar), this.elapsedRealTimeOffsetMs, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys);
        }

        /* renamed from: setDrmSessionManagerProvider, reason: merged with bridge method [inline-methods] */
        public Factory m4setDrmSessionManagerProvider(i5.k kVar) {
            a5.a.h(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.drmSessionManagerProvider = kVar;
            return this;
        }

        /* renamed from: setLoadErrorHandlingPolicy, reason: merged with bridge method [inline-methods] */
        public Factory m5setLoadErrorHandlingPolicy(r5.h hVar) {
            a5.a.h(hVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.loadErrorHandlingPolicy = hVar;
            return this;
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer.hls");
    }

    private c1 createTimelineForLive(k5.i iVar, long j, long j7, j5.j jVar) {
        long j10 = iVar.f14067h;
        long j11 = iVar.f14078u;
        long j12 = j10 - ((k5.c) this.playlistTracker).J;
        boolean z10 = iVar.f14072o;
        long j13 = z10 ? j12 + j11 : -9223372036854775807L;
        long liveEdgeOffsetUs = getLiveEdgeOffsetUs(iVar);
        long j14 = this.liveConfiguration.f1834a;
        updateLiveConfiguration(iVar, d0.i(j14 != -9223372036854775807L ? d0.G(j14) : getTargetLiveOffsetUs(iVar, liveEdgeOffsetUs), liveEdgeOffsetUs, j11 + liveEdgeOffsetUs));
        return new c1(j, j7, j13, iVar.f14078u, j12, getLiveWindowDefaultStartPositionUs(iVar, liveEdgeOffsetUs), true, !z10, iVar.f14063d == 2 && iVar.f14065f, jVar, this.mediaItem, this.liveConfiguration);
    }

    private c1 createTimelineForOnDemand(k5.i iVar, long j, long j7, j5.j jVar) {
        long j10 = iVar.f14064e;
        h0 h0Var = iVar.f14075r;
        if (j10 == -9223372036854775807L || h0Var.isEmpty()) {
            j10 = 0;
        } else if (!iVar.f14066g && j10 != iVar.f14078u) {
            j10 = findClosestPrecedingSegment(h0Var, j10).f14061x;
        }
        long j11 = j10;
        long j12 = iVar.f14078u;
        return new c1(j, j7, j12, j12, 0L, j11, true, false, true, jVar, this.mediaItem, null);
    }

    private static e findClosestPrecedingIndependentPart(List<e> list, long j) {
        e eVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar2 = list.get(i10);
            long j7 = eVar2.f14061x;
            if (j7 > j || !eVar2.H) {
                if (j7 > j) {
                    break;
                }
            } else {
                eVar = eVar2;
            }
        }
        return eVar;
    }

    private static k5.g findClosestPrecedingSegment(List<k5.g> list, long j) {
        return list.get(d0.c(list, Long.valueOf(j), true));
    }

    private long getLiveEdgeOffsetUs(k5.i iVar) {
        if (iVar.f14073p) {
            return d0.G(d0.u(this.elapsedRealTimeOffsetMs)) - (iVar.f14067h + iVar.f14078u);
        }
        return 0L;
    }

    private long getLiveWindowDefaultStartPositionUs(k5.i iVar, long j) {
        long jG = iVar.f14064e;
        h0 h0Var = iVar.f14075r;
        if (jG == -9223372036854775807L) {
            jG = (iVar.f14078u + j) - d0.G(this.liveConfiguration.f1834a);
        }
        if (iVar.f14066g) {
            return jG;
        }
        e eVarFindClosestPrecedingIndependentPart = findClosestPrecedingIndependentPart(iVar.f14076s, jG);
        if (eVarFindClosestPrecedingIndependentPart != null) {
            return eVarFindClosestPrecedingIndependentPart.f14061x;
        }
        if (h0Var.isEmpty()) {
            return 0L;
        }
        k5.g gVarFindClosestPrecedingSegment = findClosestPrecedingSegment(h0Var, jG);
        e eVarFindClosestPrecedingIndependentPart2 = findClosestPrecedingIndependentPart(gVarFindClosestPrecedingSegment.I, jG);
        return eVarFindClosestPrecedingIndependentPart2 != null ? eVarFindClosestPrecedingIndependentPart2.f14061x : gVarFindClosestPrecedingSegment.f14061x;
    }

    private static long getTargetLiveOffsetUs(k5.i iVar, long j) {
        long j7;
        db.k kVar = iVar.f14079v;
        long j10 = iVar.f14064e;
        if (j10 != -9223372036854775807L) {
            j7 = iVar.f14078u - j10;
        } else {
            long j11 = kVar.f7238d;
            if (j11 == -9223372036854775807L || iVar.f14071n == -9223372036854775807L) {
                long j12 = kVar.f7237c;
                j7 = j12 != -9223372036854775807L ? j12 : iVar.f14070m * 3;
            } else {
                j7 = j11;
            }
        }
        return j7 + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateLiveConfiguration(k5.i r10, long r11) {
        /*
            r9 = this;
            androidx.media3.common.e0 r0 = r9.mediaItem
            androidx.media3.common.z r0 = r0.f1609g
            float r1 = r0.f1837r
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f1838x
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            db.k r10 = r10.f14079v
            long r0 = r10.f7237c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r10.f7238d
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            long r1 = a5.d0.P(r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L33
            r7 = r11
            goto L38
        L33:
            androidx.media3.common.z r12 = r9.liveConfiguration
            float r12 = r12.f1837r
            r7 = r12
        L38:
            if (r10 == 0) goto L3c
        L3a:
            r8 = r11
            goto L41
        L3c:
            androidx.media3.common.z r10 = r9.liveConfiguration
            float r11 = r10.f1838x
            goto L3a
        L41:
            androidx.media3.common.z r0 = new androidx.media3.common.z
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r3
            r0.<init>(r1, r3, r5, r7, r8)
            r9.liveConfiguration = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.updateLiveConfiguration(k5.i, long):void");
    }

    @Override // o5.b0
    public x createPeriod(o5.z zVar, r5.b bVar, long j) {
        o5.e0 e0VarCreateEventDispatcher = createEventDispatcher(zVar);
        return new m(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, this.drmSessionManager, createDrmEventDispatcher(zVar), this.loadErrorHandlingPolicy, e0VarCreateEventDispatcher, bVar, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, getPlayerId());
    }

    @Override // o5.b0
    public /* bridge */ /* synthetic */ a1 getInitialTimeline() {
        return null;
    }

    @Override // o5.b0
    public e0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // o5.b0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return true;
    }

    @Override // o5.b0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        k5.c cVar = (k5.c) this.playlistTracker;
        n nVar = cVar.B;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = cVar.G;
        if (uri != null) {
            k5.b bVar = (k5.b) cVar.f14051r.get(uri);
            bVar.f14043d.a();
            IOException iOException = bVar.F;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // k5.s
    public void onPrimaryPlaylistRefreshed(k5.i iVar) {
        long j;
        long j7;
        c1 c1VarCreateTimelineForOnDemand;
        HlsMediaSource hlsMediaSource = this;
        long jP = iVar.f14073p ? d0.P(iVar.f14067h) : -9223372036854775807L;
        int i10 = iVar.f14063d;
        if (i10 == 2 || i10 == 1) {
            j = jP;
            j7 = j;
        } else {
            j = -9223372036854775807L;
            j7 = jP;
        }
        l lVar = ((k5.c) hlsMediaSource.playlistTracker).F;
        lVar.getClass();
        j5.j jVar = new j5.j();
        new k5.d(lVar.f14098a, lVar.f14099b, lVar.f14091e, lVar.f14092f, lVar.f14093g, lVar.f14094h, lVar.f14095i, lVar.j, lVar.k, lVar.f14100c, lVar.f14096l, lVar.f14097m);
        if (((k5.c) hlsMediaSource.playlistTracker).I) {
            c1VarCreateTimelineForOnDemand = hlsMediaSource.createTimelineForLive(iVar, j, j7, jVar);
            hlsMediaSource = this;
        } else {
            c1VarCreateTimelineForOnDemand = hlsMediaSource.createTimelineForOnDemand(iVar, j, j7, jVar);
        }
        hlsMediaSource.refreshSourceInfo(c1VarCreateTimelineForOnDemand);
    }

    @Override // o5.a
    public void prepareSourceInternal(b0 b0Var) {
        this.mediaTransferListener = b0Var;
        j jVar = this.drmSessionManager;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        jVar.a(looperMyLooper, getPlayerId());
        this.drmSessionManager.prepare();
        o5.e0 e0VarCreateEventDispatcher = createEventDispatcher(null);
        t tVar = this.playlistTracker;
        Uri uri = this.localConfiguration.f1560a;
        k5.c cVar = (k5.c) tVar;
        cVar.getClass();
        cVar.D = d0.k(null);
        cVar.f14053y = e0VarCreateEventDispatcher;
        cVar.E = this;
        r5.q qVar = new r5.q(((g) ((g0) cVar.f14048a).f11051a).a(), uri, 4, cVar.f14049d.g());
        a5.a.i(cVar.B == null);
        n nVar = new n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.B = nVar;
        df.c cVar2 = (df.c) cVar.f14050g;
        int i10 = qVar.f21255g;
        e0VarCreateEventDispatcher.k(new o5.q(qVar.f21254d, nVar.f(qVar, cVar, cVar2.u(i10))), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // o5.b0
    public void releasePeriod(x xVar) {
        m mVar = (m) xVar;
        ((k5.c) mVar.f13298d).f14052x.remove(mVar);
        for (j5.s sVar : mVar.Q) {
            if (sVar.Z) {
                for (r rVar : sVar.R) {
                    rVar.g();
                    h7.h0 h0Var = rVar.f19085h;
                    if (h0Var != null) {
                        h0Var.U(rVar.f19082e);
                        rVar.f19085h = null;
                        rVar.f19084g = null;
                    }
                }
            }
            sVar.F.e(sVar);
            sVar.N.removeCallbacksAndMessages(null);
            sVar.f13321d0 = true;
            sVar.O.clear();
        }
        mVar.N = null;
    }

    @Override // o5.a
    public void releaseSourceInternal() {
        k5.c cVar = (k5.c) this.playlistTracker;
        cVar.G = null;
        cVar.H = null;
        cVar.F = null;
        cVar.J = -9223372036854775807L;
        cVar.B.e(null);
        cVar.B = null;
        HashMap map = cVar.f14051r;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((k5.b) it.next()).f14043d.e(null);
        }
        cVar.D.removeCallbacksAndMessages(null);
        cVar.D = null;
        map.clear();
        this.drmSessionManager.release();
    }

    private HlsMediaSource(e0 e0Var, h hVar, i iVar, k kVar, j jVar, r5.h hVar2, t tVar, long j, boolean z10, int i10, boolean z11) {
        androidx.media3.common.b0 b0Var = e0Var.f1608d;
        b0Var.getClass();
        this.localConfiguration = b0Var;
        this.mediaItem = e0Var;
        this.liveConfiguration = e0Var.f1609g;
        this.dataSourceFactory = hVar;
        this.extractorFactory = iVar;
        this.compositeSequenceableLoaderFactory = kVar;
        this.drmSessionManager = jVar;
        this.loadErrorHandlingPolicy = hVar2;
        this.playlistTracker = tVar;
        this.elapsedRealTimeOffsetMs = j;
        this.allowChunklessPreparation = z10;
        this.metadataType = i10;
        this.useSessionKeys = z11;
    }
}
