package ba;

import android.os.Looper;
import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class f implements h {
    @Override // ba.h
    public final b9.e a(Looper looper, d dVar, Format format) {
        if (format.K == null) {
            return null;
        }
        return new b9.e(3, new b(new l(), 6001));
    }

    @Override // ba.h
    public final Class b(Format format) {
        if (format.K != null) {
            return m.class;
        }
        return null;
    }
}
