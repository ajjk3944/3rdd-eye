package O1;

import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16765a = new a(null);

    public static final class a {

        /* renamed from: O1.d$a$a, reason: collision with other inner class name */
        static final class C0599a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f16766a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f16767b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f16768c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0599a(List list, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f16768c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0599a c0599a = new C0599a(this.f16768c, interfaceC5380e);
                c0599a.f16767b = obj;
                return c0599a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f16766a;
                if (i10 == 0) {
                    v.b(obj);
                    h hVar = (h) this.f16767b;
                    a aVar = d.f16765a;
                    List list = this.f16768c;
                    this.f16766a = 1;
                    if (aVar.c(list, hVar, this) == objG) {
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
            public final Object invoke(h hVar, InterfaceC5380e interfaceC5380e) {
                return ((C0599a) create(hVar, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f16769a;

            /* renamed from: b, reason: collision with root package name */
            Object f16770b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f16771c;

            /* renamed from: e, reason: collision with root package name */
            int f16773e;

            b(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f16771c = obj;
                this.f16773e |= PduHandle.NONE;
                return a.this.c(null, null, this);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            Object f16774a;

            /* renamed from: b, reason: collision with root package name */
            Object f16775b;

            /* renamed from: c, reason: collision with root package name */
            Object f16776c;

            /* renamed from: d, reason: collision with root package name */
            int f16777d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f16778e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f16779f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f16780g;

            /* renamed from: O1.d$a$c$a, reason: collision with other inner class name */
            static final class C0600a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                int f16781a;

                C0600a(O1.c cVar, InterfaceC5380e interfaceC5380e) {
                    super(1, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
                    return new C0600a(null, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    int i10 = this.f16781a;
                    if (i10 == 0) {
                        v.b(obj);
                        this.f16781a = 1;
                        throw null;
                    }
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC5380e interfaceC5380e) {
                    return ((C0600a) create(interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f16779f = list;
                this.f16780g = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                c cVar = new c(this.f16779f, this.f16780g, interfaceC5380e);
                cVar.f16778e = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                AbstractC5467b.g();
                int i10 = this.f16777d;
                if (i10 == 0) {
                    v.b(obj);
                    obj = this.f16778e;
                    List list2 = this.f16779f;
                    list = this.f16780g;
                    it = list2.iterator();
                } else if (i10 == 1) {
                    Object obj2 = this.f16776c;
                    AbstractC5487d.a(this.f16775b);
                    Iterator it2 = (Iterator) this.f16774a;
                    List list3 = (List) this.f16778e;
                    v.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0600a(null, null));
                        this.f16778e = list3;
                        this.f16774a = it2;
                        this.f16775b = null;
                        this.f16776c = null;
                        this.f16777d = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f16774a;
                    list = (List) this.f16778e;
                    v.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                AbstractC5487d.a(it.next());
                this.f16778e = list;
                this.f16774a = it;
                this.f16775b = null;
                this.f16776c = obj;
                this.f16777d = 1;
                throw null;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, InterfaceC5380e interfaceC5380e) {
                return ((c) create(obj, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.List r7, O1.h r8, dh.InterfaceC5380e r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof O1.d.a.b
                if (r0 == 0) goto L13
                r0 = r9
                O1.d$a$b r0 = (O1.d.a.b) r0
                int r1 = r0.f16773e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f16773e = r1
                goto L18
            L13:
                O1.d$a$b r0 = new O1.d$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f16771c
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f16773e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f16770b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f16769a
                kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
                Yg.v.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f16769a
                java.util.List r7 = (java.util.List) r7
                Yg.v.b(r9)
                goto L60
            L46:
                Yg.v.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                O1.d$a$c r2 = new O1.d$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f16769a = r9
                r0.f16773e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.N r8 = new kotlin.jvm.internal.N
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L96
                java.lang.Object r9 = r7.next()
                mh.l r9 = (mh.InterfaceC6835l) r9
                r0.f16769a = r8     // Catch: java.lang.Throwable -> L34
                r0.f16770b = r7     // Catch: java.lang.Throwable -> L34
                r0.f16773e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                java.lang.Object r2 = r8.f51689a
                if (r2 != 0) goto L8b
                r8.f51689a = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.AbstractC6492s.f(r2)
                java.lang.Object r2 = r8.f51689a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                Yg.AbstractC3663g.a(r2, r9)
                goto L6b
            L96:
                java.lang.Object r7 = r8.f51689a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                Yg.J r7 = Yg.J.f24997a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.d.a.c(java.util.List, O1.h, dh.e):java.lang.Object");
        }

        public final InterfaceC6839p b(List migrations) {
            AbstractC6492s.i(migrations, "migrations");
            return new C0599a(migrations, null);
        }

        private a() {
        }
    }
}
