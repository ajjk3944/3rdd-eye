package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.io.Closeable;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class a0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final y f17475a;

    /* renamed from: b, reason: collision with root package name */
    final w f17476b;

    /* renamed from: c, reason: collision with root package name */
    final int f17477c;

    /* renamed from: d, reason: collision with root package name */
    final String f17478d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    final q f17479e;

    /* renamed from: f, reason: collision with root package name */
    final r f17480f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    final b0 f17481g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    final a0 f17482h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    final a0 f17483i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    final a0 f17484j;

    /* renamed from: k, reason: collision with root package name */
    final long f17485k;

    /* renamed from: l, reason: collision with root package name */
    final long f17486l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private volatile c f17487m;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        y f17488a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        w f17489b;

        /* renamed from: c, reason: collision with root package name */
        int f17490c;

        /* renamed from: d, reason: collision with root package name */
        String f17491d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        q f17492e;

        /* renamed from: f, reason: collision with root package name */
        r.a f17493f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        b0 f17494g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        a0 f17495h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        a0 f17496i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        a0 f17497j;

        /* renamed from: k, reason: collision with root package name */
        long f17498k;

        /* renamed from: l, reason: collision with root package name */
        long f17499l;

        public a() {
            this.f17490c = -1;
            this.f17493f = new r.a();
        }

        public a a(y yVar) {
            this.f17488a = yVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f17493f.c(str, str2);
            return this;
        }

        public a c(@Nullable a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f17495h = a0Var;
            return this;
        }

        public a d(@Nullable a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.f17497j = a0Var;
            return this;
        }

        private void b(a0 a0Var) {
            if (a0Var.f17481g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(w wVar) {
            this.f17489b = wVar;
            return this;
        }

        public a a(int i10) {
            this.f17490c = i10;
            return this;
        }

        public a(a0 a0Var) {
            this.f17490c = -1;
            this.f17488a = a0Var.f17475a;
            this.f17489b = a0Var.f17476b;
            this.f17490c = a0Var.f17477c;
            this.f17491d = a0Var.f17478d;
            this.f17492e = a0Var.f17479e;
            this.f17493f = a0Var.f17480f.a();
            this.f17494g = a0Var.f17481g;
            this.f17495h = a0Var.f17482h;
            this.f17496i = a0Var.f17483i;
            this.f17497j = a0Var.f17484j;
            this.f17498k = a0Var.f17485k;
            this.f17499l = a0Var.f17486l;
        }

        public a a(String str) {
            this.f17491d = str;
            return this;
        }

        public a b(long j10) {
            this.f17498k = j10;
            return this;
        }

        public a a(@Nullable q qVar) {
            this.f17492e = qVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f17493f.a(str, str2);
            return this;
        }

        public a a(r rVar) {
            this.f17493f = rVar.a();
            return this;
        }

        public a a(@Nullable b0 b0Var) {
            this.f17494g = b0Var;
            return this;
        }

        public a a(@Nullable a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f17496i = a0Var;
            return this;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f17481g == null) {
                if (a0Var.f17482h == null) {
                    if (a0Var.f17483i == null) {
                        if (a0Var.f17484j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(long j10) {
            this.f17499l = j10;
            return this;
        }

        public a0 a() {
            if (this.f17488a != null) {
                if (this.f17489b != null) {
                    if (this.f17490c >= 0) {
                        if (this.f17491d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f17490c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public a0(a aVar) {
        this.f17475a = aVar.f17488a;
        this.f17476b = aVar.f17489b;
        this.f17477c = aVar.f17490c;
        this.f17478d = aVar.f17491d;
        this.f17479e = aVar.f17492e;
        this.f17480f = aVar.f17493f.a();
        this.f17481g = aVar.f17494g;
        this.f17482h = aVar.f17495h;
        this.f17483i = aVar.f17496i;
        this.f17484j = aVar.f17497j;
        this.f17485k = aVar.f17498k;
        this.f17486l = aVar.f17499l;
    }

    @Nullable
    public String a(String str, @Nullable String str2) {
        String strB = this.f17480f.b(str);
        return strB != null ? strB : str2;
    }

    @Nullable
    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f17481g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    @Nullable
    public b0 d() {
        return this.f17481g;
    }

    public c h() {
        c cVar = this.f17487m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f17480f);
        this.f17487m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f17477c;
    }

    @Nullable
    public q l() {
        return this.f17479e;
    }

    public r m() {
        return this.f17480f;
    }

    public boolean n() {
        int i10 = this.f17477c;
        return i10 >= 200 && i10 < 300;
    }

    public String o() {
        return this.f17478d;
    }

    public a p() {
        return new a(this);
    }

    @Nullable
    public a0 q() {
        return this.f17484j;
    }

    public long r() {
        return this.f17486l;
    }

    public y s() {
        return this.f17475a;
    }

    public long t() {
        return this.f17485k;
    }

    public String toString() {
        return "Response{protocol=" + this.f17476b + ", code=" + this.f17477c + ", message=" + this.f17478d + ", url=" + this.f17475a.g() + '}';
    }
}
