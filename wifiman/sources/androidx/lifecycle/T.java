package androidx.lifecycle;

import a2.AbstractC3752a;
import android.view.View;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;

/* loaded from: classes.dex */
public abstract class T {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31636a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View currentView) {
            AbstractC6492s.i(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31637a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4017o invoke(View viewParent) {
            AbstractC6492s.i(viewParent, "viewParent");
            Object tag = viewParent.getTag(AbstractC3752a.f25715a);
            if (tag instanceof InterfaceC4017o) {
                return (InterfaceC4017o) tag;
            }
            return null;
        }
    }

    public static final InterfaceC4017o a(View view) {
        AbstractC6492s.i(view, "<this>");
        return (InterfaceC4017o) AbstractC8783m.G(AbstractC8783m.O(AbstractC8783m.n(view, a.f31636a), b.f31637a));
    }

    public static final void b(View view, InterfaceC4017o interfaceC4017o) {
        AbstractC6492s.i(view, "<this>");
        view.setTag(AbstractC3752a.f25715a, interfaceC4017o);
    }
}
