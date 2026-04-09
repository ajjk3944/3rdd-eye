package y4;

import ah.o;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.k2;
import androidx.recyclerview.widget.x1;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.ProActivity;
import g2.a1;
import g2.f0;
import g2.j0;
import g2.z0;
import i1.m;
import i2.a0;
import i2.e0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import je.t;
import org.json.JSONException;
import org.json.JSONObject;
import u0.d1;
import x.n0;
import x.p;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a implements si.i, OnCompleteListener, z0, x7.k, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public Object f37323a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37324b;

    public /* synthetic */ a(Object obj) {
        this.f37323a = obj;
        this.f37324b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y4.a a(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L27 java.lang.Error -> L2a java.io.IOException -> L2c
            y4.a r2 = new y4.a     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            return r2
        L21:
            r2 = move-exception
            goto L36
        L23:
            r2 = move-exception
            goto L36
        L25:
            r2 = move-exception
            goto L36
        L27:
            r2 = move-exception
        L28:
            r0 = r1
            goto L36
        L2a:
            r2 = move-exception
            goto L28
        L2c:
            r2 = move-exception
            goto L28
        L2e:
            r2 = move-exception
        L2f:
            r5 = r1
            r0 = r5
            goto L36
        L32:
            r2 = move-exception
            goto L2f
        L34:
            r2 = move-exception
            goto L2f
        L36:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L42
            r0.release()     // Catch: java.io.IOException -> L42
        L42:
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.io.IOException -> L47
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.a.a(android.content.Context):y4.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void e(e0 e0Var) {
        if (e0Var.Q > 0) {
            if (e0Var.H.f25677d == a0.f25571e && !e0Var.q() && !e0Var.r() && !e0Var.R && e0Var.I()) {
                m mVar = (m) e0Var.G.g;
                if ((mVar.f25557d & 256) != 0) {
                    while (mVar != null) {
                        if ((mVar.f25556c & 256) != 0) {
                            i2.j jVarE = mVar;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof i2.m) {
                                    i2.m mVar2 = (i2.m) jVarE;
                                    mVar2.p(i2.k.q(mVar2, 256));
                                } else if ((jVarE.f25556c & 256) != 0 && (jVarE instanceof i2.j)) {
                                    m mVar3 = jVarE.f25691p;
                                    int i4 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar3 != null) {
                                        if ((mVar3.f25556c & 256) != 0) {
                                            i4++;
                                            eVar = eVar;
                                            if (i4 == 1) {
                                                jVarE = mVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new m[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(mVar3);
                                            }
                                        }
                                        mVar3 = mVar3.f25559f;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                jVarE = i2.k.e(eVar);
                            }
                        }
                        if ((mVar.f25557d & 256) == 0) {
                            break;
                        } else {
                            mVar = mVar.f25559f;
                        }
                    }
                }
            }
            e0Var.P = false;
            w0.e eVarZ = e0Var.z();
            Object[] objArr = eVarZ.f36397a;
            int i10 = eVarZ.f36399c;
            for (int i11 = 0; i11 < i10; i11++) {
                e((e0) objArr[i11]);
            }
        }
    }

    @Override // g2.z0
    public a1 apply() {
        return ((f0) this.f37323a).f(this.f37324b);
    }

    @Override // g2.z0
    public boolean b() {
        return true;
    }

    public void c(x1 x1Var, androidx.recyclerview.widget.z0 z0Var) {
        n0 n0Var = (n0) this.f37323a;
        k2 k2VarA = (k2) n0Var.get(x1Var);
        if (k2VarA == null) {
            k2VarA = k2.a();
            n0Var.put(x1Var, k2VarA);
        }
        k2VarA.f1434c = z0Var;
        k2VarA.f1432a |= 8;
    }

    public boolean d(int i4, int i10) {
        return ((vg.b) ((ArrayList) this.f37323a).get(i4)).f36219a.equals(((vg.b) ((ArrayList) this.f37324b).get(i10)).f36219a);
    }

    @Override // si.i
    public void f() {
        Toast.makeText((ProActivity) this.f37324b, R.string.current_unsupport_iap, 0).show();
    }

    @Override // x7.b
    public boolean g(Object obj, File file, x7.h hVar) {
        return ((g8.b) this.f37324b).g(new g8.c((a8.b) this.f37323a, ((BitmapDrawable) ((y) obj).get()).getBitmap()), file, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory h(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.a.h(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // g2.z0
    public boolean i(com.applovin.impl.sdk.ad.f fVar) {
        return true;
    }

    public File j() {
        if (((File) this.f37323a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f37323a) == null) {
                        wd.f fVar = (wd.f) this.f37324b;
                        fVar.a();
                        this.f37323a = new File(fVar.f36614a.getFilesDir(), "PersistedInstallation." + ((wd.f) this.f37324b).c() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f37323a;
    }

    public j0 k() {
        return (j0) ((d1) this.f37324b).getValue();
    }

    public void l(ef.b bVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f23441a);
            jSONObject.put("Status", i3.e.c(bVar.f23442b));
            jSONObject.put("AuthToken", bVar.f23443c);
            jSONObject.put("RefreshToken", bVar.f23444d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f23446f);
            jSONObject.put("ExpiresInSecs", bVar.f23445e);
            jSONObject.put("FisError", bVar.g);
            wd.f fVar = (wd.f) this.f37324b;
            fVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f36614a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(j())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void m(int i4, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i4 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            he.b bVar = "clx".equals(bundle2.getString("_o")) ? (yb.e) this.f37323a : (o7.c) this.f37324b;
            if (bVar == null) {
                return;
            }
            bVar.m(bundle2, string);
        }
    }

    public void n() {
        ((c6.a) this.f37323a).a();
    }

    @Override // x7.k
    public int o(x7.h hVar) {
        return 2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((yb.i) this.f37324b).f37517c).remove((TaskCompletionSource) this.f37323a);
    }

    @Override // si.i
    public void p() {
        ProActivity proActivity = (ProActivity) this.f37324b;
        String str = (String) this.f37323a;
        int i4 = ProActivity.L;
        o.f400d.t(proActivity, 1, new ah.f(proActivity, str, true, false));
    }

    public void q(Bundle bundle) {
        c6.a aVar = (c6.a) this.f37323a;
        a6.f fVar = aVar.f2762a;
        if (!aVar.f2766e) {
            aVar.a();
        }
        if (fVar.j().f1110d.compareTo(s.f1183d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + fVar.j().f1110d).toString());
        }
        if (aVar.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleL = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleL = z3.l(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        aVar.f2767f = bundleL;
        aVar.g = true;
    }

    public void r(Bundle bundle) {
        c6.a aVar = (c6.a) this.f37323a;
        Bundle bundleD = com.bumptech.glide.d.d((yj.i[]) Arrays.copyOf(new yj.i[0], 0));
        Bundle bundle2 = aVar.f2767f;
        if (bundle2 != null) {
            bundleD.putAll(bundle2);
        }
        synchronized (aVar.f2764c) {
            for (Map.Entry entry : aVar.f2765d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((a6.d) entry.getValue()).a();
                nk.k.e(str, "key");
                bundleD.putBundle(str, bundleA);
            }
        }
        if (bundleD.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleD);
    }

    public androidx.recyclerview.widget.z0 s(x1 x1Var, int i4) {
        k2 k2Var;
        androidx.recyclerview.widget.z0 z0Var;
        n0 n0Var = (n0) this.f37323a;
        int iD = n0Var.d(x1Var);
        if (iD >= 0 && (k2Var = (k2) n0Var.j(iD)) != null) {
            int i10 = k2Var.f1432a;
            if ((i10 & i4) != 0) {
                int i11 = i10 & (~i4);
                k2Var.f1432a = i11;
                if (i4 == 4) {
                    z0Var = k2Var.f1433b;
                } else {
                    if (i4 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    z0Var = k2Var.f1434c;
                }
                if ((i11 & 12) == 0) {
                    n0Var.h(iD);
                    k2Var.f1432a = 0;
                    k2Var.f1433b = null;
                    k2Var.f1434c = null;
                    k2.f1431d.i(k2Var);
                }
                return z0Var;
            }
        }
        return null;
    }

    public ef.b t() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(j());
            while (true) {
                try {
                    int i4 = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (i4 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i4);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i10 = ef.b.f23440h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i11 = i3.e.d(5)[iOptInt];
        if (i11 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b11 = (byte) (((byte) (b10 | 2)) | 1);
        if (b11 == 3 && i11 != 0) {
            return new ef.b(strOptString, i11, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b11 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b11 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        je.m mVar = (je.m) this.f37324b;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            t tVar = mVar.f27569b;
            if (zBooleanValue) {
                ((TaskCompletionSource) tVar.g).trySetResult(null);
                return ((Task) this.f37323a).onSuccessTask(mVar.f27572e.f28258a, new o7.d(28, this));
            }
            tVar.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        pe.c cVar = mVar.g;
        Iterator it = pe.c.k(((File) cVar.f31752d).listFiles(je.m.f27566r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        pe.c cVar2 = ((pe.a) mVar.f27578m.f30845b).f31745b;
        pe.a.a(pe.c.k(((File) cVar2.f31754f).listFiles()));
        pe.a.a(pe.c.k(((File) cVar2.g).listFiles()));
        pe.a.a(pe.c.k(((File) cVar2.f31755h).listFiles()));
        mVar.f27582q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public void u(String str) {
        b8.b bVar;
        synchronized (this) {
            try {
                bVar = (b8.b) ((HashMap) this.f37323a).get(str);
                t8.f.c(bVar, "Argument must not be null");
                int i4 = bVar.f2071b;
                if (i4 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f2071b);
                }
                int i10 = i4 - 1;
                bVar.f2071b = i10;
                if (i10 == 0) {
                    b8.b bVar2 = (b8.b) ((HashMap) this.f37323a).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    ((b8.c) this.f37324b).b(bVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bVar.f2070a.unlock();
    }

    public void v() throws IOException {
        try {
            ((FileLock) this.f37324b).release();
            ((FileChannel) this.f37323a).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    public void w(x1 x1Var) {
        k2 k2Var = (k2) ((n0) this.f37323a).get(x1Var);
        if (k2Var == null) {
            return;
        }
        k2Var.f1432a &= -2;
    }

    public void x(x1 x1Var) {
        x.o oVar = (x.o) this.f37324b;
        int iK = oVar.k() - 1;
        while (true) {
            if (iK < 0) {
                break;
            }
            if (x1Var == oVar.l(iK)) {
                Object[] objArr = oVar.f36923c;
                Object obj = objArr[iK];
                Object obj2 = p.f36928a;
                if (obj != obj2) {
                    objArr[iK] = obj2;
                    oVar.f36921a = true;
                }
            } else {
                iK--;
            }
        }
        k2 k2Var = (k2) ((n0) this.f37323a).remove(x1Var);
        if (k2Var != null) {
            k2Var.f1432a = 0;
            k2Var.f1433b = null;
            k2Var.f1434c = null;
            k2.f1431d.i(k2Var);
        }
    }

    public void y() {
        if (((z1.b) this.f37324b) != null) {
            this.f37324b = null;
            ((c0.a0) this.f37323a).u0(true);
        }
    }

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f37323a = obj;
        this.f37324b = obj2;
    }

    public /* synthetic */ a(Object obj, boolean z3) {
        this.f37324b = obj;
    }

    public /* synthetic */ a(boolean z3, Object obj, Object obj2) {
        this.f37324b = obj;
        this.f37323a = obj2;
    }

    public a(c6.a aVar) {
        this.f37323a = aVar;
        this.f37324b = new yb.i(aVar);
    }

    public a(int i4) {
        switch (i4) {
            case 8:
                this.f37323a = new HashMap();
                this.f37324b = new b8.c(0);
                break;
            case 23:
                this.f37323a = new w0.e(new e0[16]);
                break;
            case 26:
                this.f37323a = new w0.e(new Reference[16]);
                this.f37324b = new ReferenceQueue();
                break;
            case 28:
                this.f37323a = new AtomicInteger();
                this.f37324b = new AtomicInteger();
                break;
            case 29:
                this.f37323a = new Rect();
                this.f37324b = new Rect();
                break;
            default:
                this.f37323a = new n0(0);
                this.f37324b = new x.o((Object) null);
                break;
        }
    }

    @Override // g2.z0
    public void cancel() {
    }
}
