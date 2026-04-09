package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hb1 extends ao0 {
    public final cc0 i;

    public hb1(cc0 cc0Var) {
        this.i = cc0Var;
    }

    @Override // defpackage.ao0
    public final int a() {
        return this.i.b0.k;
    }

    @Override // defpackage.ao0
    public final void d(wo0 wo0Var, int i) {
        cc0 cc0Var = this.i;
        int i2 = cc0Var.b0.f.h + i;
        TextView textView = ((gb1) wo0Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(g41.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        vq2 vq2Var = cc0Var.e0;
        if (g41.b().get(1) == i2) {
            Object obj = vq2Var.h;
        } else {
            Object obj2 = vq2Var.g;
        }
        throw null;
    }

    @Override // defpackage.ao0
    public final wo0 e(ViewGroup viewGroup, int i) {
        return new gb1((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
