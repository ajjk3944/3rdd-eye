package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends IOException {
    public /* synthetic */ l(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(long j, long j8, int i4, IndexOutOfBoundsException indexOutOfBoundsException, int i10) {
        switch (i10) {
            case 5:
                Locale locale = Locale.US;
                StringBuilder sbY = d.h.y(j, "Pos: ", ", limit: ");
                sbY.append(j8);
                sbY.append(", len: ");
                sbY.append(i4);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbY.toString()), indexOutOfBoundsException);
                break;
            case 6:
                Locale locale2 = Locale.US;
                StringBuilder sbY2 = d.h.y(j, "Pos: ", ", limit: ");
                sbY2.append(j8);
                sbY2.append(", len: ");
                sbY2.append(i4);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbY2.toString()), indexOutOfBoundsException);
                break;
            default:
                Locale locale3 = Locale.US;
                StringBuilder sbY3 = d.h.y(j, "Pos: ", ", limit: ");
                sbY3.append(j8);
                sbY3.append(", len: ");
                sbY3.append(i4);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbY3.toString()), indexOutOfBoundsException);
                break;
        }
    }

    public l(int i4, IOException iOException, String str) {
        super(str + ", status code: " + i4, iOException);
    }
}
