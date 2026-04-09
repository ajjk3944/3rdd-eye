package E0;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* renamed from: E0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2622b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3838a;

    /* renamed from: E0.b0$a */
    public static final class a extends e.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    /* renamed from: E0.b0$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V.b f3839a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.b bVar) {
            super(1);
            this.f3839a = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e.b bVar) {
            this.f3839a.b(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.t2(-1);
        f3838a = aVar;
    }

    public static final int d(e.b bVar, e.b bVar2) {
        if (AbstractC6492s.d(bVar, bVar2)) {
            return 2;
        }
        return f0.b.a(bVar, bVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.b e(androidx.compose.ui.e eVar, V.b bVar) {
        V.b bVar2 = new V.b(new androidx.compose.ui.e[AbstractC7978m.d(bVar.o(), 16)], 0);
        bVar2.b(eVar);
        b bVar3 = null;
        while (bVar2.u()) {
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) bVar2.z(bVar2.o() - 1);
            if (eVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) eVar2;
                bVar2.b(aVar.a());
                bVar2.b(aVar.c());
            } else if (eVar2 instanceof e.b) {
                bVar.b(eVar2);
            } else {
                if (bVar3 == null) {
                    bVar3 = new b(bVar);
                }
                eVar2.s(bVar3);
                bVar3 = bVar3;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(V v10, e.c cVar) {
        AbstractC6492s.g(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        v10.c(cVar);
    }
}
