package c4;

import android.view.ViewTreeObserver;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.b f18484b;

    public e(com.google.android.material.floatingactionbutton.b bVar) {
        this.f18484b = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.b bVar = this.f18484b;
        float rotation = bVar.f22953v.getRotation();
        if (bVar.f22946o == rotation) {
            return true;
        }
        bVar.f22946o = rotation;
        bVar.p();
        return true;
    }
}
