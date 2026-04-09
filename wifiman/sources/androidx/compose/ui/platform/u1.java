package androidx.compose.ui.platform;

import android.view.View;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public interface u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29619a = a.f29620a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f29620a = new a();

        private a() {
        }

        public final u1 a() {
            return b.f29621b;
        }
    }

    public static final class b implements u1 {

        /* renamed from: b, reason: collision with root package name */
        public static final b f29621b = new b();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3901a f29622a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC1077b f29623b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K1.b f29624c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC3901a abstractC3901a, ViewOnAttachStateChangeListenerC1077b viewOnAttachStateChangeListenerC1077b, K1.b bVar) {
                super(0);
                this.f29622a = abstractC3901a;
                this.f29623b = viewOnAttachStateChangeListenerC1077b;
                this.f29624c = bVar;
            }

            public final void a() {
                this.f29622a.removeOnAttachStateChangeListener(this.f29623b);
                K1.a.e(this.f29622a, this.f29624c);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        /* renamed from: androidx.compose.ui.platform.u1$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1077b implements View.OnAttachStateChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3901a f29625a;

            ViewOnAttachStateChangeListenerC1077b(AbstractC3901a abstractC3901a) {
                this.f29625a = abstractC3901a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (K1.a.d(this.f29625a)) {
                    return;
                }
                this.f29625a.e();
            }
        }

        private b() {
        }

        @Override // androidx.compose.ui.platform.u1
        public InterfaceC6824a a(final AbstractC3901a abstractC3901a) {
            ViewOnAttachStateChangeListenerC1077b viewOnAttachStateChangeListenerC1077b = new ViewOnAttachStateChangeListenerC1077b(abstractC3901a);
            abstractC3901a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1077b);
            K1.b bVar = new K1.b() { // from class: androidx.compose.ui.platform.v1
            };
            K1.a.a(abstractC3901a, bVar);
            return new a(abstractC3901a, viewOnAttachStateChangeListenerC1077b, bVar);
        }
    }

    InterfaceC6824a a(AbstractC3901a abstractC3901a);
}
