package Sh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC6598A;

/* loaded from: classes4.dex */
public interface v extends InterfaceC6598A {

    public static abstract class a {

        /* renamed from: Sh.v$a$a, reason: collision with other inner class name */
        public static final class C0766a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final x f20808a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f20809b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0766a(x kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                AbstractC6492s.i(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f20808a = kotlinJvmBinaryClass;
                this.f20809b = bArr;
            }

            public final x b() {
                return this.f20808a;
            }

            public /* synthetic */ C0766a(x xVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(xVar, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            C0766a c0766a = this instanceof C0766a ? (C0766a) this : null;
            if (c0766a != null) {
                return c0766a.b();
            }
            return null;
        }

        private a() {
        }
    }

    a a(Zh.b bVar, Yh.e eVar);

    a b(Qh.g gVar, Yh.e eVar);
}
