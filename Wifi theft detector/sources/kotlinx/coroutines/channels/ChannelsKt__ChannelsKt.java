package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.e;
import y8.s;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ChannelsKt__ChannelsKt {
    public static final Object a(o oVar, Object obj) {
        Object objN = oVar.n(obj);
        if (objN instanceof e.c) {
            return ((e) kotlinx.coroutines.j.b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(oVar, obj, null), 1, null)).k();
        }
        return e.f22291b.c(s.f25199a);
    }
}
