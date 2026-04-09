package L4;

import I4.r;
import Q4.b0;
import android.util.Log;
import androidx.work.s;
import g5.InterfaceC4391a;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes2.dex */
public final class b implements L4.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4053c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4391a<L4.a> f4054a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<L4.a> f4055b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    public static final class a implements f {
    }

    public b(InterfaceC4391a<L4.a> interfaceC4391a) {
        this.f4054a = interfaceC4391a;
        ((r) interfaceC4391a).a(new D7.c(this, 4));
    }

    @Override // L4.a
    public final f a(String str) {
        L4.a aVar = this.f4055b.get();
        return aVar == null ? f4053c : aVar.a(str);
    }

    @Override // L4.a
    public final boolean b() {
        L4.a aVar = this.f4055b.get();
        return aVar != null && aVar.b();
    }

    @Override // L4.a
    public final boolean c(String str) {
        L4.a aVar = this.f4055b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // L4.a
    public final void d(String str, long j4, b0 b0Var) {
        String strD = s.d("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strD, null);
        }
        ((r) this.f4054a).a(new I.e(str, j4, b0Var));
    }
}
