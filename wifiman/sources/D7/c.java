package D7;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2891a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2892b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f2893c;

    public c(String label, float f10, Rect rect) {
        AbstractC6492s.i(label, "label");
        AbstractC6492s.i(rect, "rect");
        this.f2891a = label;
        this.f2892b = f10;
        this.f2893c = rect;
    }

    public final float a() {
        return this.f2892b;
    }

    public final String b() {
        return this.f2891a;
    }

    public final Rect c() {
        return this.f2893c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f2891a, cVar.f2891a) && Float.compare(this.f2892b, cVar.f2892b) == 0 && AbstractC6492s.d(this.f2893c, cVar.f2893c);
    }

    public int hashCode() {
        return (((this.f2891a.hashCode() * 31) + Float.hashCode(this.f2892b)) * 31) + this.f2893c.hashCode();
    }

    public String toString() {
        return "Result(label=" + this.f2891a + ", confidence=" + this.f2892b + ", rect=" + this.f2893c + ")";
    }
}
