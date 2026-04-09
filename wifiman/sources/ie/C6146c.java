package ie;

import ie.C6146c;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ie.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6146c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f49145e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final S8.e f49146a;

    /* renamed from: b, reason: collision with root package name */
    private final double f49147b;

    /* renamed from: c, reason: collision with root package name */
    private final double f49148c;

    /* renamed from: d, reason: collision with root package name */
    private final S8.f f49149d;

    /* renamed from: ie.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int c(C6146c c6146c, C6146c c6146c2) {
            return AbstractC6492s.k(c6146c.a().d(), c6146c2.a().d());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(C6146c c6146c, C6146c c6146c2) {
            return c6146c2.b().compareTo(c6146c.b());
        }

        public final Comparator e() {
            return new Comparator() { // from class: ie.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C6146c.a.c((C6146c) obj, (C6146c) obj2);
                }
            };
        }

        public final Comparator f() {
            return new Comparator() { // from class: ie.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C6146c.a.d((C6146c) obj, (C6146c) obj2);
                }
            };
        }

        private a() {
        }
    }

    public C6146c(S8.e channel, double d10, double d11) {
        AbstractC6492s.i(channel, "channel");
        this.f49146a = channel;
        this.f49147b = d10;
        this.f49148c = d11;
        this.f49149d = new S8.f(d11 / d10);
    }

    public final S8.e a() {
        return this.f49146a;
    }

    public final S8.f b() {
        return this.f49149d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6146c)) {
            return false;
        }
        C6146c c6146c = (C6146c) obj;
        return AbstractC6492s.d(this.f49146a, c6146c.f49146a) && Double.compare(this.f49147b, c6146c.f49147b) == 0 && Double.compare(this.f49148c, c6146c.f49148c) == 0;
    }

    public int hashCode() {
        return (((this.f49146a.hashCode() * 31) + Double.hashCode(this.f49147b)) * 31) + Double.hashCode(this.f49148c);
    }

    public String toString() {
        return "WifiChannelEnvironment(channel=" + this.f49146a + ", maxCapacity=" + this.f49147b + ", capacity=" + this.f49148c + ")";
    }
}
