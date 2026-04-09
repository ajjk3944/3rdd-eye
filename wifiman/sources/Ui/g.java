package ui;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f63080a;

    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final a f63081b = new a();

        private a() {
            super(false, null);
        }
    }

    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final String f63082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String error) {
            super(false, null);
            AbstractC6492s.i(error, "error");
            this.f63082b = error;
        }
    }

    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final c f63083b = new c();

        private c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f63080a;
    }

    private g(boolean z10) {
        this.f63080a = z10;
    }
}
