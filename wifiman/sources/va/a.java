package Va;

import Ii.C3048c0;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface a extends Ta.a, Qa.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0864a f23290a = C0864a.f23291a;

    /* renamed from: Va.a$a, reason: collision with other inner class name */
    public static final class C0864a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0864a f23291a = new C0864a();

        /* renamed from: b, reason: collision with root package name */
        private static b f23292b;

        private C0864a() {
        }

        public final a a(Context context) {
            AbstractC6492s.i(context, "context");
            synchronized (this) {
                b bVar = f23292b;
                if (bVar != null) {
                    AbstractC6492s.f(bVar);
                    return bVar;
                }
                b bVar2 = new b(context, C3048c0.b());
                f23292b = bVar2;
                AbstractC6492s.f(bVar2);
                return bVar2;
            }
        }
    }
}
