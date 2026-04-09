package com.bytedance.sdk.openadsdk.mwh;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly {
    public final AudioManager ouw;
    public int vt = -1;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f8597lh = false;

    public bly(Context context) {
        this.ouw = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }
}
