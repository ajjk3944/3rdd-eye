package Q4;

import I4.j;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f19174a;

    /* renamed from: b, reason: collision with root package name */
    private final File f19175b;

    /* renamed from: c, reason: collision with root package name */
    private final File f19176c;

    /* renamed from: d, reason: collision with root package name */
    private final File f19177d;

    /* renamed from: e, reason: collision with root package name */
    private final File f19178e;

    /* renamed from: f, reason: collision with root package name */
    private final File f19179f;

    /* renamed from: g, reason: collision with root package name */
    private final File f19180g;

    public g(Context context) {
        String str;
        String strD = j.f8622a.e(context).d();
        this.f19174a = strD;
        File filesDir = context.getFilesDir();
        this.f19175b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileT = t(new File(filesDir, str));
        this.f19176c = fileT;
        this.f19177d = t(new File(fileT, "open-sessions"));
        this.f19178e = t(new File(fileT, "reports"));
        this.f19179f = t(new File(fileT, "priority-reports"));
        this.f19180g = t(new File(fileT, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f19175b, str);
        if (file.exists() && v(file)) {
            I4.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f19175b.exists() || (list = this.f19175b.list(new FilenameFilter() { // from class: Q4.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return g.s(str, file, str2);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return u(new File(this.f19177d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File t(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                I4.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                I4.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    static boolean v(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static List w(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    static String x(String str) {
        return str.length() > 40 ? AbstractC5107i.z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f19174a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f19177d, str));
    }

    public List f() {
        return w(this.f19177d.list());
    }

    public File g(String str) {
        return new File(this.f19176c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return w(this.f19176c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f19180g, str);
    }

    public List j() {
        return w(this.f19180g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f19179f, str);
    }

    public List m() {
        return w(this.f19179f.listFiles());
    }

    public File n(String str) {
        return new File(this.f19178e, str);
    }

    public List o() {
        return w(this.f19178e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
