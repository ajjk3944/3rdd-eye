package D8;

import b8.AbstractC4075b;
import com.ui.wifiman.model.network.hosts.NetworkHost;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class b {
    public static final AbstractC4075b a(NetworkHost.a aVar) {
        dd.i iVarC;
        AbstractC6492s.i(aVar, "<this>");
        if (AbstractC6492s.d(aVar.a(), "0.0.0.0") || (iVarC = aVar.c()) == null) {
            return null;
        }
        return iVarC.d();
    }
}
