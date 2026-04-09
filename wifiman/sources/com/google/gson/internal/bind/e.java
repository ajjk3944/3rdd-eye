package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import w5.C8270c;

/* loaded from: classes3.dex */
public final class e extends C8270c {

    /* renamed from: r, reason: collision with root package name */
    private static final Writer f38998r = new a();

    /* renamed from: s, reason: collision with root package name */
    private static final com.google.gson.j f38999s = new com.google.gson.j("closed");

    /* renamed from: o, reason: collision with root package name */
    private final List f39000o;

    /* renamed from: p, reason: collision with root package name */
    private String f39001p;

    /* renamed from: q, reason: collision with root package name */
    private com.google.gson.g f39002q;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public e() {
        super(f38998r);
        this.f39000o = new ArrayList();
        this.f39002q = com.google.gson.h.f38981a;
    }

    private com.google.gson.g B0() {
        return (com.google.gson.g) this.f39000o.get(r0.size() - 1);
    }

    private void C0(com.google.gson.g gVar) {
        if (this.f39001p != null) {
            if (!gVar.i() || y()) {
                ((com.google.gson.i) B0()).m(this.f39001p, gVar);
            }
            this.f39001p = null;
            return;
        }
        if (this.f39000o.isEmpty()) {
            this.f39002q = gVar;
            return;
        }
        com.google.gson.g gVarB0 = B0();
        if (!(gVarB0 instanceof com.google.gson.f)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.f) gVarB0).m(gVar);
    }

    public com.google.gson.g A0() {
        if (this.f39000o.isEmpty()) {
            return this.f39002q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f39000o);
    }

    @Override // w5.C8270c
    public C8270c T(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f39000o.isEmpty() || this.f39001p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(B0() instanceof com.google.gson.i)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f39001p = str;
        return this;
    }

    @Override // w5.C8270c
    public C8270c b0() {
        C0(com.google.gson.h.f38981a);
        return this;
    }

    @Override // w5.C8270c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f39000o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f39000o.add(f38999s);
    }

    @Override // w5.C8270c, java.io.Flushable
    public void flush() {
    }

    @Override // w5.C8270c
    public C8270c h() {
        com.google.gson.f fVar = new com.google.gson.f();
        C0(fVar);
        this.f39000o.add(fVar);
        return this;
    }

    @Override // w5.C8270c
    public C8270c j() {
        com.google.gson.i iVar = new com.google.gson.i();
        C0(iVar);
        this.f39000o.add(iVar);
        return this;
    }

    @Override // w5.C8270c
    public C8270c s() {
        if (this.f39000o.isEmpty() || this.f39001p != null) {
            throw new IllegalStateException();
        }
        if (!(B0() instanceof com.google.gson.f)) {
            throw new IllegalStateException();
        }
        this.f39000o.remove(r0.size() - 1);
        return this;
    }

    @Override // w5.C8270c
    public C8270c t0(double d10) {
        if (P() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            C0(new com.google.gson.j(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // w5.C8270c
    public C8270c u0(long j10) {
        C0(new com.google.gson.j(Long.valueOf(j10)));
        return this;
    }

    @Override // w5.C8270c
    public C8270c v() {
        if (this.f39000o.isEmpty() || this.f39001p != null) {
            throw new IllegalStateException();
        }
        if (!(B0() instanceof com.google.gson.i)) {
            throw new IllegalStateException();
        }
        this.f39000o.remove(r0.size() - 1);
        return this;
    }

    @Override // w5.C8270c
    public C8270c v0(Boolean bool) {
        if (bool == null) {
            return b0();
        }
        C0(new com.google.gson.j(bool));
        return this;
    }

    @Override // w5.C8270c
    public C8270c w0(Number number) {
        if (number == null) {
            return b0();
        }
        if (!P()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        C0(new com.google.gson.j(number));
        return this;
    }

    @Override // w5.C8270c
    public C8270c x0(String str) {
        if (str == null) {
            return b0();
        }
        C0(new com.google.gson.j(str));
        return this;
    }

    @Override // w5.C8270c
    public C8270c y0(boolean z10) {
        C0(new com.google.gson.j(Boolean.valueOf(z10)));
        return this;
    }
}
