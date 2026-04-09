package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.w1;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oe.h0;
import pb.f0;
import pb.q0;
import pb.u0;
import pb.z;
import ya.a0;
import ya.c0;
import ya.w0;

/* loaded from: classes.dex */
public final class HlsMediaSource extends ya.a implements db.t {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;
    private final ya.h compositeSequenceableLoaderFactory;
    private final j dataSourceFactory;
    private final ba.h drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final k extractorFactory;
    private l0 liveConfiguration;
    private final f0 loadErrorHandlingPolicy;
    private final n0 mediaItem;
    private u0 mediaTransferListener;
    private final int metadataType;
    private final m0 playbackProperties;
    private final db.u playlistTracker;
    private final boolean useSessionKeys;

    public static final class Factory implements c0 {
        private boolean allowChunklessPreparation;
        private ya.h compositeSequenceableLoaderFactory;
        private ba.i drmSessionManagerProvider;
        private long elapsedRealTimeOffsetMs;
        private k extractorFactory;
        private final j hlsDataSourceFactory;
        private f0 loadErrorHandlingPolicy;
        private int metadataType;
        private db.q playlistParserFactory;
        private db.r playlistTrackerFactory;
        private List<StreamKey> streamKeys;
        private Object tag;
        private boolean useSessionKeys;
        private boolean usingCustomDrmSessionManagerProvider;

        public Factory(pb.m mVar) {
            this(new b9.e(9, mVar));
        }

        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public Factory setAllowChunklessPreparation(boolean z10) {
            this.allowChunklessPreparation = z10;
            return this;
        }

        public Factory setCompositeSequenceableLoaderFactory(ya.h hVar) {
            if (hVar == null) {
                hVar = new sm.m();
            }
            this.compositeSequenceableLoaderFactory = hVar;
            return this;
        }

        public Factory setElapsedRealTimeOffsetMs(long j) {
            this.elapsedRealTimeOffsetMs = j;
            return this;
        }

        public Factory setExtractorFactory(k kVar) {
            if (kVar == null) {
                kVar = k.f4489a;
            }
            this.extractorFactory = kVar;
            return this;
        }

        public Factory setMetadataType(int i10) {
            this.metadataType = i10;
            return this;
        }

        public Factory setPlaylistParserFactory(db.q qVar) {
            if (qVar == null) {
                qVar = new df.c();
            }
            this.playlistParserFactory = qVar;
            return this;
        }

        public Factory setPlaylistTrackerFactory(db.r rVar) {
            if (rVar == null) {
                rVar = db.c.K;
            }
            this.playlistTrackerFactory = rVar;
            return this;
        }

        @Deprecated
        /* renamed from: setStreamKeys, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ c0 m22setStreamKeys(List list) {
            return setStreamKeys((List<StreamKey>) list);
        }

        @Deprecated
        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Factory setUseSessionKeys(boolean z10) {
            this.useSessionKeys = z10;
            return this;
        }

        public Factory(j jVar) {
            jVar.getClass();
            this.hlsDataSourceFactory = jVar;
            this.drmSessionManagerProvider = new ba.a();
            this.playlistParserFactory = new df.c();
            this.playlistTrackerFactory = db.c.K;
            this.extractorFactory = k.f4489a;
            this.loadErrorHandlingPolicy = new sm.m();
            this.compositeSequenceableLoaderFactory = new sm.m();
            this.metadataType = 1;
            this.streamKeys = Collections.EMPTY_LIST;
            this.elapsedRealTimeOffsetMs = -9223372036854775807L;
        }

        /* renamed from: setDrmHttpDataSourceFactory, reason: merged with bridge method [inline-methods] */
        public Factory m17setDrmHttpDataSourceFactory(z zVar) {
            if (!this.usingCustomDrmSessionManagerProvider) {
                ((ba.a) this.drmSessionManagerProvider).f2483b = zVar;
            }
            return this;
        }

        /* renamed from: setDrmSessionManager, reason: merged with bridge method [inline-methods] */
        public Factory m18setDrmSessionManager(ba.h hVar) {
            if (hVar == null) {
                m19setDrmSessionManagerProvider((ba.i) null);
                return this;
            }
            m19setDrmSessionManagerProvider((ba.i) new bb.h(hVar, 1));
            return this;
        }

