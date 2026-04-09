package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Map;
import ya.r0;

/* loaded from: classes.dex */
public final class t extends r0 {
    public final Map I;
    public DrmInitData J;

    public t(pb.b bVar, Looper looper, ba.h hVar, ba.d dVar, Map map) {
        super(bVar, looper, hVar, dVar);
        this.I = map;
    }

    @Override // ya.r0
    public final Format l(Format format) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.J;
        if (drmInitData2 == null) {
            drmInitData2 = format.K;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.I.get(drmInitData2.f4097g)) != null) {
            drmInitData2 = drmInitData;
        }
        Metadata metadata = format.F;
        Metadata metadata2 = null;
        if (metadata == null) {
            metadata = metadata2;
        } else {
            Metadata.Entry[] entryArr = metadata.f4241a;
            int length = entryArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry entry = entryArr[i11];
                if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).f4298d)) {
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
        if (drmInitData2 != format.K || metadata != format.F) {
            g0 g0VarD = format.d();
            g0VarD.f4153n = drmInitData2;
            g0VarD.f4150i = metadata;
            format = new Format(g0VarD);
        }
        return super.l(format);
    }
}
