package oh;

import ak.m0;
import android.content.ClipData;
import android.content.res.Resources;
import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.util.TypedValue;
import android.view.ContentInfo;
import android.widget.ImageView;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.v1;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.VisibleRegion;
import com.staircase3.opensignal.goldstar.loadingconfig.LoadConfigActivity;
import com.survicate.surveys.infrastructure.network.URLRequest;
import ht.x;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import l5.z;
import p.n0;
import qb.v;
import y1.z1;

/* loaded from: classes.dex */
public class p implements n0, bc.h, u, rt.a, l, zd.l, com.squareup.picasso.g, u3.e, w.m, z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19480a;

    /* renamed from: d, reason: collision with root package name */
    public Object f19481d;

    public /* synthetic */ p(int i10, Object obj) {
        this.f19480a = i10;
        this.f19481d = obj;
    }

    public static String A() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        try {
            Class<?> cls = Class.forName(ExoPlayerLibraryInfo.class.getName());
            Object obj = cls.getDeclaredField("VERSION").get(cls);
            br.l.c(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        } catch (Exception unused) {
            ch.n.g("ExoplayerVersionChecker", "ExoPlayer dependency not found.");
            return null;
        } catch (NoClassDefFoundError unused2) {
            ch.n.g("ExoplayerVersionChecker", "ExoPlayer dependency not found.");
            return null;
        }
    }

    public static boolean D() throws SecurityException {
        try {
            Method[] declaredMethods = Class.forName(ej.b.EXOPLAYER_DASH_WRAPPING_SEGMENT_INDEX.getClassName()).getDeclaredMethods();
            br.l.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (method.getName().equals("getSegmentCount") && br.l.a(method.getReturnType().toString(), "long")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static HttpURLConnection v(String str) throws IOException {
        HttpURLConnection httpURLConnection;
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (tt.s.n0(str, "https", true)) {
            br.l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            httpURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        } else {
            br.l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        }
        httpURLConnection.setRequestMethod(URLRequest.METHOD_GET);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public static int z() throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(ExoPlayerLibraryInfo.class.getName());
            return cls.getDeclaredField("VERSION_INT").getInt(cls);
        } catch (Exception unused) {
            ch.n.g("ExoplayerVersionChecker", "ExoPlayer dependency not found.");
            return 0;
        } catch (NoClassDefFoundError unused2) {
            ch.n.g("ExoplayerVersionChecker", "ExoPlayer dependency not found.");
            return 0;
        }
    }

    public VisibleRegion B() {
        try {
            vc.c cVar = (vc.c) this.f19481d;
            Parcel parcelE = cVar.e(cVar.R(), 3);
            VisibleRegion visibleRegion = (VisibleRegion) qc.l.a(parcelE, VisibleRegion.CREATOR);
            parcelE.recycle();
            return visibleRegion;
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    public void C() throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = ((LoadConfigActivity) this.f19481d).getTheme();
        theme.resolveAttribute(r3.a.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(r3.a.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(r3.a.splashScreenIconSize, typedValue, true);
        I(theme, typedValue);
    }

    public boolean E() {
        return b9.c.o(ej.b.EXOPLAYER_DASH.getClassName() + "$Factory", "setCmcdConfigurationFactory");
    }

    public boolean F() {
        return b9.c.o(ej.b.EXOPLAYER_HLS_MEDIA_SOURCE.getClassName() + "$Factory", "setTimestampAdjusterInitializationTimeoutMs");
    }

    @Override // oh.u
    public long G() {
        return ((v1) this.f19481d).f4745f;
    }

    public synchronized void H(String str, m0 m0Var) {
        ((com.google.android.exoplayer2.source.hls.c) this.f19481d).put(str, m0Var);
    }

    public void I(Resources.Theme theme, TypedValue typedValue) {
        int i10;
        if (!theme.resolveAttribute(r3.a.postSplashScreenTheme, typedValue, true) || (i10 = typedValue.resourceId) == 0) {
            return;
        }
        ((LoadConfigActivity) this.f19481d).setTheme(i10);
    }

    @Override // oh.u
    public boolean M() {
        return ((v1) this.f19481d).a();
    }

    @Override // oh.u
    public long P() {
        return com.google.android.exoplayer2.h.d(((v1) this.f19481d).f4750m);
    }

    @Override // oh.u
    public long a() {
        return com.google.android.exoplayer2.h.d(((v1) this.f19481d).f4751n);
    }

    @Override // u3.e
    public ClipData b() {
        return ((ContentInfo) this.f19481d).getClip();
    }

    @Override // oh.l
    public Integer c() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return Integer.valueOf(rVar.N);
        }
        return null;
    }

    @Override // rt.a
    public Iterable d(Object obj) {
        qr.r rVar = (qr.r) this.f19481d;
        Collection collectionQ = ((rr.f) obj).v().q();
        br.l.d(collectionQ, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionQ.iterator();
        while (it.hasNext()) {
            rr.i iVarP = ((x) it.next()).Z().p();
            rr.i iVarA = iVarP != null ? iVarP.u1() : null;
            rr.f fVar = iVarA instanceof rr.f ? (rr.f) iVarA : null;
            es.j jVarF = fVar != null ? rVar.f(fVar) : null;
            if (jVarF != null) {
                arrayList.add(jVarF);
            }
        }
        return arrayList;
    }

    @Override // oh.l
    public String e() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return rVar.E;
        }
        return null;
    }

    @Override // oh.l
    public String f() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return rVar.G;
        }
        return null;
    }

    @Override // oh.l
    public Float g() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return Float.valueOf(rVar.Q);
        }
        return null;
    }

    @Override // w.m
    public w.q get(int i10) {
        return (w.q) this.f19481d;
    }

    @Override // u3.e
    public int h() {
        return ((ContentInfo) this.f19481d).getSource();
    }

    @Override // oh.l
    public Integer i() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return Integer.valueOf(rVar.M);
        }
        return null;
    }

    @Override // com.squareup.picasso.g
    public void j() {
        ((ImageView) this.f19481d).setBackgroundResource(qk.f.ic_logo_placeholder);
    }

    @Override // oh.l
    public k k() {
        Pair pairD;
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar == null || (pairD = z.d(rVar)) == null) {
            return null;
        }
        Object obj = pairD.first;
        br.l.d(obj, "first");
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = pairD.second;
        br.l.d(obj2, "second");
        return new k(iIntValue, ((Number) obj2).intValue());
    }

    @Override // oh.l
    public Integer l() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return Integer.valueOf(rVar.V);
        }
        return null;
    }

    @Override // oh.l
    public Float n() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return Float.valueOf(rVar.O);
        }
        return null;
    }

    @Override // u3.e
    public int o() {
        return ((ContentInfo) this.f19481d).getFlags();
    }

    @Override // u3.e
    public ContentInfo p() {
        return (ContentInfo) this.f19481d;
    }

    @Override // oh.u
    public long r() {
        return v.s(((v1) this.f19481d).f4746g);
    }

    @Override // oh.l
    public Integer t() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return Integer.valueOf(rVar.D);
        }
        return null;
    }

    public String toString() {
        switch (this.f19480a) {
            case 17:
                return "ContentInfoCompat{" + ((ContentInfo) this.f19481d) + "}";
            default:
                return super.toString();
        }
    }

    @Override // oh.l
    public String u() {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f19481d;
        if (rVar != null) {
            return rVar.H;
        }
        return null;
    }

    public String w() {
        ej.b bVar = ej.b.EXOPLAYER_DASH;
        return !b9.c.l(bVar) ? "" : E() ? "2.19" : b9.c.o(ej.b.EXOPLAYER_DASH_MANIFEST_PARSER.getClassName(), "parseDtsxChannelConfiguration") ? "2.18" : b9.c.o(bVar.getClassName(), "updateLiveConfiguration") ? "2.17" : b9.c.f(ej.b.EXOPLAYER_DASH_MANIFEST_REPRESENTATION.getClassName(), "essentialProperties") ? "2.16" : b9.c.f(bVar.getClassName(), "baseUrlExclusionList") ? "2.15" : D() ? "2.14" : b9.c.f(bVar.getClassName(), "liveConfiguration") ? "2.13" : "";
    }

    public String x() {
        ej.b bVar = ej.b.EXOPLAYER_HLS_MEDIA_SOURCE;
        return !b9.c.l(bVar) ? "" : F() ? "2.19" : b9.c.n(ej.b.EXOPLAYER_HLS_SAMPLE_STREAM_WRAPPER_CALLBACK.getClassName()) ? "2.18" : b9.c.o(bVar.getClassName(), "updateLiveConfiguration") ? "2.17" : b9.c.f(bVar.getClassName(), "localConfiguration") ? "2.16" : b9.c.o(ej.b.EXOPLAYER_HLS_CHUNK_SOURCE.getClassName(), "obtainsChunksForPlaylist") ? "2.15" : b9.c.o(bVar.getClassName(), "findClosestPrecedingIndependentPart") ? "2.14" : b9.c.f(bVar.getClassName(), "elapsedRealTimeOffsetMs") ? "2.13" : "";
    }

    @Override // bc.h
    public void y(Object obj) {
        ji.a aVar = (ji.a) obj;
        LocationResult locationResult = (LocationResult) this.f19481d;
        switch (aVar.f13713a) {
            case 0:
                br.l.e(locationResult, "locationResult");
                ch.n.b("FusedLocationDataSource", "onLocationResult [ACTIVE] callback called with: " + locationResult);
                bk.f.a((bk.f) aVar.f13714b, locationResult);
                break;
            case 1:
                br.l.e(locationResult, "locationResult");
                ch.n.b("FusedLocationDataSource", "onLocationResult [PASSIVE] callback called with: " + locationResult);
                bk.f.a((bk.f) aVar.f13714b, locationResult);
                break;
            default:
                List list = locationResult.f5314a;
                int size = list.size();
                Location location = size == 0 ? null : (Location) list.get(size - 1);
                Objects.toString(location);
                Iterator it = ((CopyOnWriteArrayList) ((qm.c) aVar.f13714b).f20918d).iterator();
                while (it.hasNext()) {
                    qm.b bVar = (qm.b) it.next();
                    if (bVar != null) {
                        bVar.onLocationChanged(location);
                    }
                }
                break;
        }
    }

    public p(y9.u uVar, io.sentry.internal.debugmeta.c cVar) {
        this.f19480a = 25;
        this.f19481d = cVar;
        uVar.e(new xe.b(1, this));
    }

    public p(bf.s sVar) {
        this.f19480a = 15;
        this.f19481d = new AtomicReference();
        sVar.a(new s9.g(3, this));
    }

    public p(int i10) {
        this.f19480a = i10;
        switch (i10) {
            case 18:
                this.f19481d = new a5.v(10);
                break;
            case 20:
                this.f19481d = new LinkedHashMap(0, 0.75f, true);
                break;
            case 23:
                this.f19481d = new com.google.android.exoplayer2.source.hls.c(this);
                break;
            case 26:
                this.f19481d = new HashMap();
                break;
            case 27:
                this.f19481d = androidx.compose.runtime.c.f(Boolean.FALSE);
                break;
        }
    }

    public p(long[] jArr) {
        u.v vVar;
        this.f19480a = 24;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            vVar = new u.v(jArrCopyOf.length);
            int i10 = vVar.f23116b;
            if (i10 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i10;
                    long[] jArr2 = vVar.f23115a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        br.l.d(jArrCopyOf2, "copyOf(...)");
                        vVar.f23115a = jArrCopyOf2;
                    }
                    long[] jArr3 = vVar.f23115a;
                    int i11 = vVar.f23116b;
                    if (i10 != i11) {
                        mq.l.d0(jArr3, jArr3, jArrCopyOf.length + i10, i10, i11);
                    }
                    mq.l.d0(jArrCopyOf, jArr3, i10, 0, jArrCopyOf.length);
                    vVar.f23116b += jArrCopyOf.length;
                }
            } else {
                v.a.d("");
                throw null;
            }
        } else {
            vVar = new u.v(16);
        }
        this.f19481d = vVar;
    }

    @Override // p.n0
    public void m(int i10) {
    }

    @Override // p.n0
    public void q(int i10) {
    }

    public p(pu.a aVar) {
        this.f19480a = 13;
        this.f19481d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }

    public p(ContentInfo contentInfo) {
        this.f19480a = 17;
        contentInfo.getClass();
        this.f19481d = fj.i.j(contentInfo);
    }

    @Override // p.n0
    public void s(int i10, float f10) {
    }
}
