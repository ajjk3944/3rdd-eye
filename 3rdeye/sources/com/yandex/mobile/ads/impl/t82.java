package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import c9.C2092m;
import c9.C2097r;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.r50;
import com.yandex.mobile.ads.impl.rh0;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tq1;
import ia.C4468d;
import ia.h;
import ia.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import y9.C5826h;

/* loaded from: classes3.dex */
public final class t82 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f33480a;

    /* renamed from: b, reason: collision with root package name */
    public static final kf0 f33481b = kf0.b.a(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final sq1 f33482c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f33483d;

    /* renamed from: e, reason: collision with root package name */
    private static final C5826h f33484e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f33485f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f33486g;

    static {
        byte[] bArr = new byte[0];
        f33480a = bArr;
        f33482c = tq1.a.a(bArr);
        sp1.a.a(bArr);
        ia.h hVar = ia.h.f38646e;
        s.a.b(h.a.b("efbbbf"), h.a.b("feff"), h.a.b("fffe"), h.a.b("0000ffff"), h.a.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.l.c(timeZone);
        f33483d = timeZone;
        f33484e = new C5826h("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f33485f = false;
        f33486g = y9.q.o0(y9.q.n0(vd1.class.getName(), "com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttplib."));
    }

    public static final boolean c(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int a(byte b10) {
        return b10 & 255;
    }

    public static final int a(char c10) {
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

    public static final int b(int i, int i10, String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
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

    public static final int a(short s10) {
        return s10 & 65535;
    }

    public static final long a(int i) {
        return i & 2147483647L;
    }

    public static final String[] b(String[] strArr, String[] other, Comparator<? super String> comparator) {
        kotlin.jvm.internal.l.f(strArr, "<this>");
        kotlin.jvm.internal.l.f(other, "other");
        kotlin.jvm.internal.l.f(comparator, "comparator");
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

    public static final void a(ArrayList arrayList, Object obj) {
        kotlin.jvm.internal.l.f(arrayList, "<this>");
        if (arrayList.contains(obj)) {
            return;
        }
        arrayList.add(obj);
    }

    public static final r50.b a(r50.a aVar) {
        kotlin.jvm.internal.l.f(aVar, "<this>");
        return new X1(aVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r50 a(r50 this_asFactory, hn it) {
        kotlin.jvm.internal.l.f(this_asFactory, "$this_asFactory");
        kotlin.jvm.internal.l.f(it, "it");
        return this_asFactory;
    }

    public static final boolean a(String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        return f33484e.a(str);
    }

    public static final <T> List<T> b(List<? extends T> list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(C2097r.I0(list));
        kotlin.jvm.internal.l.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final int a(long j4, TimeUnit timeUnit) {
        if (j4 < 0) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j4);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("timeout too large.".toString());
            }
            if (millis != 0 || j4 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException("timeout too small.".toString());
        }
        throw new IllegalStateException("unit == null");
    }

    public static final void a(Closeable closeable) throws IOException {
        kotlin.jvm.internal.l.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void a(Socket socket) throws IOException {
        kotlin.jvm.internal.l.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e10) {
            if (!kotlin.jvm.internal.l.b(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final int a(int i, int i10, String str, String delimiters) {
        kotlin.jvm.internal.l.f(str, "<this>");
        kotlin.jvm.internal.l.f(delimiters, "delimiters");
        while (i < i10) {
            if (y9.q.c0(delimiters, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int a(String str, char c10, int i, int i10) {
        kotlin.jvm.internal.l.f(str, "<this>");
        while (i < i10) {
            if (str.charAt(i) == c10) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final String a(String format, Object... args) {
        kotlin.jvm.internal.l.f(format, "format");
        kotlin.jvm.internal.l.f(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean a(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        kotlin.jvm.internal.l.f(strArr, "<this>");
        kotlin.jvm.internal.l.f(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                kotlin.jvm.internal.b bVarQ = T1.B.q(strArr2);
                while (bVarQ.hasNext()) {
                    if (comparator.compare(str, (String) bVarQ.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long a(pq1 pq1Var) {
        kotlin.jvm.internal.l.f(pq1Var, "<this>");
        String strA = pq1Var.g().a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    public static final <T> List<T> a(T... elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(C2092m.W(Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.l.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final int a(int i, int i10, String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        while (i < i10) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final boolean a(Socket socket, ia.g source) throws SocketException {
        kotlin.jvm.internal.l.f(socket, "<this>");
        kotlin.jvm.internal.l.f(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.K();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final int a(ia.g gVar) throws IOException {
        kotlin.jvm.internal.l.f(gVar, "<this>");
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    public static final int a(C4468d c4468d) throws EOFException {
        kotlin.jvm.internal.l.f(c4468d, "<this>");
        int i = 0;
        while (!c4468d.K() && c4468d.l(0L) == 61) {
            i++;
            c4468d.readByte();
        }
        return i;
    }

    public static final boolean a(ia.C c10, int i, TimeUnit timeUnit) throws IOException {
        boolean z10;
        kotlin.jvm.internal.l.f(c10, "<this>");
        kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = c10.timeout().hasDeadline() ? c10.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        c10.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C4468d c4468d = new C4468d();
            while (c10.read(c4468d, 8192L) != -1) {
                c4468d.a();
            }
            z10 = true;
        } catch (InterruptedIOException unused) {
            z10 = false;
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
            }
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                c10.timeout().clearDeadline();
            } else {
                c10.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
        if (jDeadlineNanoTime == Long.MAX_VALUE) {
            c10.timeout().clearDeadline();
        } else {
            c10.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
        }
        return z10;
    }

    public static final ThreadFactory a(final String name, final boolean z10) {
        kotlin.jvm.internal.l.f(name, "name");
        return new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.O3
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return t82.a(name, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread a(String name, boolean z10, Runnable runnable) {
        kotlin.jvm.internal.l.f(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final kf0 a(List<ff0> list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        kf0.a aVar = new kf0.a();
        for (ff0 ff0Var : list) {
            aVar.a(ff0Var.f27309a.j(), ff0Var.f27310b.j());
        }
        return aVar.a();
    }

    public static final String a(rh0 rh0Var, boolean z10) {
        String strG;
        kotlin.jvm.internal.l.f(rh0Var, "<this>");
        if (y9.q.b0(rh0Var.g(), StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            strG = C1154e9.i("[", rh0Var.g(), "]");
        } else {
            strG = rh0Var.g();
        }
        if (!z10 && rh0Var.i() == rh0.b.a(rh0Var.k())) {
            return strG;
        }
        return strG + StringUtils.PROCESS_POSTFIX_DELIMITER + rh0Var.i();
    }

    public static final int a(int i, String str) throws NumberFormatException {
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

    public static final Exception a(IOException iOException, List suppressed) {
        kotlin.jvm.internal.l.f(iOException, "<this>");
        kotlin.jvm.internal.l.f(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.getClass();
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            b9.x.a(iOException, (Exception) it.next());
        }
        return iOException;
    }

    public static final void a(ia.f fVar, int i) throws IOException {
        kotlin.jvm.internal.l.f(fVar, "<this>");
        fVar.L((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        fVar.L((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        fVar.L(i & KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
