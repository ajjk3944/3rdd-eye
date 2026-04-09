package j5;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import java.util.Map;
import o5.w0;

/* loaded from: classes.dex */
public final class r extends w0 {
    public final Map H;
    public DrmInitData I;

    public r(r5.b bVar, i5.j jVar, i5.f fVar, Map map) {
        super(bVar, jVar, fVar);
        this.H = map;
    }

    @Override // o5.w0
    public final androidx.media3.common.r k(androidx.media3.common.r rVar) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.I;
        if (drmInitData2 == null) {
            drmInitData2 = rVar.K;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.H.get(drmInitData2.f1542g)) != null) {
            drmInitData2 = drmInitData;
        }
        Metadata metadata = rVar.F;
        Metadata metadata2 = null;
        if (metadata == null) {
            metadata = metadata2;
        } else {
            Metadata.Entry[] entryArr = metadata.f1549a;
            int length = entryArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry entry = entryArr[i11];
                if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).f2002d)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    Metadata.Entry[] entryArr2 = new Metadata.Entry[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            entryArr2[i10 < i11 ? i10 : i10 - 1] = entryArr[i10];
                        }
                        i10++;
                    }
                    metadata2 = new Metadata(entryArr2);
                }
                metadata = metadata2;
            }
        }
        if (drmInitData2 != rVar.K || metadata != rVar.F) {
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.f1745n = drmInitData2;
            qVarA.f1742i = metadata;
            rVar = new androidx.media3.common.r(qVarA);
        }
        return super.k(rVar);
    }
}
