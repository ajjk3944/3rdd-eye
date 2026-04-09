package V5;

import D9.G;
import android.view.View;
import b9.C1992A;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: ViewProperty.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: ViewProperty.kt */
    /* renamed from: V5.a$a, reason: collision with other inner class name */
    public static final class C0185a extends m implements InterfaceC5480a<C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f12949g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0185a(View view) {
            super(0);
            this.f12949g = view;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            this.f12949g.invalidate();
            return C1992A.f18074a;
        }
    }

    public static final /* synthetic */ G a(View view, Object obj) {
        return new G(obj, new C0185a(view));
    }
}
