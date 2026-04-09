package p1;

import android.util.Log;
import androidx.lifecycle.f1;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import pf.o0;
import pf.p0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ba.d, de.d {
    @Override // ba.d
    public Object apply(Object obj) {
        String strN = p0.f31882b.n((o0) obj);
        nk.k.d(strN, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strN.getBytes(vk.a.f36267a);
        nk.k.d(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // de.d
    public Object c(f1 f1Var) {
        return FirebaseSessionsRegistrar.getComponents$lambda$0(f1Var);
    }
}
