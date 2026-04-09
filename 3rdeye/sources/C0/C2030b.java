package c0;

import C.S;
import W.AbstractC1613a;
import android.media.AudioRecord;
import android.util.Range;
import android.util.Rational;
import androidx.work.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: AudioConfigUtil.java */
/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2030b {
    public static int a(AbstractC1613a abstractC1613a) {
        int iE = abstractC1613a.e();
        if (iE == -1) {
            S.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        S.a("AudioConfigUtil", "Using provided AUDIO source: " + iE);
        return iE;
    }

    public static int b(AbstractC1613a abstractC1613a) {
        int iF = abstractC1613a.f();
        if (iF == -1) {
            S.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        S.a("AudioConfigUtil", "Using provided AUDIO source format: " + iF);
        return iF;
    }

    public static int c(int i, int i10, int i11, int i12, int i13, Range<Integer> range) {
        int iDoubleValue = (int) (new Rational(i12, i13).doubleValue() * new Rational(i10, i11).doubleValue() * i);
        String strConcat = S.d("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(iDoubleValue)) : "";
        if (!AbstractC1613a.f13230a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (S.d("AudioConfigUtil")) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
        }
        S.a("AudioConfigUtil", strConcat);
        return iDoubleValue;
    }

    public static int d(Range<Integer> range, int i, int i10, final int i11) {
        ArrayList arrayList = null;
        int i12 = 0;
        int iIntValue = i11;
        while (true) {
            if (range.contains((Range<Integer>) Integer.valueOf(iIntValue))) {
                int i13 = Z.k.f13933n;
                if (iIntValue > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(iIntValue, i == 1 ? 16 : 12, i10) > 0) {
                        return iIntValue;
                    }
                }
                StringBuilder sbI = s.i("Sample rate ", iIntValue, "Hz is not supported by audio source with channel count ", i, " and source format ");
                sbI.append(i10);
                S.a("AudioConfigUtil", sbI.toString());
            } else {
                S.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                S.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i11 + "Hz");
                arrayList = new ArrayList(Z.a.f13893a);
                Collections.sort(arrayList, new Comparator() { // from class: c0.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i14 = i11;
                        int iAbs = Math.abs(iIntValue2 - i14) - Math.abs(((Integer) obj2).intValue() - i14);
                        return (int) (iAbs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(iAbs));
                    }
                });
            }
            if (i12 >= arrayList.size()) {
                S.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            iIntValue = ((Integer) arrayList.get(i12)).intValue();
            i12++;
        }
    }
}
