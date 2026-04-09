package Q8;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import com.ubnt.usurvey.R;
import h9.C5969a;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import mh.q;
import s9.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19239a = new a();

    /* renamed from: Q8.a$a, reason: collision with other inner class name */
    static final class C0675a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5969a f19240a;

        C0675a(C5969a c5969a) {
            this.f19240a = c5969a;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(313091538);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(313091538, i10, -1, "com.ubnt.usurvey.ui.wmw.util.WmwNameUtil.getDisplayName.<anonymous> (WmwNameUtil.kt:9)");
            }
            String string = it.getString(R.string.wifiman_wizard);
            String upperCase = t.y1(this.f19240a.d(""), 3).toUpperCase(Locale.ROOT);
            AbstractC6492s.h(upperCase, "toUpperCase(...)");
            String str = string + "-" + upperCase;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    private a() {
    }

    public final d a(C5969a hwAddress) {
        AbstractC6492s.i(hwAddress, "hwAddress");
        return new d.a(hwAddress.d(""), new C0675a(hwAddress));
    }
}
