package W8;

import T8.a;
import h9.C5969a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f23691a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23692b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f23693c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f23694d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f23695e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f23696f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f23697g;

    public a(C5969a mac, String str, Integer num, Integer num2, Boolean bool, Map serviceData) {
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(serviceData, "serviceData");
        this.f23691a = mac;
        this.f23692b = str;
        this.f23693c = num;
        this.f23694d = num2;
        this.f23695e = bool;
        this.f23696f = serviceData;
        this.f23697g = serviceData.keySet();
    }

    public Integer a() {
        return this.f23694d;
    }

    public Boolean b() {
        return this.f23695e;
    }

    public C5969a c() {
        return this.f23691a;
    }

    public String d() {
        return this.f23692b;
    }

    public Integer e() {
        return this.f23693c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ui.btle.rxandroidble.discovery.BTLEv2RxAndroidBleDevice");
        a aVar = (a) obj;
        if (!AbstractC6492s.d(c(), aVar.c()) || !AbstractC6492s.d(d(), aVar.d()) || !AbstractC6492s.d(e(), aVar.e()) || !AbstractC6492s.d(a(), aVar.a()) || !AbstractC6492s.d(b(), aVar.b()) || !AbstractC6492s.d(this.f23696f.keySet(), aVar.f23696f.keySet())) {
            return false;
        }
        Iterator it = this.f23696f.keySet().iterator();
        while (it.hasNext()) {
            UUID uuidF = ((a.c) it.next()).f();
            Arrays.equals(aVar.f(uuidF), f(uuidF));
        }
        return true;
    }

    public byte[] f(UUID service) {
        AbstractC6492s.i(service, "service");
        return (byte[]) this.f23696f.get(a.c.a(service));
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return "BTLE Device (RxAndroidBle) " + d() + " [" + c() + "]";
    }
}
