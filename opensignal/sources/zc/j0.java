package zc;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class j0 extends j1 {
    public final su.b B;
    public final su.b D;
    public final su.b E;
    public final su.b F;
    public final su.b G;
    public final su.b H;
    public final su.b I;
    public final su.b J;
    public final su.b K;

    /* renamed from: r, reason: collision with root package name */
    public char f26977r;

    /* renamed from: x, reason: collision with root package name */
    public long f26978x;

    /* renamed from: y, reason: collision with root package name */
    public String f26979y;

    public j0(c1 c1Var) {
        super(c1Var);
        this.f26977r = (char) 0;
        this.f26978x = -1L;
        this.B = new su.b(this, 6, false, false);
        this.D = new su.b(this, 6, true, false);
        this.E = new su.b(this, 6, false, true);
        this.F = new su.b(this, 5, false, false);
        this.G = new su.b(this, 5, true, false);
        this.H = new su.b(this, 5, false, true);
        this.I = new su.b(this, 4, false, false);
        this.J = new su.b(this, 3, false, false);
        this.K = new su.b(this, 2, false, false);
    }

    public static i0 A1(String str) {
        if (str == null) {
            return null;
        }
        return new i0(str);
    }

    public static String D1(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strE1 = E1(obj, z10);
        String strE12 = E1(obj2, z10);
        String strE13 = E1(obj3, z10);
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
        if (!TextUtils.isEmpty(strE1)) {
            sb2.append(str2);
            sb2.append(strE1);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strE12)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strE12);
        }
        if (!TextUtils.isEmpty(strE13)) {
            sb2.append(str3);
            sb2.append(strE13);
        }
        return sb2.toString();
    }

    public static String E1(Object obj, boolean z10) {
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
            if (!z10) {
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
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof i0 ? ((i0) obj).f26967a : z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String canonicalName = c1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i10++;
        }
        return sb3.toString();
    }

    public final void B1(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(C1(), i10)) {
            Log.println(i10, C1(), D1(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        cc.s.h(str);
        a1 a1Var = ((c1) this.f1504d).B;
        if (a1Var == null) {
            Log.println(6, C1(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!a1Var.f26980g) {
                Log.println(6, C1(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            a1Var.B1(new h0(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String C1() {
        String str;
        synchronized (this) {
            try {
                if (this.f26979y == null) {
                    ((c1) ((c1) this.f1504d).f26887r.f1504d).getClass();
                    this.f26979y = "FA";
                }
                cc.s.h(this.f26979y);
                str = this.f26979y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // zc.j1
    public final boolean t1() {
        return false;
    }

    public final su.b w1() {
        return this.B;
    }

    public final su.b x1() {
        return this.F;
    }

    public final su.b y1() {
        return this.J;
    }

    public final su.b z1() {
        return this.K;
    }
}
