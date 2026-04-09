package f2;

import Yg.J;
import Zg.AbstractC3689v;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;

/* renamed from: f2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5498D {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC5500F f46690a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46691b;

    /* renamed from: f2.D$a */
    public interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: f2.D$b */
    public @interface b {
        String value();
    }

    /* renamed from: f2.D$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f46693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y yVar, a aVar) {
            super(1);
            this.f46693b = yVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5512k invoke(C5512k backStackEntry) {
            r rVarD;
            AbstractC6492s.i(backStackEntry, "backStackEntry");
            r rVarF = backStackEntry.f();
            if (rVarF == null) {
                rVarF = null;
            }
            if (rVarF != null && (rVarD = AbstractC5498D.this.d(rVarF, backStackEntry.d(), this.f46693b, null)) != null) {
                return AbstractC6492s.d(rVarD, rVarF) ? backStackEntry : AbstractC5498D.this.b().a(rVarD, rVarD.g(backStackEntry.d()));
            }
            return null;
        }
    }

    /* renamed from: f2.D$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f46694a = new d();

        d() {
            super(1);
        }

        public final void a(z navOptions) {
            AbstractC6492s.i(navOptions, "$this$navOptions");
            navOptions.g(true);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z) obj);
            return J.f24997a;
        }
    }

    public abstract r a();

    protected final AbstractC5500F b() {
        AbstractC5500F abstractC5500F = this.f46690a;
        if (abstractC5500F != null) {
            return abstractC5500F;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean c() {
        return this.f46691b;
    }

    public r d(r destination, Bundle bundle, y yVar, a aVar) {
        AbstractC6492s.i(destination, "destination");
        return destination;
    }

    public void e(List entries, y yVar, a aVar) {
        AbstractC6492s.i(entries, "entries");
        Iterator it = AbstractC8783m.E(AbstractC8783m.N(AbstractC3689v.d0(entries), new c(yVar, aVar))).iterator();
        while (it.hasNext()) {
            b().j((C5512k) it.next());
        }
    }

    public void f(AbstractC5500F state) {
        AbstractC6492s.i(state, "state");
        this.f46690a = state;
        this.f46691b = true;
    }

    public void g(C5512k backStackEntry) {
        AbstractC6492s.i(backStackEntry, "backStackEntry");
        r rVarF = backStackEntry.f();
        if (rVarF == null) {
            rVarF = null;
        }
        if (rVarF == null) {
            return;
        }
        d(rVarF, null, AbstractC5495A.a(d.f46694a), null);
        b().f(backStackEntry);
    }

    public void h(Bundle savedState) {
        AbstractC6492s.i(savedState, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(C5512k popUpTo, boolean z10) {
        AbstractC6492s.i(popUpTo, "popUpTo");
        List list = (List) b().b().getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C5512k c5512k = null;
        while (k()) {
            c5512k = (C5512k) listIterator.previous();
            if (AbstractC6492s.d(c5512k, popUpTo)) {
                break;
            }
        }
        if (c5512k != null) {
            b().g(c5512k, z10);
        }
    }

    public boolean k() {
        return true;
    }
}
