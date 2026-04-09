package Nc;

import gg.z;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: Nc.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0591a {

        /* renamed from: Nc.a$a$a, reason: collision with other inner class name */
        public static final class C0592a extends AbstractC0591a {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f16370a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0592a(Throwable throwable) {
                super(null);
                AbstractC6492s.i(throwable, "throwable");
                this.f16370a = throwable;
            }
        }

        /* renamed from: Nc.a$a$b */
        public static final class b extends AbstractC0591a {

            /* renamed from: a, reason: collision with root package name */
            private final String f16371a;

            /* renamed from: b, reason: collision with root package name */
            private final String f16372b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String hostname, String str) {
                super(null);
                AbstractC6492s.i(hostname, "hostname");
                this.f16371a = hostname;
                this.f16372b = str;
            }

            public final String a() {
                return this.f16371a;
            }
        }

        public /* synthetic */ AbstractC0591a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0591a() {
        }
    }

    z a(g gVar, long j10);
}
