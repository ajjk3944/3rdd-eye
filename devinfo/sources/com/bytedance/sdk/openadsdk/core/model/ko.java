package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko implements com.bytedance.sdk.component.adexpress.lh {
    public JSONObject bly;

    /* renamed from: cf, reason: collision with root package name */
    public final boolean f8232cf;
    public final long fkw;

    /* renamed from: jg, reason: collision with root package name */
    public boolean f8233jg;
    public int ko;

    /* renamed from: le, reason: collision with root package name */
    public final long f8234le;

    /* renamed from: lh, reason: collision with root package name */
    public final float f8235lh;
    public JSONObject mwh;
    public final float ouw;
    public int pno;
    public final String ra;
    public int ryl;
    public SparseArray<lh.ouw> tlj;
    public final float vt;
    public final float yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public int bly;

        /* renamed from: cf, reason: collision with root package name */
        public int f8236cf;
        public float fkw;
        public boolean ko;

        /* renamed from: le, reason: collision with root package name */
        public float f8238le;

        /* renamed from: lh, reason: collision with root package name */
        public float f8239lh;
        public long ouw;
        public String pno;
        public int ra;
        public JSONObject ryl;
        public JSONObject tlj;
        public long vt;
        public float yu;
        public boolean mwh = false;

        /* renamed from: jg, reason: collision with root package name */
        protected SparseArray<lh.ouw> f8237jg = new SparseArray<>();

        public final ouw ouw(SparseArray<lh.ouw> sparseArray) {
            this.f8237jg = sparseArray;
            return this;
        }

        public final ko ouw() {
            return new ko(this, (byte) 0);
        }
    }

    public /* synthetic */ ko(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    private ko(ouw ouwVar) {
        this.f8233jg = false;
        this.ouw = ouwVar.f8238le;
        this.vt = ouwVar.fkw;
        this.f8235lh = ouwVar.yu;
        this.yu = ouwVar.f8239lh;
        this.fkw = ouwVar.vt;
        this.f8234le = ouwVar.ouw;
        this.ra = ouwVar.pno;
        this.tlj = ouwVar.f8237jg;
        this.f8232cf = ouwVar.ko;
        this.pno = ouwVar.bly;
        this.bly = ouwVar.tlj;
        this.ryl = ouwVar.f8236cf;
        this.mwh = ouwVar.ryl;
        this.f8233jg = ouwVar.mwh;
        this.ko = ouwVar.ra;
    }
}
