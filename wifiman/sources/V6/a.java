package V6;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22977a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f22978b = b0.c.c(1443599613, false, C0840a.f22979a);

    /* renamed from: V6.a$a, reason: collision with other inner class name */
    static final class C0840a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final C0840a f22979a = new C0840a();

        C0840a() {
        }

        public final void a(T6.f rememberImageComponent, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(rememberImageComponent, "$this$rememberImageComponent");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1443599613, i10, -1, "com.skydoves.landscapist.glide.ComposableSingletons$GlideImageKt.lambda-1.<anonymous> (GlideImage.kt:109)");
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((T6.f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public final mh.q a() {
        return f22978b;
    }
}
