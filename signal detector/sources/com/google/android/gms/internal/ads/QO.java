package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class QO extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f10613a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0447Bq f10615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QO(C0447Bq c0447Bq, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f10615c = c0447Bq;
        this.f10613a = contentResolver;
        this.f10614b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        C0447Bq c0447Bq = this.f10615c;
        c0447Bq.a(OO.a((Context) c0447Bq.f7446b, (C0729Sj) c0447Bq.f7453j, (AudioDeviceInfo) c0447Bq.i));
    }
}
