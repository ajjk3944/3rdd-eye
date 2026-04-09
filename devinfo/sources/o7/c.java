package o7;

import a0.a0;
import a0.b0;
import a0.s;
import ad.g;
import android.app.ActivityManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.work.impl.WorkDatabase;
import b5.p0;
import b5.u0;
import b5.z;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.AppBarLayout;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.ProActivity;
import d8.d0;
import d8.v;
import d8.w;
import e4.c0;
import e4.c2;
import ec.a2;
import ec.b1;
import ec.o1;
import ec.q2;
import ec.r3;
import ec.s0;
import ec.x1;
import eg.l;
import i2.e0;
import i2.v1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import je.o;
import je.p;
import je.q;
import o.k;
import o.m;
import org.json.JSONException;
import org.json.JSONObject;
import p.d1;
import pi.i;
import si.h;
import u6.t;
import ua.j;
import w0.e;
import x7.f;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements s, PAGInterstitialAdInteractionListener, h, b4.c, f.b, w, x7.b, i, p81, f, he.b, ie.a, d1, k, SuccessContinuation, e4.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30418a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30419b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f30418a = i4;
        this.f30419b = obj;
    }

    public static c D(String str) {
        return new c(14, (TextUtils.isEmpty(str) || str.length() > 1) ? x1.UNINITIALIZED : a2.e(str.charAt(0)));
    }

    public static String u(String str, b bVar, boolean z3) {
        String strConcat = bVar.f30417a;
        if (z3) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b10)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return d.h.t("lottie_cache_", strReplaceAll, strConcat);
    }

    public static String z(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public File A(String str, InputStream inputStream, b bVar) throws IOException {
        File file = new File(w(), u(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                while (true) {
                    int i4 = inputStream.read(bArr);
                    if (i4 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i4);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    public void B() {
        r3 r3Var = (r3) this.f30419b;
        r3Var.B();
        o1 o1Var = (o1) r3Var.f218b;
        b1 b1Var = o1Var.f22953e;
        o1.k(b1Var);
        tb.a aVar = o1Var.f22957k;
        aVar.getClass();
        if (b1Var.L(System.currentTimeMillis())) {
            b1 b1Var2 = o1Var.f22953e;
            o1.k(b1Var2);
            b1Var2.f22564m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.f23060o.d("Detected application was in foreground");
                aVar.getClass();
                E(System.currentTimeMillis());
            }
        }
    }

    public void C(long j) {
        r3 r3Var = (r3) this.f30419b;
        r3Var.B();
        r3Var.F();
        o1 o1Var = (o1) r3Var.f218b;
        b1 b1Var = o1Var.f22953e;
        o1.k(b1Var);
        if (b1Var.L(j)) {
            o1.k(b1Var);
            b1Var.f22564m.b(true);
            o1Var.r().G();
        }
        o1.k(b1Var);
        b1Var.f22568q.b(j);
        if (b1Var.f22564m.a()) {
            E(j);
        }
    }

    public void E(long j) {
        r3 r3Var = (r3) this.f30419b;
        r3Var.B();
        o1 o1Var = (o1) r3Var.f218b;
        if (o1Var.e()) {
            b1 b1Var = o1Var.f22953e;
            o1.k(b1Var);
            b1Var.f22568q.b(j);
            o1Var.f22957k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23060o.e(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j8 = j / 1000;
            Long lValueOf = Long.valueOf(j8);
            q2 q2Var = o1Var.f22959m;
            o1.l(q2Var);
            q2Var.M(j, lValueOf, "auto", "_sid");
            o1.k(b1Var);
            b1Var.f22569r.b(j8);
            b1Var.f22564m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j8);
            o1.l(q2Var);
            q2Var.J(j, bundle, "auto", "_s");
            String strK = b1Var.f22574w.k();
            if (TextUtils.isEmpty(strK)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strK);
            o1.l(q2Var);
            q2Var.J(j, bundle2, "auto", "_ssr");
        }
    }

    @Override // pi.i
    public void a() {
        vd.a aVar = (vd.a) ((g) this.f30419b).f333b;
        ((l) aVar.f36215c).j0((kj.f) aVar.f36214b);
    }

    @Override // ie.a
    public void b(o oVar) {
        this.f30419b = oVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // si.h
    public void c() {
        ProActivity proActivity = (ProActivity) ((d) this.f30419b).f30421b;
        proActivity.J.setVisibility(8);
        Toast.makeText(proActivity, R.string.query_sku_failed, 0).show();
    }

    @Override // b4.c
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f30419b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // x7.f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l10 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f30419b)) {
            ((ByteBuffer) this.f30419b).position(0);
            messageDigest.update(((ByteBuffer) this.f30419b).putLong(l10.longValue()).array());
        }
    }

    @Override // si.h
    public void e(ArrayList arrayList) {
        ProActivity proActivity = (ProActivity) ((d) this.f30419b).f30421b;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            si.d dVar = (si.d) obj;
            if (TextUtils.equals(dVar.f33801a, "devinfo_vip")) {
                proActivity.D = dVar;
                if (!ah.o.f400d.c()) {
                    proActivity.J.setVisibility(8);
                    proActivity.findViewById(R.id.flag).setVisibility(0);
                    proActivity.E.setText(proActivity.D.f33804d);
                    proActivity.F.setText(proActivity.D.f33806f);
                    proActivity.H.setText(R.string.sku_name_pro_version);
                    proActivity.I.setText(R.string.pay_now);
                    proActivity.I.setOnClickListener(new ah.c(proActivity, 4));
                }
            }
        }
        if (proActivity.D == null) {
            c();
        }
    }

    @Override // o.k
    public boolean f(m mVar, MenuItem menuItem) {
        return false;
    }

    @Override // x7.b
    public boolean g(Object obj, File file, x7.h hVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        a8.g gVar = (a8.g) this.f30419b;
        byte[] bArr = (byte[]) gVar.e(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i4 = inputStream.read(bArr);
                        if (i4 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i4);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        gVar.i(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        gVar.i(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                gVar.i(bArr);
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    @Override // a0.s
    public a0 get(int i4) {
        return (b0) this.f30419b;
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        za.i.c("Initialized webview successfully for SDKCore.");
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Xa)).booleanValue()) {
            fb.h hVar = (fb.h) this.f30419b;
            t.B(hVar.f23920l, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(hVar.D.get())));
            hVar.C.set(true);
        }
    }

    @Override // d8.w
    public v i(d8.b0 b0Var) {
        switch (this.f30418a) {
            case 10:
                return new d8.c(1, (d0) this.f30419b);
            default:
                return new d8.b((Resources) this.f30419b, b0Var.b(Uri.class, InputStream.class));
        }
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f30419b;
        c2 c2Var2 = appBarLayout.getFitsSystemWindows() ? c2Var : null;
        if (!Objects.equals(appBarLayout.g, c2Var2)) {
            appBarLayout.g = c2Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.f20305w != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return c2Var;
    }

    @Override // f.b
    public void k(Object obj) {
        Map map = (Map) obj;
        u0 u0Var = (u0) this.f30419b;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
        }
        p0 p0Var = (p0) u0Var.G.pollFirst();
        if (p0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = p0Var.f1849a;
        int i10 = p0Var.f1850b;
        z zVarX = u0Var.f1879c.x(str);
        if (zVarX != null) {
            zVarX.M(i10, strArr, iArr);
            return;
        }
        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
    }

    @Override // b4.c
    public Cursor l(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f30419b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e2) {
            Log.w("FontsProvider", "Unable to query the content provider", e2);
            return null;
        }
    }

    @Override // he.b
    public void m(Bundle bundle, String str) {
        o oVar = (o) this.f30419b;
        if (oVar != null) {
            try {
                String str2 = "$A$:" + z(bundle, str);
                q qVar = oVar.f27586a;
                qVar.f27603o.f28258a.a(new p(qVar, System.currentTimeMillis() - qVar.f27594d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        j.C.f35265h.f("SignalGeneratorImpl.initializeWebViewForSignalCollection", th2);
        Pair pair = new Pair("sgf_reason", th2.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        fb.h hVar = (fb.h) this.f30419b;
        t.B(hVar.f23920l, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(hVar.D.get())));
        za.i.f("Failed to initialize webview for loading SDKCore. ", th2);
        pk pkVar = sk.Xa;
        va.s sVar = va.s.f36163e;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() || hVar.C.get() || hVar.D.getAndIncrement() >= ((Integer) sVar.f36166c.a(sk.Ya)).intValue()) {
            return;
        }
        hVar.k4();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        bb.q qVar = ((aa.h) this.f30419b).f279d;
        if (qVar != null) {
            qVar.h();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        bb.q qVar = ((aa.h) this.f30419b).f279d;
        if (qVar != null) {
            qVar.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        aa.h hVar = (aa.h) this.f30419b;
        bb.q qVar = hVar.f279d;
        if (qVar != null) {
            qVar.e();
            hVar.f279d.g();
        }
    }

    public void p(e0 e0Var) {
        if (!e0Var.H()) {
            f2.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((v1) this.f30419b).add(e0Var);
    }

    public void q(CancellationException cancellationException) {
        e eVar = (e) this.f30419b;
        int i4 = eVar.f36399c;
        xk.g[] gVarArr = new xk.g[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            gVarArr[i10] = ((d0.e) eVar.f36397a[i10]).f21704b;
        }
        for (int i11 = 0; i11 < i4; i11++) {
            gVarArr[i11].i(cancellationException);
        }
        if (eVar.f36399c == 0) {
            return;
        }
        f0.a.c("uncancelled requests present");
    }

    @Override // o.k
    public void s(m mVar) {
        i.d0 d0Var = (i.d0) this.f30419b;
        Window.Callback callback = d0Var.f25277c;
        if (d0Var.f25276b.f30779a.o()) {
            callback.onPanelClosed(108, mVar);
        } else if (callback.onPreparePanel(0, null, mVar)) {
            callback.onMenuOpened(108, mVar);
        }
    }

    @Override // pi.i
    public void t(String str) {
        vd.a aVar = (vd.a) ((g) this.f30419b).f333b;
        ((l) aVar.f36215c).j0((kj.f) aVar.f36214b);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        re.a aVar = (re.a) obj;
        je.m mVar = ((je.k) this.f30419b).f27563e;
        if (aVar != null) {
            return Tasks.whenAll((Task<?>[]) new Task[]{je.m.a(mVar), mVar.f27578m.h(null, mVar.f27572e.f28258a)});
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f30418a) {
            case 26:
                return ((v1) this.f30419b).toString();
            default:
                return super.toString();
        }
    }

    public File v(String str) {
        File file = new File(w(), u(str, b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(w(), u(str, b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(w(), u(str, b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public File w() {
        File file = new File(((f7.d) this.f30419b).f23718a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public boolean x(e0 e0Var) {
        if (!e0Var.H()) {
            f2.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((v1) this.f30419b).remove(e0Var);
    }

    public void y() {
        e eVar = (e) this.f30419b;
        sk.d dVarE = ci.b.E(0, eVar.f36399c);
        int i4 = dVarE.f33817a;
        int i10 = dVarE.f33818b;
        if (i4 <= i10) {
            while (true) {
                ((d0.e) eVar.f36397a[i4]).f21704b.resumeWith(u.f37649a);
                if (i4 == i10) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        eVar.h();
    }

    public c(jf.c cVar) {
        this.f30418a = 8;
        this.f30419b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) cVar.f27642b));
    }

    public c(WorkDatabase workDatabase) {
        this.f30418a = 7;
        nk.k.e(workDatabase, "workDatabase");
        this.f30419b = workDatabase;
    }

    public c(int i4) {
        this.f30418a = i4;
        switch (i4) {
            case 10:
                this.f30419b = new d0(7);
                break;
            case 18:
                this.f30419b = null;
                break;
            case 21:
                this.f30419b = ByteBuffer.allocate(8);
                break;
            case 23:
                break;
            case 26:
                this.f30419b = new v1(i2.k.f25698a);
                break;
            default:
                this.f30419b = new e(new d0.e[16]);
                break;
        }
    }

    public c(View view) {
        this.f30418a = 13;
        if (Build.VERSION.SDK_INT >= 30) {
            c0 c0Var = new c0(0, view);
            c0Var.f22312c = view;
            this.f30419b = c0Var;
            return;
        }
        this.f30419b = new e4.a0(0, view);
    }

    @Override // pi.i
    public /* synthetic */ void r() {
    }

    public c(long[] jArr) {
        x.w wVar;
        this.f30418a = 20;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            wVar = new x.w(jArrCopyOf.length);
            int i4 = wVar.f36953b;
            if (i4 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i4;
                    long[] jArr2 = wVar.f36952a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        nk.k.d(jArrCopyOf2, "copyOf(...)");
                        wVar.f36952a = jArrCopyOf2;
                    }
                    long[] jArr3 = wVar.f36952a;
                    int i10 = wVar.f36953b;
                    if (i4 != i10) {
                        zj.m.P(jArr3, jArr3, jArrCopyOf.length + i4, i4, i10);
                    }
                    zj.m.P(jArrCopyOf, jArr3, i4, 0, jArrCopyOf.length);
                    wVar.f36953b += jArrCopyOf.length;
                }
            } else {
                y.a.d("");
                throw null;
            }
        } else {
            wVar = new x.w(16);
        }
        this.f30419b = wVar;
    }

    public c(je.k kVar, String str) {
        this.f30418a = 27;
        this.f30419b = kVar;
    }

    public c(Context context, Uri uri) {
        this.f30418a = 4;
        this.f30419b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public c(float f10, float f11) {
        this.f30418a = 1;
        this.f30419b = new b0(f10, f11, 0.01f);
    }
}
