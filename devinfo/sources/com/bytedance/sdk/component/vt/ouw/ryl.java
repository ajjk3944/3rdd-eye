package com.bytedance.sdk.component.vt.ouw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ryl {
    public cf ouw;
    public com.bytedance.sdk.component.lh.ouw.ouw vt = new com.bytedance.sdk.component.lh.ouw.ouw();

    public abstract com.bytedance.sdk.component.vt.ouw.ouw fkw();

    public abstract String le();

    public abstract String lh();

    public abstract Object ouw();

    public mwh pno() {
        return null;
    }

    public abstract int ra();

    public abstract ra vt();

    public abstract Map<String, List<String>> yu();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public Object fkw;

        /* renamed from: le, reason: collision with root package name */
        mwh f7664le;

        /* renamed from: lh, reason: collision with root package name */
        public ra f7665lh;
        public com.bytedance.sdk.component.vt.ouw.ouw ouw;
        public String pno;
        public int ra;
        Map<String, List<String>> vt;
        String yu;

        public ouw() {
            this.vt = new HashMap();
        }

        public final ouw ouw(String str) {
            this.f7665lh = ra.vt(str);
            return this;
        }

        public ouw(ryl rylVar) {
            this.f7665lh = rylVar.vt();
            this.yu = rylVar.lh();
            this.vt = rylVar.yu();
            this.fkw = rylVar.ouw();
            this.f7664le = rylVar.pno();
            this.ouw = rylVar.fkw();
            this.ra = rylVar.ra();
            this.pno = rylVar.le();
        }

        public final ouw ouw(String str, String str2) {
            if (!this.vt.containsKey(str)) {
                this.vt.put(str, new ArrayList());
            }
            this.vt.get(str).add(str2);
            return this;
        }

        public final ouw ouw(String str, mwh mwhVar) {
            this.yu = str;
            this.f7664le = mwhVar;
            return this;
        }

        public final ryl ouw() {
            return new ryl() { // from class: com.bytedance.sdk.component.vt.ouw.ryl.ouw.1
                @Override // com.bytedance.sdk.component.vt.ouw.ryl
                public final com.bytedance.sdk.component.vt.ouw.ouw fkw() {
                    return ouw.this.ouw;
                }

                @Override // com.bytedance.sdk.component.vt.ouw.ryl
                public final String le() {
                    return ouw.this.pno;
                }

                @Override // com.bytedance.sdk.component.vt.ouw.ryl
                public final String lh() {
                    return ouw.this.yu;
                }

                @Override // com.bytedance.sdk.component.vt.ouw.ryl
                public final Object ouw() {
                    return ouw.this.fkw;
                }

                @Override // com.bytedance.sdk.component.vt.ouw.ryl
                public final mwh pno() {
                    return ouw.this.f7664le;
                }

                @Override // com.bytedance.sdk.component.vt.ouw.ryl
                public final int ra() {
                    return ouw.this.ra;
                }

                public final String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.vt.ouw.ryl
                public final ra vt() {
                    return ouw.this.f7665lh;
                }

                @Override // com.bytedance.sdk.component.vt.ouw.ryl
                public final Map yu() {
                    return ouw.this.vt;
                }
            };
        }
    }
}
