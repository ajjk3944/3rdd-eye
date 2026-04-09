package D8;

import A9.C0575f;
import O6.B;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.c0;
import com.applovin.impl.C2158z0;
import com.applovin.impl.j1;
import com.applovin.impl.r1;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.material.datepicker.r;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import f8.AbstractActivityC4340c;
import f8.AbstractC4342e;
import i8.C4461a;
import k8.G;
import p4.C5452b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1099c;

    public /* synthetic */ f(Object obj, int i) {
        this.f1098b = i;
        this.f1099c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f1099c;
        switch (this.f1098b) {
            case 0:
                int i = PhSecretSettingsActivity.f37161f;
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a();
                com.zipoapps.premiumhelper.e.j((PhSecretSettingsActivity) obj, "PHSecretActivity");
                break;
            case 1:
                Q6.i this$0 = (Q6.i) obj;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                Q6.g gVar = this$0.f11338c;
                gVar.b(Q6.j.a(gVar.i, true, 0, 0, null, null, 30));
                break;
            case 2:
                ((j1) obj).a(view);
                break;
            case 3:
                ((com.applovin.impl.mediation.debugger.ui.testmode.a) obj).d(view);
                break;
            case 4:
                ((r1) obj).b(view);
                break;
            case 5:
                ((C2158z0) obj).a(view);
                break;
            case 6:
                r rVar = (r) obj;
                rVar.f22837B.setEnabled(rVar.c().m0());
                rVar.f22864z.toggle();
                rVar.f22853o = rVar.f22853o == 1 ? 0 : 1;
                rVar.g(rVar.f22864z);
                rVar.f();
                break;
            case 7:
                int i10 = AbstractActivityC4340c.i;
                AbstractActivityC4340c abstractActivityC4340c = (AbstractActivityC4340c) obj;
                AbstractC4342e abstractC4342eK = abstractActivityC4340c.k();
                G g10 = abstractC4342eK.f37843n;
                if (g10 != null) {
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    if (!e.a.a().f37020j.f43910b.isDebugMode() || g10.a().length() != 0) {
                        com.zipoapps.premiumhelper.e eVarA = e.a.a();
                        String source = abstractC4342eK.h();
                        String sku = g10.a();
                        C4461a c4461a = eVarA.f37021k;
                        c4461a.getClass();
                        kotlin.jvm.internal.l.f(source, "source");
                        kotlin.jvm.internal.l.f(sku, "sku");
                        c4461a.f38490h = source;
                        c4461a.s("Purchase_started", G0.d.a(new b9.l("offer", source), new b9.l(AppLovinEventParameters.PRODUCT_IDENTIFIER, sku)));
                        C0575f.e(c0.a(abstractC4342eK), null, null, new f8.g(abstractActivityC4340c, g10, abstractC4342eK, null), 3);
                        break;
                    } else {
                        abstractC4342eK.g();
                        break;
                    }
                }
                break;
            case 8:
                C5452b c5452b = (C5452b) obj;
                EditText editText = c5452b.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c5452b.q();
                    break;
                }
                break;
            default:
                SwitchCompat switchCompat = ((B) obj).f45817b;
                if (switchCompat.isEnabled()) {
                    switchCompat.performClick();
                    break;
                }
                break;
        }
    }
}
