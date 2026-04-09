package fd;

import android.os.Build;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: fd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5807a implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private final String f47299a;

    public C5807a(String clientName, String clientVersion) {
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(clientVersion, "clientVersion");
        this.f47299a = clientName + MqttTopic.TOPIC_LEVEL_SEPARATOR + clientVersion + " (Android " + Build.VERSION.RELEASE + ")";
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        AbstractC6492s.i(chain, "chain");
        return chain.b(chain.j().i().c("User-Agent", this.f47299a).b());
    }
}
