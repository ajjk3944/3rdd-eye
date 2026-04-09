package androidx.work;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f16948a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f16949b;

    /* compiled from: Logger.java */
    public static class a extends m {

        /* renamed from: c, reason: collision with root package name */
        public final int f16950c;

        public a(int i) {
            this.f16950c = i;
        }

        @Override // androidx.work.m
        public final void a(String str, String str2) {
            if (this.f16950c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.m
        public final void b(String str, String str2, Throwable th) {
            if (this.f16950c <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // androidx.work.m
        public final void c(String str, String str2) {
            if (this.f16950c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.m
        public final void d(String str, String str2, Throwable th) {
            if (this.f16950c <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // androidx.work.m
        public final void f(String str, String str2) {
            if (this.f16950c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.m
        public final void h(String str, String str2) {
            if (this.f16950c <= 5) {
                Log.w(str, str2);
            }
        }
    }

    public static m e() {
        a aVar;
        synchronized (f16948a) {
            try {
                if (f16949b == null) {
                    f16949b = new a(3);
                }
                aVar = f16949b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void h(String str, String str2);
}
