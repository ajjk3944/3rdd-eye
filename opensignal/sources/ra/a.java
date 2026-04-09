package ra;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import fb.f;
import java.nio.ByteBuffer;
import java.util.Arrays;
import pa.c;

/* loaded from: classes.dex */
public final class a extends ic.a {
    public static EventMessage S(f fVar) {
        String strK = fVar.k();
        strK.getClass();
        String strK2 = fVar.k();
        strK2.getClass();
        return new EventMessage(strK, strK2, fVar.j(), fVar.j(), Arrays.copyOfRange(fVar.f8800a, fVar.f8801b, fVar.f8802c));
    }

    @Override // ic.a
    public final Metadata m(c cVar, ByteBuffer byteBuffer) {
        return new Metadata(S(new f(byteBuffer.limit(), byteBuffer.array())));
    }
}
