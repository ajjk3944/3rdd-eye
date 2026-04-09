.class public final LH8/l;
.super Lsf/c;
.source "SourceFile"

# interfaces
.implements LK8/d;
.implements LId/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/l$a;,
        LH8/l$b;
    }
.end annotation


# static fields
.field static final synthetic s:[Lth/l;

.field public static final t:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:Lgg/i;

.field private final l:Lgg/i;

.field private final m:Lgg/i;

.field private final n:LLi/N;

.field private final o:LLi/N;

.field private final p:LLi/N;

.field private final q:LLi/N;

.field private final r:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LH8/l;

    const-string/jumbo v2, "viewRouter"

    const-string/jumbo v3, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "productCatalog"

    const-string/jumbo v5, "getProductCatalog()Lcom/ui/product/catalog/uidb/UiDBProductCatalogRx3;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "teleportConnection"

    const-string/jumbo v6, "getTeleportConnection()Lcom/ui/wifiman/model/teleport/TeleportConnection;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/D;

    const-string/jumbo v6, "stream"

    const-string v7, "<v#0>"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/4 v5, 0x4

    new-array v5, v5, [Lth/l;

    aput-object v0, v5, v4

    const/4 v0, 0x1

    aput-object v2, v5, v0

    const/4 v0, 0x2

    aput-object v3, v5, v0

    const/4 v0, 0x3

    aput-object v1, v5, v0

    sput-object v5, LH8/l;->s:[Lth/l;

    const/16 v0, 0x8

    sput v0, LH8/l;->t:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 9

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lsf/c;-><init>()V

    iput-object p1, p0, LH8/l;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LH8/l$l;

    invoke-direct {v0}, LH8/l$l;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LH8/l;->s:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/l;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/l$m;

    invoke-direct {v3}, LH8/l$m;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lxa/o;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/l;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LH8/l$n;

    invoke-direct {v4}, LH8/l$n;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x2

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/l;->j:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v0, LH8/l$k;

    invoke-direct {v0, p0}, LH8/l$k;-><init>(LH8/l;)V

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LH8/l$e;

    invoke-direct {v1, p0}, LH8/l$e;-><init>(LH8/l;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->k()Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "cache(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/l;->k:Lgg/i;

    sget-object v1, LH8/l$p;->a:LH8/l$p;

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LH8/l;->l:Lgg/i;

    sget-object v2, LH8/l$f;->a:LH8/l$f;

    invoke-virtual {p1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LH8/l;->B0()Lxa/o;

    move-result-object v2

    invoke-interface {v2}, Lxa/o;->b()Lgg/i;

    move-result-object v2

    new-instance v4, LH8/l$g;

    invoke-direct {v4, p0}, LH8/l$g;-><init>(LH8/l;)V

    invoke-static {v1, p1, v2, v4}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/l;->m:Lgg/i;

    sget-object v0, LH8/l$d;->a:LH8/l$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LH8/l;->n:LLi/N;

    sget-object v1, LH8/l$q;->a:LH8/l$q;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ls9/d$c;

    const-string v1, ""

    invoke-direct {v4, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LH8/l;->o:LLi/N;

    sget-object v1, LH8/l$o;->a:LH8/l$o;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LH8/l;->p:LLi/N;

    sget-object v1, LH8/l$i;->a:LH8/l$i;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LH8/l;->q:LLi/N;

    sget-object v1, LH8/l$h;->a:LH8/l$h;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v6, 0x6

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LH8/l;->r:LLi/N;

    return-void
.end method

.method private final A0(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;
    .locals 9

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p2, v0}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object p2

    check-cast p2, Lxa/a$d;

    if-eqz p2, :cond_0

    sget-object v0, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {p2, v0}, Lcom/ubnt/usurvey/product/o;->b(Lxa/a$d;Lcom/ubnt/usurvey/product/m$c;)Lcom/ubnt/usurvey/product/m;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_3

    instance-of v0, p2, Lcom/ubnt/usurvey/product/m$a;

    if-eqz v0, :cond_1

    new-instance v0, Ls9/c$a;

    check-cast p2, Lcom/ubnt/usurvey/product/m$a;

    invoke-virtual {p2}, Lcom/ubnt/usurvey/product/m$a;->a()I

    move-result p2

    const/4 v2, 0x2

    invoke-direct {v0, p2, v1, v2, v1}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    goto :goto_1

    :cond_1
    instance-of v0, p2, Lcom/ubnt/usurvey/product/m$b;

    if-eqz v0, :cond_2

    new-instance v0, Ls9/c$b;

    check-cast p2, Lcom/ubnt/usurvey/product/m$b;

    invoke-virtual {p2}, Lcom/ubnt/usurvey/product/m$b;->a()Ljava/net/URI;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->d()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->c()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-object v2, LMd/g;->a:LMd/g$a;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LMd/g$a;->b(LMd/g$a;Ljava/lang/String;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-object v0, LL8/j;->a:LL8/j;

    invoke-virtual {v0, p2}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    if-eqz v3, :cond_4

    new-instance v1, Ls9/c$b;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->g()Ljava/lang/String;

    move-result-object p1

    new-instance v0, LH8/l$a;

    invoke-direct {v0, v1, p2, p1}, LH8/l$a;-><init>(Ls9/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final B0()Lxa/o;
    .locals 1

    iget-object v0, p0, LH8/l;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa/o;

    return-object v0
.end method

.method private final C0()Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 1

    iget-object v0, p0, LH8/l;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    return-object v0
.end method

.method private final D0()Li8/a;
    .locals 1

    iget-object v0, p0, LH8/l;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final E0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, LH8/k;

    invoke-direct {v3, p0}, LH8/k;-><init>(LH8/l;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, LH8/l;->G0(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v6, v0, p0}, Lye/d;->e(Lgg/i;Lye/g;)V

    return-void
.end method

.method private static final F0(LH8/l;)Lgg/i;
    .locals 2

    iget-object v0, p0, LH8/l;->m:Lgg/i;

    new-instance v1, LH8/l$c;

    invoke-direct {v1, p0}, LH8/l$c;-><init>(LH8/l;)V

    invoke-virtual {v0, v1}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "toFlowable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final G0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, LH8/l;->s:[Lth/l;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final H0(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$b;
    .locals 2

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$NetworkUnreachableError;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance p1, LH8/l$b$a$a;

    if-eqz p2, :cond_0

    invoke-direct {p0, p2, p3}, LH8/l;->A0(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;

    move-result-object v1

    :cond_0
    invoke-direct {p1, v1}, LH8/l$b$a$a;-><init>(LH8/l$a;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$CloudError;

    if-eqz v0, :cond_3

    new-instance p1, LH8/l$b$a$b;

    if-eqz p2, :cond_2

    invoke-direct {p0, p2, p3}, LH8/l;->A0(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;

    move-result-object v1

    :cond_2
    invoke-direct {p1, v1}, LH8/l$b$a$b;-><init>(LH8/l$a;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TokenAlreadyAdded;

    if-eqz v0, :cond_4

    sget-object p1, LH8/l$b$a$c;->b:LH8/l$b$a$c;

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TokenProbablyUsed;

    if-eqz v0, :cond_5

    sget-object p1, LH8/l$b$a$d;->b:LH8/l$b$a$d;

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;

    if-eqz v0, :cond_9

    new-instance v0, LH8/l$b$a$e;

    if-eqz p2, :cond_6

    invoke-direct {p0, p2, p3}, LH8/l;->A0(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;

    move-result-object v1

    :cond_6
    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;->a()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p2

    invoke-virtual {p0, p2}, LH8/l;->I0(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object p2

    invoke-static {p2}, LK8/b;->d(LId/c;)Ls9/d;

    move-result-object p2

    const-string p3, ""

    if-nez p2, :cond_7

    new-instance p2, Ls9/d$c;

    invoke-direct {p2, p3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_7
    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;->a()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p1

    invoke-virtual {p0, p1}, LH8/l;->I0(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object p1

    invoke-static {p1}, LK8/b;->a(LId/c;)Ls9/d;

    move-result-object p1

    if-nez p1, :cond_8

    new-instance p1, Ls9/d$c;

    invoke-direct {p1, p3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_8
    invoke-direct {v0, v1, p2, p1}, LH8/l$b$a$e;-><init>(LH8/l$a;Ls9/d;Ls9/d;)V

    move-object p1, v0

    :goto_0
    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic u0(LH8/l;)Lgg/i;
    .locals 0

    invoke-static {p0}, LH8/l;->F0(LH8/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(LH8/l;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;
    .locals 0

    invoke-direct {p0, p1, p2}, LH8/l;->A0(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(LH8/l;)Lsf/b;
    .locals 0

    invoke-virtual {p0}, Lsf/c;->p0()Lsf/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(LH8/l;)Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 0

    invoke-direct {p0}, LH8/l;->C0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(LH8/l;)Li8/a;
    .locals 0

    invoke-direct {p0}, LH8/l;->D0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z0(LH8/l;Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$b;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LH8/l;->H0(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->a(LId/f;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public I0(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->c(LId/f;Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public S(Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->d(LId/f;Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LH8/l;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public getTitle()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/l;->o:LLi/N;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-direct {p0}, LH8/l;->E0()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/l;->n:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/l;->q:LLi/N;

    return-object v0
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/l;->p:LLi/N;

    return-object v0
.end method

.method public r0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/l;->r:LLi/N;

    return-object v0
.end method

.method public s0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LH8/l;->k:Lgg/i;

    sget-object v2, LH8/l$j;->a:LH8/l$j;

    invoke-virtual {v1, v2}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->b(LId/f;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public t0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/l;->D0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$H;->a:Li8/a$b$H;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
