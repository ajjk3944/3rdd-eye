package ec;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.or;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s0 extends v1 {

    /* renamed from: d, reason: collision with root package name */
    public char f23051d;

    /* renamed from: e, reason: collision with root package name */
    public long f23052e;

    /* renamed from: f, reason: collision with root package name */
    public String f23053f;
    public final or g;

    /* renamed from: h, reason: collision with root package name */
    public final or f23054h;

    /* renamed from: i, reason: collision with root package name */
    public final or f23055i;
    public final or j;

    /* renamed from: k, reason: collision with root package name */
    public final or f23056k;

    /* renamed from: l, reason: collision with root package name */
    public final or f23057l;

    /* renamed from: m, reason: collision with root package name */
    public final or f23058m;

    /* renamed from: n, reason: collision with root package name */
    public final or f23059n;

    /* renamed from: o, reason: collision with root package name */
    public final or f23060o;

    public s0(o1 o1Var) {
        super(o1Var);
        this.f23051d = (char) 0;
        this.f23052e = -1L;
        this.g = new or(this, 6, false, false);
        this.f23054h = new or(this, 6, true, false);
        this.f23055i = new or(this, 6, false, true);
        this.j = new or(this, 5, false, false);
        this.f23056k = new or(this, 5, true, false);
        this.f23057l = new or(this, 5, false, true);
        this.f23058m = new or(this, 4, false, false);
        this.f23059n = new or(this, 3, false, false);
        this.f23060o = new or(this, 2, false, false);
    }

    public static r0 J(String str) {
        if (str == null) {
            return null;
        }
        return new r0(str);
    }

    public static String M(boolean z3, String str, Object obj, Object obj2, Object obj3) {
        String strN = N(obj, z3);
        String strN2 = N(obj2, z3);
        String strN3 = N(obj3, z3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strN)) {
            sb2.append(str2);
            sb2.append(strN);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strN2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strN2);
        }
        if (!TextUtils.isEmpty(strN3)) {
            sb2.append(str3);
            sb2.append(strN3);
        }
        return sb2.toString();
    }

    public static String N(Object obj, boolean z3) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z3) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(r5.c.f(str.length() + length + 3, String.valueOf(jRound2).length(), str));
            a0.g.A(sb2, str, jRound, "...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof r0 ? ((r0) obj).f23039a : z3 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z3 ? th2.getClass().getName() : th2.toString());
        String canonicalName = o1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i4++;
        }
        return sb3.toString();
    }

    @Override // ec.v1
    public final boolean C() {
        return false;
    }

    public final or F() {
        return this.g;
    }

    public final or G() {
        return this.j;
    }

    public final or H() {
        return this.f23059n;
    }

    public final or I() {
        return this.f23060o;
    }

    public final void K(int i4, boolean z3, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z3 && Log.isLoggable(L(), i4)) {
            Log.println(i4, L(), M(false, str, obj, obj2, obj3));
        }
        if (z10 || i4 < 5) {
            return;
        }
        pb.y.h(str);
        l1 l1Var = ((o1) this.f218b).g;
        if (l1Var == null) {
            Log.println(6, L(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!l1Var.f23099c) {
                Log.println(6, L(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i4 >= 9) {
                i4 = 8;
            }
            l1Var.K(new q0(this, i4, str, obj, obj2, obj3));
        }
    }

    public final String L() {
        String str;
        synchronized (this) {
            try {
                if (this.f23053f == null) {
                    ((o1) ((o1) this.f218b).f22952d.f218b).getClass();
                    this.f23053f = "FA";
                }
                pb.y.h(this.f23053f);
                str = this.f23053f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
