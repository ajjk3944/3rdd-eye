package i2;

import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import u2.C5624c;
import u2.C5629h;

/* compiled from: R8$$SyntheticClass */
/* renamed from: i2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4446f implements InterfaceC4431D {
    @Override // i2.InterfaceC4431D
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C4446f c4446f = LottieAnimationView.f18590r;
        C5629h.a aVar = C5629h.f46557a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        C5624c.c("Unable to load composition.", th);
    }
}
