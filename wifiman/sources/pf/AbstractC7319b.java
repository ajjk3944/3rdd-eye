package pf;

import Li.InterfaceC3220g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q9.InterfaceC7443i;
import ze.AbstractC8735d;

/* renamed from: pf.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7319b extends AbstractC8735d implements InterfaceC7443i {

    /* renamed from: pf.b$a */
    public static abstract class a {

        /* renamed from: pf.b$a$a, reason: collision with other inner class name */
        public static final class C2037a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f57884a;

            /* renamed from: b, reason: collision with root package name */
            private final int f57885b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2037a(String username, int i10) {
                super(null);
                AbstractC6492s.i(username, "username");
                this.f57884a = username;
                this.f57885b = i10;
            }

            public final int a() {
                return this.f57885b;
            }

            public final String b() {
                return this.f57884a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2037a)) {
                    return false;
                }
                C2037a c2037a = (C2037a) obj;
                return AbstractC6492s.d(this.f57884a, c2037a.f57884a) && this.f57885b == c2037a.f57885b;
            }

            public int hashCode() {
                return (this.f57884a.hashCode() * 31) + Integer.hashCode(this.f57885b);
            }

            public String toString() {
                return "ShowAccountRemovalDialog(username=" + this.f57884a + ", accountId=" + this.f57885b + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public abstract InterfaceC3220g b();

    public abstract void n0(a.C2037a c2037a);
}
