package com.mbridge.msdk.foundation.buffer.sharedperference;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f14659b = "a";

    /* renamed from: c, reason: collision with root package name */
    private static a f14660c;

    /* renamed from: a, reason: collision with root package name */
    FastKV f14661a;

    private a() {
    }

    public static synchronized a b() {
        try {
            if (f14660c == null) {
                f14660c = new a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14660c;
    }

    public String a(String str) {
        try {
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f14659b, "get error: " + e10.getMessage());
            }
        }
        if (c.n().d() == null) {
            return null;
        }
        a();
        FastKV fastKV = this.f14661a;
        if (fastKV != null) {
            try {
                return fastKV.getString(str, "");
            } catch (Exception unused) {
                return "";
            }
        }
        return null;
    }

    public void c(String str) {
        if (c.n().d() == null) {
            return;
        }
        a();
        FastKV fastKV = this.f14661a;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused) {
            }
        }
    }

    public Long b(String str) {
        try {
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f14659b, "getLong error: " + e10.getMessage());
            }
        }
        if (c.n().d() == null) {
            q0.b(f14659b, "context is null in get");
            return 0L;
        }
        a();
        FastKV fastKV = this.f14661a;
        if (fastKV != null) {
            try {
                return Long.valueOf(fastKV.getLong(str, 0L));
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public int a(String str, int i10) {
        try {
            if (c.n().d() != null) {
                a();
                FastKV fastKV = this.f14661a;
                if (fastKV != null) {
                    try {
                        return fastKV.getInt(str, i10);
                    } catch (Exception unused) {
                        return i10;
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f14659b, "getInt error: " + e10.getMessage());
            }
        }
        return i10;
    }

    public void b(String str, int i10) {
        try {
            if (c.n().d() == null) {
                return;
            }
            a();
            FastKV fastKV = this.f14661a;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        try {
            if (c.n().d() == null) {
                return;
            }
            a();
            FastKV fastKV = this.f14661a;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f14659b, "put error: " + e10.getMessage());
            }
        }
    }

    public void a(String str, long j10) {
        try {
            if (c.n().d() == null) {
                q0.b(f14659b, "context is null in put");
                return;
            }
            a();
            FastKV fastKV = this.f14661a;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f14659b, "putLong error: " + e10.getMessage());
            }
        }
    }

    private void a() {
        if (this.f14661a == null) {
            try {
                this.f14661a = new FastKV.Builder(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.f14661a = null;
            }
        }
    }
}
