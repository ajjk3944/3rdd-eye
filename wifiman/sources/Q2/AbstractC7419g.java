package q2;

import android.view.View;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;

/* renamed from: q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7419g {

    /* renamed from: q2.g$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f58364a = new a();

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

    /* renamed from: q2.g$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f58365a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7418f invoke(View view) {
            AbstractC6492s.i(view, "view");
            Object tag = view.getTag(AbstractC7413a.f58348a);
            if (tag instanceof InterfaceC7418f) {
                return (InterfaceC7418f) tag;
            }
            return null;
        }
    }

    public static final InterfaceC7418f a(View view) {
        AbstractC6492s.i(view, "<this>");
        return (InterfaceC7418f) AbstractC8783m.G(AbstractC8783m.O(AbstractC8783m.n(view, a.f58364a), b.f58365a));
    }

    public static final void b(View view, InterfaceC7418f interfaceC7418f) {
        AbstractC6492s.i(view, "<this>");
        view.setTag(AbstractC7413a.f58348a, interfaceC7418f);
    }
}
