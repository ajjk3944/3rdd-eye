package com.bykv.vk.openvk.ouw.ouw.ouw.lh;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a implements Serializable {
    public String bly;

    /* renamed from: cf, reason: collision with root package name */
    public boolean f6564cf;
    public boolean fkw;

    /* renamed from: jg, reason: collision with root package name */
    public String f6565jg;
    public int ko;

    /* renamed from: le, reason: collision with root package name */
    public String f6566le;

    /* renamed from: lh, reason: collision with root package name */
    public String f6567lh;

    /* renamed from: od, reason: collision with root package name */
    private int f6568od;
    public c ouw;
    public int pno;
    public int ra;
    public int rn;
    public boolean ryl;
    public long tlj;
    public int vpp;
    public c vt;
    public boolean yu;
    private int tc = 204800;
    private int ksc = 0;
    private int jae = 0;
    protected float mwh = -1.0f;
    public final HashMap<String, Object> zih = new HashMap<>();
    public int vm = 10000;

    /* renamed from: th, reason: collision with root package name */
    public int f6569th = 10000;
    public int qbp = 10000;
    public int zin = 0;
    public int jqy = 1;
    public JSONObject ex = new JSONObject();

    public a(String str, c cVar, c cVar2, int i4, int i10) {
        this.rn = 0;
        this.f6568od = 0;
        this.f6567lh = str;
        this.ouw = cVar;
        this.vt = cVar2;
        this.rn = i4;
        this.f6568od = i10;
    }

    public final String bly() {
        if (le()) {
            return this.vt.b();
        }
        c cVar = this.ouw;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public final boolean fkw() {
        if (le()) {
            return this.vt.f6585o == 0;
        }
        c cVar = this.ouw;
        return cVar == null || cVar.f6585o == 0;
    }

    public final boolean le() {
        c cVar;
        if (this.f6568od != 1 || (cVar = this.vt) == null || TextUtils.isEmpty(cVar.g)) {
            return false;
        }
        return v8.a.f35978e == 2 ? Build.VERSION.SDK_INT >= 26 : this.rn == 1;
    }

    public final int lh() {
        if (le()) {
            return this.vt.c();
        }
        c cVar = this.ouw;
        if (cVar != null) {
            return cVar.c();
        }
        return 0;
    }

    public final boolean ouw() {
        int i4 = this.vpp;
        return i4 == 1 || i4 == 2;
    }

    public final String pno() {
        if (le()) {
            return this.vt.g;
        }
        c cVar = this.ouw;
        if (cVar != null) {
            return cVar.g;
        }
        return null;
    }

    public final float ra() {
        float f10 = this.mwh;
        if (f10 != -1.0f) {
            return f10;
        }
        if (le()) {
            this.vt.getClass();
            return -1.0f;
        }
        c cVar = this.ouw;
        if (cVar != null) {
            cVar.getClass();
        }
        return -1.0f;
    }

    public final int vt() {
        return this.ex.optInt("pitaya_cache_size", 0);
    }

    public final long yu() {
        if (le()) {
            return this.vt.f6575c;
        }
        c cVar = this.ouw;
        if (cVar != null) {
            return cVar.f6575c;
        }
        return 0L;
    }

    public final synchronized void ouw(String str, Object obj) {
        this.zih.put(str, obj);
    }

    public final synchronized Object ouw(String str) {
        return this.zih.get(str);
    }
}
