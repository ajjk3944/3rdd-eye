package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.yandex.mobile.ads.impl.do1;

/* loaded from: classes3.dex */
public final class re0 {

    /* renamed from: a, reason: collision with root package name */
    private final do1 f32598a;

    /* renamed from: b, reason: collision with root package name */
    private final fc f32599b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f32600c;

    public /* synthetic */ re0(Context context) {
        this(context, new do1(), new fc());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 5 */
    public final ec a() {
        try {
            this.f32598a.getClass();
            if (AdvertisingIdClient.class == 0) {
                return null;
            }
            do1 do1Var = this.f32598a;
            Object[] objArr = {this.f32600c};
            do1Var.getClass();
            Object objA = do1.a(AdvertisingIdClient.class, "getAdvertisingIdInfo", objArr);
            if (objA == null) {
                return null;
            }
            String str = (String) do1.a.a(objA, "getId", new Object[0]);
            Boolean bool = (Boolean) do1.a.a(objA, "isLimitAdTrackingEnabled", new Object[0]);
            this.f32599b.getClass();
            if (bool == null || str == null) {
                return null;
            }
            return new ec(str, bool.booleanValue());
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    public re0(Context context, do1 reflectHelper, fc advertisingInfoCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reflectHelper, "reflectHelper");
        kotlin.jvm.internal.l.f(advertisingInfoCreator, "advertisingInfoCreator");
        this.f32598a = reflectHelper;
        this.f32599b = advertisingInfoCreator;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f32600c = applicationContext;
    }
}
