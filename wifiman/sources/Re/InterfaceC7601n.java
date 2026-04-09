package re;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import re.InterfaceC7588a;

/* renamed from: re.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7601n {

    /* renamed from: re.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC7588a.C2110a f60383a;

        /* renamed from: b, reason: collision with root package name */
        private final List f60384b;

        public a(InterfaceC7588a.C2110a ap, List signal) {
            AbstractC6492s.i(ap, "ap");
            AbstractC6492s.i(signal, "signal");
            this.f60383a = ap;
            this.f60384b = signal;
        }

        public final InterfaceC7588a.C2110a a() {
            return this.f60383a;
        }

        public final List b() {
            return this.f60384b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f60383a, aVar.f60383a) && AbstractC6492s.d(this.f60384b, aVar.f60384b);
        }

        public int hashCode() {
            return (this.f60383a.hashCode() * 31) + this.f60384b.hashCode();
        }

        public String toString() {
            return "Record(ap=" + this.f60383a + ", signal=" + this.f60384b + ")";
        }
    }

    gg.i c();
}
