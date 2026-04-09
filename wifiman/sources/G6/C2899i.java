package G6;

import G6.InterfaceC2891a;
import android.content.ContentResolver;
import android.content.Context;
import z2.InterfaceC8708a;

/* renamed from: G6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2899i implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7055a;

    public C2899i(InterfaceC8708a interfaceC8708a) {
        this.f7055a = interfaceC8708a;
    }

    public static C2899i a(InterfaceC8708a interfaceC8708a) {
        return new C2899i(interfaceC8708a);
    }

    public static ContentResolver c(Context context) {
        return (ContentResolver) y2.e.d(InterfaceC2891a.c.h(context));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ContentResolver get() {
        return c((Context) this.f7055a.get());
    }
}
