package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.C2132m0;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import g0.C4356c;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class z5 extends w4 implements C2132m0.e {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f21900g;

    /* renamed from: h, reason: collision with root package name */
    private final C2132m0.e f21901h;
    private r5.b i;

    /* renamed from: j, reason: collision with root package name */
    private l4 f21902j;

    /* renamed from: k, reason: collision with root package name */
    private l4 f21903k;

    /* renamed from: l, reason: collision with root package name */
    protected C2132m0.b f21904l;

    public z5(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i, String str2, Object obj);

    public abstract void a(String str, Object obj, int i);

    @Override // java.lang.Runnable
    public void run() {
        C2132m0 c2132m0X = b().x();
        if (!b().E0() && !b().B0()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f21900g.f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.f21900g.f()) || this.f21900g.f().length() < 4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Task has an invalid or null request endpoint.");
            }
            a(this.f21900g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f21900g.h())) {
                this.f21900g.b(this.f21900g.b() != null ? "POST" : "GET");
            }
            c2132m0X.a(this.f21900g, this.f21904l, this.f21901h);
        }
    }

    public class a implements C2132m0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f21905a;

        public a(com.applovin.impl.sdk.k kVar) {
            this.f21905a = kVar;
        }

        @Override // com.applovin.impl.C2132m0.e
        public void a(String str, Object obj, int i) {
            z5.this.f21900g.a(0);
            z5.this.a(str, obj, i);
        }

        @Override // com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, Object obj) {
            long millis;
            boolean z10 = false;
            boolean z11 = i < 200 || i >= 500;
            boolean z12 = i == 429;
            boolean z13 = i != -1009 || z5.this.f21900g.q();
            boolean z14 = (i == -900 || i == -1000) ? false : true;
            if (z13 && z14 && (z11 || z12 || z5.this.f21900g.p())) {
                String strA = z5.this.f21900g.a();
                if (z5.this.f21900g.j() <= 0) {
                    if (strA != null && strA.equals(z5.this.f21900g.f())) {
                        z5 z5Var = z5.this;
                        z5Var.a(z5Var.f21903k);
                    } else {
                        z5 z5Var2 = z5.this;
                        z5Var2.a(z5Var2.f21902j);
                    }
                    z5 z5Var3 = z5.this;
                    z5Var3.a(z5Var3.f21900g.f(), i, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.o oVar = z5.this.f21694c;
                if (com.applovin.impl.sdk.o.a()) {
                    z5 z5Var4 = z5.this;
                    com.applovin.impl.sdk.o oVar2 = z5Var4.f21694c;
                    String str3 = z5Var4.f21693b;
                    StringBuilder sbJ = C4356c.j(i, "Unable to send request due to server failure (code ", "). ");
                    sbJ.append(z5.this.f21900g.j());
                    sbJ.append(" attempts left, retrying in ");
                    sbJ.append(TimeUnit.MILLISECONDS.toSeconds(z5.this.f21900g.k()));
                    sbJ.append(" seconds...");
                    oVar2.k(str3, sbJ.toString());
                }
                int iJ = z5.this.f21900g.j() - 1;
                z5.this.f21900g.a(iJ);
                if (iJ == 0) {
                    z5 z5Var5 = z5.this;
                    z5Var5.a(z5Var5.f21902j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.o oVar3 = z5.this.f21694c;
                        if (com.applovin.impl.sdk.o.a()) {
                            z5 z5Var6 = z5.this;
                            z5Var6.f21694c.d(z5Var6.f21693b, "Switching to backup endpoint ".concat(strA));
                        }
                        z5.this.f21900g.a(strA);
                        z10 = true;
                    }
                }
                if (((Boolean) this.f21905a.a(l4.f19869Y2)).booleanValue() && z10) {
                    millis = 0;
                } else {
                    millis = z5.this.f21900g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, z5.this.f21900g.c())) : z5.this.f21900g.k();
                }
                r5 r5VarQ0 = this.f21905a.q0();
                z5 z5Var7 = z5.this;
                r5VarQ0.a(z5Var7, z5Var7.i, millis);
                return;
            }
            z5 z5Var8 = z5.this;
            z5Var8.a(z5Var8.f21900g.f(), i, str2, obj);
        }
    }

    public z5(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskRepeatRequest", kVar, z10);
        this.i = r5.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f21900g = aVar;
        this.f21904l = new C2132m0.b();
        this.f21901h = new a(kVar);
    }

    public void b(l4 l4Var) {
        this.f21903k = l4Var;
    }

    public void c(l4 l4Var) {
        this.f21902j = l4Var;
    }

    public void a(r5.b bVar) {
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l4 l4Var) {
        if (l4Var != null) {
            b().o0().a(l4Var, l4Var.a());
        }
    }
}
