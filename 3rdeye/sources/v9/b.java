package V9;

import T1.B;
import U9.D;
import U9.E;
import U9.F;
import U9.G;
import U9.s;
import U9.t;
import U9.x;
import ba.c;
import c9.C2092m;
import c9.C2097r;
import ia.C;
import ia.C4468d;
import ia.g;
import ia.h;
import ia.s;
import ia.w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import y9.C5819a;
import y9.C5826h;
import y9.q;

/* compiled from: Util.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13053a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f13054b = s.b.c(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final G f13055c;

    /* renamed from: d, reason: collision with root package name */
    public static final ia.s f13056d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f13057e;

    /* renamed from: f, reason: collision with root package name */
    public static final C5826h f13058f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f13059g;

    static {
        byte[] bArr = new byte[0];
        f13053a = bArr;
        F.Companion.getClass();
        f13055c = F.b.c(bArr, null);
        D.a.d(D.Companion, bArr, null, 0, 7);
        h hVar = h.f38646e;
        f13056d = s.a.b(h.a.b("efbbbf"), h.a.b("feff"), h.a.b("fffe"), h.a.b("0000ffff"), h.a.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        l.c(timeZone);
        f13057e = timeZone;
        f13058f = new C5826h("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f13059g = q.o0(q.n0(x.class.getName(), "okhttp3."));
    }

    public static final boolean a(t tVar, t other) {
        l.f(tVar, "<this>");
        l.f(other, "other");
        return l.b(tVar.f12715d, other.f12715d) && tVar.f12716e == other.f12716e && l.b(tVar.f12712a, other.f12712a);
    }

    public static final int b(long j4) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (j4 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j4);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) throws IOException {
        l.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) throws IOException {
        l.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e10) {
            if (!l.b(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i, int i10, String str, String str2) {
        l.f(str, "<this>");
        while (i < i10) {
            if (q.c0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int f(String str, char c10, int i, int i10) {
        l.f(str, "<this>");
        while (i < i10) {
            if (str.charAt(i) == c10) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final boolean g(C c10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.f(timeUnit, "timeUnit");
        try {
            return t(c10, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String format, Object... objArr) {
        l.f(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        l.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                kotlin.jvm.internal.b bVarQ = B.q(strArr2);
                while (bVarQ.hasNext()) {
                    if (comparator.compare(str, (String) bVarQ.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(E e4) {
        String strC = e4.f12567g.c("Content-Length");
        if (strC == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    public static final <T> List<T> k(T... elements) {
        l.f(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(C2092m.W(Arrays.copyOf(objArr, objArr.length)));
        l.e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (l.h(cCharAt, 31) <= 0 || l.h(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i10, String str) {
        l.f(str, "<this>");
        while (i < i10) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int n(int i, int i10, String str) {
        l.f(str, "<this>");
        int i11 = i10 - 1;
        if (i <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i) {
                    break;
                }
                i11--;
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator<? super String> comparator) {
        l.f(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String name) {
        l.f(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset r(g gVar, Charset charset) throws IOException {
        l.f(gVar, "<this>");
        l.f(charset, "default");
        int iX0 = gVar.x0(f13056d);
        if (iX0 == -1) {
            return charset;
        }
        if (iX0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            l.e(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iX0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            l.e(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iX0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            l.e(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iX0 == 3) {
            C5819a.f48358a.getClass();
            Charset charset2 = C5819a.f48362e;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            l.e(charsetForName, "forName(...)");
            C5819a.f48362e = charsetForName;
            return charsetForName;
        }
        if (iX0 != 4) {
            throw new AssertionError();
        }
        C5819a.f48358a.getClass();
        Charset charset3 = C5819a.f48361d;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        l.e(charsetForName2, "forName(...)");
        C5819a.f48361d = charsetForName2;
        return charsetForName2;
    }

    public static final int s(w wVar) throws IOException {
        l.f(wVar, "<this>");
        return (wVar.readByte() & 255) | ((wVar.readByte() & 255) << 16) | ((wVar.readByte() & 255) << 8);
    }

    public static final boolean t(C c10, int i) throws IOException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = c10.timeout().hasDeadline() ? c10.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        c10.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C4468d c4468d = new C4468d();
            while (c10.read(c4468d, 8192L) != -1) {
                c4468d.a();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                c10.timeout().clearDeadline();
                return true;
            }
            c10.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                c10.timeout().clearDeadline();
                return false;
            }
            c10.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                c10.timeout().clearDeadline();
            } else {
                c10.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final U9.s u(List<c> list) {
        s.a aVar = new s.a();
        for (c cVar : list) {
            aVar.c(cVar.f18118a.j(), cVar.f18119b.j());
        }
        return aVar.d();
    }

    public static final String v(t tVar, boolean z10) {
        l.f(tVar, "<this>");
        String strE = tVar.f12715d;
        if (q.b0(strE, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            strE = androidx.work.s.e("[", strE, ']');
        }
        int i = tVar.f12716e;
        if (!z10) {
            String scheme = tVar.f12712a;
            l.f(scheme, "scheme");
            if (i == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return strE;
            }
        }
        return strE + ':' + i;
    }

    public static final <T> List<T> w(List<? extends T> list) {
        l.f(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(C2097r.I0(list));
        l.e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int x(int i, String str) throws NumberFormatException {
        if (str == null) {
            return i;
        }
        try {
            long j4 = Long.parseLong(str);
            if (j4 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j4 < 0) {
                return 0;
            }
            return (int) j4;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String y(int i, int i10, String str) {
        int iM = m(i, i10, str);
        String strSubstring = str.substring(iM, n(iM, i10, str));
        l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
