package com.ui.btle.v2;

import T8.b;
import T8.d;
import c9.InterfaceC4232a;
import com.ui.btle.v2.d;
import com.ui.btle.v2.i;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.s;
import gg.t;
import gg.u;
import gg.z;
import java.util.Iterator;
import java.util.List;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class i implements T8.d {

    /* renamed from: a, reason: collision with root package name */
    private final d.b f41186a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4232a f41187b;

    /* renamed from: c, reason: collision with root package name */
    private final Z8.a f41188c;

    /* renamed from: d, reason: collision with root package name */
    private final b.c f41189d;

    /* renamed from: e, reason: collision with root package name */
    private final s f41190e;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f41191a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(z it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f41192a = new b();

        b() {
        }

        public final byte[] a(d packet) {
            AbstractC6492s.i(packet, "packet");
            return d.a.b(packet.a());
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return d.a.a(a((d) obj));
        }
    }

    public static final class c implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d.a f41193a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f41194b;

        public c(d.a aVar, i iVar) {
            this.f41193a = aVar;
            this.f41194b = iVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(this.f41193a.a(this.f41194b.f41188c));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public i(d.a reader, d.b sender, InterfaceC4232a sequence, Z8.a encryption, b.c connectionProperties) {
        AbstractC6492s.i(reader, "reader");
        AbstractC6492s.i(sender, "sender");
        AbstractC6492s.i(sequence, "sequence");
        AbstractC6492s.i(encryption, "encryption");
        AbstractC6492s.i(connectionProperties, "connectionProperties");
        this.f41186a = sender;
        this.f41187b = sequence;
        this.f41188c = encryption;
        this.f41189d = connectionProperties;
        z zVarI = z.i(new c(reader, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        s sVarT0 = zVarI.s(a.f41191a).A(b.f41192a).Y().t0();
        AbstractC6492s.h(sVarT0, "single { reader.receive(…e()\n            .repeat()");
        this.f41190e = sVarT0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List messages, i this$0, t emitter) {
        AbstractC6492s.i(messages, "$messages");
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(emitter, "emitter");
        Iterator it = messages.iterator();
        while (it.hasNext()) {
            emitter.h(new d(this$0.f41187b.a(), com.ui.btle.v2.c.BINARY_MESSAGE, ((d.a) it.next()).f(), null));
        }
        emitter.a();
    }

    @Override // T8.d
    public s a() {
        return this.f41190e;
    }

    @Override // T8.d
    public AbstractC5912b b(final List messages) {
        AbstractC6492s.i(messages, "messages");
        d.b bVar = this.f41186a;
        s sVarO = s.o(new u() { // from class: Y8.a
            @Override // gg.u
            public final void a(t tVar) {
                i.e(messages, this, tVar);
            }
        });
        AbstractC6492s.h(sVarO, "create { emitter ->\n    …nComplete()\n            }");
        return bVar.a(sVarO, this.f41188c);
    }
}
