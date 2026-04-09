package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class Ra implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sa f40044a;

    public Ra(Sa sa2) {
        this.f40044a = sa2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f40044a.f40102a.getContentResolver();
        Sa sa2 = this.f40044a;
        sa2.f40103b = contentResolver.query(uri, null, null, new String[]{sa2.f40102a.getPackageName()}, null);
        Cursor cursor = this.f40044a.f40103b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f40044a.f40103b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C5102yg(string, this.f40044a.f40103b.getLong(1), this.f40044a.f40103b.getLong(2), EnumC5077xg.f42079d);
    }
}
