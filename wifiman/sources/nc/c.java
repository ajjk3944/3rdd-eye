package Nc;

import Dc.k;
import Nc.a;
import Nc.b;
import gg.y;
import gg.z;
import inet.ipaddr.g;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class c extends Nc.b {

    /* renamed from: h, reason: collision with root package name */
    public static final a f16379h = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private final Nc.a f16380d;

    /* renamed from: e, reason: collision with root package name */
    private final y f16381e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16382f;

    /* renamed from: g, reason: collision with root package name */
    private final k f16383g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f16384a;

        b(g gVar) {
            this.f16384a = gVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a.AbstractC0591a result) {
            b.C0593b c0593b;
            AbstractC6492s.i(result, "result");
            if (result instanceof a.AbstractC0591a.b) {
                c0593b = new b.C0593b(this.f16384a, ((a.AbstractC0591a.b) result).a(), System.currentTimeMillis(), Long.MAX_VALUE);
            } else {
                if (!(result instanceof a.AbstractC0591a.C0592a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0593b = null;
            }
            return new C6556a(c0593b);
        }
    }

    public c(b.a params, Nc.a netbios, y scheduler) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(netbios, "netbios");
        AbstractC6492s.i(scheduler, "scheduler");
        this.f16380d = netbios;
        this.f16381e = scheduler;
        this.f16382f = "Netbios";
        this.f16383g = params.a();
    }

    @Override // Dc.t
    public k h() {
        return this.f16383g;
    }

    @Override // Dc.t
    protected String i() {
        return this.f16382f;
    }

    @Override // Dc.t
    protected y k() {
        return this.f16381e;
    }

    @Override // Dc.t
    protected z m(g ip) {
        AbstractC6492s.i(ip, "ip");
        z zVarA = this.f16380d.a(ip, 500L).A(new b(ip));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }
}
