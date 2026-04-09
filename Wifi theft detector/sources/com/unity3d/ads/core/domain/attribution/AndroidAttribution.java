package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import c9.c;
import c9.f;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import d9.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d1;
import kotlinx.coroutines.j1;
import n0.q;
import o1.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.h;
import y8.s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000b\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "", "Landroid/content/Context;", "context", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Landroid/adservices/measurement/MeasurementManager;", "getMeasurementManager", "(Landroid/content/Context;)Landroid/adservices/measurement/MeasurementManager;", "", "baseUrl", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Landroid/net/Uri;", "getUri", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;)Landroid/net/Uri;", "", "isAvailable", "(Lc9/c;)Ljava/lang/Object;", "url", "registerView", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lc9/c;)Ljava/lang/Object;", "registerClick", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "measurementManager$delegate", "Ly8/h;", "()Landroid/adservices/measurement/MeasurementManager;", "measurementManager", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "MissingPermission"})
@SourceDebugExtension({"SMAP\nAndroidAttribution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAttribution.kt\ncom/unity3d/ads/core/domain/attribution/AndroidAttribution\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,130:1\n29#2:131\n*S KotlinDebug\n*F\n+ 1 AndroidAttribution.kt\ncom/unity3d/ads/core/domain/attribution/AndroidAttribution\n*L\n124#1:131\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidAttribution {

    @NotNull
    private final ISDKDispatchers dispatchers;

    /* renamed from: measurementManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final h measurementManager;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidAttribution(@NotNull final Context context, @NotNull ISDKDispatchers dispatchers, @NotNull SessionRepository sessionRepository) {
        p.e(context, "context");
        p.e(dispatchers, "dispatchers");
        p.e(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager = b.b(new l9.a() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$measurementManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @Nullable
            public final MeasurementManager invoke() {
                return this.this$0.getMeasurementManager(context);
            }
        });
    }

    private final MeasurementManager getMeasurementManager() {
        return g.a(this.measurementManager.getValue());
    }

    private final Uri getUri(String baseUrl, AdObject adObject) {
        Uri uri = Uri.parse(baseUrl);
        p.d(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        p.d(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    @Nullable
    public final Object isAvailable(@NotNull c cVar) throws Throwable {
        s sVar;
        if (Device.getApiLevel() < 33) {
            return d9.a.a(false);
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return d9.a.a(false);
        }
        if (getMeasurementManager() == null) {
            return d9.a.a(false);
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return d9.a.a(false);
        }
        final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(j1.a(this.dispatchers.getDefault()), q.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }

                public void onError(@NotNull Exception error) {
                    p.e(error, "error");
                    c cVar2 = fVar;
                    Result.Companion companion = Result.INSTANCE;
                    cVar2.resumeWith(Result.b(Boolean.FALSE));
                }

                public void onResult(int status) {
                    c cVar2 = fVar;
                    Result.Companion companion = Result.INSTANCE;
                    cVar2.resumeWith(Result.b(Boolean.valueOf(status == 1)));
                }
            }));
            sVar = s.f25199a;
        } else {
            sVar = null;
        }
        if (sVar == null) {
            Result.Companion companion = Result.INSTANCE;
            fVar.resumeWith(Result.b(d9.a.a(false)));
        }
        Object objA = fVar.a();
        if (objA == kotlin.coroutines.intrinsics.a.f()) {
            e.c(cVar);
        }
        return objA;
    }

    @Nullable
    public final Object registerClick(@NotNull String str, @NotNull AdObject adObject, @NotNull c cVar) throws Throwable {
        WebViewContainer webViewContainer;
        d1 lastInputEvent;
        InputEvent inputEvent;
        s sVar;
        if (getMeasurementManager() == null) {
            return d9.a.a(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (inputEvent = (InputEvent) lastInputEvent.getValue()) == null) {
            return d9.a.a(false);
        }
        final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), inputEvent, j1.a(this.dispatchers.getDefault()), q.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onResult(@NotNull Object p02) {
                    p.e(p02, "p0");
                    c cVar2 = fVar;
                    Result.Companion companion = Result.INSTANCE;
                    cVar2.resumeWith(Result.b(Boolean.TRUE));
                }

                public void onError(@NotNull Exception error) {
                    p.e(error, "error");
                    c cVar2 = fVar;
                    Result.Companion companion = Result.INSTANCE;
                    cVar2.resumeWith(Result.b(Boolean.FALSE));
                }
            }));
            sVar = s.f25199a;
        } else {
            sVar = null;
        }
        if (sVar == null) {
            Result.Companion companion = Result.INSTANCE;
            fVar.resumeWith(Result.b(d9.a.a(false)));
        }
        Object objA = fVar.a();
        if (objA == kotlin.coroutines.intrinsics.a.f()) {
            e.c(cVar);
        }
        return objA;
    }

    @Nullable
    public final Object registerView(@NotNull String str, @NotNull AdObject adObject, @NotNull c cVar) throws Throwable {
        if (getMeasurementManager() == null) {
            return d9.a.a(false);
        }
        final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        MeasurementManager measurementManager = getMeasurementManager();
        s sVar = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, j1.a(this.dispatchers.getDefault()), q.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onResult(@NotNull Object p02) {
                    p.e(p02, "p0");
                    c cVar2 = fVar;
                    Result.Companion companion = Result.INSTANCE;
                    cVar2.resumeWith(Result.b(Boolean.TRUE));
                }

                public void onError(@NotNull Exception error) {
                    p.e(error, "error");
                    c cVar2 = fVar;
                    Result.Companion companion = Result.INSTANCE;
                    cVar2.resumeWith(Result.b(Boolean.FALSE));
                }
            }));
            sVar = s.f25199a;
        }
        if (sVar == null) {
            Result.Companion companion = Result.INSTANCE;
            fVar.resumeWith(Result.b(d9.a.a(false)));
        }
        Object objA = fVar.a();
        if (objA == kotlin.coroutines.intrinsics.a.f()) {
            e.c(cVar);
        }
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return g.a(context.getSystemService(o1.f.a()));
        }
        return null;
    }
}
