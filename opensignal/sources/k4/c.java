package k4;

import android.os.Build;
import android.view.View;
import io.sentry.hints.i;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import nq.f;
import u3.i0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f14037a;

    /* renamed from: d, reason: collision with root package name */
    public int f14038d;

    /* renamed from: g, reason: collision with root package name */
    public int f14039g;

    /* renamed from: r, reason: collision with root package name */
    public Object f14040r;

    public c() {
        if (i.f12316d == null) {
            i.f12316d = new i(12);
        }
    }

    public int a(int i10) {
        if (i10 < this.f14039g) {
            return ((ByteBuffer) this.f14040r).getShort(this.f14038d + i10);
        }
        return 0;
    }

    public void b() {
        if (((f) this.f14040r).D != this.f14039g) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i10 = this.f14037a;
            f fVar = (f) this.f14040r;
            if (i10 >= fVar.f18510y || fVar.f18507g[i10] >= 0) {
                return;
            } else {
                this.f14037a = i10 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f14038d) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f14038d) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f14037a);
            if (!((Class) this.f14040r).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = i0.d(view);
            u3.b bVar = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof u3.a ? ((u3.a) accessibilityDelegateD).f23144a : new u3.b(accessibilityDelegateD);
            if (bVar == null) {
                bVar = new u3.b();
            }
            i0.n(view, bVar);
            view.setTag(this.f14037a, obj);
            i0.h(view, this.f14039g);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f14037a < ((f) this.f14040r).f18510y;
    }

    public void remove() {
        f fVar = (f) this.f14040r;
        b();
        if (this.f14038d == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fVar.c();
        fVar.l(this.f14038d);
        this.f14038d = -1;
        this.f14039g = fVar.D;
    }
}
