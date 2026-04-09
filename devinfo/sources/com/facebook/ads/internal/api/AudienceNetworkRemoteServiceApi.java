package com.facebook.ads.internal.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Keep;
import com.facebook.proguard.annotations.DoNotStripAny;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
@DoNotStripAny
/* loaded from: classes.dex */
public interface AudienceNetworkRemoteServiceApi {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @Keep
    @DoNotStripAny
    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @Keep
    @DoNotStripAny
    public interface PackageVerifier {
        String verifyPackage(Context context, Message message, String str);
    }

    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();

    void setMessageHandler(MessageHandler messageHandler);

    void setPackageVerifier(PackageVerifier packageVerifier);
}
