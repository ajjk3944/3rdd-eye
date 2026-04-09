package pu;

import ba.m;
import br.b0;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import cv.f0;
import cv.g;
import cv.i;
import cv.j;
import cv.v;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import mq.o;
import ou.c0;
import ou.d;
import ou.d0;
import ou.s;
import ou.t;
import ou.x;
import tt.k;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f20645a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f20646b = d.g(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f20647c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f20648d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f20649e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f20650f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f20651g;

    static {
        byte[] bArr = new byte[0];
        f20645a = bArr;
        g gVar = new g();
        gVar.i0(0, bArr);
        long j = 0;
        f20647c = new d0(gVar, j);
        c(j, j, j);
        j jVar = j.f6715r;
        f20648d = m.F(sm.m.l("efbbbf"), sm.m.l("feff"), sm.m.l("fffe"), sm.m.l("0000ffff"), sm.m.l("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        l.b(timeZone);
        f20649e = timeZone;
        f20650f = new k("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f20651g = tt.l.K0(tt.l.J0(x.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(t tVar, t tVar2) {
        l.e(tVar, "<this>");
        l.e(tVar2, "other");
        return l.a(tVar.f19970d, tVar2.f19970d) && tVar.f19971e == tVar2.f19971e && l.a(tVar.f19967a, tVar2.f19967a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(long j, long j7, long j10) {
        if ((j7 | j10) < 0 || j7 > j || j - j7 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) throws IOException {
        l.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) throws IOException {
        l.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e10) {
            if (!l.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c4, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) == c4) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int g(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (tt.l.r0(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final String h(String str, Object... objArr) {
        l.e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        l.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                br.b bVarE = b0.e(strArr2);
                while (bVarE.hasNext()) {
                    if (comparator.compare(str, (String) bVarE.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(c0 c0Var) {
        String strA = c0Var.f19889y.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        l.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(e5.I(Arrays.copyOf(objArr2, objArr2.length)));
        l.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (l.g(cCharAt, 31) <= 0 || l.g(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int m(String str, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(String str, int i10, int i11) {
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        l.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        l.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' > c4 || c4 >= 'G') {
            return -1;
        }
        return c4 - '7';
    }

    public static final Charset r(i iVar, Charset charset) {
        l.e(iVar, "<this>");
        l.e(charset, "default");
        int iD = iVar.D(f20648d);
        if (iD == -1) {
            return charset;
        }
        if (iD == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            l.d(charset2, "UTF_8");
            return charset2;
        }
        if (iD == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            l.d(charset3, "UTF_16BE");
            return charset3;
        }
        if (iD == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            l.d(charset4, "UTF_16LE");
            return charset4;
        }
        if (iD == 3) {
            Charset charset5 = tt.a.f22975a;
            Charset charset6 = tt.a.f22978d;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            l.d(charsetForName, "forName(...)");
            tt.a.f22978d = charsetForName;
            return charsetForName;
        }
        if (iD != 4) {
            throw new AssertionError();
        }
        Charset charset7 = tt.a.f22975a;
        Charset charset8 = tt.a.f22977c;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        l.d(charsetForName2, "forName(...)");
        tt.a.f22977c = charsetForName2;
        return charsetForName2;
    }

    public static final int s(i iVar) {
        l.e(iVar, "<this>");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final boolean t(f0 f0Var, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = f0Var.g().e() ? f0Var.g().c() - jNanoTime : Long.MAX_VALUE;
        f0Var.g().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            g gVar = new g();
            while (f0Var.u(gVar, 8192L) != -1) {
                gVar.b();
            }
            if (jC == Long.MAX_VALUE) {
                f0Var.g().a();
                return true;
            }
            f0Var.g().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                f0Var.g().a();
                return false;
            }
            f0Var.g().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                f0Var.g().a();
            } else {
                f0Var.g().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final s u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vu.d dVar = (vu.d) it.next();
            j jVar = dVar.f23983a;
            j jVar2 = dVar.f23984b;
            String strQ = jVar.q();
            String strQ2 = jVar2.q();
            arrayList.add(strQ);
            arrayList.add(tt.l.a1(strQ2).toString());
        }
        return new s((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(t tVar, boolean z10) {
        l.e(tVar, "<this>");
        int i10 = tVar.f19971e;
        String strG = tVar.f19970d;
        if (tt.l.q0(strG, ":", false)) {
            strG = h0.b.g(']', "[", strG);
        }
        if (!z10) {
            String str = tVar.f19967a;
            l.e(str, "scheme");
            if (i10 == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strG;
            }
        }
        return strG + ':' + i10;
    }

    public static final List w(List list) {
        l.e(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(o.R0(list));
        l.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int x(int i10, String str) throws NumberFormatException {
        if (str == null) {
            return i10;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final String y(String str, int i10, int i11) {
        int iM = m(str, i10, i11);
        String strSubstring = str.substring(iM, n(str, iM, i11));
        l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
