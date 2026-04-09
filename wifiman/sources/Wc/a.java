package Wc;

import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0895a f23857c = new C0895a(null);

    /* renamed from: a, reason: collision with root package name */
    private final g f23858a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23859b;

    /* renamed from: Wc.a$a, reason: collision with other inner class name */
    public static final class C0895a {
        public /* synthetic */ C0895a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:
        
            if (r4 < 65) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        
            return new Wc.a(r3, r4, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
        
            if (r4 < 33) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final Wc.a b(inet.ipaddr.g r3, int r4) {
            /*
                r2 = this;
                boolean r0 = r3 instanceof inet.ipaddr.ipv4.C6180b
                if (r0 == 0) goto Lb
                if (r4 < 0) goto L1c
                r0 = 33
                if (r4 >= r0) goto L1c
                goto L15
            Lb:
                boolean r0 = r3 instanceof inet.ipaddr.ipv6.C6205b
                if (r0 == 0) goto L33
                if (r4 < 0) goto L1c
                r0 = 65
                if (r4 >= r0) goto L1c
            L15:
                Wc.a r0 = new Wc.a
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
            L1c:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid mask "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
            L33:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Unsupported IP type"
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Wc.a.C0895a.b(inet.ipaddr.g, int):Wc.a");
        }

        public final a a(g ip, int i10) {
            AbstractC6492s.i(ip, "ip");
            try {
                return b(ip, i10);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private C0895a() {
        }
    }

    public /* synthetic */ a(g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, i10);
    }

    public final g a() {
        return this.f23858a;
    }

    public final int b() {
        return this.f23859b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (AbstractC6492s.d(this.f23858a, aVar.f23858a) && this.f23859b == aVar.f23859b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f23858a.hashCode() * this.f23859b;
    }

    public String toString() {
        return this.f23858a + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.f23859b;
    }

    private a(g gVar, int i10) {
        this.f23858a = gVar;
        this.f23859b = i10;
    }
}
