package sh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.DeviceOverviewOtherCard;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class p extends a {
    public DeviceOverviewOtherCard Z;

    /* renamed from: a0, reason: collision with root package name */
    public View f33744a0;

    /* renamed from: b0, reason: collision with root package name */
    public b5.t f33745b0;

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.f33745b0 = (b5.t) h(new b5.o0(4), new m(this));
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        if (this.f33744a0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tab_device, viewGroup, false);
            this.f33744a0 = viewInflate;
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            dj.b.m((ScrollView) viewInflate, com.liuzh.deviceinfo.utilities.f.d());
            DeviceOverviewOtherCard deviceOverviewOtherCard = (DeviceOverviewOtherCard) this.f33744a0.findViewById(R.id.card_device_overview_other);
            this.Z = deviceOverviewOtherCard;
            deviceOverviewOtherCard.setPermissionRequester(new m(this));
        }
        return this.f33744a0;
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        o oVar = new o(0, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, oVar);
    }
}
