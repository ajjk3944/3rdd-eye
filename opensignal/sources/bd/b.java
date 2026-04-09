package bd;

import android.os.Parcel;
import bc.z;
import com.google.android.gms.signin.internal.zak;
import g4.j;

/* loaded from: classes.dex */
public abstract class b extends mc.a {
    @Override // mc.a
    public final boolean R(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                mc.b.b(parcel);
                break;
            case 4:
                mc.b.b(parcel);
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                mc.b.b(parcel);
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                mc.b.b(parcel);
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                zak zakVar = (zak) mc.b.a(parcel, zak.CREATOR);
                mc.b.b(parcel);
                z zVar = (z) this;
                zVar.f2667f.post(new re.a(3, zVar, zakVar, false));
                break;
            case 9:
                mc.b.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
