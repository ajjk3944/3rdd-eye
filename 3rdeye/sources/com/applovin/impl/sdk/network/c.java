package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w4;
import com.singular.sdk.internal.Constants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final b f21372g;

    /* renamed from: h, reason: collision with root package name */
    private final o f21373h;
    private AtomicBoolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21374j;

    public c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.i = new AtomicBoolean();
        this.f21374j = false;
        this.f21372g = bVar;
        this.f21373h = kVar.O();
    }

    public List a(int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        m mVarH = this.f21692a.H();
        if (!mVarH.b("persistent_postback_cache.json", k.o())) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileA = mVarH.a("persistent_postback_cache.json", k.o());
        String strF = mVarH.f(fileA);
        if (TextUtils.isEmpty(strF)) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z10 = false;
        try {
            JSONArray jSONArray = new JSONObject(strF).getJSONArray("pb");
            if (o.a()) {
                this.f21373h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f21692a.a(l4.f19712C2);
            for (int i10 = 0; i10 < jSONArray.length() && arrayList.size() < i; i10++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i10), this.f21692a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        o.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f21692a.E().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (o.a()) {
                this.f21373h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                o.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                this.f21692a.E().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                if (((Boolean) this.f21692a.a(l4.f19772K0)).booleanValue()) {
                    mVarH.a(fileA, "removeAfterDeserializationFail");
                }
            } catch (Throwable th4) {
                th = th4;
                z10 = true;
                if (z10 && ((Boolean) this.f21692a.a(l4.f19772K0)).booleanValue()) {
                    mVarH.a(fileA, "removeAfterDeserializationFail");
                }
                throw th;
            }
        }
        this.f21374j = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f21372g.d());
    }

    private void a(List list) {
        if (!(this.f21374j && list.isEmpty()) && this.i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f21692a.E().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes(Constants.ENCODING));
                m mVarH = this.f21692a.H();
                if (mVarH.a((InputStream) byteArrayInputStream, mVarH.a("persistent_postback_cache.json", k.o()), true)) {
                    if (o.a()) {
                        this.f21373h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (o.a()) {
                    this.f21373h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                o.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f21692a.E().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.i.set(false);
        }
    }
}
