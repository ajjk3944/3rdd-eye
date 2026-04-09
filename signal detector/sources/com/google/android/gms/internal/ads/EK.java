package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public class EK extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EK(long j6, long j7, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j6 + ", limit: " + j7 + ", len: " + i), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public EK(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public EK(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        q5.i.d(string, "toString(...)");
        super(string);
    }

    public EK(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }
}
