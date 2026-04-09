package o7;

import android.net.Network;
import java.io.IOException;
import java.net.DatagramSocket;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7095a {

    /* renamed from: o7.a$a, reason: collision with other inner class name */
    public static final class C2004a extends AbstractC7095a {

        /* renamed from: a, reason: collision with root package name */
        private final Network f55505a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2004a(Network network) {
            super(null);
            AbstractC6492s.i(network, "network");
            this.f55505a = network;
        }

        public final void a(DatagramSocket socket) throws IOException {
            AbstractC6492s.i(socket, "socket");
            this.f55505a.bindSocket(socket);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2004a) && AbstractC6492s.d(this.f55505a, ((C2004a) obj).f55505a);
        }

        public int hashCode() {
            return this.f55505a.hashCode();
        }

        public String toString() {
            return "Connected(network=" + this.f55505a + ")";
        }
    }

    /* renamed from: o7.a$b */
    public static final class b extends AbstractC7095a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f55506a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o7.a$c */
    public static final class c extends AbstractC7095a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f55507a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC7095a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC7095a() {
    }
}
