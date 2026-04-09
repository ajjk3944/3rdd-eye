package sh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.liuzh.deviceinfo.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class q0 extends a {
    public View Z;

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        if (this.Z == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tab_system, viewGroup, false);
            this.Z = viewInflate;
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            dj.b.m((ScrollView) viewInflate, com.liuzh.deviceinfo.utilities.f.d());
        }
        return this.Z;
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        ph.d dVar = new ph.d(6, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, dVar);
    }
}
