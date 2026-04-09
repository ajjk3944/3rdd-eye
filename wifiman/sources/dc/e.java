package Dc;

import Ec.t;
import Zg.d0;
import android.os.Build;
import gg.AbstractC5912b;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3185a = a.f3186a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3186a = new a();

        private a() {
        }

        public final Set a() {
            Set setB = d0.b();
            setB.add(t.c.ICMP);
            if (Build.VERSION.SDK_INT < 33) {
                setB.add(t.c.ARP);
            }
            setB.add(t.c.UPNP);
            setB.add(t.c.BONJOUR);
            setB.add(t.c.MYSELF);
            setB.add(t.c.GATEWAY);
            setB.add(t.c.AP);
            setB.add(t.c.MIKROTIK);
            setB.add(t.c.UNIFI);
            setB.add(t.c.UBNT);
            setB.add(t.c.UBNT_TCP_SPEEDTEST);
            setB.add(t.c.UBNT_HTTP_SPEEDTEST);
            setB.add(t.c.SNMP);
            setB.add(t.c.NETBIOS);
            setB.add(t.c.HOSTNAME);
            return d0.a(setB);
        }
    }

    public static abstract class b {

        public static abstract class a extends b {

            /* renamed from: Dc.e$b$a$a, reason: collision with other inner class name */
            public static final class C0153a extends a {

                /* renamed from: a, reason: collision with root package name */
                private final int f3187a;

                /* renamed from: b, reason: collision with root package name */
                private final float f3188b;

                public C0153a(int i10) {
                    super(null);
                    this.f3187a = i10;
                    this.f3188b = 1.0f;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0153a) && this.f3187a == ((C0153a) obj).f3187a;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f3187a);
                }

                public String toString() {
                    return "Finished(discoveredCount=" + this.f3187a + ")";
                }
            }

            /* renamed from: Dc.e$b$a$b, reason: collision with other inner class name */
            public static final class C0154b extends a {

                /* renamed from: a, reason: collision with root package name */
                private final float f3189a;

                /* renamed from: b, reason: collision with root package name */
                private final int f3190b;

                public C0154b(float f10, int i10) {
                    super(null);
                    this.f3189a = f10;
                    this.f3190b = i10;
                }

                public float a() {
                    return this.f3189a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0154b)) {
                        return false;
                    }
                    C0154b c0154b = (C0154b) obj;
                    return Float.compare(this.f3189a, c0154b.f3189a) == 0 && this.f3190b == c0154b.f3190b;
                }

                public int hashCode() {
                    return (Float.hashCode(this.f3189a) * 31) + Integer.hashCode(this.f3190b);
                }

                public String toString() {
                    return "InProgress(progressRatio=" + this.f3189a + ", discoveredCount=" + this.f3190b + ")";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    gg.i a();

    gg.i b();

    AbstractC5912b c();

    AbstractC5912b clear();
}
