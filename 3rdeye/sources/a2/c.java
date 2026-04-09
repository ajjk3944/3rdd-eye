package A2;

import J8.C0690e;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.s;
import b9.C1992A;
import com.zipoapps.premium.relaunch.RelaunchActivity;
import com.zipoapps.premiumhelper.e;
import f8.AbstractActivityC4340c;
import f8.AbstractC4342e;
import i8.C4461a;
import kotlin.jvm.internal.A;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9c;

    public /* synthetic */ c(Object obj, int i) {
        this.f8b = i;
        this.f9c = obj;
    }

    @Override // p9.l
    public final Object invoke(Object obj) throws Exception {
        String strI;
        Object obj2 = this.f9c;
        switch (this.f8b) {
            case 0:
                E1.c cVarK0 = ((E1.a) obj).K0("DELETE FROM Model WHERE name = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        cVarK0.f(1);
                    } else {
                        cVarK0.Q(1, str);
                    }
                    cVarK0.x();
                    cVarK0.close();
                    return null;
                } catch (Throwable th) {
                    cVarK0.close();
                    throw th;
                }
            case 1:
                AbstractC4342e.b bVar = (AbstractC4342e.b) obj;
                int i = AbstractActivityC4340c.i;
                boolean z10 = bVar instanceof AbstractC4342e.b.a;
                AbstractActivityC4340c abstractActivityC4340c = (AbstractActivityC4340c) obj2;
                b9.p pVar = abstractActivityC4340c.f37831h;
                if (z10) {
                    View view = (View) pVar.getValue();
                    if (view != null) {
                        view.setVisibility(0);
                    }
                } else {
                    if (!(bVar instanceof AbstractC4342e.b.C0455b)) {
                        throw new b9.j();
                    }
                    TextView textView = (TextView) abstractActivityC4340c.f37827d.getValue();
                    if (textView != null) {
                        textView.setText(((AbstractC4342e.b.C0455b) bVar).f37850c);
                    }
                    TextView textView2 = (TextView) abstractActivityC4340c.f37828e.getValue();
                    if (textView2 != null) {
                        textView2.setText(((AbstractC4342e.b.C0455b) bVar).f37851d);
                    }
                    TextView textView3 = (TextView) abstractActivityC4340c.f37829f.getValue();
                    if (textView3 != null) {
                        textView3.setText(((AbstractC4342e.b.C0455b) bVar).f37849b);
                    }
                    TextView textView4 = (TextView) abstractActivityC4340c.f37830g.getValue();
                    if (textView4 != null) {
                        textView4.setText(((AbstractC4342e.b.C0455b) bVar).f37848a);
                    }
                    View view2 = (View) pVar.getValue();
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    C4461a c4461a = e.a.a().f37021k;
                    kotlin.jvm.internal.l.f(c4461a, "<this>");
                    c4461a.u("First_start_like_a_pro_price_shown", new Bundle[0]);
                }
                return C1992A.f18074a;
            case 2:
                Activity it = (Activity) obj;
                kotlin.jvm.internal.l.f(it, "it");
                if (!C0690e.b(it) && !(it instanceof RelaunchActivity) && (it instanceof AppCompatActivity)) {
                    com.zipoapps.premiumhelper.e.i((com.zipoapps.premiumhelper.e) obj2, (AppCompatActivity) it, 10);
                }
                return C1992A.f18074a;
            default:
                w9.k it2 = (w9.k) obj;
                kotlin.jvm.internal.l.f(it2, "it");
                ((A) obj2).getClass();
                w9.l lVar = it2.f47594a;
                if (lVar == null) {
                    return "*";
                }
                A a10 = it2.f47595b;
                A a11 = s.n(a10) ? a10 : null;
                String strValueOf = (a11 == null || (strI = a11.i(true)) == null) ? String.valueOf(a10) : strI;
                int i10 = A.a.f43640a[lVar.ordinal()];
                if (i10 == 1) {
                    return strValueOf;
                }
                if (i10 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i10 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new b9.j();
        }
    }
}
