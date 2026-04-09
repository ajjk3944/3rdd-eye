package cc;

import android.accounts.Account;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.badge.BadgeState$State;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult;
import com.staircase3.opensignal.models.PlaceType;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3602a;

    public /* synthetic */ a0(int i10) {
        this.f3602a = i10;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        int i11 = getServiceRequest.f4831a;
        i4.S(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = getServiceRequest.f4832d;
        i4.S(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = getServiceRequest.f4833g;
        i4.S(parcel, 3, 4);
        parcel.writeInt(i13);
        i4.P(parcel, 4, getServiceRequest.f4834r);
        i4.N(parcel, 5, getServiceRequest.f4835x);
        i4.Q(parcel, 6, getServiceRequest.f4836y, i10);
        i4.L(parcel, 7, getServiceRequest.B);
        i4.O(parcel, 8, getServiceRequest.D, i10);
        i4.Q(parcel, 10, getServiceRequest.E, i10);
        i4.Q(parcel, 11, getServiceRequest.F, i10);
        boolean z10 = getServiceRequest.G;
        i4.S(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = getServiceRequest.H;
        i4.S(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = getServiceRequest.I;
        i4.S(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        i4.P(parcel, 15, getServiceRequest.J);
        i4.W(parcel, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3602a) {
            case 0:
                int iH0 = b4.h0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = GetServiceRequest.K;
                String strT = null;
                IBinder iBinderU = null;
                Account account = null;
                String strT2 = null;
                int iV = 0;
                int iV2 = 0;
                int iV3 = 0;
                boolean zQ = false;
                int iV4 = 0;
                boolean zQ2 = false;
                Feature[] featureArr = GetServiceRequest.L;
                Feature[] featureArr2 = featureArr;
                while (parcel.dataPosition() < iH0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iV = b4.V(parcel, i10);
                            break;
                        case 2:
                            iV2 = b4.V(parcel, i10);
                            break;
                        case 3:
                            iV3 = b4.V(parcel, i10);
                            break;
                        case 4:
                            strT = b4.t(parcel, i10);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            iBinderU = b4.U(parcel, i10);
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) b4.u(parcel, i10, Scope.CREATOR);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle = b4.r(parcel, i10);
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            account = (Account) b4.s(parcel, i10, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            b4.e0(parcel, i10);
                            break;
                        case '\n':
                            featureArr = (Feature[]) b4.u(parcel, i10, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr2 = (Feature[]) b4.u(parcel, i10, Feature.CREATOR);
                            break;
                        case '\f':
                            zQ = b4.Q(parcel, i10);
                            break;
                        case '\r':
                            iV4 = b4.V(parcel, i10);
                            break;
                        case 14:
                            zQ2 = b4.Q(parcel, i10);
                            break;
                        case 15:
                            strT2 = b4.t(parcel, i10);
                            break;
                    }
                }
                b4.y(parcel, iH0);
                return new GetServiceRequest(iV, iV2, iV3, strT, iBinderU, scopeArr, bundle, account, featureArr, featureArr2, zQ, iV4, zQ2, strT2);
            case 1:
                return new Format(parcel);
            case 2:
                return new HlsTrackMetadataEntry(parcel);
            case 3:
                return new PictureFrame(parcel);
            case 4:
                return new VorbisComment(parcel);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new IcyHeaders(parcel);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new IcyInfo(parcel);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ActivityResult(parcel);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                br.l.e(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                br.l.b(parcelable);
                return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 9:
                return new ApicFrame(parcel);
            case 10:
                return new BinaryFrame(parcel);
            case 11:
                return new ChapterFrame(parcel);
            case 12:
                return new ChapterTocFrame(parcel);
            case 13:
                return new CommentFrame(parcel);
            case 14:
                return new GeobFrame(parcel);
            case 15:
                return new InternalFrame(parcel);
            case 16:
                return new MlltFrame(parcel);
            case 17:
                return new PrivFrame(parcel);
            case 18:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new TextInformationFrame(string, string2, oe.h0.m(strArrCreateStringArray));
            case 19:
                return new UrlLinkFrame(parcel);
            case 20:
                return new MdtaMetadataEntry(parcel);
            case 21:
                return new MotionPhotoMetadata(parcel);
            case 22:
                return new SmtaMetadataEntry(parcel);
            case 23:
                br.l.e(parcel, "parcel");
                return new SpeedTestResult(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), PlaceType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), com.staircase3.opensignal.utils.l.valueOf(parcel.readString()));
            case 24:
                return new PrivateCommand(parcel);
            case 25:
                return new SpliceInsertCommand(parcel);
            case 26:
                return new SpliceNullCommand();
            case 27:
                return new SpliceScheduleCommand(parcel);
            case 28:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            default:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.E = 255;
                badgeState$State.G = -2;
                badgeState$State.H = -2;
                badgeState$State.I = -2;
                badgeState$State.P = Boolean.TRUE;
                badgeState$State.f5469a = parcel.readInt();
                badgeState$State.f5471d = (Integer) parcel.readSerializable();
                badgeState$State.f5472g = (Integer) parcel.readSerializable();
                badgeState$State.f5473r = (Integer) parcel.readSerializable();
                badgeState$State.f5474x = (Integer) parcel.readSerializable();
                badgeState$State.f5475y = (Integer) parcel.readSerializable();
                badgeState$State.B = (Integer) parcel.readSerializable();
                badgeState$State.D = (Integer) parcel.readSerializable();
                badgeState$State.E = parcel.readInt();
                badgeState$State.F = parcel.readString();
                badgeState$State.G = parcel.readInt();
                badgeState$State.H = parcel.readInt();
                badgeState$State.I = parcel.readInt();
                badgeState$State.K = parcel.readString();
                badgeState$State.L = parcel.readString();
                badgeState$State.M = parcel.readInt();
                badgeState$State.O = (Integer) parcel.readSerializable();
                badgeState$State.Q = (Integer) parcel.readSerializable();
                badgeState$State.R = (Integer) parcel.readSerializable();
                badgeState$State.S = (Integer) parcel.readSerializable();
                badgeState$State.T = (Integer) parcel.readSerializable();
                badgeState$State.U = (Integer) parcel.readSerializable();
                badgeState$State.V = (Integer) parcel.readSerializable();
                badgeState$State.Y = (Integer) parcel.readSerializable();
                badgeState$State.W = (Integer) parcel.readSerializable();
                badgeState$State.X = (Integer) parcel.readSerializable();
                badgeState$State.P = (Boolean) parcel.readSerializable();
                badgeState$State.J = (Locale) parcel.readSerializable();
                badgeState$State.Z = (Boolean) parcel.readSerializable();
                badgeState$State.f5470a0 = (Integer) parcel.readSerializable();
                return badgeState$State;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f3602a) {
            case 0:
                return new GetServiceRequest[i10];
            case 1:
                return new Format[i10];
            case 2:
                return new HlsTrackMetadataEntry[i10];
            case 3:
                return new PictureFrame[i10];
            case 4:
                return new VorbisComment[i10];
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new IcyHeaders[i10];
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new IcyInfo[i10];
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ActivityResult[i10];
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new IntentSenderRequest[i10];
            case 9:
                return new ApicFrame[i10];
            case 10:
                return new BinaryFrame[i10];
            case 11:
                return new ChapterFrame[i10];
            case 12:
                return new ChapterTocFrame[i10];
            case 13:
                return new CommentFrame[i10];
            case 14:
                return new GeobFrame[i10];
            case 15:
                return new InternalFrame[i10];
            case 16:
                return new MlltFrame[i10];
            case 17:
                return new PrivFrame[i10];
            case 18:
                return new TextInformationFrame[i10];
            case 19:
                return new UrlLinkFrame[i10];
            case 20:
                return new MdtaMetadataEntry[i10];
            case 21:
                return new MotionPhotoMetadata[i10];
            case 22:
                return new SmtaMetadataEntry[i10];
            case 23:
                return new SpeedTestResult[i10];
            case 24:
                return new PrivateCommand[i10];
            case 25:
                return new SpliceInsertCommand[i10];
            case 26:
                return new SpliceNullCommand[i10];
            case 27:
                return new SpliceScheduleCommand[i10];
            case 28:
                return new TimeSignalCommand[i10];
            default:
                return new BadgeState$State[i10];
        }
    }
}
