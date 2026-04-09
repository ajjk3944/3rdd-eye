package R;

import android.os.Build;
import android.view.View;
import b4.C0344i;
import e5.C2310f;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public int f3259a;

    /* renamed from: b, reason: collision with root package name */
    public int f3260b;

    /* renamed from: c, reason: collision with root package name */
    public int f3261c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3262d;

    public C() {
        if (C0344i.f5753b == null) {
            C0344i.f5753b = new C0344i(14);
        }
    }

    public int a(int i) {
        if (i < this.f3261c) {
            return ((ByteBuffer) this.f3262d).getShort(this.f3260b + i);
        }
        return 0;
    }

    public void b() {
        if (((C2310f) this.f3262d).f19967h != this.f3261c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f3259a;
            C2310f c2310f = (C2310f) this.f3262d;
            if (i >= c2310f.f19965f || c2310f.f19962c[i] >= 0) {
                return;
            } else {
                this.f3259a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f3260b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f3260b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f3259a);
            if (!((Class) this.f3262d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = O.d(view);
            C0175b c0175b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C0174a ? ((C0174a) accessibilityDelegateD).f3299a : new C0175b(accessibilityDelegateD);
            if (c0175b == null) {
                c0175b = new C0175b();
            }
            O.m(view, c0175b);
            view.setTag(this.f3259a, obj);
            O.h(this.f3261c, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f3259a < ((C2310f) this.f3262d).f19965f;
    }

    public void remove() {
        C2310f c2310f = (C2310f) this.f3262d;
        b();
        if (this.f3260b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c2310f.c();
        c2310f.l(this.f3260b);
        this.f3260b = -1;
        this.f3261c = c2310f.f19967h;
    }
}
