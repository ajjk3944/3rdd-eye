package c2;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f4641c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f4642a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4643b;

    /* renamed from: c2.a$a, reason: collision with other inner class name */
    public static class C0060a {

        /* renamed from: a, reason: collision with root package name */
        public static final Set f4644a = new HashSet(Arrays.asList(y.d().a()));
    }

    public static class b extends a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // c2.a
        public final boolean b() {
            return true;
        }
    }

    public static class c extends a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // c2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    public static class d extends a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // c2.a
        public final boolean b() {
            return false;
        }
    }

    public static class e extends a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // c2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class f extends a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // c2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends a {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // c2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class h extends a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // c2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // c2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public a(String str, String str2) {
        this.f4642a = str;
        this.f4643b = str2;
        f4641c.add(this);
    }

    public static Set d() {
        return Collections.unmodifiableSet(f4641c);
    }

    @Override // c2.k
    public String a() {
        return this.f4642a;
    }

    public abstract boolean b();

    public boolean c() {
        return da.a.b(C0060a.f4644a, this.f4643b);
    }

    @Override // c2.k
    public boolean isSupported() {
        return b() || c();
    }
}
