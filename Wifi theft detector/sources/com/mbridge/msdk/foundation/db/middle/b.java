package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f14809a;

    /* renamed from: b, reason: collision with root package name */
    private k f14810b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14811a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a f14812b;

        public a(boolean z10, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f14811a = z10;
            this.f14812b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f14811a || b.this.f14810b == null) {
                return;
            }
            for (String str : this.f14812b.a()) {
                b.this.f14810b.a(str, b.this.f14809a.a(str));
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    public static class C0259b {

        /* renamed from: a, reason: collision with root package name */
        private static b f14814a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f14809a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k kVarA = k.a(g.a(c.n().d()));
            this.f14810b = kVarA;
            a(kVarA.d(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f14809a.a(next, jSONObjectOptJSONObject);
                aVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z10, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f14809a.a());
    }

    public static b a() {
        return C0259b.f14814a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject jSONObjectA = this.f14809a.a(str);
        if (jSONObjectA != null || (kVar = this.f14810b) == null) {
            return jSONObjectA;
        }
        JSONObject jSONObjectB = kVar.b(str);
        if (jSONObjectB != null) {
            this.f14809a.a(str, jSONObjectB);
        }
        return jSONObjectB;
    }
}
