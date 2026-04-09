package j8;

import Zg.AbstractC3689v;
import Zg.U;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import fg.AbstractC5824b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import gg.z;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md.C6796a;
import md.InterfaceC6797b;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class c implements InterfaceC6259a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f50158g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f50159h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6797b f50160a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f50161b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f50162c;

    /* renamed from: d, reason: collision with root package name */
    private final i f50163d;

    /* renamed from: e, reason: collision with root package name */
    private final i f50164e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5912b f50165f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50166a;

        static {
            int[] iArr = new int[T7.b.values().length];
            try {
                iArr[T7.b.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T7.b.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T7.b.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50166a = iArr;
        }
    }

    /* renamed from: j8.c$c, reason: collision with other inner class name */
    static final class C1867c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1867c f50167a = new C1867c();

        C1867c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T7.b apply(C6796a it) {
            AbstractC6492s.i(it, "it");
            return it.e();
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50168a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T7.b apply(C6796a it) {
            AbstractC6492s.i(it, "it");
            return it.e();
        }
    }

    static final class e implements InterfaceC6469f {
        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(T7.b daynight) {
            AbstractC6492s.i(daynight, "daynight");
            c.this.f50161b.edit().putString("daynight", c.this.j(daynight)).apply();
        }
    }

    static final class f implements n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f50171a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T7.b f50172b;

            public a(c cVar, T7.b bVar) {
                this.f50171a = cVar;
                this.f50172b = bVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    c cVar = this.f50171a;
                    AbstractC6492s.f(this.f50172b);
                    cVar.l(this.f50172b);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(T7.b daynight) {
            AbstractC6492s.i(daynight, "daynight");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(c.this, daynight));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    public static final class g implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (Build.VERSION.SDK_INT >= 28) {
                    linkedHashSet.add(T7.b.SYSTEM);
                }
                linkedHashSet.add(T7.b.DARK);
                linkedHashSet.add(T7.b.LIGHT);
                interfaceC5910A.onSuccess(linkedHashSet);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public c(Context context, InterfaceC6797b settingsManager) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(settingsManager, "settingsManager");
        this.f50160a = settingsManager;
        SharedPreferences sharedPreferences = context.getSharedPreferences(O7.d.THEME.getId(), 0);
        AbstractC6492s.h(sharedPreferences, "getSharedPreferences(...)");
        this.f50161b = sharedPreferences;
        InterfaceC5826a entries = T7.b.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(j((T7.b) obj), obj);
        }
        this.f50162c = linkedHashMap;
        i iVarI2 = this.f50160a.b().N0(C1867c.f50167a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f50163d = iVarI2;
        z zVarI = z.i(new g());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        i iVarI22 = zVarI.W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f50164e = iVarI22;
        AbstractC5912b abstractC5912bT0 = this.f50160a.b().N0(d.f50168a).W().f0(new e()).X0(AbstractC5824b.g()).t0(new f());
        AbstractC6492s.h(abstractC5912bT0, "flatMapCompletable(...)");
        this.f50165f = abstractC5912bT0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(T7.b bVar) {
        int i10 = b.f50166a[bVar.ordinal()];
        if (i10 == 1) {
            return "light";
        }
        if (i10 == 2) {
            return "dark";
        }
        if (i10 == 3) {
            return "system";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6796a k(T7.b bVar, C6796a it) {
        AbstractC6492s.i(it, "it");
        return C6796a.b(it, bVar, null, false, false, false, false, false, 126, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(T7.b bVar) {
        int i10 = b.f50166a[bVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = -1;
            }
        }
        androidx.appcompat.app.f.M(i11);
    }

    @Override // j8.InterfaceC6259a
    public i a() {
        return this.f50164e;
    }

    @Override // j8.InterfaceC6259a
    public void b() {
        l(i());
    }

    @Override // j8.InterfaceC6259a
    public AbstractC5912b c() {
        return this.f50165f;
    }

    @Override // j8.InterfaceC6259a
    public AbstractC5912b d(final T7.b dayNight) {
        AbstractC6492s.i(dayNight, "dayNight");
        return this.f50160a.a(new InterfaceC6835l() { // from class: j8.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return c.k(dayNight, (C6796a) obj);
            }
        });
    }

    public T7.b i() {
        T7.b bVar;
        String string = this.f50161b.getString("daynight", null);
        return (string == null || (bVar = (T7.b) this.f50162c.get(string)) == null) ? this.f50160a.c().e() : bVar;
    }
}
