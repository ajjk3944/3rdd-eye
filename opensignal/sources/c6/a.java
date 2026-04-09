package c6;

import a5.v;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.android.gms.internal.measurement.b4;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends b4 {
    public static EventMessage k0(v vVar) {
        String strO = vVar.o();
        strO.getClass();
        String strO2 = vVar.o();
        strO2.getClass();
        return new EventMessage(strO, strO2, vVar.n(), vVar.n(), Arrays.copyOfRange(vVar.f165a, vVar.f166b, vVar.f167c));
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Metadata x(a6.a aVar, ByteBuffer byteBuffer) {
        return new Metadata(k0(new v(byteBuffer.limit(), byteBuffer.array())));
    }
}
