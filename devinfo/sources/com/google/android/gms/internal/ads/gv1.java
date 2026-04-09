package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gv1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f11616a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f11617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0 f11618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv1(xi0 xi0Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f11618c = xi0Var;
        this.f11616a = contentResolver;
        this.f11617b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        xi0 xi0Var = this.f11618c;
        xi0Var.h(ev1.a((Context) xi0Var.f18392a, (p50) xi0Var.j, (AudioDeviceInfo) xi0Var.f18399i));
    }
}
