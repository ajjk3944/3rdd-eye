package hh;

import android.text.Editable;
import android.view.View;
import androidx.lifecycle.y0;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.internal.ads.e80;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputEditText;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import com.liuzh.deviceinfo.pro.account.register.BindEmailActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25069d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i4) {
        this.f25066a = i4;
        this.f25068c = obj;
        this.f25067b = obj2;
        this.f25069d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i4 = this.f25066a;
        Object obj = this.f25069d;
        Object obj2 = this.f25067b;
        Object obj3 = this.f25068c;
        switch (i4) {
            case 0:
                String str = (String) obj2;
                int i10 = BindEmailActivity.E;
                i iVarD = ((BindEmailActivity) obj3).D();
                Editable text = ((TextInputEditText) ((e80) obj).f10734f).getText();
                ck.c cVar = null;
                String string2 = (text == null || (string = text.toString()) == null) ? null : vk.i.V0(string).toString();
                if (string2 != null && !vk.i.H0(string2)) {
                    if (string2.length() == 0 ? false : Pattern.compile("^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,8})$").matcher(string2).matches()) {
                        xk.x.v(y0.g(iVarD), null, null, new bh.t(str, string2, iVarD, cVar, 11), 3);
                        break;
                    }
                }
                iVarD.f25086b.h(hg.e.e(R.string.please_enter_correct_email));
                break;
            case 1:
                com.liuzh.deviceinfo.utilities.d.j((i.g) ((km.i) obj3).f28426b, "com.liuzh.deviceinfo", "Rate");
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                com.liuzh.deviceinfo.utilities.f.q((String) obj2);
                ((i.e) obj).dismiss();
                break;
            case 2:
                t7.m mVar = new t7.m(((View) obj3).getContext());
                i.b bVar = (i.b) mVar.f34474c;
                bVar.f25233d = (String) obj2;
                bVar.f25235f = (String) obj;
                mVar.x(android.R.string.ok, null);
                ((z2.k) a.a.f3c.f189b).d(mVar.A());
                break;
            case 3:
                t7.m mVar2 = new t7.m(((wj.k) obj3).getContext());
                i.b bVar2 = (i.b) mVar2.f34474c;
                bVar2.f25233d = (String) obj2;
                bVar2.f25235f = (String) obj;
                mVar2.x(android.R.string.ok, null);
                i.e eVarA = mVar2.A();
                o7.d dVar = ii.a.f26002b;
                nk.k.b(dVar);
                ((z2.k) dVar.f30421b).d(eVarA);
                break;
            default:
                wg.s sVar = (wg.s) obj;
                Chip chip = (Chip) ((o.e) obj3).f30195b;
                nk.k.d(chip, "getRoot(...)");
                com.bumptech.glide.c.s(chip);
                xg.h hVarK0 = ((xg.g) obj2).k0();
                hVarK0.getClass();
                nk.k.e(sVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
                DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                nk.k.d(deviceInfoApp, "instance");
                hVarK0.g(deviceInfoApp);
                Object objD = hVarK0.f37106b.d();
                nk.k.b(objD);
                CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD;
                List<wg.s> content = customMonitorConfig.getContent();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : content) {
                    if (((wg.s) obj4) != sVar) {
                        arrayList.add(obj4);
                    }
                }
                hVarK0.h(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, arrayList, 131071, null));
                break;
        }
    }
}
