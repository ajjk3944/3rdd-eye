package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6830b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6831c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f6829a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: d, reason: collision with root package name */
    private final Object f6832d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f6833e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Set f6834f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f6835g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set f6836h = new HashSet();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f6837a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6838b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f6839c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f6840d;

        public a(String str, String str2, y2 y2Var, com.applovin.impl.sdk.k kVar) throws JSONException {
            this.f6837a = str;
            this.f6838b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f6840d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (y2Var == null) {
                this.f6839c = null;
            } else {
                this.f6839c = y2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", y2Var.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f6840d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f6837a.equals(aVar.f6837a) || !this.f6838b.equals(aVar.f6838b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f6839c;
            MaxAdFormat maxAdFormat2 = aVar.f6839c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iHashCode = ((this.f6837a.hashCode() * 31) + this.f6838b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f6839c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f6837a + "', operationTag='" + this.f6838b + "', format=" + this.f6839c + '}';
        }
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f6830b = kVar;
        this.f6831c = kVar.O();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f6835g) {
            try {
                arrayList = new ArrayList(this.f6836h.size());
                Iterator it = this.f6836h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f6832d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f6834f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f6832d) {
            try {
                HashSet hashSet = new HashSet(this.f6833e.size());
                Iterator it = this.f6833e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        return setUnmodifiableSet;
    }

    public h a(k3 k3Var) {
        return a(k3Var, false);
    }

    public h a(k3 k3Var, boolean z10) {
        Class clsA;
        h hVar;
        if (k3Var != null) {
            String strC = k3Var.c();
            String strB = k3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6831c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6831c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z10 && (hVar = (h) this.f6829a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f6832d) {
                try {
                    if (!this.f6834f.contains(strB)) {
                        if (this.f6833e.containsKey(strB)) {
                            clsA = (Class) this.f6833e.get(strB);
                        } else {
                            clsA = a(strB);
                            if (clsA == null) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6831c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                                }
                                this.f6834f.add(strB);
                                return null;
                            }
                        }
                        h hVarA = a(k3Var, clsA, z10);
                        if (hVarA != null) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f6831c.a("MediationAdapterManager", "Loaded " + strC);
                            }
                            this.f6833e.put(strB, clsA);
                            if (z10) {
                                this.f6829a.put(k3Var.b(), hVarA);
                            }
                            return hVarA;
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6831c.b("MediationAdapterManager", "Failed to load " + strC);
                        }
                        this.f6834f.add(strB);
                        return null;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6831c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, y2 y2Var) {
        synchronized (this.f6835g) {
            try {
                this.f6830b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6830b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f6836h.add(new a(str, str2, y2Var, this.f6830b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private h a(k3 k3Var, Class cls, boolean z10) {
        try {
            return new h(k3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f6830b.y0()), z10, this.f6830b);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + k3Var, th);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.o.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