        /* renamed from: setDrmSessionManagerProvider, reason: merged with bridge method [inline-methods] */
        public Factory m19setDrmSessionManagerProvider(ba.i iVar) {
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
        public Factory m20setDrmUserAgent(String str) {
            if (!this.usingCustomDrmSessionManagerProvider) {
                ((ba.a) this.drmSessionManagerProvider).getClass();
            }
            return this;
        }

        /* renamed from: setLoadErrorHandlingPolicy, reason: merged with bridge method [inline-methods] */
        public Factory m21setLoadErrorHandlingPolicy(f0 f0Var) {
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

        @Deprecated
        /* renamed from: createMediaSource, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource m15createMediaSource(Uri uri) {
            List list = Collections.EMPTY_LIST;
            Map map = Collections.EMPTY_MAP;
            return m16createMediaSource(new n0("", new k0(Long.MIN_VALUE), uri != null ? new m0(uri, "application/x-mpegURL", null, null, list, list, null) : null, new l0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), p0.f4365s));
        }

        /* renamed from: createMediaSource, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource m16createMediaSource(n0 n0Var) {
            n0 n0VarA = n0Var;
            n0VarA.f4336b.getClass();
            db.q eVar = this.playlistParserFactory;
            m0 m0Var = n0VarA.f4336b;
            List list = m0Var.f4236c;
            List<StreamKey> list2 = m0Var.f4236c;
            List<StreamKey> list3 = list.isEmpty() ? this.streamKeys : list2;
            if (!list3.isEmpty()) {
                eVar = new bm.e(eVar, 15, list3);
            }
            boolean z10 = false;
            boolean z11 = m0Var.f4238e == null && this.tag != null;
            if (list2.isEmpty() && !list3.isEmpty()) {
                z10 = true;
            }
            if (z11 && z10) {
                j0 j0VarA = n0VarA.a();
                j0VarA.f4190g = this.tag;
                j0VarA.b(list3);
                n0VarA = j0VarA.a();
            } else if (z11) {
                j0 j0VarA2 = n0VarA.a();
                j0VarA2.f4190g = this.tag;
                n0VarA = j0VarA2.a();
            } else if (z10) {
                j0 j0VarA3 = n0VarA.a();
                j0VarA3.b(list3);
                n0VarA = j0VarA3.a();
            }
            n0 n0Var2 = n0VarA;
            j jVar = this.hlsDataSourceFactory;
            k kVar = this.extractorFactory;
            ya.h hVar = this.compositeSequenceableLoaderFactory;
            ba.h hVarA = this.drmSessionManagerProvider.a(n0Var2);
            f0 f0Var = this.loadErrorHandlingPolicy;
            db.r rVar = this.playlistTrackerFactory;
            j jVar2 = this.hlsDataSourceFactory;
            ((d5.v) rVar).getClass();
            return new HlsMediaSource(n0Var2, jVar, kVar, hVar, hVarA, f0Var, new db.c(jVar2, f0Var, eVar), this.elapsedRealTimeOffsetMs, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ba.h lambda$setDrmSessionManager$0(ba.h hVar, n0 n0Var) {
            return hVar;
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.hls");
    }

    private w0 createTimelineForLive(db.l lVar, long j, long j7, l lVar2) {
        long j10 = lVar.f7244h;
        long j11 = lVar.f7255u;
        long j12 = j10 - ((db.c) this.playlistTracker).J;
        boolean z10 = lVar.f7249o;
        long j13 = z10 ? j12 + j11 : -9223372036854775807L;
        long liveEdgeOffsetUs = getLiveEdgeOffsetUs(lVar);
        long j14 = this.liveConfiguration.f4228a;
        maybeUpdateLiveConfiguration(qb.v.j(j14 != -9223372036854775807L ? com.google.android.exoplayer2.h.c(j14) : getTargetLiveOffsetUs(lVar, liveEdgeOffsetUs), liveEdgeOffsetUs, j11 + liveEdgeOffsetUs));
        return new w0(j, j7, j13, lVar.f7255u, j12, getLiveWindowDefaultStartPositionUs(lVar, liveEdgeOffsetUs), true, !z10, lVar.f7240d == 2 && lVar.f7242f, lVar2, this.mediaItem, this.liveConfiguration);
    }

    private w0 createTimelineForOnDemand(db.l lVar, long j, long j7, l lVar2) {
        long j10 = lVar.f7241e;
        h0 h0Var = lVar.f7252r;
        if (j10 == -9223372036854775807L || h0Var.isEmpty()) {
            j10 = 0;
        } else if (!lVar.f7243g && j10 != lVar.f7255u) {
            j10 = findClosestPrecedingSegment(h0Var, j10).f7233x;
        }
        long j11 = j10;
        long j12 = lVar.f7255u;
        return new w0(j, j7, j12, j12, 0L, j11, true, false, true, lVar2, this.mediaItem, null);
    }

    private static db.g findClosestPrecedingIndependentPart(List<db.g> list, long j) {
        db.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            db.g gVar2 = list.get(i10);
            long j7 = gVar2.f7233x;
            if (j7 > j || !gVar2.H) {
                if (j7 > j) {
                    break;
                }
            } else {
                gVar = gVar2;
            }
        }
        return gVar;
    }

    private static db.i findClosestPrecedingSegment(List<db.i> list, long j) {
        return list.get(qb.v.c(list, Long.valueOf(j), true));
    }

    private long getLiveEdgeOffsetUs(db.l lVar) {
        if (lVar.f7250p) {
            return com.google.android.exoplayer2.h.c(qb.v.s(this.elapsedRealTimeOffsetMs)) - (lVar.f7244h + lVar.f7255u);
        }
        return 0L;
    }

    private long getLiveWindowDefaultStartPositionUs(db.l lVar, long j) {
        long jC = lVar.f7241e;
        h0 h0Var = lVar.f7252r;
        if (jC == -9223372036854775807L) {
            jC = (lVar.f7255u + j) - com.google.android.exoplayer2.h.c(this.liveConfiguration.f4228a);
        }
        if (lVar.f7243g) {
            return jC;
        }
        db.g gVarFindClosestPrecedingIndependentPart = findClosestPrecedingIndependentPart(lVar.f7253s, jC);
        if (gVarFindClosestPrecedingIndependentPart != null) {
            return gVarFindClosestPrecedingIndependentPart.f7233x;
        }
        if (h0Var.isEmpty()) {
            return 0L;
        }
        db.i iVarFindClosestPrecedingSegment = findClosestPrecedingSegment(h0Var, jC);
        db.g gVarFindClosestPrecedingIndependentPart2 = findClosestPrecedingIndependentPart(iVarFindClosestPrecedingSegment.I, jC);
        return gVarFindClosestPrecedingIndependentPart2 != null ? gVarFindClosestPrecedingIndependentPart2.f7233x : iVarFindClosestPrecedingSegment.f7233x;
    }

    private static long getTargetLiveOffsetUs(db.l lVar, long j) {
        long j7;
        db.k kVar = lVar.f7256v;
        long j10 = lVar.f7241e;
        if (j10 != -9223372036854775807L) {
            j7 = lVar.f7255u - j10;
        } else {
            long j11 = kVar.f7238d;
            if (j11 == -9223372036854775807L || lVar.f7248n == -9223372036854775807L) {
                long j12 = kVar.f7237c;
                j7 = j12 != -9223372036854775807L ? j12 : lVar.f7247m * 3;
            } else {
                j7 = j11;
            }
        }
        return j7 + j;
    }

    private void maybeUpdateLiveConfiguration(long j) {
        long jD = com.google.android.exoplayer2.h.d(j);
        if (jD != this.liveConfiguration.f4228a) {
            j0 j0VarA = this.mediaItem.a();
            j0VarA.f4192i = jD;
            this.liveConfiguration = j0VarA.a().f4337c;
        }
    }

    @Override // ya.x
    public ya.t createPeriod(ya.v vVar, pb.b bVar, long j) {
        a0 a0VarCreateEventDispatcher = createEventDispatcher(vVar);
        return new o(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, this.drmSessionManager, createDrmEventDispatcher(vVar), this.loadErrorHandlingPolicy, a0VarCreateEventDispatcher, bVar, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys);
    }

    @Override // ya.x
    public /* bridge */ /* synthetic */ w1 getInitialTimeline() {
        return null;
    }

    @Override // ya.x
    public n0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // ya.x
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return true;
    }

    @Override // ya.x
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        db.c cVar = (db.c) this.playlistTracker;
        pb.n0 n0Var = cVar.B;
        if (n0Var != null) {
            n0Var.a();
        }
        Uri uri = cVar.G;
        if (uri != null) {
            db.b bVar = (db.b) cVar.f7208r.get(uri);
            bVar.f7200d.a();
            IOException iOException = bVar.F;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // db.t
    public void onPrimaryPlaylistRefreshed(db.l lVar) {
        long jD = lVar.f7250p ? com.google.android.exoplayer2.h.d(lVar.f7244h) : -9223372036854775807L;
        int i10 = lVar.f7240d;
        long j = (i10 == 2 || i10 == 1) ? jD : -9223372036854775807L;
        ((db.c) this.playlistTracker).F.getClass();
        l lVar2 = new l();
        refreshSourceInfo(((db.c) this.playlistTracker).I ? createTimelineForLive(lVar, j, jD, lVar2) : createTimelineForOnDemand(lVar, j, jD, lVar2));
    }

    @Override // ya.a
    public void prepareSourceInternal(u0 u0Var) {
        this.mediaTransferListener = u0Var;
        this.drmSessionManager.prepare();
        a0 a0VarCreateEventDispatcher = createEventDispatcher(null);
        db.u uVar = this.playlistTracker;
        Uri uri = this.playbackProperties.f4234a;
        db.c cVar = (db.c) uVar;
        cVar.getClass();
        cVar.D = qb.v.l(null);
        cVar.f7210y = a0VarCreateEventDispatcher;
        cVar.E = this;
        q0 q0Var = new q0(((pb.m) ((b9.e) cVar.f7205a).f2481d).a(), uri, 4, cVar.f7206d.g());
        qb.b.j(cVar.B == null);
        pb.n0 n0Var = new pb.n0("DefaultHlsPlaylistTracker:MasterPlaylist");
        cVar.B = n0Var;
        sm.m mVar = (sm.m) cVar.f7207g;
        int i10 = q0Var.f20407g;
        a0VarCreateEventDispatcher.k(new ya.m(q0Var.f20406d, n0Var.f(q0Var, cVar, mVar.q(i10))), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // ya.x
    public void releasePeriod(ya.t tVar) {
        o oVar = (o) tVar;
        ((db.c) oVar.f4499d).f7209x.remove(oVar);
        for (u uVar : oVar.O) {
            if (uVar.Y) {
                for (t tVar2 : uVar.Q) {
                    tVar2.h();
                    b9.e eVar = tVar2.f26161i;
                    if (eVar != null) {
                        eVar.D(tVar2.f26157e);
                        tVar2.f26161i = null;
                        tVar2.f26160h = null;
                    }
                }
            }
            uVar.E.e(uVar);
            uVar.M.removeCallbacksAndMessages(null);
            uVar.f4520c0 = true;
            uVar.N.clear();
        }
        oVar.L = null;
    }

    @Override // ya.a
    public void releaseSourceInternal() {
        db.c cVar = (db.c) this.playlistTracker;
        cVar.G = null;
        cVar.H = null;
        cVar.F = null;
        cVar.J = -9223372036854775807L;
        cVar.B.e(null);
        cVar.B = null;
        HashMap map = cVar.f7208r;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((db.b) it.next()).f7200d.e(null);
        }
        cVar.D.removeCallbacksAndMessages(null);
        cVar.D = null;
        map.clear();
        this.drmSessionManager.release();
    }

    private HlsMediaSource(n0 n0Var, j jVar, k kVar, ya.h hVar, ba.h hVar2, f0 f0Var, db.u uVar, long j, boolean z10, int i10, boolean z11) {
        m0 m0Var = n0Var.f4336b;
        m0Var.getClass();
        this.playbackProperties = m0Var;
        this.mediaItem = n0Var;
        this.liveConfiguration = n0Var.f4337c;
        this.dataSourceFactory = jVar;
        this.extractorFactory = kVar;
        this.compositeSequenceableLoaderFactory = hVar;
        this.drmSessionManager = hVar2;
        this.loadErrorHandlingPolicy = f0Var;
        this.playlistTracker = uVar;
        this.elapsedRealTimeOffsetMs = j;
        this.allowChunklessPreparation = z10;
        this.metadataType = i10;
        this.useSessionKeys = z11;
    }
}
