package t2;

import android.content.Context;
import q2.AbstractBinderC2835o0;
import q2.C2852x0;

/* renamed from: t2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2926j extends AbstractBinderC2835o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2928l f23626b;

    public BinderC2926j(C2928l c2928l, Context context) {
        this.f23625a = context;
        this.f23626b = c2928l;
    }

    @Override // q2.InterfaceC2837p0
    public final void c0(C2852x0 c2852x0) {
        if (c2852x0 == null) {
            return;
        }
        this.f23626b.i(this.f23625a, c2852x0.f23274b, true, true);
    }
}
