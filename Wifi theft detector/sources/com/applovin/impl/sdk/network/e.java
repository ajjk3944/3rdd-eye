package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* renamed from: s, reason: collision with root package name */
    private String f8049s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8050t;

    public static class a extends a.C0086a {

        /* renamed from: r, reason: collision with root package name */
        private String f8051r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f8052s;

        public a(k kVar) {
            super(kVar);
            this.f7998h = ((Integer) kVar.a(x4.H2)).intValue();
            this.f7999i = ((Integer) kVar.a(x4.G2)).intValue();
            this.f8000j = ((Integer) kVar.a(x4.S2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f7993c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f8000j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f7992b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f7991a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f8052s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f8006p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f7994d = map;
            return this;
        }

        public a e(String str) {
            this.f8051r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f7999i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f8004n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f7995e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f7998h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f7996f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f7997g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(u4.a aVar) {
            this.f8007q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0086a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f8049s = aVar.f8051r;
        this.f8050t = aVar.f8052s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f8049s;
    }

    public boolean t() {
        return this.f8049s != null;
    }

    public boolean u() {
        return this.f8050t;
    }
}
