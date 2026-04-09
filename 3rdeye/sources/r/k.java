package R;

import G.o;
import androidx.camera.core.impl.C1686e0;
import androidx.camera.core.impl.I;
import java.util.UUID;

/* compiled from: VirtualCameraInfo.java */
/* loaded from: classes.dex */
public final class k extends C1686e0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f11599b;

    /* renamed from: c, reason: collision with root package name */
    public int f11600c;

    public k(I i) {
        super(i);
        this.f11599b = "virtual-" + i.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.C1686e0, C.r
    public final int b() {
        return j(0);
    }

    @Override // androidx.camera.core.impl.C1686e0, androidx.camera.core.impl.I
    public final String d() {
        return this.f11599b;
    }

    @Override // androidx.camera.core.impl.C1686e0, C.r
    public final int j(int i) {
        return o.h(this.f15020a.j(i) - this.f11600c);
    }
}
