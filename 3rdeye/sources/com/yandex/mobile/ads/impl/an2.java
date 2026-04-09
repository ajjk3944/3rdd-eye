package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import b9.C1992A;
import c9.C2077A;
import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.kb2;
import com.yandex.mobile.ads.impl.zf2;
import java.util.List;

/* loaded from: classes3.dex */
public final class an2 implements zf2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24756a;

    /* renamed from: b, reason: collision with root package name */
    private final nc2 f24757b;

    /* renamed from: c, reason: collision with root package name */
    private final bd2 f24758c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ja2> f24759d;

    /* renamed from: e, reason: collision with root package name */
    private final xf2 f24760e;

    /* renamed from: f, reason: collision with root package name */
    private final me1 f24761f;

    /* renamed from: g, reason: collision with root package name */
    private final mp1 f24762g;

    /* renamed from: h, reason: collision with root package name */
    private n8 f24763h;
    private rv0 i;

    /* renamed from: j, reason: collision with root package name */
    private C4079b3 f24764j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24765k;

    public an2(Context context, nc2 videoAdPosition, bd2 bd2Var, List<ja2> verifications, xf2 eventsTracker, me1 omSdkVastPropertiesCreator, mp1 reporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdPosition, "videoAdPosition");
        kotlin.jvm.internal.l.f(verifications, "verifications");
        kotlin.jvm.internal.l.f(eventsTracker, "eventsTracker");
        kotlin.jvm.internal.l.f(omSdkVastPropertiesCreator, "omSdkVastPropertiesCreator");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f24756a = context;
        this.f24757b = videoAdPosition;
        this.f24758c = bd2Var;
        this.f24759d = verifications;
        this.f24760e = eventsTracker;
        this.f24761f = omSdkVastPropertiesCreator;
        this.f24762g = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void b() {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.d();
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void c() {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.h();
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void d() {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.g();
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void e() {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.i();
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void f() {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.c();
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void j() {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.b();
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void k() {
        n8 n8Var = this.f24763h;
        if (n8Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                n8Var.a();
                this.f24763h = null;
                this.i = null;
                this.f24764j = null;
                this.f24765k = true;
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void m() {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.a();
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void n() {
        C4079b3 c4079b3 = this.f24764j;
        if (c4079b3 != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                c4079b3.a();
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    public static final void a(an2 an2Var, ka2 ka2Var) {
        an2Var.getClass();
        an2Var.f24760e.a(ka2Var.b(), "verificationNotExecuted", C2077A.m(new b9.l("[REASON]", String.valueOf(ka2Var.a().a()))));
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(View view, List<kb2> friendlyOverlays) {
        oc0 oc0Var;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        k();
        this.f24765k = false;
        C1992A c1992a = C1992A.f18074a;
        try {
            Context context = this.f24756a;
            zm2 zm2Var = new zm2(this);
            je1 je1VarA = new ke1(context, zm2Var, new be1(context, zm2Var), ce1.a.a(), new le1()).a(this.f24759d);
            if (je1VarA != null) {
                n8 n8VarB = je1VarA.b();
                n8VarB.a(view);
                this.f24763h = n8VarB;
                this.i = je1VarA.c();
                this.f24764j = je1VarA.a();
            }
        } catch (Exception e4) {
            fp0.c(new Object[0]);
            this.f24762g.reportError("Failed to execute safely", e4);
        }
        n8 n8Var = this.f24763h;
        if (n8Var != null) {
            for (kb2 kb2Var : friendlyOverlays) {
                View viewC = kb2Var.c();
                if (viewC != null) {
                    C1992A c1992a2 = C1992A.f18074a;
                    try {
                        kb2.a purpose = kb2Var.b();
                        kotlin.jvm.internal.l.f(purpose, "purpose");
                        int iOrdinal = purpose.ordinal();
                        if (iOrdinal == 0) {
                            oc0Var = oc0.f31338b;
                        } else if (iOrdinal == 1) {
                            oc0Var = oc0.f31339c;
                        } else if (iOrdinal == 2) {
                            oc0Var = oc0.f31340d;
                        } else if (iOrdinal == 3) {
                            oc0Var = oc0.f31341e;
                        } else {
                            throw new b9.j();
                        }
                        n8Var.a(viewC, oc0Var, kb2Var.a());
                    } catch (Exception e10) {
                        fp0.c(new Object[0]);
                        this.f24762g.reportError("Failed to execute safely", e10);
                    }
                }
            }
        }
        n8 n8Var2 = this.f24763h;
        if (n8Var2 != null) {
            try {
                if (!this.f24765k) {
                    n8Var2.b();
                }
            } catch (Exception e11) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e11);
            }
        }
        C4079b3 c4079b3 = this.f24764j;
        if (c4079b3 != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                me1 me1Var = this.f24761f;
                bd2 bd2Var = this.f24758c;
                nc2 nc2Var = this.f24757b;
                me1Var.getClass();
                c4079b3.a(me1.a(bd2Var, nc2Var));
            } catch (Exception e12) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e12);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void h() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void i() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void l() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(String assetName) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
        m();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(kc2 error) {
        kotlin.jvm.internal.l.f(error, "error");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(zf2.a quartile) {
        kotlin.jvm.internal.l.f(quartile, "quartile");
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                int iOrdinal = quartile.ordinal();
                if (iOrdinal == 0) {
                    rv0Var.e();
                } else if (iOrdinal == 1) {
                    rv0Var.f();
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    rv0Var.j();
                }
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(float f10, long j4) {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.a(j4 / 1000, f10);
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(float f10) {
        rv0 rv0Var = this.i;
        if (rv0Var != null) {
            try {
                if (this.f24765k) {
                    return;
                }
                rv0Var.a(f10);
            } catch (Exception e4) {
                fp0.c(new Object[0]);
                this.f24762g.reportError("Failed to execute safely", e4);
            }
        }
    }
}
