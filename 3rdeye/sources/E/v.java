package E;

import C.b0;
import C.e0;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC1700l0;
import androidx.camera.core.impl.P0;
import java.util.concurrent.Executor;

/* compiled from: NoMetadataImageReader.java */
/* loaded from: classes.dex */
public final class v implements InterfaceC1700l0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1700l0 f1343a;

    /* renamed from: b, reason: collision with root package name */
    public A f1344b;

    public v(InterfaceC1700l0 interfaceC1700l0) {
        this.f1343a = interfaceC1700l0;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final Surface a() {
        return this.f1343a.a();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final androidx.camera.core.c b() {
        return c(this.f1343a.b());
    }

    public final b0 c(androidx.camera.core.c cVar) {
        P0 p02;
        if (cVar == null) {
            return null;
        }
        if (this.f1344b == null) {
            p02 = P0.f14934b;
        } else {
            A a10 = this.f1344b;
            Pair pair = new Pair(a10.f1275g, a10.f1276h.get(0));
            P0 p03 = P0.f14934b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            p02 = new P0(arrayMap);
        }
        this.f1344b = null;
        return new b0(cVar, new Size(cVar.getWidth(), cVar.getHeight()), new J.c(new R.i(null, p02, cVar.i0().getTimestamp())));
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void close() {
        this.f1343a.close();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int d() {
        return this.f1343a.d();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void e() {
        this.f1343a.e();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int f() {
        return this.f1343a.f();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final androidx.camera.core.c g() {
        return c(this.f1343a.g());
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int getHeight() {
        return this.f1343a.getHeight();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int getWidth() {
        return this.f1343a.getWidth();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void h(InterfaceC1700l0.a aVar, Executor executor) {
        this.f1343a.h(new e0(1, this, aVar), executor);
    }
}
