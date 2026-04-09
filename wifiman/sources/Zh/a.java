package Zh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0977a f25393f = new C0977a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final f f25394g;

    /* renamed from: h, reason: collision with root package name */
    private static final c f25395h;

    /* renamed from: a, reason: collision with root package name */
    private final c f25396a;

    /* renamed from: b, reason: collision with root package name */
    private final c f25397b;

    /* renamed from: c, reason: collision with root package name */
    private final f f25398c;

    /* renamed from: d, reason: collision with root package name */
    private final b f25399d;

    /* renamed from: e, reason: collision with root package name */
    private final c f25400e;

    /* renamed from: Zh.a$a, reason: collision with other inner class name */
    public static final class C0977a {
        public /* synthetic */ C0977a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0977a() {
        }
    }

    static {
        f fVar = h.f25433m;
        f25394g = fVar;
        c cVarK = c.k(fVar);
        AbstractC6492s.h(cVarK, "topLevel(...)");
        f25395h = cVarK;
    }

    private a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f25396a = cVar;
        this.f25397b = cVar2;
        this.f25398c = fVar;
        this.f25399d = bVar;
        this.f25400e = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (AbstractC6492s.d(this.f25396a, aVar.f25396a) && AbstractC6492s.d(this.f25397b, aVar.f25397b) && AbstractC6492s.d(this.f25398c, aVar.f25398c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f25396a.hashCode()) * 31;
        c cVar = this.f25397b;
        return ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f25398c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strB = this.f25396a.b();
        AbstractC6492s.h(strB, "asString(...)");
        sb2.append(t.K(strB, '.', '/', false, 4, null));
        sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        c cVar = this.f25397b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f25398c);
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c packageName, f callableName) {
        this(packageName, null, callableName, null, null);
        AbstractC6492s.i(packageName, "packageName");
        AbstractC6492s.i(callableName, "callableName");
    }
}
