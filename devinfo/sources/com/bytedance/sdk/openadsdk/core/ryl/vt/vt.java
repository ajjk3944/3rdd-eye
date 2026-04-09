package com.bytedance.sdk.openadsdk.core.ryl.vt;

import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends lh implements Comparable<vt> {
    public final float ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        private final String ouw;
        private final float vt;

        /* renamed from: lh, reason: collision with root package name */
        private lh.EnumC0096lh f8431lh = lh.EnumC0096lh.TRACKING_URL;
        private boolean yu = false;

        public ouw(String str, float f10) {
            this.ouw = str;
            this.vt = f10;
        }

        public final vt ouw() {
            return new vt(this.vt, this.ouw, this.f8431lh, Boolean.valueOf(this.yu), (byte) 0);
        }
    }

    public /* synthetic */ vt(float f10, String str, lh.EnumC0096lh enumC0096lh, Boolean bool, byte b10) {
        this(f10, str, enumC0096lh, bool);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(vt vtVar) {
        vt vtVar2 = vtVar;
        if (vtVar2 == null) {
            return 1;
        }
        float f10 = this.ouw;
        float f11 = vtVar2.ouw;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.vt.lh
    public final void ouw() {
        super.ouw();
    }

    public final String toString() {
        return super.toString();
    }

    private vt(float f10, String str, lh.EnumC0096lh enumC0096lh, Boolean bool) {
        super(str, enumC0096lh, bool);
        this.ouw = f10;
    }
}
