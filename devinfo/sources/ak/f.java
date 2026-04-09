package ak;

import android.os.Build;
import android.view.View;
import e4.v0;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f443a;

    /* renamed from: b, reason: collision with root package name */
    public int f444b;

    /* renamed from: c, reason: collision with root package name */
    public int f445c;

    /* renamed from: d, reason: collision with root package name */
    public Object f446d;

    public f() {
        if (ja.c.f27481a == null) {
            ja.c.f27481a = new ja.c();
        }
    }

    public int a(int i4) {
        if (i4 < this.f445c) {
            return ((ByteBuffer) this.f446d).getShort(this.f444b + i4);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f446d).f454h != this.f445c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i4 = this.f443a;
            g gVar = (g) this.f446d;
            if (i4 >= gVar.f453f || gVar.f450c[i4] >= 0) {
                return;
            } else {
                this.f443a = i4 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f444b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f444b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f443a);
            if (!((Class) this.f446d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateE = v0.e(view);
            e4.b bVar = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof e4.a ? ((e4.a) accessibilityDelegateE).f22299a : new e4.b(accessibilityDelegateE);
            if (bVar == null) {
                bVar = new e4.b();
            }
            v0.o(view, bVar);
            view.setTag(this.f443a, obj);
            v0.i(this.f445c, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f443a < ((g) this.f446d).f453f;
    }

    public void remove() {
        g gVar = (g) this.f446d;
        b();
        if (this.f444b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        gVar.c();
        gVar.l(this.f444b);
        this.f444b = -1;
        this.f445c = gVar.f454h;
    }
}
