package q3;

import ak.t0;
import ak.w0;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import bc.m;
import bc.q;
import br.l;
import br.x;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.measurement.internal.zzoh;
import com.staircase3.opensignal.activities.TowersActivity;
import com.survicate.surveys.infrastructure.network.URLRequest;
import g1.f0;
import h7.r1;
import ht.b0;
import ht.c1;
import ht.d1;
import ht.g0;
import ht.m0;
import ht.p0;
import ht.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import mq.o;
import oh.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.l2;
import pb.d0;
import rr.r0;
import tt.s;
import u3.h1;
import u3.n;
import wt.w;
import y1.e0;
import y1.v0;
import zc.d2;
import zc.j0;
import zc.t1;
import zc.u;

/* loaded from: classes.dex */
public final class a implements pm.c, vg.b, th.a, jt.b, w0.d, n, v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20678a;

    /* renamed from: d, reason: collision with root package name */
    public Object f20679d;

    /* renamed from: g, reason: collision with root package name */
    public Object f20680g;

    public /* synthetic */ a() {
        this.f20678a = 1;
    }

    public static HttpURLConnection I0(String str, HashMap map) throws IOException {
        HttpURLConnection httpURLConnection;
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (s.n0(str, "https", true)) {
            l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            httpURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        } else {
            l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        }
        httpURLConnection.setRequestMethod(URLRequest.METHOD_GET);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public static HttpsURLConnection z0(String str) throws IOException {
        l.e(str, "url");
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) uRLConnectionOpenConnection;
    }

    @Override // jt.b
    public boolean A(lt.d dVar) {
        l.e(dVar, "$receiver");
        return dVar instanceof is.f;
    }

    public String A0() {
        om.f fVar = (om.f) this.f20679d;
        String strN = fVar.n("DEVICE_ID_TIME", null);
        if (strN != null && strN.length() != 0) {
            ch.n.b("InstallationInfoRepository", c7.a.p("Device id - ", strN));
            l.b(strN);
            return strN;
        }
        StringBuilder sb2 = new StringBuilder();
        ((df.c) this.f20680g).getClass();
        sb2.append(System.currentTimeMillis());
        sb2.append('_');
        Charset charset = zh.f.f27419a;
        StringBuilder sb3 = new StringBuilder(8);
        for (int i10 = 0; i10 < 8; i10++) {
            sb3.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(zh.f.f27420b.nextInt(62)));
        }
        sb2.append(sb3.toString());
        String string = sb2.toString();
        ch.n.b("InstallationInfoRepository", c7.a.p("Generate device id - ", string));
        l.e(string, "generatedDeviceIdTime");
        fVar.u("DEVICE_ID_TIME", string);
        return string;
    }

    @Override // jt.b
    public m0 B(lt.e eVar) {
        return jt.g.W(eVar);
    }

    public u5.k B0(Object... objArr) {
        Constructor constructorE;
        synchronized (((AtomicBoolean) this.f20680g)) {
            if (!((AtomicBoolean) this.f20680g).get()) {
                try {
                    constructorE = ((p5.b) this.f20679d).e();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f20680g).set(true);
                } catch (Exception e4) {
                    throw new RuntimeException("Error instantiating extension", e4);
                }
            }
            constructorE = null;
        }
        if (constructorE == null) {
            return null;
        }
        try {
            return (u5.k) constructorE.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    @Override // jt.b
    public b0 C(lt.d dVar) {
        b0 b0VarY;
        l.e(dVar, "<this>");
        r rVarG = jt.g.g(dVar);
        if (rVarG != null && (b0VarY = jt.g.Y(rVarG)) != null) {
            return b0VarY;
        }
        b0 b0VarH = jt.g.h(dVar);
        l.b(b0VarH);
        return b0VarH;
    }

    public NetworkInfo C0() {
        if (((ag.b) this.f20680g).i("android.permission.ACCESS_NETWORK_STATE")) {
            return ((ConnectivityManager) this.f20679d).getActiveNetworkInfo();
        }
        ch.n.b("NetworkDetector", "getNetworkInfo: Manifest.permission.ACCESS_NETWORK_STATE NOT GRANTED");
        return null;
    }

    @Override // jt.b
    public boolean D(lt.g gVar) {
        return jt.g.A(gVar);
    }

    public com.squareup.picasso.s D0() {
        NetworkInfo networkInfoC0 = C0();
        return networkInfoC0 == null ? new com.squareup.picasso.s(-1, -1, (Boolean) null) : new com.squareup.picasso.s(networkInfoC0.getType(), networkInfoC0.getSubtype(), Boolean.valueOf(networkInfoC0.isConnected()));
    }

    @Override // jt.b
    public boolean E(lt.g gVar) {
        return jt.g.D(gVar);
    }

    public p E0() {
        vc.c cVar;
        try {
            vc.g gVar = (vc.g) this.f20679d;
            Parcel parcelE = gVar.e(gVar.R(), 26);
            IBinder strongBinder = parcelE.readStrongBinder();
            if (strongBinder == null) {
                cVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                cVar = iInterfaceQueryLocalInterface instanceof vc.c ? (vc.c) iInterfaceQueryLocalInterface : new vc.c(strongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 4);
            }
            parcelE.recycle();
            return new p(19, cVar);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    @Override // jt.b
    public boolean F(c1 c1Var) {
        l.e(c1Var, "<this>");
        return jt.g.F(h0(c1Var)) != jt.g.F(C(c1Var));
    }

    public ak.v0 F0(String str) {
        Object next;
        Iterator it = ((ak.g) this.f20680g).f530g.f757b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (l.a(((ak.v0) next).f735a, str)) {
                break;
            }
        }
        return (ak.v0) next;
    }

    @Override // jt.b
    public Collection G(lt.g gVar) {
        return jt.g.V(gVar);
    }

    public o2.g G0() {
        vc.d dVar;
        try {
            if (((o2.g) this.f20680g) == null) {
                vc.g gVar = (vc.g) this.f20679d;
                Parcel parcelE = gVar.e(gVar.R(), 25);
                IBinder strongBinder = parcelE.readStrongBinder();
                if (strongBinder == null) {
                    dVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    dVar = iInterfaceQueryLocalInterface instanceof vc.d ? (vc.d) iInterfaceQueryLocalInterface : new vc.d(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 4);
                }
                parcelE.recycle();
                this.f20680g = new o2.g(20, dVar);
            }
            return (o2.g) this.f20680g;
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    @Override // jt.b
    public boolean H(lt.g gVar, lt.g gVar2) {
        l.e(gVar, "c1");
        l.e(gVar2, "c2");
        if (!(gVar instanceof m0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(gVar2 instanceof m0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (jt.g.b(gVar, gVar2)) {
            return true;
        }
        m0 m0Var = (m0) gVar;
        m0 m0Var2 = (m0) gVar2;
        Map map = (Map) this.f20679d;
        if (((jt.c) this.f20680g).a(m0Var, m0Var2)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        m0 m0Var3 = (m0) map.get(m0Var);
        m0 m0Var4 = (m0) map.get(m0Var2);
        if (m0Var3 == null || !m0Var3.equals(m0Var2)) {
            return m0Var4 != null && m0Var4.equals(m0Var);
        }
        return true;
    }

    public void H0() {
        ak.g gVar;
        ch.d dVar = (ch.d) this.f20679d;
        String strN = dVar.U().n("sdk_config_json-back", null);
        if (strN != null) {
            ak.p pVarD = dVar.m().d(strN);
            if (pVarD instanceof ak.i) {
                gVar = ((ak.i) pVarD).f546h;
            } else {
                if (!(pVarD instanceof ak.h)) {
                    throw new bf.n();
                }
                StringBuilder sb2 = new StringBuilder("response.message: ");
                Exception exc = ((ak.h) pVarD).f542h;
                sb2.append(exc);
                ch.n.b("ConfigRepositoryImpl", sb2.toString());
                dVar.r();
                cj.a.E(exc, "ConfigRepositoryImpl: initialiseConfig()");
                ch.n.b("ConfigRepositoryImpl", "Reset config data");
                dVar.U().u("sdk_config_json-back", null);
                dVar.U().t(-1L, "back");
                gVar = new ak.g("", -1, -1, "", "", ak.p.a(), new w0(new t0(), ak.n.f619a, true));
            }
        } else {
            gVar = new ak.g("", -1, -1, "", "", ak.p.a(), new w0(new t0(), ak.n.f619a, true));
        }
        this.f20680g = gVar;
        Objects.toString(gVar);
        ch.n.a();
    }

    @Override // jt.b
    public lt.i I(p0 p0Var) {
        return jt.g.t(p0Var);
    }

    @Override // jt.b
    public g0 J(lt.d dVar) {
        return jt.g.i(dVar);
    }

    public boolean J0() {
        if (((ak.g) this.f20680g).f524a.length() <= 0) {
            return false;
        }
        ak.g gVar = (ak.g) this.f20680g;
        if (gVar.f526c == -1) {
            return false;
        }
        List list = gVar.f530g.f757b;
        List list2 = ak.n.f619a;
        return !l.a(list, ak.n.f619a);
    }

    @Override // jt.b
    public boolean K(lt.e eVar) {
        l.e(eVar, "<this>");
        return jt.g.G(p(eVar)) && !jt.g.H(eVar);
    }

    public boolean K0() {
        NetworkInfo networkInfoC0;
        return ((ag.b) this.f20680g).i("android.permission.ACCESS_NETWORK_STATE") && (networkInfoC0 = C0()) != null && networkInfoC0.isConnected();
    }

    @Override // jt.b
    public lt.c L(lt.e eVar) {
        return jt.g.e(this, eVar);
    }

    public void L0(Throwable th2) throws JSONException {
        zzoh zzohVar = (zzoh) this.f20679d;
        d2 d2Var = (d2) this.f20680g;
        d2Var.s1();
        d2Var.F = false;
        zc.c1 c1Var = (zc.c1) d2Var.f1504d;
        zc.f fVar = c1Var.f26887r;
        j0 j0Var = c1Var.f26889y;
        int i10 = 2;
        if (fVar.C1(null, u.T0)) {
            String message = th2.getMessage();
            d2Var.K = false;
            if (message != null) {
                if ((th2 instanceof IllegalStateException) || message.contains("garbage collected") || th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        d2Var.K = true;
                    }
                    i10 = 1;
                } else if ((th2 instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i10 = 3;
                }
            }
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            zc.c1.g(j0Var);
            j0Var.F.d(j0.A1(c1Var.l().y1()), j0.A1(th2.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
            d2Var.G = 1;
            d2Var.Q1().add(zzohVar);
            return;
        }
        if (i11 != 1) {
            zc.c1.g(j0Var);
            j0Var.B.d(j0.A1(c1Var.l().y1()), th2, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
            T0();
            d2Var.G = 1;
            d2Var.R1();
            return;
        }
        d2Var.Q1().add(zzohVar);
        if (d2Var.G > ((Integer) u.f27215w0.a(null)).intValue()) {
            d2Var.G = 1;
            zc.c1.g(j0Var);
            j0Var.F.d(j0.A1(c1Var.l().y1()), j0.A1(th2.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        zc.c1.g(j0Var);
        j0Var.F.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", j0.A1(c1Var.l().y1()), j0.A1(String.valueOf(d2Var.G)), j0.A1(th2.toString()));
        int i12 = d2Var.G;
        if (d2Var.H == null) {
            d2Var.H = new t1(d2Var, c1Var, 1);
        }
        d2Var.H.b(i12 * 1000);
        int i13 = d2Var.G;
        d2Var.G = i13 + i13;
    }

    @Override // jt.b
    public lt.i M(r0 r0Var) {
        l.e(r0Var, "$receiver");
        d1 d1VarN = r0Var.N();
        l.d(d1VarN, "this.variance");
        return vc.e.k(d1VarN);
    }

    public void M0(g gVar) {
        q qVar = (q) this.f20680g;
        r1 r1Var = (r1) this.f20679d;
        int i10 = gVar.f20699b;
        if (i10 != 0) {
            qVar.execute(new m(i10, 3, r1Var));
        } else {
            qVar.execute(new re.a(r1Var, 19, gVar.f20698a));
        }
    }

    @Override // jt.b
    public boolean N(lt.g gVar) {
        return jt.g.E(gVar);
    }

    public ByteArrayOutputStream N0(HttpURLConnection httpURLConnection) throws IOException {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
        try {
            bufferedInputStream.available();
            byte[] bArr = new byte[1024];
            do {
                i10 = bufferedInputStream.read(bArr);
                if (i10 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                if (((om.f) this.f20680g) != null) {
                    byteArrayOutputStream.size();
                }
            } while (i10 != -1);
            bufferedInputStream.close();
            httpURLConnection.disconnect();
            return byteArrayOutputStream;
        } finally {
        }
    }

    @Override // jt.b
    public b0 O(ht.n nVar) {
        return jt.g.Q(nVar);
    }

    public void O0() {
        try {
            vc.g gVar = (vc.g) this.f20679d;
            Parcel parcelR = gVar.R();
            int i10 = qc.l.f20842a;
            parcelR.writeInt(1);
            gVar.S(parcelR, 22);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    @Override // jt.b
    public boolean P(lt.e eVar) {
        l.e(eVar, "<this>");
        return jt.g.D(jt.g.W(eVar));
    }

    public void P0(uc.a aVar) {
        vc.g gVar = (vc.g) this.f20679d;
        try {
            uc.f fVar = new uc.f(aVar);
            Parcel parcelR = gVar.R();
            qc.l.d(parcelR, fVar);
            gVar.S(parcelR, 99);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    @Override // w0.d
    public Object Q(w0.a aVar, Object obj) {
        return ((ar.n) this.f20679d).w(aVar, obj);
    }

    public void Q0(int i10, int i11, int i12, int i13) {
        CardView cardView = (CardView) this.f20680g;
        cardView.f1059r.set(i10, i11, i12, i13);
        Rect rect = cardView.f1058g;
        super/*android.view.View*/.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
    }

    @Override // jt.b
    public boolean R(lt.g gVar) {
        return jt.g.z(gVar);
    }

    public void R0(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f20679d;
        Object parent = view.getParent();
        if (parent instanceof View) {
            R0((View) parent, fArr);
            f0.m(fArr2);
            f0.v(fArr2, -view.getScrollX(), -view.getScrollY());
            e0.r(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            f0.m(fArr2);
            f0.v(fArr2, left, top);
            e0.r(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f20680g;
            view.getLocationInWindow(iArr);
            f0.m(fArr2);
            f0.v(fArr2, -view.getScrollX(), -view.getScrollY());
            e0.r(fArr, fArr2);
            float f10 = iArr[0];
            float f11 = iArr[1];
            f0.m(fArr2);
            f0.v(fArr2, f10, f11);
            e0.r(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        f0.n(fArr2, matrix);
        e0.r(fArr, fArr2);
    }

    @Override // jt.b
    public c1 S(ArrayList arrayList) {
        b0 b0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (c1) o.I0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            z10 = z10 || ht.c.i(c1Var);
            if (c1Var instanceof b0) {
                b0Var = (b0) c1Var;
            } else {
                if (!(c1Var instanceof r)) {
                    throw new bf.n();
                }
                b0Var = ((r) c1Var).f10938d;
                z11 = true;
            }
            arrayList2.add(b0Var);
        }
        if (z10) {
            return kt.k.c(kt.j.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        jt.p pVar = jt.p.f13862a;
        if (!z11) {
            return pVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(ht.c.y((c1) it2.next()));
        }
        return ht.e.j(pVar.b(arrayList2), pVar.b(arrayList3));
    }

    public void S0(String str, byte[] bArr, HashMap map, int i10, boolean z10) {
        HttpsURLConnection httpsURLConnectionZ0;
        int i11;
        BufferedOutputStream bufferedOutputStream;
        dr.a hVar;
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f20679d;
        l.e(str, "url");
        boolean z11 = true;
        try {
            try {
                ch.n.b("UrlConnectionUploader", "Begin");
                Thread threadCurrentThread = Thread.currentThread();
                l.d(threadCurrentThread, "currentThread(...)");
                cVar.b(threadCurrentThread);
                httpsURLConnectionZ0 = z0(str);
                httpsURLConnectionZ0.setRequestMethod(URLRequest.METHOD_POST);
                httpsURLConnectionZ0.setConnectTimeout(60000);
                httpsURLConnectionZ0.setReadTimeout(60000);
                httpsURLConnectionZ0.setDoOutput(true);
                httpsURLConnectionZ0.setDoInput(true);
                i11 = 0;
                httpsURLConnectionZ0.setUseCaches(false);
                for (Map.Entry entry : map.entrySet()) {
                    httpsURLConnectionZ0.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                ch.n.b("UrlConnectionUploader", "Connecting");
                bufferedOutputStream = new BufferedOutputStream(httpsURLConnectionZ0.getOutputStream());
            } catch (Exception e4) {
                ch.n.c("UrlConnectionUploader", "Fail on uploading to " + str);
                ch.n.e("UrlConnectionUploader", e4);
                if (!(e4 instanceof SocketException ? true : e4 instanceof SocketTimeoutException)) {
                    z11 = e4 instanceof SSLException;
                }
                if (z11) {
                    u0(str, bArr, map, i10, z10);
                } else if (e4 instanceof UnknownHostException) {
                    bk.l lVar = (bk.l) this.f20680g;
                    if (lVar != null) {
                        lVar.b(bk.g.f2813a);
                    }
                } else if (e4 instanceof IOException) {
                    bk.l lVar2 = (bk.l) this.f20680g;
                    if (lVar2 != null) {
                        lVar2.b(new bk.j(e4, 2));
                    }
                } else {
                    bk.l lVar3 = (bk.l) this.f20680g;
                    if (lVar3 != null) {
                        lVar3.b(new bk.j(e4, 2));
                    }
                    cj.a.E(e4, "Upload failed due to an unhandled error");
                }
            }
            try {
                ch.n.b("UrlConnectionUploader", "Start upload");
                if (bArr.length < 4096) {
                    bufferedOutputStream.write(bArr, 0, bArr.length);
                    bufferedOutputStream.flush();
                    bk.l lVar4 = (bk.l) this.f20680g;
                    if (lVar4 != null) {
                        lVar4.a(bArr.length, bArr.length);
                    }
                } else {
                    int iV = y3.v(0, bArr.length - 1, 4096);
                    if (iV >= 0) {
                        while (true) {
                            int i12 = i11 + 4096;
                            int length = i12 <= bArr.length ? 4096 : bArr.length - i11;
                            ch.n.b("UrlConnectionUploader", "Offset: " + i11 + " Step Size: 4096 length: " + length);
                            bufferedOutputStream.write(bArr, i11, length);
                            bufferedOutputStream.flush();
                            bk.l lVar5 = (bk.l) this.f20680g;
                            if (lVar5 != null) {
                                lVar5.a(i12, bArr.length);
                            }
                            if (i11 == iV) {
                                break;
                            } else {
                                i11 = i12;
                            }
                        }
                    }
                }
                ch.n.b("UrlConnectionUploader", "Upload success on attempt " + (i10 + 1) + " to " + str);
                bufferedOutputStream.close();
                ch.n.b("UrlConnectionUploader", "connection.responseCode: " + httpsURLConnectionZ0.getResponseCode());
                if (z10 && httpsURLConnectionZ0.getResponseCode() == 304) {
                    hVar = bk.g.f2814b;
                } else if (httpsURLConnectionZ0.getResponseCode() >= 400) {
                    hVar = new bk.h(httpsURLConnectionZ0.getResponseCode());
                } else {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpsURLConnectionZ0.getInputStream());
                    try {
                        byte[] bArrC = i3.g.C(bufferedInputStream);
                        Map<String, List<String>> headerFields = httpsURLConnectionZ0.getHeaderFields();
                        l.d(headerFields, "getHeaderFields(...)");
                        bk.i iVar = new bk.i(bArrC, headerFields);
                        bufferedInputStream.close();
                        hVar = iVar;
                    } finally {
                    }
                }
                httpsURLConnectionZ0.disconnect();
                bk.l lVar6 = (bk.l) this.f20680g;
                if (lVar6 != null) {
                    lVar6.b(hVar);
                }
                Thread threadCurrentThread2 = Thread.currentThread();
                l.d(threadCurrentThread2, "currentThread(...)");
                cVar.B(threadCurrentThread2);
            } finally {
            }
        } catch (Throwable th2) {
            Thread threadCurrentThread3 = Thread.currentThread();
            l.d(threadCurrentThread3, "currentThread(...)");
            cVar.B(threadCurrentThread3);
            throw th2;
        }
    }

    @Override // jt.b
    public boolean T(lt.e eVar, lt.e eVar2) {
        return jt.g.w(eVar, eVar2);
    }

    public void T0() throws JSONException {
        zc.c1 c1Var = (zc.c1) ((d2) this.f20680g).f1504d;
        zc.r0 r0Var = c1Var.f26888x;
        zc.c1.e(r0Var);
        SparseArray sparseArrayY1 = r0Var.y1();
        zzoh zzohVar = (zzoh) this.f20679d;
        sparseArrayY1.put(zzohVar.f5411g, Long.valueOf(zzohVar.f5410d));
        zc.r0 r0Var2 = c1Var.f26888x;
        zc.c1.e(r0Var2);
        int[] iArr = new int[sparseArrayY1.size()];
        long[] jArr = new long[sparseArrayY1.size()];
        for (int i10 = 0; i10 < sparseArrayY1.size(); i10++) {
            iArr[i10] = sparseArrayY1.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayY1.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        r0Var2.K.t0(bundle);
    }

    @Override // y1.v0
    public void U(View view, float[] fArr) {
        f0.m(fArr);
        R0(view, fArr);
    }

    @Override // jt.b
    public b0 V(lt.e eVar, boolean z10) {
        return jt.g.Z(eVar, z10);
    }

    @Override // jt.b
    public p0 W(us.b bVar) {
        return jt.g.T(bVar);
    }

    @Override // jt.b
    public boolean X(lt.g gVar) {
        return jt.g.G(gVar);
    }

    @Override // jt.b
    public c1 Y(lt.d dVar) {
        return jt.g.P(dVar);
    }

    @Override // jt.b
    public p0 Z(lt.d dVar, int i10) {
        return jt.g.p(dVar, i10);
    }

    @Override // jt.b
    public void a(lt.d dVar) {
        l.e(dVar, "<this>");
        jt.g.g(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jt.b
    public p0 a0(lt.f fVar, int i10) {
        l.e(fVar, "<this>");
        if (fVar instanceof lt.e) {
            return jt.g.p((lt.d) fVar, i10);
        }
        if (fVar instanceof lt.a) {
            E e4 = ((lt.a) fVar).get(i10);
            l.d(e4, "get(index)");
            return (p0) e4;
        }
        throw new IllegalStateException(("unknown type argument list type: " + fVar + ", " + x.f2918a.b(fVar.getClass())).toString());
    }

    @Override // jt.b
    public jt.i b(lt.c cVar) {
        return jt.g.X(cVar);
    }

    @Override // jt.b
    public b0 b0(r rVar) {
        return jt.g.N(rVar);
    }

    @Override // jt.b
    public lt.f c(lt.e eVar) {
        return jt.g.d(eVar);
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) {
        xd.n nVar = (xd.n) this.f20679d;
        d0 d0Var = (d0) this.f20680g;
        d0 d0Var2 = new d0();
        d0Var2.f20361b = d0Var.f20361b;
        d0Var2.f20362c = d0Var.f20362c;
        d0Var2.f20363d = d0Var.f20363d;
        d0Var2.f20364e = d0Var.f20364e;
        return nVar.b(view, h1Var, d0Var2);
    }

    @Override // jt.b
    public void d0(lt.e eVar) {
        jt.g.L(eVar);
    }

    @Override // jt.b
    public lt.e e(lt.e eVar) {
        b0 b0VarQ;
        l.e(eVar, "<this>");
        ht.n nVarF = jt.g.f(eVar);
        return (nVarF == null || (b0VarQ = jt.g.Q(nVarF)) == null) ? eVar : b0VarQ;
    }

    @Override // jt.b
    public int e0(lt.g gVar) {
        return jt.g.R(gVar);
    }

    @Override // jt.b
    public jt.a f(lt.e eVar) {
        return jt.g.U(this, eVar);
    }

    @Override // jt.b
    public Collection f0(lt.e eVar) {
        return jt.g.S(this, eVar);
    }

    @Override // jt.b
    public int g(lt.d dVar) {
        return jt.g.c(dVar);
    }

    @Override // jt.b
    public boolean g0(p0 p0Var) {
        return jt.g.K(p0Var);
    }

    @Override // kq.a
    public Object get() {
        Context context = (Context) ((i5.c) this.f20679d).f11238a;
        pq.h hVar = (pq.h) ((kq.a) this.f20680g).get();
        l.e(context, "appContext");
        l.e(hVar, "blockingDispatcher");
        return tg.o.b(wg.i.f24509a, new a2.g(new lu.u(4)), w.b(hVar), new c8.e0(context, 2));
    }

    @Override // jt.b
    public lt.d h(lt.d dVar) {
        return jt.g.a0(this, dVar);
    }

    @Override // jt.b
    public b0 h0(lt.d dVar) {
        b0 b0VarN;
        l.e(dVar, "<this>");
        r rVarG = jt.g.g(dVar);
        if (rVarG != null && (b0VarN = jt.g.N(rVarG)) != null) {
            return b0VarN;
        }
        b0 b0VarH = jt.g.h(dVar);
        l.b(b0VarH);
        return b0VarH;
    }

    @Override // jt.b
    public ht.n i(lt.e eVar) {
        return jt.g.f(eVar);
    }

    @Override // jt.b
    public r0 i0(lt.g gVar, int i10) {
        return jt.g.q(gVar, i10);
    }

    @Override // jt.b
    public lt.b j(lt.c cVar) {
        return jt.g.k(cVar);
    }

    @Override // jt.b
    public boolean j0(lt.c cVar) {
        return cVar instanceof us.a;
    }

    @Override // jt.b
    public b0 k(r rVar) {
        return jt.g.Y(rVar);
    }

    @Override // jt.b
    public boolean k0(lt.e eVar) {
        l.e(eVar, "<this>");
        return jt.g.y(jt.g.W(eVar));
    }

    @Override // jt.b
    public boolean l(lt.g gVar) {
        return jt.g.y(gVar);
    }

    @Override // jt.b
    public p0 l0(lt.e eVar, int i10) {
        l.e(eVar, "<this>");
        if (i10 < 0 || i10 >= jt.g.c(eVar)) {
            return null;
        }
        return jt.g.p(eVar, i10);
    }

    @Override // jt.b
    public c1 m(p0 p0Var) {
        return jt.g.r(p0Var);
    }

    @Override // jt.b
    public void m0(lt.e eVar) {
        jt.g.M(eVar);
    }

    @Override // jt.b
    public c1 n(lt.e eVar, lt.e eVar2) {
        return jt.g.m(this, eVar, eVar2);
    }

    @Override // jt.b
    public boolean n0(lt.e eVar) {
        l.e(eVar, "<this>");
        b0 b0VarH = jt.g.h(eVar);
        return (b0VarH != null ? jt.g.e(this, b0VarH) : null) != null;
    }

    @Override // jt.b
    public boolean o(lt.d dVar) {
        l.e(dVar, "<this>");
        b0 b0VarH = jt.g.h(dVar);
        return (b0VarH != null ? jt.g.f(b0VarH) : null) != null;
    }

    @Override // jt.b
    public int o0(lt.f fVar) {
        l.e(fVar, "<this>");
        if (fVar instanceof lt.e) {
            return jt.g.c((lt.d) fVar);
        }
        if (fVar instanceof lt.a) {
            return ((lt.a) fVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + fVar + ", " + x.f2918a.b(fVar.getClass())).toString());
    }

    @Override // jt.b
    public m0 p(lt.d dVar) {
        l.e(dVar, "<this>");
        b0 b0VarH = jt.g.h(dVar);
        if (b0VarH == null) {
            b0VarH = h0(dVar);
        }
        return jt.g.W(b0VarH);
    }

    @Override // jt.b
    public b0 p0(lt.e eVar, lt.b bVar) {
        return jt.g.j(eVar, bVar);
    }

    @Override // jt.b
    public boolean q(lt.c cVar) {
        return jt.g.J(cVar);
    }

    public boolean q0(long j) {
        Object obj;
        List list = (List) ((om.f) this.f20680g).f19554d;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (i3.g.k(((r1.l) obj).f21182a, j)) {
                break;
            }
            i10++;
        }
        r1.l lVar = (r1.l) obj;
        if (lVar != null) {
            return lVar.f21189h;
        }
        return false;
    }

    @Override // pm.c
    public void r(int i10, ArrayList arrayList) {
        sm.k kVar = (sm.k) this.f20679d;
        TowersActivity towersActivity = (TowersActivity) this.f20680g;
        if (arrayList != null) {
            sm.k kVar2 = (sm.k) arrayList.get(0);
            kVar.f22139d = kVar2.f22139d;
            kVar.f22140e = kVar2.f22140e;
            kVar.f22142g = lf.t1.r(kVar, towersActivity.W);
            kVar.f22141f = true;
            towersActivity.L(kVar);
            towersActivity.I();
        }
    }

    public wc.c r0(MarkerOptions markerOptions) {
        qc.c aVar;
        try {
            vc.g gVar = (vc.g) this.f20679d;
            Parcel parcelR = gVar.R();
            qc.l.c(parcelR, markerOptions);
            Parcel parcelE = gVar.e(parcelR, 11);
            IBinder strongBinder = parcelE.readStrongBinder();
            int i10 = qc.b.f20839e;
            if (strongBinder == null) {
                aVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                aVar = iInterfaceQueryLocalInterface instanceof qc.c ? (qc.c) iInterfaceQueryLocalInterface : new qc.a(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
            }
            parcelE.recycle();
            if (aVar != null) {
                return markerOptions.M == 1 ? new wc.a(aVar) : new wc.c(aVar);
            }
            return null;
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    @Override // jt.b
    public r s(lt.d dVar) {
        return jt.g.g(dVar);
    }

    public void s0(l2 l2Var) {
        try {
            vc.g gVar = (vc.g) this.f20679d;
            jc.b bVar = (jc.b) l2Var.f20100d;
            Parcel parcelR = gVar.R();
            qc.l.d(parcelR, bVar);
            gVar.S(parcelR, 5);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    @Override // jt.b
    public c1 t(lt.c cVar) {
        return jt.g.O(cVar);
    }

    public void t0(String str, HashMap map, int i10) {
        ch.n.b("HttpsUrlDownloader", c7.a.p("Download failed for ", str));
        if (i10 == 3) {
            ch.n.g("HttpsUrlDownloader", "Download failed maximum times. Send error to listener.");
            om.f fVar = (om.f) this.f20680g;
            if (fVar != null) {
                fVar.r(bk.g.f2813a);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Download failed. Retry #");
        int i11 = i10 + 1;
        sb2.append(i11);
        ch.n.g("HttpsUrlDownloader", sb2.toString());
        w0(str, map, i11);
    }

    public String toString() {
        switch (this.f20678a) {
            case 15:
                return "AnimationResult(endReason=" + ((w.d) this.f20680g) + ", endState=" + ((k8.b) this.f20679d) + ')';
            case 18:
                String string = "[ ";
                if (((x2.f) this.f20679d) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder sbT = c7.a.t(string);
                        sbT.append(((x2.f) this.f20679d).D[i10]);
                        sbT.append(" ");
                        string = sbT.toString();
                    }
                }
                StringBuilder sbL = w.g.l(string, "] ");
                sbL.append((x2.f) this.f20679d);
                return sbL.toString();
            default:
                return super.toString();
        }
    }

    @Override // jt.b
    public boolean u(lt.e eVar) {
        return jt.g.F(eVar);
    }

    public void u0(String str, byte[] bArr, HashMap map, int i10, boolean z10) {
        ch.n.b("UrlConnectionUploader", c7.a.p("Upload failed for ", str));
        if (i10 >= 3) {
            ch.n.g("UrlConnectionUploader", "Upload failed maximum times. Send error to listener.");
            bk.l lVar = (bk.l) this.f20680g;
            if (lVar != null) {
                lVar.b(bk.g.f2813a);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Upload failed. Retry #");
        int i11 = i10 + 1;
        sb2.append(i11);
        ch.n.g("UrlConnectionUploader", sb2.toString());
        S0(str, bArr, map, i11, z10);
    }

    @Override // jt.b
    public boolean v(r0 r0Var, lt.g gVar) {
        return jt.g.v(r0Var, gVar);
    }

    public boolean v0(String str) {
        List list = ((ak.g) this.f20680g).f530g.f757b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (l.a(((ak.v0) it.next()).f735a, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // jt.b
    public boolean w(lt.g gVar) {
        return jt.g.x(gVar);
    }

    public void w0(String str, HashMap map, int i10) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f20679d;
        l.e(str, "url");
        try {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                l.d(threadCurrentThread, "currentThread(...)");
                cVar.b(threadCurrentThread);
                HttpURLConnection httpURLConnectionI0 = I0(str, map);
                if (httpURLConnectionI0.getResponseCode() == 304) {
                    om.f fVar = (om.f) this.f20680g;
                    if (fVar != null) {
                        fVar.r(bk.g.f2814b);
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStreamN0 = N0(httpURLConnectionI0);
                    ch.n.a();
                    om.f fVar2 = (om.f) this.f20680g;
                    if (fVar2 != null) {
                        byte[] byteArray = byteArrayOutputStreamN0.toByteArray();
                        l.d(byteArray, "toByteArray(...)");
                        Map<String, List<String>> headerFields = httpURLConnectionI0.getHeaderFields();
                        l.d(headerFields, "getHeaderFields(...)");
                        fVar2.r(new bk.i(byteArray, headerFields));
                    }
                }
            } catch (Exception e4) {
                ch.n.e("HttpsUrlDownloader", e4);
                boolean z10 = true;
                if (e4 instanceof SocketException ? true : e4 instanceof SocketTimeoutException ? true : e4 instanceof SSLException ? true : e4 instanceof ConnectException) {
                    t0(str, map, i10);
                } else {
                    if (!(e4 instanceof UnknownHostException)) {
                        z10 = e4 instanceof NoRouteToHostException;
                    }
                    if (z10) {
                        om.f fVar3 = (om.f) this.f20680g;
                        if (fVar3 != null) {
                            fVar3.r(bk.g.f2813a);
                        }
                    } else {
                        om.f fVar4 = (om.f) this.f20680g;
                        if (fVar4 != null) {
                            fVar4.r(new bk.j(e4, 2));
                        }
                    }
                }
            }
        } finally {
            Thread threadCurrentThread2 = Thread.currentThread();
            l.d(threadCurrentThread2, "currentThread(...)");
            cVar.B(threadCurrentThread2);
        }
    }

    @Override // jt.b
    public b0 x(lt.d dVar) {
        return jt.g.h(dVar);
    }

    public sg.d x0(pg.d dVar) throws JSONException, og.c {
        String string;
        JSONArray jSONArray = dVar.f20504g;
        long j = dVar.f20503f;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    io.sentry.android.core.e0.p("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                pg.d dVarC = ((pg.c) this.f20679d).c();
                String string3 = null;
                if (dVarC == null) {
                    string = null;
                } else {
                    try {
                        string = dVarC.f20499b.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    pg.d dVarC2 = ((pg.c) this.f20680g).c();
                    if (dVarC2 != null) {
                        try {
                            string3 = dVarC2.f20499b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i11 = sg.e.f22046a;
                sg.b bVar = new sg.b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                bVar.f22034a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                bVar.f22035b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                bVar.f22036c = strOptString;
                bVar.f22037d = string;
                bVar.f22038e = j;
                bVar.f22039f = (byte) (bVar.f22039f | 1);
                hashSet.add(bVar.a());
            } catch (JSONException e4) {
                throw new og.c(e4, "Exception parsing rollouts metadata to create RolloutsState.");
            }
        }
        return new sg.d(hashSet);
    }

    @Override // jt.b
    public boolean y(lt.e eVar) {
        return jt.g.B(eVar);
    }

    public CameraPosition y0() {
        try {
            vc.g gVar = (vc.g) this.f20679d;
            Parcel parcelE = gVar.e(gVar.R(), 1);
            CameraPosition cameraPosition = (CameraPosition) qc.l.a(parcelE, CameraPosition.CREATOR);
            parcelE.recycle();
            return cameraPosition;
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    @Override // th.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean z(java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.a.z(java.lang.String):boolean");
    }

    public /* synthetic */ a(int i10, Object obj) {
        this.f20678a = i10;
        this.f20680g = obj;
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2, boolean z10) {
        this.f20678a = i10;
        this.f20680g = obj;
        this.f20679d = obj2;
    }

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f20678a = i10;
        this.f20679d = obj;
        this.f20680g = obj2;
    }

    public a(IBinder iBinder) throws RemoteException {
        this.f20678a = 25;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f20679d = new Messenger(iBinder);
            this.f20680g = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f20680g = new zzd(iBinder);
            this.f20679d = null;
        } else {
            io.sentry.android.core.e0.p("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public a(vc.g gVar) {
        this.f20678a = 14;
        new HashMap();
        new HashMap();
        cc.s.h(gVar);
        this.f20679d = gVar;
    }

    public a(HashMap map, jt.c cVar) {
        this.f20678a = 12;
        l.e(cVar, "equalityAxioms");
        this.f20679d = map;
        this.f20680g = cVar;
    }

    public a(a aVar, p pVar) {
        this.f20678a = 9;
        l.e(pVar, "connectionDetailsFetcher");
        this.f20679d = aVar;
        this.f20680g = pVar;
    }

    public a(ch.d dVar) {
        this.f20678a = 20;
        this.f20679d = dVar;
        this.f20680g = new ak.g("", -1, -1, "", "", ak.p.a(), new w0(new t0(), ak.n.f619a, true));
        H0();
    }

    public a(io.sentry.internal.debugmeta.c cVar, cj.a aVar) {
        this.f20678a = 11;
        this.f20679d = cVar;
    }

    public a(io.sentry.internal.debugmeta.c cVar) {
        this.f20678a = 10;
        this.f20679d = cVar;
    }

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f20678a = 26;
        this.f20679d = cryptoInfo;
        this.f20680g = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public a(p5.b bVar) {
        this.f20678a = 13;
        this.f20679d = bVar;
        this.f20680g = new AtomicBoolean(false);
    }

    public a(float[] fArr) {
        this.f20678a = 23;
        this.f20679d = fArr;
        this.f20680g = new int[2];
    }

    @Override // jt.b
    public void d(lt.e eVar, lt.g gVar) {
    }
}
