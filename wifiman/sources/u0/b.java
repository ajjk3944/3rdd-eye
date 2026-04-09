package U0;

import L0.AbstractC3194y;
import L0.C3174d;
import L0.C3193x;
import Y0.v;
import Y0.x;
import android.text.Spannable;
import androidx.emoji2.text.j;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    private static final int a(long j10) {
        long jG = v.g(j10);
        x.a aVar = x.f24553b;
        if (x.g(jG, aVar.b())) {
            return 0;
        }
        return x.g(jG, aVar.a()) ? 1 : 2;
    }

    private static final int b(int i10) {
        AbstractC3194y.a aVar = AbstractC3194y.f11198a;
        if (AbstractC3194y.i(i10, aVar.a())) {
            return 0;
        }
        if (AbstractC3194y.i(i10, aVar.g())) {
            return 1;
        }
        if (AbstractC3194y.i(i10, aVar.b())) {
            return 2;
        }
        if (AbstractC3194y.i(i10, aVar.c())) {
            return 3;
        }
        if (AbstractC3194y.i(i10, aVar.f())) {
            return 4;
        }
        if (AbstractC3194y.i(i10, aVar.d())) {
            return 5;
        }
        if (AbstractC3194y.i(i10, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void c(Spannable spannable, C3193x c3193x, int i10, int i11, Y0.d dVar) {
        for (Object obj : spannable.getSpans(i10, i11, j.class)) {
            spannable.removeSpan((j) obj);
        }
        c.u(spannable, new O0.j(v.h(c3193x.c()), a(c3193x.c()), v.h(c3193x.a()), a(c3193x.a()), dVar.y() * dVar.getDensity(), b(c3193x.b())), i10, i11);
    }

    public static final void d(Spannable spannable, List list, Y0.d dVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3174d.c cVar = (C3174d.c) list.get(i10);
            c(spannable, (C3193x) cVar.a(), cVar.b(), cVar.c(), dVar);
        }
    }
}
