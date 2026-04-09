package androidx.lifecycle;

import android.view.View;
import b2.AbstractC4058c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;

/* loaded from: classes.dex */
public abstract class U {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31638a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            AbstractC6492s.i(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31639a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke(View view) {
            AbstractC6492s.i(view, "view");
            Object tag = view.getTag(AbstractC4058c.f32795a);
            if (tag instanceof S) {
                return (S) tag;
            }
            return null;
        }
    }

    public static final S a(View view) {
        AbstractC6492s.i(view, "<this>");
        return (S) AbstractC8783m.G(AbstractC8783m.O(AbstractC8783m.n(view, a.f31638a), b.f31639a));
    }

    public static final void b(View view, S s10) {
        AbstractC6492s.i(view, "<this>");
        view.setTag(AbstractC4058c.f32795a, s10);
    }
}
