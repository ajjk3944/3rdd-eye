package O2;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class d implements C2.j {
    @Override // C2.j
    public C2.c b(C2.g gVar) {
        return C2.c.SOURCE;
    }

    @Override // C2.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(E2.c cVar, File file, C2.g gVar) throws Throwable {
        try {
            W2.a.f(((c) cVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
