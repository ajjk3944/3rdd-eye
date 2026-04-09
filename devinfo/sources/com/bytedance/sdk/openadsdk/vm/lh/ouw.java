package com.bytedance.sdk.openadsdk.vm.lh;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public final SharedPreferences ouw;

    public ouw(Context context) {
        this.ouw = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public final void ouw(long j) {
        SharedPreferences.Editor editorEdit = this.ouw.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }
}
