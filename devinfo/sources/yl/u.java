package yl;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f37759d;

    /* renamed from: a, reason: collision with root package name */
    public final hm.g f37760a;

    /* renamed from: b, reason: collision with root package name */
    public final t f37761b;

    /* renamed from: c, reason: collision with root package name */
    public final e f37762c;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        nk.k.d(logger, "getLogger(...)");
        f37759d = logger;
    }

    public u(hm.q qVar) {
        nk.k.e(qVar, "source");
        this.f37760a = qVar;
        t tVar = new t(qVar);
        this.f37761b = tVar;
        this.f37762c = new e(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0149, code lost:
    
        throw new java.io.IOException(je.u.r(r7, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(boolean r13, yl.p r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.u.c(boolean, yl.p):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f37760a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r19 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        r9.j(rl.m.f33111b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(yl.p r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.u.e(yl.p, int, int, int):void");
    }

    public final void g(p pVar, int i4, int i10) throws IOException {
        b bVar;
        Object[] array;
        if (i4 < 8) {
            throw new IOException(je.u.r(i4, "TYPE_GOAWAY length < 8: "));
        }
        if (i10 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i11 = this.f37760a.readInt();
        int i12 = this.f37760a.readInt();
        int i13 = i4 - 8;
        b.f37663b.getClass();
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i14];
            if (bVar.f37670a == i12) {
                break;
            } else {
                i14++;
            }
        }
        if (bVar == null) {
            throw new IOException(je.u.r(i12, "TYPE_GOAWAY unexpected error code: "));
        }
        hm.h byteString = hm.h.f25175d;
        if (i13 > 0) {
            byteString = this.f37760a.readByteString(i13);
        }
        nk.k.e(byteString, "debugData");
        byteString.a();
        q qVar = pVar.f37721b;
        synchronized (qVar) {
            array = qVar.f37724b.values().toArray(new y[0]);
            qVar.f37728f = true;
        }
        for (y yVar : (y[]) array) {
            if (yVar.f37774a > i11 && yVar.h()) {
                yVar.k(b.REFUSED_STREAM);
                pVar.f37721b.m(yVar.f37774a);
            }
        }
    }

    public final List m(int i4, int i10, int i11, int i12) throws IOException {
        t tVar = this.f37761b;
        tVar.f37757e = i4;
        tVar.f37754b = i4;
        tVar.f37758f = i10;
        tVar.f37755c = i11;
        tVar.f37756d = i12;
        e eVar = this.f37762c;
        hm.q qVar = eVar.f37686c;
        ArrayList arrayList = eVar.f37685b;
        while (!qVar.exhausted()) {
            byte b10 = qVar.readByte();
            byte[] bArr = sl.f.f33832a;
            int i13 = b10 & 255;
            if (i13 == 128) {
                throw new IOException("index == 0");
            }
            if ((b10 & 128) == 128) {
                int iE = eVar.e(i13, 127);
                int i14 = iE - 1;
                if (i14 >= 0) {
                    d[] dVarArr = g.f37697a;
                    if (i14 <= dVarArr.length - 1) {
                        arrayList.add(dVarArr[i14]);
                    }
                }
                int length = eVar.f37688e + 1 + (i14 - g.f37697a.length);
                if (length >= 0) {
                    d[] dVarArr2 = eVar.f37687d;
                    if (length < dVarArr2.length) {
                        d dVar = dVarArr2[length];
                        nk.k.b(dVar);
                        arrayList.add(dVar);
                    }
                }
                throw new IOException(je.u.r(iE, "Header index too large "));
            }
            if (i13 == 64) {
                d[] dVarArr3 = g.f37697a;
                hm.h hVarD = eVar.d();
                g.a(hVarD);
                eVar.c(new d(hVarD, eVar.d()));
            } else if ((b10 & 64) == 64) {
                eVar.c(new d(eVar.b(eVar.e(i13, 63) - 1), eVar.d()));
            } else if ((b10 & 32) == 32) {
                int iE2 = eVar.e(i13, 31);
                eVar.f37684a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + eVar.f37684a);
                }
                int i15 = eVar.g;
                if (iE2 < i15) {
                    if (iE2 == 0) {
                        d[] dVarArr4 = eVar.f37687d;
                        zj.m.U(0, dVarArr4.length, null, dVarArr4);
                        eVar.f37688e = eVar.f37687d.length - 1;
                        eVar.f37689f = 0;
                        eVar.g = 0;
                    } else {
                        eVar.a(i15 - iE2);
                    }
                }
            } else if (i13 == 16 || i13 == 0) {
                d[] dVarArr5 = g.f37697a;
                hm.h hVarD2 = eVar.d();
                g.a(hVarD2);
                arrayList.add(new d(hVarD2, eVar.d()));
            } else {
                arrayList.add(new d(eVar.b(eVar.e(i13, 15) - 1), eVar.d()));
            }
        }
        List listR0 = zj.n.r0(arrayList);
        arrayList.clear();
        return listR0;
    }

    public final void p(p pVar, int i4, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i12 = 0;
        boolean z3 = (i10 & 1) != 0;
        if ((i10 & 8) != 0) {
            byte b10 = this.f37760a.readByte();
            byte[] bArr = sl.f.f33832a;
            i12 = b10 & 255;
        }
        if ((i10 & 32) != 0) {
            hm.g gVar = this.f37760a;
            gVar.readInt();
            gVar.readByte();
            byte[] bArr2 = sl.f.f33832a;
            i4 -= 5;
        }
        List listM = m(s.a(i4, i10, i12), i12, i10, i11);
        q qVar = pVar.f37721b;
        if (i11 != 0 && (i11 & 1) == 0) {
            ul.c.c(qVar.f37730i, qVar.f37725c + '[' + i11 + "] onHeaders", new l(qVar, i11, listM, z3));
            return;
        }
        synchronized (qVar) {
            y yVarE = qVar.e(i11);
            if (yVarE != null) {
                yVarE.j(sl.h.h(listM), z3);
                return;
            }
            if (qVar.f37728f) {
                return;
            }
            if (i11 <= qVar.f37726d) {
                return;
            }
            if (i11 % 2 == qVar.f37727e % 2) {
                return;
            }
            y yVar = new y(i11, qVar, false, z3, sl.h.h(listM));
            qVar.f37726d = i11;
            qVar.f37724b.put(Integer.valueOf(i11), yVar);
            ul.c.c(qVar.g.d(), qVar.f37725c + '[' + i11 + "] onStream", new c0.p(14, qVar, yVar));
        }
    }

    public final void v(p pVar, int i4, int i10, int i11) throws IOException {
        if (i4 != 8) {
            throw new IOException(je.u.r(i4, "TYPE_PING length != 8: "));
        }
        if (i11 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        final int i12 = this.f37760a.readInt();
        final int i13 = this.f37760a.readInt();
        if (!((i10 & 1) != 0)) {
            ul.c cVar = pVar.f37721b.f37729h;
            String strW = d.h.w(new StringBuilder(), pVar.f37721b.f37725c, " ping");
            final q qVar = pVar.f37721b;
            ul.c.c(cVar, strW, new mk.a() { // from class: yl.o
                @Override // mk.a
                public final Object invoke() throws IOException {
                    q qVar2 = qVar;
                    try {
                        qVar2.f37743w.v(true, i12, i13);
                    } catch (IOException e2) {
                        b bVar = b.PROTOCOL_ERROR;
                        qVar2.c(bVar, bVar, e2);
                    }
                    return yj.u.f37649a;
                }
            });
            return;
        }
        q qVar2 = pVar.f37721b;
        synchronized (qVar2) {
            try {
                if (i12 == 1) {
                    qVar2.f37732l++;
                } else if (i12 == 2) {
                    qVar2.f37734n++;
                } else if (i12 == 3) {
                    qVar2.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w(p pVar, int i4, int i10, int i11) throws IOException {
        int i12;
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i13 = 0;
        if ((i10 & 8) != 0) {
            byte b10 = this.f37760a.readByte();
            byte[] bArr = sl.f.f33832a;
            i12 = b10 & 255;
        } else {
            i12 = 0;
        }
        int i14 = this.f37760a.readInt() & Integer.MAX_VALUE;
        List listM = m(s.a(i4 - 4, i10, i12), i12, i10, i11);
        q qVar = pVar.f37721b;
        synchronized (qVar) {
            if (qVar.f37745y.contains(Integer.valueOf(i14))) {
                qVar.y(i14, b.PROTOCOL_ERROR);
                return;
            }
            qVar.f37745y.add(Integer.valueOf(i14));
            ul.c.c(qVar.f37730i, qVar.f37725c + '[' + i14 + "] onRequest", new l(qVar, i14, listM, i13));
        }
    }
}
