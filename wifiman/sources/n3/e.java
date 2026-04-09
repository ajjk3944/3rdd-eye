package N3;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class e extends A3.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // A3.b
    protected final boolean n0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                A3.c.b(parcel);
                break;
            case 4:
                A3.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                A3.c.b(parcel);
                break;
            case 7:
                A3.c.b(parcel);
                break;
            case 8:
                l lVar = (l) A3.c.a(parcel, l.CREATOR);
                A3.c.b(parcel);
                b0(lVar);
                break;
            case 9:
                A3.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
