package com.marsounjan.icmp4a;

import Yg.C;
import com.marsounjan.icmp4a.Icmp;
import com.marsounjan.icmp4a.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class m extends k {

    /* renamed from: e, reason: collision with root package name */
    private final int f39262e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f39263f;

    /* renamed from: g, reason: collision with root package name */
    private final l f39264g;

    public m(int i10) throws Icmp.Error.ProtocolException {
        this.f39262e = i10;
        if (d() <= 131024) {
            this.f39263f = new byte[Math.max(576, d()) + 8];
            this.f39264g = new l();
        } else {
            throw new Icmp.Error.ProtocolException("Packet size '" + d() + "' exceeded maximal IPv6 packet size 131024", null, 2, null);
        }
    }

    @Override // com.marsounjan.icmp4a.b
    public byte[] c() {
        return this.f39263f;
    }

    @Override // com.marsounjan.icmp4a.b
    protected int d() {
        return this.f39262e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marsounjan.icmp4a.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public i.a e(short s10, short s11) {
        return new i.a.C1241a(s10, s11, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marsounjan.icmp4a.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public l g() {
        return this.f39264g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marsounjan.icmp4a.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public boolean h(i.b response) {
        AbstractC6492s.i(response, "response");
        if (response instanceof i.b.C1243b) {
            return ((i.b.C1243b) response).b() == f();
        }
        if (response instanceof i.b.a ? true : response instanceof i.b.e ? true : response instanceof i.b.d ? true : response instanceof i.b.c) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.marsounjan.icmp4a.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Icmp.c j(i.b response, int i10, long j10) {
        String message;
        String message2;
        String message3;
        AbstractC6492s.i(response, "response");
        if (response instanceof i.b.C1243b) {
            return new Icmp.c.b(((i.b.C1243b) response).b() & 65535, i10, j10);
        }
        if (response instanceof i.b.a) {
            i.b.a.EnumC1242a enumC1242aB = ((i.b.a) response).b();
            if (enumC1242aB == null || (message3 = enumC1242aB.getMessage()) == null) {
                message3 = "Destination Unreachable";
            }
            return new Icmp.c.a.C1228a(message3, (K5.a) response);
        }
        if (response instanceof i.b.c) {
            return new Icmp.c.a.C1228a("Packet too big. MTU: " + ((Object) C.g(((i.b.c) response).b())), (K5.a) response);
        }
        if (response instanceof i.b.e) {
            i.b.e.a aVarB = ((i.b.e) response).b();
            if (aVarB == null || (message2 = aVarB.getMessage()) == null) {
                message2 = "Time exceeded";
            }
            return new Icmp.c.a.C1228a(message2, (K5.a) response);
        }
        if (!(response instanceof i.b.d)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb2 = new StringBuilder();
        i.b.d dVar = (i.b.d) response;
        i.b.d.a aVarC = dVar.c();
        if (aVarC == null || (message = aVarC.getMessage()) == null) {
            message = "Parameter Problem";
        }
        sb2.append(message);
        sb2.append(" at ");
        sb2.append((Object) C.g(dVar.b()));
        return new Icmp.c.a.C1228a(sb2.toString(), (K5.a) response);
    }
}
