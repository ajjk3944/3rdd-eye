package o5;

import a3.AbstractC3755c;
import a3.C3754b;
import a3.InterfaceC3759g;
import android.util.Log;
import f5.InterfaceC5536b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;

/* renamed from: o5.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7086g implements InterfaceC7087h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f55420b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5536b f55421a;

    /* renamed from: o5.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7086g(InterfaceC5536b transportFactoryProvider) {
        AbstractC6492s.i(transportFactoryProvider, "transportFactoryProvider");
        this.f55421a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(z zVar) {
        String strB = C7076A.f55320a.c().b(zVar);
        AbstractC6492s.h(strB, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event Type: " + zVar.b().name());
        byte[] bytes = strB.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // o5.InterfaceC7087h
    public void a(z sessionEvent) {
        AbstractC6492s.i(sessionEvent, "sessionEvent");
        ((a3.i) this.f55421a.get()).a("FIREBASE_APPQUALITY_SESSION", z.class, C3754b.b("json"), new InterfaceC3759g() { // from class: o5.f
            @Override // a3.InterfaceC3759g
            public final Object apply(Object obj) {
                return this.f55419a.c((z) obj);
            }
        }).b(AbstractC3755c.f(sessionEvent));
    }
}
