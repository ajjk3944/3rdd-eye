package g2;

import androidx.lifecycle.E;
import androidx.lifecycle.N;
import c0.InterfaceC4176e;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5851a extends N {

    /* renamed from: b, reason: collision with root package name */
    private final String f47518b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    private final UUID f47519c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f47520d;

    public C5851a(E e10) {
        UUID uuidRandomUUID = (UUID) e10.d("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            e10.i("SaveableStateHolder_BackStackEntryKey", uuidRandomUUID);
        }
        this.f47519c = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.N
    protected void W() {
        super.W();
        InterfaceC4176e interfaceC4176e = (InterfaceC4176e) Y().get();
        if (interfaceC4176e != null) {
            interfaceC4176e.f(this.f47519c);
        }
        Y().clear();
    }

    public final UUID X() {
        return this.f47519c;
    }

    public final WeakReference Y() {
        WeakReference weakReference = this.f47520d;
        if (weakReference != null) {
            return weakReference;
        }
        AbstractC6492s.v("saveableStateHolderRef");
        return null;
    }

    public final void Z(WeakReference weakReference) {
        this.f47520d = weakReference;
    }
}
