package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l6 extends i5 implements q0.e {
    private final com.applovin.impl.sdk.network.a g;

    /* renamed from: h, reason: collision with root package name */
    private final q0.e f4440h;

    /* renamed from: i, reason: collision with root package name */
    private d6.b f4441i;
    private x4 j;

    /* renamed from: k, reason: collision with root package name */
    private x4 f4442k;

    /* renamed from: l, reason: collision with root package name */
    protected q0.b f4443l;

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i4, String str2, Object obj);

    public abstract void a(String str, Object obj, int i4);

    @Override // java.lang.Runnable
    public void run() {
        q0 q0VarW = b().w();
        if (!b().E0() && !b().B0()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.g.f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.g.f()) || this.g.f().length() < 4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Task has an invalid or null request endpoint.");
            }
            a(this.g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.g.h())) {
                this.g.b(this.g.b() != null ? "POST" : "GET");
            }
            q0VarW.a(this.g, this.f4443l, this.f4440h);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements q0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f4444a;

        public a(com.applovin.impl.sdk.k kVar) {
            this.f4444a = kVar;
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, Object obj, int i4) {
            l6.this.g.a(0);
            l6.this.a(str, obj, i4);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, Object obj) {
            long millis;
            boolean z3 = false;
            boolean z10 = i4 < 200 || i4 >= 500;
            boolean z11 = i4 == 429;
            boolean z12 = i4 != -1009 || l6.this.g.q();
            boolean z13 = (i4 == -900 || i4 == -1000) ? false : true;
            if (z12 && z13 && (z10 || z11 || l6.this.g.p())) {
                String strA = l6.this.g.a();
                if (l6.this.g.j() <= 0) {
                    if (strA != null && strA.equals(l6.this.g.f())) {
                        l6 l6Var = l6.this;
                        l6Var.a(l6Var.f4442k);
                    } else {
                        l6 l6Var2 = l6.this;
                        l6Var2.a(l6Var2.j);
                    }
                    l6 l6Var3 = l6.this;
                    l6Var3.a(l6Var3.g.f(), i4, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.o oVar = l6.this.f4289c;
                if (com.applovin.impl.sdk.o.a()) {
                    l6 l6Var4 = l6.this;
                    com.applovin.impl.sdk.o oVar2 = l6Var4.f4289c;
                    String str3 = l6Var4.f4288b;
                    StringBuilder sbW = je.u.w(i4, "Unable to send request due to server failure (code ", "). ");
                    sbW.append(l6.this.g.j());
                    sbW.append(" attempts left, retrying in ");
                    sbW.append(TimeUnit.MILLISECONDS.toSeconds(l6.this.g.k()));
                    sbW.append(" seconds...");
                    oVar2.k(str3, sbW.toString());
                }
                int iJ = l6.this.g.j() - 1;
                l6.this.g.a(iJ);
                if (iJ == 0) {
                    l6 l6Var5 = l6.this;
                    l6Var5.a(l6Var5.j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.o oVar3 = l6.this.f4289c;
                        if (com.applovin.impl.sdk.o.a()) {
                            l6 l6Var6 = l6.this;
                            l6Var6.f4289c.d(l6Var6.f4288b, "Switching to backup endpoint ".concat(strA));
                        }
                        l6.this.g.a(strA);
                        z3 = true;
                    }
                }
                if (((Boolean) this.f4444a.a(x4.f6040g3)).booleanValue() && z3) {
                    millis = 0;
                } else {
                    millis = l6.this.g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, l6.this.g.c())) : l6.this.g.k();
                }
                d6 d6VarQ0 = this.f4444a.q0();
                l6 l6Var7 = l6.this;
                d6VarQ0.a(l6Var7, l6Var7.f4441i, millis);
                return;
            }
            l6 l6Var8 = l6.this;
            l6Var8.a(l6Var8.g.f(), i4, str2, obj);
        }
    }

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z3) {
        super("TaskRepeatRequest", kVar, z3);
        this.f4441i = d6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.g = aVar;
        this.f4443l = new q0.b();
        this.f4440h = new a(kVar);
    }

    public void b(x4 x4Var) {
        this.f4442k = x4Var;
    }

    public void c(x4 x4Var) {
        this.j = x4Var;
    }

    public void a(d6.b bVar) {
        this.f4441i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x4 x4Var) {
        if (x4Var != null) {
            b().o0().a(x4Var, x4Var.a());
        }
    }
}
