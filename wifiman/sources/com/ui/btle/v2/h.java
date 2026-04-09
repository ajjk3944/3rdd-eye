package com.ui.btle.v2;

import com.ui.btle.v2.d;
import com.ui.btle.v2.e;
import com.ui.btle.v2.f;
import gg.AbstractC5912b;
import gg.D;
import gg.s;
import gg.y;
import java.nio.ByteBuffer;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class h implements d.b {

    /* renamed from: a, reason: collision with root package name */
    private final f.b f41180a;

    /* renamed from: b, reason: collision with root package name */
    private final y f41181b;

    /* renamed from: c, reason: collision with root package name */
    private final y f41182c;

    static final class a implements n {
        a() {
        }

        public final byte[] a(d it) {
            AbstractC6492s.i(it, "it");
            return h.this.c(it);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return f.a(a((d) obj));
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z8.a f41184a;

        b(Z8.a aVar) {
            this.f41184a = aVar;
        }

        public final D a(byte[] it) {
            AbstractC6492s.i(it, "it");
            return this.f41184a.b(it);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((f) obj).f());
        }
    }

    static final class c implements n {
        c() {
        }

        public final gg.f a(byte[] bleFrame) {
            AbstractC6492s.i(bleFrame, "bleFrame");
            return h.this.f41180a.a(bleFrame);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((f) obj).f());
        }
    }

    public h(f.b frameWriter, y writeScheduler, y processingScheduler) {
        AbstractC6492s.i(frameWriter, "frameWriter");
        AbstractC6492s.i(writeScheduler, "writeScheduler");
        AbstractC6492s.i(processingScheduler, "processingScheduler");
        this.f41180a = frameWriter;
        this.f41181b = writeScheduler;
        this.f41182c = processingScheduler;
    }

    @Override // com.ui.btle.v2.d.b
    public AbstractC5912b a(s packetFactory, Z8.a encryption) {
        AbstractC6492s.i(packetFactory, "packetFactory");
        AbstractC6492s.i(encryption, "encryption");
        AbstractC5912b abstractC5912bL = packetFactory.i0(new a()).Y(new b(encryption)).U(new c()).W(this.f41181b).L(this.f41182c).l();
        AbstractC6492s.h(abstractC5912bL, "override fun send(packet…ler)\n            .cache()");
        return abstractC5912bL;
    }

    public final byte[] c(d packet) {
        AbstractC6492s.i(packet, "packet");
        e.a.c cVar = e.a.c.f41132a;
        int iA = cVar.a();
        e.a.b bVar = e.a.b.f41131a;
        byte[] bArr = new byte[iA + bVar.a() + packet.a().length];
        ByteBuffer buffer = ByteBuffer.wrap(bArr);
        AbstractC6492s.h(buffer, "buffer");
        cVar.c(buffer, packet.c());
        bVar.c(buffer, packet.b());
        e.b.f41133a.b(buffer, packet.a());
        return f.b(bArr);
    }
}
