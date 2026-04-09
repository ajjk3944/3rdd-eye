package tc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import br.l;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.zzal;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.android.gms.maps.model.Tile;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem;
import java.util.ArrayList;
import lf.t1;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22697a;

    public /* synthetic */ c(int i10) {
        this.f22697a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        boolean z11;
        switch (this.f22697a) {
            case 0:
                int iH0 = b4.h0(parcel);
                Status status = null;
                LocationSettingsStates locationSettingsStates = null;
                while (parcel.dataPosition() < iH0) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        status = (Status) b4.s(parcel, i10, Status.CREATOR);
                    } else if (c4 != 2) {
                        b4.e0(parcel, i10);
                    } else {
                        locationSettingsStates = (LocationSettingsStates) b4.s(parcel, i10, LocationSettingsStates.CREATOR);
                    }
                }
                b4.y(parcel, iH0);
                return new LocationSettingsResult(status, locationSettingsStates);
            case 1:
                int iH02 = b4.h0(parcel);
                boolean zQ = false;
                boolean zQ2 = false;
                boolean zQ3 = false;
                boolean zQ4 = false;
                boolean zQ5 = false;
                boolean zQ6 = false;
                while (parcel.dataPosition() < iH02) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            zQ = b4.Q(parcel, i11);
                            break;
                        case 2:
                            zQ2 = b4.Q(parcel, i11);
                            break;
                        case 3:
                            zQ3 = b4.Q(parcel, i11);
                            break;
                        case 4:
                            zQ4 = b4.Q(parcel, i11);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            zQ5 = b4.Q(parcel, i11);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            zQ6 = b4.Q(parcel, i11);
                            break;
                        default:
                            b4.e0(parcel, i11);
                            break;
                    }
                }
                b4.y(parcel, iH02);
                return new LocationSettingsStates(zQ, zQ2, zQ3, zQ4, zQ5, zQ6);
            case 2:
                int iH03 = b4.h0(parcel);
                long jW = -1;
                long jW2 = -1;
                int iV = 1;
                int iV2 = 1;
                while (parcel.dataPosition() < iH03) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iV = b4.V(parcel, i12);
                    } else if (c10 == 2) {
                        iV2 = b4.V(parcel, i12);
                    } else if (c10 == 3) {
                        jW = b4.W(parcel, i12);
                    } else if (c10 != 4) {
                        b4.e0(parcel, i12);
                    } else {
                        jW2 = b4.W(parcel, i12);
                    }
                }
                b4.y(parcel, iH03);
                return new zzal(iV, iV2, jW, jW2);
            case 3:
                return new ApicFrame(parcel);
            case 4:
                return new BinaryFrame(parcel);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new ChapterFrame(parcel);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ChapterTocFrame(parcel);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new CommentFrame(parcel);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new GeobFrame(parcel);
            case 9:
                return new InternalFrame(parcel);
            case 10:
                return new MlltFrame(parcel);
            case 11:
                return new PrivFrame(parcel);
            case 12:
                return new TextInformationFrame(parcel);
            case 13:
                return new UrlLinkFrame(parcel);
            case 14:
                int iH04 = b4.h0(parcel);
                int iV3 = 0;
                int iV4 = 0;
                byte bR = -1;
                byte bR2 = -1;
                CameraPosition cameraPosition = null;
                byte bR3 = -1;
                byte bR4 = -1;
                byte bR5 = -1;
                byte bR6 = -1;
                byte bR7 = -1;
                byte bR8 = -1;
                byte bR9 = -1;
                byte bR10 = -1;
                byte bR11 = -1;
                Float fT = null;
                Float fT2 = null;
                LatLngBounds latLngBounds = null;
                byte bR12 = -1;
                Integer numValueOf = null;
                String strT = null;
                while (parcel.dataPosition() < iH04) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            bR = b4.R(parcel, i13);
                            break;
                        case 3:
                            bR2 = b4.R(parcel, i13);
                            break;
                        case 4:
                            iV3 = b4.V(parcel, i13);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            cameraPosition = (CameraPosition) b4.s(parcel, i13, CameraPosition.CREATOR);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            bR3 = b4.R(parcel, i13);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            bR4 = b4.R(parcel, i13);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            bR5 = b4.R(parcel, i13);
                            break;
                        case '\t':
                            bR6 = b4.R(parcel, i13);
                            break;
                        case '\n':
                            bR7 = b4.R(parcel, i13);
                            break;
                        case 11:
                            bR8 = b4.R(parcel, i13);
                            break;
                        case '\f':
                            bR9 = b4.R(parcel, i13);
                            break;
                        case '\r':
                        case 22:
                        default:
                            b4.e0(parcel, i13);
                            break;
                        case 14:
                            bR10 = b4.R(parcel, i13);
                            break;
                        case 15:
                            bR11 = b4.R(parcel, i13);
                            break;
                        case 16:
                            fT = b4.T(parcel, i13);
                            break;
                        case 17:
                            fT2 = b4.T(parcel, i13);
                            break;
                        case 18:
                            latLngBounds = (LatLngBounds) b4.s(parcel, i13, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            bR12 = b4.R(parcel, i13);
                            break;
                        case 20:
                            int iX = b4.X(parcel, i13);
                            if (iX != 0) {
                                b4.j0(parcel, iX, 4);
                                numValueOf = Integer.valueOf(parcel.readInt());
                                break;
                            } else {
                                numValueOf = null;
                                break;
                            }
                        case 21:
                            strT = b4.t(parcel, i13);
                            break;
                        case 23:
                            iV4 = b4.V(parcel, i13);
                            break;
                    }
                }
                b4.y(parcel, iH04);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.f5332g = -1;
                googleMapOptions.J = null;
                googleMapOptions.K = null;
                googleMapOptions.L = null;
                googleMapOptions.N = null;
                googleMapOptions.O = null;
                googleMapOptions.f5330a = t1.L(bR);
                googleMapOptions.f5331d = t1.L(bR2);
                googleMapOptions.f5332g = iV3;
                googleMapOptions.f5333r = cameraPosition;
                googleMapOptions.f5334x = t1.L(bR3);
                googleMapOptions.f5335y = t1.L(bR4);
                googleMapOptions.B = t1.L(bR5);
                googleMapOptions.D = t1.L(bR6);
                googleMapOptions.E = t1.L(bR7);
                googleMapOptions.F = t1.L(bR8);
                googleMapOptions.G = t1.L(bR9);
                googleMapOptions.H = t1.L(bR10);
                googleMapOptions.I = t1.L(bR11);
                googleMapOptions.J = fT;
                googleMapOptions.K = fT2;
                googleMapOptions.L = latLngBounds;
                googleMapOptions.M = t1.L(bR12);
                googleMapOptions.N = numValueOf;
                googleMapOptions.O = strT;
                googleMapOptions.P = iV4;
                return googleMapOptions;
            case 15:
                return new ParcelImpl(parcel);
            case 16:
                return new MdtaMetadataEntry(parcel);
            case 17:
                return new MotionPhotoMetadata(parcel);
            case 18:
                return new SmtaMetadataEntry(parcel);
            case 19:
                int iH05 = b4.h0(parcel);
                String strT2 = null;
                String strT3 = null;
                String strT4 = null;
                String strT5 = null;
                Uri uri = null;
                String strT6 = null;
                String strT7 = null;
                ArrayList arrayListV = null;
                String strT8 = null;
                String strT9 = null;
                long jW3 = 0;
                while (parcel.dataPosition() < iH05) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strT2 = b4.t(parcel, i14);
                            break;
                        case 3:
                            strT3 = b4.t(parcel, i14);
                            break;
                        case 4:
                            strT4 = b4.t(parcel, i14);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            strT5 = b4.t(parcel, i14);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) b4.s(parcel, i14, Uri.CREATOR);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            strT6 = b4.t(parcel, i14);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            jW3 = b4.W(parcel, i14);
                            break;
                        case '\t':
                            strT7 = b4.t(parcel, i14);
                            break;
                        case '\n':
                            arrayListV = b4.v(parcel, i14, Scope.CREATOR);
                            break;
                        case 11:
                            strT8 = b4.t(parcel, i14);
                            break;
                        case '\f':
                            strT9 = b4.t(parcel, i14);
                            break;
                        default:
                            b4.e0(parcel, i14);
                            break;
                    }
                }
                b4.y(parcel, iH05);
                return new GoogleSignInAccount(strT2, strT3, strT4, strT5, uri, strT6, jW3, strT7, arrayListV, strT8, strT9);
            case 20:
                l.e(parcel, "parcel");
                long j = parcel.readLong();
                String string = parcel.readString();
                boolean z12 = false;
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = true;
                    z13 = z10;
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z14 = z11;
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z14 = z10;
                }
                return new MicroSurveyPointSingleAnswerItem(j, string, z12, z13, string2, string3, string4, z14);
            case 21:
                return new PrivateCommand(parcel);
            case 22:
                return new SpliceInsertCommand(parcel);
            case 23:
                return new SpliceNullCommand();
            case 24:
                return new SpliceScheduleCommand(parcel);
            case 25:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 26:
                int iH06 = b4.h0(parcel);
                float fS = 0.0f;
                float fS2 = 0.0f;
                LatLng latLng = null;
                float fS3 = 0.0f;
                while (parcel.dataPosition() < iH06) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 2) {
                        latLng = (LatLng) b4.s(parcel, i15, LatLng.CREATOR);
                    } else if (c11 == 3) {
                        fS = b4.S(parcel, i15);
                    } else if (c11 == 4) {
                        fS3 = b4.S(parcel, i15);
                    } else if (c11 != 5) {
                        b4.e0(parcel, i15);
                    } else {
                        fS2 = b4.S(parcel, i15);
                    }
                }
                b4.y(parcel, iH06);
                return new CameraPosition(latLng, fS, fS3, fS2);
            case 27:
                int iH07 = b4.h0(parcel);
                StampStyle stampStyle = null;
                int iV5 = 0;
                int iV6 = 0;
                boolean zQ7 = false;
                float fS4 = 0.0f;
                while (parcel.dataPosition() < iH07) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 2) {
                        fS4 = b4.S(parcel, i16);
                    } else if (c12 == 3) {
                        iV5 = b4.V(parcel, i16);
                    } else if (c12 == 4) {
                        iV6 = b4.V(parcel, i16);
                    } else if (c12 == 5) {
                        zQ7 = b4.Q(parcel, i16);
                    } else if (c12 != 6) {
                        b4.e0(parcel, i16);
                    } else {
                        stampStyle = (StampStyle) b4.s(parcel, i16, StampStyle.CREATOR);
                    }
                }
                b4.y(parcel, iH07);
                return new StrokeStyle(fS4, iV5, iV6, zQ7, stampStyle);
            case 28:
                int iH08 = b4.h0(parcel);
                double d6 = 0.0d;
                StrokeStyle strokeStyle = null;
                while (parcel.dataPosition() < iH08) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 2) {
                        strokeStyle = (StrokeStyle) b4.s(parcel, i17, StrokeStyle.CREATOR);
                    } else if (c13 != 3) {
                        b4.e0(parcel, i17);
                    } else {
                        b4.i0(parcel, i17, 8);
                        d6 = parcel.readDouble();
                    }
                }
                b4.y(parcel, iH08);
                return new StyleSpan(strokeStyle, d6);
            default:
                int iH09 = b4.h0(parcel);
                int iV7 = 0;
                byte[] bArr = null;
                int iV8 = 0;
                while (parcel.dataPosition() < iH09) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 2) {
                        iV7 = b4.V(parcel, i18);
                    } else if (c14 == 3) {
                        iV8 = b4.V(parcel, i18);
                    } else if (c14 != 4) {
                        b4.e0(parcel, i18);
                    } else {
                        int iX2 = b4.X(parcel, i18);
                        int iDataPosition = parcel.dataPosition();
                        if (iX2 == 0) {
                            bArr = null;
                        } else {
                            byte[] bArrCreateByteArray = parcel.createByteArray();
                            parcel.setDataPosition(iDataPosition + iX2);
                            bArr = bArrCreateByteArray;
                        }
                    }
                }
                b4.y(parcel, iH09);
                return new Tile(bArr, iV7, iV8);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f22697a) {
            case 0:
                return new LocationSettingsResult[i10];
            case 1:
                return new LocationSettingsStates[i10];
            case 2:
                return new zzal[i10];
            case 3:
                return new ApicFrame[i10];
            case 4:
                return new BinaryFrame[i10];
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new ChapterFrame[i10];
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ChapterTocFrame[i10];
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new CommentFrame[i10];
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new GeobFrame[i10];
            case 9:
                return new InternalFrame[i10];
            case 10:
                return new MlltFrame[i10];
            case 11:
                return new PrivFrame[i10];
            case 12:
                return new TextInformationFrame[i10];
            case 13:
                return new UrlLinkFrame[i10];
            case 14:
                return new GoogleMapOptions[i10];
            case 15:
                return new ParcelImpl[i10];
            case 16:
                return new MdtaMetadataEntry[i10];
            case 17:
                return new MotionPhotoMetadata[i10];
            case 18:
                return new SmtaMetadataEntry[i10];
            case 19:
                return new GoogleSignInAccount[i10];
            case 20:
                return new MicroSurveyPointSingleAnswerItem[i10];
            case 21:
                return new PrivateCommand[i10];
            case 22:
                return new SpliceInsertCommand[i10];
            case 23:
                return new SpliceNullCommand[i10];
            case 24:
                return new SpliceScheduleCommand[i10];
            case 25:
                return new TimeSignalCommand[i10];
            case 26:
                return new CameraPosition[i10];
            case 27:
                return new StrokeStyle[i10];
            case 28:
                return new StyleSpan[i10];
            default:
                return new Tile[i10];
        }
    }
}
