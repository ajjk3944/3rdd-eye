package androidx.compose.ui.platform;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.r;
import c0.AbstractC4181j;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.util.SnmpConfigurator;
import q2.InterfaceC7418f;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0019¨\u00060²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/r;", "owner", "Lkotlin/Function0;", "LYg/J;", "content", SnmpConfigurator.O_AUTH_PROTOCOL, "(Landroidx/compose/ui/platform/r;Lmh/p;LT/l;I)V", "Landroid/content/Context;", "context", "LH0/d;", SnmpConfigurator.O_CONTEXT_NAME, "(Landroid/content/Context;LT/l;I)LH0/d;", "Landroid/content/res/Configuration;", "configuration", "LH0/b;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;LT/l;I)LH0/b;", "", "name", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "LT/H0;", "LT/H0;", "f", "()LT/H0;", "LocalConfiguration", SnmpConfigurator.O_BIND_ADDRESS, "g", "LocalContext", SnmpConfigurator.O_COMMUNITY, "h", "LocalImageVectorCache", "d", "i", "LocalResourceIdCache", "Lq2/f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "Landroidx/lifecycle/o;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    private static final T.H0 f29099a = AbstractC3561w.d(null, a.f29105a, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final T.H0 f29100b = AbstractC3561w.f(b.f29106a);

    /* renamed from: c, reason: collision with root package name */
    private static final T.H0 f29101c = AbstractC3561w.f(c.f29107a);

    /* renamed from: d, reason: collision with root package name */
    private static final T.H0 f29102d = AbstractC3561w.f(d.f29108a);

    /* renamed from: e, reason: collision with root package name */
    private static final T.H0 f29103e = AbstractC3561w.f(e.f29109a);

    /* renamed from: f, reason: collision with root package name */
    private static final T.H0 f29104f = AbstractC3561w.f(f.f29110a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29105a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29106a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f29107a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0.b invoke() {
            AndroidCompositionLocals_androidKt.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f29108a = new d();

        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0.d invoke() {
            AndroidCompositionLocals_androidKt.l("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f29109a = new e();

        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7418f invoke() {
            AndroidCompositionLocals_androidKt.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f29110a = new f();

        f() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f29111a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC3551q0 interfaceC3551q0) {
            super(1);
            this.f29111a = interfaceC3551q0;
        }

        public final void a(Configuration configuration) {
            AndroidCompositionLocals_androidKt.c(this.f29111a, new Configuration(configuration));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return Yg.J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3943o0 f29112a;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3943o0 f29113a;

            public a(C3943o0 c3943o0) {
                this.f29113a = c3943o0;
            }

            @Override // T.K
            public void dispose() {
                this.f29113a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3943o0 c3943o0) {
            super(1);
            this.f29112a = c3943o0;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            return new a(this.f29112a);
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f29114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U f29115b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(r rVar, U u10, InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f29114a = rVar;
            this.f29115b = u10;
            this.f29116c = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1471621628, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
            }
            AbstractC3932k0.a(this.f29114a, this.f29115b, this.f29116c, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f29117a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29118b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29119c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(r rVar, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f29117a = rVar;
            this.f29118b = interfaceC6839p;
            this.f29119c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AndroidCompositionLocals_androidKt.a(this.f29117a, this.f29118b, interfaceC3540l, T.L0.a(this.f29119c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f29120a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f29121b;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f29122a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f29123b;

            public a(Context context, l lVar) {
                this.f29122a = context;
                this.f29123b = lVar;
            }

            @Override // T.K
            public void dispose() {
                this.f29122a.getApplicationContext().unregisterComponentCallbacks(this.f29123b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f29120a = context;
            this.f29121b = lVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            this.f29120a.getApplicationContext().registerComponentCallbacks(this.f29121b);
            return new a(this.f29120a, this.f29121b);
        }
    }

    public static final class l implements ComponentCallbacks2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Configuration f29124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H0.b f29125b;

        l(Configuration configuration, H0.b bVar) {
            this.f29124a = configuration;
            this.f29125b = bVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f29125b.c(this.f29124a.updateFrom(configuration));
            this.f29124a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f29125b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f29125b.a();
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f29126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f29127b;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f29128a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f29129b;

            public a(Context context, n nVar) {
                this.f29128a = context;
                this.f29129b = nVar;
            }

            @Override // T.K
            public void dispose() {
                this.f29128a.getApplicationContext().unregisterComponentCallbacks(this.f29129b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f29126a = context;
            this.f29127b = nVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            this.f29126a.getApplicationContext().registerComponentCallbacks(this.f29127b);
            return new a(this.f29126a, this.f29127b);
        }
    }

    public static final class n implements ComponentCallbacks2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H0.d f29130a;

        n(H0.d dVar) {
            this.f29130a = dVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f29130a.a();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f29130a.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f29130a.a();
        }
    }

    public static final void a(r rVar, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1396852028);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1396852028, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = rVar.getContext();
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = T.t1.d(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                interfaceC3540lR.K(objF);
            }
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new g(interfaceC3551q0);
                interfaceC3540lR.K(objF2);
            }
            rVar.setConfigurationChangeObserver((InterfaceC6835l) objF2);
            Object objF3 = interfaceC3540lR.f();
            if (objF3 == aVar.a()) {
                objF3 = new U(context);
                interfaceC3540lR.K(objF3);
            }
            U u10 = (U) objF3;
            r.b viewTreeOwners = rVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objF4 = interfaceC3540lR.f();
            if (objF4 == aVar.a()) {
                objF4 = AbstractC3947q0.b(rVar, viewTreeOwners.b());
                interfaceC3540lR.K(objF4);
            }
            C3943o0 c3943o0 = (C3943o0) objF4;
            Yg.J j10 = Yg.J.f24997a;
            boolean zL = interfaceC3540lR.l(c3943o0);
            Object objF5 = interfaceC3540lR.f();
            if (zL || objF5 == aVar.a()) {
                objF5 = new h(c3943o0);
                interfaceC3540lR.K(objF5);
            }
            T.O.c(j10, (InterfaceC6835l) objF5, interfaceC3540lR, 6);
            AbstractC3561w.b(new T.I0[]{f29099a.d(b(interfaceC3551q0)), f29100b.d(context), Z1.a.a().d(viewTreeOwners.a()), f29103e.d(viewTreeOwners.b()), AbstractC4181j.d().d(c3943o0), f29104f.d(rVar.getView()), f29101c.d(m(context, b(interfaceC3551q0), interfaceC3540lR, 0)), f29102d.d(n(context, interfaceC3540lR, 0)), AbstractC3932k0.o().d(Boolean.valueOf(((Boolean) interfaceC3540lR.t(AbstractC3932k0.p())).booleanValue() | rVar.getScrollCaptureInProgress$ui_release()))}, b0.c.e(1471621628, true, new i(rVar, u10, interfaceC6839p), interfaceC3540lR, 54), interfaceC3540lR, T.I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new j(rVar, interfaceC6839p, i10));
        }
    }

    private static final Configuration b(InterfaceC3551q0 interfaceC3551q0) {
        return (Configuration) interfaceC3551q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC3551q0 interfaceC3551q0, Configuration configuration) {
        interfaceC3551q0.setValue(configuration);
    }

    public static final T.H0 f() {
        return f29099a;
    }

    public static final T.H0 g() {
        return f29100b;
    }

    public static final T.H0 getLocalLifecycleOwner() {
        return Z1.a.a();
    }

    public static final T.H0 h() {
        return f29101c;
    }

    public static final T.H0 i() {
        return f29102d;
    }

    public static final T.H0 j() {
        return f29103e;
    }

    public static final T.H0 k() {
        return f29104f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final H0.b m(Context context, Configuration configuration, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = new H0.b();
            interfaceC3540l.K(objF);
        }
        H0.b bVar = (H0.b) objF;
        Object objF2 = interfaceC3540l.f();
        Object obj = objF2;
        if (objF2 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            interfaceC3540l.K(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objF3 = interfaceC3540l.f();
        if (objF3 == aVar.a()) {
            objF3 = new l(configuration3, bVar);
            interfaceC3540l.K(objF3);
        }
        l lVar = (l) objF3;
        boolean zL = interfaceC3540l.l(context);
        Object objF4 = interfaceC3540l.f();
        if (zL || objF4 == aVar.a()) {
            objF4 = new k(context, lVar);
            interfaceC3540l.K(objF4);
        }
        T.O.c(bVar, (InterfaceC6835l) objF4, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return bVar;
    }

    private static final H0.d n(Context context, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = new H0.d();
            interfaceC3540l.K(objF);
        }
        H0.d dVar = (H0.d) objF;
        Object objF2 = interfaceC3540l.f();
        if (objF2 == aVar.a()) {
            objF2 = new n(dVar);
            interfaceC3540l.K(objF2);
        }
        n nVar = (n) objF2;
        boolean zL = interfaceC3540l.l(context);
        Object objF3 = interfaceC3540l.f();
        if (zL || objF3 == aVar.a()) {
            objF3 = new m(context, nVar);
            interfaceC3540l.K(objF3);
        }
        T.O.c(dVar, (InterfaceC6835l) objF3, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return dVar;
    }
}
