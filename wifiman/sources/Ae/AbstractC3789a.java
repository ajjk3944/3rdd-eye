package ae;

import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import h9.C5969a;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: ae.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3789a {

    /* renamed from: ae.a$a, reason: collision with other inner class name */
    public static final class C1001a extends AbstractC3789a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f25962a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25963b;

        /* renamed from: c, reason: collision with root package name */
        private final C5969a f25964c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC6835l f25965d;

        public /* synthetic */ C1001a(UUID uuid, String str, C5969a c5969a, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, c5969a, interfaceC6835l);
        }

        @Override // ae.AbstractC3789a
        public InterfaceC6835l a() {
            return this.f25965d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1001a)) {
                return false;
            }
            C1001a c1001a = (C1001a) obj;
            return b.a.d(this.f25962a, c1001a.f25962a) && e.b.h(this.f25963b, c1001a.f25963b) && AbstractC6492s.d(this.f25964c, c1001a.f25964c);
        }

        public int hashCode() {
            return (((b.a.e(this.f25962a) * 31) + e.b.j(this.f25963b)) * 31) + this.f25964c.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C1001a(UUID ssoAccountId, String consoleId, C5969a deviceMac, InterfaceC6835l intent) {
            super(null);
            AbstractC6492s.i(ssoAccountId, "ssoAccountId");
            AbstractC6492s.i(consoleId, "consoleId");
            AbstractC6492s.i(deviceMac, "deviceMac");
            AbstractC6492s.i(intent, "intent");
            this.f25962a = ssoAccountId;
            this.f25963b = consoleId;
            this.f25964c = deviceMac;
            this.f25965d = intent;
        }
    }

    public /* synthetic */ AbstractC3789a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract InterfaceC6835l a();

    private AbstractC3789a() {
    }
}
