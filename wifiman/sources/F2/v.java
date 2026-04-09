package f2;

import Zg.AbstractC3689v;
import android.os.Bundle;
import f2.AbstractC5498D;
import f2.r;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.N;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@AbstractC5498D.b("navigation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf2/v;", "Lf2/D;", "Lf2/t;", "Lf2/E;", "navigatorProvider", "<init>", "(Lf2/E;)V", "Lf2/k;", "entry", "Lf2/y;", "navOptions", "Lf2/D$a;", "navigatorExtras", "LYg/J;", "m", "(Lf2/k;Lf2/y;Lf2/D$a;)V", "l", "()Lf2/t;", "", "entries", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/util/List;Lf2/y;Lf2/D$a;)V", SnmpConfigurator.O_COMMUNITY, "Lf2/E;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class v extends AbstractC5498D {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C5499E navigatorProvider;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f46917a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N n10) {
            super(1);
            this.f46917a = n10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            AbstractC6492s.i(key, "key");
            Object obj = this.f46917a.f51689a;
            boolean z10 = true;
            if (obj != null && ((Bundle) obj).containsKey(key)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public v(C5499E navigatorProvider) {
        AbstractC6492s.i(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    private final void m(C5512k entry, y navOptions, AbstractC5498D.a navigatorExtras) {
        r rVarF = entry.f();
        AbstractC6492s.g(rVarF, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        t tVar = (t) rVarF;
        N n10 = new N();
        n10.f51689a = entry.d();
        int iV = tVar.V();
        String strW = tVar.W();
        if (iV == 0 && strW == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + tVar.q()).toString());
        }
        r rVarQ = strW != null ? tVar.Q(strW, false) : (r) tVar.T().f(iV);
        if (rVarQ == null) {
            throw new IllegalArgumentException("navigation destination " + tVar.U() + " is not a direct child of this NavGraph");
        }
        if (strW != null) {
            if (!AbstractC6492s.d(strW, rVarQ.w())) {
                r.b bVarA = rVarQ.A(strW);
                Bundle bundleC = bVarA != null ? bVarA.c() : null;
                if (bundleC != null && !bundleC.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putAll(bundleC);
                    Object obj = n10.f51689a;
                    if (((Bundle) obj) != null) {
                        bundle.putAll((Bundle) obj);
                    }
                    n10.f51689a = bundle;
                }
            }
            if (!rVarQ.k().isEmpty()) {
                List listA = AbstractC5511j.a(rVarQ.k(), new a(n10));
                if (!listA.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + rVarQ + ". Missing required arguments [" + listA + ']').toString());
                }
            }
        }
        this.navigatorProvider.e(rVarQ.u()).e(AbstractC3689v.e(b().a(rVarQ, rVarQ.g((Bundle) n10.f51689a))), navOptions, navigatorExtras);
    }

    @Override // f2.AbstractC5498D
    public void e(List entries, y navOptions, AbstractC5498D.a navigatorExtras) {
        AbstractC6492s.i(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            m((C5512k) it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // f2.AbstractC5498D
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public t a() {
        return new t(this);
    }
}
