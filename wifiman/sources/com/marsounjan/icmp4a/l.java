package com.marsounjan.icmp4a;

import Yg.A;
import Yg.C;
import Yg.H;
import Zg.AbstractC3689v;
import Zg.U;
import com.marsounjan.icmp4a.IcmpMessageSerializer;
import com.marsounjan.icmp4a.i;
import fh.InterfaceC5826a;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class l extends j {

    /* renamed from: b, reason: collision with root package name */
    private final Map f39259b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f39260c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f39261d;

    public l() {
        InterfaceC5826a entries = i.b.a.EnumC1242a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(A.a(((i.b.a.EnumC1242a) obj).m12getIdw2LRezQ()), obj);
        }
        this.f39259b = linkedHashMap;
        InterfaceC5826a entries2 = i.b.e.a.getEntries();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries2, 10)), 16));
        for (Object obj2 : entries2) {
            linkedHashMap2.put(A.a(((i.b.e.a) obj2).m14getIdw2LRezQ()), obj2);
        }
        this.f39260c = linkedHashMap2;
        InterfaceC5826a entries3 = i.b.d.a.getEntries();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries3, 10)), 16));
        for (Object obj3 : entries3) {
            linkedHashMap3.put(A.a(((i.b.d.a) obj3).m13getIdw2LRezQ()), obj3);
        }
        this.f39261d = linkedHashMap3;
    }

    private final i.b.a f(IcmpMessageSerializer.b bVar) {
        return new i.b.a((i.b.a.EnumC1242a) this.f39259b.get(A.a(bVar.a())));
    }

    private final i.b.C1243b g(IcmpMessageSerializer.b bVar) throws IcmpMessageSerializer.InvalidMessageContentException {
        if (bVar.a() == 0) {
            bVar.c().reset();
            return new i.b.C1243b(H.b(bVar.c().getShort()), bVar.c().getShort(), null);
        }
        throw new IcmpMessageSerializer.InvalidMessageContentException("Echo message must always have code 0 but was " + ((Object) A.g(bVar.a())));
    }

    private final i.b.c h(IcmpMessageSerializer.b bVar) throws IcmpMessageSerializer.InvalidMessageContentException {
        if (bVar.a() == 0) {
            return new i.b.c(C.b(bVar.c().getInt()), null);
        }
        throw new IcmpMessageSerializer.InvalidMessageContentException("Echo message must always have code 0 but was " + ((Object) A.g(bVar.a())));
    }

    private final i.b.d i(IcmpMessageSerializer.b bVar) {
        return new i.b.d((i.b.d.a) this.f39261d.get(A.a(bVar.a())), C.b(bVar.c().getInt()), null);
    }

    private final i.b.e k(IcmpMessageSerializer.b bVar) {
        return new i.b.e((i.b.e.a) this.f39260c.get(A.a(bVar.a())));
    }

    @Override // com.marsounjan.icmp4a.IcmpMessageSerializer
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public i.b b(IcmpMessageSerializer.b header, ByteBuffer data) throws IcmpMessageSerializer.InvalidMessageContentException {
        AbstractC6492s.i(header, "header");
        AbstractC6492s.i(data, "data");
        byte b10 = header.b();
        if (b10 == i.c.ECHO_REPLY.m15getIdw2LRezQ()) {
            return g(header);
        }
        if (b10 == i.c.DESTINATION_UNREACHABLE.m15getIdw2LRezQ()) {
            return f(header);
        }
        if (b10 == i.c.PACKET_TOO_BIG.m15getIdw2LRezQ()) {
            return h(header);
        }
        if (b10 == i.c.TIME_EXCEEDED.m15getIdw2LRezQ()) {
            return k(header);
        }
        if (b10 == i.c.PARAMETER_PROBLEM.m15getIdw2LRezQ()) {
            return i(header);
        }
        throw new IcmpMessageSerializer.InvalidMessageContentException("Unknown response type received: " + ((Object) A.g(header.b())));
    }

    @Override // com.marsounjan.icmp4a.IcmpMessageSerializer
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ByteBuffer e(i.a request, byte[] buffer, byte[] datagram) {
        AbstractC6492s.i(request, "request");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(datagram, "datagram");
        if (!(request instanceof i.a.C1241a)) {
            throw new NoWhenBranchMatchedException();
        }
        byte bM15getIdw2LRezQ = request.a().m15getIdw2LRezQ();
        i.a.C1241a c1241a = (i.a.C1241a) request;
        return d(buffer, bM15getIdw2LRezQ, c1241a.b(), c1241a.c(), datagram);
    }
}
