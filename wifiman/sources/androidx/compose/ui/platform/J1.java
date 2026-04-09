package androidx.compose.ui.platform;

import Ii.AbstractC3063k;
import Li.AbstractC3222i;
import Li.InterfaceC3221h;
import Li.J;
import T.AbstractC3550q;
import T.C3566y0;
import T.InterfaceC3530g0;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class J1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f29185a = new LinkedHashMap();

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29186a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T.N0 f29187b;

        a(View view, T.N0 n02) {
            this.f29186a = view;
            this.f29187b = n02;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f29186a.removeOnAttachStateChangeListener(this);
            this.f29187b.Y();
        }
    }

    public static final class b implements InterfaceC4015m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ii.N f29188a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3566y0 f29189b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T.N0 f29190c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f29191d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f29192e;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29193a;

            static {
                int[] iArr = new int[AbstractC4013k.a.values().length];
                try {
                    iArr[AbstractC4013k.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC4013k.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC4013k.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC4013k.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbstractC4013k.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbstractC4013k.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbstractC4013k.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f29193a = iArr;
            }
        }

        /* renamed from: androidx.compose.ui.platform.J1$b$b, reason: collision with other inner class name */
        static final class C1069b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f29194a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f29195b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f29196c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T.N0 f29197d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC4017o f29198e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f29199f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ View f29200g;

            /* renamed from: androidx.compose.ui.platform.J1$b$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f29201a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Li.N f29202b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ G0 f29203c;

                /* renamed from: androidx.compose.ui.platform.J1$b$b$a$a, reason: collision with other inner class name */
                static final class C1070a implements InterfaceC3221h {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ G0 f29204a;

                    C1070a(G0 g02) {
                        this.f29204a = g02;
                    }

                    @Override // Li.InterfaceC3221h
                    public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                        return b(((Number) obj).floatValue(), interfaceC5380e);
                    }

                    public final Object b(float f10, InterfaceC5380e interfaceC5380e) {
                        this.f29204a.b(f10);
                        return Yg.J.f24997a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Li.N n10, G0 g02, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f29202b = n10;
                    this.f29203c = g02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f29202b, this.f29203c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f29201a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        Li.N n10 = this.f29202b;
                        C1070a c1070a = new C1070a(this.f29203c);
                        this.f29201a = 1;
                        if (n10.b(c1070a, this) == objG) {
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
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1069b(kotlin.jvm.internal.N n10, T.N0 n02, InterfaceC4017o interfaceC4017o, b bVar, View view, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f29196c = n10;
                this.f29197d = n02;
                this.f29198e = interfaceC4017o;
                this.f29199f = bVar;
                this.f29200g = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C1069b c1069b = new C1069b(this.f29196c, this.f29197d, this.f29198e, this.f29199f, this.f29200g, interfaceC5380e);
                c1069b.f29195b = obj;
                return c1069b;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r11.f29194a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r0 = r11.f29195b
                    Ii.y0 r0 = (Ii.InterfaceC3091y0) r0
                    Yg.v.b(r12)     // Catch: java.lang.Throwable -> L14
                    goto L6a
                L14:
                    r12 = move-exception
                    goto L81
                L17:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1f:
                    Yg.v.b(r12)
                    java.lang.Object r12 = r11.f29195b
                    r4 = r12
                    Ii.N r4 = (Ii.N) r4
                    kotlin.jvm.internal.N r12 = r11.f29196c     // Catch: java.lang.Throwable -> L58
                    java.lang.Object r12 = r12.f51689a     // Catch: java.lang.Throwable -> L58
                    androidx.compose.ui.platform.G0 r12 = (androidx.compose.ui.platform.G0) r12     // Catch: java.lang.Throwable -> L58
                    if (r12 == 0) goto L5b
                    android.view.View r1 = r11.f29200g     // Catch: java.lang.Throwable -> L58
                    android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L58
                    android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L58
                    Li.N r1 = androidx.compose.ui.platform.J1.a(r1)     // Catch: java.lang.Throwable -> L58
                    java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L58
                    java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L58
                    float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L58
                    r12.b(r5)     // Catch: java.lang.Throwable -> L58
                    androidx.compose.ui.platform.J1$b$b$a r7 = new androidx.compose.ui.platform.J1$b$b$a     // Catch: java.lang.Throwable -> L58
                    r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L58
                    r8 = 3
                    r9 = 0
                    r5 = 0
                    r6 = 0
                    Ii.y0 r12 = Ii.AbstractC3059i.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
                    goto L5c
                L58:
                    r12 = move-exception
                    r0 = r3
                    goto L81
                L5b:
                    r12 = r3
                L5c:
                    T.N0 r1 = r11.f29197d     // Catch: java.lang.Throwable -> L7d
                    r11.f29195b = r12     // Catch: java.lang.Throwable -> L7d
                    r11.f29194a = r2     // Catch: java.lang.Throwable -> L7d
                    java.lang.Object r1 = r1.z0(r11)     // Catch: java.lang.Throwable -> L7d
                    if (r1 != r0) goto L69
                    return r0
                L69:
                    r0 = r12
                L6a:
                    if (r0 == 0) goto L6f
                    Ii.InterfaceC3091y0.a.b(r0, r3, r2, r3)
                L6f:
                    androidx.lifecycle.o r12 = r11.f29198e
                    androidx.lifecycle.k r12 = r12.O()
                    androidx.compose.ui.platform.J1$b r0 = r11.f29199f
                    r12.c(r0)
                    Yg.J r12 = Yg.J.f24997a
                    return r12
                L7d:
                    r0 = move-exception
                    r10 = r0
                    r0 = r12
                    r12 = r10
                L81:
                    if (r0 == 0) goto L86
                    Ii.InterfaceC3091y0.a.b(r0, r3, r2, r3)
                L86:
                    androidx.lifecycle.o r0 = r11.f29198e
                    androidx.lifecycle.k r0 = r0.O()
                    androidx.compose.ui.platform.J1$b r1 = r11.f29199f
                    r0.c(r1)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.J1.b.C1069b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1069b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        b(Ii.N n10, C3566y0 c3566y0, T.N0 n02, kotlin.jvm.internal.N n11, View view) {
            this.f29188a = n10;
            this.f29189b = c3566y0;
            this.f29190c = n02;
            this.f29191d = n11;
            this.f29192e = view;
        }

        @Override // androidx.lifecycle.InterfaceC4015m
        public void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
            int i10 = a.f29193a[aVar.ordinal()];
            if (i10 == 1) {
                AbstractC3063k.d(this.f29188a, null, Ii.P.UNDISPATCHED, new C1069b(this.f29191d, this.f29190c, interfaceC4017o, this, this.f29192e, null), 1, null);
                return;
            }
            if (i10 == 2) {
                C3566y0 c3566y0 = this.f29189b;
                if (c3566y0 != null) {
                    c3566y0.c();
                }
                this.f29190c.y0();
                return;
            }
            if (i10 == 3) {
                this.f29190c.l0();
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f29190c.Y();
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f29205a;

        /* renamed from: b, reason: collision with root package name */
        int f29206b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f29207c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ContentResolver f29208d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f29209e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f29210f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ki.g f29211g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f29212h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, Ki.g gVar, Context context, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f29208d = contentResolver;
            this.f29209e = uri;
            this.f29210f = dVar;
            this.f29211g = gVar;
            this.f29212h = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(this.f29208d, this.f29209e, this.f29210f, this.f29211g, this.f29212h, interfaceC5380e);
            cVar.f29207c = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r8.f29206b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f29205a
                Ki.i r1 = (Ki.i) r1
                java.lang.Object r4 = r8.f29207c
                Li.h r4 = (Li.InterfaceC3221h) r4
                Yg.v.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f29205a
                Ki.i r1 = (Ki.i) r1
                java.lang.Object r4 = r8.f29207c
                Li.h r4 = (Li.InterfaceC3221h) r4
                Yg.v.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                Yg.v.b(r9)
                java.lang.Object r9 = r8.f29207c
                Li.h r9 = (Li.InterfaceC3221h) r9
                android.content.ContentResolver r1 = r8.f29208d
                android.net.Uri r4 = r8.f29209e
                r5 = 0
                androidx.compose.ui.platform.J1$d r6 = r8.f29210f
                r1.registerContentObserver(r4, r5, r6)
                Ki.g r1 = r8.f29211g     // Catch: java.lang.Throwable -> L1b
                Ki.i r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f29207c = r9     // Catch: java.lang.Throwable -> L1b
                r8.f29205a = r1     // Catch: java.lang.Throwable -> L1b
                r8.f29206b = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                return r0
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f29212h     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = kotlin.coroutines.jvm.internal.b.c(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f29207c = r4     // Catch: java.lang.Throwable -> L1b
                r8.f29205a = r1     // Catch: java.lang.Throwable -> L1b
                r8.f29206b = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.a(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f29208d
                androidx.compose.ui.platform.J1$d r0 = r8.f29210f
                r9.unregisterContentObserver(r0)
                Yg.J r9 = Yg.J.f24997a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.f29208d
                androidx.compose.ui.platform.J1$d r1 = r8.f29210f
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.J1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ki.g f29213a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ki.g gVar, Handler handler) {
            super(handler);
            this.f29213a = gVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            this.f29213a.k(Yg.J.f24997a);
        }
    }

    public static final T.N0 b(View view, InterfaceC5384i interfaceC5384i, AbstractC4013k abstractC4013k) {
        C3566y0 c3566y0;
        if (interfaceC5384i.get(InterfaceC5381f.f46086m0) == null || interfaceC5384i.get(InterfaceC3530g0.f21076a0) == null) {
            interfaceC5384i = Q.f29278m.a().plus(interfaceC5384i);
        }
        InterfaceC3530g0 interfaceC3530g0 = (InterfaceC3530g0) interfaceC5384i.get(InterfaceC3530g0.f21076a0);
        if (interfaceC3530g0 != null) {
            C3566y0 c3566y02 = new C3566y0(interfaceC3530g0);
            c3566y02.b();
            c3566y0 = c3566y02;
        } else {
            c3566y0 = null;
        }
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        InterfaceC5384i g02 = (f0.g) interfaceC5384i.get(f0.g.f46598n0);
        if (g02 == null) {
            g02 = new G0();
            n10.f51689a = g02;
        }
        InterfaceC5384i interfaceC5384iPlus = interfaceC5384i.plus(c3566y0 != null ? c3566y0 : C5385j.f46088a).plus(g02);
        T.N0 n02 = new T.N0(interfaceC5384iPlus);
        n02.l0();
        Ii.N nA = Ii.O.a(interfaceC5384iPlus);
        if (abstractC4013k == null) {
            InterfaceC4017o interfaceC4017oA = androidx.lifecycle.T.a(view);
            abstractC4013k = interfaceC4017oA != null ? interfaceC4017oA.O() : null;
        }
        if (abstractC4013k != null) {
            view.addOnAttachStateChangeListener(new a(view, n02));
            abstractC4013k.a(new b(nA, c3566y0, n02, n10, view));
            return n02;
        }
        B0.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ T.N0 c(View view, InterfaceC5384i interfaceC5384i, AbstractC4013k abstractC4013k, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        if ((i10 & 2) != 0) {
            abstractC4013k = null;
        }
        return b(view, interfaceC5384i, abstractC4013k);
    }

    public static final AbstractC3550q d(View view) {
        AbstractC3550q abstractC3550qF = f(view);
        if (abstractC3550qF != null) {
            return abstractC3550qF;
        }
        for (ViewParent parent = view.getParent(); abstractC3550qF == null && (parent instanceof View); parent = parent.getParent()) {
            abstractC3550qF = f((View) parent);
        }
        return abstractC3550qF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Li.N e(Context context) {
        Li.N n10;
        Map map = f29185a;
        synchronized (map) {
            try {
                Object objM = map.get(context);
                if (objM == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Ki.g gVarB = Ki.j.b(-1, null, null, 6, null);
                    objM = AbstractC3222i.M(AbstractC3222i.A(new c(contentResolver, uriFor, new d(gVarB, A1.i.a(Looper.getMainLooper())), gVarB, context, null)), Ii.O.b(), J.a.b(Li.J.f11860a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, objM);
                }
                n10 = (Li.N) objM;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n10;
    }

    public static final AbstractC3550q f(View view) {
        Object tag = view.getTag(f0.h.f46606G);
        if (tag instanceof AbstractC3550q) {
            return (AbstractC3550q) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final T.N0 h(View view) {
        if (!view.isAttachedToWindow()) {
            B0.a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewG = g(view);
        AbstractC3550q abstractC3550qF = f(viewG);
        if (abstractC3550qF == null) {
            return I1.f29177a.a(viewG);
        }
        if (abstractC3550qF instanceof T.N0) {
            return (T.N0) abstractC3550qF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, AbstractC3550q abstractC3550q) {
        view.setTag(f0.h.f46606G, abstractC3550q);
    }
}
