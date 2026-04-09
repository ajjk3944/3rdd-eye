package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class cb0 {
    public int f;
    public int g;
    public int h;
    public Object i;

    public cb0() {
        if (us0.f == null) {
            us0.f = new us0();
        }
    }

    public int a(int i) {
        if (i < this.h) {
            return ((ByteBuffer) this.i).getShort(this.g + i);
        }
        return 0;
    }

    public void b() {
        if (((db0) this.i).m != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f;
            db0 db0Var = (db0) this.i;
            if (i >= db0Var.k || db0Var.h[i] >= 0) {
                return;
            } else {
                this.f = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.g) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.g) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f);
            if (!((Class) this.i).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = e61.c(view);
            p0 p0Var = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof o0 ? ((o0) accessibilityDelegateC).a : new p0(accessibilityDelegateC);
            if (p0Var == null) {
                p0Var = new p0();
            }
            e61.l(view, p0Var);
            view.setTag(this.f, obj);
            e61.g(view, this.h);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f < ((db0) this.i).k;
    }

    public void remove() {
        db0 db0Var = (db0) this.i;
        b();
        if (this.g == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        db0Var.b();
        db0Var.k(this.g);
        this.g = -1;
        this.h = db0Var.m;
    }
}
