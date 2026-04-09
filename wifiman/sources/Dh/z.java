package Dh;

import Bh.InterfaceC2495e;
import ii.InterfaceC6164k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.E0;

/* loaded from: classes4.dex */
public abstract class z implements InterfaceC2495e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3565a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC6164k a(InterfaceC2495e interfaceC2495e, E0 typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            InterfaceC6164k interfaceC6164kI;
            AbstractC6492s.i(interfaceC2495e, "<this>");
            AbstractC6492s.i(typeSubstitution, "typeSubstitution");
            AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC2495e instanceof z ? (z) interfaceC2495e : null;
            if (zVar != null && (interfaceC6164kI = zVar.I(typeSubstitution, kotlinTypeRefiner)) != null) {
                return interfaceC6164kI;
            }
            InterfaceC6164k interfaceC6164kW0 = interfaceC2495e.w0(typeSubstitution);
            AbstractC6492s.h(interfaceC6164kW0, "getMemberScope(...)");
            return interfaceC6164kW0;
        }

        public final InterfaceC6164k b(InterfaceC2495e interfaceC2495e, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            InterfaceC6164k interfaceC6164kI0;
            AbstractC6492s.i(interfaceC2495e, "<this>");
            AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC2495e instanceof z ? (z) interfaceC2495e : null;
            if (zVar != null && (interfaceC6164kI0 = zVar.i0(kotlinTypeRefiner)) != null) {
                return interfaceC6164kI0;
            }
            InterfaceC6164k interfaceC6164kE0 = interfaceC2495e.E0();
            AbstractC6492s.h(interfaceC6164kE0, "getUnsubstitutedMemberScope(...)");
            return interfaceC6164kE0;
        }

        private a() {
        }
    }

    protected abstract InterfaceC6164k I(E0 e02, kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    protected abstract InterfaceC6164k i0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar);
}
