package y0;

import android.view.MotionEvent;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: y0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8569I {

    /* renamed from: y0.I$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f66225a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f66226b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f66227c;

        /* renamed from: y0.I$a$a, reason: collision with other inner class name */
        static final class C2352a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

            /* renamed from: b, reason: collision with root package name */
            int f66228b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f66229c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f66230d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2352a(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f66230d = interfaceC6835l;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C2352a c2352a = new C2352a(this.f66230d, interfaceC5380e);
                c2352a.f66229c = obj;
                return c2352a;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r4.f66228b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f66229c
                    y0.b r1 = (y0.InterfaceC8581b) r1
                    Yg.v.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    Yg.v.b(r5)
                    java.lang.Object r5 = r4.f66229c
                    y0.b r5 = (y0.InterfaceC8581b) r5
                    r1 = r5
                L23:
                    y0.p r5 = y0.EnumC8595p.Initial
                    r4.f66229c = r1
                    r4.f66228b = r2
                    java.lang.Object r5 = r1.A1(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    y0.n r5 = (y0.C8593n) r5
                    android.view.MotionEvent r5 = r5.e()
                    if (r5 == 0) goto L23
                    mh.l r3 = r4.f66230d
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: y0.AbstractC8569I.a.C2352a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                return ((C2352a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f66227c = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f66227c, interfaceC5380e);
            aVar.f66226b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f66225a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f66226b;
                interfaceC8567G.V1(true);
                C2352a c2352a = new C2352a(this.f66227c, null);
                this.f66225a = 1;
                if (interfaceC8567G.P(c2352a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: y0.I$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f66231a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.viewinterop.c cVar) {
            super(1);
            this.f66231a = cVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f66231a.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f66231a.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
        return AbstractC8576P.d(eVar, interfaceC6835l, new a(interfaceC6835l, null));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, androidx.compose.ui.viewinterop.c cVar) {
        C8568H c8568h = new C8568H();
        c8568h.e(new b(cVar));
        C8575O c8575o = new C8575O();
        c8568h.f(c8575o);
        cVar.setOnRequestDisallowInterceptTouchEvent$ui_release(c8575o);
        return eVar.b0(c8568h);
    }
}
