package com.marsounjan.icmp4a;

import Yg.A;
import Yg.H;
import Zg.AbstractC3689v;
import Zg.U;
import com.marsounjan.icmp4a.IcmpMessageSerializer;
import com.marsounjan.icmp4a.d;
import fh.InterfaceC5826a;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class g extends e {

    /* renamed from: b, reason: collision with root package name */
    private final Map f39236b;

    public g() {
        InterfaceC5826a entries = d.b.a.EnumC1238a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(A.a(((d.b.a.EnumC1238a) obj).m10getIdw2LRezQ()), obj);
        }
        this.f39236b = linkedHashMap;
    }

    private final d.b.a f(IcmpMessageSerializer.b bVar) {
        return new d.b.a((d.b.a.EnumC1238a) this.f39236b.get(A.a(bVar.a())));
    }

    private final d.b.C1239b g(IcmpMessageSerializer.b bVar) throws IcmpMessageSerializer.InvalidMessageContentException {
        if (bVar.a() == 0) {
            bVar.c().reset();
            return new d.b.C1239b(H.b(bVar.c().getShort()), bVar.c().getShort(), null);
        }
        throw new IcmpMessageSerializer.InvalidMessageContentException("Echo message must always have code 0 but was " + ((Object) A.g(bVar.a())));
    }

    private final d.b.c h(IcmpMessageSerializer.b bVar) {
        return new d.b.c(bVar.c().get());
    }

    private final d.b.C1240d i(IcmpMessageSerializer.b bVar) throws UnknownHostException {
        byte[] bArr = new byte[4];
        bVar.c().get(bArr);
        InetAddress byAddress = InetAddress.getByAddress(bArr);
        AbstractC6492s.g(byAddress, "null cannot be cast to non-null type java.net.Inet4Address");
        return new d.b.C1240d((Inet4Address) byAddress);
    }

    private final d.b.e k(IcmpMessageSerializer.b bVar) {
        return d.b.e.f39231a;
    }

    private final d.b.f l(IcmpMessageSerializer.b bVar) {
        return d.b.f.f39233a;
    }

    @Override // com.marsounjan.icmp4a.IcmpMessageSerializer
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d.b b(IcmpMessageSerializer.b header, ByteBuffer data) throws IcmpMessageSerializer.InvalidMessageContentException {
        AbstractC6492s.i(header, "header");
        AbstractC6492s.i(data, "data");
        byte b10 = header.b();
        if (b10 == d.c.ECHO_REPLY.m11getIdw2LRezQ()) {
            return g(header);
        }
        if (b10 == d.c.DESTINATION_UNREACHABLE.m11getIdw2LRezQ()) {
            return f(header);
        }
        if (b10 == d.c.SOURCE_QUENCH.m11getIdw2LRezQ()) {
            return k(header);
        }
        if (b10 == d.c.REDIRECT.m11getIdw2LRezQ()) {
            return i(header);
        }
        if (b10 == d.c.TIME_EXCEEDED.m11getIdw2LRezQ()) {
            return l(header);
        }
        if (b10 == d.c.PARAMETER_PROBLEM.m11getIdw2LRezQ()) {
            return h(header);
        }
        throw new IcmpMessageSerializer.InvalidMessageContentException("Unknown response type received: " + ((Object) A.g(header.b())));
    }

    @Override // com.marsounjan.icmp4a.IcmpMessageSerializer
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ByteBuffer e(d.a request, byte[] buffer, byte[] datagram) {
        AbstractC6492s.i(request, "request");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(datagram, "datagram");
        if (!(request instanceof d.a.C1237a)) {
            throw new NoWhenBranchMatchedException();
        }
        byte bM11getIdw2LRezQ = request.a().m11getIdw2LRezQ();
        d.a.C1237a c1237a = (d.a.C1237a) request;
        return d(buffer, bM11getIdw2LRezQ, c1237a.b(), c1237a.c(), datagram);
    }
}
