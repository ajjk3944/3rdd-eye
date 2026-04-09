package N4;

import a2.AbstractC0268d;
import android.content.Context;
import android.net.MacAddress;
import android.net.wifi.MloLink;
import android.os.Build;
import androidx.recyclerview.widget.g0;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j extends AbstractC0268d {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3006m;

    public /* synthetic */ j(int i) {
        this.f3006m = i;
    }

    @Override // a2.AbstractC0271g
    public final void c(BaseViewHolder baseViewHolder, Object obj) {
        MloLink mloLink;
        String str;
        Context contextF;
        int i;
        switch (this.f3006m) {
            case 0:
                k kVar = (k) obj;
                q5.i.e(baseViewHolder, "holder");
                q5.i.e(kVar, "item");
                int i3 = kVar.f3011e;
                if (i3 == 0) {
                    baseViewHolder.setText(R.id.wifi_info_name, kVar.f3007a);
                    baseViewHolder.setText(R.id.wifi_info_info, kVar.f3008b);
                    break;
                } else if (i3 == 1 && Build.VERSION.SDK_INT >= 33 && (mloLink = kVar.f3009c) != null) {
                    baseViewHolder.setText(R.id.mlo_link_id, R2.a.k(Integer.valueOf(mloLink.getLinkId()), "%d"));
                    baseViewHolder.setText(R.id.mlo_link_band, R2.a.k(Integer.valueOf(mloLink.getBand()), "%d"));
                    baseViewHolder.setText(R.id.mlo_link_channel, R2.a.k(Integer.valueOf(mloLink.getChannel()), "%d"));
                    int state = mloLink.getState();
                    baseViewHolder.setText(R.id.mlo_link_sate, state != 0 ? state != 1 ? state != 2 ? state != 3 ? f().getString(R.string.string_unknown) : f().getString(R.string.mlo_link_state_active) : f().getString(R.string.mlo_link_state_idle) : f().getString(R.string.mlo_link_state_unassociated) : f().getString(R.string.mlo_link_state_invalid));
                    MacAddress apMacAddress = mloLink.getApMacAddress();
                    baseViewHolder.setText(R.id.mlo_link_ap_mac, apMacAddress != null ? apMacAddress.toOuiString() : null);
                    MacAddress staMacAddress = mloLink.getStaMacAddress();
                    baseViewHolder.setText(R.id.mlo_link_sta_mac, staMacAddress != null ? staMacAddress.toOuiString() : null);
                    break;
                }
                break;
            case 1:
                W4.e eVar = (W4.e) obj;
                q5.i.e(baseViewHolder, "holder");
                q5.i.e(eVar, "item");
                baseViewHolder.setText(R.id.sensor_name, eVar.f4101b);
                baseViewHolder.setImageResource(R.id.sensor_img, eVar.f4103d);
                break;
            default:
                com.lefan.signal.tracroute.f fVar = (com.lefan.signal.tracroute.f) obj;
                q5.i.e(baseViewHolder, "holder");
                q5.i.e(fVar, "item");
                String str2 = fVar.f18868c;
                int i6 = fVar.f18866a;
                if (i6 == 0) {
                    baseViewHolder.setText(R.id.item_trace_text, str2);
                    break;
                } else if (i6 == 1) {
                    Integer numValueOf = Integer.valueOf(fVar.f18867b);
                    if (R2.a.f3390d) {
                        Locale locale = F4.e.f1457a;
                        str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    }
                    baseViewHolder.setText(R.id.item_trace_hop, str);
                    baseViewHolder.setText(R.id.item_trace_ip, str2);
                    baseViewHolder.setText(R.id.item_trace_time, fVar.f18869d);
                    if (fVar.f18870e) {
                        contextF = f();
                        i = R.string.tools_traceroute_inner_net;
                    } else {
                        contextF = f();
                        i = R.string.tools_traceroute_out_net;
                    }
                    baseViewHolder.setText(R.id.item_trace_place, contextF.getString(i));
                    break;
                }
                break;
        }
    }

    @Override // a2.AbstractC0271g
    public boolean i(int i) {
        switch (this.f3006m) {
            case 1:
                return super.i(i) || i == -99;
            default:
                return super.i(i);
        }
    }

    @Override // a2.AbstractC0271g
    /* renamed from: j */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        switch (this.f3006m) {
            case 1:
                q5.i.e(baseViewHolder, "holder");
                if (baseViewHolder.getItemViewType() != -99) {
                    super.onBindViewHolder(baseViewHolder, i);
                    break;
                } else {
                    W4.e eVar = (W4.e) this.f4668b.get(i);
                    q5.i.e(eVar, "item");
                    baseViewHolder.setText(R.id.sensor_header_title, eVar.f4101b);
                    break;
                }
            default:
                super.onBindViewHolder(baseViewHolder, i);
                break;
        }
    }

    @Override // a2.AbstractC0271g
    /* renamed from: k */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i, List list) {
        switch (this.f3006m) {
            case 1:
                q5.i.e(baseViewHolder, "holder");
                q5.i.e(list, "payloads");
                if (!list.isEmpty()) {
                    if (baseViewHolder.getItemViewType() != -99) {
                        super.onBindViewHolder(baseViewHolder, i, list);
                        break;
                    } else {
                        q5.i.e((W4.e) this.f4668b.get(i), "item");
                        break;
                    }
                } else {
                    onBindViewHolder(baseViewHolder, i);
                    break;
                }
            default:
                super.onBindViewHolder(baseViewHolder, i, list);
                break;
        }
    }

    @Override // a2.AbstractC0271g, androidx.recyclerview.widget.G
    public /* bridge */ /* synthetic */ void onBindViewHolder(g0 g0Var, int i) {
        switch (this.f3006m) {
            case 1:
                onBindViewHolder((BaseViewHolder) g0Var, i);
                break;
            default:
                super.onBindViewHolder(g0Var, i);
                break;
        }
    }

    @Override // a2.AbstractC0271g, androidx.recyclerview.widget.G
    public /* bridge */ /* synthetic */ void onBindViewHolder(g0 g0Var, int i, List list) {
        switch (this.f3006m) {
            case 1:
                onBindViewHolder((BaseViewHolder) g0Var, i, list);
                break;
            default:
                super.onBindViewHolder(g0Var, i, list);
                break;
        }
    }
}
