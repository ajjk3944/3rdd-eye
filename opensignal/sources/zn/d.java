package zn;

import br.l;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final List f27468a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27469b;

    public d(List list, boolean z10) {
        l.e(list, "values");
        this.f27468a = list;
        this.f27469b = z10;
    }

    @Override // yn.a
    public final boolean a() {
        boolean zContains = this.f27468a.contains("android");
        return this.f27469b ? !zContains : zContains;
    }
}
