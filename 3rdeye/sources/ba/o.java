package ba;

import N7.H7;
import ba.d;
import ba.f;
import ia.C;
import ia.C4468d;
import ia.D;
import ia.w;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Http2Reader.kt */
/* loaded from: classes3.dex */
public final class o implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f18213e;

    /* renamed from: b, reason: collision with root package name */
    public final w f18214b;

    /* renamed from: c, reason: collision with root package name */
    public final b f18215c;

    /* renamed from: d, reason: collision with root package name */
    public final d.a f18216d;

    /* compiled from: Http2Reader.kt */
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
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        kotlin.jvm.internal.l.e(logger, "getLogger(Http2::class.java.name)");
        f18213e = logger;
    }

    public o(w source) {
        kotlin.jvm.internal.l.f(source, "source");
        this.f18214b = source;
        b bVar = new b(source);
        this.f18215c = bVar;
        this.f18216d = new d.a(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01de, code lost:
    
        throw new java.io.IOException(g0.C4356c.h(r11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r19, ba.f.c r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.o.a(boolean, ba.f$c):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        throw new java.io.IOException(g0.C4356c.h(r7, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ba.c> c(int r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.o.c(int, int, int, int):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18214b.close();
    }

    public final void d(f.c cVar, int i) throws IOException {
        w wVar = this.f18214b;
        wVar.readInt();
        wVar.readByte();
        byte[] bArr = V9.b.f13053a;
    }

    /* compiled from: Http2Reader.kt */
    public static final class b implements C {

        /* renamed from: b, reason: collision with root package name */
        public final w f18217b;

        /* renamed from: c, reason: collision with root package name */
        public int f18218c;

        /* renamed from: d, reason: collision with root package name */
        public int f18219d;

        /* renamed from: e, reason: collision with root package name */
        public int f18220e;

        /* renamed from: f, reason: collision with root package name */
        public int f18221f;

        /* renamed from: g, reason: collision with root package name */
        public int f18222g;

        public b(w source) {
            kotlin.jvm.internal.l.f(source, "source");
            this.f18217b = source;
        }

        @Override // ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            int i;
            int i10;
            kotlin.jvm.internal.l.f(sink, "sink");
            do {
                int i11 = this.f18221f;
                w wVar = this.f18217b;
                if (i11 == 0) {
                    wVar.skip(this.f18222g);
                    this.f18222g = 0;
                    if ((this.f18219d & 4) == 0) {
                        i = this.f18220e;
                        int iS = V9.b.s(wVar);
                        this.f18221f = iS;
                        this.f18218c = iS;
                        int i12 = wVar.readByte() & 255;
                        this.f18219d = wVar.readByte() & 255;
                        Logger logger = o.f18213e;
                        if (logger.isLoggable(Level.FINE)) {
                            e eVar = e.f18138a;
                            int i13 = this.f18220e;
                            int i14 = this.f18218c;
                            int i15 = this.f18219d;
                            eVar.getClass();
                            logger.fine(e.a(true, i13, i14, i12, i15));
                        }
                        i10 = wVar.readInt() & Integer.MAX_VALUE;
                        this.f18220e = i10;
                        if (i12 != 9) {
                            throw new IOException(i12 + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long j10 = wVar.read(sink, Math.min(j4, i11));
                    if (j10 != -1) {
                        this.f18221f -= (int) j10;
                        return j10;
                    }
                }
                return -1L;
            } while (i10 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // ia.C
        public final D timeout() {
            return this.f18217b.f38684b.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }
}
