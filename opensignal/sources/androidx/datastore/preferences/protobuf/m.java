package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m extends IOException {
    public /* synthetic */ m(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(long j, long j7, int i10, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbK = w.g.k(j, "Pos: ", ", limit: ");
        sbK.append(j7);
        sbK.append(", len: ");
        sbK.append(i10);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbK.toString()), indexOutOfBoundsException);
    }
}
