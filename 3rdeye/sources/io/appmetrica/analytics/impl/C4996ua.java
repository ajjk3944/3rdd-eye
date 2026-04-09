package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import m9.C5338c;
import y9.C5819a;

/* renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4996ua implements vo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41722b;

    public C4996ua(Context context, String str) {
        this.f41721a = context;
        this.f41722b = str;
    }

    @Override // io.appmetrica.analytics.impl.vo
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f41721a, this.f41722b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f41721a, this.f41722b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return C5338c.L(fileFromSdkStorage);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.vo
    public final void a(String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f41721a, this.f41722b);
            if (fileFromSdkStorage != null) {
                C5338c.M(fileFromSdkStorage, str, C5819a.f48359b);
            }
        } catch (Throwable unused) {
        }
    }
}
