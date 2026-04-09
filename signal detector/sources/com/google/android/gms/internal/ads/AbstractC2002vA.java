package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.vA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2002vA {

    /* renamed from: a, reason: collision with root package name */
    public static final ClipData f17230a = ClipData.newIntent("", new Intent());

    public static Intent a(Intent intent, int i) {
        boolean zB = b(0, 17);
        boolean zB2 = b(0, 9);
        boolean zB3 = b(0, 5);
        boolean zB4 = b(0, 3);
        AbstractC0582Jp.y("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            AbstractC0582Jp.y("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i, 67108864));
        } else {
            AbstractC0582Jp.y("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i, 67108864)) {
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
                intent2.setClipData(f17230a);
            }
        }
        return intent2;
    }

    public static boolean b(int i, int i3) {
        return (i & i3) == i3;
    }
}
