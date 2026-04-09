package com.ui.btle.v2;

import com.ui.btle.v2.d;
import com.ui.btle.v2.e;
import com.ui.btle.v2.f;
import gg.D;
import gg.y;
import gg.z;
import java.nio.ByteBuffer;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class g implements d.a {

    /* renamed from: a, reason: collision with root package name */
    private final f.a f41175a;

    /* renamed from: b, reason: collision with root package name */
    private final y f41176b;

    /* renamed from: c, reason: collision with root package name */
    private final y f41177c;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z8.a f41178a;

        a(Z8.a aVar) {
            this.f41178a = aVar;
        }

        public final D a(byte[] frame) {
            AbstractC6492s.i(frame, "frame");
            return this.f41178a.a(frame);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((f) obj).f());
        }
    }

    static final class b implements n {
        b() {
        }

        public final d a(byte[] packetFrame) {
            AbstractC6492s.i(packetFrame, "packetFrame");
            return g.this.b(packetFrame);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((f) obj).f());
        }
    }

    public g(f.a frameReader, y readScheduler, y processingScheduler) {
        AbstractC6492s.i(frameReader, "frameReader");
        AbstractC6492s.i(readScheduler, "readScheduler");
        AbstractC6492s.i(processingScheduler, "processingScheduler");
        this.f41175a = frameReader;
        this.f41176b = readScheduler;
        this.f41177c = processingScheduler;
    }

    @Override // com.ui.btle.v2.d.a
    public z a(Z8.a encryption) {
        AbstractC6492s.i(encryption, "encryption");
        z zVarE = this.f41175a.f().s(new a(encryption)).A(new b()).O(this.f41176b).E(this.f41177c).e();
        AbstractC6492s.h(zVarE, "override fun receive(enc…ler)\n            .cache()");
        return zVarE;
    }

    public final d b(byte[] frame) {
        AbstractC6492s.i(frame, "frame");
        ByteBuffer buffer = ByteBuffer.wrap(frame);
        e.a.c cVar = e.a.c.f41132a;
        AbstractC6492s.h(buffer, "buffer");
        return new d(cVar.b(buffer), e.a.b.f41131a.b(buffer), e.b.f41133a.a(buffer), null);
    }
}
