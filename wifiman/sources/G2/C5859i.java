package g2;

import Li.N;
import Zg.AbstractC3689v;
import f2.AbstractC5498D;
import f2.C5512k;
import f2.InterfaceC5505d;
import f2.r;
import f2.y;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.q;
import org.snmp4j.util.SnmpConfigurator;

@AbstractC5498D.b("dialog")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006%"}, d2 = {"Lg2/i;", "Lf2/D;", "Lg2/i$b;", "<init>", "()V", "Lf2/k;", "backStackEntry", "LYg/J;", "m", "(Lf2/k;)V", "", "entries", "Lf2/y;", "navOptions", "Lf2/D$a;", "navigatorExtras", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/util/List;Lf2/y;Lf2/D$a;)V", "l", "()Lg2/i$b;", "popUpTo", "", "savedState", "j", "(Lf2/k;Z)V", "entry", "p", "LLi/N;", SnmpConfigurator.O_CONTEXT_NAME, "()LLi/N;", "backStack", "", SnmpConfigurator.O_OPERATION, "transitionInProgress", SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5859i extends AbstractC5498D {
    @Override // f2.AbstractC5498D
    public void e(List entries, y navOptions, AbstractC5498D.a navigatorExtras) {
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            b().j((C5512k) it.next());
        }
    }

    @Override // f2.AbstractC5498D
    public void j(C5512k popUpTo, boolean savedState) {
        b().h(popUpTo, savedState);
        int iU0 = AbstractC3689v.u0((Iterable) b().c().getValue(), popUpTo);
        int i10 = 0;
        for (Object obj : (Iterable) b().c().getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            C5512k c5512k = (C5512k) obj;
            if (i10 > iU0) {
                p(c5512k);
            }
            i10 = i11;
        }
    }

    @Override // f2.AbstractC5498D
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this, null, C5853c.f47524a.a(), 2, null);
    }

    public final void m(C5512k backStackEntry) {
        j(backStackEntry, false);
    }

    public final N n() {
        return b().b();
    }

    public final N o() {
        return b().c();
    }

    public final void p(C5512k entry) {
        b().e(entry);
    }

    /* renamed from: g2.i$b */
    public static final class b extends r implements InterfaceC5505d {

        /* renamed from: m, reason: collision with root package name */
        private final androidx.compose.ui.window.i f47580m;

        /* renamed from: n, reason: collision with root package name */
        private final q f47581n;

        public /* synthetic */ b(C5859i c5859i, androidx.compose.ui.window.i iVar, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c5859i, (i10 & 2) != 0 ? new androidx.compose.ui.window.i(false, false, false, 7, (DefaultConstructorMarker) null) : iVar, qVar);
        }

        public final q L() {
            return this.f47581n;
        }

        public final androidx.compose.ui.window.i M() {
            return this.f47580m;
        }

        public b(C5859i c5859i, androidx.compose.ui.window.i iVar, q qVar) {
            super(c5859i);
            this.f47580m = iVar;
            this.f47581n = qVar;
        }
    }
}
