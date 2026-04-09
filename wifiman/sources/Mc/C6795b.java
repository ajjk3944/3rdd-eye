package mc;

import Cc.AbstractC2558b;
import Ii.N;
import Yg.J;
import Yg.v;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import com.ui.sso.api.UiAccountApi;
import com.ui.wifiman.model.vendor.d;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.D;
import gg.z;
import java.util.Locale;
import jc.AbstractC6266c;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.AbstractC6507a;
import ld.C6574a;
import ld.InterfaceC6575b;
import mh.InterfaceC6839p;

/* renamed from: mc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6795b implements InterfaceC6794a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f53947a;

    /* renamed from: b, reason: collision with root package name */
    private final d.b f53948b;

    /* renamed from: c, reason: collision with root package name */
    private final Nd.c f53949c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2558b f53950d;

    /* renamed from: e, reason: collision with root package name */
    private final z f53951e;

    /* renamed from: mc.b$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53952a = new a();

        /* renamed from: mc.b$a$a, reason: collision with other inner class name */
        static final class C1957a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f53953a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UiAccountApi f53954b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1957a(UiAccountApi uiAccountApi, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f53954b = uiAccountApi;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1957a(this.f53954b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f53953a;
                if (i10 == 0) {
                    v.b(obj);
                    UiAccountApi uiAccountApi = this.f53954b;
                    this.f53953a = 1;
                    obj = uiAccountApi.h(this);
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
                return ((C1957a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(UiAccountApi it) {
            AbstractC6492s.i(it, "it");
            return Qi.l.c(null, new C1957a(it, null), 1, null);
        }
    }

    /* renamed from: mc.b$b, reason: collision with other inner class name */
    static final class C1958b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1958b f53955a = new C1958b();

        C1958b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(Ta.c it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    /* renamed from: mc.b$c */
    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f53956a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Failed to obtain device identifiers", it, null, 4, null);
        }
    }

    /* renamed from: mc.b$d */
    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6575b f53957a;

        /* renamed from: mc.b$d$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53958a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String apply(C6574a it) {
                AbstractC6492s.i(it, "it");
                return it.a();
            }
        }

        d(InterfaceC6575b interfaceC6575b) {
            this.f53957a = interfaceC6575b;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return this.f53957a.a().o0().A(a.f53958a);
        }
    }

    public C6795b(Resources resources, Context applicationContext, d.b vendorManager, InterfaceC6575b sessionManager, Nd.c uiAccountApiService) {
        AbstractC6492s.i(resources, "resources");
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(vendorManager, "vendorManager");
        AbstractC6492s.i(sessionManager, "sessionManager");
        AbstractC6492s.i(uiAccountApiService, "uiAccountApiService");
        this.f53947a = applicationContext;
        this.f53948b = vendorManager;
        this.f53949c = uiAccountApiService;
        this.f53950d = resources.getBoolean(AbstractC6266c.f50224a) ? AbstractC2558b.a.C0119b.f2481b : AbstractC2558b.a.C0118a.f2480b;
        z zVarE = uiAccountApiService.c().o0().s(a.f53952a).A(C1958b.f53955a).m(c.f53956a).F(new d(sessionManager)).e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f53951e = zVarE;
    }

    @Override // mc.InterfaceC6794a
    public String a() {
        return "Android " + Build.VERSION.RELEASE;
    }

    @Override // mc.InterfaceC6794a
    public String b() {
        return Build.BRAND + " " + Build.MODEL;
    }

    @Override // mc.InterfaceC6794a
    public com.ui.wifiman.model.vendor.d c() {
        String strValueOf;
        d.b bVar = this.f53948b;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC6492s.h(MANUFACTURER, "MANUFACTURER");
        if (MANUFACTURER.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char cCharAt = MANUFACTURER.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                Locale locale = Locale.getDefault();
                AbstractC6492s.h(locale, "getDefault(...)");
                strValueOf = AbstractC6507a.d(cCharAt, locale);
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb2.append((Object) strValueOf);
            String strSubstring = MANUFACTURER.substring(1);
            AbstractC6492s.h(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            MANUFACTURER = sb2.toString();
        }
        return bVar.b(MANUFACTURER);
    }

    @Override // mc.InterfaceC6794a
    public AbstractC2558b d() {
        return this.f53950d;
    }

    @Override // mc.InterfaceC6794a
    public long e() {
        return SystemClock.uptimeMillis();
    }

    @Override // mc.InterfaceC6794a
    public z getId() {
        return this.f53951e;
    }

    @Override // mc.InterfaceC6794a
    public String getName() {
        try {
            String string = Settings.Global.getString(this.f53947a.getContentResolver(), "device_name");
            return string != null ? string : BluetoothAdapter.getDefaultAdapter().getName();
        } catch (Throwable th2) {
            Z7.b.j("failed to get device name", th2, null, 4, null);
            return null;
        }
    }
}
