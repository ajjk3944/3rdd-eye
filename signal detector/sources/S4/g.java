package S4;

import android.location.Address;
import android.location.Geocoder;
import d5.AbstractC2282j;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Geocoder.GeocodeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q5.o f3527b;

    public /* synthetic */ g(q5.o oVar, int i) {
        this.f3526a = i;
        this.f3527b = oVar;
    }

    @Override // android.location.Geocoder.GeocodeListener
    public final void onGeocode(List list) {
        switch (this.f3526a) {
            case 0:
                q5.o oVar = this.f3527b;
                q5.i.b(list);
                Address address = (Address) AbstractC2282j.U(list);
                oVar.f23299a = address != null ? address.getAddressLine(0) : null;
                break;
            case 1:
                q5.o oVar2 = this.f3527b;
                q5.i.b(list);
                Address address2 = (Address) AbstractC2282j.U(list);
                oVar2.f23299a = address2 != null ? address2.getAddressLine(0) : null;
                break;
            default:
                q5.o oVar3 = this.f3527b;
                q5.i.b(list);
                Address address3 = (Address) AbstractC2282j.U(list);
                oVar3.f23299a = address3 != null ? address3.getAddressLine(0) : null;
                break;
        }
    }
}
