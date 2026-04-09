package ac;

import ac.l;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.StreamKey;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import bh.m;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.staircase3.opensignal.goldstar.persistence.VideoTestResult;
import com.staircase3.opensignal.osca.domain.model.ResolutionCardInfo;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import com.survicate.surveys.presentation.widget.SurveyPointImageBindingData;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f336a;

    public /* synthetic */ l(int i10) {
        this.f336a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [b.b] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        b.a aVar;
        int iV = 0;
        String strT = null;
        Bundle bundleR = null;
        Account account = null;
        ArrayList arrayListV = null;
        String strT2 = null;
        ConnectionResult connectionResult = null;
        zaw zawVar = null;
        Intent intent = null;
        switch (this.f336a) {
            case 0:
                int iH0 = b4.h0(parcel);
                while (parcel.dataPosition() < iH0) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iV = b4.V(parcel, i10);
                    } else if (c4 != 2) {
                        b4.e0(parcel, i10);
                    } else {
                        strT = b4.t(parcel, i10);
                    }
                }
                b4.y(parcel, iH0);
                return new Scope(iV, strT);
            case 1:
                PendingIntent pendingIntent = null;
                int iH02 = b4.h0(parcel);
                ConnectionResult connectionResult2 = null;
                String strT3 = null;
                while (parcel.dataPosition() < iH02) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iV = b4.V(parcel, i11);
                    } else if (c10 == 2) {
                        strT3 = b4.t(parcel, i11);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) b4.s(parcel, i11, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        b4.e0(parcel, i11);
                    } else {
                        connectionResult2 = (ConnectionResult) b4.s(parcel, i11, ConnectionResult.CREATOR);
                    }
                }
                b4.y(parcel, iH02);
                return new Status(iV, strT3, pendingIntent, connectionResult2);
            case 2:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new l(2);

                    /* renamed from: a, reason: collision with root package name */
                    public final int f884a;

                    /* renamed from: d, reason: collision with root package name */
                    public final MediaDescriptionCompat f885d;

                    {
                        this.f884a = parcel.readInt();
                        this.f885d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f884a + ", mDescription=" + this.f885d + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i12) {
                        parcel2.writeInt(this.f884a);
                        this.f885d.writeToParcel(parcel2, i12);
                    }
                };
            case 3:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras = android.support.v4.media.session.b.a(extras);
                }
                Uri mediaUri = extras != null ? (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.E = mediaDescription;
                return mediaDescriptionCompat;
            case 4:
                return new MediaMetadataCompat(parcel);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new DrmInitData(parcel);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Metadata(parcel);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new StreamKey(parcel);
            case 9:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i12 = b.c.f2360e;
                if (strongBinder == null) {
                    aVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.b.f2359a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.b)) {
                        b.a aVar2 = new b.a();
                        aVar2.f2358d = strongBinder;
                        aVar = aVar2;
                    } else {
                        aVar = (b.b) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.f916a = aVar;
                return resultReceiver;
            case 10:
                String string = parcel.readString();
                string.getClass();
                return new AppInfoTable(parcel.readInt(), string);
            case 11:
                return new com.google.android.exoplayer2.drm.DrmInitData(parcel);
            case 12:
                int iV2 = 0;
                int iH03 = b4.h0(parcel);
                while (parcel.dataPosition() < iH03) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iV = b4.V(parcel, i13);
                    } else if (c11 == 2) {
                        iV2 = b4.V(parcel, i13);
                    } else if (c11 != 3) {
                        b4.e0(parcel, i13);
                    } else {
                        intent = (Intent) b4.s(parcel, i13, Intent.CREATOR);
                    }
                }
                b4.y(parcel, iH03);
                return new zaa(iV, iV2, intent);
            case 13:
                int iH04 = b4.h0(parcel);
                ArrayList<String> arrayList = null;
                String strT4 = null;
                while (parcel.dataPosition() < iH04) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        int iX = b4.X(parcel, i14);
                        int iDataPosition = parcel.dataPosition();
                        if (iX == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iX);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c12 != 2) {
                        b4.e0(parcel, i14);
                    } else {
                        strT4 = b4.t(parcel, i14);
                    }
                }
                b4.y(parcel, iH04);
                return new zag(strT4, arrayList);
            case 14:
                int iH05 = b4.h0(parcel);
                while (parcel.dataPosition() < iH05) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        iV = b4.V(parcel, i15);
                    } else if (c13 != 2) {
                        b4.e0(parcel, i15);
                    } else {
                        zawVar = (zaw) b4.s(parcel, i15, zaw.CREATOR);
                    }
                }
                b4.y(parcel, iH05);
                return new zai(iV, zawVar);
            case 15:
                zay zayVar = null;
                int iH06 = b4.h0(parcel);
                while (parcel.dataPosition() < iH06) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        iV = b4.V(parcel, i16);
                    } else if (c14 == 2) {
                        connectionResult = (ConnectionResult) b4.s(parcel, i16, ConnectionResult.CREATOR);
                    } else if (c14 != 3) {
                        b4.e0(parcel, i16);
                    } else {
                        zayVar = (zay) b4.s(parcel, i16, zay.CREATOR);
                    }
                }
                b4.y(parcel, iH06);
                return new zak(iV, connectionResult, zayVar);
            case 16:
                br.l.e(parcel, "parcel");
                int i17 = parcel.readInt();
                long j = parcel.readLong();
                long j7 = parcel.readLong();
                um.a aVarValueOf = null;
                long j10 = parcel.readLong();
                double d6 = parcel.readDouble();
                String string2 = parcel.readString();
                long j11 = parcel.readLong();
                long j12 = parcel.readLong();
                double d10 = parcel.readDouble();
                double d11 = parcel.readDouble();
                if (parcel.readInt() != 0) {
                    aVarValueOf = um.a.valueOf(parcel.readString());
                }
                return new VideoTestResult(i17, j, j7, j10, d6, string2, j11, j12, d10, d11, aVarValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0, com.staircase3.opensignal.utils.l.valueOf(parcel.readString()));
            case 17:
                br.l.e(parcel, "parcel");
                return new ResolutionCardInfo(parcel.readString(), parcel.readString(), parcel.readString(), m.valueOf(parcel.readString()), parcel.readInt());
            case 18:
                br.l.e(parcel, "parcel");
                return new QuestionHeaderBindingData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? SurveyPointImageBindingData.CREATOR.createFromParcel(parcel) : null);
            case 19:
                br.l.e(parcel, "parcel");
                return new SurveyPointImageBindingData(parcel.readInt() != 0 ? SurveyPointImage.CREATOR.createFromParcel(parcel) : null);
            case 20:
                return new EventMessage(parcel);
            case 21:
                int iH07 = b4.h0(parcel);
                while (parcel.dataPosition() < iH07) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iV = b4.V(parcel, i18);
                    } else if (c15 != 2) {
                        b4.e0(parcel, i18);
                    } else {
                        strT2 = b4.t(parcel, i18);
                    }
                }
                b4.y(parcel, iH07);
                return new ClientIdentity(iV, strT2);
            case 22:
                int iH08 = b4.h0(parcel);
                while (parcel.dataPosition() < iH08) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        iV = b4.V(parcel, i19);
                    } else if (c16 != 2) {
                        b4.e0(parcel, i19);
                    } else {
                        arrayListV = b4.v(parcel, i19, MethodInvocation.CREATOR);
                    }
                }
                b4.y(parcel, iH08);
                return new TelemetryData(iV, arrayListV);
            case 23:
                int iH09 = b4.h0(parcel);
                long jW = 0;
                int iV3 = 0;
                int iV4 = 0;
                boolean zQ = false;
                String strT5 = null;
                while (parcel.dataPosition() < iH09) {
                    int i20 = parcel.readInt();
                    char c17 = (char) i20;
                    if (c17 == 1) {
                        iV3 = b4.V(parcel, i20);
                    } else if (c17 == 2) {
                        strT5 = b4.t(parcel, i20);
                    } else if (c17 == 3) {
                        jW = b4.W(parcel, i20);
                    } else if (c17 == 4) {
                        iV4 = b4.V(parcel, i20);
                    } else if (c17 != 5) {
                        b4.e0(parcel, i20);
                    } else {
                        zQ = b4.Q(parcel, i20);
                    }
                }
                b4.y(parcel, iH09);
                return new zab(iV3, iV4, jW, strT5, zQ);
            case 24:
                int iH010 = b4.h0(parcel);
                long jW2 = 0;
                long jW3 = 0;
                int iV5 = -1;
                int iV6 = 0;
                int iV7 = 0;
                int iV8 = 0;
                int iV9 = 0;
                String strT6 = null;
                String strT7 = null;
                while (parcel.dataPosition() < iH010) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iV6 = b4.V(parcel, i21);
                            break;
                        case 2:
                            iV7 = b4.V(parcel, i21);
                            break;
                        case 3:
                            iV8 = b4.V(parcel, i21);
                            break;
                        case 4:
                            jW2 = b4.W(parcel, i21);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            jW3 = b4.W(parcel, i21);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            strT6 = b4.t(parcel, i21);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            strT7 = b4.t(parcel, i21);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            iV9 = b4.V(parcel, i21);
                            break;
                        case '\t':
                            iV5 = b4.V(parcel, i21);
                            break;
                        default:
                            b4.e0(parcel, i21);
                            break;
                    }
                }
                b4.y(parcel, iH010);
                return new MethodInvocation(iV6, iV7, iV8, jW2, jW3, strT6, strT7, iV9, iV5);
            case 25:
                int iH011 = b4.h0(parcel);
                int iV10 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iH011) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        iV = b4.V(parcel, i22);
                    } else if (c18 == 2) {
                        account = (Account) b4.s(parcel, i22, Account.CREATOR);
                    } else if (c18 == 3) {
                        iV10 = b4.V(parcel, i22);
                    } else if (c18 != 4) {
                        b4.e0(parcel, i22);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) b4.s(parcel, i22, GoogleSignInAccount.CREATOR);
                    }
                }
                b4.y(parcel, iH011);
                return new zaw(iV, account, iV10, googleSignInAccount);
            case 26:
                int iH012 = b4.h0(parcel);
                int iV11 = 0;
                boolean zQ2 = false;
                boolean zQ3 = false;
                IBinder iBinderU = null;
                ConnectionResult connectionResult3 = null;
                while (parcel.dataPosition() < iH012) {
                    int i23 = parcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 1) {
                        iV11 = b4.V(parcel, i23);
                    } else if (c19 == 2) {
                        iBinderU = b4.U(parcel, i23);
                    } else if (c19 == 3) {
                        connectionResult3 = (ConnectionResult) b4.s(parcel, i23, ConnectionResult.CREATOR);
                    } else if (c19 == 4) {
                        zQ2 = b4.Q(parcel, i23);
                    } else if (c19 != 5) {
                        b4.e0(parcel, i23);
                    } else {
                        zQ3 = b4.Q(parcel, i23);
                    }
                }
                b4.y(parcel, iH012);
                return new zay(iV11, iBinderU, connectionResult3, zQ2, zQ3);
            case 27:
                int iH013 = b4.h0(parcel);
                int iV12 = 0;
                int iV13 = 0;
                int iV14 = 0;
                boolean zQ4 = false;
                boolean zQ5 = false;
                while (parcel.dataPosition() < iH013) {
                    int i24 = parcel.readInt();
                    char c20 = (char) i24;
                    if (c20 == 1) {
                        iV12 = b4.V(parcel, i24);
                    } else if (c20 == 2) {
                        zQ4 = b4.Q(parcel, i24);
                    } else if (c20 == 3) {
                        zQ5 = b4.Q(parcel, i24);
                    } else if (c20 == 4) {
                        iV13 = b4.V(parcel, i24);
                    } else if (c20 != 5) {
                        b4.e0(parcel, i24);
                    } else {
                        iV14 = b4.V(parcel, i24);
                    }
                }
                b4.y(parcel, iH013);
                return new RootTelemetryConfiguration(iV12, iV13, iV14, zQ4, zQ5);
            default:
                int iH014 = b4.h0(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < iH014) {
                    int i25 = parcel.readInt();
                    char c21 = (char) i25;
                    if (c21 == 1) {
                        bundleR = b4.r(parcel, i25);
                    } else if (c21 == 2) {
                        featureArr = (Feature[]) b4.u(parcel, i25, Feature.CREATOR);
                    } else if (c21 == 3) {
                        iV = b4.V(parcel, i25);
                    } else if (c21 != 4) {
                        b4.e0(parcel, i25);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) b4.s(parcel, i25, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                b4.y(parcel, iH014);
                zzj zzjVar = new zzj();
                zzjVar.f4864a = bundleR;
                zzjVar.f4865d = featureArr;
                zzjVar.f4866g = iV;
                zzjVar.f4867r = connectionTelemetryConfiguration;
                return zzjVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f336a) {
            case 0:
                return new Scope[i10];
            case 1:
                return new Status[i10];
            case 2:
                return new MediaBrowserCompat$MediaItem[i10];
            case 3:
                return new MediaDescriptionCompat[i10];
            case 4:
                return new MediaMetadataCompat[i10];
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new RatingCompat[i10];
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new DrmInitData[i10];
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Metadata[i10];
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new StreamKey[i10];
            case 9:
                return new ResultReceiver[i10];
            case 10:
                return new AppInfoTable[i10];
            case 11:
                return new com.google.android.exoplayer2.drm.DrmInitData[i10];
            case 12:
                return new zaa[i10];
            case 13:
                return new zag[i10];
            case 14:
                return new zai[i10];
            case 15:
                return new zak[i10];
            case 16:
                return new VideoTestResult[i10];
            case 17:
                return new ResolutionCardInfo[i10];
            case 18:
                return new QuestionHeaderBindingData[i10];
            case 19:
                return new SurveyPointImageBindingData[i10];
            case 20:
                return new EventMessage[i10];
            case 21:
                return new ClientIdentity[i10];
            case 22:
                return new TelemetryData[i10];
            case 23:
                return new zab[i10];
            case 24:
                return new MethodInvocation[i10];
            case 25:
                return new zaw[i10];
            case 26:
                return new zay[i10];
            case 27:
                return new RootTelemetryConfiguration[i10];
            default:
                return new zzj[i10];
        }
    }
}
