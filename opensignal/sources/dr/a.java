package dr;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import ar.k;
import bf.n;
import br.l;
import com.google.android.exoplayer2.y0;
import com.google.android.gms.internal.measurement.b4;
import i3.g;
import io.sentry.android.core.e0;
import io.sentry.android.core.k0;
import io.sentry.h0;
import io.sentry.hints.b;
import io.sentry.hints.d;
import io.sentry.q;
import iu.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import js.h;
import lq.u;
import lq.w;
import mq.t;
import org.json.JSONException;
import org.json.JSONObject;
import qs.e;
import rr.f;
import x1.f0;
import x1.f1;
import x1.n0;

/* loaded from: classes.dex */
public abstract class a {
    public static String A(Date date) {
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.f12837a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(23 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(14), 3);
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb2, iAbs, 2);
            sb2.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    public static boolean B(h0 h0Var, Class cls) {
        return cls.isInstance(y(h0Var));
    }

    public static boolean C(h0 h0Var) {
        return Boolean.TRUE.equals(h0Var.b(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static int E(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d6 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d6 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d6);
    }

    public static int F(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long G(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d6);
    }

    public static boolean H(h0 h0Var) {
        return !(d.class.isInstance(y(h0Var)) || b.class.isInstance(y(h0Var))) || k0.class.isInstance(y(h0Var));
    }

    public static final String I(f fVar, String str) {
        String strJ;
        l.e(fVar, "classDescriptor");
        String str2 = qr.d.f20965a;
        e eVarI = xs.d.g(fVar).i();
        l.d(eVarI, "fqNameSafe.toUnsafe()");
        qs.b bVarF = qr.d.f(eVarI);
        if (bVarF != null) {
            strJ = ys.b.b(bVarF).e();
            l.d(strJ, "byClassId(it).internalName");
        } else {
            strJ = b4.j(fVar, h.f13809d);
        }
        l.e(strJ, "internalName");
        return strJ + '.' + str;
    }

    public static final u J(String str) {
        int i10;
        b4.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (l.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i10 = 0;
        }
        int i12 = 119304647;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            int i13 = i11 ^ Integer.MIN_VALUE;
            if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                if (i12 != 119304647) {
                    return null;
                }
                i12 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i14 = i11 * 10;
            int i15 = iDigit + i14;
            if (Integer.compare(i15 ^ Integer.MIN_VALUE, i14 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i10++;
            i11 = i15;
        }
        return new u(i11);
    }

    public static final w K(String str) {
        int i10;
        long j;
        l.e(str, "<this>");
        int i11 = 10;
        b4.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i12 = 1;
        if (l.g(cCharAt, 48) >= 0) {
            i10 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i10 = 1;
        }
        long j7 = 10;
        long j10 = 0;
        long j11 = 512409557603043100L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), i11);
            if (iDigit < 0) {
                return null;
            }
            int i13 = length;
            long j12 = j10 ^ Long.MIN_VALUE;
            int i14 = i10;
            if (Long.compare(j12, j11 ^ Long.MIN_VALUE) <= 0) {
                j = j7;
            } else {
                if (j11 != 512409557603043100L) {
                    return null;
                }
                if (j7 >= 0) {
                    long j13 = (Long.MAX_VALUE / j7) << i12;
                    j = j7;
                    j11 = j13 + ((((-1) - (j13 * j7)) ^ Long.MIN_VALUE) >= (j7 ^ Long.MIN_VALUE) ? i12 : 0);
                } else if (Long.MAX_VALUE < (j7 ^ Long.MIN_VALUE)) {
                    j = j7;
                    j11 = 0;
                } else {
                    j11 = 1;
                    j = j7;
                }
                if (Long.compare(j12, j11 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j14 = j10 * j;
            long j15 = (iDigit & 4294967295L) + j14;
            if (Long.compare(j15 ^ Long.MIN_VALUE, j14 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i10 = i14 + 1;
            j10 = j15;
            length = i13;
            j7 = j;
            i11 = 10;
            i12 = 1;
        }
        return new w(j10);
    }

    public static int M(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static boolean N(byte b2) {
        return b2 > -65;
    }

    public static final String a(byte[] bArr) {
        if (bArr != null) {
            return mq.l.t0(bArr, "", lk.a.f15540d, 30);
        }
        return null;
    }

    public static final iu.f b(String str, g gVar, iu.e[] eVarArr, k kVar) {
        l.e(str, "serialName");
        if (tt.l.D0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (gVar.equals(j.f13011d)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        iu.a aVar = new iu.a(str);
        kVar.a(aVar);
        return new iu.f(str, gVar, aVar.f12984c.size(), mq.l.A0(eVarArr), aVar);
    }

    public static iu.f c(String str, g gVar, iu.e[] eVarArr) {
        l.e(str, "serialName");
        if (tt.l.D0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (gVar.equals(j.f13011d)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        iu.a aVar = new iu.a(str);
        return new iu.f(str, gVar, aVar.f12984c.size(), mq.l.A0(eVarArr), aVar);
    }

    public static final int d(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static final boolean e(r1.j jVar) {
        return !jVar.f21173h && jVar.f21169d;
    }

    public static void f(String str, boolean z10) throws y0 {
        if (!z10) {
            throw y0.a(null, str);
        }
    }

    public static int g(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static Handler h(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return i3.a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e4) {
            e = e4;
            e0.q("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e10) {
            e = e10;
            e0.q("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e11) {
            e = e11;
            e0.q("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static h0 j(Object obj) {
        h0 h0Var = new h0();
        h0Var.c(obj, "sentry:typeCheckHint");
        return h0Var;
    }

    public static boolean k(String str, String str2) {
        l.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i11++;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return l.a(tt.l.a1(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final void l(cv.l lVar, cv.w wVar) throws IOException {
        try {
            IOException iOException = null;
            for (cv.w wVar2 : lVar.g(wVar)) {
                try {
                    if (lVar.h(wVar2).f44c) {
                        l(lVar, wVar2);
                    }
                    lVar.d(wVar2);
                } catch (IOException e4) {
                    if (iOException == null) {
                        iOException = e4;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static long m(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i12, 262142);
        int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
        int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    t2.b.i(i15);
                    throw new n();
                }
                i14 = 8190;
            }
        }
        return t2.b.a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long n(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i10, 262142);
        int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
        int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    t2.b.i(i15);
                    throw new n();
                }
                i14 = 8190;
            }
        }
        return t2.b.a(iMin, iMin2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
    }

    public static final HashSet o(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setE = ((at.n) it.next()).e();
            if (setE == null) {
                return null;
            }
            t.d0(hashSet, setE);
        }
        return hashSet;
    }

    public static ni.k p(String str) {
        if (str == null || str.length() == 0 || tt.l.D0(str)) {
            ch.n.g("DeviceInfoCoreResult", "Null or blank JSON");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ni.k(xu.d.C("DEVICE_STORAGE_FREE_BYTES", jSONObject), xu.d.C("DEVICE_STORAGE_USED_BYTES", jSONObject), xu.d.C("DEVICE_RAM_FREE_BYTES", jSONObject), xu.d.C("DEVICE_RAM_USED_BYTES", jSONObject));
        } catch (JSONException unused) {
            ch.n.c("DeviceInfoCoreResult", "Trying to parse invalid JSON: ".concat(str));
            return null;
        }
    }

    public static Date q() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f12837a).getTime();
    }

    public static Date r(long j) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f12837a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    public static Date s(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(c7.a.p("timestamp is not ISO format ", str));
        }
    }

    public static Date t(String str) {
        try {
            return r(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(c7.a.p("timestamp is not millis format ", str));
        }
    }

    public static wh.d u(int i10) {
        if (i10 == 18) {
            return wh.d.IWLAN;
        }
        switch (i10) {
            case 0:
                return wh.d.UNKNOWN;
            case 1:
                return wh.d.TWO_G;
            case 2:
                return wh.d.TWO_G;
            case 3:
                return wh.d.THREE_G;
            case 4:
                return wh.d.TWO_G;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return wh.d.THREE_G;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return wh.d.THREE_G;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return wh.d.TWO_G;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return wh.d.THREE_G;
            case 9:
                return wh.d.THREE_G;
            case 10:
                return wh.d.THREE_G;
            case 11:
                return wh.d.TWO_G;
            case 12:
                return wh.d.THREE_G;
            case 13:
                return wh.d.FOUR_G;
            case 14:
                return wh.d.THREE_G;
            case 15:
                return wh.d.THREE_POINT5_G;
            default:
                return wh.d.UNKNOWN;
        }
    }

    public static wh.e v(int i10) {
        switch (i10) {
            case 0:
                return wh.e.UNKNOWN;
            case 1:
                return wh.e.TWO_G;
            case 2:
                return wh.e.TWO_G_P;
            case 3:
                return wh.e.THREE_G;
            case 4:
                return wh.e.TWO_G;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return wh.e.THREE_G;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return wh.e.THREE_G;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return wh.e.TWO_G;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return wh.e.THREE_G_P;
            case 9:
                return wh.e.THREE_G_P;
            case 10:
                return wh.e.THREE_G_P;
            case 11:
                return wh.e.TWO_G;
            case 12:
                return wh.e.THREE_G_P;
            case 13:
                return wh.e.FOUR_G;
            case 14:
                return wh.e.THREE_G_P;
            case 15:
                return wh.e.THREE_G_P;
            default:
                return wh.e.UNKNOWN;
        }
    }

    public static final String w(TelephonyManager telephonyManager, com.staircase3.opensignal.utils.k kVar) {
        l.e(telephonyManager, "<this>");
        l.e(kVar, "networkOperatorInfo");
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        String simOperatorName = telephonyManager.getSimOperatorName();
        return (networkOperatorName == null || tt.l.D0(networkOperatorName) || simOperatorName == null || tt.l.D0(simOperatorName)) ? (simOperatorName == null || tt.l.D0(simOperatorName)) ? (networkOperatorName == null || tt.l.D0(networkOperatorName)) ? "" : networkOperatorName : simOperatorName : !l.a(networkOperatorName, simOperatorName) ? w.g.g(simOperatorName, " | ", networkOperatorName) : networkOperatorName;
    }

    public static final n0 x(n0 n0Var) {
        f0 f0Var = n0Var.f24889o.f24821o;
        while (true) {
            f0 f0VarC = f0Var.C();
            f0 f0Var2 = null;
            if ((f0VarC != null ? f0VarC.f24804h : null) == null) {
                n0 n0VarT0 = ((f1) f0Var.D.f823e).t0();
                l.b(n0VarT0);
                return n0VarT0;
            }
            f0 f0VarC2 = f0Var.C();
            if (f0VarC2 != null) {
                f0Var2 = f0VarC2.f24804h;
            }
            l.b(f0Var2);
            f0 f0VarC3 = f0Var.C();
            l.b(f0VarC3);
            f0Var = f0VarC3.f24804h;
            l.b(f0Var);
        }
    }

    public static Object y(h0 h0Var) {
        q qVarA = h0Var.f12295c.a();
        try {
            Object obj = h0Var.f12293a.get("sentry:typeCheckHint");
            qVarA.close();
            return obj;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public abstract Object D(int i10, Intent intent);

    public abstract void L(byte[] bArr, int i10, int i11);

    public abstract Intent i(Context context, Object obj);

    public g.a z(Context context, Object obj) {
        return null;
    }
}
