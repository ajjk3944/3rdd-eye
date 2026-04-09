package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4758b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4759c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f4757a = DesugarCollections.synchronizedMap(new HashMap(16));

    /* renamed from: d, reason: collision with root package name */
    private final Object f4760d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f4761e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Set f4762f = new HashSet();
    private final Object g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set f4763h = new HashSet();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f4764a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4765b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f4766c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f4767d;

        public a(String str, String str2, y2 y2Var, com.applovin.impl.sdk.k kVar) {
            this.f4764a = str;
            this.f4765b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f4767d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (y2Var == null) {
                this.f4766c = null;
            } else {
                this.f4766c = y2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", y2Var.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f4767d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f4764a.equals(aVar.f4764a) || !this.f4765b.equals(aVar.f4765b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f4766c;
            MaxAdFormat maxAdFormat2 = aVar.f4766c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iM = je.u.m(this.f4764a.hashCode() * 31, 31, this.f4765b);
            MaxAdFormat maxAdFormat = this.f4766c;
            return iM + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f4764a + "', operationTag='" + this.f4765b + "', format=" + this.f4766c + '}';
        }
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f4758b = kVar;
        this.f4759c = kVar.O();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.g) {
            try {
                arrayList = new ArrayList(this.f4763h.size());
                Iterator it = this.f4763h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f4760d) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.f4762f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f4760d) {
            try {
                HashSet hashSet = new HashSet(this.f4761e.size());
                Iterator it = this.f4761e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return setUnmodifiableSet;
    }

    public h a(k3 k3Var) {
        return a(k3Var, false);
    }

    public h a(k3 k3Var, boolean z3) {
        Class clsA;
        h hVar;
        if (k3Var != null) {
            String strC = k3Var.c();
            String strB = k3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4759c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4759c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z3 && (hVar = (h) this.f4757a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f4760d) {
                try {
                    if (!this.f4762f.contains(strB)) {
                        if (this.f4761e.containsKey(strB)) {
                            clsA = (Class) this.f4761e.get(strB);
                        } else {
                            clsA = a(strB);
                            if (clsA == null) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f4759c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                                }
                                this.f4762f.add(strB);
                                return null;
                            }
                        }
                        h hVarA = a(k3Var, clsA, z3);
                        if (hVarA != null) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f4759c.a("MediationAdapterManager", "Loaded " + strC);
                            }
                            this.f4761e.put(strB, clsA);
                            if (z3) {
                                this.f4757a.put(k3Var.b(), hVarA);
                            }
                            return hVarA;
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f4759c.b("MediationAdapterManager", "Failed to load " + strC);
                        }
                        this.f4762f.add(strB);
                        return null;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4759c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, y2 y2Var) {
        synchronized (this.g) {
            try {
                this.f4758b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4758b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f4763h.add(new a(str, str2, y2Var, this.f4758b));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private h a(k3 k3Var, Class cls, boolean z3) {
        try {
            return new h(k3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f4758b.y0()), z3, this.f4758b);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + k3Var, th2);
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
