package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ah3 extends Exception {
    public final int f;

    public ah3(String str, int i) {
        super(str);
        this.f = i;
    }

    public final bw a() {
        if (getCause() == null) {
            super.getMessage();
        } else {
            super.getMessage();
            getCause();
        }
        return new bw(super.getMessage(), this.f);
    }

    public ah3(int i, String str, IOException iOException) {
        super(str, iOException);
        this.f = i;
    }
}
