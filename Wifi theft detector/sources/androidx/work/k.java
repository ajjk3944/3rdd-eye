package androidx.work;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static k f4525a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4526b = 20;

    public static class a extends k {

        /* renamed from: c, reason: collision with root package name */
        public int f4527c;

        public a(int i10) {
            super(i10);
            this.f4527c = i10;
        }

        @Override // androidx.work.k
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f4527c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.k
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f4527c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.k
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f4527c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.k
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f4527c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.k
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f4527c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public k(int i10) {
    }

    public static synchronized k c() {
        try {
            if (f4525a == null) {
                f4525a = new a(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4525a;
    }

    public static synchronized void e(k kVar) {
        f4525a = kVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i10 = f4526b;
        if (length >= i10) {
            sb.append(str.substring(0, i10));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
