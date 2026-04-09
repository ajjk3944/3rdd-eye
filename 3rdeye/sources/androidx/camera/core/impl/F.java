package androidx.camera.core.impl;

import C.J;
import android.graphics.Rect;
import androidx.camera.core.impl.H0;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: CameraControlInternal.java */
/* loaded from: classes.dex */
public interface F {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14874a = new a();

    /* compiled from: CameraControlInternal.java */
    public static final class b extends Exception {
    }

    void a();

    void b(J.g gVar);

    void c(U u8);

    Rect d();

    void e(int i);

    void f(H0.b bVar);

    A4.a g(ArrayList arrayList, int i, int i10);

    A4.a<E.i> h(int i, int i10);

    U i();

    void j();

    void k();

    /* compiled from: CameraControlInternal.java */
    public class a implements F {
        @Override // androidx.camera.core.impl.F
        public final Rect d() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.F
        public final A4.a g(ArrayList arrayList, int i, int i10) {
            return I.j.e(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.impl.F
        public final A4.a h(int i, int i10) {
            return I.j.e(new E());
        }

        @Override // androidx.camera.core.impl.F
        public final U i() {
            return null;
        }

        @Override // androidx.camera.core.impl.F
        public final /* synthetic */ void a() {
        }

        @Override // androidx.camera.core.impl.F
        public final void j() {
        }

        @Override // androidx.camera.core.impl.F
        public final /* synthetic */ void k() {
        }

        @Override // androidx.camera.core.impl.F
        public final /* synthetic */ void b(J.g gVar) {
        }

        @Override // androidx.camera.core.impl.F
        public final void c(U u8) {
        }

        @Override // androidx.camera.core.impl.F
        public final void e(int i) {
        }

        @Override // androidx.camera.core.impl.F
        public final void f(H0.b bVar) {
        }
    }
}
