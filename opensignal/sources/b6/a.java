package b6;

import a5.u;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import com.google.android.gms.internal.measurement.b4;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import ne.g;

/* loaded from: classes.dex */
public final class a extends b4 {
    @Override // com.google.android.gms.internal.measurement.b4
    public final Metadata x(a6.a aVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            u uVar = new u(byteBuffer.array(), byteBuffer.limit(), 0, (byte) 0);
            uVar.s(12);
            int iF = (uVar.f() + uVar.i(12)) - 4;
            uVar.s(44);
            uVar.t(uVar.i(12));
            uVar.s(16);
            ArrayList arrayList = new ArrayList();
            while (uVar.f() < iF) {
                uVar.s(48);
                int i10 = uVar.i(8);
                uVar.s(4);
                int iF2 = uVar.f() + uVar.i(12);
                String str = null;
                String str2 = null;
                while (uVar.f() < iF2) {
                    int i11 = uVar.i(8);
                    int i12 = uVar.i(8);
                    int iF3 = uVar.f() + i12;
                    if (i11 == 2) {
                        int i13 = uVar.i(16);
                        uVar.s(8);
                        if (i13 == 3) {
                            while (uVar.f() < iF3) {
                                int i14 = uVar.i(8);
                                Charset charset = g.f17522a;
                                byte[] bArr = new byte[i14];
                                uVar.k(i14, bArr);
                                str = new String(bArr, charset);
                                int i15 = uVar.i(8);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    uVar.t(uVar.i(8));
                                }
                            }
                        }
                    } else if (i11 == 21) {
                        Charset charset2 = g.f17522a;
                        byte[] bArr2 = new byte[i12];
                        uVar.k(i12, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    uVar.p(iF3 * 8);
                }
                uVar.p(iF2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new AppInfoTable(i10, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
        }
        return null;
    }
}
