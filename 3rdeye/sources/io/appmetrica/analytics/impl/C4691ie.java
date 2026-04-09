package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.ie, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4691ie {

    /* renamed from: a, reason: collision with root package name */
    public static final C4691ie f41065a = new C4691ie();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f41066b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f41067c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.9.0", "50132373");

    public final synchronized ExponentialBackoffDataHolder a(EnumC4639ge enumC4639ge) {
        Object exponentialBackoffDataHolder;
        try {
            LinkedHashMap linkedHashMap = f41066b;
            exponentialBackoffDataHolder = linkedHashMap.get(enumC4639ge);
            if (exponentialBackoffDataHolder == null) {
                exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new Pa(Ga.f39501F.x(), enumC4639ge), enumC4639ge.name());
                linkedHashMap.put(enumC4639ge, exponentialBackoffDataHolder);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }

    public static final NetworkTask a(C4940s5 c4940s5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C4745kh c4745kh = new C4745kh(aESRSARequestBodyEncrypter);
        Rb rb = new Rb(c4940s5);
        return new NetworkTask(new BlockingExecutor(), new Q9(c4940s5.f41599a), new AllHostsExponentialBackoffPolicy(f41065a.a(EnumC4639ge.REPORT)), new Fh(c4940s5, c4745kh, rb, new FullUrlFormer(c4745kh, rb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c4940s5.h(), c4940s5.o(), c4940s5.t(), aESRSARequestBodyEncrypter), E.u.G(new C4597eo()), f41067c);
    }
}
