package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class v5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f21651g;

    /* renamed from: h, reason: collision with root package name */
    private final a f21652h;

    public static final class a extends f7 {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        public void a(c8 c8Var) {
            if (c8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f19357b.add(c8Var);
        }
    }

    public static final class b extends v5 {
        private final String i;

        public b(String str, f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(f7Var, appLovinAdLoadListener, kVar);
            this.i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c8 c8VarB = b(this.i);
            if (c8VarB != null) {
                a(c8VarB);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Unable to process XML: " + this.i);
            }
            c(this.i);
            a(g7.XML_PARSING);
        }
    }

    public static final class c extends v5 {
        private final JSONObject i;

        public c(f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(f7Var, appLovinAdLoadListener, kVar);
            this.i = f7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "No VAST response received.");
                }
                a(g7.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((Integer) this.f21692a.a(l4.f20007q4)).intValue()) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21694c.b(this.f21693b, "VAST response is over max length");
                    }
                    a(g7.XML_PARSING);
                    return;
                }
                c8 c8VarB = b(string);
                if (c8VarB != null) {
                    a(c8VarB);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "Unable to process XML: ".concat(string));
                }
                c(string);
                a(g7.XML_PARSING);
            }
        }
    }

    public static final class d extends v5 {
        private final c8 i;

        public d(c8 c8Var, f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(f7Var, appLovinAdLoadListener, kVar);
            if (c8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (f7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.i = c8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Processing VAST Wrapper response...");
            }
            a(this.i);
        }
    }

    public v5(f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (f7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f21651g = appLovinAdLoadListener;
        this.f21652h = (a) f7Var;
    }

    public static v5 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public c8 b(String str) {
        try {
            return d8.a(str, this.f21692a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Failed to process VAST response", th);
            }
            a(g7.XML_PARSING);
            this.f21692a.E().a(this.f21693b, th);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f21692a.a(l4.f19769J4)), 1).iterator();
        while (it.hasNext()) {
            c8 c8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (c8VarB != null) {
                this.f21652h.a(c8VarB);
            }
        }
    }

    public static v5 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static v5 a(c8 c8Var, f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(c8Var, f7Var, appLovinAdLoadListener, kVar);
    }

    public void a(c8 c8Var) {
        int iD = this.f21652h.d();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Finished parsing XML at depth " + iD);
        }
        this.f21652h.a(c8Var);
        if (n7.b(c8Var)) {
            int iIntValue = ((Integer) this.f21692a.a(l4.f20015r4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.a(this.f21693b, "VAST response is wrapper. Resolving...");
                }
                this.f21692a.q0().a(new d6(this.f21652h, this.f21651g, this.f21692a));
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(g7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (n7.a(c8Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "VAST response is inline. Rendering ad...");
            }
            this.f21692a.q0().a(new y5(this.f21652h, this.f21651g, this.f21692a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "VAST response is an error");
        }
        a(g7.NO_WRAPPER_RESPONSE);
    }

    public void a(g7 g7Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Failed to process VAST response due to VAST error code " + g7Var);
        }
        n7.a(this.f21652h, this.f21651g, g7Var, -6, this.f21692a);
    }
}
