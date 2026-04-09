package vu;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    public static final Logger f24048r;

    /* renamed from: a, reason: collision with root package name */
    public final cv.i f24049a;

    /* renamed from: d, reason: collision with root package name */
    public final t f24050d;

    /* renamed from: g, reason: collision with root package name */
    public final e f24051g;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        br.l.d(logger, "getLogger(Http2::class.java.name)");
        f24048r = logger;
    }

    public u(cv.z zVar) {
        br.l.e(zVar, "source");
        this.f24049a = zVar;
        t tVar = new t(zVar);
        this.f24050d = tVar;
        this.f24051g = new e(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x024c, code lost:
    
        throw new java.io.IOException(h0.b.h(r13, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(boolean r19, ur.g r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.u.b(boolean, ur.g):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f24049a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0112, code lost:
    
        if (r8 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0114, code lost:
    
        r3.i(pu.b.f20646b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(ur.g r17, int r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.u.f(ur.g, int, int, int):void");
    }

    public final List h(int i10, int i11, int i12, int i13) throws IOException {
        t tVar = this.f24050d;
        tVar.f24046x = i10;
        tVar.f24043d = i10;
        tVar.f24047y = i11;
        tVar.f24044g = i12;
        tVar.f24045r = i13;
        e eVar = this.f24051g;
        cv.z zVar = eVar.f23989c;
        ArrayList arrayList = eVar.f23988b;
        while (!zVar.b()) {
            byte b2 = zVar.readByte();
            byte[] bArr = pu.b.f20645a;
            int i14 = b2 & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((b2 & 128) == 128) {
                int iE = eVar.e(i14, 127);
                int i15 = iE - 1;
                if (i15 >= 0) {
                    d[] dVarArr = g.f24002a;
                    if (i15 <= dVarArr.length - 1) {
                        arrayList.add(dVarArr[i15]);
                    }
                }
                int length = eVar.f23991e + 1 + (i15 - g.f24002a.length);
                if (length >= 0) {
                    d[] dVarArr2 = eVar.f23990d;
                    if (length < dVarArr2.length) {
                        d dVar = dVarArr2[length];
                        br.l.b(dVar);
                        arrayList.add(dVar);
                    }
                }
                throw new IOException(h0.b.h(iE, "Header index too large "));
            }
            if (i14 == 64) {
                d[] dVarArr3 = g.f24002a;
                cv.j jVarD = eVar.d();
                g.a(jVarD);
                eVar.c(new d(jVarD, eVar.d()));
            } else if ((b2 & 64) == 64) {
                eVar.c(new d(eVar.b(eVar.e(i14, 63) - 1), eVar.d()));
            } else if ((b2 & 32) == 32) {
                int iE2 = eVar.e(i14, 31);
                eVar.f23987a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + eVar.f23987a);
                }
                int i16 = eVar.f23993g;
                if (iE2 < i16) {
                    if (iE2 == 0) {
                        d[] dVarArr4 = eVar.f23990d;
                        mq.l.i0(dVarArr4, 0, dVarArr4.length);
                        eVar.f23991e = eVar.f23990d.length - 1;
                        eVar.f23992f = 0;
                        eVar.f23993g = 0;
                    } else {
                        eVar.a(i16 - iE2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                d[] dVarArr5 = g.f24002a;
                cv.j jVarD2 = eVar.d();
                g.a(jVarD2);
                arrayList.add(new d(jVarD2, eVar.d()));
            } else {
                arrayList.add(new d(eVar.b(eVar.e(i14, 15) - 1), eVar.d()));
            }
        }
        List listQ0 = mq.o.Q0(arrayList);
        arrayList.clear();
        return listQ0;
    }

    public final void i(ur.g gVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i13 = 0;
        int i14 = 1;
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            byte b2 = this.f24049a.readByte();
            byte[] bArr = pu.b.f20645a;
            i13 = b2 & 255;
        }
        if ((i11 & 32) != 0) {
            cv.i iVar = this.f24049a;
            iVar.readInt();
            iVar.readByte();
            byte[] bArr2 = pu.b.f20645a;
            i10 -= 5;
        }
        List listH = h(s.a(i10, i11, i13), i13, i11, i12);
        q qVar = (q) gVar.f23640g;
        if (i12 != 0 && (i12 & 1) == 0) {
            qVar.E.c(new n(qVar.f24030g + '[' + i12 + "] onHeaders", qVar, i12, listH, z10), 0L);
            return;
        }
        synchronized (qVar) {
            y yVarH = qVar.h(i12);
            if (yVarH != null) {
                yVarH.i(pu.b.u(listH), z10);
                return;
            }
            if (qVar.f24033y) {
                return;
            }
            if (i12 <= qVar.f24031r) {
                return;
            }
            if (i12 % 2 == qVar.f24032x % 2) {
                return;
            }
            y yVar = new y(i12, qVar, false, z10, pu.b.u(listH));
            qVar.f24031r = i12;
            qVar.f24029d.put(Integer.valueOf(i12), yVar);
            qVar.B.e().c(new k(qVar.f24030g + '[' + i12 + "] onStream", qVar, yVar, i14), 0L);
        }
    }

    public final void q(ur.g gVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i11 & 8) != 0) {
            byte b2 = this.f24049a.readByte();
            byte[] bArr = pu.b.f20645a;
            i13 = b2 & 255;
        } else {
            i13 = 0;
        }
        int i14 = this.f24049a.readInt() & Integer.MAX_VALUE;
        List listH = h(s.a(i10 - 4, i11, i13), i13, i11, i12);
        q qVar = (q) gVar.f23640g;
        synchronized (qVar) {
            if (qVar.U.contains(Integer.valueOf(i14))) {
                qVar.G(i14, c.PROTOCOL_ERROR);
                return;
            }
            qVar.U.add(Integer.valueOf(i14));
            qVar.E.c(new n(qVar.f24030g + '[' + i14 + "] onRequest", qVar, i14, listH, 1), 0L);
        }
    }
}
