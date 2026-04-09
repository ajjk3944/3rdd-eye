.class public final LD8/e;
.super Lef/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/e$a;,
        LD8/e$b;
    }
.end annotation


# static fields
.field public static final s:LD8/e$a;

.field static final synthetic t:[Lth/l;

.field public static final u:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:Lgg/i;

.field private final o:Lgg/i;

.field private final p:Lgg/i;

.field private final q:LLi/N;

.field private final r:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/e;

    const-string/jumbo v2, "ssAccountService"

    const-string/jumbo v3, "getSsAccountService()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "localConsoleService"

    const-string/jumbo v5, "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "unifiNetworkDeeplinkResolver"

    const-string/jumbo v6, "getUnifiNetworkDeeplinkResolver()Lcom/ui/wifiman/model/ubiquiti/unifi/network/app/UnifiNetworkDeeplinkResolver;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "topologyService"

    const-string/jumbo v7, "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "viewRouter"

    const-string/jumbo v8, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "wifiSpeedFactorsCardOperator"

    const-string/jumbo v9, "getWifiSpeedFactorsCardOperator()Lcom/ubnt/usurvey/ui/speed/SpeedTabSpeedFactorsCardOperator$Wifi;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v7, 0x6

    new-array v7, v7, [Lth/l;

    aput-object v0, v7, v4

    const/4 v0, 0x1

    aput-object v2, v7, v0

    const/4 v0, 0x2

    aput-object v3, v7, v0

    const/4 v0, 0x3

    aput-object v5, v7, v0

    const/4 v0, 0x4

    aput-object v6, v7, v0

    const/4 v0, 0x5

    aput-object v1, v7, v0

    sput-object v7, LD8/e;->t:[Lth/l;

    new-instance v0, LD8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD8/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LD8/e;->s:LD8/e$a;

    const/16 v0, 0x8

    sput v0, LD8/e;->u:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 12

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lef/c;-><init>()V

    iput-object p1, p0, LD8/e;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LD8/e$m;

    invoke-direct {v0}, LD8/e$m;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LD8/e;->t:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/e;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LD8/e$n;

    invoke-direct {v3}, LD8/e$n;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LSd/d;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/e;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LD8/e$o;

    invoke-direct {v4}, LD8/e$o;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lae/b;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x2

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/e;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LD8/e$p;

    invoke-direct {v4}, LD8/e$p;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Ljd/b;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x3

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/e;->k:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LD8/e$q;

    invoke-direct {v4}, LD8/e$q;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x4

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/e;->l:LYg/m;

    invoke-virtual {p0}, LD8/e;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v4, Lorg/kodein/type/d;

    new-instance v5, LD8/e$r;

    invoke-direct {v5}, LD8/e$r;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LD8/j$b;

    invoke-direct {v4, v5, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v4, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v1, 0x5

    aget-object v1, v2, v1

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/e;->m:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v1, LD8/e$l;

    invoke-direct {v1, p0}, LD8/e$l;-><init>(LD8/e;)V

    invoke-static {v1, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "refCount(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/e;->n:Lgg/i;

    invoke-direct {p0}, LD8/e;->y0()LSd/d;

    move-result-object v2

    invoke-interface {v2}, LSd/d;->b()Lgg/i;

    move-result-object v2

    new-instance v4, LD8/e$c;

    invoke-direct {v4, p0}, LD8/e$c;-><init>(LD8/e;)V

    invoke-virtual {v2, v4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    const-string/jumbo v4, "distinctUntilChanged(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, LD8/e;->o:Lgg/i;

    sget-object v5, LAg/c;->a:LAg/c;

    invoke-direct {p0}, LD8/e;->z0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object v6

    invoke-interface {v6}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->e()Lgg/i;

    move-result-object v6

    sget-object v7, LD8/e$d;->a:LD8/e$d;

    invoke-virtual {v6, v7}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-virtual {v6}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LD8/e;->y0()LSd/d;

    move-result-object v7

    invoke-interface {v7}, LSd/d;->c()Lgg/i;

    move-result-object v7

    sget-object v8, LD8/e$e;->a:LD8/e$e;

    invoke-virtual {v7, v8}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v7

    invoke-virtual {v7}, Lgg/i;->W()Lgg/i;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6, v7, v2}, LAg/c;->b(Lgg/i;Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v2

    new-instance v5, LD8/e$f;

    invoke-direct {v5, p0}, LD8/e$f;-><init>(LD8/e;)V

    invoke-virtual {v2, v5}, Lgg/i;->N1(Lkg/n;)Lgg/i;

    move-result-object v2

    new-instance v5, Ll9/a;

    invoke-direct {v5, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LD8/e;->p:Lgg/i;

    new-instance v1, LD8/e$s;

    invoke-direct {v1, p0}, LD8/e$s;-><init>(LD8/e;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ls9/d$c;

    const-string v1, ""

    invoke-direct {v7, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v11}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LD8/e;->q:LLi/N;

    invoke-direct {p0}, LD8/e;->F0()LD8/j$b;

    move-result-object v1

    invoke-interface {v1}, LD8/j$b;->c()Lgg/i;

    move-result-object v1

    invoke-direct {p0}, LD8/e;->F0()LD8/j$b;

    move-result-object v2

    invoke-interface {v2}, LD8/j;->b()Lgg/i;

    move-result-object v2

    sget-object v3, LD8/e$i;->a:LD8/e$i;

    invoke-virtual {v0, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v3, LD8/e$j;

    invoke-direct {v3, p0}, LD8/e$j;-><init>(LD8/e;)V

    invoke-static {p1, v1, v2, v0, v3}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v7

    invoke-static/range {v5 .. v11}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LD8/e;->r:LLi/N;

    return-void
.end method

.method private final A0(Lef/b;)Ls9/d;
    .locals 1

    instance-of v0, p1, Lef/b$b$b;

    if-eqz v0, :cond_0

    new-instance p1, Ls9/d$b;

    const v0, 0x7f110287

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lef/b$b$d;

    if-eqz v0, :cond_1

    new-instance p1, Ls9/d$b;

    const v0, 0x7f110291

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lef/b$b$c;

    if-eqz v0, :cond_2

    new-instance p1, Ls9/d$b;

    const v0, 0x7f110290

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lef/b$b$a;

    if-eqz v0, :cond_3

    new-instance p1, Ls9/d$b;

    const v0, 0x7f11028e

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lef/b$a$a;

    if-eqz p1, :cond_4

    new-instance p1, Ls9/d$b;

    const v0, 0x7f11028c

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final B0()Ljd/b;
    .locals 1

    iget-object v0, p0, LD8/e;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/b;

    return-object v0
.end method

.method private final C0()Lae/b;
    .locals 1

    iget-object v0, p0, LD8/e;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lae/b;

    return-object v0
.end method

.method private final D0()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/e;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final E0(Laf/O$b;LS8/c;Z)Lef/a$a;
    .locals 9

    invoke-virtual {p1}, Laf/O$b;->a()LW7/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Laf/O$b;->a()LW7/e;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v2, LW7/e;->GOOD:LW7/e;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Laf/O$b;->b()Laf/O$b$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Laf/O$b;->a()LW7/e;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, LW7/e;->POOR:LW7/e;

    :cond_1
    move-object v5, v0

    invoke-virtual {p1}, Laf/O$b;->b()Laf/O$b$a;

    move-result-object v4

    invoke-virtual {p1}, Laf/O$b;->c()Ls9/d;

    move-result-object v6

    invoke-virtual {p1}, Laf/O$b;->b()Laf/O$b$a;

    move-result-object v0

    sget-object v2, LD8/e$b;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    return-object v1

    :pswitch_1
    new-instance p1, Ls9/d$b;

    const p2, 0x7f11028a

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    :goto_0
    move-object v7, p1

    goto/16 :goto_1

    :pswitch_2
    new-instance p1, Ls9/d$b;

    const p2, 0x7f11028b

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :pswitch_3
    new-instance p1, Ls9/d$b;

    const p2, 0x7f110288

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :pswitch_4
    new-instance p1, Ls9/d$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "channelDeeplink"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, LD8/e$h;

    invoke-direct {v1, p3, p2}, LD8/e$h;-><init>(ZLS8/c;)V

    invoke-direct {p1, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :pswitch_5
    new-instance p2, Ls9/d$a;

    invoke-virtual {p1}, Laf/O$b;->c()Ls9/d;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    new-instance v0, LD8/e$g;

    invoke-direct {v0, p1}, LD8/e$g;-><init>(Laf/O$b;)V

    invoke-direct {p2, p3, v0}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object v7, p2

    goto :goto_1

    :pswitch_6
    sget-object p1, LD8/e$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v8, :cond_6

    if-eq p1, v7, :cond_4

    if-ne p1, v2, :cond_3

    if-eqz p3, :cond_2

    new-instance p1, Ls9/d$b;

    const p2, 0x7f110284

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance p1, Ls9/d$b;

    const p2, 0x7f110283

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    if-eqz p3, :cond_5

    new-instance p1, Ls9/d$b;

    const p2, 0x7f110282

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_5
    new-instance p1, Ls9/d$b;

    const p2, 0x7f110281

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto/16 :goto_0

    :cond_6
    return-object v1

    :pswitch_7
    sget-object p1, LD8/e$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v8, :cond_9

    if-eq p1, v7, :cond_8

    if-ne p1, v2, :cond_7

    return-object v1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    return-object v1

    :cond_9
    new-instance p1, Ls9/d$b;

    const p2, 0x7f11027e

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto/16 :goto_0

    :goto_1
    new-instance p1, Lef/a$a;

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lef/a$a;-><init>(Ljava/lang/String;Laf/O$b$a;LW7/e;Ls9/d;Ls9/d;)V

    return-object p1

    :cond_a
    :goto_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final F0()LD8/j$b;
    .locals 1

    iget-object v0, p0, LD8/e;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD8/j$b;

    return-object v0
.end method

.method public static final synthetic q0(LD8/e;Lef/b;LS8/c;Laf/P;Z)LCi/c;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LD8/e;->x0(Lef/b;LS8/c;Laf/P;Z)LCi/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r0(LD8/e;)Lef/b;
    .locals 0

    invoke-virtual {p0}, Lef/c;->o0()Lef/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LD8/e;Lef/b;)Ls9/d;
    .locals 0

    invoke-direct {p0, p1}, LD8/e;->A0(Lef/b;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LD8/e;)Ljd/b;
    .locals 0

    invoke-direct {p0}, LD8/e;->B0()Ljd/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u0(LD8/e;)Lae/b;
    .locals 0

    invoke-direct {p0}, LD8/e;->C0()Lae/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(LD8/e;)Li8/a;
    .locals 0

    invoke-direct {p0}, LD8/e;->D0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final w0()Lef/a;
    .locals 3

    new-instance v0, Lef/a$b;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f11028d

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    const-string/jumbo v2, "cellularChannelValue"

    invoke-direct {v0, v2, v1}, Lef/a$b;-><init>(Ljava/lang/String;Ls9/d;)V

    return-object v0
.end method

.method private final x0(Lef/b;LS8/c;Laf/P;Z)LCi/c;
    .locals 4

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Laf/P;->b()Laf/O;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Laf/O;->d()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    instance-of v3, p1, Lef/b$b$d;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Laf/O$b;

    invoke-direct {p0, v3, p2, p4}, LD8/e;->E0(Laf/O$b;LS8/c;Z)Lef/a$a;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    if-eqz p3, :cond_5

    invoke-virtual {p3}, Laf/P;->d()Laf/O;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Laf/O;->d()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    instance-of v3, p1, Lef/b$b$c;

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Laf/O$b;

    invoke-direct {p0, v3, p2, p4}, LD8/e;->E0(Laf/O$b;LS8/c;Z)Lef/a$a;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    if-eqz p3, :cond_8

    invoke-virtual {p3}, Laf/P;->e()Laf/O;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Laf/O;->d()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8

    instance-of v3, p1, Lef/b$b$a;

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, v1

    :goto_4
    if-eqz v2, :cond_8

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Laf/O$b;

    invoke-direct {p0, v3, p2, p4}, LD8/e;->E0(Laf/O$b;LS8/c;Z)Lef/a$a;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    sget-object p4, Lef/b$a$a;->b:Lef/b$a$a;

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-direct {p0}, LD8/e;->w0()Lef/a;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_f

    new-instance p1, Lef/a$b;

    if-eqz p3, :cond_a

    invoke-virtual {p3}, Laf/P;->c()LW7/e;

    move-result-object v1

    :cond_a
    const/4 p2, -0x1

    if-nez v1, :cond_b

    move p3, p2

    goto :goto_6

    :cond_b
    sget-object p3, LD8/e$b;->c:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p3, p3, p4

    :goto_6
    if-eq p3, p2, :cond_e

    const/4 p2, 0x1

    if-eq p3, p2, :cond_e

    const/4 p2, 0x2

    if-eq p3, p2, :cond_e

    const/4 p2, 0x3

    if-eq p3, p2, :cond_d

    const/4 p2, 0x4

    if-ne p3, p2, :cond_c

    goto :goto_7

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    :goto_7
    new-instance p2, Ls9/d$b;

    const p3, 0x7f110286

    invoke-direct {p2, p3}, Ls9/d$b;-><init>(I)V

    goto :goto_8

    :cond_e
    new-instance p2, Ls9/d$b;

    const p3, 0x7f110285

    invoke-direct {p2, p3}, Ls9/d$b;-><init>(I)V

    :goto_8
    const-string/jumbo p3, "overall"

    invoke-direct {p1, p3, p2}, Lef/a$b;-><init>(Ljava/lang/String;Ls9/d;)V

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object p1

    return-object p1

    :cond_f
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method private final y0()LSd/d;
    .locals 1

    iget-object v0, p0, LD8/e;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSd/d;

    return-object v0
.end method

.method private final z0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 1

    iget-object v0, p0, LD8/e;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LD8/e;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public getTitle()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/e;->q:LLi/N;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/e;->r:LLi/N;

    return-object v0
.end method

.method public p0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lye/d;->a:Lye/d;

    iget-object v0, p0, LD8/e;->p:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "firstOrError(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ll9/f;->f(Lgg/z;)Lgg/n;

    move-result-object v0

    new-instance v1, LD8/e$k;

    invoke-direct {v1, p0}, LD8/e$k;-><init>(LD8/e;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
