package u0;

import android.view.View;
import u0.AbstractC8124b;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8125c implements InterfaceC8123a {

    /* renamed from: a, reason: collision with root package name */
    private final View f62667a;

    public C8125c(View view) {
        this.f62667a = view;
    }

    @Override // u0.InterfaceC8123a
    public void a(int i10) {
        AbstractC8124b.a aVar = AbstractC8124b.f62666a;
        if (AbstractC8124b.b(i10, aVar.a())) {
            this.f62667a.performHapticFeedback(0);
        } else if (AbstractC8124b.b(i10, aVar.b())) {
            this.f62667a.performHapticFeedback(9);
        }
    }
}
