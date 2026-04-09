package g2;

import T1.z;
import android.content.Context;
import android.text.TextUtils;
import d2.C4268c;
import java.util.List;

/* compiled from: RemoteWorkManager.java */
/* renamed from: g2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4381e {
    public static AbstractC4381e d(Context context) {
        z zVarC = z.c(context);
        if (zVarC.f12238j == null) {
            synchronized (z.f12229o) {
                try {
                    if (zVarC.f12238j == null) {
                        zVarC.g();
                        if (zVarC.f12238j == null && !TextUtils.isEmpty(zVarC.f12231b.i)) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } finally {
                }
            }
        }
        AbstractC4381e abstractC4381e = zVarC.f12238j;
        if (abstractC4381e != null) {
            return abstractC4381e;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    public abstract C4268c a();

    public abstract C4268c b();

    public abstract C4268c c(String str, androidx.work.g gVar, List list);
}
