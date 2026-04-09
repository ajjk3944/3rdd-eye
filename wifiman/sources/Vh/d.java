package vh;

import Bh.f0;
import Uh.i;
import Uh.t;
import Yg.InterfaceC3665i;
import Yg.s;
import Yh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import li.C6608K;
import mh.InterfaceC6839p;
import th.f;
import th.g;
import wh.C8365i0;
import wh.C8368k;
import wh.j1;

/* loaded from: classes4.dex */
public abstract class d {

    /* synthetic */ class a extends AbstractC6489o implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63633a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(C6608K p02, i p12) {
            AbstractC6492s.i(p02, "p0");
            AbstractC6492s.i(p12, "p1");
            return p02.s(p12);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final f getOwner() {
            return O.b(C6608K.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }
    }

    public static final g a(InterfaceC3665i interfaceC3665i) {
        AbstractC6492s.i(interfaceC3665i, "<this>");
        Metadata metadata = (Metadata) interfaceC3665i.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        s sVarJ = Yh.i.j(strArrD1, metadata.d2());
        Yh.f fVar = (Yh.f) sVarJ.a();
        i iVar = (i) sVarJ.c();
        e eVar = new e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = interfaceC3665i.getClass();
        t tVarW1 = iVar.w1();
        AbstractC6492s.h(tVarW1, "getTypeTable(...)");
        return new C8365i0(C8368k.f65166d, (f0) j1.h(cls, iVar, fVar, new Wh.g(tVarW1), eVar, a.f63633a));
    }
}
