package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j81 extends xo {
    public f10 p0;
    public final ArrayList q0 = new ArrayList();
    public String r0 = "WiFi";

    @Override // defpackage.xo
    public final Dialog O(Bundle bundle) {
        i5 i5VarG = g();
        if (i5VarG == null) {
            throw new IllegalStateException("Activity cannot be null");
        }
        Dialog dialog = new Dialog(i5VarG, R.style.DialogStyle);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.fragment_wifi_info);
        ArrayList arrayList = this.q0;
        i30.m(arrayList, "<this>");
        Collections.reverse(arrayList);
        this.p0 = new f10(arrayList);
        RecyclerView recyclerView = (RecyclerView) dialog.findViewById(R.id.rv_wifi_info);
        Button button = (Button) dialog.findViewById(R.id.btn_close);
        ((TextView) dialog.findViewById(R.id.tv_wifi_name)).setText(this.r0);
        recyclerView.setHasFixedSize(true);
        f10 f10Var = this.p0;
        if (f10Var == null) {
            i30.S("wifiInfoAdapter");
            throw null;
        }
        recyclerView.setAdapter(f10Var);
        button.setOnClickListener(new uk0(dialog, 3));
        return dialog;
    }
}
