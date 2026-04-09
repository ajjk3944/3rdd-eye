package O4;

import C0.t;
import android.database.Cursor;
import c5.C0412i;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import com.lefan.signal.network.webSpeed.WebSpeedRoom_Impl;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import o.m1;
import p5.p;
import z5.AbstractC3046w;
import z5.D;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class k extends j5.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f3088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3089f = lVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((k) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new k(this.f3089f, interfaceC2370d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f3088e;
        String string = null;
        l lVar = this.f3089f;
        if (i == 0) {
            R2.a.H(obj);
            LinearProgressIndicator linearProgressIndicator = lVar.f3096G0;
            if (linearProgressIndicator != null) {
                linearProgressIndicator.setVisibility(0);
            }
            m1 m1Var = lVar.f3090A0;
            q5.i.b(m1Var);
            ((TextInputLayout) m1Var.f22588h).setEndIconVisible(false);
            G5.d dVar = D.f24486b;
            j jVar = new j(lVar, null);
            this.f3088e = 1;
            Object objR = AbstractC3046w.r(dVar, this, jVar);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (objR == enumC2380a) {
                return enumC2380a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
        }
        LinearProgressIndicator linearProgressIndicator2 = lVar.f3096G0;
        if (linearProgressIndicator2 != null) {
            linearProgressIndicator2.setVisibility(8);
        }
        m1 m1Var2 = lVar.f3090A0;
        q5.i.b(m1Var2);
        ((TextInputLayout) m1Var2.f22588h).setEndIconVisible(true);
        String url = lVar.f3099J0.getUrl();
        C0412i c0412i = C0412i.f5929a;
        if (url == null || url.length() == 0) {
            return c0412i;
        }
        e eVar = (e) lVar.f3091B0.getValue();
        String url2 = lVar.f3099J0.getUrl();
        q5.i.b(url2);
        eVar.getClass();
        t tVarA = t.a(1, "SELECT * FROM web_speed WHERE url = ? limit 1");
        tVarA.c(1, url2);
        WebSpeedRoom_Impl webSpeedRoom_Impl = eVar.f3077a;
        webSpeedRoom_Impl.b();
        Cursor cursorL = webSpeedRoom_Impl.l(tVarA);
        try {
            int iP = I5.b.p(cursorL, "id");
            int iP2 = I5.b.p(cursorL, "url");
            int iP3 = I5.b.p(cursorL, "name");
            int iP4 = I5.b.p(cursorL, "logo");
            if (cursorL.moveToFirst()) {
                WebSpeedBean webSpeedBean = new WebSpeedBean();
                webSpeedBean.setId(cursorL.getInt(iP));
                webSpeedBean.setUrl(cursorL.isNull(iP2) ? null : cursorL.getString(iP2));
                webSpeedBean.setName(cursorL.isNull(iP3) ? null : cursorL.getString(iP3));
                if (!cursorL.isNull(iP4)) {
                    string = cursorL.getString(iP4);
                }
                webSpeedBean.setLogo(string);
                string = webSpeedBean;
            }
            if (string == null) {
                MaterialButton materialButton = lVar.f3094E0;
                if (materialButton != null) {
                    materialButton.setVisibility(0);
                }
            } else {
                MaterialButton materialButton2 = lVar.f3094E0;
                if (materialButton2 != null) {
                    materialButton2.setVisibility(8);
                }
            }
            lVar.h0();
            return c0412i;
        } finally {
            cursorL.close();
            tVarA.b();
        }
    }
}
