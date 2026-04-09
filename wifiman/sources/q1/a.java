package Q1;

import Ii.C3048c0;
import Ii.N;
import Ii.O;
import Ii.S0;
import Zg.AbstractC3689v;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q1.a$a, reason: collision with other inner class name */
    public static final class C0670a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C0670a f19112a = new C0670a();

        C0670a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            AbstractC6492s.i(it, "it");
            return AbstractC3689v.l();
        }
    }

    public static final ph.c a(String name, P1.b bVar, InterfaceC6835l produceMigrations, N scope) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(produceMigrations, "produceMigrations");
        AbstractC6492s.i(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ ph.c b(String str, P1.b bVar, InterfaceC6835l interfaceC6835l, N n10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC6835l = C0670a.f19112a;
        }
        if ((i10 & 8) != 0) {
            n10 = O.a(C3048c0.b().plus(S0.b(null, 1, null)));
        }
        return a(str, bVar, interfaceC6835l, n10);
    }
}
