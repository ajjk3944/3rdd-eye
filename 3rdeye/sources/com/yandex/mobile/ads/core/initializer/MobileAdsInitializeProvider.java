package com.yandex.mobile.ads.core.initializer;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.wf;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class MobileAdsInitializeProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private final wf f24003a;

    public MobileAdsInitializeProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        l.f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        l.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        l.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        this.f24003a.a(context, new rm2(context));
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        l.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.f(uri, "uri");
        return 0;
    }

    public MobileAdsInitializeProvider(wf appStartupInitializer) {
        l.f(appStartupInitializer, "appStartupInitializer");
        this.f24003a = appStartupInitializer;
    }

    public /* synthetic */ MobileAdsInitializeProvider(wf wfVar, int i, g gVar) {
        this((i & 1) != 0 ? new wf() : wfVar);
    }
}
