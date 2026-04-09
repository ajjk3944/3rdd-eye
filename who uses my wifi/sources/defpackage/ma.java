package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ma implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (i != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
