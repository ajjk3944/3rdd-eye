package Z3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import com.google.android.gms.internal.ads.C0632Mo;
import com.google.android.gms.internal.ads.C1029d8;
import com.lefan.signal.MyApplication;
import com.lefan.signal.activity.SplashActivity;
import j2.C2550f;
import j2.C2551g;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import q5.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f4530a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4531b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4532c;

    public static void e(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                e(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(A.f.m("Failed to delete '", file.getAbsolutePath(), "'"));
        }
    }

    public static File f(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static void g(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        }
    }

    public void a(ContextWrapper contextWrapper) {
        MyApplication myApplication = (MyApplication) this.f4532c;
        if (contextWrapper == null) {
            return;
        }
        if (((C1029d8) this.f4531b) == null || System.currentTimeMillis() - this.f4530a >= 3600000) {
            if (myApplication.f18820c) {
                return;
            }
            myApplication.f18820c = true;
            C1029d8.a(contextWrapper, "ca-app-pub-8024055951217142/5884454327", new C2551g(new C2550f(1)), new C0632Mo(this, myApplication));
            return;
        }
        SplashActivity splashActivity = MyApplication.f18813e;
        if (splashActivity != null) {
            splashActivity.D();
        }
    }

    public boolean b(Activity activity) {
        i.e(activity, "activity");
        if (!MyApplication.f18816h) {
            if (((C1029d8) this.f4531b) == null || System.currentTimeMillis() - this.f4530a >= 3600000) {
                a(activity);
                SplashActivity splashActivity = MyApplication.f18813e;
                if (splashActivity == null) {
                    return false;
                }
                splashActivity.E();
                return false;
            }
            MyApplication.f18816h = true;
            C1029d8 c1029d8 = (C1029d8) this.f4531b;
            if (c1029d8 != null) {
                c1029d8.f13733b.f13872a = new com.google.ads.mediation.d((MyApplication) this.f4532c, 1, this);
            }
            if (c1029d8 != null) {
                c1029d8.b(activity);
            }
        }
        return true;
    }

    public HashSet c() {
        File file = new File(i(), "verified-splits");
        g(file);
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && !file2.canWrite()) {
                    hashSet.add(new b(file2, file2.getName().substring(0, r5.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public void d() {
        long j6 = this.f4530a;
        File fileH = h();
        String[] list = fileH.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(j6))) {
                    File file = new File(fileH, str);
                    Log.d("SplitCompat", "FileStorage: removing directory for different version code (directory = " + file.toString() + ", current version code = " + j6 + ")");
                    e(file);
                }
            }
        }
    }

    public File h() {
        if (((File) this.f4532c) == null) {
            Context context = (Context) this.f4531b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f4532c = context.getFilesDir();
        }
        File file = new File((File) this.f4532c, "splitcompat");
        g(file);
        return file;
    }

    public File i() {
        File file = new File(h(), Long.toString(this.f4530a));
        g(file);
        return file;
    }
}
