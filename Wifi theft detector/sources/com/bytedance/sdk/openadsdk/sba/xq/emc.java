package com.bytedance.sdk.openadsdk.sba.xq;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class emc {
    private final SharedPreferences emc;

    public emc(Context context) {
        this.emc = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long emc() {
        return this.emc.getLong("last_upload_time", 0L);
    }

    public void emc(long j10) {
        SharedPreferences.Editor editorEdit = this.emc.edit();
        editorEdit.putLong("last_upload_time", j10);
        editorEdit.apply();
    }
}
