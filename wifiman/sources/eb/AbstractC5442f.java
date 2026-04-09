package eb;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;

/* renamed from: eb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5442f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
        } else {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            bArrArray = bArr;
        }
        AbstractC6492s.f(bArrArray);
        return new String(bArrArray, C6510d.f52215b);
    }
}
