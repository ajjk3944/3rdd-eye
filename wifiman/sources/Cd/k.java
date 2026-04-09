package Cd;

import Cd.j;
import Ii.N;
import Ka.f;
import Yg.J;
import Yg.v;
import com.ui.speedtest.UiSpeedtestLib;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.D;
import gg.z;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import td.InterfaceC8082d;

/* loaded from: classes4.dex */
public final class k implements j.a {

    /* renamed from: a, reason: collision with root package name */
    private final f.a f2598a;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f2599a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ inet.ipaddr.g f2601c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(inet.ipaddr.g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f2601c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return k.this.new a(this.f2601c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f2599a;
            if (i10 == 0) {
                v.b(obj);
                f.a aVar = k.this.f2598a;
                String strA = j.f2592a.a(this.f2601c, 8901);
                this.f2599a = 1;
                obj = aVar.c(strA, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2602a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(f.b it) {
            AbstractC6492s.i(it, "it");
            return Boolean.TRUE;
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2603a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable err) {
            AbstractC6492s.i(err, "err");
            if (!(err instanceof UiSpeedtestLib.Error) && !(err instanceof TimeoutException)) {
                return z.p(err);
            }
            return z.z(Boolean.FALSE);
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ inet.ipaddr.g f2604a;

        d(inet.ipaddr.g gVar) {
            this.f2604a = gVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Local speedtest check for " + this.f2604a + " - SUCCESS", null, 2, null);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ inet.ipaddr.g f2605a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f2606b;

        e(inet.ipaddr.g gVar, long j10) {
            this.f2605a = gVar;
            this.f2606b = j10;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Local speedtest check for " + this.f2605a + " subscribed with timeout " + this.f2606b, null, 2, null);
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ inet.ipaddr.g f2607a;

        f(inet.ipaddr.g gVar) {
            this.f2607a = gVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Local speedtest check for " + this.f2607a + " - FAILED with message " + it.getMessage(), null, 2, null);
        }
    }

    public k(InterfaceC8082d speedtestClientFactory) {
        AbstractC6492s.i(speedtestClientFactory, "speedtestClientFactory");
        this.f2598a = speedtestClientFactory.a();
    }

    @Override // Cd.j.a
    public z a(inet.ipaddr.g ip, long j10) {
        AbstractC6492s.i(ip, "ip");
        z zVarM = Qi.l.c(null, new a(ip, null), 1, null).O(Gg.a.d()).E(Gg.a.a()).A(b.f2602a).Q(j10, TimeUnit.MILLISECONDS).F(c.f2603a).o(new d(ip)).n(new e(ip, j10)).m(new f(ip));
        AbstractC6492s.h(zVarM, "doOnError(...)");
        return zVarM;
    }
}
