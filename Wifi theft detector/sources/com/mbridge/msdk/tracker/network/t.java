package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* renamed from: a, reason: collision with root package name */
    private c f18347a;

    /* renamed from: b, reason: collision with root package name */
    private String f18348b;

    /* renamed from: c, reason: collision with root package name */
    private volatile p f18349c;

    /* renamed from: d, reason: collision with root package name */
    private long f18350d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f18351e;

    /* renamed from: f, reason: collision with root package name */
    private int f18352f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18353g;

    /* renamed from: h, reason: collision with root package name */
    private final int f18354h;

    /* renamed from: i, reason: collision with root package name */
    private final String f18355i;

    /* renamed from: j, reason: collision with root package name */
    private final int f18356j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f18357k;

    /* renamed from: l, reason: collision with root package name */
    private v.a f18358l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f18359m;

    /* renamed from: n, reason: collision with root package name */
    private u f18360n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18361o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18362p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18363q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18364r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18365s;

    /* renamed from: t, reason: collision with root package name */
    private x f18366t;

    /* renamed from: u, reason: collision with root package name */
    private b.a f18367u;

    /* renamed from: v, reason: collision with root package name */
    private long f18368v;

    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final boolean A() {
        return this.f18365s;
    }

    public final boolean B() {
        return this.f18364r;
    }

    public abstract v<T> a(q qVar);

    public abstract void a(T t10);

    public void a(String str) {
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    public b.a d() {
        return this.f18367u;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f18348b)) {
            return this.f18348b;
        }
        if (this.f18347a == null) {
            this.f18347a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f18347a.a(this);
        this.f18348b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f18352f;
    }

    public p h() {
        return this.f18349c;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return C.UTF8_NAME;
    }

    public int k() {
        return this.f18354h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f18368v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f18350d;
    }

    public x o() {
        return this.f18366t;
    }

    public String p() {
        return this.f18355i;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000L;
        }
        long jA = xVarO.a();
        if (jA < 0) {
            return 30000L;
        }
        return jA;
    }

    public int s() {
        return this.f18356j;
    }

    public String t() {
        return this.f18353g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb = new StringBuilder();
        sb.append(v() ? "[X] " : "[ ] ");
        sb.append(t());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(l());
        sb.append(" ");
        sb.append(this.f18359m);
        return sb.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f18357k) {
            z10 = this.f18363q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f18357k) {
            z10 = this.f18362p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f18357k) {
            this.f18363q = true;
        }
    }

    public void x() {
        synchronized (this.f18357k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.f18361o;
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public boolean a() {
        return false;
    }

    public void c(String str) {
        u uVar = this.f18360n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public String d(String str) {
        if (this.f18351e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f18351e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public t(int i10, String str, int i11, String str2) {
        this.f18357k = new Object();
        this.f18361o = false;
        this.f18362p = false;
        this.f18363q = false;
        this.f18364r = false;
        this.f18365s = false;
        this.f18367u = null;
        this.f18368v = 0L;
        this.f18352f = i10;
        this.f18353g = str;
        this.f18354h = i11;
        this.f18355i = str2;
        a((x) new e());
        this.f18356j = b(str);
        this.f18350d = SystemClock.elapsedRealtime();
    }

    public void a(v.a aVar) {
        this.f18358l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f18366t = xVar;
        return this;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public void a(int i10) {
        u uVar = this.f18360n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f18359m = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f18364r = z10;
        return this;
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.f18368v = bArrA.length;
            return bArrA;
        }
        this.f18368v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f18360n = uVar;
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb.append('&');
                    }
                }
            }
            if (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) {
                return ("p=" + URLEncoder.encode(v0.b(sb.toString(), "ebmclXzZOhtU2sRlZxGL8A"), str)).getBytes(str);
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f18365s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f18357k) {
            aVar = this.f18358l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f18361o = z10;
        return this;
    }

    public void a(v<?> vVar) {
        synchronized (this.f18357k) {
        }
    }

    public void a(p pVar) {
        this.f18349c = pVar;
    }

    public void a(String str, String str2) {
        if (this.f18351e == null) {
            this.f18351e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f18351e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        a aVarL = l();
        a aVarL2 = tVar.l();
        return aVarL == aVarL2 ? this.f18359m.intValue() - tVar.f18359m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }
}
