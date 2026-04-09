package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.b;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.d f14412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f14413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f14414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.c f14415e;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f14415e = cVar;
        this.f14412b = dVar;
        this.f14413c = hVar;
        this.f14414d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.f14412b;
        if (dVar != null) {
            b.c cVar = this.f14415e;
            b.this.f14382A = true;
            dVar.f14410b.c(false);
            b.this.f14382A = false;
        }
        h hVar = this.f14413c;
        if (hVar.isEnabled() && hVar.hasSubMenu()) {
            this.f14414d.q(hVar, null, 4);
        }
    }
}
