package sh;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.liuzh.deviceinfo.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class q extends a {
    public View Z;

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        if (this.Z == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tab_display, viewGroup, false);
            this.Z = viewInflate;
            ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            dj.b.m(scrollView, com.liuzh.deviceinfo.utilities.f.d());
            FloatingActionButton floatingActionButton = (FloatingActionButton) this.Z.findViewById(R.id.fullscreen);
            if (com.liuzh.deviceinfo.utilities.d.k()) {
                com.liuzh.deviceinfo.utilities.y.k(floatingActionButton);
            }
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(com.liuzh.deviceinfo.utilities.f.a()));
            floatingActionButton.setOnClickListener(new com.applovin.mediation.nativeAds.a(21, this));
        }
        return this.Z;
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        com.applovin.impl.sdk.ad.f fVar = new com.applovin.impl.sdk.ad.f(17, (ScrollView) view.findViewById(R.id.scroll_view), view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, fVar);
    }
}
