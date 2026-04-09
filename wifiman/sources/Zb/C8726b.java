package zb;

import android.os.Build;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import yb.AbstractC8643a;

/* renamed from: zb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8726b implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private final String f67238a;

    /* renamed from: b, reason: collision with root package name */
    private final String f67239b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67240c;

    /* renamed from: d, reason: collision with root package name */
    private final String f67241d;

    /* renamed from: e, reason: collision with root package name */
    private final String f67242e;

    public C8726b(String clientName, String clientVersion) {
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(clientVersion, "clientVersion");
        String str = clientName + MqttTopic.TOPIC_LEVEL_SEPARATOR + clientVersion;
        this.f67238a = str;
        String str2 = clientName + MqttTopic.TOPIC_LEVEL_SEPARATOR + clientVersion;
        this.f67239b = str2;
        String str3 = "Android/" + Build.VERSION.RELEASE;
        this.f67240c = str3;
        String str4 = clientName + " Android/display_name";
        this.f67241d = str4;
        this.f67242e = str + " " + str2 + " " + str3 + " " + str4;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        AbstractC6492s.i(chain, "chain");
        return chain.b(AbstractC8643a.c(chain.j().i(), this.f67242e).b());
    }
}
