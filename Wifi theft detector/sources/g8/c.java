package g8;

import android.content.Context;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final String f21210c = "c";

    /* renamed from: d, reason: collision with root package name */
    public static File f21211d;

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f21212a;

    /* renamed from: b, reason: collision with root package name */
    public Context f21213b = null;

    public static boolean a() {
        File file = f21211d;
        if (file == null) {
            return false;
        }
        return file.delete();
    }

    public static boolean d() {
        File file = f21211d;
        if (file == null) {
            return false;
        }
        return file.exists();
    }

    public final boolean b(Throwable th) throws IOException {
        if (th == null) {
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Date date = new Date(System.currentTimeMillis());
        stringBuffer.append("\n\n************* Crash INFO AT " + new SimpleDateFormat("MM/dd/yyyy HH:mm ", Locale.getDefault()).format((java.util.Date) date) + "*************\n");
        stringBuffer.append("************* Model= " + Build.MODEL + "*************\n");
        stringBuffer.append("************* Mid= " + Build.VERSION.RELEASE + "*************\n");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        if (th.getMessage().equals(o.c().f(this.f21213b, "last_crash_msg", null))) {
            return false;
        }
        o.c().q(this.f21213b, "last_crash_msg", th.getMessage());
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        stringBuffer.append("************* Crash INFO *************\n");
        Log.d(f21210c, "Crash INFO : " + stringBuffer.toString());
        try {
            FileWriter fileWriter = new FileWriter(f21211d, true);
            fileWriter.append((CharSequence) stringBuffer.toString());
            fileWriter.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        try {
            if (new File(f() + "crash.txt").exists()) {
                FileWriter fileWriter2 = new FileWriter(f() + "crash.txt", true);
                fileWriter2.append((CharSequence) stringBuffer.toString());
                fileWriter2.close();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return true;
    }

    public void c(Context context) {
        this.f21213b = context;
        this.f21212a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        f21211d = new File(this.f21213b.getFilesDir(), "crash_report");
        if (e("init1.1.57crash", this.f21213b) && d()) {
            a();
        }
        try {
            File file = new File(f(), "crash.txt");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final boolean e(String str, Context context) {
        boolean z10 = PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, true);
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, false).apply();
        return z10;
    }

    public final String f() {
        String str = e8.a.f20991b;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (b(th) || this.f21212a == null) {
            s.r(this.f21213b);
        } else {
            o.c().q(this.f21213b, "last_crash_msg", "");
            this.f21212a.uncaughtException(thread, th);
        }
    }
}
