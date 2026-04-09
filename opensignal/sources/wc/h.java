package wc;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import br.l;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAdapterItem;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAnswer;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import java.util.ArrayList;
import qc.j;
import qc.k;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24415a;

    public /* synthetic */ h(int i10) {
        this.f24415a = i10;
    }

    public static void a(zzbg zzbgVar, Parcel parcel, int i10) {
        String str = zzbgVar.f5405a;
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 2, str);
        i4.O(parcel, 3, zzbgVar.f5406d, i10);
        i4.P(parcel, 4, zzbgVar.f5407g);
        long j = zzbgVar.f5408r;
        i4.S(parcel, 5, 8);
        parcel.writeLong(j);
        i4.W(parcel, iU);
    }

    public static void b(zzpl zzplVar, Parcel parcel) {
        int i10 = zzplVar.f5420a;
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(i10);
        i4.P(parcel, 2, zzplVar.f5421d);
        long j = zzplVar.f5422g;
        i4.S(parcel, 3, 8);
        parcel.writeLong(j);
        Long l10 = zzplVar.f5423r;
        if (l10 != null) {
            i4.S(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        i4.P(parcel, 6, zzplVar.f5424x);
        i4.P(parcel, 7, zzplVar.f5425y);
        Double d6 = zzplVar.B;
        if (d6 != null) {
            i4.S(parcel, 8, 8);
            parcel.writeDouble(d6.doubleValue());
        }
        i4.W(parcel, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        k jVar;
        View view;
        long jW = 0;
        boolean zQ = false;
        int iV = 0;
        boolean zQ2 = false;
        int iV2 = 0;
        int iV3 = 0;
        switch (this.f24415a) {
            case 0:
                int iH0 = b4.h0(parcel);
                IBinder iBinderU = null;
                boolean zQ3 = true;
                float fS = 0.0f;
                float fS2 = 0.0f;
                while (parcel.dataPosition() < iH0) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 2) {
                        iBinderU = b4.U(parcel, i10);
                    } else if (c4 == 3) {
                        zQ = b4.Q(parcel, i10);
                    } else if (c4 == 4) {
                        fS = b4.S(parcel, i10);
                    } else if (c4 == 5) {
                        zQ3 = b4.Q(parcel, i10);
                    } else if (c4 != 6) {
                        b4.e0(parcel, i10);
                    } else {
                        fS2 = b4.S(parcel, i10);
                    }
                }
                b4.y(parcel, iH0);
                TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
                tileOverlayOptions.f5378d = true;
                tileOverlayOptions.f5380r = true;
                tileOverlayOptions.f5381x = 0.0f;
                int i11 = g.f24413f;
                if (iBinderU == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderU.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    jVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new j(iBinderU, "com.google.android.gms.maps.model.internal.ITileProviderDelegate", 4);
                }
                tileOverlayOptions.f5377a = jVar;
                tileOverlayOptions.f5378d = zQ;
                tileOverlayOptions.f5379g = fS;
                tileOverlayOptions.f5380r = zQ3;
                tileOverlayOptions.f5381x = fS2;
                return tileOverlayOptions;
            case 1:
                int iH02 = b4.h0(parcel);
                LatLng latLng = null;
                LatLng latLng2 = null;
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                LatLngBounds latLngBounds = null;
                while (parcel.dataPosition() < iH02) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 2) {
                        latLng = (LatLng) b4.s(parcel, i12, LatLng.CREATOR);
                    } else if (c10 == 3) {
                        latLng2 = (LatLng) b4.s(parcel, i12, LatLng.CREATOR);
                    } else if (c10 == 4) {
                        latLng3 = (LatLng) b4.s(parcel, i12, LatLng.CREATOR);
                    } else if (c10 == 5) {
                        latLng4 = (LatLng) b4.s(parcel, i12, LatLng.CREATOR);
                    } else if (c10 != 6) {
                        b4.e0(parcel, i12);
                    } else {
                        latLngBounds = (LatLngBounds) b4.s(parcel, i12, LatLngBounds.CREATOR);
                    }
                }
                b4.y(parcel, iH02);
                return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
            case 2:
                int iH03 = b4.h0(parcel);
                IBinder iBinderU2 = null;
                Float fT = null;
                while (parcel.dataPosition() < iH03) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        iV3 = b4.V(parcel, i13);
                    } else if (c11 == 3) {
                        iBinderU2 = b4.U(parcel, i13);
                    } else if (c11 != 4) {
                        b4.e0(parcel, i13);
                    } else {
                        fT = b4.T(parcel, i13);
                    }
                }
                b4.y(parcel, iH03);
                return new Cap(iV3, iBinderU2 == null ? null : new b(jc.d.U(iBinderU2)), fT);
            case 3:
                LatLng latLng5 = null;
                int iH04 = b4.h0(parcel);
                LatLng latLng6 = null;
                while (parcel.dataPosition() < iH04) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        latLng6 = (LatLng) b4.s(parcel, i14, LatLng.CREATOR);
                    } else if (c12 != 3) {
                        b4.e0(parcel, i14);
                    } else {
                        latLng5 = (LatLng) b4.s(parcel, i14, LatLng.CREATOR);
                    }
                }
                b4.y(parcel, iH04);
                return new LatLngBounds(latLng6, latLng5);
            case 4:
                int iH05 = b4.h0(parcel);
                double d6 = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < iH05) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 2) {
                        b4.i0(parcel, i15, 8);
                        d6 = parcel.readDouble();
                    } else if (c13 != 3) {
                        b4.e0(parcel, i15);
                    } else {
                        b4.i0(parcel, i15, 8);
                        d10 = parcel.readDouble();
                    }
                }
                b4.y(parcel, iH05);
                return new LatLng(d6, d10);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                int iH06 = b4.h0(parcel);
                String strT = null;
                while (parcel.dataPosition() < iH06) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 2) {
                        b4.e0(parcel, i16);
                    } else {
                        strT = b4.t(parcel, i16);
                    }
                }
                b4.y(parcel, iH06);
                return new MapStyleOptions(strT);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                int iH07 = b4.h0(parcel);
                float fS3 = 1.0f;
                float fS4 = 0.5f;
                boolean zQ4 = false;
                boolean zQ5 = false;
                boolean zQ6 = false;
                int iV4 = 0;
                int iV5 = 0;
                LatLng latLng7 = null;
                String strT2 = null;
                String strT3 = null;
                IBinder iBinderU3 = null;
                float fS5 = 0.0f;
                float fS6 = 0.0f;
                IBinder iBinderU4 = null;
                float fS7 = 0.0f;
                float fS8 = 0.0f;
                float fS9 = 0.0f;
                String strT4 = null;
                float fS10 = 0.0f;
                while (parcel.dataPosition() < iH07) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            latLng7 = (LatLng) b4.s(parcel, i17, LatLng.CREATOR);
                            break;
                        case 3:
                            strT2 = b4.t(parcel, i17);
                            break;
                        case 4:
                            strT3 = b4.t(parcel, i17);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            iBinderU3 = b4.U(parcel, i17);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            fS5 = b4.S(parcel, i17);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            fS6 = b4.S(parcel, i17);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            zQ4 = b4.Q(parcel, i17);
                            break;
                        case '\t':
                            zQ5 = b4.Q(parcel, i17);
                            break;
                        case '\n':
                            zQ6 = b4.Q(parcel, i17);
                            break;
                        case 11:
                            fS7 = b4.S(parcel, i17);
                            break;
                        case '\f':
                            fS4 = b4.S(parcel, i17);
                            break;
                        case '\r':
                            fS8 = b4.S(parcel, i17);
                            break;
                        case 14:
                            fS3 = b4.S(parcel, i17);
                            break;
                        case 15:
                            fS9 = b4.S(parcel, i17);
                            break;
                        case 16:
                        default:
                            b4.e0(parcel, i17);
                            break;
                        case 17:
                            iV4 = b4.V(parcel, i17);
                            break;
                        case 18:
                            iBinderU4 = b4.U(parcel, i17);
                            break;
                        case 19:
                            iV5 = b4.V(parcel, i17);
                            break;
                        case 20:
                            strT4 = b4.t(parcel, i17);
                            break;
                        case 21:
                            fS10 = b4.S(parcel, i17);
                            break;
                    }
                }
                b4.y(parcel, iH07);
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.f5356x = 0.5f;
                markerOptions.f5357y = 1.0f;
                markerOptions.D = true;
                markerOptions.E = false;
                markerOptions.F = 0.0f;
                markerOptions.G = 0.5f;
                markerOptions.H = 0.0f;
                markerOptions.I = 1.0f;
                markerOptions.K = 0;
                markerOptions.f5352a = latLng7;
                markerOptions.f5353d = strT2;
                markerOptions.f5354g = strT3;
                if (iBinderU3 == null) {
                    view = null;
                    markerOptions.f5355r = null;
                } else {
                    view = null;
                    markerOptions.f5355r = new b(jc.d.U(iBinderU3));
                }
                markerOptions.f5356x = fS5;
                markerOptions.f5357y = fS6;
                markerOptions.B = zQ4;
                markerOptions.D = zQ5;
                markerOptions.E = zQ6;
                markerOptions.F = fS7;
                markerOptions.G = fS4;
                markerOptions.H = fS8;
                markerOptions.I = fS3;
                markerOptions.J = fS9;
                markerOptions.M = iV5;
                markerOptions.K = iV4;
                jc.b bVarU = jc.d.U(iBinderU4);
                markerOptions.L = bVarU == null ? view : (View) jc.d.V(bVarU);
                markerOptions.N = strT4;
                markerOptions.O = fS10;
                return markerOptions;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int iH08 = b4.h0(parcel);
                Float fT2 = null;
                while (parcel.dataPosition() < iH08) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 2) {
                        iV2 = b4.V(parcel, i18);
                    } else if (c14 != 3) {
                        b4.e0(parcel, i18);
                    } else {
                        fT2 = b4.T(parcel, i18);
                    }
                }
                b4.y(parcel, iH08);
                return new PatternItem(iV2, fT2);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                int iH09 = b4.h0(parcel);
                int iV6 = 0;
                boolean zQ7 = false;
                boolean zQ8 = false;
                boolean zQ9 = false;
                int iV7 = 0;
                ArrayList arrayListV = null;
                float fS11 = 0.0f;
                float fS12 = 0.0f;
                Cap cap = null;
                Cap cap2 = null;
                ArrayList arrayListV2 = null;
                ArrayList arrayListV3 = null;
                while (parcel.dataPosition() < iH09) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            arrayListV = b4.v(parcel, i19, LatLng.CREATOR);
                            break;
                        case 3:
                            fS11 = b4.S(parcel, i19);
                            break;
                        case 4:
                            iV6 = b4.V(parcel, i19);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            fS12 = b4.S(parcel, i19);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            zQ7 = b4.Q(parcel, i19);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            zQ8 = b4.Q(parcel, i19);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            zQ9 = b4.Q(parcel, i19);
                            break;
                        case '\t':
                            cap = (Cap) b4.s(parcel, i19, Cap.CREATOR);
                            break;
                        case '\n':
                            cap2 = (Cap) b4.s(parcel, i19, Cap.CREATOR);
                            break;
                        case 11:
                            iV7 = b4.V(parcel, i19);
                            break;
                        case '\f':
                            arrayListV2 = b4.v(parcel, i19, PatternItem.CREATOR);
                            break;
                        case '\r':
                            arrayListV3 = b4.v(parcel, i19, StyleSpan.CREATOR);
                            break;
                        default:
                            b4.e0(parcel, i19);
                            break;
                    }
                }
                b4.y(parcel, iH09);
                return new PolylineOptions(arrayListV, fS11, iV6, fS12, zQ7, zQ8, zQ9, cap, cap2, iV7, arrayListV2, arrayListV3);
            case 9:
                int iH010 = b4.h0(parcel);
                IBinder iBinderU5 = null;
                while (parcel.dataPosition() < iH010) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 2) {
                        b4.e0(parcel, i20);
                    } else {
                        iBinderU5 = b4.U(parcel, i20);
                    }
                }
                b4.y(parcel, iH010);
                return new StampStyle(iBinderU5);
            case 10:
                return new StreamKey(parcel);
            case 11:
                return new TrackGroup(parcel);
            case 12:
                return new TrackGroupArray(parcel);
            case 13:
                int iH011 = b4.h0(parcel);
                int iV8 = 0;
                int iV9 = 0;
                PendingIntent pendingIntent = null;
                String strT5 = null;
                while (true) {
                    Integer numValueOf = null;
                    while (parcel.dataPosition() < iH011) {
                        int i21 = parcel.readInt();
                        char c15 = (char) i21;
                        if (c15 == 1) {
                            iV8 = b4.V(parcel, i21);
                        } else if (c15 == 2) {
                            iV9 = b4.V(parcel, i21);
                        } else if (c15 == 3) {
                            pendingIntent = (PendingIntent) b4.s(parcel, i21, PendingIntent.CREATOR);
                        } else if (c15 == 4) {
                            strT5 = b4.t(parcel, i21);
                        } else if (c15 != 5) {
                            b4.e0(parcel, i21);
                        } else {
                            int iX = b4.X(parcel, i21);
                            if (iX == 0) {
                                break;
                            }
                            b4.j0(parcel, iX, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                    b4.y(parcel, iH011);
                    return new ConnectionResult(iV8, iV9, pendingIntent, strT5, numValueOf);
                    break;
                }
            case 14:
                int iH012 = b4.h0(parcel);
                int iV10 = 0;
                boolean zQ10 = false;
                String strT6 = null;
                long jW2 = -1;
                while (parcel.dataPosition() < iH012) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 1) {
                        strT6 = b4.t(parcel, i22);
                    } else if (c16 == 2) {
                        iV10 = b4.V(parcel, i22);
                    } else if (c16 == 3) {
                        jW2 = b4.W(parcel, i22);
                    } else if (c16 != 4) {
                        b4.e0(parcel, i22);
                    } else {
                        zQ10 = b4.Q(parcel, i22);
                    }
                }
                b4.y(parcel, iH012);
                return new Feature(strT6, iV10, jW2, zQ10);
            case 15:
                int iH013 = b4.h0(parcel);
                boolean zQ11 = false;
                boolean zQ12 = false;
                boolean zQ13 = false;
                boolean zQ14 = false;
                boolean zQ15 = false;
                String strT7 = null;
                IBinder iBinderU6 = null;
                while (parcel.dataPosition() < iH013) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strT7 = b4.t(parcel, i23);
                            break;
                        case 2:
                            zQ11 = b4.Q(parcel, i23);
                            break;
                        case 3:
                            zQ12 = b4.Q(parcel, i23);
                            break;
                        case 4:
                            iBinderU6 = b4.U(parcel, i23);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            zQ13 = b4.Q(parcel, i23);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            zQ14 = b4.Q(parcel, i23);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        default:
                            b4.e0(parcel, i23);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            zQ15 = b4.Q(parcel, i23);
                            break;
                    }
                }
                b4.y(parcel, iH013);
                return new zzp(strT7, zQ11, zQ12, iBinderU6, zQ13, zQ14, zQ15);
            case 16:
                int iH014 = b4.h0(parcel);
                int iV11 = 0;
                int iV12 = 0;
                boolean zQ16 = false;
                long jW3 = -1;
                String strT8 = null;
                while (parcel.dataPosition() < iH014) {
                    int i24 = parcel.readInt();
                    char c17 = (char) i24;
                    if (c17 == 1) {
                        zQ16 = b4.Q(parcel, i24);
                    } else if (c17 == 2) {
                        strT8 = b4.t(parcel, i24);
                    } else if (c17 == 3) {
                        iV11 = b4.V(parcel, i24);
                    } else if (c17 == 4) {
                        iV12 = b4.V(parcel, i24);
                    } else if (c17 != 5) {
                        b4.e0(parcel, i24);
                    } else {
                        jW3 = b4.W(parcel, i24);
                    }
                }
                b4.y(parcel, iH014);
                return new zzr(iV11, iV12, jW3, strT8, zQ16);
            case 17:
                int iH015 = b4.h0(parcel);
                boolean zQ17 = false;
                IBinder iBinderU7 = null;
                String strT9 = null;
                while (parcel.dataPosition() < iH015) {
                    int i25 = parcel.readInt();
                    char c18 = (char) i25;
                    if (c18 == 1) {
                        strT9 = b4.t(parcel, i25);
                    } else if (c18 == 2) {
                        iBinderU7 = b4.U(parcel, i25);
                    } else if (c18 == 3) {
                        zQ2 = b4.Q(parcel, i25);
                    } else if (c18 != 4) {
                        b4.e0(parcel, i25);
                    } else {
                        zQ17 = b4.Q(parcel, i25);
                    }
                }
                b4.y(parcel, iH015);
                return new zzt(strT9, iBinderU7, zQ2, zQ17);
            case 18:
                int iH016 = b4.h0(parcel);
                long jW4 = 0;
                long jW5 = 0;
                int iV13 = 0;
                while (parcel.dataPosition() < iH016) {
                    int i26 = parcel.readInt();
                    char c19 = (char) i26;
                    if (c19 == 1) {
                        jW4 = b4.W(parcel, i26);
                    } else if (c19 == 2) {
                        iV13 = b4.V(parcel, i26);
                    } else if (c19 != 3) {
                        b4.e0(parcel, i26);
                    } else {
                        jW5 = b4.W(parcel, i26);
                    }
                }
                b4.y(parcel, iH016);
                return new zzaf(iV13, jW4, jW5);
            case 19:
                int iH017 = b4.h0(parcel);
                long jW6 = 0;
                long jW7 = 0;
                long jW8 = 0;
                boolean zQ18 = false;
                String strT10 = null;
                String strT11 = null;
                zzpl zzplVar = null;
                String strT12 = null;
                zzbg zzbgVar = null;
                zzbg zzbgVar2 = null;
                zzbg zzbgVar3 = null;
                while (parcel.dataPosition() < iH017) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 2:
                            strT10 = b4.t(parcel, i27);
                            break;
                        case 3:
                            strT11 = b4.t(parcel, i27);
                            break;
                        case 4:
                            zzplVar = (zzpl) b4.s(parcel, i27, zzpl.CREATOR);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            jW6 = b4.W(parcel, i27);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            zQ18 = b4.Q(parcel, i27);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            strT12 = b4.t(parcel, i27);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            zzbgVar = (zzbg) b4.s(parcel, i27, zzbg.CREATOR);
                            break;
                        case '\t':
                            jW7 = b4.W(parcel, i27);
                            break;
                        case '\n':
                            zzbgVar2 = (zzbg) b4.s(parcel, i27, zzbg.CREATOR);
                            break;
                        case 11:
                            jW8 = b4.W(parcel, i27);
                            break;
                        case '\f':
                            zzbgVar3 = (zzbg) b4.s(parcel, i27, zzbg.CREATOR);
                            break;
                        default:
                            b4.e0(parcel, i27);
                            break;
                    }
                }
                b4.y(parcel, iH017);
                return new zzah(strT10, strT11, zzplVar, jW6, zQ18, strT12, zzbgVar, jW7, zzbgVar2, jW8, zzbgVar3);
            case 20:
                int iH018 = b4.h0(parcel);
                Bundle bundleR = null;
                while (parcel.dataPosition() < iH018) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        b4.e0(parcel, i28);
                    } else {
                        bundleR = b4.r(parcel, i28);
                    }
                }
                b4.y(parcel, iH018);
                return new zzao(bundleR);
            case 21:
                int iH019 = b4.h0(parcel);
                Bundle bundleR2 = null;
                while (parcel.dataPosition() < iH019) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 2) {
                        b4.e0(parcel, i29);
                    } else {
                        bundleR2 = b4.r(parcel, i29);
                    }
                }
                b4.y(parcel, iH019);
                return new zzbe(bundleR2);
            case 22:
                int iH020 = b4.h0(parcel);
                long jW9 = 0;
                String strT13 = null;
                zzbe zzbeVar = null;
                String strT14 = null;
                while (parcel.dataPosition() < iH020) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 2) {
                        strT13 = b4.t(parcel, i30);
                    } else if (c20 == 3) {
                        zzbeVar = (zzbe) b4.s(parcel, i30, zzbe.CREATOR);
                    } else if (c20 == 4) {
                        strT14 = b4.t(parcel, i30);
                    } else if (c20 != 5) {
                        b4.e0(parcel, i30);
                    } else {
                        jW9 = b4.W(parcel, i30);
                    }
                }
                b4.y(parcel, iH020);
                return new zzbg(strT13, zzbeVar, strT14, jW9);
            case 23:
                int iH021 = b4.h0(parcel);
                String strT15 = null;
                while (parcel.dataPosition() < iH021) {
                    int i31 = parcel.readInt();
                    char c21 = (char) i31;
                    if (c21 == 1) {
                        strT15 = b4.t(parcel, i31);
                    } else if (c21 == 2) {
                        jW = b4.W(parcel, i31);
                    } else if (c21 != 3) {
                        b4.e0(parcel, i31);
                    } else {
                        iV = b4.V(parcel, i31);
                    }
                }
                b4.y(parcel, iH021);
                return new zzoh(strT15, iV, jW);
            case 24:
                int iH022 = b4.h0(parcel);
                long jW10 = 0;
                long jW11 = 0;
                int iV14 = 0;
                byte[] bArr = null;
                String strT16 = null;
                Bundle bundleR3 = null;
                String strT17 = null;
                while (parcel.dataPosition() < iH022) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 1:
                            jW10 = b4.W(parcel, i32);
                            break;
                        case 2:
                            int iX2 = b4.X(parcel, i32);
                            int iDataPosition = parcel.dataPosition();
                            if (iX2 == 0) {
                                bArr = null;
                                break;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iX2);
                                bArr = bArrCreateByteArray;
                                break;
                            }
                        case 3:
                            strT16 = b4.t(parcel, i32);
                            break;
                        case 4:
                            bundleR3 = b4.r(parcel, i32);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            iV14 = b4.V(parcel, i32);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            jW11 = b4.W(parcel, i32);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            strT17 = b4.t(parcel, i32);
                            break;
                        default:
                            b4.e0(parcel, i32);
                            break;
                    }
                }
                b4.y(parcel, iH022);
                return new zzom(jW10, bArr, strT16, bundleR3, iV14, jW11, strT17);
            case 25:
                int iH023 = b4.h0(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < iH023) {
                        int i33 = parcel.readInt();
                        if (((char) i33) != 1) {
                            b4.e0(parcel, i33);
                        } else {
                            int iX3 = b4.X(parcel, i33);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iX3 == 0) {
                                break;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i34 = parcel.readInt();
                            for (int i35 = 0; i35 < i34; i35++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition2 + iX3);
                            arrayList = arrayList2;
                        }
                    }
                    b4.y(parcel, iH023);
                    return new zzoo(arrayList);
                    break;
                }
            case 26:
                int iH024 = b4.h0(parcel);
                ArrayList arrayListV4 = null;
                while (parcel.dataPosition() < iH024) {
                    int i36 = parcel.readInt();
                    if (((char) i36) != 1) {
                        b4.e0(parcel, i36);
                    } else {
                        arrayListV4 = b4.v(parcel, i36, zzom.CREATOR);
                    }
                }
                b4.y(parcel, iH024);
                return new zzoq(arrayListV4);
            case 27:
                int iH025 = b4.h0(parcel);
                long jW12 = 0;
                int iV15 = 0;
                String strT18 = null;
                Long lValueOf = null;
                Float fT3 = null;
                String strT19 = null;
                String strT20 = null;
                while (true) {
                    Double dValueOf = null;
                    while (parcel.dataPosition() < iH025) {
                        int i37 = parcel.readInt();
                        switch ((char) i37) {
                            case 1:
                                iV15 = b4.V(parcel, i37);
                                break;
                            case 2:
                                strT18 = b4.t(parcel, i37);
                                break;
                            case 3:
                                jW12 = b4.W(parcel, i37);
                                break;
                            case 4:
                                int iX4 = b4.X(parcel, i37);
                                if (iX4 == 0) {
                                    lValueOf = null;
                                    break;
                                } else {
                                    b4.j0(parcel, iX4, 8);
                                    lValueOf = Long.valueOf(parcel.readLong());
                                    break;
                                }
                            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                                fT3 = b4.T(parcel, i37);
                                break;
                            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                strT19 = b4.t(parcel, i37);
                                break;
                            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                strT20 = b4.t(parcel, i37);
                                break;
                            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                                int iX5 = b4.X(parcel, i37);
                                if (iX5 == 0) {
                                    break;
                                }
                                b4.j0(parcel, iX5, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                                break;
                            default:
                                b4.e0(parcel, i37);
                                break;
                        }
                    }
                    b4.y(parcel, iH025);
                    return new zzpl(iV15, strT18, jW12, lValueOf, fT3, strT19, strT20, dValueOf);
                    break;
                }
            case 28:
                int iH026 = b4.h0(parcel);
                String strT21 = "";
                String strT22 = strT21;
                String strT23 = strT22;
                String strT24 = strT23;
                int iV16 = 100;
                long jW13 = -2147483648L;
                long jW14 = 0;
                long jW15 = 0;
                long jW16 = 0;
                long jW17 = 0;
                long jW18 = 0;
                long jW19 = 0;
                long jW20 = 0;
                boolean zQ19 = true;
                boolean zQ20 = true;
                boolean zQ21 = false;
                int iV17 = 0;
                boolean zQ22 = false;
                boolean zQ23 = false;
                int iV18 = 0;
                int iV19 = 0;
                String strT25 = null;
                String strT26 = null;
                String strT27 = null;
                String strT28 = null;
                String strT29 = null;
                String strT30 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strT31 = null;
                String strT32 = null;
                while (parcel.dataPosition() < iH026) {
                    int i38 = parcel.readInt();
                    switch ((char) i38) {
                        case 2:
                            strT25 = b4.t(parcel, i38);
                            break;
                        case 3:
                            strT26 = b4.t(parcel, i38);
                            break;
                        case 4:
                            strT27 = b4.t(parcel, i38);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            strT28 = b4.t(parcel, i38);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            jW14 = b4.W(parcel, i38);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            jW15 = b4.W(parcel, i38);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            strT29 = b4.t(parcel, i38);
                            break;
                        case '\t':
                            zQ19 = b4.Q(parcel, i38);
                            break;
                        case '\n':
                            zQ21 = b4.Q(parcel, i38);
                            break;
                        case 11:
                            jW13 = b4.W(parcel, i38);
                            break;
                        case '\f':
                            strT30 = b4.t(parcel, i38);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            b4.e0(parcel, i38);
                            break;
                        case 14:
                            jW16 = b4.W(parcel, i38);
                            break;
                        case 15:
                            iV17 = b4.V(parcel, i38);
                            break;
                        case 16:
                            zQ20 = b4.Q(parcel, i38);
                            break;
                        case 18:
                            zQ22 = b4.Q(parcel, i38);
                            break;
                        case 21:
                            int iX6 = b4.X(parcel, i38);
                            if (iX6 == 0) {
                                boolValueOf = null;
                                break;
                            } else {
                                b4.j0(parcel, iX6, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            }
                        case 22:
                            jW17 = b4.W(parcel, i38);
                            break;
                        case 23:
                            int iX7 = b4.X(parcel, i38);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iX7 == 0) {
                                arrayList3 = null;
                                break;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition3 + iX7);
                                arrayList3 = arrayListCreateStringArrayList;
                                break;
                            }
                        case 25:
                            strT21 = b4.t(parcel, i38);
                            break;
                        case 26:
                            strT22 = b4.t(parcel, i38);
                            break;
                        case 27:
                            strT31 = b4.t(parcel, i38);
                            break;
                        case 28:
                            zQ23 = b4.Q(parcel, i38);
                            break;
                        case 29:
                            jW18 = b4.W(parcel, i38);
                            break;
                        case 30:
                            iV16 = b4.V(parcel, i38);
                            break;
                        case 31:
                            strT23 = b4.t(parcel, i38);
                            break;
                        case ' ':
                            iV18 = b4.V(parcel, i38);
                            break;
                        case '\"':
                            jW19 = b4.W(parcel, i38);
                            break;
                        case '#':
                            strT32 = b4.t(parcel, i38);
                            break;
                        case '$':
                            strT24 = b4.t(parcel, i38);
                            break;
                        case '%':
                            jW20 = b4.W(parcel, i38);
                            break;
                        case '&':
                            iV19 = b4.V(parcel, i38);
                            break;
                    }
                }
                b4.y(parcel, iH026);
                return new com.google.android.gms.measurement.internal.zzr(strT25, strT26, strT27, strT28, jW14, jW15, strT29, zQ19, zQ21, jW13, strT30, jW16, iV17, zQ20, zQ22, boolValueOf, jW17, arrayList3, strT21, strT22, strT31, zQ23, jW18, iV16, strT23, iV18, jW19, strT32, strT24, jW20, iV19);
            default:
                l.e(parcel, "parcel");
                return new MicroSurveyPointTextAdapterItem(parcel.readString(), QuestionHeaderBindingData.CREATOR.createFromParcel(parcel), MicroSurveyPointTextAnswer.CREATOR.createFromParcel(parcel), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f24415a) {
            case 0:
                return new TileOverlayOptions[i10];
            case 1:
                return new VisibleRegion[i10];
            case 2:
                return new Cap[i10];
            case 3:
                return new LatLngBounds[i10];
            case 4:
                return new LatLng[i10];
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new MapStyleOptions[i10];
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new MarkerOptions[i10];
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new PatternItem[i10];
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new PolylineOptions[i10];
            case 9:
                return new StampStyle[i10];
            case 10:
                return new StreamKey[i10];
            case 11:
                return new TrackGroup[i10];
            case 12:
                return new TrackGroupArray[i10];
            case 13:
                return new ConnectionResult[i10];
            case 14:
                return new Feature[i10];
            case 15:
                return new zzp[i10];
            case 16:
                return new zzr[i10];
            case 17:
                return new zzt[i10];
            case 18:
                return new zzaf[i10];
            case 19:
                return new zzah[i10];
            case 20:
                return new zzao[i10];
            case 21:
                return new zzbe[i10];
            case 22:
                return new zzbg[i10];
            case 23:
                return new zzoh[i10];
            case 24:
                return new zzom[i10];
            case 25:
                return new zzoo[i10];
            case 26:
                return new zzoq[i10];
            case 27:
                return new zzpl[i10];
            case 28:
                return new com.google.android.gms.measurement.internal.zzr[i10];
            default:
                return new MicroSurveyPointTextAdapterItem[i10];
        }
    }
}
