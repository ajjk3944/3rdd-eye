package B;

import C.D;
import N7.H7;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.InterfaceC1708p0;
import androidx.camera.core.impl.U;
import java.util.Set;

/* compiled from: CaptureRequestOptions.java */
/* loaded from: classes.dex */
public class j implements D0 {

    /* renamed from: G, reason: collision with root package name */
    public final U f329G;

    /* compiled from: CaptureRequestOptions.java */
    public static final class a implements D<j> {

        /* renamed from: a, reason: collision with root package name */
        public final C1710q0 f330a = C1710q0.K();

        public static a d(U u8) {
            a aVar = new a();
            u8.g(new i(0, aVar, u8));
            return aVar;
        }

        @Override // C.D
        public final InterfaceC1708p0 a() {
            throw null;
        }

        public final j c() {
            return new j(C1717u0.J(this.f330a));
        }
    }

    public j(U u8) {
        this.f329G = u8;
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Object b(U.a aVar) {
        return H7.j(this, aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ boolean f(U.a aVar) {
        return H7.c(this, aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final void g(i iVar) {
        getConfig().g(iVar);
    }

    @Override // androidx.camera.core.impl.D0
    public final U getConfig() {
        return this.f329G;
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Object j(U.a aVar, U.b bVar) {
        return H7.l(this, aVar, bVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Set l() {
        return H7.i(this);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Object o(U.a aVar, Object obj) {
        return H7.k(this, aVar, obj);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ U.b w(U.a aVar) {
        return H7.f(this, aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Set x(U.a aVar) {
        return H7.h(this, aVar);
    }
}
