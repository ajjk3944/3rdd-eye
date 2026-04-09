package o7;

import a0.a0;
import a0.s;
import android.content.ClipDescription;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.lifecycle.f1;
import b4.o;
import bb.t;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.d81;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.z0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.ProActivity;
import d3.p;
import d8.b0;
import d8.e0;
import d8.w;
import eb.e;
import ec.g4;
import ec.k4;
import ec.o1;
import ec.s0;
import ed.j;
import ed.l;
import f7.c0;
import fb.h;
import i.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import nk.k;
import o.m;
import o.x;
import si.g;
import si.i;
import x7.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements s, PAGNativeAdInteractionListener, i, b4.c, g, w, k4, d81, f, he.a, x, d1.d, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30420a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30421b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f30420a = i4;
        this.f30421b = obj;
    }

    public static void m(Context context, pa.g gVar, ib.a aVar) {
        sk.a(context);
        if (((Boolean) sl.j.u()).booleanValue()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16373vc)).booleanValue()) {
                za.b.f38135b.execute(new o(context, gVar, aVar, false, 16));
                return;
            }
        }
        new rt(0, context, gVar.f31526a).r(aVar);
    }

    public static d n(int i4, int i10, int i11, boolean z3) {
        return new d(18, AccessibilityNodeInfo.CollectionInfo.obtain(i4, i10, z3, i11));
    }

    @Override // ec.k4
    public void M(String str, String str2, Bundle bundle) {
        g4 g4Var = (g4) this.f30421b;
        if (!TextUtils.isEmpty(str)) {
            g4Var.b().K(new ab.c(this, str, str2, bundle));
            return;
        }
        o1 o1Var = g4Var.f22740l;
        if (o1Var != null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.e(str2, "AppId not known when logging event");
        }
    }

    public ed.d a(ed.d dVar) {
        return dVar instanceof l ? dVar : new ed.b(-((j) this.f30421b).j(), dVar);
    }

    @Override // com.google.android.gms.internal.ads.d81
    /* renamed from: b */
    public vd.b mo166b() {
        h hVar = (h) this.f30421b;
        return (vd.b) hVar.m4(hVar.f23913c, null, "BANNER", null, null, 0, null, new Bundle(), null).f18259b.a();
    }

    @Override // si.g
    public void c() {
        ((bh.w) this.f30421b).f2248f.h(wd.b.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b4.c
    public void close() throws Exception {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f30421b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                a3.a.k((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // x7.f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f30421b)) {
            ((ByteBuffer) this.f30421b).position(0);
            messageDigest.update(((ByteBuffer) this.f30421b).putInt(num.intValue()).array());
        }
    }

    @Override // o.x
    public void e(m mVar, boolean z3) {
        ((v) this.f30421b).r(mVar);
    }

    @Override // si.i
    public void f() {
        Toast.makeText((ProActivity) this.f30421b, R.string.current_unsupport_iap, 0).show();
    }

    public long g(long j) {
        d2.b bVar = (d2.b) this.f30421b;
        bVar.getClass();
        if (p.b(j) <= 0.0f || p.c(j) <= 0.0f) {
            f2.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) p.f(j)));
        }
        return pd.b.a(((d2.d) bVar.f21939b).b(p.b(j)), ((d2.d) bVar.f21940c).b(p.c(j)));
    }

    @Override // a0.s
    public a0 get(int i4) {
        return (a0) this.f30421b;
    }

    @Override // si.g
    public void h(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k.a(((si.c) it.next()).f33798a, "devinfo_vip");
            }
        }
        ((bh.w) this.f30421b).f2248f.h(wd.b.b());
    }

    @Override // d8.w
    public d8.v i(b0 b0Var) {
        switch (this.f30420a) {
            case 11:
                return new d8.b((Resources) this.f30421b, e0.f22009b);
            default:
                return new e8.a((d) this.f30421b);
        }
    }

    @Override // he.a
    public void j(Bundle bundle) {
        ((ae.c) ((ae.b) this.f30421b)).a("clx", "_ae", bundle);
    }

    public c0 k(Context context, String str, InputStream inputStream, String str2, String str3) {
        c0 c0VarG;
        b bVar;
        c cVar = (c) this.f30421b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            r7.d.a();
            b bVar2 = b.ZIP;
            c0VarG = str3 != null ? f7.o.g(context, new ZipInputStream(new FileInputStream(cVar.A(str, inputStream, bVar2))), str) : f7.o.g(context, new ZipInputStream(inputStream), null);
            bVar = bVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            r7.d.a();
            bVar = b.GZIP;
            c0VarG = str3 != null ? f7.o.d(new GZIPInputStream(new FileInputStream(cVar.A(str, inputStream, bVar))), str) : f7.o.d(new GZIPInputStream(inputStream), null);
        } else {
            r7.d.a();
            bVar = b.JSON;
            c0VarG = str3 != null ? f7.o.d(new FileInputStream(cVar.A(str, inputStream, bVar).getAbsolutePath()), str) : f7.o.d(inputStream, null);
        }
        if (str3 != null && c0VarG.f23716a != null) {
            File file = new File(cVar.w(), c.u(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            r7.d.a();
            if (!zRenameTo) {
                r7.d.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c0VarG;
    }

    @Override // b4.c
    public Cursor l(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f30421b;
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

    public void o(be.b bVar) {
        k1 k1Var = (k1) this.f30421b;
        ArrayList arrayList = k1Var.f19796c;
        synchronized (arrayList) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i4)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            h1 h1Var = new h1(bVar);
            arrayList.add(new Pair(bVar, h1Var));
            if (k1Var.f19799f != null) {
                try {
                    k1Var.f19799f.registerOnMeasurementEventListener(h1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            k1Var.c(new z0(k1Var, h1Var, 3));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        t tVar = ((aa.l) this.f30421b).f289v;
        if (tVar != null) {
            tVar.h();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        t tVar = ((aa.l) this.f30421b).f289v;
        if (tVar != null) {
            tVar.g();
        }
    }

    @Override // si.i
    public void p() {
        ah.o.f400d.s((ProActivity) this.f30421b, 1, Collections.singletonList("devinfo_vip"), new c(3, this));
    }

    public void q() throws CameraAccessException {
        f1 f1Var = (f1) this.f30421b;
        if (f1Var == null || TextUtils.isEmpty((String) f1Var.f1135c) || !f1Var.D()) {
            return;
        }
        try {
            ((CameraManager) f1Var.f1134b).setTorchMode((String) f1Var.f1135c, false);
        } catch (Exception unused) {
        }
    }

    public void r(ImageView.ScaleType scaleType) {
        bn bnVar = ((e) this.f30421b).f22531b;
        if (bnVar == null || scaleType == null) {
            return;
        }
        try {
            bnVar.D3(new vb.b(scaleType));
        } catch (RemoteException e2) {
            za.i.f("Unable to call setMediaViewImageScaleType on delegate", e2);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        re.a aVar = (re.a) obj;
        y4.a aVar2 = (y4.a) this.f30421b;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        je.m mVar = (je.m) aVar2.f37324b;
        je.m mVar2 = (je.m) aVar2.f37324b;
        je.m.a(mVar);
        mVar2.f27578m.h(null, mVar2.f27572e.f28258a);
        mVar2.f27582q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override // o.x
    public boolean v(m mVar) {
        Window.Callback callback = ((v) this.f30421b).f25375l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    public d(Context context, int i4) throws CameraAccessException {
        Boolean bool;
        Integer num;
        this.f30420a = i4;
        switch (i4) {
            case 29:
                CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                if (cameraManager == null) {
                    throw new IllegalStateException("cameraManager is null");
                }
                f1 f1Var = new f1(14, false);
                String str = null;
                f1Var.f1136d = null;
                f1Var.f1137e = null;
                f1Var.f1134b = cameraManager;
                try {
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    int length = cameraIdList.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            String str2 = cameraIdList[i10];
                            try {
                                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                                bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                                num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                            } catch (Throwable unused) {
                            }
                            if (bool == null || !bool.booleanValue() || num == null || num.intValue() != 1) {
                                i10++;
                            } else {
                                str = str2;
                            }
                        }
                    }
                } catch (CameraAccessException unused2) {
                }
                f1Var.f1135c = str;
                ji.a aVar = new ji.a(f1Var);
                f1Var.f1138f = aVar;
                ((CameraManager) f1Var.f1134b).registerTorchCallback(aVar, aVar.f27681a);
                this.f30421b = f1Var;
                return;
            default:
                this.f30421b = new b8.e(context);
                return;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    public d(c cVar, j6.i iVar) {
        this.f30420a = 0;
        this.f30421b = cVar;
    }

    public d(int i4) {
        this.f30420a = i4;
        switch (i4) {
            case 10:
                this.f30421b = new d8.s(2, 500L);
                break;
            case 13:
                this.f30421b = new d(10);
                break;
            case 17:
                this.f30421b = new z2.k();
                break;
            case 19:
                this.f30421b = new HashSet();
                break;
            case 22:
                this.f30421b = ByteBuffer.allocate(4);
                break;
            case 27:
                d1.c cVar = new d1.c();
                this.f30421b = cVar;
                if (!cVar.f21933b) {
                    if (cVar.f21934c) {
                        e1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.f21934c = true;
                    break;
                }
                break;
            default:
                this.f30421b = new d2.b();
                break;
        }
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f30420a = 21;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f30421b = new g4.e(uri, clipDescription, uri2);
        } else {
            this.f30421b = new yb.e(uri, clipDescription, uri2, 22);
        }
    }

    public d(Context context, Uri uri) {
        this.f30420a = 4;
        this.f30421b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
