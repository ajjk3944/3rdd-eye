package N4;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.apm.insight.R;
import com.google.android.material.chip.Chip;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.ui.satellite.SatelliteCloudChart;
import com.lefan.signal.ui.wifi.SquatterDetailActivity;
import q2.C2834o;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2985b;

    public /* synthetic */ a(int i, Object obj) {
        this.f2984a = i;
        this.f2985b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
        switch (this.f2984a) {
            case 0:
                c cVar = (c) this.f2985b;
                cVar.f2990C0 = !z6;
                Context contextM = cVar.m();
                if (contextM != null) {
                    boolean z7 = cVar.f2990C0;
                    SharedPreferences sharedPreferences = contextM.getSharedPreferences("sp", 0);
                    q5.i.b(sharedPreferences);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putBoolean("altitude_unit", z7);
                    editorEdit.apply();
                }
                if (!cVar.f2990C0) {
                    C2834o c2834o = cVar.f2988A0;
                    q5.i.b(c2834o);
                    ((TextView) c2834o.f23255e).setText(cVar.r(R.string.altitude) + "(ft)");
                    break;
                } else {
                    C2834o c2834o2 = cVar.f2988A0;
                    q5.i.b(c2834o2);
                    ((TextView) c2834o2.f23255e).setText(cVar.r(R.string.altitude) + "(m)");
                    break;
                }
            case 1:
                ((SatelliteCloudChart) this.f2985b).setUseCompass(z6);
                break;
            case 2:
                SquatterDetailActivity squatterDetailActivity = (SquatterDetailActivity) this.f2985b;
                SquatterBean squatterBean = squatterDetailActivity.f19377Q;
                q5.i.b(squatterBean);
                squatterBean.setKnown(z6);
                L4.h hVar = (L4.h) squatterDetailActivity.f19376P.getValue();
                SquatterBean squatterBean2 = squatterDetailActivity.f19377Q;
                q5.i.b(squatterBean2);
                hVar.a(squatterBean2);
                break;
            default:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f2985b).i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z6);
                    break;
                }
                break;
        }
    }
}
