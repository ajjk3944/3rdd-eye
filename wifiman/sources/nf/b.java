package nf;

import ff.EnumC5820a;
import hf.C6036h;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f54638c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f54639a;

    /* renamed from: b, reason: collision with root package name */
    private final C6036h f54640b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return new b(false, new C6036h(EnumC5820a.DOWN, new float[]{0.0f, 0.0f}));
        }

        private a() {
        }
    }

    public b(boolean z10, C6036h model) {
        AbstractC6492s.i(model, "model");
        this.f54639a = z10;
        this.f54640b = model;
    }

    public final C6036h a() {
        return this.f54640b;
    }

    public final boolean b() {
        return this.f54639a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f54639a == bVar.f54639a && AbstractC6492s.d(this.f54640b, bVar.f54640b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f54639a) * 31) + this.f54640b.hashCode();
    }

    public String toString() {
        return "AnimatedChartModel(visible=" + this.f54639a + ", model=" + this.f54640b + ")";
    }
}
