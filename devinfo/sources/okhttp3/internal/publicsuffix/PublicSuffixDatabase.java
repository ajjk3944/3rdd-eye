package okhttp3.internal.publicsuffix;

import cm.g;
import ec.y;
import hm.h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import nk.k;
import uk.j;
import va.o;
import vk.i;
import zj.n;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: b, reason: collision with root package name */
    public static final h f30577b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f30578c;

    /* renamed from: d, reason: collision with root package name */
    public static final PublicSuffixDatabase f30579d;

    /* renamed from: a, reason: collision with root package name */
    public final o f30580a;

    static {
        byte[] bArrCopyOf = Arrays.copyOf(new byte[]{42}, 1);
        k.d(bArrCopyOf, "copyOf(...)");
        f30577b = new h(bArrCopyOf);
        f30578c = g.s("*");
        f30579d = new PublicSuffixDatabase(new o(4));
    }

    public PublicSuffixDatabase(o oVar) {
        this.f30580a = oVar;
    }

    public static List b(String str) {
        List listR0 = i.R0(str, new char[]{'.'});
        return k.a(n.h0(listR0), "") ? n.b0(listR0) : listR0;
    }

    public final String a(String str) throws InterruptedException {
        String strC;
        String strC2;
        String strC3;
        List listR0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        k.b(unicode);
        List listB = b(unicode);
        o oVar = this.f30580a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) oVar.f36146b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) oVar.f36147c).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z3 = false;
            while (true) {
                try {
                    try {
                        oVar.n();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z3 = true;
                    } catch (IOException e2) {
                        oVar.f36150f = e2;
                        if (z3) {
                        }
                    }
                } finally {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((h) oVar.f36148d) == null) {
            StringBuilder sb2 = new StringBuilder("Unable to load ");
            sb2.append(oVar.g);
            sb2.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb2.toString());
            illegalStateException.initCause((IOException) oVar.f36150f);
            throw illegalStateException;
        }
        int size3 = listB.size();
        h[] hVarArr = new h[size3];
        for (int i4 = 0; i4 < size3; i4++) {
            h hVar = h.f25175d;
            hVarArr[i4] = y.f((String) listB.get(i4));
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                strC = null;
                break;
            }
            h hVar2 = (h) oVar.f36148d;
            if (hVar2 == null) {
                k.k("bytes");
                throw null;
            }
            strC = y.c(hVar2, hVarArr, i10);
            if (strC != null) {
                break;
            }
            i10++;
        }
        if (size3 > 1) {
            h[] hVarArr2 = (h[]) hVarArr.clone();
            int length = hVarArr2.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                hVarArr2[i11] = f30577b;
                h hVar3 = (h) oVar.f36148d;
                if (hVar3 == null) {
                    k.k("bytes");
                    throw null;
                }
                strC2 = y.c(hVar3, hVarArr2, i11);
                if (strC2 != null) {
                    break;
                }
            }
            strC2 = null;
        } else {
            strC2 = null;
        }
        if (strC2 != null) {
            int i12 = size3 - 1;
            for (int i13 = 0; i13 < i12; i13++) {
                h hVar4 = (h) oVar.f36149e;
                if (hVar4 == null) {
                    k.k("exceptionBytes");
                    throw null;
                }
                strC3 = y.c(hVar4, hVarArr, i13);
                if (strC3 != null) {
                    break;
                }
            }
            strC3 = null;
        } else {
            strC3 = null;
        }
        if (strC3 != null) {
            listR0 = i.R0("!".concat(strC3), new char[]{'.'});
        } else if (strC == null && strC2 == null) {
            listR0 = f30578c;
        } else {
            List listR02 = s.f38317a;
            List listR03 = strC != null ? i.R0(strC, new char[]{'.'}) : listR02;
            if (strC2 != null) {
                listR02 = i.R0(strC2, new char[]{'.'});
            }
            listR0 = listR03.size() > listR02.size() ? listR03 : listR02;
        }
        if (listB.size() == listR0.size() && ((String) listR0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listR0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listR0.size();
        } else {
            size = listB.size();
            size2 = listR0.size() + 1;
        }
        return uk.i.H(uk.i.G(new j(3, b(str)), size - size2), ".");
    }
}
