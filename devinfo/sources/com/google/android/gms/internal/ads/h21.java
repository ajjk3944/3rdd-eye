package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h21 {

    /* renamed from: a, reason: collision with root package name */
    public static final ClipData f11687a = ClipData.newIntent("", new Intent());

    public static Intent a(Intent intent, int i4) {
        boolean zB = b(0, 17);
        boolean zB2 = b(0, 9);
        boolean zB3 = b(0, 5);
        boolean zB4 = b(0, 3);
        mq0.y("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            mq0.y("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i4, 67108864));
        } else {
            mq0.y("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i4, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i4, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zB4 && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zB2 && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zB3 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zB && intent2.getClipData() == null) {
                intent2.setClipData(f11687a);
            }
        }
        return intent2;
    }

    public static boolean b(int i4, int i10) {
        return (i4 & i10) == i10;
    }
}
