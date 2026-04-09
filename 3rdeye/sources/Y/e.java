package Y;

import C.C;
import androidx.camera.core.impl.C1687f;
import androidx.camera.core.impl.InterfaceC1678a0;
import androidx.camera.core.impl.InterfaceC1680b0;
import e0.C4301b;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: DynamicRangeMatchedEncoderProfilesProvider.java */
/* loaded from: classes.dex */
public final class e implements InterfaceC1678a0 {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1678a0 f13697b;

    /* renamed from: c, reason: collision with root package name */
    public final C f13698c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f13699d = new HashMap();

    public e(InterfaceC1678a0 interfaceC1678a0, C c10) {
        this.f13697b = interfaceC1678a0;
        this.f13698c = c10;
    }

    public final InterfaceC1680b0 a(int i) {
        HashMap map = this.f13699d;
        if (map.containsKey(Integer.valueOf(i))) {
            return (InterfaceC1680b0) map.get(Integer.valueOf(i));
        }
        InterfaceC1678a0 interfaceC1678a0 = this.f13697b;
        C1687f c1687fE = null;
        if (interfaceC1678a0.b(i)) {
            InterfaceC1680b0 interfaceC1680b0F = interfaceC1678a0.f(i);
            if (interfaceC1680b0F != null) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1680b0.c cVar : interfaceC1680b0F.d()) {
                    if (C4301b.a(cVar, this.f13698c)) {
                        arrayList.add(cVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c1687fE = InterfaceC1680b0.b.e(interfaceC1680b0F.a(), interfaceC1680b0F.b(), interfaceC1680b0F.c(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), c1687fE);
        }
        return c1687fE;
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public final boolean b(int i) {
        return this.f13697b.b(i) && a(i) != null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public final InterfaceC1680b0 f(int i) {
        return a(i);
    }
}
