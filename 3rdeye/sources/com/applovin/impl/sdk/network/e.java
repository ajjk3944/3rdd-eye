package com.applovin.impl.sdk.network;

import com.applovin.impl.i4;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* renamed from: s, reason: collision with root package name */
    private String f21399s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21400t;

    public static class a extends a.C0320a {

        /* renamed from: r, reason: collision with root package name */
        private String f21401r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f21402s;

        public a(k kVar) {
            super(kVar);
            this.f21352h = ((Integer) kVar.a(l4.f19704B2)).intValue();
            this.i = ((Integer) kVar.a(l4.f19696A2)).intValue();
            this.f21353j = ((Integer) kVar.a(l4.f19774K2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f21347c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i) {
            this.f21353j = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f21346b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f21345a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f21402s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f21359p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f21348d = map;
            return this;
        }

        public a e(String str) {
            this.f21401r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i) {
            this.i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f21357n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f21349e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i) {
            this.f21352h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f21350f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f21351g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(i4.a aVar) {
            this.f21360q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0320a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f21399s = aVar.f21401r;
        this.f21400t = aVar.f21402s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f21399s;
    }

    public boolean t() {
        return this.f21399s != null;
    }

    public boolean u() {
        return this.f21400t;
    }
}
