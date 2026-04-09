package mn;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.google.android.material.chip.Chip;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.utils.u;
import com.staircase3.opensignal.viewcontrollers.TabCoverage;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16893b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f16892a = i10;
        this.f16893b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f16892a) {
            case 0:
                TabCoverage tabCoverage = (TabCoverage) this.f16893b;
                if (!z10) {
                    compoundButton.setTextColor(u.b(tabCoverage.n(), qk.d.coverage_info_dialogs_header_text));
                    break;
                } else {
                    sm.g gVar = (sm.g) compoundButton.getTag();
                    if (gVar != null) {
                        Context contextN = tabCoverage.n();
                        q.a(contextN).putString("filtered_network_name", gVar.f22131a).apply();
                        Context contextN2 = tabCoverage.n();
                        q.a(contextN2).putInt("filtered_network_id", gVar.f22132b).apply();
                    }
                    tabCoverage.w0();
                    compoundButton.setTextColor(u.b(tabCoverage.n(), qk.d.os4_blue_main));
                    break;
                }
            case 1:
                TabCoverage tabCoverage2 = (TabCoverage) this.f16893b;
                if (!z10) {
                    compoundButton.setTextColor(u.b(tabCoverage2.n(), qk.d.coverage_info_dialogs_header_text));
                    break;
                } else {
                    sm.g gVar2 = (sm.g) compoundButton.getTag();
                    if (gVar2 != null) {
                        Context contextN3 = tabCoverage2.n();
                        q.a(contextN3).putString("filtered_network_name", gVar2.f22131a).apply();
                        Context contextN4 = tabCoverage2.n();
                        q.a(contextN4).putInt("filtered_network_id", gVar2.f22132b).apply();
                    }
                    tabCoverage2.r0();
                    tabCoverage2.s0();
                    ((RelativeLayout) tabCoverage2.f6203x0.f833c.f10470a).setVisibility(0);
                    tabCoverage2.y0(true);
                    tabCoverage2.q0();
                    tabCoverage2.v0();
                    tabCoverage2.u0();
                    compoundButton.setTextColor(u.b(tabCoverage2.n(), qk.d.os4_blue_main));
                    break;
                }
            default:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f16893b).E;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    break;
                }
                break;
        }
    }
}
