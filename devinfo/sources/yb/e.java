package yb;

import a0.x0;
import android.app.Application;
import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.c0;
import androidx.lifecycle.d1;
import androidx.lifecycle.f1;
import androidx.lifecycle.y0;
import bh.w;
import c1.n;
import c1.p;
import c1.q;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.internal.consent_sdk.d0;
import com.google.android.gms.internal.consent_sdk.e0;
import com.google.android.gms.internal.consent_sdk.e6;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.i0;
import com.google.android.gms.internal.consent_sdk.i7;
import com.google.android.gms.internal.consent_sdk.j0;
import com.google.android.gms.internal.consent_sdk.l0;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.play_billing.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.Sku;
import ec.g4;
import ec.o1;
import ec.s2;
import ec.u0;
import fb.r;
import g8.y;
import i.f0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import pb.j;
import pb.m;
import pb.o;
import xk.x;
import zj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements AppSetIdClient, si.a, i7, ga.b, s2, u0, f1.f, g4.f, he.b, he.a {

    /* renamed from: e, reason: collision with root package name */
    public static e f37506e;

    /* renamed from: f, reason: collision with root package name */
    public static e f37507f;
    public static e g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37508a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37509b;

    /* renamed from: c, reason: collision with root package name */
    public Object f37510c;

    /* renamed from: d, reason: collision with root package name */
    public Object f37511d;

    public /* synthetic */ e(int i4, boolean z3) {
        this.f37508a = i4;
    }

    public static final SharedPreferences B(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void C(Context context) throws d {
        if (B(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public static void t(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public synchronized void A(int i4, int i10, long j, long j8) {
        ((o1) this.f37509b).f22957k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f37511d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((rb.b) this.f37510c).c(new m(0, Arrays.asList(new j(36301, i4, 0, j, j8, null, null, 0, i10)))).addOnFailureListener(new androidx.recyclerview.widget.d(this, jElapsedRealtime, 8));
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    public Object a() {
        Application application = (Application) ((e6) this.f37510c).f19335b;
        i0 i0Var = j0.f19384b;
        l0.c(i0Var);
        return new e0(application, i0Var, (d0) ((h7) this.f37511d).a(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.String] */
    @Override // ec.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.e.b(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @Override // si.a
    public void c() {
        w wVar = (w) this.f37509b;
        wVar.f2254n = null;
        wVar.f2246d.h(hg.e.e(R.string.failed_try_again_later));
        r5.c.t(false, wVar.f2244b);
    }

    @Override // si.a
    public void cancel() {
        w wVar = (w) this.f37509b;
        wVar.f2254n = null;
        wVar.f2246d.h(hg.e.e(R.string.pay_cancel));
        r5.c.t(false, wVar.f2244b);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f37508a) {
            case 9:
                e eVar = new e(((com.google.android.gms.internal.measurement.b) this.f37509b).clone());
                ArrayList arrayList = (ArrayList) this.f37511d;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((ArrayList) eVar.f37511d).add(((com.google.android.gms.internal.measurement.b) obj).clone());
                }
                return eVar;
            default:
                return super.clone();
        }
    }

    @Override // g4.f
    public Uri d() {
        return (Uri) this.f37509b;
    }

    @Override // g4.f
    public Uri f() {
        return (Uri) this.f37511d;
    }

    @Override // si.a
    public void g(si.c cVar) {
        w wVar = (w) this.f37509b;
        x.v(y0.g(wVar), null, null, new al.m((String) this.f37510c, (Sku) this.f37511d, cVar, wVar, null, 3), 3);
    }

    @Override // xj.a
    public Object get() {
        switch (this.f37508a) {
            case 5:
                long jB = n.b();
                if (jB == q.f2581a) {
                    return this.f37511d;
                }
                p pVar = (p) ((AtomicReference) this.f37509b).get();
                int iA = pVar.a(jB);
                if (iA >= 0) {
                    return pVar.f2580c[iA];
                }
                return null;
            default:
                return new ea.q(new i7.b(), new ja.c(), (ja.b) ((f1) this.f37509b).get(), (com.google.android.gms.internal.consent_sdk.d) ((pe.c) this.f37510c).get(), (x0) ((x0) this.f37511d).get());
        }
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public Task getAppSetIdInfo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((ExecutorService) this.f37511d).execute(new r(25, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // g4.f
    public ClipDescription getDescription() {
        return (ClipDescription) this.f37510c;
    }

    @Override // g4.f
    public Object h() {
        return null;
    }

    public ea.i i() {
        String strConcat = ((String) this.f37509b) == null ? " backendName" : "";
        if (((ba.c) this.f37511d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new ea.i((String) this.f37509b, (byte[]) this.f37510c, (ba.c) this.f37511d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // he.a
    public void j(Bundle bundle) {
        synchronized (this.f37510c) {
            try {
                ge.e eVar = ge.e.f24699a;
                eVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f37511d = new CountDownLatch(1);
                ((o7.d) this.f37509b).j(bundle);
                eVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f37511d).await(500, TimeUnit.MILLISECONDS)) {
                        eVar.c("App exception callback received from Analytics listener.");
                    } else {
                        eVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f37511d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Bitmap k(BitmapFactory.Options options) {
        switch (this.f37508a) {
            case 23:
                return g8.w.b(new t8.a(t8.b.c((ByteBuffer) this.f37509b)), options, this);
            case 24:
                y yVar = (y) ((com.bumptech.glide.load.data.h) this.f37509b).f6523b;
                yVar.reset();
                return g8.w.b(yVar, options, this);
            default:
                return g8.w.a(((com.bumptech.glide.load.data.h) this.f37511d).e().getFileDescriptor(), options, this);
        }
    }

    public void l(FileOutputStream fileOutputStream) throws IOException {
        File file = (File) this.f37510c;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("AtomicFile", "Failed to close file output stream", e2);
        }
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    @Override // he.b
    public void m(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f37511d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void n(FileOutputStream fileOutputStream) throws IOException {
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("AtomicFile", "Failed to close file output stream", e2);
        }
        t((File) this.f37510c, (File) this.f37509b);
    }

    public ImageHeaderParser$ImageType o() throws Throwable {
        y yVar;
        switch (this.f37508a) {
            case 23:
                return d5.m((List) this.f37510c, t8.b.c((ByteBuffer) this.f37509b));
            case 24:
                List list = (List) this.f37511d;
                y yVar2 = (y) ((com.bumptech.glide.load.data.h) this.f37509b).f6523b;
                yVar2.reset();
                return d5.l(list, yVar2, (a8.g) this.f37510c);
            default:
                List list2 = (List) this.f37510c;
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f37511d;
                a8.g gVar = (a8.g) this.f37509b;
                int size = list2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    x7.d dVar = (x7.d) list2.get(i4);
                    y yVar3 = null;
                    try {
                        yVar = new y(new FileInputStream(hVar.e().getFileDescriptor()), gVar);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = dVar.c(yVar);
                        yVar.e();
                        hVar.e();
                        if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                            return imageHeaderParser$ImageTypeC;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        yVar3 = yVar;
                        if (yVar3 != null) {
                            yVar3.e();
                        }
                        hVar.e();
                        throw th;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Finally extract failed */
    public boolean p() throws Throwable {
        y yVar;
        switch (this.f37508a) {
            case 23:
                List list = (List) this.f37510c;
                ByteBuffer byteBufferC = t8.b.c((ByteBuffer) this.f37509b);
                a8.g gVar = (a8.g) this.f37511d;
                if (byteBufferC == null) {
                    return false;
                }
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    try {
                        if (((x7.d) list.get(i4)).b(byteBufferC, gVar)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 24:
                List list2 = (List) this.f37511d;
                y yVar2 = (y) ((com.bumptech.glide.load.data.h) this.f37509b).f6523b;
                yVar2.reset();
                a8.g gVar2 = (a8.g) this.f37510c;
                yVar2.mark(5242880);
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    try {
                        boolean zE = ((x7.d) list2.get(i10)).e(yVar2, gVar2);
                        yVar2.reset();
                        if (zE) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        yVar2.reset();
                        throw th2;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f37510c;
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f37511d;
                a8.g gVar3 = (a8.g) this.f37509b;
                int size3 = list3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    x7.d dVar = (x7.d) list3.get(i11);
                    y yVar3 = null;
                    try {
                        yVar = new y(new FileInputStream(hVar.e().getFileDescriptor()), gVar3);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        boolean zE2 = dVar.e(yVar, gVar3);
                        yVar.e();
                        hVar.e();
                        if (zE2) {
                            return true;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        yVar3 = yVar;
                        if (yVar3 != null) {
                            yVar3.e();
                        }
                        hVar.e();
                        throw th;
                    }
                }
                return false;
        }
    }

    public void q() {
        bh.c cVar = bh.c.f2188a;
        String str = (String) this.f37511d;
        SharedPreferences sharedPreferences = bh.c.f2189b;
        Set<String> set = u.f38319a;
        Set<String> stringSet = sharedPreferences.getStringSet("cant_consume_hw_order", set);
        if (stringSet != null) {
            set = stringSet;
        }
        Set<String> setU0 = zj.n.u0(set);
        if (!setU0.contains(str)) {
            setU0.add(str);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putStringSet("cant_consume_hw_order", setU0);
            editorEdit.apply();
        }
        w wVar = (w) this.f37509b;
        new Exception("consume order failed.");
        wVar.f2254n = null;
        r5.c.t(false, wVar.f2244b);
    }

    public void r(androidx.lifecycle.r rVar) {
        d1 d1Var = (d1) this.f37511d;
        if (d1Var != null) {
            d1Var.run();
        }
        d1 d1Var2 = new d1((c0) this.f37509b, rVar);
        this.f37511d = d1Var2;
        ((Handler) this.f37510c).postAtFrontOfQueue(d1Var2);
    }

    public void s(e4.n nVar) {
        ((CopyOnWriteArrayList) this.f37510c).remove(nVar);
        e4.m mVar = (e4.m) ((HashMap) this.f37511d).remove(nVar);
        if (mVar != null) {
            mVar.f22372a.b(mVar.f22373b);
            mVar.f22373b = null;
        }
        ((Runnable) this.f37509b).run();
    }

    public String toString() {
        switch (this.f37508a) {
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f37509b);
                sb2.append('{');
                k kVar = ((k) this.f37510c).f20165b;
                String str = "";
                while (kVar != null) {
                    Object obj = kVar.f20164a;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    kVar = kVar.f20165b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj) {
        long jB = n.b();
        if (jB == q.f2581a) {
            this.f37511d = obj;
            return;
        }
        synchronized (this.f37510c) {
            p pVar = (p) ((AtomicReference) this.f37509b).get();
            int iA = pVar.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.f37509b).set(pVar.b(obj, jB));
            } else {
                pVar.f2580c[iA] = obj;
            }
        }
    }

    public void v(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f37509b = str;
    }

    public FileOutputStream w() throws IOException {
        File file = (File) this.f37510c;
        File file2 = (File) this.f37511d;
        if (file2.exists()) {
            t(file2, (File) this.f37509b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Failed to create new file " + file, e2);
            }
        }
    }

    public void z() {
        x.e0 e0Var = (x.e0) this.f37509b;
        String str = (String) this.f37510c;
        List list = (List) e0Var.k(str);
        if (list != null) {
            list.remove((mk.a) this.f37511d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        e0Var.m(str, list);
    }

    public /* synthetic */ e(g4 g4Var, String str, Object obj, int i4) {
        this.f37508a = i4;
        this.f37509b = str;
        this.f37510c = obj;
        this.f37511d = g4Var;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i4) {
        this.f37508a = i4;
        this.f37509b = obj;
        this.f37510c = obj2;
        this.f37511d = obj3;
    }

    public e(Context context) {
        this.f37508a = 0;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f37510c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f37511d = Executors.newSingleThreadExecutor();
        this.f37509b = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new p.o1(22, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public e(Context context, o1 o1Var) {
        this.f37508a = 16;
        this.f37511d = new AtomicLong(-1L);
        this.f37510c = new rb.b(context, rb.b.f32899i, new o("measurement:api"), ob.e.f30483b);
        this.f37509b = o1Var;
    }

    public e(Context context, za.a aVar) {
        this.f37508a = 26;
        this.f37509b = context;
        this.f37510c = context.getPackageName();
        this.f37511d = aVar.f38129a;
    }

    public e(String str) {
        this.f37508a = 10;
        k kVar = new k();
        this.f37510c = kVar;
        this.f37511d = kVar;
        this.f37509b = str;
    }

    public e(com.google.android.gms.internal.measurement.b bVar) {
        this.f37508a = 9;
        this.f37509b = bVar;
        this.f37510c = bVar.clone();
        this.f37511d = new ArrayList();
    }

    public e(androidx.lifecycle.d0 d0Var) {
        this.f37508a = 2;
        this.f37509b = new c0(d0Var, true);
        this.f37510c = new Handler(Looper.getMainLooper());
    }

    public e(int i4) {
        this.f37508a = i4;
        switch (i4) {
            case 9:
                this.f37509b = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f37510c = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f37511d = new ArrayList();
                break;
            default:
                this.f37509b = new AtomicReference(n.f2568b);
                this.f37510c = new Object();
                break;
        }
    }

    private final void x() {
    }

    private final void y() {
    }

    @Override // g4.f
    public void e() {
    }

    public e(o7.d dVar) {
        this.f37508a = 28;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f37510c = new Object();
        this.f37509b = dVar;
    }

    public e(ad.b bVar, View view) {
        Object dVar;
        this.f37508a = 1;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            dVar = new ad.f();
        } else {
            dVar = i4 >= 33 ? new ad.d() : null;
        }
        this.f37509b = dVar;
        this.f37510c = bVar;
        this.f37511d = view;
    }

    public e(File file) {
        this.f37508a = 11;
        this.f37509b = file;
        this.f37510c = new File(file.getPath() + ".new");
        this.f37511d = new File(file.getPath() + ".bak");
    }

    public e(Runnable runnable) {
        this.f37508a = 12;
        this.f37510c = new CopyOnWriteArrayList();
        this.f37511d = new HashMap();
        this.f37509b = runnable;
    }

    public e(Context context, LocationManager locationManager) {
        this.f37508a = 29;
        this.f37511d = new f0();
        this.f37509b = context;
        this.f37510c = locationManager;
    }

    public e(t8.j jVar, ArrayList arrayList, a8.g gVar) {
        this.f37508a = 24;
        t8.f.c(gVar, "Argument must not be null");
        this.f37510c = gVar;
        t8.f.c(arrayList, "Argument must not be null");
        this.f37511d = arrayList;
        this.f37509b = new com.bumptech.glide.load.data.h(jVar, gVar);
    }

    public e(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, a8.g gVar) {
        this.f37508a = 25;
        t8.f.c(gVar, "Argument must not be null");
        this.f37509b = gVar;
        t8.f.c(arrayList, "Argument must not be null");
        this.f37510c = arrayList;
        this.f37511d = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }
}
