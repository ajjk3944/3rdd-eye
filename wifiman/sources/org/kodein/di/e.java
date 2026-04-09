package org.kodein.di;

import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;

/* loaded from: classes4.dex */
public interface e {

    public interface a {
    }

    public static final class b {

        public static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f56930a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6835l interfaceC6835l) {
                super(0);
                this.f56930a = interfaceC6835l;
            }

            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return this.f56930a.invoke(J.f24997a);
            }
        }

        public static /* synthetic */ InterfaceC6835l a(e eVar, DI.e eVar2, Object obj, int i10, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: factory");
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return eVar.b(eVar2, obj, i10);
        }

        public static InterfaceC6824a b(e eVar, DI.e key, Object context, int i10) {
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(context, "context");
            return new a(a(eVar, key, context, 0, 4, null));
        }

        public static /* synthetic */ InterfaceC6824a c(e eVar, DI.e eVar2, Object obj, int i10, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provider");
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return eVar.a(eVar2, obj, i10);
        }
    }

    InterfaceC6824a a(DI.e eVar, Object obj, int i10);

    InterfaceC6835l b(DI.e eVar, Object obj, int i10);
}
