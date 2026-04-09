package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class g implements t.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<t> f17717a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.g f17718b;

    /* renamed from: c, reason: collision with root package name */
    private final c f17719c;

    /* renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.c f17720d;

    /* renamed from: e, reason: collision with root package name */
    private final int f17721e;

    /* renamed from: f, reason: collision with root package name */
    private final y f17722f;

    /* renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f17723g;

    /* renamed from: h, reason: collision with root package name */
    private final o f17724h;

    /* renamed from: i, reason: collision with root package name */
    private final int f17725i;

    /* renamed from: j, reason: collision with root package name */
    private final int f17726j;

    /* renamed from: k, reason: collision with root package name */
    private final int f17727k;

    /* renamed from: l, reason: collision with root package name */
    private int f17728l;

    public g(List<t> list, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2, int i10, y yVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, int i11, int i12, int i13) {
        this.f17717a = list;
        this.f17720d = cVar2;
        this.f17718b = gVar;
        this.f17719c = cVar;
        this.f17721e = i10;
        this.f17722f = yVar;
        this.f17723g = dVar;
        this.f17724h = oVar;
        this.f17725i = i11;
        this.f17726j = i12;
        this.f17727k = i13;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int a() {
        return this.f17725i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int b() {
        return this.f17726j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int c() {
        return this.f17727k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public y d() {
        return this.f17722f;
    }

    public com.mbridge.msdk.thrid.okhttp.d e() {
        return this.f17723g;
    }

    public com.mbridge.msdk.thrid.okhttp.h f() {
        return this.f17720d;
    }

    public o g() {
        return this.f17724h;
    }

    public c h() {
        return this.f17719c;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.g i() {
        return this.f17718b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public a0 a(y yVar) throws IOException {
        return a(yVar, this.f17718b, this.f17719c, this.f17720d);
    }

    public a0 a(y yVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2) throws IOException {
        if (this.f17721e < this.f17717a.size()) {
            this.f17728l++;
            if (this.f17719c != null && !this.f17720d.a(yVar.g())) {
                throw new IllegalStateException("network interceptor " + this.f17717a.get(this.f17721e - 1) + " must retain the same host and port");
            }
            if (this.f17719c != null && this.f17728l > 1) {
                throw new IllegalStateException("network interceptor " + this.f17717a.get(this.f17721e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f17717a, gVar, cVar, cVar2, this.f17721e + 1, yVar, this.f17723g, this.f17724h, this.f17725i, this.f17726j, this.f17727k);
            t tVar = this.f17717a.get(this.f17721e);
            a0 a0VarA = tVar.a(gVar2);
            if (cVar != null && this.f17721e + 1 < this.f17717a.size() && gVar2.f17728l != 1) {
                throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
            }
            if (a0VarA != null) {
                if (a0VarA.d() != null) {
                    return a0VarA;
                }
                throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        throw new AssertionError();
    }
}
