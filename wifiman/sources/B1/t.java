package b1;

import b1.s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t implements s.a, s {

    /* renamed from: b, reason: collision with root package name */
    private final u f32774b;

    /* renamed from: c, reason: collision with root package name */
    private final u f32775c;

    /* renamed from: d, reason: collision with root package name */
    private final u f32776d;

    public /* synthetic */ t(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    public final androidx.constraintlayout.core.parser.b a() {
        if (this.f32775c.b() && this.f32776d.b()) {
            return this.f32774b.a();
        }
        androidx.constraintlayout.core.parser.d dVar = new androidx.constraintlayout.core.parser.d(new char[0]);
        if (!this.f32775c.b()) {
            dVar.a0("min", this.f32775c.a());
        }
        if (!this.f32776d.b()) {
            dVar.a0("max", this.f32776d.a());
        }
        dVar.a0("value", this.f32774b.a());
        return dVar;
    }

    private t(Y0.h hVar, String str) {
        this.f32774b = new u(hVar, str, "base", null);
        this.f32775c = new u(0 == true ? 1 : 0, 0 == true ? 1 : 0, "min", 0 == true ? 1 : 0);
        this.f32776d = new u(0 == true ? 1 : 0, 0 == true ? 1 : 0, "max", 0 == true ? 1 : 0);
    }

    private t(float f10) {
        this(Y0.h.d(f10), (String) null);
    }

    public t(String str) {
        this((Y0.h) null, str);
    }
}
