.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$a;
    }
.end annotation


# instance fields
.field private final a:Lorg/kodein/di/DI;

.field private final b:LLb/b;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/b;

.field private final f:Lgg/b;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;


# direct methods
.method public constructor <init>(Lorg/kodein/di/DI;LLb/b;LNd/c;Llc/e;)V
    .locals 5

    const-string v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiAccountApiService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->a:Lorg/kodein/di/DI;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->b:LLb/b;

    invoke-interface {p3}, LNd/c;->c()Lgg/i;

    move-result-object p1

    new-instance p3, LNd/h;

    invoke-direct {p3, p0}, LNd/h;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-static {p1, p3}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->c:Lgg/i;

    invoke-interface {p2}, LLb/b;->c()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {p2, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p2

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$e;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$e;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-virtual {p2, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p2, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->d:Lgg/i;

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$t;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$t;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-virtual {p1, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$u;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$u;

    invoke-virtual {v1, v2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$v;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$v;

    invoke-virtual {v1, v2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v1

    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->w()Lgg/b;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lgg/f;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    aput-object v2, v3, p3

    invoke-static {v3}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object v1

    const-string v2, "mergeArray(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->e:Lgg/b;

    invoke-interface {p4}, Llc/e;->b()Lgg/i;

    move-result-object p4

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$g;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$g;

    invoke-virtual {p4, v2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p4

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$h;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$h;

    invoke-virtual {p4, v2}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p4

    new-instance v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i;

    invoke-direct {v2, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-virtual {p4, v2}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p4

    const-string v2, "switchMapCompletable(...)"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->f:Lgg/b;

    sget-object p4, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;

    invoke-virtual {p1, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p4, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$p;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$p;

    invoke-virtual {p1, p4}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->g:Lgg/i;

    invoke-virtual {p2, v1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$b;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->h:Lgg/i;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->a()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$j;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$j;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$k;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$k;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->i:Lgg/i;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->e()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$l;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$l;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->j:Lgg/i;

    return-void
.end method

.method private final A(LNa/b;Z)LLb/a;
    .locals 14

    invoke-virtual {p1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v0, "toString(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LNa/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LNa/b;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, LNa/b;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    new-instance v0, LLb/a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v1, v0

    move/from16 v11, p2

    invoke-direct/range {v1 .. v13}, LLb/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZJ)V

    return-object v0
.end method

.method private final B(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)LLb/a;
    .locals 14

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v0, "toString(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->h()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->i()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->l()Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->j()J

    move-result-wide v12

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->m()Z

    move-result v11

    new-instance p1, LLb/a;

    move-object v1, p1

    invoke-direct/range {v1 .. v13}, LLb/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZJ)V

    return-object p1
.end method

.method private final C(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->c:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;

    invoke-direct {v1, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$C;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$C;

    invoke-virtual {p1, p2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final D(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;

    invoke-direct {v0, p1, p2, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$D;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic f(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/sso/api/UiAccountApi;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->r(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/sso/api/UiAccountApi;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)LLb/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->b:LLb/b;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)Lorg/kodein/di/DI;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->a:Lorg/kodein/di/DI;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->d:Lgg/i;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;LGb/d;)LAb/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->t(LGb/d;)LAb/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->u(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Ljava/util/List;Ljava/util/List;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->v(Ljava/util/List;Ljava/util/List;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/sso/api/UiAccountApi;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->x(Lcom/ui/sso/api/UiAccountApi;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;LLb/a;)LNa/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->y(LLb/a;)LNa/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;LLb/a;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->z(LLb/a;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;LNa/b;Z)LLb/a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->A(LNa/b;Z)LLb/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)LLb/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->B(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)LLb/a;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/sso/api/UiAccountApi;)Lgg/b;
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->s(Lcom/ui/sso/api/UiAccountApi;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private final s(Lcom/ui/sso/api/UiAccountApi;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$f;-><init>(Lcom/ui/sso/api/UiAccountApi;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final t(LGb/d;)LAb/a;
    .locals 13

    new-instance v2, LGb/i;

    invoke-direct {v2, p1}, LGb/i;-><init>(LGb/d;)V

    sget-object p1, LP9/n;->a:LP9/n;

    invoke-virtual {p1}, LP9/n;->e()LAb/h;

    move-result-object v1

    invoke-virtual {p1}, LP9/n;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LP9/n;->b()Ljava/lang/String;

    move-result-object v5

    new-instance v7, LCb/b;

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-direct {v7, v2, p1, v0}, LCb/b;-><init>(LGb/f;ZLjava/lang/String;)V

    new-instance p1, LAb/g;

    const/16 v11, 0x3a0

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v12}, LAb/g;-><init>(LAb/h;LGb/f;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;LCb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LAb/i;Lgg/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private final u(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->D(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->C(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Lgg/f;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const/4 v0, 0x1

    aput-object p1, p2, v0

    invoke-static {p2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string p2, "concatArray(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final v(Ljava/util/List;Ljava/util/List;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;

    invoke-direct {v0, p1, p2, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;-><init>(Ljava/util/List;Ljava/util/List;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "subscribeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final w()Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->d:Lgg/i;

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;

    invoke-virtual {v0, v1}, Lgg/i;->X(Lkg/c;)Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$x;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$x;

    invoke-virtual {v0, v1}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N1(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$z;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$z;

    invoke-virtual {v0, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "switchMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final x(Lcom/ui/sso/api/UiAccountApi;)Lgg/b;
    .locals 4

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->a()LLi/g;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$A;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-virtual {p1, v0}, Lgg/i;->D(Lkg/n;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->f:Lgg/b;

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    aput-object v0, v2, v1

    invoke-static {v2}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string v0, "mergeArray(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final y(LLb/a;)LNa/b;
    .locals 4

    invoke-virtual {p1}, LLb/a;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LLb/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LLb/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LLb/a;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v3, LNa/b;

    invoke-direct {v3, v0, v2, v1, p1}, LNa/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method private final z(LLb/a;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;
    .locals 16

    invoke-virtual/range {p1 .. p1}, LLb/a;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LLb/a;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LLb/a;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LLb/a;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LLb/a;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LLb/a;->g()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, LLb/a;->h()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, LLb/a;->l()Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LLb/a;->c()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, LLb/a;->m()Z

    move-result v12

    invoke-virtual/range {p1 .. p1}, LLb/a;->i()J

    move-result-wide v13

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    const/4 v15, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v15}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->h:Lgg/i;

    return-object v0
.end method

.method public b(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$n;

    invoke-direct {v0, p1, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$n;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->j:Lgg/i;

    return-object v0
.end method

.method public d(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lgg/b;
    .locals 2

    const-string v0, "account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->c:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;

    invoke-direct {v1, p1, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$d;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$d;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->i:Lgg/i;

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->g:Lgg/i;

    return-object v0
.end method
