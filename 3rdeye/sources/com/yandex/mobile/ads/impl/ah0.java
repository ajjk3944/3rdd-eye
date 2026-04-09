package com.yandex.mobile.ads.impl;

import N7.H7;
import com.yandex.mobile.ads.impl.wf0;
import g0.C4356c;
import ia.C4468d;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class ah0 implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f24660g = Logger.getLogger(rg0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ia.f f24661a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24662b;

    /* renamed from: c, reason: collision with root package name */
    private final C4468d f24663c;

    /* renamed from: d, reason: collision with root package name */
    private int f24664d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24665e;

    /* renamed from: f, reason: collision with root package name */
    private final wf0.b f24666f;

    public ah0(ia.f sink, boolean z10) {
        kotlin.jvm.internal.l.f(sink, "sink");
        this.f24661a = sink;
        this.f24662b = z10;
        C4468d c4468d = new C4468d();
        this.f24663c = c4468d;
        this.f24664d = 16384;
        this.f24666f = new wf0.b(c4468d);
    }

    public final synchronized void a(ox1 peerSettings) throws IOException {
        try {
            kotlin.jvm.internal.l.f(peerSettings, "peerSettings");
            if (this.f24665e) {
                throw new IOException("closed");
            }
            this.f24664d = peerSettings.b(this.f24664d);
            if (peerSettings.a() != -1) {
                this.f24666f.b(peerSettings.a());
            }
            a(0, 0, 4, 1);
            this.f24661a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int b() {
        return this.f24664d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f24665e = true;
        this.f24661a.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f24665e) {
            throw new IOException("closed");
        }
        this.f24661a.flush();
    }

    public final synchronized void b(ox1 settings) throws IOException {
        try {
            kotlin.jvm.internal.l.f(settings, "settings");
            if (this.f24665e) {
                throw new IOException("closed");
            }
            int i = 0;
            a(0, settings.d() * 6, 4, 0);
            while (i < 10) {
                if (settings.c(i)) {
                    this.f24661a.j(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f24661a.m(settings.a(i));
                }
                i++;
            }
            this.f24661a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() throws IOException {
        try {
            if (!this.f24665e) {
                if (this.f24662b) {
                    Logger logger = f24660g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(t82.a(">> CONNECTION " + rg0.f32625b.d(), new Object[0]));
                    }
                    this.f24661a.P(rg0.f32625b);
                    this.f24661a.flush();
                    return;
                }
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(boolean z10, int i, C4468d c4468d, int i10) throws IOException {
        if (!this.f24665e) {
            a(i, i10, 0, z10 ? 1 : 0);
            if (i10 > 0) {
                ia.f fVar = this.f24661a;
                kotlin.jvm.internal.l.c(c4468d);
                fVar.write(c4468d, i10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, o50 errorCode, byte[] debugData) throws IOException {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        kotlin.jvm.internal.l.f(debugData, "debugData");
        if (!this.f24665e) {
            if (errorCode.a() != -1) {
                a(0, debugData.length + 8, 7, 0);
                this.f24661a.m(i);
                this.f24661a.m(errorCode.a());
                if (debugData.length != 0) {
                    this.f24661a.t0(debugData);
                }
                this.f24661a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, ArrayList headerBlock, boolean z10) throws IOException {
        kotlin.jvm.internal.l.f(headerBlock, "headerBlock");
        if (!this.f24665e) {
            this.f24666f.a(headerBlock);
            long j4 = this.f24663c.f38643c;
            long jMin = Math.min(this.f24664d, j4);
            int i10 = j4 == jMin ? 4 : 0;
            if (z10) {
                i10 |= 1;
            }
            a(i, (int) jMin, 1, i10);
            this.f24661a.write(this.f24663c, jMin);
            if (j4 > jMin) {
                long j10 = j4 - jMin;
                while (j10 > 0) {
                    long jMin2 = Math.min(this.f24664d, j10);
                    j10 -= jMin2;
                    a(i, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                    this.f24661a.write(this.f24663c, jMin2);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, int i10, boolean z10) throws IOException {
        if (!this.f24665e) {
            a(0, 8, 6, z10 ? 1 : 0);
            this.f24661a.m(i);
            this.f24661a.m(i10);
            this.f24661a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, o50 errorCode) throws IOException {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        if (!this.f24665e) {
            if (errorCode.a() != -1) {
                a(i, 4, 3, 0);
                this.f24661a.m(errorCode.a());
                this.f24661a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, long j4) throws IOException {
        if (this.f24665e) {
            throw new IOException("closed");
        }
        if (j4 != 0 && j4 <= 2147483647L) {
            a(i, 4, 8, 0);
            this.f24661a.m((int) j4);
            this.f24661a.flush();
        } else {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
    }

    public final void a(int i, int i10, int i11, int i12) throws IOException {
        Logger logger = f24660g;
        if (logger.isLoggable(Level.FINE)) {
            rg0.f32624a.getClass();
            logger.fine(rg0.a(false, i, i10, i11, i12));
        }
        int i13 = this.f24664d;
        if (i10 > i13) {
            throw new IllegalArgumentException(H7.n(i13, i10, "FRAME_SIZE_ERROR length > ", ": ").toString());
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            t82.a(this.f24661a, i10);
            this.f24661a.L(i11 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f24661a.L(i12 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f24661a.m(i & Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(C4356c.h(i, "reserved bit set: ").toString());
    }
}
