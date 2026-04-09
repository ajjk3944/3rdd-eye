package P6;

import android.content.Context;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class w implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18122a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f18123b;

    public w(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f18122a = interfaceC8708a;
        this.f18123b = interfaceC8708a2;
    }

    public static w a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new w(interfaceC8708a, interfaceC8708a2);
    }

    public static v c(Context context, x xVar) {
        return new v(context, xVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Context) this.f18122a.get(), (x) this.f18123b.get());
    }
}
