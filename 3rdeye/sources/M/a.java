package M;

import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayDeque;

/* compiled from: ArrayRingBuffer.java */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f4106a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<T> f4107b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4108c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Oo f4109d;

    public a(int i, Oo oo) {
        this.f4106a = i;
        this.f4107b = new ArrayDeque<>(i);
        this.f4109d = oo;
    }

    public final T a() {
        T tRemoveLast;
        synchronized (this.f4108c) {
            tRemoveLast = this.f4107b.removeLast();
        }
        return tRemoveLast;
    }

    public void b(T t10) throws Exception {
        T tA;
        synchronized (this.f4108c) {
            try {
                tA = this.f4107b.size() >= this.f4106a ? a() : null;
                this.f4107b.addFirst(t10);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f4109d == null || tA == null) {
            return;
        }
        ((androidx.camera.core.c) tA).close();
    }

    public final boolean c() {
        boolean zIsEmpty;
        synchronized (this.f4108c) {
            zIsEmpty = this.f4107b.isEmpty();
        }
        return zIsEmpty;
    }
}
