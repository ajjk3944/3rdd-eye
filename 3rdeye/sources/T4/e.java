package T4;

import L4.h;
import O4.C1461g;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12283a;

    /* renamed from: b, reason: collision with root package name */
    public final File f12284b;

    /* renamed from: c, reason: collision with root package name */
    public final File f12285c;

    /* renamed from: d, reason: collision with root package name */
    public final File f12286d;

    /* renamed from: e, reason: collision with root package name */
    public final File f12287e;

    /* renamed from: f, reason: collision with root package name */
    public final File f12288f;

    /* renamed from: g, reason: collision with root package name */
    public final File f12289g;

    public e(Context context) {
        String string;
        String strC = h.f4062a.c(context).c();
        this.f12283a = strC;
        File filesDir = context.getFilesDir();
        this.f12284b = filesDir;
        if (strC.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(strC.length() > 40 ? C1461g.h(strC) : strC.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        c(file);
        this.f12285c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f12286d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f12287e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f12288f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f12289g = file5;
    }

    public static synchronized void c(File file) {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> e(T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    public final void a(String str) {
        File file = new File(this.f12284b, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public final File b(String str, String str2) {
        File file = new File(this.f12286d, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
