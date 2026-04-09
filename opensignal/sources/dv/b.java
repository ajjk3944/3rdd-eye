package dv;

import ar.n;
import br.t;
import br.v;
import com.google.android.gms.internal.measurement.b4;
import cv.c0;
import cv.w;
import cv.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import lq.l;
import mq.b0;
import mq.o;
import tt.s;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7591a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = w.f6742d;
        w wVarQ = cg.e.q("/");
        l[] lVarArr = {new l(wVarQ, new g(wVarQ, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(b0.P(1));
        b0.U(linkedHashMap, lVarArr);
        for (g gVar : o.M0(arrayList, new h(0))) {
            if (((g) linkedHashMap.put(gVar.f7606a, gVar)) == null) {
                while (true) {
                    w wVar = gVar.f7606a;
                    w wVarB = wVar.b();
                    if (wVarB != null) {
                        g gVar2 = (g) linkedHashMap.get(wVarB);
                        if (gVar2 != null) {
                            gVar2.f7620q.add(wVar);
                            break;
                        }
                        g gVar3 = new g(wVarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(wVarB, gVar3);
                        gVar3.f7620q.add(wVar);
                        gVar = gVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i10) {
        b4.g(16);
        String string = Integer.toString(i10, 16);
        br.l.d(string, "toString(...)");
        return "0x".concat(string);
    }

    public static final g d(z zVar) throws IOException {
        int iH = zVar.h();
        if (iH != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iH));
        }
        zVar.skip(4L);
        short sQ = zVar.q();
        int i10 = sQ & 65535;
        if ((sQ & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i10));
        }
        int iQ = zVar.q() & 65535;
        int iQ2 = zVar.q() & 65535;
        int iQ3 = zVar.q() & 65535;
        long jH = zVar.h() & 4294967295L;
        v vVar = new v();
        vVar.f2916a = zVar.h() & 4294967295L;
        v vVar2 = new v();
        vVar2.f2916a = zVar.h() & 4294967295L;
        int iQ4 = zVar.q() & 65535;
        int iQ5 = zVar.q() & 65535;
        int iQ6 = 65535 & zVar.q();
        zVar.skip(8L);
        v vVar3 = new v();
        vVar3.f2916a = zVar.h() & 4294967295L;
        String strW = zVar.w(iQ4);
        if (tt.l.r0(strW, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = vVar2.f2916a == 4294967295L ? 8 : 0L;
        if (vVar.f2916a == 4294967295L) {
            j += 8;
        }
        if (vVar3.f2916a == 4294967295L) {
            j += 8;
        }
        br.w wVar = new br.w();
        br.w wVar2 = new br.w();
        br.w wVar3 = new br.w();
        t tVar = new t();
        e(zVar, iQ5, new j(tVar, j, vVar2, zVar, vVar, vVar3, wVar, wVar2, wVar3));
        if (j > 0 && !tVar.f2914a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strW2 = zVar.w(iQ6);
        String str = w.f6742d;
        return new g(cg.e.q("/").d(strW), s.f0(strW, "/", false), strW2, jH, vVar.f2916a, vVar2.f2916a, iQ, vVar3.f2916a, iQ3, iQ2, (Long) wVar.f2917a, (Long) wVar2.f2917a, (Long) wVar3.f2917a, 57344);
    }

    public static final void e(z zVar, int i10, n nVar) throws IOException {
        cv.g gVar = zVar.f6754d;
        long j = i10;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iQ = zVar.q() & 65535;
            long jQ = zVar.q() & 65535;
            long j7 = j - 4;
            if (j7 < jQ) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            zVar.g0(jQ);
            long j10 = gVar.f6706d;
            nVar.w(Integer.valueOf(iQ), Long.valueOf(jQ));
            long j11 = (gVar.f6706d + jQ) - j10;
            if (j11 < 0) {
                throw new IOException(h0.b.h(iQ, "unsupported zip: too many bytes processed for "));
            }
            if (j11 > 0) {
                gVar.skip(j11);
            }
            j = j7 - jQ;
        }
    }

    public static final g f(z zVar, g gVar) throws IOException {
        int iH = zVar.h();
        if (iH != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iH));
        }
        zVar.skip(2L);
        short sQ = zVar.q();
        int i10 = sQ & 65535;
        if ((sQ & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i10));
        }
        zVar.skip(18L);
        int iQ = zVar.q() & 65535;
        zVar.skip(zVar.q() & 65535);
        if (gVar == null) {
            zVar.skip(iQ);
            return null;
        }
        br.w wVar = new br.w();
        br.w wVar2 = new br.w();
        br.w wVar3 = new br.w();
        e(zVar, iQ, new i(zVar, wVar, wVar2, wVar3));
        return new g(gVar.f7606a, gVar.f7607b, gVar.f7608c, gVar.f7609d, gVar.f7610e, gVar.f7611f, gVar.f7612g, gVar.f7613h, gVar.f7614i, gVar.j, gVar.k, gVar.f7615l, gVar.f7616m, (Integer) wVar.f2917a, (Integer) wVar2.f2917a, (Integer) wVar3.f2917a);
    }

    public static final int g(c0 c0Var, int i10) {
        int i11;
        int[] iArr = c0Var.f6695y;
        int i12 = i10 + 1;
        int length = c0Var.f6694x.length;
        br.l.e(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }
}
