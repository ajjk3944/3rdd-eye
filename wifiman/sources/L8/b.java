package L8;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import com.ubnt.usurvey.R;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import mh.q;
import s9.d;

/* loaded from: classes3.dex */
public abstract class b {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11256a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W7.a f11257b;

        a(int i10, W7.a aVar) {
            this.f11256a = i10;
            this.f11257b = aVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(1616565824);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1616565824, i10, -1, "com.ubnt.usurvey.ui.util.asMbpsString.<anonymous> (DataFormatExtensions.kt:10)");
            }
            String str = String.format("%." + this.f11256a + "f " + it.getString(R.string.unit_mbps), Arrays.copyOf(new Object[]{Double.valueOf(this.f11257b.b() / 1000000.0d)}, 1));
            AbstractC6492s.h(str, "format(...)");
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

    public static final s9.d a(W7.a aVar, int i10) {
        AbstractC6492s.i(aVar, "<this>");
        return new d.a(String.valueOf(aVar.b()), new a(i10, aVar));
    }

    public static /* synthetic */ s9.d b(W7.a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return a(aVar, i10);
    }
}
