package androidx.lifecycle;

import java.util.ArrayDeque;

/* compiled from: DispatchQueue.jvm.kt */
/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f16147b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16148c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16146a = true;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f16149d = new ArrayDeque();

    public final void a() {
        if (this.f16148c) {
            return;
        }
        try {
            this.f16148c = true;
            while (true) {
                ArrayDeque arrayDeque = this.f16149d;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                if (!(this.f16147b || !this.f16146a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f16148c = false;
        }
    }
}
