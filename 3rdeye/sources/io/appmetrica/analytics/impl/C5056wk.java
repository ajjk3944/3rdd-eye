package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5056wk implements ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41984a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4930rl f41985b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f41986c;

    public C5056wk(Context context, InterfaceC4930rl interfaceC4930rl, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f41984a = context;
        this.f41985b = interfaceC4930rl;
        this.f41986c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f41984a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f41984a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f41986c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f41984a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C4829nn c4829nn;
        C4916r7 c4916r7A = C4916r7.a(this.f41984a);
        synchronized (c4916r7A) {
            try {
                if (c4916r7A.f41549o == null) {
                    Context context = c4916r7A.f41540e;
                    Pm pm = Pm.SERVICE;
                    if (c4916r7A.f41548n == null) {
                        c4916r7A.f41548n = new C4803mn(new C4827nl(c4916r7A.h()), "temp_cache");
                    }
                    c4916r7A.f41549o = new C4829nn(context, pm, c4916r7A.f41548n);
                }
                c4829nn = c4916r7A.f41549o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4829nn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new Sb(this.f41985b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C4897qd(str, this.f41985b);
    }
}
