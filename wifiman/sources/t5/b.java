package T5;

import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;
import w.o;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* loaded from: classes3.dex */
public abstract class b {

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21421a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21422b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f21423c;

        /* renamed from: T5.b$a$a, reason: collision with other inner class name */
        static final class C0781a extends k implements InterfaceC6839p {

            /* renamed from: b, reason: collision with root package name */
            float f21424b;

            /* renamed from: c, reason: collision with root package name */
            float f21425c;

            /* renamed from: d, reason: collision with root package name */
            int f21426d;

            /* renamed from: e, reason: collision with root package name */
            int f21427e;

            /* renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f21428f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f21429g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0781a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f21429g = interfaceC6839p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0781a c0781a = new C0781a(this.f21429g, interfaceC5380e);
                c0781a.f21428f = obj;
                return c0781a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
            
                r9 = true;
             */
            /* JADX WARN: Path cross not found for [B:19:0x0077, B:22:0x0082], limit reached: 67 */
            /* JADX WARN: Path cross not found for [B:22:0x0082, B:21:0x0080], limit reached: 67 */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:17:0x006b). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 283
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: T5.b.a.C0781a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                return ((C0781a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21423c = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f21423c, interfaceC5380e);
            aVar.f21422b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21421a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f21422b;
                C0781a c0781a = new C0781a(this.f21423c, null);
                this.f21421a = 1;
                if (interfaceC8567G.P(c0781a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final Object a(InterfaceC8567G interfaceC8567G, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objE = o.e(interfaceC8567G, new a(interfaceC6839p, null), interfaceC5380e);
        return objE == AbstractC5467b.g() ? objE : J.f24997a;
    }
}
