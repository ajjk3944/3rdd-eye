package B9;

import H6.I;
import K6.C0713c;
import K6.C0752q0;
import K6.D;
import L0.G;
import L0.S;
import N7.E5;
import N7.Z;
import O6.C;
import O6.n;
import Q6.p;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;
import p9.l;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class e extends m implements l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f598h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Object obj2) {
        super(1);
        this.f597g = i;
        this.f598h = obj;
        this.i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p9.l
    public final Object invoke(Object obj) {
        I i;
        Object obj2 = this.i;
        Object obj3 = this.f598h;
        switch (this.f597g) {
            case 0:
                ((f) obj3).f599c.removeCallbacks((d) obj2);
                break;
            case 1:
                String stateDescription = (String) obj;
                kotlin.jvm.internal.l.f(stateDescription, "stateDescription");
                ((D) obj3).getClass();
                WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
                new G(R.id.tag_state_description, CharSequence.class, 64, 30).c((View) obj2, stateDescription);
                break;
            case 2:
                String id = (String) obj;
                kotlin.jvm.internal.l.f(id, "id");
                ((View) obj3).setNextFocusLeftId(((I) obj2).f(id));
                break;
            case 3:
                E5 scale = (E5) obj;
                kotlin.jvm.internal.l.f(scale, "scale");
                ((C0752q0) obj3).getClass();
                ((n) obj2).setImageScale(C0713c.c0(scale));
                break;
            case 4:
                Z it = (Z) obj;
                kotlin.jvm.internal.l.f(it, "it");
                for (C6.l lVar : (ArrayList) obj3) {
                    lVar.f951b++;
                    lVar.f952c++;
                }
                C6.l lVar2 = (C6.l) ((w) obj2).f43660b;
                if (lVar2 != null) {
                    lVar2.f951b++;
                    lVar2.f952c++;
                }
                break;
            case 5:
                long jLongValue = ((Number) obj).longValue();
                ((N6.d) obj3).f4711p = Long.valueOf(jLongValue);
                N6.c divTabsAdapter = ((C) obj2).getDivTabsAdapter();
                if (divTabsAdapter != null && (i = divTabsAdapter.f4697y) != null) {
                    long j4 = jLongValue >> 31;
                    int i10 = (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
                    y7.n nVar = (y7.n) i.f2053c;
                    if (nVar.getCurrentItem() != i10) {
                        nVar.setCurrentItem(i10, true);
                    }
                }
                break;
            default:
                Z6.d variable = (Z6.d) obj;
                kotlin.jvm.internal.l.f(variable, "variable");
                p pVar = (p) obj3;
                pVar.f11366b.put(new b9.l((String) obj2, variable.a()), variable);
                pVar.a();
                break;
        }
        return C1992A.f18074a;
    }
}
