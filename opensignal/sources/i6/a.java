package i6;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import br.l;
import coil.memory.MemoryCache$Key;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.libs.identity.zzee;
import com.google.android.gms.libs.identity.zzeg;
import com.google.android.gms.libs.identity.zzei;
import com.google.android.gms.libs.identity.zzl;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzal;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.messaging.RemoteMessage;
import com.staircase3.opensignal.library.cells.CellObject;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.models.PlaceType;
import com.staircase3.opensignal.refactor.SpeedTestItem;
import com.staircase3.opensignal.utils.m;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixAnswerItem;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixColumnItem;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem;
import com.survicate.surveys.utils.SurvicateLocalDate;
import g4.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11247a;

    public /* synthetic */ a(int i10) {
        this.f11247a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f11247a) {
            case 0:
                return new VorbisComment(parcel);
            case 1:
                l.e(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                long j = parcel.readLong();
                long j7 = parcel.readLong();
                LatLng latLng = (LatLng) parcel.readParcelable(SpeedTestItem.class.getClassLoader());
                String string3 = parcel.readString();
                boolean z15 = false;
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z15 = true;
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z11 = z10;
                }
                return new SpeedTestItem(string, string2, j, j7, latLng, string3, z15, string4, z11, parcel.readString(), parcel.readInt() == 0 ? null : PlaceType.CREATOR.createFromParcel(parcel));
            case 2:
                l.e(parcel, "parcel");
                long j10 = parcel.readLong();
                String string5 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(MicroSurveyPointMatrixColumnItem.CREATOR.createFromParcel(parcel));
                }
                boolean z16 = true;
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = true;
                    z16 = false;
                }
                return new MicroSurveyPointMatrixAnswerItem(j10, string5, arrayList, z16, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? z12 : false);
            case 3:
                l.e(parcel, "parcel");
                return new MicroSurveyPointMatrixColumnItem(parcel.readLong(), parcel.readString(), parcel.readString());
            case 4:
                l.e(parcel, "parcel");
                return new SurvicateLocalDate(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case j.STRING_FIELD_NUMBER /* 5 */:
                return new HlsTrackMetadataEntry(parcel);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                String string6 = parcel.readString();
                l.b(string6);
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    String string7 = parcel.readString();
                    l.b(string7);
                    String string8 = parcel.readString();
                    l.b(string8);
                    linkedHashMap.put(string7, string8);
                }
                return new MemoryCache$Key(string6, linkedHashMap);
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                int iH0 = b4.h0(parcel);
                Bundle bundleR = null;
                while (parcel.dataPosition() < iH0) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 2) {
                        b4.e0(parcel, i14);
                    } else {
                        bundleR = b4.r(parcel, i14);
                    }
                }
                b4.y(parcel, iH0);
                return new RemoteMessage(bundleR);
            case j.BYTES_FIELD_NUMBER /* 8 */:
                l.e(parcel, "parcel");
                long j11 = parcel.readLong();
                String string9 = parcel.readString();
                boolean z17 = false;
                if (parcel.readInt() != 0) {
                    z13 = false;
                    z17 = true;
                    z14 = true;
                } else {
                    z13 = false;
                    z14 = true;
                }
                String string10 = parcel.readString();
                boolean z18 = z14;
                String string11 = parcel.readString();
                boolean z19 = z18;
                String string12 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z19 = z13;
                }
                return new MicroSurveyPointMultipleAnswerItem(j11, string9, z17, string10, string11, string12, z19);
            case 9:
                return new TrackSelectionParameters(parcel);
            case 10:
                int iH02 = b4.h0(parcel);
                IBinder iBinderU = null;
                IBinder iBinderU2 = null;
                PendingIntent pendingIntent = null;
                String strT = null;
                int iV = 0;
                while (parcel.dataPosition() < iH02) {
                    int i15 = parcel.readInt();
                    char c4 = (char) i15;
                    if (c4 == 1) {
                        iV = b4.V(parcel, i15);
                    } else if (c4 == 2) {
                        iBinderU = b4.U(parcel, i15);
                    } else if (c4 == 3) {
                        iBinderU2 = b4.U(parcel, i15);
                    } else if (c4 == 4) {
                        pendingIntent = (PendingIntent) b4.s(parcel, i15, PendingIntent.CREATOR);
                    } else if (c4 != 6) {
                        b4.e0(parcel, i15);
                    } else {
                        strT = b4.t(parcel, i15);
                    }
                }
                b4.y(parcel, iH02);
                return new zzee(iV, iBinderU, iBinderU2, pendingIntent, strT);
            case 11:
                int iH03 = b4.h0(parcel);
                long jW = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                ArrayList arrayListV = null;
                boolean zQ = false;
                boolean zQ2 = false;
                boolean zQ3 = false;
                boolean zQ4 = false;
                while (parcel.dataPosition() < iH03) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 1) {
                        locationRequest = (LocationRequest) b4.s(parcel, i16, LocationRequest.CREATOR);
                    } else if (c10 == 5) {
                        arrayListV = b4.v(parcel, i16, ClientIdentity.CREATOR);
                    } else if (c10 == '\b') {
                        zQ = b4.Q(parcel, i16);
                    } else if (c10 != '\t') {
                        switch (c10) {
                            case 11:
                                zQ3 = b4.Q(parcel, i16);
                                break;
                            case '\f':
                                zQ4 = b4.Q(parcel, i16);
                                break;
                            case '\r':
                                b4.t(parcel, i16);
                                break;
                            case 14:
                                jW = b4.W(parcel, i16);
                                break;
                            default:
                                b4.e0(parcel, i16);
                                break;
                        }
                    } else {
                        zQ2 = b4.Q(parcel, i16);
                    }
                }
                b4.y(parcel, iH03);
                return new zzeg(locationRequest, arrayListV, zQ, zQ2, zQ3, zQ4, jW);
            case 12:
                int iH04 = b4.h0(parcel);
                zzeg zzegVar = null;
                IBinder iBinderU3 = null;
                IBinder iBinderU4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinderU5 = null;
                String strT2 = null;
                int iV2 = 1;
                while (parcel.dataPosition() < iH04) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iV2 = b4.V(parcel, i17);
                            break;
                        case 2:
                            zzegVar = (zzeg) b4.s(parcel, i17, zzeg.CREATOR);
                            break;
                        case 3:
                            iBinderU3 = b4.U(parcel, i17);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) b4.s(parcel, i17, PendingIntent.CREATOR);
                            break;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                            iBinderU4 = b4.U(parcel, i17);
                            break;
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            iBinderU5 = b4.U(parcel, i17);
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        default:
                            b4.e0(parcel, i17);
                            break;
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            strT2 = b4.t(parcel, i17);
                            break;
                    }
                }
                b4.y(parcel, iH04);
                return new zzei(iV2, zzegVar, iBinderU3, iBinderU4, pendingIntent2, iBinderU5, strT2);
            case 13:
                int iH05 = b4.h0(parcel);
                String strT3 = null;
                String strT4 = null;
                String strT5 = null;
                ArrayList arrayListV2 = null;
                com.google.android.gms.libs.identity.ClientIdentity clientIdentity = null;
                int iV3 = 0;
                while (parcel.dataPosition() < iH05) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        iV3 = b4.V(parcel, i18);
                    } else if (c11 == 3) {
                        strT3 = b4.t(parcel, i18);
                    } else if (c11 == 4) {
                        strT4 = b4.t(parcel, i18);
                    } else if (c11 == 6) {
                        strT5 = b4.t(parcel, i18);
                    } else if (c11 == 7) {
                        clientIdentity = (com.google.android.gms.libs.identity.ClientIdentity) b4.s(parcel, i18, com.google.android.gms.libs.identity.ClientIdentity.CREATOR);
                    } else if (c11 != '\b') {
                        b4.e0(parcel, i18);
                    } else {
                        arrayListV2 = b4.v(parcel, i18, Feature.CREATOR);
                    }
                }
                b4.y(parcel, iH05);
                return new com.google.android.gms.libs.identity.ClientIdentity(iV3, strT3, strT4, strT5, arrayListV2, clientIdentity);
            case 14:
                int iH06 = b4.h0(parcel);
                Status status = null;
                while (parcel.dataPosition() < iH06) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        b4.e0(parcel, i19);
                    } else {
                        status = (Status) b4.s(parcel, i19, Status.CREATOR);
                    }
                }
                b4.y(parcel, iH06);
                return new zzl(status);
            case 15:
                String string13 = parcel.readString();
                string13.getClass();
                return new AppInfoTable(parcel.readInt(), string13);
            case 16:
                return new EventMessage(parcel);
            case 17:
                return new ColorInfo(parcel);
            case 18:
                CellObject cellObject = new CellObject(false);
                cellObject.f6124r = "- ";
                cellObject.f6125x = true;
                cellObject.B = false;
                cellObject.f6122d = parcel.readInt();
                cellObject.f6121a = parcel.readInt();
                cellObject.f6125x = parcel.readByte() != 0;
                cellObject.B = parcel.readByte() != 0;
                cellObject.f6126y = new com.staircase3.opensignal.utils.j(parcel.readFloat(), parcel.readFloat());
                cellObject.f6124r = parcel.readString();
                cellObject.f6123g = parcel.readInt();
                return cellObject;
            case 19:
                return new PictureFrame(parcel);
            case 20:
                return new com.google.android.exoplayer2.metadata.flac.VorbisComment(parcel);
            case 21:
                l.e(parcel, "parcel");
                return new NetworkUiState(m.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), um.a.valueOf(parcel.readString()), com.staircase3.opensignal.utils.l.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 22:
                l.e(parcel, "parcel");
                return PlaceType.valueOf(parcel.readString());
            case 23:
                return new IcyHeaders(parcel);
            case 24:
                return new IcyInfo(parcel);
            case 25:
                int iH07 = b4.h0(parcel);
                com.google.android.gms.libs.identity.ClientIdentity clientIdentity2 = null;
                int iV4 = 0;
                boolean zQ5 = false;
                long jW2 = Long.MAX_VALUE;
                while (parcel.dataPosition() < iH07) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        jW2 = b4.W(parcel, i20);
                    } else if (c12 == 2) {
                        iV4 = b4.V(parcel, i20);
                    } else if (c12 == 3) {
                        zQ5 = b4.Q(parcel, i20);
                    } else if (c12 != 5) {
                        b4.e0(parcel, i20);
                    } else {
                        clientIdentity2 = (com.google.android.gms.libs.identity.ClientIdentity) b4.s(parcel, i20, com.google.android.gms.libs.identity.ClientIdentity.CREATOR);
                    }
                }
                b4.y(parcel, iH07);
                return new LastLocationRequest(jW2, iV4, zQ5, clientIdentity2);
            case 26:
                int iH08 = b4.h0(parcel);
                zzal[] zzalVarArr = null;
                long jW3 = 0;
                int iV5 = 1;
                int iV6 = 1;
                int iV7 = 1000;
                while (parcel.dataPosition() < iH08) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iV5 = b4.V(parcel, i21);
                            break;
                        case 2:
                            iV6 = b4.V(parcel, i21);
                            break;
                        case 3:
                            jW3 = b4.W(parcel, i21);
                            break;
                        case 4:
                            iV7 = b4.V(parcel, i21);
                            break;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                            zzalVarArr = (zzal[]) b4.u(parcel, i21, zzal.CREATOR);
                            break;
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            b4.Q(parcel, i21);
                            break;
                        default:
                            b4.e0(parcel, i21);
                            break;
                    }
                }
                b4.y(parcel, iH08);
                return new LocationAvailability(iV7, iV5, iV6, jW3, zzalVarArr);
            case 27:
                int iH09 = b4.h0(parcel);
                WorkSource workSource = new WorkSource();
                com.google.android.gms.libs.identity.ClientIdentity clientIdentity3 = null;
                boolean zQ6 = false;
                int iV8 = 0;
                int iV9 = 0;
                boolean zQ7 = false;
                long jW4 = -1;
                float fS = 0.0f;
                int iV10 = Integer.MAX_VALUE;
                long jW5 = Long.MAX_VALUE;
                long jW6 = Long.MAX_VALUE;
                long jW7 = 0;
                long jW8 = 600000;
                long jW9 = 3600000;
                int iV11 = 102;
                while (parcel.dataPosition() < iH09) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            iV11 = b4.V(parcel, i22);
                            break;
                        case 2:
                            jW9 = b4.W(parcel, i22);
                            break;
                        case 3:
                            jW8 = b4.W(parcel, i22);
                            break;
                        case 4:
                        case 14:
                        default:
                            b4.e0(parcel, i22);
                            break;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                            jW5 = b4.W(parcel, i22);
                            break;
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            iV10 = b4.V(parcel, i22);
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            fS = b4.S(parcel, i22);
                            break;
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            jW7 = b4.W(parcel, i22);
                            break;
                        case '\t':
                            zQ6 = b4.Q(parcel, i22);
                            break;
                        case '\n':
                            jW6 = b4.W(parcel, i22);
                            break;
                        case 11:
                            jW4 = b4.W(parcel, i22);
                            break;
                        case '\f':
                            iV8 = b4.V(parcel, i22);
                            break;
                        case '\r':
                            iV9 = b4.V(parcel, i22);
                            break;
                        case 15:
                            zQ7 = b4.Q(parcel, i22);
                            break;
                        case 16:
                            workSource = (WorkSource) b4.s(parcel, i22, WorkSource.CREATOR);
                            break;
                        case 17:
                            clientIdentity3 = (com.google.android.gms.libs.identity.ClientIdentity) b4.s(parcel, i22, com.google.android.gms.libs.identity.ClientIdentity.CREATOR);
                            break;
                    }
                }
                b4.y(parcel, iH09);
                return new LocationRequest(iV11, jW9, jW8, jW7, jW5, jW6, iV10, fS, zQ6, jW4, iV8, iV9, zQ7, workSource, clientIdentity3);
            case 28:
                int iH010 = b4.h0(parcel);
                List listV = LocationResult.f5313d;
                while (parcel.dataPosition() < iH010) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        b4.e0(parcel, i23);
                    } else {
                        listV = b4.v(parcel, i23, Location.CREATOR);
                    }
                }
                b4.y(parcel, iH010);
                return new LocationResult(listV);
            default:
                int iH011 = b4.h0(parcel);
                boolean zQ8 = false;
                ArrayList arrayListV3 = null;
                boolean zQ9 = false;
                while (parcel.dataPosition() < iH011) {
                    int i24 = parcel.readInt();
                    char c13 = (char) i24;
                    if (c13 == 1) {
                        arrayListV3 = b4.v(parcel, i24, LocationRequest.CREATOR);
                    } else if (c13 == 2) {
                        zQ8 = b4.Q(parcel, i24);
                    } else if (c13 != 3) {
                        b4.e0(parcel, i24);
                    } else {
                        zQ9 = b4.Q(parcel, i24);
                    }
                }
                b4.y(parcel, iH011);
                return new LocationSettingsRequest(arrayListV3, zQ8, zQ9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f11247a) {
            case 0:
                return new VorbisComment[i10];
            case 1:
                return new SpeedTestItem[i10];
            case 2:
                return new MicroSurveyPointMatrixAnswerItem[i10];
            case 3:
                return new MicroSurveyPointMatrixColumnItem[i10];
            case 4:
                return new SurvicateLocalDate[i10];
            case j.STRING_FIELD_NUMBER /* 5 */:
                return new HlsTrackMetadataEntry[i10];
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new MemoryCache$Key[i10];
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new RemoteMessage[i10];
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new MicroSurveyPointMultipleAnswerItem[i10];
            case 9:
                return new TrackSelectionParameters[i10];
            case 10:
                return new zzee[i10];
            case 11:
                return new zzeg[i10];
            case 12:
                return new zzei[i10];
            case 13:
                return new com.google.android.gms.libs.identity.ClientIdentity[i10];
            case 14:
                return new zzl[i10];
            case 15:
                return new AppInfoTable[i10];
            case 16:
                return new EventMessage[i10];
            case 17:
                return new ColorInfo[i10];
            case 18:
                return new CellObject[i10];
            case 19:
                return new PictureFrame[i10];
            case 20:
                return new com.google.android.exoplayer2.metadata.flac.VorbisComment[i10];
            case 21:
                return new NetworkUiState[i10];
            case 22:
                return new PlaceType[i10];
            case 23:
                return new IcyHeaders[i10];
            case 24:
                return new IcyInfo[i10];
            case 25:
                return new LastLocationRequest[i10];
            case 26:
                return new LocationAvailability[i10];
            case 27:
                return new LocationRequest[i10];
            case 28:
                return new LocationResult[i10];
            default:
                return new LocationSettingsRequest[i10];
        }
    }
}
