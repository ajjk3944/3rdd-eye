package zh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import java.util.HashMap;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public int f38294i;

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        return a.f38283b.size();
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) {
        h hVar = (h) x1Var;
        b bVar = (b) a.f38283b.get(i4);
        a.b(hVar.f38296d, bVar.f38285b);
        a.b(hVar.f38297e, bVar.f38286c);
        RadioButton radioButton = hVar.f38295c;
        radioButton.setText(bVar.f38284a);
        radioButton.setChecked(this.f38294i == i4);
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recommend_theme, viewGroup, false);
        h hVar = new h(viewInflate);
        RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.radio);
        hVar.f38295c = radioButton;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iA = com.liuzh.deviceinfo.utilities.f.a();
        HashMap map = dj.b.f22274a;
        k.e(radioButton, "radio");
        radioButton.setButtonTintList(dj.b.c(iA));
        hVar.f38296d = (ImageView) viewInflate.findViewById(R.id.iv_primary_color);
        hVar.f38297e = (ImageView) viewInflate.findViewById(R.id.iv_accent_color);
        viewInflate.setOnClickListener(new yh.e(2, hVar));
        return hVar;
    }
}
