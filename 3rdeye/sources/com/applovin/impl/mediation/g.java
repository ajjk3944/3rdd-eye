package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.a3;
import com.applovin.impl.q2;
import com.applovin.impl.sdk.utils.JsonUtils;
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
    private final com.applovin.impl.sdk.k f20427b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20428c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f20426a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: d, reason: collision with root package name */
    private final Object f20429d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f20430e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Set f20431f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f20432g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set f20433h = new HashSet();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f20434a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20435b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f20436c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f20437d;

        public a(String str, String str2, q2 q2Var, com.applovin.impl.sdk.k kVar) throws JSONException {
            this.f20434a = str;
            this.f20435b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f20437d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (q2Var == null) {
                this.f20436c = null;
            } else {
                this.f20436c = q2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", q2Var.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f20437d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f20434a.equals(aVar.f20434a) || !this.f20435b.equals(aVar.f20435b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f20436c;
            MaxAdFormat maxAdFormat2 = aVar.f20436c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iN = B4.g.n(this.f20434a.hashCode() * 31, 31, this.f20435b);
            MaxAdFormat maxAdFormat = this.f20436c;
            return iN + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f20434a + "', operationTag='" + this.f20435b + "', format=" + this.f20436c + '}';
        }
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f20427b = kVar;
        this.f20428c = kVar.O();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f20432g) {
            try {
                arrayList = new ArrayList(this.f20433h.size());
                Iterator it = this.f20433h.iterator();
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
        synchronized (this.f20429d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f20431f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f20429d) {
            try {
                HashSet hashSet = new HashSet(this.f20430e.size());
                Iterator it = this.f20430e.values().iterator();
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

    public h a(a3 a3Var) {
        return a(a3Var, false);
    }

    public h a(a3 a3Var, boolean z10) {
        Class clsA;
        h hVar;
        if (a3Var != null) {
            String strC = a3Var.c();
            String strB = a3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20428c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20428c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z10 && (hVar = (h) this.f20426a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f20429d) {
                try {
                    if (!this.f20431f.contains(strB)) {
                        if (this.f20430e.containsKey(strB)) {
                            clsA = (Class) this.f20430e.get(strB);
                        } else {
                            clsA = a(strB);
                            if (clsA == null) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f20428c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                                }
                                this.f20431f.add(strB);
                                return null;
                            }
                        }
                        h hVarA = a(a3Var, clsA, z10);
                        if (hVarA != null) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f20428c.a("MediationAdapterManager", "Loaded " + strC);
                            }
                            this.f20430e.put(strB, clsA);
                            if (z10) {
                                this.f20426a.put(a3Var.b(), hVarA);
                            }
                            return hVarA;
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f20428c.b("MediationAdapterManager", "Failed to load " + strC);
                        }
                        this.f20431f.add(strB);
                        return null;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20428c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, q2 q2Var) {
        synchronized (this.f20432g) {
            try {
                this.f20427b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20427b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f20433h.add(new a(str, str2, q2Var, this.f20427b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private h a(a3 a3Var, Class cls, boolean z10) {
        try {
            return new h(a3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f20427b.y0()), z10, this.f20427b);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + a3Var, th);
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
