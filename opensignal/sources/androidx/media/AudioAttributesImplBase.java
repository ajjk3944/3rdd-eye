package androidx.media;

import g4.j;
import h0.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f1536a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1537b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1538c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1539d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1537b == audioAttributesImplBase.f1537b) {
            int i11 = this.f1538c;
            int i12 = audioAttributesImplBase.f1538c;
            int i13 = audioAttributesImplBase.f1539d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.f1536a;
                int i15 = AudioAttributesCompat.f1532b;
                if ((i12 & 1) != 1) {
                    i10 = 4;
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                break;
                            case j.STRING_FIELD_NUMBER /* 5 */:
                            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            case j.BYTES_FIELD_NUMBER /* 8 */:
                            case 9:
                            case 10:
                                i10 = 5;
                                break;
                            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                            default:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.f1536a == audioAttributesImplBase.f1536a && this.f1539d == i13) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1537b), Integer.valueOf(this.f1538c), Integer.valueOf(this.f1536a), Integer.valueOf(this.f1539d)});
    }

    public final String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f1539d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f1539d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f1536a;
        int i11 = AudioAttributesCompat.f1532b;
        switch (i10) {
            case 0:
                strH = "USAGE_UNKNOWN";
                break;
            case 1:
                strH = "USAGE_MEDIA";
                break;
            case 2:
                strH = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strH = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strH = "USAGE_ALARM";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                strH = "USAGE_NOTIFICATION";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                strH = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strH = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strH = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strH = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strH = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strH = "USAGE_GAME";
                break;
            case 15:
            default:
                strH = b.h(i10, "unknown usage ");
                break;
            case 16:
                strH = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strH);
        sb2.append(" content=");
        sb2.append(this.f1537b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f1538c).toUpperCase());
        return sb2.toString();
    }
}
