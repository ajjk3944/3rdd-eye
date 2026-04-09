package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class Me {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39863a;

    /* renamed from: b, reason: collision with root package name */
    public final C4700io f39864b;

    /* renamed from: c, reason: collision with root package name */
    public final C4726jo f39865c;

    public Me(Context context) {
        this(context, new C4700io(), new C4726jo());
    }

    public final String a(String str) {
        try {
            this.f39865c.getClass();
            if (!C4726jo.a(str)) {
                this.f39864b.getClass();
                str = y9.n.X(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f39863a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC4533cb.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Me(Context context, C4700io c4700io, C4726jo c4726jo) {
        this.f39863a = context;
        this.f39864b = c4700io;
        this.f39865c = c4726jo;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f39863a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f39863a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
