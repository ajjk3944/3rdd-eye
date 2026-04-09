package com.bytedance.sdk.openadsdk.core.ryl.vt;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends lh implements Comparable<ouw> {
    public long ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ryl.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0097ouw {

        /* renamed from: lh, reason: collision with root package name */
        private lh.EnumC0096lh f8430lh = lh.EnumC0096lh.TRACKING_URL;
        private final String ouw;
        private final long vt;

        public C0097ouw(String str, long j) {
            this.ouw = str;
            this.vt = j;
        }

        public final ouw ouw() {
            return new ouw(this.vt, this.ouw, this.f8430lh, Boolean.FALSE);
        }
    }

    public ouw(long j, String str, lh.EnumC0096lh enumC0096lh, Boolean bool) {
        super(str, enumC0096lh, bool);
        this.ouw = j;
    }

    public static int ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Float.parseFloat(strArrSplit[2]) * 1000.0f) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Integer.parseInt(strArrSplit[0]) * 3600000));
            } catch (Throwable unused) {
            }
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ouw ouwVar) {
        ouw ouwVar2 = ouwVar;
        if (ouwVar2 == null) {
            return 1;
        }
        long j = this.ouw;
        long j8 = ouwVar2.ouw;
        if (j > j8) {
            return 1;
        }
        return j < j8 ? -1 : 0;
    }

    public final String toString() {
        return super.toString();
    }
}
