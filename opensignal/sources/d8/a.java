package d8;

import a5.a0;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.opengl.Matrix;
import android.os.Bundle;
import bf.o;
import br.l;
import cc.s;
import com.google.firebase.messaging.FirebaseMessaging;
import cv.d0;
import cv.h0;
import cv.u;
import cv.w;
import g4.j;
import io.sentry.android.core.u0;
import io.sentry.q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import oh.p;
import p.v2;
import q8.i;
import zc.r0;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f7147a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7148b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7149c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7150d;

    public a(r0 r0Var, String str) {
        this.f7150d = r0Var;
        s.e(str);
        this.f7149c = str;
    }

    public static void d(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    public void a() {
        qu.g gVar = (qu.g) this.f7150d;
        synchronized (gVar) {
            try {
                if (this.f7148b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (l.a(((qu.d) this.f7149c).f21077g, this)) {
                    gVar.f(this, false);
                }
                this.f7148b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        qu.g gVar = (qu.g) this.f7150d;
        synchronized (gVar) {
            try {
                if (this.f7148b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (l.a(((qu.d) this.f7149c).f21077g, this)) {
                    gVar.f(this, true);
                }
                this.f7148b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(boolean z10) {
        f fVar = (f) this.f7150d;
        synchronized (fVar) {
            try {
                if (this.f7148b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (l.a(((b) this.f7149c).f7157g, this)) {
                    f.b(fVar, this, z10);
                }
                this.f7148b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        qu.d dVar = (qu.d) this.f7149c;
        if (l.a(dVar.f21077g, this)) {
            qu.g gVar = (qu.g) this.f7150d;
            if (gVar.G) {
                gVar.f(this, false);
            } else {
                dVar.f21076f = true;
            }
        }
    }

    public w f(int i10) {
        w wVar;
        f fVar = (f) this.f7150d;
        synchronized (fVar) {
            if (this.f7148b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f7147a)[i10] = true;
            Object obj = ((b) this.f7149c).f7154d.get(i10);
            d dVar = fVar.L;
            w wVar2 = (w) obj;
            if (!dVar.f(wVar2)) {
                i.a(dVar.k(wVar2));
            }
            wVar = (w) obj;
        }
        return wVar;
    }

    public int[] g() {
        synchronized (this) {
            try {
                if (!this.f7148b) {
                    return null;
                }
                long[] jArr = (long[]) this.f7149c;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z10 = jArr[i10] > 0;
                    boolean[] zArr = (boolean[]) this.f7147a;
                    if (z10 != zArr[i11]) {
                        int[] iArr = (int[]) this.f7150d;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        ((int[]) this.f7150d)[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.f7148b = false;
                return (int[]) ((int[]) this.f7150d).clone();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p h() {
        return (p) this.f7150d;
    }

    public synchronized void i() {
        try {
            if (this.f7148b) {
                return;
            }
            Boolean boolM = m();
            this.f7147a = boolM;
            if (boolM == null) {
                u0 u0Var = new u0(13);
                o oVar = (o) ((bg.c) this.f7149c);
                oVar.a(oVar.f2732c, u0Var);
            }
            this.f7148b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean j() {
        Boolean bool;
        try {
            i();
            bool = (Boolean) this.f7147a;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f7150d).f5822a.h();
    }

    public void k(yh.c cVar) {
        this.f7149c = cVar;
    }

    public d0 l(int i10) {
        cv.b bVar;
        qu.g gVar = (qu.g) this.f7150d;
        synchronized (gVar) {
            try {
                if (this.f7148b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!l.a(((qu.d) this.f7149c).f21077g, this)) {
                    return new cv.e();
                }
                if (!((qu.d) this.f7149c).f21075e) {
                    boolean[] zArr = (boolean[]) this.f7147a;
                    l.b(zArr);
                    zArr[i10] = true;
                }
                File file = (File) ((qu.d) this.f7149c).f21074d.get(i10);
                try {
                    l.e(file, "file");
                    try {
                        Logger logger = u.f6739a;
                        bVar = new cv.b(xu.l.j(file, new FileOutputStream(file, false), false), new h0());
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        Logger logger2 = u.f6739a;
                        bVar = new cv.b(xu.l.j(file, new FileOutputStream(file, false), false), new h0());
                    }
                    return new g(bVar, new c7.b(gVar, 21, this));
                } catch (FileNotFoundException unused2) {
                    return new cv.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        se.f fVar = ((FirebaseMessaging) this.f7150d).f5822a;
        fVar.a();
        Context context = fVar.f22007a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public String n() {
        if (!this.f7148b) {
            this.f7148b = true;
            r0 r0Var = (r0) this.f7150d;
            this.f7147a = r0Var.w1().getString((String) this.f7149c, null);
        }
        return (String) this.f7147a;
    }

    public void o(String str) {
        SharedPreferences.Editor editorEdit = ((r0) this.f7150d).w1().edit();
        editorEdit.putString((String) this.f7149c, str);
        editorEdit.apply();
        this.f7147a = str;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [float[], java.io.Serializable] */
    public a(int i10, boolean z10) {
        switch (i10) {
            case j.STRING_FIELD_NUMBER /* 5 */:
                this.f7149c = new Object();
                this.f7147a = new ArrayList();
                this.f7150d = new ArrayList();
                this.f7148b = true;
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                this.f7149c = null;
                this.f7147a = q3.AUTO;
                this.f7148b = false;
                this.f7150d = "manual";
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f7149c = new float[16];
                this.f7147a = new float[16];
                this.f7150d = new a0(1);
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                this.f7149c = null;
                this.f7148b = false;
                this.f7147a = new ArrayList();
                this.f7150d = new p(29, this);
                break;
        }
    }

    public a(v2 v2Var, boolean z10) {
        this.f7150d = v2Var;
        this.f7147a = new AtomicReference(null);
        this.f7148b = z10;
        this.f7149c = new AtomicMarkableReference(new kf.d(z10 ? 8192 : 1024), false);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean[], java.io.Serializable] */
    public a(f fVar, b bVar) {
        this.f7150d = fVar;
        this.f7149c = bVar;
        this.f7147a = new boolean[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public a(qu.g gVar, qu.d dVar) {
        ?? r12;
        this.f7150d = gVar;
        this.f7149c = dVar;
        if (dVar.f21075e) {
            r12 = 0;
        } else {
            gVar.getClass();
            r12 = new boolean[2];
        }
        this.f7147a = r12;
    }
}
