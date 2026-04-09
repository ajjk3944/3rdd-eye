package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.i5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.o;
import com.applovin.impl.x4;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c extends i5 {
    private final b g;

    /* renamed from: h, reason: collision with root package name */
    private final o f5685h;

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f5686i;
    private boolean j;

    public c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.f5686i = new AtomicBoolean();
        this.j = false;
        this.g = bVar;
        this.f5685h = kVar.O();
    }

    public List a(int i4) throws Throwable {
        ArrayList arrayList = new ArrayList();
        m mVarG = this.f4287a.G();
        if (!mVarG.b("persistent_postback_cache.json", k.o())) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileA = mVarG.a("persistent_postback_cache.json", k.o());
        String strF = mVarG.f(fileA);
        if (TextUtils.isEmpty(strF)) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z3 = false;
        try {
            JSONArray jSONArray = new JSONObject(strF).getJSONArray("pb");
            if (o.a()) {
                this.f5685h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f4287a.a(x4.I2);
            for (int i10 = 0; i10 < jSONArray.length() && arrayList.size() < i4; i10++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i10), this.f4287a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        o.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th2) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th2);
                    this.f4287a.D().a("PersistentPostbackQueueSaveTask", "deserializePostback", th2);
                }
            }
            if (o.a()) {
                this.f5685h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th3) {
            try {
                o.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th3);
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                this.f4287a.D().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th3);
                if (((Boolean) this.f4287a.a(x4.N0)).booleanValue()) {
                    mVarG.a(fileA, "removeAfterDeserializationFail");
                }
            } catch (Throwable th5) {
                th = th5;
                z3 = true;
                if (z3 && ((Boolean) this.f4287a.a(x4.N0)).booleanValue()) {
                    mVarG.a(fileA, "removeAfterDeserializationFail");
                }
                throw th;
            }
        }
        this.j = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.g.d());
    }

    private void a(List list) {
        if (!(this.j && list.isEmpty()) && this.f5686i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th2) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th2);
                    this.f4287a.D().a("PersistentPostbackQueueSaveTask", "serializePostback", th2);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                m mVarG = this.f4287a.G();
                if (mVarG.a((InputStream) byteArrayInputStream, mVarG.a("persistent_postback_cache.json", k.o()), true)) {
                    if (o.a()) {
                        this.f5685h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (o.a()) {
                    this.f5685h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th3) {
                o.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th3);
                this.f4287a.D().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th3);
            }
            this.f5686i.set(false);
        }
    }
}
