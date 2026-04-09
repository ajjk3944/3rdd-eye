package O;

import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6475a;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class e {

    /* synthetic */ class a extends C6490p implements InterfaceC6835l {
        a(Object obj) {
            super(1, obj, g.class, "onPull", "onPull$material_release(F)F", 0);
        }

        public final Float a(float f10) {
            return Float.valueOf(((g) this.receiver).q(f10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    /* synthetic */ class b extends AbstractC6475a implements InterfaceC6839p {
        b(Object obj) {
            super(2, obj, g.class, "onRelease", "onRelease$material_release(F)F", 4);
        }

        public final Object a(float f10, InterfaceC5380e interfaceC5380e) {
            return e.d((g) this.f51704a, f10, interfaceC5380e);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), (InterfaceC5380e) obj2);
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, g gVar, boolean z10) {
        return c(eVar, new a(gVar), new b(gVar), z10);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p, boolean z10) {
        return androidx.compose.ui.input.nestedscroll.a.b(eVar, new f(interfaceC6835l, interfaceC6839p, z10), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object d(g gVar, float f10, InterfaceC5380e interfaceC5380e) {
        return kotlin.coroutines.jvm.internal.b.c(gVar.r(f10));
    }
}
