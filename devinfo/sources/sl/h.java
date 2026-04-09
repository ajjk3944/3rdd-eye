package sl;

import hm.w;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import km.y;
import nk.k;
import rl.m;
import rl.n;
import rl.t;
import rl.z;
import vk.i;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f33837a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f33838b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        k.b(timeZone);
        f33837a = timeZone;
        f33838b = i.O0(i.N0(t.class.getName(), "okhttp3."));
    }

    public static final boolean a(n nVar, n nVar2) {
        k.e(nVar, "<this>");
        k.e(nVar2, "other");
        return k.a(nVar.f33116d, nVar2.f33116d) && nVar.f33117e == nVar2.f33117e && k.a(nVar.f33113a, nVar2.f33113a);
    }

    public static final int b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k.e(timeUnit, "unit");
        long millis = timeUnit.toMillis(30L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        k.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e10) {
            if (!k.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        k.e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(z zVar) {
        String strA = zVar.f33209f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = f.f33832a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(hm.g gVar, Charset charset) {
        k.e(gVar, "<this>");
        k.e(charset, "default");
        int iC = gVar.C(f.f33833b);
        if (iC == -1) {
            return charset;
        }
        if (iC == 0) {
            return vk.a.f36267a;
        }
        if (iC == 1) {
            return vk.a.f36268b;
        }
        if (iC == 2) {
            Charset charset2 = vk.a.f36267a;
            Charset charset3 = vk.a.f36270d;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            k.d(charsetForName, "forName(...)");
            vk.a.f36270d = charsetForName;
            return charsetForName;
        }
        if (iC == 3) {
            return vk.a.f36269c;
        }
        if (iC != 4) {
            throw new AssertionError();
        }
        Charset charset4 = vk.a.f36267a;
        Charset charset5 = vk.a.f36271e;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        k.d(charsetForName2, "forName(...)");
        vk.a.f36271e = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(w wVar, int i4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        k.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = wVar.timeout().e() ? wVar.timeout().c() - jNanoTime : Long.MAX_VALUE;
        wVar.timeout().d(Math.min(jC, timeUnit.toNanos(i4)) + jNanoTime);
        try {
            hm.e eVar = new hm.e();
            while (wVar.n(eVar, 8192L) != -1) {
                eVar.e();
            }
            if (jC == Long.MAX_VALUE) {
                wVar.timeout().a();
                return true;
            }
            wVar.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                wVar.timeout().a();
                return false;
            }
            wVar.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                wVar.timeout().a();
            } else {
                wVar.timeout().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final m h(List list) {
        y yVar = new y(17);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yl.d dVar = (yl.d) it.next();
            yVar.v(dVar.f37680a.j(), dVar.f37681b.j());
        }
        return yVar.x();
    }

    public static final String i(n nVar, boolean z3) {
        k.e(nVar, "<this>");
        int i4 = nVar.f33117e;
        String strP = nVar.f33116d;
        if (i.y0(strP, ":", false)) {
            strP = d.h.p(']', "[", strP);
        }
        if (!z3) {
            String str = nVar.f33113a;
            k.e(str, "scheme");
            if (i4 == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strP;
            }
        }
        return strP + ':' + i4;
    }

    public static final List j(List list) {
        k.e(list, "<this>");
        if (list.isEmpty()) {
            return s.f38317a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            k.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        k.d(array, "toArray(...)");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(zj.m.I(array));
        k.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return s.f38317a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            k.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(zj.m.I((Object[]) objArr.clone()));
        k.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
