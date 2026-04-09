package pb;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes.dex */
public abstract class w {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
