package a3;

import android.content.Context;
import com.bumptech.glide.l;

/* compiled from: DefaultConnectivityMonitor.java */
/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1648b implements InterfaceC1647a {

    /* renamed from: b, reason: collision with root package name */
    public final Context f14109b;

    /* renamed from: c, reason: collision with root package name */
    public final l.b f14110c;

    public C1648b(Context context, l.b bVar) {
        this.f14109b = context.getApplicationContext();
        this.f14110c = bVar;
    }

    @Override // a3.i
    public final void onStart() {
        p pVarA = p.a(this.f14109b);
        l.b bVar = this.f14110c;
        synchronized (pVarA) {
            pVarA.f14133b.add(bVar);
            if (!pVarA.f14134c && !pVarA.f14133b.isEmpty()) {
                pVarA.f14134c = pVarA.f14132a.a();
            }
        }
    }

    @Override // a3.i
    public final void onStop() {
        p pVarA = p.a(this.f14109b);
        l.b bVar = this.f14110c;
        synchronized (pVarA) {
            pVarA.f14133b.remove(bVar);
            if (pVarA.f14134c && pVarA.f14133b.isEmpty()) {
                pVarA.f14132a.b();
                pVarA.f14134c = false;
            }
        }
    }

    @Override // a3.i
    public final void onDestroy() {
    }
}
