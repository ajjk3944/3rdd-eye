package com.bykv.vk.openvk.emc.emc.emc.xq;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq implements Serializable {

    /* renamed from: aa, reason: collision with root package name */
    private String f8975aa;
    private int cf;
    private String msw;
    private String qh;
    private boolean ru;
    private int sb;
    private long sba;
    private int sra;
    private boolean ul;
    private b uym;
    private int vk;
    public int xq;
    private b ycc;
    private int ylm;
    public String ypw;
    private boolean yzg;
    private boolean zz;
    private int gbl = 204800;
    private int sup = 0;
    private int sz = 0;
    protected float emc = -1.0f;
    public final HashMap<String, Object> dg = new HashMap<>();
    private int rie = 10000;
    private int hxp = 10000;
    private int ee = 10000;
    private int db = 0;
    public int bw = 1;
    private JSONObject sf = new JSONObject();

    public xq(String str, b bVar, b bVar2, int i10, int i11) {
        this.ylm = 0;
        this.sra = 0;
        this.msw = str;
        this.ycc = bVar;
        this.uym = bVar2;
        this.ylm = i10;
        this.sra = i11;
    }

    public String aa() {
        if (qh()) {
            return this.uym.q();
        }
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.q();
        }
        return null;
    }

    public String bw() {
        return this.msw;
    }

    public float cf() {
        float f10 = this.emc;
        if (f10 != -1.0f) {
            return f10;
        }
        if (qh()) {
            return this.uym.o();
        }
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.o();
        }
        return -1.0f;
    }

    public boolean db() {
        return this.ru;
    }

    public int dg() {
        return this.sf.optInt("pitaya_cache_size", 0);
    }

    public boolean ee() {
        return this.zz;
    }

    public void emc(int i10) {
        this.sb = i10;
    }

    public boolean gbl() {
        return this.yzg;
    }

    public b hxp() {
        return this.uym;
    }

    public int msw() {
        return this.cf;
    }

    public boolean qh() {
        b bVar;
        if (this.sra != 1 || (bVar = this.uym) == null || TextUtils.isEmpty(bVar.n())) {
            return false;
        }
        return q2.b.i() == 2 ? Build.VERSION.SDK_INT >= 26 : this.ylm == 1;
    }

    public b rie() {
        return this.ycc;
    }

    public long ru() {
        return this.sba;
    }

    public int sba() {
        return this.ylm;
    }

    public int sra() {
        return this.db;
    }

    public long sup() {
        if (qh()) {
            return this.uym.b();
        }
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.b();
        }
        return 0L;
    }

    public boolean sz() {
        if (qh()) {
            return this.uym.H();
        }
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.H();
        }
        return true;
    }

    public int ul() {
        return this.hxp;
    }

    public boolean uym() {
        return this.ul;
    }

    public String vk() {
        if (qh()) {
            return this.uym.n();
        }
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.n();
        }
        return null;
    }

    public JSONObject xq() {
        return this.sf;
    }

    public int ycc() {
        if (qh()) {
            return this.uym.e();
        }
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.e();
        }
        return 0;
    }

    public int ylm() {
        return this.ee;
    }

    public boolean ypw() {
        return this.sb == 2;
    }

    public int yzg() {
        return this.rie;
    }

    public int zz() {
        return this.vk;
    }

    public synchronized Object bw(String str) {
        return this.dg.get(str);
    }

    public void dg(String str) {
        this.ypw = str;
    }

    public boolean emc() {
        int i10 = this.sb;
        return i10 == 1 || i10 == 2;
    }

    public void msw(int i10) {
        this.db = i10;
    }

    public void uym(int i10) {
        this.ee = i10;
    }

    public void xq(int i10) {
        this.vk = i10;
    }

    public void ypw(String str) {
        this.qh = str;
    }

    public void bw(int i10) {
        this.rie = i10;
    }

    public void dg(int i10) {
        this.xq = i10;
    }

    public void emc(String str) {
        this.msw = str;
    }

    public void xq(String str) {
        this.f8975aa = str;
    }

    public void ypw(int i10) {
        this.cf = i10;
    }

    public void emc(long j10) {
        this.sba = j10;
    }

    public void xq(boolean z10) {
        this.ru = z10;
    }

    public void ypw(boolean z10) {
        this.zz = z10;
    }

    public void emc(boolean z10) {
        this.yzg = z10;
    }

    public void ycc(int i10) {
        this.hxp = i10;
    }

    public synchronized void emc(String str, Object obj) {
        this.dg.put(str, obj);
    }
}
