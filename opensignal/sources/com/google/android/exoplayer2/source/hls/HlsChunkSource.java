package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lf.t1;
import oe.f0;
import oe.h0;
import pb.u0;

/* loaded from: classes.dex */
class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;
    private final pb.n encryptionDataSource;
    private Uri expectedPlaylistUrl;
    private final k extractorFactory;
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isTimestampMaster;
    private final pb.n mediaDataSource;
    private final List<Format> muxedCaptionFormats;
    private final Format[] playlistFormats;
    private final db.u playlistTracker;
    private final Uri[] playlistUrls;
    private boolean seenExpectedPlaylistError;
    private final w timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private ob.f trackSelection;
    private final d keyCache = new d();
    private byte[] scratchSpace = qb.v.f20833f;
    private long liveEdgeInPeriodTimeUs = -9223372036854775807L;

    public HlsChunkSource(k kVar, db.u uVar, Uri[] uriArr, Format[] formatArr, j jVar, u0 u0Var, w wVar, List<Format> list) {
        this.extractorFactory = kVar;
        this.playlistTracker = uVar;
        this.playlistUrls = uriArr;
        this.playlistFormats = formatArr;
        this.timestampAdjusterProvider = wVar;
        this.muxedCaptionFormats = list;
        b9.e eVar = (b9.e) jVar;
        pb.n nVarA = ((pb.m) eVar.f2481d).a();
        this.mediaDataSource = nVarA;
        if (u0Var != null) {
            nVarA.s(u0Var);
        }
        this.encryptionDataSource = ((pb.m) eVar.f2481d).a();
        this.trackGroup = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((formatArr[i10].f4026x & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        TrackGroup trackGroup = this.trackGroup;
        int[] iArrH = t1.H(arrayList);
        h hVar = new h(trackGroup, iArrH, 0);
        hVar.f4484h = hVar.indexOf(trackGroup.f4454d[iArrH[0]]);
        this.trackSelection = hVar;
    }

    private static Uri getFullEncryptionKeyUri(db.l lVar, db.j jVar) {
        String str;
        if (jVar == null || (str = jVar.B) == null) {
            return null;
        }
        return qb.b.G(lVar.f7257a, str);
    }

    private Pair<Long, Integer> getNextMediaSequenceAndPartIndex(m mVar, boolean z10, db.l lVar, long j, long j7) {
        boolean z11 = true;
        if (mVar != null) {
            long jA = mVar.F;
            int i10 = mVar.K;
            if (!z10) {
                if (!mVar.f4494d0) {
                    return new Pair<>(Long.valueOf(jA), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    jA = mVar.a();
                }
                return new Pair<>(Long.valueOf(jA), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j10 = lVar.f7255u;
        h0 h0Var = lVar.f7253s;
        long j11 = lVar.k;
        h0 h0Var2 = lVar.f7252r;
        long j12 = j10 + j;
        if (mVar != null && !this.independentSegments) {
            j7 = mVar.B;
        }
        if (!lVar.f7249o && j7 >= j12) {
            return new Pair<>(Long.valueOf(j11 + h0Var2.size()), -1);
        }
        long j13 = j7 - j;
        Long lValueOf = Long.valueOf(j13);
        int i11 = 0;
        if (((db.c) this.playlistTracker).I && mVar != null) {
            z11 = false;
        }
        int iC = qb.v.c(h0Var2, lValueOf, z11);
        long j14 = iC + j11;
        if (iC >= 0) {
            db.i iVar = (db.i) h0Var2.get(iC);
            h0 h0Var3 = j13 < iVar.f7233x + iVar.f7231g ? iVar.I : h0Var;
            while (true) {
                if (i11 >= h0Var3.size()) {
                    break;
                }
                db.g gVar = (db.g) h0Var3.get(i11);
                if (j13 >= gVar.f7233x + gVar.f7231g) {
                    i11++;
                } else if (gVar.H) {
                    j14 += h0Var3 == h0Var ? 1L : 0L;
                    i = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(i));
    }

    private static i getNextSegmentHolder(db.l lVar, long j, int i10) {
        long j7 = lVar.k;
        h0 h0Var = lVar.f7253s;
        int i11 = (int) (j - j7);
        h0 h0Var2 = lVar.f7252r;
        if (i11 == h0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < h0Var.size()) {
                return new i((db.j) h0Var.get(i10), j, i10);
            }
            return null;
        }
        db.i iVar = (db.i) h0Var2.get(i11);
        if (i10 == -1) {
            return new i(iVar, j, -1);
        }
        if (i10 < iVar.I.size()) {
            return new i((db.j) iVar.I.get(i10), j, i10);
        }
        int i12 = i11 + 1;
        if (i12 < h0Var2.size()) {
            return new i((db.j) h0Var2.get(i12), j + 1, -1);
        }
        if (h0Var.isEmpty()) {
            return null;
        }
        return new i((db.j) h0Var.get(0), j + 1, 0);
    }

    public static List<db.j> getSegmentBaseList(db.l lVar, long j, int i10) {
        long j7 = lVar.k;
        h0 h0Var = lVar.f7253s;
        h0 h0Var2 = lVar.f7252r;
        int i11 = (int) (j - j7);
        if (i11 < 0 || h0Var2.size() < i11) {
            f0 f0Var = h0.f19336d;
            return oe.u0.f19383x;
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < h0Var2.size()) {
            if (i10 != -1) {
                db.i iVar = (db.i) h0Var2.get(i11);
                if (i10 == 0) {
                    arrayList.add(iVar);
                } else if (i10 < iVar.I.size()) {
                    h0 h0Var3 = iVar.I;
                    arrayList.addAll(h0Var3.subList(i10, h0Var3.size()));
                }
                i11++;
            }
            arrayList.addAll(h0Var2.subList(i11, h0Var2.size()));
            i10 = 0;
        }
        if (lVar.f7248n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < h0Var.size()) {
                arrayList.addAll(h0Var.subList(i12, h0Var.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ab.f maybeCreateEncryptionChunkFor(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) this.keyCache.f4478a.remove(uri);
        if (bArr != null) {
            return null;
        }
        na.c cVar = new na.c(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        pb.n nVar = this.encryptionDataSource;
        Format format = this.playlistFormats[i10];
        int iE = this.trackSelection.e();
        Object objG = this.trackSelection.g();
        byte[] bArr2 = this.scratchSpace;
        e eVar = new e(nVar, cVar, 3, format, iE, objG, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = qb.v.f20833f;
        }
        eVar.F = bArr2;
        return eVar;
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        long j7 = this.liveEdgeInPeriodTimeUs;
        if (j7 != -9223372036854775807L) {
            return j7 - j;
        }
        return -9223372036854775807L;
    }

    private void updateLiveEdgeTimeUs(db.l lVar) {
        this.liveEdgeInPeriodTimeUs = lVar.f7249o ? -9223372036854775807L : (lVar.f7244h + lVar.f7255u) - ((db.c) this.playlistTracker).J;
    }

    public ab.n[] createMediaChunkIterators(m mVar, long j) {
        int iD = mVar == null ? -1 : this.trackGroup.d(mVar.f304r);
        int length = ((ob.c) this.trackSelection).f19230c.length;
        ab.n[] nVarArr = new ab.n[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = ((ob.c) this.trackSelection).f19230c[i10];
            Uri uri = this.playlistUrls[i11];
            if (((db.c) this.playlistTracker).c(uri)) {
                db.l lVarA = ((db.c) this.playlistTracker).a(false, uri);
                lVarA.getClass();
                long j7 = lVarA.f7244h - ((db.c) this.playlistTracker).J;
                Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(mVar, i11 != iD, lVarA, j7, j);
                nVarArr[i10] = new g(j7, getSegmentBaseList(lVarA, ((Long) nextMediaSequenceAndPartIndex.first).longValue(), ((Integer) nextMediaSequenceAndPartIndex.second).intValue()));
            } else {
                nVarArr[i10] = ab.n.f321b;
            }
        }
        return nVarArr;
    }

    public int getChunkPublicationState(m mVar) {
        int i10 = mVar.K;
        if (i10 == -1) {
            return 1;
        }
        db.l lVarA = ((db.c) this.playlistTracker).a(false, this.playlistUrls[this.trackGroup.d(mVar.f304r)]);
        lVarA.getClass();
        h0 h0Var = lVarA.f7252r;
        int i11 = (int) (mVar.F - lVarA.k);
        if (i11 < 0) {
            return 1;
        }
        h0 h0Var2 = i11 < h0Var.size() ? ((db.i) h0Var.get(i11)).I : lVarA.f7253s;
        if (i10 >= h0Var2.size()) {
            return 2;
        }
        db.g gVar = (db.g) h0Var2.get(i10);
        if (gVar.I) {
            return 0;
        }
        return qb.v.a(Uri.parse(qb.b.F(lVarA.f7257a, gVar.f7229a)), (Uri) mVar.f302d.f17422f) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getNextChunk(long r60, long r62, java.util.List<com.google.android.exoplayer2.source.hls.m> r64, boolean r65, com.google.android.exoplayer2.source.hls.f r66) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsChunkSource.getNextChunk(long, long, java.util.List, boolean, com.google.android.exoplayer2.source.hls.f):void");
    }

    public int getPreferredQueueSize(long j, List<? extends ab.m> list) {
        if (this.fatalError == null) {
            ob.f fVar = this.trackSelection;
            if (((ob.c) fVar).f19230c.length >= 2) {
                return fVar.c(j, list);
            }
        }
        return list.size();
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public ob.f getTrackSelection() {
        return this.trackSelection;
    }

    public boolean maybeExcludeTrack(ab.f fVar, long j) {
        ob.f fVar2 = this.trackSelection;
        return ((ob.c) fVar2).i(((ob.c) fVar2).indexOf(this.trackGroup.d(fVar.f304r)), j);
    }

    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.expectedPlaylistUrl;
        if (uri == null || !this.seenExpectedPlaylistError) {
            return;
        }
        db.b bVar = (db.b) ((db.c) this.playlistTracker).f7208r.get(uri);
        bVar.f7200d.a();
        IOException iOException2 = bVar.F;
        if (iOException2 != null) {
            throw iOException2;
        }
    }

    public boolean obtainsChunksForPlaylist(Uri uri) {
        return qb.v.k(this.playlistUrls, uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onChunkLoadCompleted(ab.f fVar) {
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            this.scratchSpace = eVar.F;
            d dVar = this.keyCache;
            Uri uri = (Uri) eVar.f302d.f17422f;
            byte[] bArr = eVar.H;
            bArr.getClass();
            c cVar = dVar.f4478a;
            uri.getClass();
        }
    }

    public boolean onPlaylistError(Uri uri, long j) {
        int iIndexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.playlistUrls;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iIndexOf = ((ob.c) this.trackSelection).indexOf(i10)) == -1) {
            return true;
        }
        this.seenExpectedPlaylistError |= uri.equals(this.expectedPlaylistUrl);
        if (j != -9223372036854775807L) {
            if (((ob.c) this.trackSelection).i(iIndexOf, j)) {
                if (((db.b) ((db.c) this.playlistTracker).f7208r.get(uri)) != null ? !db.b.a(r6, j) : false) {
                }
            }
            return false;
        }
        return true;
    }

    public void reset() {
        this.fatalError = null;
    }

    public void setIsTimestampMaster(boolean z10) {
        this.isTimestampMaster = z10;
    }

    public void setTrackSelection(ob.f fVar) {
        this.trackSelection = fVar;
    }

    public boolean shouldCancelLoad(long j, ab.f fVar, List<? extends ab.m> list) {
        if (this.fatalError != null) {
            return false;
        }
        this.trackSelection.getClass();
        return false;
    }
}
