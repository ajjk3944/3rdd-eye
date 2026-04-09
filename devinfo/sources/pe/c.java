package pe;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.d;
import i0.f;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import me.z0;
import p4.g;
import pf.c1;
import pf.d0;
import pf.g1;
import pf.q0;
import pf.u0;
import sf.j;
import w9.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements ga.b, rf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31749a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31750b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31751c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f31752d;

    /* renamed from: e, reason: collision with root package name */
    public Object f31753e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f31754f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f31755h;

    public /* synthetic */ c(xj.a aVar, xj.a aVar2, xj.a aVar3, xj.a aVar4, xj.a aVar5, xj.a aVar6, xj.a aVar7, int i4) {
        this.f31749a = i4;
        this.f31750b = aVar;
        this.f31751c = aVar2;
        this.f31752d = aVar3;
        this.f31753e = aVar4;
        this.f31754f = aVar5;
        this.g = aVar6;
        this.f31755h = aVar7;
    }

    public static synchronized void g(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean j(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                j(file2);
            }
        }
        return file.delete();
    }

    public static List k(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.f31751c, str);
        if (file.exists() && j(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f31753e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void c(float f10, float f11, w9.c cVar) {
        float[] fArr = (float[]) this.g;
        fArr[0] = f10;
        fArr[1] = f11;
        e(fArr);
        cVar.f36543b = fArr[0];
        cVar.f36544c = fArr[1];
    }

    public void d(Path path) {
        path.transform((Matrix) this.f31750b);
        path.transform(((h) this.f31752d).f36563a);
        path.transform((Matrix) this.f31751c);
    }

    public void e(float[] fArr) {
        Matrix matrix = (Matrix) this.f31754f;
        matrix.reset();
        ((Matrix) this.f31751c).invert(matrix);
        matrix.mapPoints(fArr);
        ((h) this.f31752d).f36563a.invert(matrix);
        matrix.mapPoints(fArr);
        ((Matrix) this.f31750b).invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void f(float[] fArr) {
        ((Matrix) this.f31750b).mapPoints(fArr);
        ((h) this.f31752d).f36563a.mapPoints(fArr);
        ((Matrix) this.f31751c).mapPoints(fArr);
    }

    @Override // xj.a
    public Object get() {
        switch (this.f31749a) {
            case 2:
                return new d((Context) ((xj.a) this.f31750b).get(), (fa.d) ((xj.a) this.f31751c).get(), (la.d) ((xj.a) this.f31752d).get(), (f) ((f) this.f31753e).get(), (Executor) ((xj.a) this.f31754f).get(), (ma.c) ((xj.a) this.g).get(), new i7.b(), new ja.c(), (la.c) ((xj.a) this.f31755h).get());
            default:
                return new c1((j) ((xj.a) this.f31750b).get(), (u0) ((xj.a) this.f31751c).get(), (q0) ((xj.a) this.f31752d).get(), (g1) ((xj.a) this.f31753e).get(), (g) ((xj.a) this.f31754f).get(), (d0) ((rf.d) this.g).get(), (ck.h) ((xj.a) this.f31755h).get());
        }
    }

    public void h() {
        h hVar = (h) this.f31752d;
        Matrix matrix = (Matrix) this.f31751c;
        matrix.reset();
        RectF rectF = hVar.f36564b;
        float f10 = rectF.left;
        float f11 = hVar.f36566d;
        matrix.postTranslate(f10, f11 - (f11 - rectF.bottom));
    }

    public void i(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f31750b;
        h hVar = (h) this.f31752d;
        float fWidth = hVar.f36564b.width() / f11;
        float fHeight = hVar.f36564b.height() / f12;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        matrix.reset();
        matrix.postTranslate(-f10, -f13);
        matrix.postScale(fWidth, -fHeight);
    }

    public c() {
        this.f31749a = 1;
        this.f31750b = new AtomicBoolean();
        this.f31751c = null;
        this.f31752d = new HashMap(16, 1.0f);
        this.f31753e = new HashMap(16, 1.0f);
        this.f31754f = new HashMap(16, 1.0f);
        this.g = new HashMap(16, 1.0f);
        this.f31755h = null;
    }

    public c(h hVar) {
        this.f31749a = 4;
        this.f31750b = new Matrix();
        this.f31751c = new Matrix();
        this.f31753e = new float[1];
        this.f31754f = new Matrix();
        this.g = new float[2];
        this.f31755h = new Matrix();
        new Matrix();
        this.f31752d = hVar;
    }

    public c(Context context) throws NoSuchAlgorithmException {
        String string;
        String strReplaceAll;
        this.f31749a = 0;
        String str = ((z0) ge.f.f24700a.b(context)).f29361a;
        this.f31750b = str;
        File filesDir = context.getFilesDir();
        this.f31751c = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            if (str.length() > 40) {
                strReplaceAll = je.g.h(str);
            } else {
                strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb2.append(strReplaceAll);
            string = sb2.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        g(file);
        this.f31752d = file;
        File file2 = new File(file, "open-sessions");
        g(file2);
        this.f31753e = file2;
        File file3 = new File(file, "reports");
        g(file3);
        this.f31754f = file3;
        File file4 = new File(file, "priority-reports");
        g(file4);
        this.g = file4;
        File file5 = new File(file, "native-reports");
        g(file5);
        this.f31755h = file5;
    }
}
