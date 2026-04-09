package ad;

import Zg.AbstractC3689v;
import ad.InterfaceC3786a;
import android.net.Network;
import b8.AbstractC4075b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.n;
import kg.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import oh.AbstractC7137b;

/* loaded from: classes4.dex */
public abstract class f implements ad.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3786a f25950a;

    /* renamed from: b, reason: collision with root package name */
    private final Random f25951b;

    /* renamed from: c, reason: collision with root package name */
    private final z f25952c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f25953d;

    public static final class a implements C {
        public a() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess("wmA" + f.this.f() + ".wifiman.ubncloud.com");
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class b implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f25956a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Network f25957b;

            a(f fVar, Network network) {
                this.f25956a = fVar;
                this.f25957b = network;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(String hostname) {
                AbstractC6492s.i(hostname, "hostname");
                return this.f25956a.f25950a.a(hostname, 6000, this.f25957b);
            }
        }

        /* renamed from: ad.f$b$b, reason: collision with other inner class name */
        static final class C1000b implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1000b f25958a = new C1000b();

            /* renamed from: ad.f$b$b$a */
            static final class a implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final a f25959a = new a();

                a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Object it) {
                    AbstractC6492s.i(it, "it");
                    return gg.i.d2(1000L, TimeUnit.MILLISECONDS);
                }
            }

            C1000b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.p0(a.f25959a);
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Network network = (Network) c6556a.a();
            return (network == null ? gg.i.K0(InterfaceC3786a.AbstractC0997a.AbstractC0998a.b.f25944a) : f.this.f25952c.s(new a(f.this, network)).W()).n1(C1000b.f25958a);
        }
    }

    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f25960a = new c();

        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkedList apply(LinkedList linkedList, InterfaceC3786a.AbstractC0997a result) {
            AbstractC4075b abstractC4075bA;
            AbstractC6492s.i(result, "result");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (result instanceof InterfaceC3786a.AbstractC0997a.b) {
                abstractC4075bA = AbstractC4075b.f33002a.a(((InterfaceC3786a.AbstractC0997a.b) result).a());
            } else {
                if (!(result instanceof InterfaceC3786a.AbstractC0997a.AbstractC0998a)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC4075bA = null;
            }
            if ((abstractC4075bA != null ? Integer.valueOf(abstractC4075bA.b()) : null) == null || abstractC4075bA.b() <= 5000 || abstractC4075bA.b() >= 5200) {
                linkedList.add(new Wc.c(jCurrentTimeMillis, abstractC4075bA));
            }
            while (true) {
                AbstractC6492s.f(linkedList);
                if (linkedList.isEmpty() || ((Wc.c) linkedList.getFirst()).c() >= jCurrentTimeMillis - 35000) {
                    break;
                }
                linkedList.remove(0);
            }
            return linkedList;
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dd.i apply(LinkedList linkedList) {
            boolean z10;
            String str = "dns-lookup(" + f.this.hashCode() + ")";
            AbstractC6492s.f(linkedList);
            if (linkedList == null || !linkedList.isEmpty()) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (((Wc.c) it.next()).d() != null) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
            } else {
                z10 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC4075b abstractC4075b = (AbstractC4075b) ((Wc.c) it2.next()).d();
                Integer numValueOf = abstractC4075b != null ? Integer.valueOf(abstractC4075b.b()) : null;
                if (numValueOf != null) {
                    arrayList.add(numValueOf);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            AbstractC4075b abstractC4075bA = arrayList != null ? AbstractC4075b.f33002a.a(AbstractC7137b.d(AbstractC3689v.e0(arrayList))) : null;
            Wc.c cVar = (Wc.c) AbstractC3689v.D0(linkedList);
            AbstractC4075b abstractC4075b2 = cVar != null ? (AbstractC4075b) cVar.d() : null;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(linkedList, 10));
            Iterator it3 = linkedList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((Wc.c) it3.next()).d() != null ? 1 : 0));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            return new dd.i(str, null, boolValueOf, abstractC4075bA, abstractC4075b2, arrayList2 != null ? b8.d.f33007a.b((float) AbstractC3689v.e0(arrayList2)) : null, AbstractC3689v.i1(linkedList));
        }
    }

    public f(InterfaceC3786a dnsResolver, Yc.c networkHandle) {
        AbstractC6492s.i(dnsResolver, "dnsResolver");
        AbstractC6492s.i(networkHandle, "networkHandle");
        this.f25950a = dnsResolver;
        this.f25951b = new Random();
        z zVarI = z.i(new a());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        this.f25952c = zVarI;
        gg.i iVarI2 = networkHandle.e().I1(new b()).s1(new q() { // from class: ad.e
            @Override // kg.q
            public final Object get() {
                return f.g();
            }
        }, c.f25960a).N0(new d()).e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f25953d = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f() {
        return String.valueOf(Math.abs(this.f25951b.nextInt()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedList g() {
        return new LinkedList();
    }

    @Override // ad.d
    public gg.i a() {
        return this.f25953d;
    }
}
