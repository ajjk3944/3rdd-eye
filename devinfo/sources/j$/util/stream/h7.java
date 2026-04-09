package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class h7 extends i7 implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f26602b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public h7(int i4) {
        this.f26602b = new Object[i4];
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        int i4 = this.f26620a;
        this.f26620a = i4 + 1;
        this.f26602b[i4] = obj;
    }
}
