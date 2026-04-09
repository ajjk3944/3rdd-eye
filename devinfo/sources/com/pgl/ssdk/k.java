package com.pgl.ssdk;

import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class k {
    /* JADX WARN: Removed duplicated region for block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00c2 -> B:95:0x00c5). Please report as a decompilation issue!!! */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.pgl.ssdk.e> a(java.io.File r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.k.a(java.io.File):java.util.List");
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Segment.SHARE_MINIMUM];
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 != -1) {
                byteArrayOutputStream.write(bArr, 0, i4);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
