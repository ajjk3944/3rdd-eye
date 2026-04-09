package sh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.liuzh.deviceinfo.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class n0 extends a {
    public View Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f33739a0;

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.Z == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tab_sensors, viewGroup, false);
            this.Z = viewInflate;
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
            this.f33739a0 = recyclerView;
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            dj.b.k(recyclerView, com.liuzh.deviceinfo.utilities.f.d());
            TextView textView = (TextView) this.Z.findViewById(R.id.sensor_count);
            int iA = com.liuzh.deviceinfo.utilities.f.a();
            if (iA == this.Z.getContext().getColor(R.color.colorAccent)) {
                iA = cm.g.H(this.Z.getContext().getColor(R.color.colorPrimary), 0.9f);
            }
            textView.setTextColor(iA);
            new Thread(new k1.b(17, this, textView)).start();
        }
        return this.Z;
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        com.applovin.impl.sdk.ad.f fVar = new com.applovin.impl.sdk.ad.f(18, this, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, fVar);
    }
}
