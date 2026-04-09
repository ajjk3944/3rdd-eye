package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class h<T> extends t<T> {
    protected static final String B = "h";
    private boolean A;

    /* renamed from: w, reason: collision with root package name */
    private final long f18304w;

    /* renamed from: x, reason: collision with root package name */
    private Map<String, String> f18305x;

    /* renamed from: y, reason: collision with root package name */
    private Map<String, String> f18306y;

    /* renamed from: z, reason: collision with root package name */
    private x f18307z;

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.A = false;
        if (j10 > 0) {
            this.f18304w = j10;
        } else {
            this.f18304w = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f18305x == null) {
            this.f18305x = new HashMap();
        }
        try {
            this.f18305x.putAll(map);
        } catch (Exception e10) {
            q0.b(B, "addParams error: " + e10.getMessage());
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f18306y == null) {
            this.f18306y = new HashMap();
        }
        try {
            this.f18306y.put(str, str2);
        } catch (Exception e10) {
            q0.b(B, "addHeader error: " + e10.getMessage());
        }
    }

    public void d(boolean z10) {
        this.A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f18306y == null) {
            this.f18306y = new HashMap();
        }
        this.f18306y.put("Charset", C.UTF8_NAME);
        return this.f18306y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        if (this.f18305x == null) {
            this.f18305x = new HashMap();
        }
        return this.f18305x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f18307z == null) {
            this.f18307z = new e(30000, this.f18304w, 3);
        }
        return this.f18307z;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}
