package D2;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.HashSet;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f1034b;

    /* renamed from: a, reason: collision with root package name */
    public final String f1035a;

    static {
        HashSet hashSet = new HashSet(3);
        f1034b = hashSet;
        hashSet.add("dalvik.system.VMStack");
        hashSet.add("java.lang.Thread");
        hashSet.add(c.class.getCanonicalName());
    }

    public c() {
        String simpleName;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                simpleName = c.class.getSimpleName();
                break;
            }
            String className = stackTrace[i].getClassName();
            if (!f1034b.contains(className)) {
                simpleName = className.split("\\.")[r0.length - 1];
                break;
            }
            i++;
        }
        this.f1035a = simpleName.length() > 0 ? simpleName.concat(": ") : simpleName;
    }

    @SuppressLint({"LogTagMismatch"})
    public final void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d("tensorflow", e(str, objArr));
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public final void b(Exception exc, String str, Object... objArr) {
        if (d(6)) {
            Log.e("tensorflow", e(str, objArr), exc);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public final void c(String str, Object... objArr) {
        if (d(4)) {
            Log.i("tensorflow", e(str, objArr));
        }
    }

    public final boolean d(int i) {
        return i >= 3 || Log.isLoggable("tensorflow", i);
    }

    public final String e(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1035a);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        sb.append(str);
        return sb.toString();
    }

    @SuppressLint({"LogTagMismatch"})
    public final void f(String str, Object... objArr) {
        if (d(5)) {
            Log.w("tensorflow", e(str, objArr));
        }
    }
}
