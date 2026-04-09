package P7;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class h implements P7.a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f18195b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseAnalytics f18196a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P7.c f18198b;

        public b(P7.c cVar) {
            this.f18198b = cVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                h.this.f18196a.a(this.f18198b.b(), this.f18198b.a());
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class c implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18200b;

        public c(String str) {
            this.f18200b = str;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                h.this.f18196a.b(this.f18200b);
                h.this.f18196a.c("id", this.f18200b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public h(FirebaseAnalytics analytics) {
        AbstractC6492s.i(analytics, "analytics");
        this.f18196a = analytics;
    }

    @Override // P7.a
    public AbstractC5912b a(String userId) {
        AbstractC6492s.i(userId, "userId");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new c(userId));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // P7.a
    public void b(P7.c event) {
        AbstractC6492s.i(event, "event");
        this.f18196a.a(event.b(), event.a());
    }

    @Override // P7.a
    public void c(P7.b screen, String str) {
        AbstractC6492s.i(screen, "screen");
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", screen.getScreenName());
        if (str != null) {
            bundle.putString("screen_class", str);
        }
        this.f18196a.a("screen_view", bundle);
    }

    @Override // P7.a
    public AbstractC5912b d(P7.c event) {
        AbstractC6492s.i(event, "event");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(event));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }
}
