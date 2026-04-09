package t9;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.jvm.internal.p;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public abstract class f extends e {
    public static final DurationUnit d(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return DurationUnit.f22194g;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return DurationUnit.f22193f;
        }
        if (c10 == 'M') {
            return DurationUnit.f22192e;
        }
        if (c10 == 'S') {
            return DurationUnit.f22191d;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    public static final DurationUnit e(String shortName) {
        p.e(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnit.f22189b;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnit.f22188a;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnit.f22190c;
                        }
                    } else if (shortName.equals("s")) {
                        return DurationUnit.f22191d;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnit.f22192e;
                }
            } else if (shortName.equals("h")) {
                return DurationUnit.f22193f;
            }
        } else if (shortName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
            return DurationUnit.f22194g;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
