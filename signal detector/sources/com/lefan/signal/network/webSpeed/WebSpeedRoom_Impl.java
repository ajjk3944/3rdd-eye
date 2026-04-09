package com.lefan.signal.network.webSpeed;

import C0.C0146b;
import C0.l;
import C0.s;
import G0.b;
import O4.e;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q5.i;

/* loaded from: classes.dex */
public final class WebSpeedRoom_Impl extends WebSpeedRoom {

    /* renamed from: m, reason: collision with root package name */
    public volatile e f18854m;

    @Override // C0.p
    public final l d() {
        return new l(this, new HashMap(0), new HashMap(0), "web_speed");
    }

    @Override // C0.p
    public final b e(C0146b c0146b) {
        s sVar = new s(c0146b, new L4.e(this, 3), "a04822d74099a211bf85897bcf3658f9", "dc2e66a5e8cf1ed31620530a4d26df3a");
        Context context = c0146b.f1030a;
        i.e(context, "context");
        return c0146b.f1032c.j(new A1.s(context, c0146b.f1031b, sVar, false));
    }

    @Override // C0.p
    public final List f(Map map) {
        return new ArrayList();
    }

    @Override // C0.p
    public final Set h() {
        return new HashSet();
    }

    @Override // C0.p
    public final Map i() {
        HashMap map = new HashMap();
        map.put(e.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.lefan.signal.network.webSpeed.WebSpeedRoom
    public final e o() {
        e eVar;
        if (this.f18854m != null) {
            return this.f18854m;
        }
        synchronized (this) {
            try {
                if (this.f18854m == null) {
                    this.f18854m = new e(this);
                }
                eVar = this.f18854m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
