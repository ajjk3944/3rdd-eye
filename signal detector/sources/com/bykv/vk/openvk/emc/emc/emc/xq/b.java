package com.bykv.vk.openvk.emc.emc.emc.xq;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b implements Serializable {
    private String aa;
    private int cf;
    private String msw;
    private String qh;
    private boolean ru;
    private int sb;
    private long sba;
    private int sra;
    private boolean ul;
    private c uym;
    private int vk;
    public int xq;
    private c ycc;
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

    public b(String str, c cVar, c cVar2, int i, int i3) {
        this.ylm = 0;
        this.sra = 0;
        this.msw = str;
        this.ycc = cVar;
        this.uym = cVar2;
        this.ylm = i;
        this.sra = i3;
    }

    public String aa() {
        if (qh()) {
            return this.uym.b();
        }
        c cVar = this.ycc;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public String bw() {
        return this.msw;
    }

    public float cf() {
        float f2 = this.emc;
        if (f2 != -1.0f) {
            return f2;
        }
        if (qh()) {
            this.uym.getClass();
            return -1.0f;
        }
        c cVar = this.ycc;
        if (cVar != null) {
            cVar.getClass();
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

    public void emc(int i) {
        this.sb = i;
    }

    public boolean gbl() {
        return this.yzg;
    }

    public c hxp() {
        return this.uym;
    }

    public int msw() {
        return this.cf;
    }

    public boolean qh() {
        c cVar;
        if (this.sra != 1 || (cVar = this.uym) == null || TextUtils.isEmpty(cVar.f6586g)) {
            return false;
        }
        return J1.c.f2040e == 2 ? Build.VERSION.SDK_INT >= 26 : this.ylm == 1;
    }

    public c rie() {
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
            return this.uym.f6582c;
        }
        c cVar = this.ycc;
        if (cVar != null) {
            return cVar.f6582c;
        }
        return 0L;
    }

    public boolean sz() {
        if (qh()) {
            return this.uym.f6593o == 0;
        }
        c cVar = this.ycc;
        return cVar == null || cVar.f6593o == 0;
    }

    public int ul() {
        return this.hxp;
    }

    public boolean uym() {
        return this.ul;
    }

    public String vk() {
        if (qh()) {
            return this.uym.f6586g;
        }
        c cVar = this.ycc;
        if (cVar != null) {
            return cVar.f6586g;
        }
        return null;
    }

    public JSONObject xq() {
        return this.sf;
    }

    public int ycc() {
        if (qh()) {
            return this.uym.a();
        }
        c cVar = this.ycc;
        if (cVar != null) {
            return cVar.a();
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
        int i = this.sb;
        return i == 1 || i == 2;
    }

    public void msw(int i) {
        this.db = i;
    }

    public void uym(int i) {
        this.ee = i;
    }

    public void xq(int i) {
        this.vk = i;
    }

    public void ypw(String str) {
        this.qh = str;
    }

    public void bw(int i) {
        this.rie = i;
    }

    public void dg(int i) {
        this.xq = i;
    }

    public void emc(String str) {
        this.msw = str;
    }

    public void xq(String str) {
        this.aa = str;
    }

    public void ypw(int i) {
        this.cf = i;
    }

    public void emc(long j6) {
        this.sba = j6;
    }

    public void xq(boolean z6) {
        this.ru = z6;
    }

    public void ypw(boolean z6) {
        this.zz = z6;
    }

    public void emc(boolean z6) {
        this.yzg = z6;
    }

    public void ycc(int i) {
        this.hxp = i;
    }

    public synchronized void emc(String str, Object obj) {
        this.dg.put(str, obj);
    }
}
