package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* renamed from: s, reason: collision with root package name */
    private String f5709s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f5710t;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a extends a.C0022a {

        /* renamed from: r, reason: collision with root package name */
        private String f5711r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f5712s;

        public a(k kVar) {
            super(kVar);
            this.f5666h = ((Integer) kVar.a(x4.H2)).intValue();
            this.f5667i = ((Integer) kVar.a(x4.G2)).intValue();
            this.j = ((Integer) kVar.a(x4.S2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f5662c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i4) {
            this.j = i4;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f5661b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f5660a = str;
            return this;
        }

        public a h(boolean z3) {
            this.f5712s = z3;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z3) {
            this.f5673p = z3;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f5663d = map;
            return this;
        }

        public a e(String str) {
            this.f5711r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i4) {
            this.f5667i = i4;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z3) {
            this.f5671n = z3;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f5664e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i4) {
            this.f5666h = i4;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f5665f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(u4.a aVar) {
            this.f5674q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0022a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f5709s = aVar.f5711r;
        this.f5710t = aVar.f5712s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f5709s;
    }

    public boolean t() {
        return this.f5709s != null;
    }

    public boolean u() {
        return this.f5710t;
    }
}
