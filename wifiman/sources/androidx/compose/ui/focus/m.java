package androidx.compose.ui.focus;

import Yg.InterfaceC3665i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.InterfaceC6487m;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class m {

    static final class a implements k0.j, InterfaceC6487m {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC6835l f28851a;

        a(InterfaceC6835l interfaceC6835l) {
            this.f28851a = interfaceC6835l;
        }

        @Override // k0.j
        public final /* synthetic */ void a(k kVar) {
            this.f28851a.invoke(kVar);
        }

        @Override // kotlin.jvm.internal.InterfaceC6487m
        public final InterfaceC3665i c() {
            return this.f28851a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof k0.j) && (obj instanceof InterfaceC6487m)) {
                return AbstractC6492s.d(c(), ((InterfaceC6487m) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
        return eVar.b0(new FocusPropertiesElement(new a(interfaceC6835l)));
    }
}
