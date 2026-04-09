package com.ui.btle.v2;

import T8.b;
import Yg.m;
import Yg.n;
import Z8.a;
import Z8.c;
import c9.C4233b;
import c9.InterfaceC4232a;
import com.ui.btle.v2.a;
import com.ui.btle.v2.d;
import com.ui.btle.v2.f;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.y;
import gg.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public abstract class b implements com.ui.btle.v2.a {

    /* renamed from: a, reason: collision with root package name */
    private final m f41120a = n.b(new d());

    /* renamed from: b, reason: collision with root package name */
    private final m f41121b = n.b(new C1286b());

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4232a f41122a;

        a(InterfaceC4232a interfaceC4232a) {
            this.f41122a = interfaceC4232a;
        }

        public final Z8.a a(byte[] sharedKey) {
            AbstractC6492s.i(sharedKey, "sharedKey");
            return new Z8.c(sharedKey, this.f41122a.b(), null);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((c.a) obj).f());
        }
    }

    /* renamed from: com.ui.btle.v2.b$b, reason: collision with other inner class name */
    static final class C1286b extends AbstractC6494u implements InterfaceC6824a {
        C1286b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.i invoke() {
            gg.i iVarI2 = b.this.e().U0(b.this.d()).o1(1).i2();
            AbstractC6492s.h(iVarI2, "state\n            .merge…)\n            .refCount()");
            return iVarI2;
        }
    }

    public static final class c implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new C4233b((short) 0, 1, null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f41125a = new a();

            a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b.d apply(a.AbstractC1282a it) {
                AbstractC6492s.i(it, "it");
                b.d dVar = it instanceof b.d ? (b.d) it : null;
                if (dVar != null) {
                    return dVar;
                }
                throw new IllegalStateException("BTLEv2 state must extend BTLEState");
            }
        }

        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.i invoke() {
            gg.i iVarI2 = b.this.b().N0(a.f41125a).W().o1(1).i2();
            AbstractC6492s.h(iVarI2, "detailedState.map {\n    …)\n            .refCount()");
            return iVarI2;
        }
    }

    @Override // T8.b
    public gg.i a() {
        return (gg.i) this.f41121b.getValue();
    }

    protected final z c(a.AbstractC0966a abstractC0966a, d.a reader, d.b sender, InterfaceC4232a packetSequence) {
        AbstractC6492s.i(abstractC0966a, "<this>");
        AbstractC6492s.i(reader, "reader");
        AbstractC6492s.i(sender, "sender");
        AbstractC6492s.i(packetSequence, "packetSequence");
        if (AbstractC6492s.d(abstractC0966a, a.AbstractC0966a.b.f25191a)) {
            z zVarZ = z.z(Z8.b.f25192a);
            AbstractC6492s.h(zVarZ, "just(BTLEv2EncryptionPlain)");
            return zVarZ;
        }
        if (!(abstractC0966a instanceof a.AbstractC0966a.C0967a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.AbstractC0966a.C0967a c0967a = (a.AbstractC0966a.C0967a) abstractC0966a;
        z zVarA = new com.ui.btle.v2.encryption.dh.a(sender, reader, packetSequence, c0967a.b(), c0967a.a()).j().A(new a(packetSequence));
        AbstractC6492s.h(zVarA, "packetSequence: BTLEv2Pa…      )\n                }");
        return zVarA;
    }

    protected abstract AbstractC5912b d();

    public gg.i e() {
        return (gg.i) this.f41120a.getValue();
    }

    protected final d.a f(f.a frameReader, y schedulerFrameRead, y schedulerProcessing) {
        AbstractC6492s.i(frameReader, "frameReader");
        AbstractC6492s.i(schedulerFrameRead, "schedulerFrameRead");
        AbstractC6492s.i(schedulerProcessing, "schedulerProcessing");
        return new g(frameReader, schedulerFrameRead, schedulerProcessing);
    }

    protected final d.b g(f.b frameWriter, y schedulerFrameWrite, y schedulerProcessing) {
        AbstractC6492s.i(frameWriter, "frameWriter");
        AbstractC6492s.i(schedulerFrameWrite, "schedulerFrameWrite");
        AbstractC6492s.i(schedulerProcessing, "schedulerProcessing");
        return new h(frameWriter, schedulerFrameWrite, schedulerProcessing);
    }

    protected final z h() {
        z zVarI = z.i(new c());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    protected final i i(d.a reader, d.b sender, InterfaceC4232a sequence, Z8.a encryption, b.c connectionProperties) {
        AbstractC6492s.i(reader, "reader");
        AbstractC6492s.i(sender, "sender");
        AbstractC6492s.i(sequence, "sequence");
        AbstractC6492s.i(encryption, "encryption");
        AbstractC6492s.i(connectionProperties, "connectionProperties");
        return new i(reader, sender, sequence, encryption, connectionProperties);
    }
}
