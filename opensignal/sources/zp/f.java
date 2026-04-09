package zp;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.internal.measurement.b4;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAnswer;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27502a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f27502a) {
            case 0:
                l.e(parcel, "parcel");
                return new MicroSurveyPointTextAnswer(parcel.readString(), parcel.readString());
            default:
                int iH0 = b4.h0(parcel);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zQ = false;
                boolean zQ2 = false;
                int iV = 0;
                while (parcel.dataPosition() < iH0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) b4.s(parcel, i10, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zQ = b4.Q(parcel, i10);
                            break;
                        case 3:
                            zQ2 = b4.Q(parcel, i10);
                            break;
                        case 4:
                            int iX = b4.X(parcel, i10);
                            int iDataPosition = parcel.dataPosition();
                            if (iX != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iX);
                                break;
                            } else {
                                iArrCreateIntArray = null;
                                break;
                            }
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            iV = b4.V(parcel, i10);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            int iX2 = b4.X(parcel, i10);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iX2 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iX2);
                                break;
                            } else {
                                iArrCreateIntArray2 = null;
                                break;
                            }
                        default:
                            b4.e0(parcel, i10);
                            break;
                    }
                }
                b4.y(parcel, iH0);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zQ, zQ2, iArrCreateIntArray, iV, iArrCreateIntArray2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f27502a) {
            case 0:
                return new MicroSurveyPointTextAnswer[i10];
            default:
                return new ConnectionTelemetryConfiguration[i10];
        }
    }
}
