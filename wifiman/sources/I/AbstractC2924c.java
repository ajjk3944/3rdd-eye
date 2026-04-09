package I;

import H.l;
import I.AbstractC2924c;
import Ii.AbstractC3063k;
import Li.InterfaceC3221h;
import R0.C3465s;
import T.AbstractC3535i0;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.w1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import t.C8016c;
import u.AbstractC8121a;

/* renamed from: I.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2924c {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f8156a = {"*/*", "image/*", "video/*"};

    /* renamed from: I.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f8157a;

        /* renamed from: b, reason: collision with root package name */
        int f8158b;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8157a = obj;
            this.f8158b |= PduHandle.NONE;
            return AbstractC2924c.d(null, null, null, null, null, null, null, null, this);
        }
    }

    /* renamed from: I.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f8159a;

        /* renamed from: b, reason: collision with root package name */
        int f8160b;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8159a = obj;
            this.f8160b |= PduHandle.NONE;
            return AbstractC2924c.c(null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* renamed from: I.c$c, reason: collision with other inner class name */
    static final class C0337c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8161a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f8162b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Li.y f8163c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o1 f8164d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l1 f8165e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2952q f8166f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.O0 f8167g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3465s f8168h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8169i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ w1 f8170j;

        /* renamed from: I.c$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f8171a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o1 f8172b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2952q f8173c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o1 o1Var, InterfaceC2952q interfaceC2952q, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f8172b = o1Var;
                this.f8173c = interfaceC2952q;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void t(InterfaceC2952q interfaceC2952q, H.h hVar, H.h hVar2, boolean z10) {
                long jF = hVar.f();
                long jF2 = hVar2.f();
                L0.S sC = hVar.c();
                L0.S sC2 = hVar2.c();
                if (z10 && hVar.c() != null && !hVar.a(hVar2)) {
                    interfaceC2952q.b();
                } else {
                    if (L0.S.g(jF, jF2) && AbstractC6492s.d(sC, sC2)) {
                        return;
                    }
                    interfaceC2952q.a(L0.S.l(jF2), L0.S.k(jF2), sC2 != null ? L0.S.l(sC2.r()) : -1, sC2 != null ? L0.S.k(sC2.r()) : -1);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f8172b, this.f8173c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f8171a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    o1 o1Var = this.f8172b;
                    final InterfaceC2952q interfaceC2952q = this.f8173c;
                    l.a aVar = new l.a() { // from class: I.e
                        @Override // H.l.a
                        public final void a(H.h hVar, H.h hVar2, boolean z10) {
                            AbstractC2924c.C0337c.a.t(interfaceC2952q, hVar, hVar2, z10);
                        }
                    };
                    this.f8171a = 1;
                    if (o1Var.g(aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* renamed from: I.c$c$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f8174a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Li.y f8175b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2952q f8176c;

            /* renamed from: I.c$c$b$a */
            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final a f8177a = new a();

                a() {
                    super(1);
                }

                public final void a(long j10) {
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).longValue());
                    return Yg.J.f24997a;
                }
            }

            /* renamed from: I.c$c$b$b, reason: collision with other inner class name */
            static final class C0338b implements InterfaceC3221h {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2952q f8178a;

                C0338b(InterfaceC2952q interfaceC2952q) {
                    this.f8178a = interfaceC2952q;
                }

                @Override // Li.InterfaceC3221h
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object a(Yg.J j10, InterfaceC5380e interfaceC5380e) {
                    this.f8178a.e();
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Li.y yVar, InterfaceC2952q interfaceC2952q, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f8175b = yVar;
                this.f8176c = interfaceC2952q;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f8175b, this.f8176c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f8174a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    a aVar = a.f8177a;
                    this.f8174a = 1;
                    if (AbstractC3535i0.b(aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        throw new KotlinNothingValueException();
                    }
                    Yg.v.b(obj);
                }
                Li.y yVar = this.f8175b;
                C0338b c0338b = new C0338b(this.f8176c);
                this.f8174a = 2;
                if (yVar.b(c0338b, this) == objG) {
                    return objG;
                }
                throw new KotlinNothingValueException();
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* renamed from: I.c$c$c, reason: collision with other inner class name */
        static final class C0339c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o1 f8179a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0339c(o1 o1Var) {
                super(0);
                this.f8179a = o1Var;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "createInputConnection(value=\"" + ((Object) this.f8179a.l()) + "\")";
            }
        }

        /* renamed from: I.c$c$d */
        public static final class d implements k1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o1 f8180a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC2952q f8181b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f8182c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ F f8183d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l1 f8184e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ w1 f8185f;

            d(o1 o1Var, InterfaceC2952q interfaceC2952q, InterfaceC6835l interfaceC6835l, AbstractC8121a abstractC8121a, F f10, l1 l1Var, w1 w1Var) {
                this.f8180a = o1Var;
                this.f8181b = interfaceC2952q;
                this.f8182c = interfaceC6835l;
                this.f8183d = f10;
                this.f8184e = l1Var;
                this.f8185f = w1Var;
            }

            @Override // I.k1
            public H.h a() {
                return this.f8180a.l();
            }

            @Override // I.k1
            public void b(int i10) {
                InterfaceC6835l interfaceC6835l = this.f8182c;
                if (interfaceC6835l != null) {
                    interfaceC6835l.invoke(R0.r.j(i10));
                }
            }

            @Override // I.k1
            public boolean c(C8016c c8016c) {
                return false;
            }

            @Override // I.k1
            public void d(InterfaceC6835l interfaceC6835l) {
                o1 o1Var = this.f8180a;
                H.l lVar = o1Var.f8379a;
                H.b bVar = o1Var.f8380b;
                K.c cVar = K.c.MergeIfPossible;
                lVar.g().f().e();
                interfaceC6835l.invoke(lVar.g());
                lVar.e(bVar, false, cVar);
            }

            @Override // I.k1
            public int e(HandwritingGesture handwritingGesture) {
                if (Build.VERSION.SDK_INT >= 34) {
                    return E0.f7990a.m(this.f8180a, handwritingGesture, this.f8184e, this.f8185f);
                }
                return 2;
            }

            @Override // I.k1
            public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
                if (Build.VERSION.SDK_INT >= 34) {
                    return E0.f7990a.E(this.f8180a, previewableHandwritingGesture, this.f8184e, cancellationSignal);
                }
                return false;
            }

            @Override // I.k1
            public void requestCursorUpdates(int i10) {
                this.f8183d.d(i10);
            }

            @Override // I.k1
            public void sendKeyEvent(KeyEvent keyEvent) {
                this.f8181b.sendKeyEvent(keyEvent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0337c(Li.y yVar, o1 o1Var, l1 l1Var, InterfaceC2952q interfaceC2952q, androidx.compose.ui.platform.O0 o02, C3465s c3465s, AbstractC8121a abstractC8121a, InterfaceC6835l interfaceC6835l, w1 w1Var, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f8163c = yVar;
            this.f8164d = o1Var;
            this.f8165e = l1Var;
            this.f8166f = interfaceC2952q;
            this.f8167g = o02;
            this.f8168h = c3465s;
            this.f8169i = interfaceC6835l;
            this.f8170j = w1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputConnection t(o1 o1Var, C3465s c3465s, AbstractC8121a abstractC8121a, InterfaceC2952q interfaceC2952q, InterfaceC6835l interfaceC6835l, F f10, l1 l1Var, w1 w1Var, EditorInfo editorInfo) {
            AbstractC2924c.b(null, new C0339c(o1Var), 1, null);
            d dVar = new d(o1Var, interfaceC2952q, interfaceC6835l, abstractC8121a, f10, l1Var, w1Var);
            V.b(editorInfo, o1Var.l(), o1Var.l().f(), c3465s, null);
            return new Z0(dVar, editorInfo);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            C0337c c0337c = new C0337c(this.f8163c, this.f8164d, this.f8165e, this.f8166f, this.f8167g, this.f8168h, null, this.f8169i, this.f8170j, interfaceC5380e);
            c0337c.f8162b = obj;
            return c0337c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8161a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Ii.N n10 = (Ii.N) this.f8162b;
                AbstractC3063k.d(n10, null, Ii.P.UNDISPATCHED, new a(this.f8164d, this.f8166f, null), 1, null);
                Li.y yVar = this.f8163c;
                if (yVar != null) {
                    AbstractC3063k.d(n10, null, null, new b(yVar, this.f8166f, null), 3, null);
                }
                final F f10 = new F(this.f8164d, this.f8165e, this.f8166f, n10);
                androidx.compose.ui.platform.O0 o02 = this.f8167g;
                final o1 o1Var = this.f8164d;
                final C3465s c3465s = this.f8168h;
                final InterfaceC2952q interfaceC2952q = this.f8166f;
                final InterfaceC6835l interfaceC6835l = this.f8169i;
                final l1 l1Var = this.f8165e;
                final w1 w1Var = this.f8170j;
                final AbstractC8121a abstractC8121a = null;
                androidx.compose.ui.platform.L0 l02 = new androidx.compose.ui.platform.L0(c3465s, abstractC8121a, interfaceC2952q, interfaceC6835l, f10, l1Var, w1Var) { // from class: I.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C3465s f8221b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC2952q f8222c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC6835l f8223d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ F f8224e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ l1 f8225f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ w1 f8226g;

                    {
                        this.f8222c = interfaceC2952q;
                        this.f8223d = interfaceC6835l;
                        this.f8224e = f10;
                        this.f8225f = l1Var;
                        this.f8226g = w1Var;
                    }

                    @Override // androidx.compose.ui.platform.L0
                    public final InputConnection a(EditorInfo editorInfo) {
                        return AbstractC2924c.C0337c.t(this.f8220a, this.f8221b, null, this.f8222c, this.f8223d, this.f8224e, this.f8225f, this.f8226g, editorInfo);
                    }
                };
                this.f8161a = 1;
                if (o02.b(l02, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((C0337c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    private static final void a(String str, InterfaceC6824a interfaceC6824a) {
    }

    static /* synthetic */ void b(String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "AndroidTextInputSession";
        }
        a(str, interfaceC6824a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.ui.platform.O0 r16, I.o1 r17, I.l1 r18, R0.C3465s r19, u.AbstractC8121a r20, mh.InterfaceC6835l r21, I.InterfaceC2952q r22, Li.y r23, androidx.compose.ui.platform.w1 r24, dh.InterfaceC5380e r25) {
        /*
            r0 = r25
            boolean r1 = r0 instanceof I.AbstractC2924c.b
            if (r1 == 0) goto L15
            r1 = r0
            I.c$b r1 = (I.AbstractC2924c.b) r1
            int r2 = r1.f8160b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f8160b = r2
            goto L1a
        L15:
            I.c$b r1 = new I.c$b
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f8159a
            java.lang.Object r2 = eh.AbstractC5467b.g()
            int r3 = r1.f8160b
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 == r4) goto L2f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            Yg.v.b(r0)
            goto L58
        L33:
            Yg.v.b(r0)
            I.c$c r0 = new I.c$c
            r15 = 0
            r5 = r0
            r6 = r23
            r7 = r17
            r8 = r18
            r9 = r22
            r10 = r16
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f8160b = r4
            java.lang.Object r0 = Ii.O.g(r0, r1)
            if (r0 != r2) goto L58
            return r2
        L58:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I.AbstractC2924c.c(androidx.compose.ui.platform.O0, I.o1, I.l1, R0.s, u.a, mh.l, I.q, Li.y, androidx.compose.ui.platform.w1, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.compose.ui.platform.O0 r12, I.o1 r13, I.l1 r14, R0.C3465s r15, u.AbstractC8121a r16, mh.InterfaceC6835l r17, Li.y r18, androidx.compose.ui.platform.w1 r19, dh.InterfaceC5380e r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof I.AbstractC2924c.a
            if (r1 == 0) goto L16
            r1 = r0
            I.c$a r1 = (I.AbstractC2924c.a) r1
            int r2 = r1.f8158b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f8158b = r2
        L14:
            r11 = r1
            goto L1c
        L16:
            I.c$a r1 = new I.c$a
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r11.f8157a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r11.f8158b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L31
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            Yg.v.b(r0)
            goto L55
        L35:
            Yg.v.b(r0)
            android.view.View r0 = r12.a()
            I.q r8 = I.AbstractC2961v.a(r0)
            r11.f8158b = r3
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r18
            r10 = r19
            java.lang.Object r0 = c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L55
            return r1
        L55:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I.AbstractC2924c.d(androidx.compose.ui.platform.O0, I.o1, I.l1, R0.s, u.a, mh.l, Li.y, androidx.compose.ui.platform.w1, dh.e):java.lang.Object");
    }
}
