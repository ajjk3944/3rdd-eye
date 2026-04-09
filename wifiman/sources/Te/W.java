package Te;

import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private final s9.d f21776a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21777b;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(((X) obj).c().j()), Integer.valueOf(((X) obj2).c().j()));
        }
    }

    public W(s9.d unit, List parts) {
        AbstractC6492s.i(unit, "unit");
        AbstractC6492s.i(parts, "parts");
        this.f21776a = unit;
        this.f21777b = AbstractC3689v.X0(parts, new a());
    }

    public final X a(float f10) {
        Object next;
        if (f10 >= ((X) AbstractC3689v.B0(this.f21777b)).c().j()) {
            return (X) AbstractC3689v.B0(this.f21777b);
        }
        if (f10 <= ((X) AbstractC3689v.q0(this.f21777b)).c().i()) {
            return (X) AbstractC3689v.q0(this.f21777b);
        }
        Iterator it = this.f21777b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (f10 <= ((X) next).c().j()) {
                break;
            }
        }
        AbstractC6492s.f(next);
        return (X) next;
    }

    public final List b() {
        return this.f21777b;
    }

    public final s9.d c() {
        return this.f21776a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof W) {
            W w10 = (W) obj;
            if (AbstractC6492s.d(w10.f21776a, this.f21776a) && AbstractC6492s.d(w10.f21777b, this.f21777b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f21776a.hashCode() * this.f21777b.hashCode();
    }
}
