package fe;

import Yg.J;
import Yg.z;
import android.content.Context;
import android.content.SharedPreferences;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import kg.InterfaceC6468e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f47320b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final gg.s f47321a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f47322a;

        b(String str) {
            this.f47322a = str;
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            String str = (String) sVar.c();
            return AbstractC6492s.d(str, this.f47322a) || AbstractC6492s.d(str, "");
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f47323a;

        c(String str) {
            this.f47323a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            SharedPreferences sharedPreferences = (SharedPreferences) sVar.a();
            return sharedPreferences.contains(this.f47323a) ? new C6556a(Long.valueOf(sharedPreferences.getLong(this.f47323a, -1L))) : new C6556a(null);
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f47324a;

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SharedPreferences f47325a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f47326b;

            public a(SharedPreferences sharedPreferences, InterfaceC6835l interfaceC6835l) {
                this.f47325a = sharedPreferences;
                this.f47326b = interfaceC6835l;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    SharedPreferences.Editor editorEdit = this.f47325a.edit();
                    InterfaceC6835l interfaceC6835l = this.f47326b;
                    AbstractC6492s.f(editorEdit);
                    interfaceC6835l.invoke(editorEdit);
                    if (!editorEdit.commit()) {
                        Z7.b.j("error", new IllegalStateException("failed to commit shared preferences"), null, 4, null);
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        d(InterfaceC6835l interfaceC6835l) {
            this.f47324a = interfaceC6835l;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a((SharedPreferences) sVar.a(), this.f47324a));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    public n(final Context context, final O7.d file) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(file, "file");
        gg.s sVarL1 = gg.s.o(new gg.u() { // from class: fe.j
            @Override // gg.u
            public final void a(gg.t tVar) {
                n.g(context, file, tVar);
            }
        }).M0(Gg.a.d()).o0(Gg.a.a()).x0(1).l1();
        AbstractC6492s.h(sVarL1, "refCount(...)");
        this.f47321a = sVarL1;
    }

    private final gg.s e(gg.s sVar, String str) {
        gg.s sVarN = sVar.N(new b(str));
        AbstractC6492s.h(sVarN, "filter(...)");
        return sVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context context, O7.d dVar, final gg.t emitter) {
        AbstractC6492s.i(emitter, "emitter");
        final SharedPreferences sharedPreferences = context.getSharedPreferences(dVar.getId(), 0);
        final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: fe.k
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                n.h(emitter, sharedPreferences2, str);
            }
        };
        emitter.d(new InterfaceC6468e() { // from class: fe.l
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                n.i(sharedPreferences, onSharedPreferenceChangeListener);
            }
        });
        emitter.h(z.a(sharedPreferences, ""));
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(gg.t tVar, SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            str = "";
        }
        tVar.h(z.a(sharedPreferences, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(Long l10, String str, SharedPreferences.Editor update) {
        AbstractC6492s.i(update, "$this$update");
        if (l10 != null) {
            update.putLong(str, l10.longValue());
        } else {
            update.remove(str);
        }
        return J.f24997a;
    }

    public final gg.i f(String key) {
        AbstractC6492s.i(key, "key");
        gg.i iVarD1 = e(this.f47321a, key).i0(new c(key)).v().d1(EnumC5911a.LATEST);
        AbstractC6492s.h(iVarD1, "toFlowable(...)");
        return iVarD1;
    }

    public final AbstractC5912b j(final String key, final Long l10) {
        AbstractC6492s.i(key, "key");
        return k(new InterfaceC6835l() { // from class: fe.m
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return n.l(l10, key, (SharedPreferences.Editor) obj);
            }
        });
    }

    public final AbstractC5912b k(InterfaceC6835l action) {
        AbstractC6492s.i(action, "action");
        AbstractC5912b abstractC5912bT = this.f47321a.P().t(new d(action));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }
}
