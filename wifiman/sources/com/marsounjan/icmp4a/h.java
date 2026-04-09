package com.marsounjan.icmp4a;

import com.marsounjan.icmp4a.Icmp;
import com.marsounjan.icmp4a.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class h extends f {

    /* renamed from: e, reason: collision with root package name */
    private final int f39237e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f39238f;

    /* renamed from: g, reason: collision with root package name */
    private final g f39239g;

    public h(int i10) throws Icmp.Error.ProtocolException {
        this.f39237e = i10;
        if (d() <= 65507) {
            this.f39238f = new byte[Math.max(576, d()) + 8];
            this.f39239g = new g();
        } else {
            throw new Icmp.Error.ProtocolException("Packet size '" + d() + "' exceeded maximal IPv4 packet size 65507", null, 2, null);
        }
    }

    @Override // com.marsounjan.icmp4a.b
    public byte[] c() {
        return this.f39238f;
    }

    @Override // com.marsounjan.icmp4a.b
    protected int d() {
        return this.f39237e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marsounjan.icmp4a.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d.a e(short s10, short s11) {
        return new d.a.C1237a(s10, s11, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marsounjan.icmp4a.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g g() {
        return this.f39239g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marsounjan.icmp4a.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public boolean h(d.b response) {
        AbstractC6492s.i(response, "response");
        if (!(response instanceof d.b.C1239b)) {
            if (!(response instanceof d.b.a ? true : response instanceof d.b.e ? true : response instanceof d.b.f ? true : response instanceof d.b.c)) {
                if (response instanceof d.b.C1240d) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (((d.b.C1239b) response).b() != f()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.marsounjan.icmp4a.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Icmp.c j(d.b response, int i10, long j10) {
        String message;
        AbstractC6492s.i(response, "response");
        if (response instanceof d.b.C1239b) {
            return new Icmp.c.b(((d.b.C1239b) response).b() & 65535, i10, j10);
        }
        if (response instanceof d.b.a) {
            d.b.a.EnumC1238a enumC1238aB = ((d.b.a) response).b();
            if (enumC1238aB == null || (message = enumC1238aB.getMessage()) == null) {
                message = "Destination Unreachable";
            }
            return new Icmp.c.a.C1228a(message, (K5.a) response);
        }
        if (response instanceof d.b.e) {
            return new Icmp.c.a.C1228a("Source Quench", (K5.a) response);
        }
        if (response instanceof d.b.f) {
            return new Icmp.c.a.C1228a("Transport Time Exceeded", (K5.a) response);
        }
        if (response instanceof d.b.c) {
            return new Icmp.c.a.C1228a("Parameter Problem at index " + ((int) ((d.b.c) response).b()), (K5.a) response);
        }
        if (!(response instanceof d.b.C1240d)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Icmp.c.a.C1228a("Redirected to " + ((d.b.C1240d) response).b().getHostAddress(), (K5.a) response);
    }
}
