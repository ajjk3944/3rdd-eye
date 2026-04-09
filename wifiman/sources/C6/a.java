package C6;

import g6.InterfaceC5865a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x6.InterfaceC8423a;

/* loaded from: classes3.dex */
public interface a extends InterfaceC5865a {

    /* renamed from: C6.a$a, reason: collision with other inner class name */
    public static final class C0081a {

        /* renamed from: a, reason: collision with root package name */
        private final long f2245a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC8423a f2246b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2247c;

        public /* synthetic */ C0081a(long j10, InterfaceC8423a interfaceC8423a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, interfaceC8423a, i10);
        }

        public final InterfaceC8423a a() {
            return this.f2246b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0081a)) {
                return false;
            }
            C0081a c0081a = (C0081a) obj;
            return D6.a.f(this.f2245a, c0081a.f2245a) && AbstractC6492s.d(this.f2246b, c0081a.f2246b) && this.f2247c == c0081a.f2247c;
        }

        public int hashCode() {
            return (((D6.a.i(this.f2245a) * 31) + this.f2246b.hashCode()) * 31) + Integer.hashCode(this.f2247c);
        }

        public String toString() {
            return "EntryModel(location=" + ((Object) D6.a.j(this.f2245a)) + ", entry=" + this.f2246b + ", color=" + this.f2247c + ')';
        }

        private C0081a(long j10, InterfaceC8423a interfaceC8423a, int i10) {
            this.f2245a = j10;
            this.f2246b = interfaceC8423a;
            this.f2247c = i10;
        }
    }
}
