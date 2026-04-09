package Yg;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
final class w implements m, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f25020d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25021e = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, SnmpConfigurator.O_BIND_ADDRESS);

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC6824a f25022a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f25023b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f25024c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w(InterfaceC6824a initializer) {
        AbstractC6492s.i(initializer, "initializer");
        this.f25022a = initializer;
        G g10 = G.f24991a;
        this.f25023b = g10;
        this.f25024c = g10;
    }

    @Override // Yg.m
    public Object getValue() {
        Object obj = this.f25023b;
        G g10 = G.f24991a;
        if (obj != g10) {
            return obj;
        }
        InterfaceC6824a interfaceC6824a = this.f25022a;
        if (interfaceC6824a != null) {
            Object objInvoke = interfaceC6824a.invoke();
            if (androidx.concurrent.futures.b.a(f25021e, this, g10, objInvoke)) {
                this.f25022a = null;
                return objInvoke;
            }
        }
        return this.f25023b;
    }

    @Override // Yg.m
    public boolean m() {
        return this.f25023b != G.f24991a;
    }

    public String toString() {
        return m() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
