package S1;

import S1.l;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: ApiFeature.java */
/* loaded from: classes.dex */
public abstract class a implements S1.d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f11846c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f11847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11848b;

    /* compiled from: ApiFeature.java */
    /* renamed from: S1.a$a, reason: collision with other inner class name */
    public static class C0161a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashSet f11849a = new HashSet(Arrays.asList(l.a.f11863a.a()));
    }

    /* compiled from: ApiFeature.java */
    public static class b extends a {
        @Override // S1.a
        public final boolean c() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class c extends a {
        @Override // S1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class d extends a {
        @Override // S1.a
        public final boolean c() {
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class e extends a {
        @Override // S1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class f extends a {
        @Override // S1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class g extends a {
        @Override // S1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class h extends a {
        @Override // S1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class i extends a {
        @Override // S1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public a(String str, String str2) {
        this.f11847a = str;
        this.f11848b = str2;
        f11846c.add(this);
    }

    @Override // S1.d
    public final boolean a() {
        return c() || d();
    }

    @Override // S1.d
    public final String b() {
        return this.f11847a;
    }

    public abstract boolean c();

    public boolean d() {
        HashSet hashSet = C0161a.f11849a;
        String str = this.f11848b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
