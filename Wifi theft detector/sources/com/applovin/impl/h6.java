package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h6 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f6134g;

    /* renamed from: h, reason: collision with root package name */
    private final a f6135h;

    public static final class a extends s7 {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        public void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f7565b.add(p8Var);
        }
    }

    public static final class b extends h6 {

        /* renamed from: i, reason: collision with root package name */
        private final String f6136i;

        public b(String str, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            this.f6136i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p8 p8VarB = b(this.f6136i);
            if (p8VarB != null) {
                a(p8VarB);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to process XML: " + this.f6136i);
            }
            c(this.f6136i);
            a(t7.XML_PARSING);
        }
    }

    public static final class c extends h6 {

        /* renamed from: i, reason: collision with root package name */
        private final JSONObject f6137i;

        public c(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            this.f6137i = s7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f6137i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.b(this.f6219b, "No VAST response received.");
                }
                a(t7.NO_WRAPPER_RESPONSE);
                return;
            }
            if (string.length() >= ((Integer) this.f6218a.a(x4.P4)).intValue()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.b(this.f6219b, "VAST response is over max length");
                }
                a(t7.XML_PARSING);
                return;
            }
            p8 p8VarB = b(string);
            if (p8VarB != null) {
                a(p8VarB);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to process XML: " + string);
            }
            c(string);
            a(t7.XML_PARSING);
        }
    }

    public static final class d extends h6 {

        /* renamed from: i, reason: collision with root package name */
        private final p8 f6138i;

        public d(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            if (p8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (s7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f6138i = p8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Processing VAST Wrapper response...");
            }
            a(this.f6138i);
        }
    }

    public h6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f6134g = appLovinAdLoadListener;
        this.f6135h = (a) s7Var;
    }

    public static h6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public p8 b(String str) {
        try {
            return q8.a(str, this.f6218a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Failed to process VAST response", th);
            }
            a(t7.XML_PARSING);
            this.f6218a.D().a(this.f6219b, th);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f6218a.a(x4.f8492i5)), 1).iterator();
        while (it.hasNext()) {
            p8 p8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (p8VarB != null) {
                this.f6135h.a(p8VarB);
            }
        }
    }

    public static h6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static h6 a(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(p8Var, s7Var, appLovinAdLoadListener, kVar);
    }

    public void a(p8 p8Var) {
        int iD = this.f6135h.d();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Finished parsing XML at depth " + iD);
        }
        this.f6135h.a(p8Var);
        if (a8.b(p8Var)) {
            int iIntValue = ((Integer) this.f6218a.a(x4.Q4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.a(this.f6219b, "VAST response is wrapper. Resolving...");
                }
                this.f6218a.q0().a(new p6(this.f6135h, this.f6134g, this.f6218a));
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(t7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (a8.a(p8Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "VAST response is inline. Rendering ad...");
            }
            this.f6218a.q0().a(new k6(this.f6135h, this.f6134g, this.f6218a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "VAST response is an error");
        }
        a(t7.NO_WRAPPER_RESPONSE);
    }

    public void a(t7 t7Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "Failed to process VAST response due to VAST error code " + t7Var);
        }
        a8.a(this.f6135h, this.f6134g, t7Var, -6, this.f6218a);
    }
}
