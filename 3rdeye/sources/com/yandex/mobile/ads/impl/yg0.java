package com.yandex.mobile.ads.impl;

import N7.H7;
import com.yandex.mobile.ads.impl.o50;
import com.yandex.mobile.ads.impl.wf0;
import g0.C4356c;
import ia.C4468d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class yg0 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f35786e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f35787f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final ia.g f35788a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35789b;

    /* renamed from: c, reason: collision with root package name */
    private final b f35790c;

    /* renamed from: d, reason: collision with root package name */
    private final wf0.a f35791d;

    public static final class b implements ia.C {

        /* renamed from: a, reason: collision with root package name */
        private final ia.g f35792a;

        /* renamed from: b, reason: collision with root package name */
        private int f35793b;

        /* renamed from: c, reason: collision with root package name */
        private int f35794c;

        /* renamed from: d, reason: collision with root package name */
        private int f35795d;

        /* renamed from: e, reason: collision with root package name */
        private int f35796e;

        /* renamed from: f, reason: collision with root package name */
        private int f35797f;

        public b(ia.g source) {
            kotlin.jvm.internal.l.f(source, "source");
            this.f35792a = source;
        }

        private final void b() throws IOException {
            int i = this.f35795d;
            int iA = t82.a(this.f35792a);
            this.f35796e = iA;
            this.f35793b = iA;
            int iA2 = t82.a(this.f35792a.readByte());
            this.f35794c = t82.a(this.f35792a.readByte());
            int i10 = yg0.f35787f;
            if (a.a().isLoggable(Level.FINE)) {
                Logger loggerA = a.a();
                rg0 rg0Var = rg0.f32624a;
                int i11 = this.f35795d;
                int i12 = this.f35793b;
                int i13 = this.f35794c;
                rg0Var.getClass();
                loggerA.fine(rg0.a(true, i11, i12, iA2, i13));
            }
            int i14 = this.f35792a.readInt() & Integer.MAX_VALUE;
            this.f35795d = i14;
            if (iA2 == 9) {
                if (i14 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iA2 + " != TYPE_CONTINUATION");
            }
        }

        public final int a() {
            return this.f35796e;
        }

        public final void c(int i) {
            this.f35793b = i;
        }

        public final void d(int i) {
            this.f35797f = i;
        }

        public final void e(int i) {
            this.f35795d = i;
        }

        @Override // ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            while (true) {
                int i = this.f35796e;
                if (i != 0) {
                    long j10 = this.f35792a.read(sink, Math.min(j4, i));
                    if (j10 == -1) {
                        return -1L;
                    }
                    this.f35796e -= (int) j10;
                    return j10;
                }
                this.f35792a.skip(this.f35797f);
                this.f35797f = 0;
                if ((this.f35794c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        @Override // ia.C
        public final ia.D timeout() {
            return this.f35792a.timeout();
        }

        public final void a(int i) {
            this.f35794c = i;
        }

        public final void b(int i) {
            this.f35796e = i;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }

    public interface c {
        void a(int i, int i10, ia.g gVar, boolean z10) throws IOException;

        void a(int i, int i10, boolean z10);

        void a(int i, long j4);

        void a(int i, o50 o50Var);

        void a(int i, o50 o50Var, ia.h hVar);

        void a(int i, List list) throws IOException;

        void a(ox1 ox1Var);

        void a(boolean z10, int i, List list);
    }

    static {
        Logger logger = Logger.getLogger(rg0.class.getName());
        kotlin.jvm.internal.l.e(logger, "getLogger(...)");
        f35786e = logger;
    }

    public yg0(ia.g source, boolean z10) {
        kotlin.jvm.internal.l.f(source, "source");
        this.f35788a = source;
        this.f35789b = z10;
        b bVar = new b(source);
        this.f35790c = bVar;
        this.f35791d = new wf0.a(bVar);
    }

    private final void b(c cVar, int i, int i10) throws IOException {
        if (i != 5) {
            throw new IOException(C4356c.i(i, "TYPE_PRIORITY length: ", " != 5"));
        }
        if (i10 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        this.f35788a.readInt();
        this.f35788a.readByte();
        byte[] bArr = t82.f33480a;
        cVar.getClass();
    }

    private final void c(c cVar, int i, int i10) throws IOException {
        if (i != 4) {
            throw new IOException(C4356c.i(i, "TYPE_RST_STREAM length: ", " != 4"));
        }
        if (i10 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i11 = this.f35788a.readInt();
        o50.f31185c.getClass();
        o50 o50VarA = o50.a.a(i11);
        if (o50VarA == null) {
            throw new IOException(C4356c.h(i11, "TYPE_RST_STREAM unexpected error code: "));
        }
        cVar.a(i10, o50VarA);
    }

    private final void d(c cVar, int i, int i10) throws IOException {
        if (i != 4) {
            throw new IOException(C4356c.h(i, "TYPE_WINDOW_UPDATE length !=4: "));
        }
        long jA = t82.a(this.f35788a.readInt());
        if (jA == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.a(i10, jA);
    }

    public final boolean a(boolean z10, c handler) throws IOException {
        int i;
        kotlin.jvm.internal.l.f(handler, "handler");
        try {
            this.f35788a.F0(9L);
            int iA = t82.a(this.f35788a);
            if (iA > 16384) {
                throw new IOException(C4356c.h(iA, "FRAME_SIZE_ERROR: "));
            }
            int iA2 = t82.a(this.f35788a.readByte());
            int iA3 = t82.a(this.f35788a.readByte());
            int i10 = this.f35788a.readInt() & Integer.MAX_VALUE;
            Logger logger = f35786e;
            if (logger.isLoggable(Level.FINE)) {
                rg0.f32624a.getClass();
                logger.fine(rg0.a(true, i10, iA, iA2, iA3));
            }
            if (z10 && iA2 != 4) {
                rg0.f32624a.getClass();
                throw new IOException(androidx.work.s.d("Expected a SETTINGS frame but was ", rg0.a(iA2)));
            }
            switch (iA2) {
                case 0:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z11 = (iA3 & 1) != 0;
                    if ((iA3 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    i = (iA3 & 8) != 0 ? this.f35788a.readByte() & 255 : 0;
                    handler.a(i10, a.a(iA, iA3, i), this.f35788a, z11);
                    this.f35788a.skip(i);
                    return true;
                case 1:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z12 = (iA3 & 1) != 0;
                    i = (iA3 & 8) != 0 ? this.f35788a.readByte() & 255 : 0;
                    if ((iA3 & 32) != 0) {
                        this.f35788a.readInt();
                        this.f35788a.readByte();
                        iA -= 5;
                    }
                    this.f35790c.b(a.a(iA, iA3, i));
                    b bVar = this.f35790c;
                    bVar.c(bVar.a());
                    this.f35790c.d(i);
                    this.f35790c.a(iA3);
                    this.f35790c.e(i10);
                    this.f35791d.c();
                    handler.a(z12, i10, this.f35791d.a());
                    return true;
                case 2:
                    b(handler, iA, i10);
                    return true;
                case 3:
                    c(handler, iA, i10);
                    return true;
                case 4:
                    b(handler, iA, iA3, i10);
                    return true;
                case 5:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    i = (iA3 & 8) != 0 ? this.f35788a.readByte() & 255 : 0;
                    int i11 = this.f35788a.readInt() & Integer.MAX_VALUE;
                    this.f35790c.b(a.a(iA - 4, iA3, i));
                    b bVar2 = this.f35790c;
                    bVar2.c(bVar2.a());
                    this.f35790c.d(i);
                    this.f35790c.a(iA3);
                    this.f35790c.e(i10);
                    this.f35791d.c();
                    handler.a(i11, this.f35791d.a());
                    return true;
                case 6:
                    a(handler, iA, iA3, i10);
                    return true;
                case 7:
                    a(handler, iA, i10);
                    return true;
                case 8:
                    d(handler, iA, i10);
                    return true;
                default:
                    this.f35788a.skip(iA);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f35788a.close();
    }

    public static final class a {
        public static int a(int i, int i10, int i11) throws IOException {
            if ((i10 & 8) != 0) {
                i--;
            }
            if (i11 <= i) {
                return i - i11;
            }
            throw new IOException(H7.n(i11, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        }

        public static Logger a() {
            return yg0.f35786e;
        }
    }

    private final void b(c cVar, int i, int i10, int i11) throws IOException {
        int i12;
        if (i11 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i10 & 1) != 0) {
            if (i == 0) {
                cVar.getClass();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        }
        if (i % 6 == 0) {
            ox1 ox1Var = new ox1();
            v9.e eVarN = v9.h.N(v9.h.O(0, i), 6);
            int i13 = eVarN.f47096b;
            int i14 = eVarN.f47097c;
            int i15 = eVarN.f47098d;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    int iA = t82.a(this.f35788a.readShort());
                    i12 = this.f35788a.readInt();
                    if (iA != 2) {
                        if (iA == 3) {
                            iA = 4;
                        } else if (iA != 4) {
                            if (iA == 5 && (i12 < 16384 || i12 > 16777215)) {
                                break;
                            }
                        } else {
                            if (i12 < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                            iA = 7;
                        }
                    } else if (i12 != 0 && i12 != 1) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    ox1Var.a(iA, i12);
                    if (i13 == i14) {
                        break;
                    } else {
                        i13 += i15;
                    }
                }
                throw new IOException(C4356c.h(i12, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
            }
            cVar.a(ox1Var);
            return;
        }
        throw new IOException(C4356c.h(i, "TYPE_SETTINGS length % 6 != 0: "));
    }

    public final void a(c handler) throws IOException {
        kotlin.jvm.internal.l.f(handler, "handler");
        if (this.f35789b) {
            if (!a(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ia.g gVar = this.f35788a;
        ia.h hVar = rg0.f32625b;
        ia.h hVarG = gVar.g(hVar.c());
        Logger logger = f35786e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(t82.a(androidx.work.s.d("<< CONNECTION ", hVarG.d()), new Object[0]));
        }
        if (!hVar.equals(hVarG)) {
            throw new IOException("Expected a connection header but was ".concat(hVarG.j()));
        }
    }

    private final void a(c cVar, int i, int i10) throws IOException {
        if (i < 8) {
            throw new IOException(C4356c.h(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i10 == 0) {
            int i11 = this.f35788a.readInt();
            int i12 = this.f35788a.readInt();
            int i13 = i - 8;
            o50.f31185c.getClass();
            o50 o50VarA = o50.a.a(i12);
            if (o50VarA != null) {
                ia.h hVarG = ia.h.f38646e;
                if (i13 > 0) {
                    hVarG = this.f35788a.g(i13);
                }
                cVar.a(i11, o50VarA, hVarG);
                return;
            }
            throw new IOException(C4356c.h(i12, "TYPE_GOAWAY unexpected error code: "));
        }
        throw new IOException("TYPE_GOAWAY streamId != 0");
    }

    private final void a(c cVar, int i, int i10, int i11) throws IOException {
        if (i != 8) {
            throw new IOException(C4356c.h(i, "TYPE_PING length != 8: "));
        }
        if (i11 == 0) {
            cVar.a(this.f35788a.readInt(), this.f35788a.readInt(), (i10 & 1) != 0);
            return;
        }
        throw new IOException("TYPE_PING streamId != 0");
    }
}
