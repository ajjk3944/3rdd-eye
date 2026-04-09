package d2;

import androidx.lifecycle.InterfaceC4011i;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import b2.AbstractC4056a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f45727a = new g();

    public static final class a implements AbstractC4056a.b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45728a = new a();

        private a() {
        }
    }

    private g() {
    }

    public final AbstractC4056a a(S owner) {
        AbstractC6492s.i(owner, "owner");
        return owner instanceof InterfaceC4011i ? ((InterfaceC4011i) owner).h() : AbstractC4056a.C1139a.f32794b;
    }

    public final P.c b(S owner) {
        AbstractC6492s.i(owner, "owner");
        return owner instanceof InterfaceC4011i ? ((InterfaceC4011i) owner).g() : C5284c.f45721b;
    }

    public final String c(th.d modelClass) {
        AbstractC6492s.i(modelClass, "modelClass");
        String strA = h.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final N d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
