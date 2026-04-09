package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3586a = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final f a(Context context) {
            kotlin.jvm.internal.p.e(context, "context");
            n1.b bVar = n1.b.f23528a;
            if (bVar.a() >= 5) {
                return new n(context);
            }
            if (bVar.a() == 4) {
                return new i(context);
            }
            return null;
        }

        public a() {
        }
    }

    public abstract Object a(b bVar, c9.c cVar);
}
