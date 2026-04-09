.class public final LG8/b;
.super Lpf/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG8/b$a;
    }
.end annotation


# static fields
.field static final synthetic q:[Lth/l;


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LLi/y;

.field private final k:Lye/b$a;

.field private final l:LLi/z;

.field private final m:LLi/z;

.field private final n:LLi/N;

.field private final o:LLi/N;

.field private final p:LLi/z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LG8/b;

    const-string/jumbo v2, "accountManager"

    const-string/jumbo v3, "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "ssoAccounts"

    const-string/jumbo v6, "getSsoAccounts()Lkotlinx/coroutines/flow/Flow;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lth/l;

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LG8/b;->q:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpf/b;-><init>()V

    iput-object p1, p0, LG8/b;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LG8/b$f;

    invoke-direct {v0}, LG8/b$f;-><init>()V

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

    sget-object v2, LG8/b;->q:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LG8/b;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LG8/b$g;

    invoke-direct {v4}, LG8/b$g;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v1, 0x1

    aget-object v2, v2, v1

    invoke-interface {p1, p0, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LG8/b;->i:LYg/m;

    sget-object p1, LKi/a;->DROP_OLDEST:LKi/a;

    invoke-static {v3, v1, p1, v1, v0}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, LG8/b;->j:LLi/y;

    sget-object p1, Lye/b;->a:Lye/b;

    sget-object v0, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    new-instance v1, LG8/a;

    invoke-direct {v1, p0}, LG8/a;-><init>(LG8/b;)V

    invoke-virtual {p1, p0, v0, v1}, Lye/b;->b(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lye/b$a;

    move-result-object p1

    iput-object p1, p0, LG8/b;->k:Lye/b$a;

    new-instance p1, Ls9/d$b;

    const v0, 0x7f110229

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LG8/b;->l:LLi/z;

    sget-object p1, Lq9/h;->DEFAULT:Lq9/h;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LG8/b;->m:LLi/z;

    invoke-direct {p0}, LG8/b;->z0()LLi/g;

    move-result-object p1

    new-instance v1, LG8/b$h;

    invoke-direct {v1, p1, p0}, LG8/b$h;-><init>(LLi/g;LG8/b;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LG8/b;->n:LLi/N;

    invoke-virtual {p0}, LG8/b;->y0()LLi/z;

    move-result-object p1

    new-instance v1, LG8/b$i;

    invoke-direct {v1, p1}, LG8/b$i;-><init>(LLi/g;)V

    new-instance v2, Ls9/d$c;

    const-string p1, ""

    invoke-direct {v2, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static/range {v0 .. v6}, Lye/g;->c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LG8/b;->o:LLi/N;

    new-instance p1, Ls9/d$b;

    const v0, 0x7f110228

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LG8/b;->p:LLi/z;

    return-void
.end method

.method private final B0()Li8/a;
    .locals 1

    iget-object v0, p0, LG8/b;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private static final C0(LG8/b;)LLi/g;
    .locals 0

    invoke-direct {p0}, LG8/b;->v0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p0

    invoke-interface {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->a()Lgg/i;

    move-result-object p0

    invoke-static {p0}, LPi/e;->a(LDj/a;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method private final D0(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lq9/g;
    .locals 10

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->e(Ljava/util/UUID;)I

    move-result v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, LL8/j;->a:LL8/j;

    invoke-virtual {v1, v0}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v0, Ls9/c$b;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    sget-object v0, LPe/b$a;->a:LPe/b$a;

    invoke-virtual {v0}, LPe/b$a;->a()Ls9/c$a;

    move-result-object v0

    move-object v3, v0

    :goto_0
    sget-object v0, LPe/b$a;->a:LPe/b$a;

    invoke-virtual {v0}, LPe/b$a;->a()Ls9/c$a;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ls9/d$c;

    invoke-direct {v6, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->m()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->p()Ls9/b;

    move-result-object p1

    new-instance v0, Ls9/b$b;

    const-string/jumbo v1, "blue"

    sget-object v7, LG8/b$j;->a:LG8/b$j;

    invoke-direct {v0, v1, v7}, Ls9/b$b;-><init>(Ljava/lang/String;Lmh/p;)V

    invoke-virtual {p1, v0}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object p1

    move-object v7, p1

    goto :goto_2

    :cond_2
    move-object v7, v1

    :goto_2
    new-instance p1, Lq9/g;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lq9/g;-><init>(ILs9/c;Ls9/a$b;Ls9/d;Ls9/d;Ls9/b;)V

    return-object p1
.end method

.method public static synthetic o0(LG8/b;)LLi/g;
    .locals 0

    invoke-static {p0}, LG8/b;->C0(LG8/b;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p0(LG8/b;ILdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LG8/b;->u0(ILdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q0(LG8/b;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 0

    invoke-direct {p0}, LG8/b;->v0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r0(LG8/b;)LLi/g;
    .locals 0

    invoke-direct {p0}, LG8/b;->z0()LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LG8/b;)Li8/a;
    .locals 0

    invoke-direct {p0}, LG8/b;->B0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LG8/b;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lq9/g;
    .locals 0

    invoke-direct {p0, p1}, LG8/b;->D0(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lq9/g;

    move-result-object p0

    return-object p0
.end method

.method private final u0(ILdh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LG8/b$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LG8/b$b;

    iget v1, v0, LG8/b$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LG8/b$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LG8/b$b;

    invoke-direct {v0, p0, p2}, LG8/b$b;-><init>(LG8/b;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LG8/b$b;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG8/b$b;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, LG8/b$b;->a:I

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-direct {p0}, LG8/b;->z0()LLi/g;

    move-result-object p2

    iput p1, v0, LG8/b$b;->a:I

    iput v3, v0, LG8/b$b;->d:I

    invoke-static {p2, v0}, LLi/i;->z(LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p2, :cond_6

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->e(Ljava/util/UUID;)I

    move-result v2

    if-ne v2, p1, :cond_4

    move-object v0, v1

    :cond_5
    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    :cond_6
    return-object v0
.end method

.method private final v0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 1

    iget-object v0, p0, LG8/b;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    return-object v0
.end method

.method private final z0()LLi/g;
    .locals 3

    iget-object v0, p0, LG8/b;->k:Lye/b$a;

    sget-object v1, LG8/b;->q:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lye/b$a;->c(Ljava/lang/Object;Lth/l;)LLi/g;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A0()LLi/z;
    .locals 1

    iget-object v0, p0, LG8/b;->l:LLi/z;

    return-object v0
.end method

.method public bridge synthetic C()LLi/N;
    .locals 1

    invoke-virtual {p0}, LG8/b;->y0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public a()LLi/N;
    .locals 1

    iget-object v0, p0, LG8/b;->n:LLi/N;

    return-object v0
.end method

.method public bridge synthetic b()LLi/g;
    .locals 1

    invoke-virtual {p0}, LG8/b;->x0()LLi/y;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LG8/b;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public f(Lq9/g;Ldh/e;)Ljava/lang/Object;
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v1

    new-instance v3, LG8/b$e;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p1, p2}, LG8/b$e;-><init>(LG8/b;Lq9/g;Ldh/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic getTitle()LLi/N;
    .locals 1

    invoke-virtual {p0}, LG8/b;->A0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public n0(Lpf/b$a$a;)V
    .locals 7

    const-string/jumbo v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v1

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v2

    new-instance v4, LG8/b$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LG8/b$d;-><init>(LG8/b;Lpf/b$a$a;Ldh/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public o(Ldh/e;)Ljava/lang/Object;
    .locals 4

    sget-object p1, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LG8/b;->B0()Li8/a;

    move-result-object v0

    new-instance v1, Li8/a$b$t;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Li8/a$b$t;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v2, v3, [Li8/a$b;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-interface {v0, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public s(Lq9/g;Ldh/e;)Ljava/lang/Object;
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v1

    new-instance v3, LG8/b$c;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p1, p2}, LG8/b$c;-><init>(LG8/b;Lq9/g;Ldh/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public u(Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LG8/b;->y0()LLi/z;

    move-result-object p1

    invoke-virtual {p0}, LG8/b;->y0()LLi/z;

    move-result-object v0

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq9/h;

    sget-object v1, LG8/b$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object v0, Lq9/h;->DEFAULT:Lq9/h;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object v0, Lq9/h;->EDIT:Lq9/h;

    :goto_0
    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public w()LLi/N;
    .locals 1

    iget-object v0, p0, LG8/b;->o:LLi/N;

    return-object v0
.end method

.method public w0()LLi/z;
    .locals 1

    iget-object v0, p0, LG8/b;->p:LLi/z;

    return-object v0
.end method

.method public bridge synthetic x()LLi/N;
    .locals 1

    invoke-virtual {p0}, LG8/b;->w0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public x0()LLi/y;
    .locals 1

    iget-object v0, p0, LG8/b;->j:LLi/y;

    return-object v0
.end method

.method public y0()LLi/z;
    .locals 1

    iget-object v0, p0, LG8/b;->m:LLi/z;

    return-object v0
.end method
