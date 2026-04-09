package A1;

import androidx.lifecycle.C0300w;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0300w f108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2.h f109b;

    public k(V2.h hVar, C0300w c0300w) {
        this.f109b = hVar;
        this.f108a = c0300w;
    }

    @Override // A1.j
    public final void onDestroy() {
        ((HashMap) this.f109b.f3875b).remove(this.f108a);
    }

    @Override // A1.j
    public final void e() {
    }

    @Override // A1.j
    public final void j() {
    }
}
