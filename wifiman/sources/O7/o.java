package o7;

import android.content.Context;
import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;
import o7.InterfaceC7096b;
import o7.q;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    private static InterfaceC6137a f55559b;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f55561d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f55562e;

    /* renamed from: f, reason: collision with root package name */
    private static q f55563f;

    /* renamed from: g, reason: collision with root package name */
    private static InterfaceC7096b f55564g;

    /* renamed from: a, reason: collision with root package name */
    public static final o f55558a = new o();

    /* renamed from: c, reason: collision with root package name */
    private static String f55560c = "Discovery LIB";

    private o() {
    }

    public final InterfaceC6137a a() {
        return f55559b;
    }

    public final String b() {
        return f55560c;
    }

    public final InterfaceC7096b c() {
        InterfaceC7096b interfaceC7096b = f55564g;
        if (interfaceC7096b != null) {
            return interfaceC7096b;
        }
        AbstractC6492s.v("services");
        return null;
    }

    public final q d() {
        q qVar = f55563f;
        if (qVar != null) {
            return qVar;
        }
        AbstractC6492s.v("systemInfo");
        return null;
    }

    public final void e(Context context) {
        AbstractC6492s.i(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC6492s.h(applicationContext, "context.applicationContext");
        f(applicationContext);
        q.a aVar = q.f55567a;
        Context applicationContext2 = context.getApplicationContext();
        AbstractC6492s.h(applicationContext2, "context.applicationContext");
        f55563f = aVar.a(applicationContext2);
        InterfaceC7096b.a aVar2 = InterfaceC7096b.f55508a;
        Context applicationContext3 = context.getApplicationContext();
        AbstractC6492s.h(applicationContext3, "context.applicationContext");
        f55564g = aVar2.a(applicationContext3, d());
        f55561d = true;
    }

    public final void f(Context context) {
        AbstractC6492s.i(context, "<set-?>");
        f55562e = context;
    }
}
