package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import dalvik.system.DexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.hz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1291hz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14624a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f14625b;

    /* renamed from: c, reason: collision with root package name */
    public final Yy f14626c;

    /* renamed from: d, reason: collision with root package name */
    public final C1237gz f14627d;

    /* renamed from: e, reason: collision with root package name */
    public final C1948uA f14628e;

    /* renamed from: f, reason: collision with root package name */
    public final RB f14629f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f14630g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final long f14631h;
    public final File i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14632j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f14633k;

    /* renamed from: l, reason: collision with root package name */
    public DexClassLoader f14634l;

    public C1291hz(Context context, ExecutorService executorService, Yy yy, C1237gz c1237gz, File file, C1948uA c1948uA, long j6, RB rb) {
        this.f14624a = context;
        this.f14625b = executorService;
        this.f14626c = yy;
        this.f14627d = c1237gz;
        this.f14628e = c1948uA;
        this.f14629f = rb;
        this.i = new File(file, "rbp");
        this.f14631h = j6;
    }

    public static void d(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void e(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0284: INVOKE (r0 I:com.google.android.gms.internal.ads.tA) VIRTUAL call: com.google.android.gms.internal.ads.tA.c():void A[Catch: all -> 0x0282, MD:():void (m), TRY_ENTER] (LINE:645), block:B:118:0x0284 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0209 A[Catch: all -> 0x0031, jy -> 0x0034, TryCatch #15 {jy -> 0x0034, all -> 0x0031, blocks: (B:4:0x0009, B:7:0x000f, B:9:0x0018, B:11:0x0027, B:21:0x003d, B:22:0x003f, B:33:0x009e, B:83:0x01df, B:84:0x01fd, B:85:0x0203, B:87:0x0209, B:89:0x021f, B:90:0x0230, B:93:0x0234, B:94:0x0252, B:36:0x00d5, B:47:0x0122, B:66:0x01a5, B:67:0x01a8, B:76:0x01b9, B:77:0x01bf, B:79:0x01c2, B:25:0x0077, B:32:0x009b, B:99:0x025b, B:98:0x0258, B:100:0x025c, B:101:0x0261, B:102:0x0262, B:103:0x0267, B:104:0x0268, B:105:0x026d, B:106:0x026e, B:107:0x0273), top: B:138:0x0009, outer: #1, inners: #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a() {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1291hz.a():void");
    }

    public final Method b(String str, String str2) {
        Future future = (Future) this.f14630g.get(new Pair(str, str2));
        C1948uA c1948uA = this.f14628e;
        if (future == null) {
            c1948uA.b(302);
            return null;
        }
        try {
            return (Method) future.get(this.f14631h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            c1948uA.b(304);
            return null;
        } catch (TimeoutException unused2) {
            c1948uA.b(303);
            return null;
        }
    }

    public final void c(File file) throws Throwable {
        FileInputStream fileInputStream;
        if (new File(file.toString().concat("/1764808731656.tmp")).exists()) {
            return;
        }
        File file2 = new File(file.toString().concat("/1764808731656.dex"));
        if (!file2.exists()) {
            return;
        }
        long length = file2.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file2);
            } catch (C1183fz e6) {
                e = e6;
            } catch (IOException e7) {
                e = e7;
            }
            try {
            } catch (C1183fz e8) {
                e = e8;
                fileInputStream2 = fileInputStream;
                this.f14628e.d(301, e);
                e(fileInputStream2);
                d(file2);
                return;
            } catch (IOException e9) {
                e = e9;
                fileInputStream2 = fileInputStream;
                this.f14628e.d(301, e);
                e(fileInputStream2);
                d(file2);
                return;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                e(fileInputStream2);
                d(file2);
                throw th;
            }
            if (fileInputStream.read(bArr) <= 0) {
                e(fileInputStream);
                d(file2);
                return;
            }
            C1245h6 c1245h6F = C1299i6.F();
            byte[] bytes = Build.VERSION.SDK.getBytes();
            OK ok = QK.f10609b;
            OK okR = QK.r(0, bytes.length, bytes);
            c1245h6F.b();
            ((C1299i6) c1245h6F.f13551b).J(okR);
            byte[] bytes2 = "1764808731656".getBytes();
            OK okR2 = QK.r(0, bytes2.length, bytes2);
            c1245h6F.b();
            ((C1299i6) c1245h6F.f13551b).I(okR2);
            throw new C1183fz();
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
