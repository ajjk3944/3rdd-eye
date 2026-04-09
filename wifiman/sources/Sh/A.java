package Sh;

import Xh.a;
import Yh.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class A {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20700b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f20701a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(String name, String desc) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(desc, "desc");
            return new A(name + '#' + desc, null);
        }

        public final A b(Yh.d signature) {
            AbstractC6492s.i(signature, "signature");
            if (signature instanceof d.b) {
                d.b bVar = (d.b) signature;
                return d(bVar.e(), bVar.d());
            }
            if (!(signature instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d.a aVar = (d.a) signature;
            return a(aVar.e(), aVar.d());
        }

        public final A c(Wh.c nameResolver, a.c signature) {
            AbstractC6492s.i(nameResolver, "nameResolver");
            AbstractC6492s.i(signature, "signature");
            return d(nameResolver.getString(signature.S()), nameResolver.getString(signature.P()));
        }

        public final A d(String name, String desc) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(desc, "desc");
            return new A(name + desc, null);
        }

        public final A e(A signature, int i10) {
            AbstractC6492s.i(signature, "signature");
            return new A(signature.a() + '@' + i10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f20701a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && AbstractC6492s.d(this.f20701a, ((A) obj).f20701a);
    }

    public int hashCode() {
        return this.f20701a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f20701a + ')';
    }

    private A(String str) {
        this.f20701a = str;
    }
}
