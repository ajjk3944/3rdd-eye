package Wa;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final Object f23760a;

        public a(Object obj) {
            super(null);
            this.f23760a = obj;
        }

        public final Object a() {
            return this.f23760a;
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f23761a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable error) {
            super(null);
            AbstractC6492s.i(error, "error");
            this.f23761a = error;
        }

        public final Throwable a() {
            return this.f23761a;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
