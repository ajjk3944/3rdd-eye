package androidx.media3.exoplayer.dash;

import a5.a;
import a5.d0;
import android.net.Uri;
import androidx.media3.common.r;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import b5.a0;
import b5.h;
import b5.j;
import b5.k;
import h5.b;
import h5.c;
import h5.g;
import h5.i;
import h5.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o5.q;
import p5.d;
import p5.f;
import u5.x;

/* loaded from: classes.dex */
public final class DashUtil {
    private DashUtil() {
    }

    public static k buildDataSpec(l lVar, String str, i iVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri uriZ = a.z(str, iVar.f9943c);
        long j = iVar.f9941a;
        long j7 = iVar.f9942b;
        String strResolveCacheKey = resolveCacheKey(lVar, iVar);
        a.k(uriZ, "The uri must be set.");
        return new k(uriZ, 1, null, map, j, j7, strResolveCacheKey, i10);
    }

    private static l getFirstRepresentation(g gVar, int i10) {
        List list = gVar.f9934c;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            }
            if (((h5.a) list.get(i11)).f9899b == i10) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            return null;
        }
        List list2 = ((h5.a) gVar.f9934c.get(i11)).f9900c;
        if (list2.isEmpty()) {
            return null;
        }
        return (l) list2.get(0);
    }

    public static u5.g loadChunkIndex(h hVar, int i10, l lVar, int i11) throws IOException {
        if (lVar.f9951x == null) {
            return null;
        }
        f fVarNewChunkExtractor = newChunkExtractor(i10, lVar.f9947a);
        try {
            loadInitializationData(fVarNewChunkExtractor, hVar, lVar, i11, true);
            d dVar = (d) fVarNewChunkExtractor;
            dVar.f20258a.release();
            x xVar = dVar.D;
            if (xVar instanceof u5.g) {
                return (u5.g) xVar;
            }
            return null;
        } catch (Throwable th2) {
            ((d) fVarNewChunkExtractor).f20258a.release();
            throw th2;
        }
    }

    public static r loadFormatWithDrmInitData(h hVar, g gVar) throws IOException {
        int i10 = 2;
        l firstRepresentation = getFirstRepresentation(gVar, 2);
        if (firstRepresentation == null) {
            i10 = 1;
            firstRepresentation = getFirstRepresentation(gVar, 1);
            if (firstRepresentation == null) {
                return null;
            }
        }
        r rVar = firstRepresentation.f9947a;
        r rVarLoadSampleFormat = loadSampleFormat(hVar, i10, firstRepresentation);
        return rVarLoadSampleFormat == null ? rVar : rVarLoadSampleFormat.d(rVar);
    }

    private static void loadInitializationData(f fVar, h hVar, l lVar, int i10, boolean z10) throws IOException {
        i iVar = lVar.f9951x;
        iVar.getClass();
        if (z10) {
            i iVarC = lVar.c();
            if (iVarC == null) {
                return;
            }
            i iVarA = iVar.a(iVarC, ((b) lVar.f9948d.get(i10)).f9904a);
            if (iVarA == null) {
                loadInitializationData(hVar, lVar, i10, fVar, iVar);
                iVar = iVarC;
            } else {
                iVar = iVarA;
            }
        }
        loadInitializationData(hVar, lVar, i10, fVar, iVar);
    }

    public static c loadManifest(h hVar, Uri uri) throws IOException {
        DashManifestParser dashManifestParser = new DashManifestParser();
        Map map = Collections.EMPTY_MAP;
        a.k(uri, "The uri must be set.");
        k kVar = new k(uri, 1, null, map, 0L, -1L, null, 1);
        a0 a0Var = new a0(hVar);
        q.f19025e.getAndIncrement();
        a0Var.f2420d = 0L;
        j jVar = new j(a0Var, kVar);
        try {
            jVar.b();
            Uri uriO = hVar.o();
            uriO.getClass();
            Object obj = dashManifestParser.parse(uriO, (InputStream) jVar);
            int i10 = d0.f105a;
            try {
                jVar.close();
            } catch (IOException unused) {
            }
            obj.getClass();
            return (c) obj;
        } finally {
        }
    }

    public static r loadSampleFormat(h hVar, int i10, l lVar, int i11) throws IOException {
        if (lVar.f9951x == null) {
            return null;
        }
        f fVarNewChunkExtractor = newChunkExtractor(i10, lVar.f9947a);
        try {
            loadInitializationData(fVarNewChunkExtractor, hVar, lVar, i11, false);
            d dVar = (d) fVarNewChunkExtractor;
            dVar.f20258a.release();
            r[] rVarArr = dVar.E;
            a.j(rVarArr);
            return rVarArr[0];
        } catch (Throwable th2) {
            ((d) fVarNewChunkExtractor).f20258a.release();
            throw th2;
        }
    }

    private static f newChunkExtractor(int i10, r rVar) {
        String str = rVar.G;
        return new d((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new l6.h(0) : new j6.c(0), i10, rVar);
    }

    public static String resolveCacheKey(l lVar, i iVar) {
        String strA = lVar.a();
        return strA != null ? strA : a.z(((b) lVar.f9948d.get(0)).f9904a, iVar.f9943c).toString();
    }

    public static void loadInitializationData(f fVar, h hVar, l lVar, boolean z10) throws IOException {
        loadInitializationData(fVar, hVar, lVar, 0, z10);
    }

    private static void loadInitializationData(h hVar, l lVar, int i10, f fVar, i iVar) throws IOException {
        new p5.k(hVar, buildDataSpec(lVar, ((b) lVar.f9948d.get(i10)).f9904a, iVar, 0), lVar.f9947a, 0, null, fVar).c();
    }

    public static k buildDataSpec(l lVar, i iVar, int i10) {
        return buildDataSpec(lVar, ((b) lVar.f9948d.get(0)).f9904a, iVar, i10);
    }

    public static u5.g loadChunkIndex(h hVar, int i10, l lVar) throws IOException {
        return loadChunkIndex(hVar, i10, lVar, 0);
    }

    public static r loadSampleFormat(h hVar, int i10, l lVar) throws IOException {
        return loadSampleFormat(hVar, i10, lVar, 0);
    }
}
