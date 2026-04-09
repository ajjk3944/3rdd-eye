package Y4;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ui.wifi.PingActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.util.Locale;
import o4.AbstractC2763b;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* renamed from: Y4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227g extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public q5.o f4467e;

    /* renamed from: f, reason: collision with root package name */
    public int f4468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PingActivity f4469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4470h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227g(PingActivity pingActivity, String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4469g = pingActivity;
        this.f4470h = str;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C0227g) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C0227g(this.f4469g, this.f4470h, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        String str;
        q5.o oVar;
        IBinder windowToken;
        int i = this.f4468f;
        PingActivity pingActivity = this.f4469g;
        if (i == 0) {
            R2.a.H(obj);
            AppCompatImageView appCompatImageView = pingActivity.f19356Y;
            if (appCompatImageView == null) {
                q5.i.g("copyBtn");
                throw null;
            }
            appCompatImageView.setVisibility(8);
            AppCompatTextView appCompatTextView = pingActivity.f19350S;
            if (appCompatTextView == null) {
                q5.i.g("pingLog");
                throw null;
            }
            appCompatTextView.setText("");
            MaterialButton materialButton = pingActivity.f19348Q;
            if (materialButton == null) {
                q5.i.g("startBtn");
                throw null;
            }
            B3.v vVar = pingActivity.f19351T;
            if (vVar == null) {
                q5.i.g("progressIndicatorDrawable");
                throw null;
            }
            materialButton.setIcon(vVar);
            MaterialButton materialButton2 = pingActivity.f19348Q;
            if (materialButton2 == null) {
                q5.i.g("startBtn");
                throw null;
            }
            materialButton2.setText(pingActivity.getString(R.string.base_stop));
            com.lefan.signal.tracroute.e eVar = (com.lefan.signal.tracroute.e) pingActivity.f19347P.getValue();
            com.lefan.signal.tracroute.d dVar = new com.lefan.signal.tracroute.d();
            dVar.f18862b = this.f4470h;
            dVar.f18863c = System.currentTimeMillis();
            eVar.b(dVar);
            View currentFocus = pingActivity.getCurrentFocus();
            if (currentFocus != null && (windowToken = currentFocus.getWindowToken()) != null) {
                Object systemService = pingActivity.getSystemService("input_method");
                q5.i.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
            }
            String property = System.getProperty("os.name");
            if (property != null) {
                Locale locale = Locale.ENGLISH;
                q5.i.d(locale, "ENGLISH");
                String lowerCase = property.toLowerCase(locale);
                q5.i.d(lowerCase, "toLowerCase(...)");
                str = lowerCase;
            } else {
                str = null;
            }
            AppCompatTextView appCompatTextView2 = pingActivity.f19352U;
            if (appCompatTextView2 == null) {
                q5.i.g("sendNum");
                throw null;
            }
            appCompatTextView2.setText("-/-");
            AppCompatTextView appCompatTextView3 = pingActivity.f19355X;
            if (appCompatTextView3 == null) {
                q5.i.g("avaText");
                throw null;
            }
            appCompatTextView3.setText("--");
            AppCompatTextView appCompatTextView4 = pingActivity.f19353V;
            if (appCompatTextView4 == null) {
                q5.i.g("mdevNum");
                throw null;
            }
            appCompatTextView4.setText("--");
            AppCompatTextView appCompatTextView5 = pingActivity.f19354W;
            if (appCompatTextView5 == null) {
                q5.i.g("lossPerm");
                throw null;
            }
            appCompatTextView5.setText("--");
            q5.o oVar2 = new q5.o();
            String strE = AbstractC2763b.e(pingActivity.getString(R.string.base_start), "...\n\n");
            oVar2.f23299a = strE;
            AppCompatTextView appCompatTextView6 = pingActivity.f19350S;
            if (appCompatTextView6 == null) {
                q5.i.g("pingLog");
                throw null;
            }
            appCompatTextView6.setText(strE);
            G5.d dVar2 = z5.D.f24486b;
            C0226f c0226f = new C0226f(str, this.f4470h, pingActivity, oVar2, null);
            this.f4467e = oVar2;
            this.f4468f = 1;
            Object objR = AbstractC3046w.r(dVar2, this, c0226f);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (objR == enumC2380a) {
                return enumC2380a;
            }
            oVar = oVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f4467e;
            R2.a.H(obj);
        }
        String str2 = oVar.f23299a + "\n" + pingActivity.getString(R.string.base_end);
        oVar.f23299a = str2;
        AppCompatTextView appCompatTextView7 = pingActivity.f19350S;
        if (appCompatTextView7 == null) {
            q5.i.g("pingLog");
            throw null;
        }
        appCompatTextView7.setText(str2);
        pingActivity.f19357Z = false;
        MaterialButton materialButton3 = pingActivity.f19348Q;
        if (materialButton3 == null) {
            q5.i.g("startBtn");
            throw null;
        }
        materialButton3.setIcon(null);
        MaterialButton materialButton4 = pingActivity.f19348Q;
        if (materialButton4 == null) {
            q5.i.g("startBtn");
            throw null;
        }
        materialButton4.setText(pingActivity.getString(R.string.base_start));
        AppCompatImageView appCompatImageView2 = pingActivity.f19356Y;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(0);
            return C0412i.f5929a;
        }
        q5.i.g("copyBtn");
        throw null;
    }
}
