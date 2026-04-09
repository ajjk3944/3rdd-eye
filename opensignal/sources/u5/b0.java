package u5;

import a5.d0;
import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.k0;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b0 {
    public static Metadata a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = d0.f105a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                a5.a.B("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.d(new a5.v(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e4) {
                    a5.a.C("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static o2.g b(a5.v vVar, boolean z10, boolean z11) throws k0 {
        if (z10) {
            c(3, vVar, false);
        }
        vVar.r((int) vVar.k(), ne.g.f17524c);
        long jK = vVar.k();
        String[] strArr = new String[(int) jK];
        for (int i10 = 0; i10 < jK; i10++) {
            strArr[i10] = vVar.r((int) vVar.k(), ne.g.f17524c);
        }
        if (z11 && (vVar.t() & 1) == 0) {
            throw k0.a(null, "framing bit expected to be set");
        }
        return new o2.g(19, strArr);
    }

    public static boolean c(int i10, a5.v vVar, boolean z10) throws k0 {
        if (vVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw k0.a(null, "too short header: " + vVar.a());
        }
        if (vVar.t() != i10) {
            if (z10) {
                return false;
            }
            throw k0.a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (vVar.t() == 118 && vVar.t() == 111 && vVar.t() == 114 && vVar.t() == 98 && vVar.t() == 105 && vVar.t() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw k0.a(null, "expected characters 'vorbis'");
    }
}
