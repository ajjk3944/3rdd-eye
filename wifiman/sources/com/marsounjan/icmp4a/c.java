package com.marsounjan.icmp4a;

import com.marsounjan.icmp4a.Icmp;
import java.net.InetAddress;
import kotlin.jvm.internal.AbstractC6492s;
import oh.AbstractC7137b;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final InetAddress f39211a;

    /* renamed from: b, reason: collision with root package name */
    private Icmp.d f39212b;

    /* renamed from: c, reason: collision with root package name */
    private long f39213c;

    /* renamed from: d, reason: collision with root package name */
    private long f39214d;

    /* renamed from: e, reason: collision with root package name */
    private long f39215e;

    /* renamed from: f, reason: collision with root package name */
    private int f39216f;

    /* renamed from: g, reason: collision with root package name */
    private int f39217g;

    public c(InetAddress ip) {
        AbstractC6492s.i(ip, "ip");
        this.f39211a = ip;
        this.f39214d = Long.MAX_VALUE;
        this.f39215e = Long.MIN_VALUE;
    }

    private final Icmp.d a(Icmp.c cVar) {
        InetAddress inetAddress = this.f39211a;
        int i10 = this.f39216f;
        int i11 = this.f39217g;
        return new Icmp.d(inetAddress, i10, i11, i10 != 0 ? 1.0f - (i11 / i10) : 1.0f, i11 > 0 ? new Icmp.b(this.f39214d, AbstractC7137b.g(this.f39213c / i11), this.f39215e) : null, cVar);
    }

    private final void c(Icmp.c cVar) {
        if (!(cVar instanceof Icmp.c.b)) {
            boolean z10 = cVar instanceof Icmp.c.a;
            return;
        }
        Icmp.c.b bVar = (Icmp.c.b) cVar;
        this.f39213c += bVar.a();
        if (this.f39214d > bVar.a()) {
            this.f39214d = bVar.a();
        }
        if (this.f39215e < bVar.a()) {
            this.f39215e = bVar.a();
        }
    }

    private final void d(Icmp.c cVar) {
        this.f39216f++;
        if (cVar instanceof Icmp.c.b) {
            this.f39217g++;
        } else {
            boolean z10 = cVar instanceof Icmp.c.a;
        }
    }

    public final Icmp.d b(Icmp.c result) {
        AbstractC6492s.i(result, "result");
        c(result);
        d(result);
        Icmp.d dVarA = a(result);
        this.f39212b = dVarA;
        return dVarA;
    }
}
