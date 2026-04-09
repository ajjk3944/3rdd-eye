package ia;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: Source.kt */
/* loaded from: classes3.dex */
public interface C extends Closeable {
    long read(C4468d c4468d, long j4) throws IOException;

    D timeout();
}
