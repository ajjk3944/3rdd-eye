.class public final LD8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/v$a;,
        LD8/v$b;
    }
.end annotation


# static fields
.field public static final i:LD8/v$a;

.field static final synthetic j:[Lth/l;

.field public static final k:I


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:LYg/m;

.field private final f:LYg/m;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/v;

    const-string/jumbo v2, "topologyOperator"

    const-string/jumbo v3, "getTopologyOperator()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "uispController"

    const-string/jumbo v5, "getUispController()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "publicIpService"

    const-string/jumbo v6, "getPublicIpService()Lcom/ui/wifiman/model/publicip/PublicIP$Service;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "networkConnectionManager"

    const-string/jumbo v7, "getNetworkConnectionManager()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

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

    const-string/jumbo v8, "androidDeviceInfo"

    const-string/jumbo v9, "getAndroidDeviceInfo()Lcom/ui/wifiman/model/android/device/AndroidDevice;"

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

    sput-object v7, LD8/v;->j:[Lth/l;

    new-instance v0, LD8/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD8/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LD8/v;->i:LD8/v$a;

    const/16 v0, 0x8

    sput v0, LD8/v;->k:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LD8/v$j;

    invoke-direct {v1}, LD8/v$j;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Ljd/b;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LD8/v;->j:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/v;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LD8/v$k;

    invoke-direct {v4}, LD8/v$k;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x1

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/v;->b:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/v$l;

    invoke-direct {v5}, LD8/v$l;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lkd/d;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x2

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/v;->c:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/v$m;

    invoke-direct {v5}, LD8/v$m;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LZc/f;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x3

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/v;->d:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/v$n;

    invoke-direct {v5}, LD8/v$n;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Li8/a;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x4

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/v;->e:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/v$o;

    invoke-direct {v5}, LD8/v$o;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lmc/a;

    invoke-direct {v0, v5, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x5

    aget-object v0, v3, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/v;->f:LYg/m;

    invoke-direct {p0}, LD8/v;->q()LZc/f;

    move-result-object p1

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    sget-object v0, LD8/v$c;->a:LD8/v$c;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/v;->g:Lgg/i;

    invoke-direct {p0}, LD8/v;->s()Ljd/b;

    move-result-object v0

    invoke-interface {v0}, Ljd/b;->a()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LD8/v;->t()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->a()Lgg/i;

    move-result-object v1

    invoke-direct {p0}, LD8/v;->r()Lkd/d;

    move-result-object v2

    invoke-interface {v2}, Lkd/d;->a()Lgg/i;

    move-result-object v2

    new-instance v3, LD8/v$p;

    invoke-direct {v3, p0}, LD8/v$p;-><init>(LD8/v;)V

    invoke-static {v0, v1, v2, p1, v3}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/v;->h:Lgg/i;

    return-void
.end method

.method public static synthetic d(Lle/i;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, LD8/v;->n(Lle/i;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LD8/v;Ljd/a$a;)Lcom/ui/wifiman/ui/component/network/q$a;
    .locals 0

    invoke-direct {p0, p1}, LD8/v;->k(Ljd/a$a;)Lcom/ui/wifiman/ui/component/network/q$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LD8/v;Lb8/a;)Lcom/ui/wifiman/ui/component/network/L;
    .locals 0

    invoke-direct {p0, p1}, LD8/v;->l(Lb8/a;)Lcom/ui/wifiman/ui/component/network/L;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LD8/v;Ljd/a$b;I)Lcom/ui/wifiman/ui/component/network/M;
    .locals 0

    invoke-direct {p0, p1, p2}, LD8/v;->m(Ljd/a$b;I)Lcom/ui/wifiman/ui/component/network/M;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LD8/v;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;Lkd/e;Lb8/a;)Lcom/ui/wifiman/ui/component/network/M;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LD8/v;->p(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;Lkd/e;Lb8/a;)Lcom/ui/wifiman/ui/component/network/M;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LD8/v;)Li8/a;
    .locals 0

    invoke-direct {p0}, LD8/v;->u()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(LD8/v;Ljd/a$b;I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, LD8/v;->v(Ljd/a$b;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final k(Ljd/a$a;)Lcom/ui/wifiman/ui/component/network/q$a;
    .locals 1

    sget-object v0, LD8/v$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/ui/wifiman/ui/component/network/q$a;->WIRELESS:Lcom/ui/wifiman/ui/component/network/q$a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lcom/ui/wifiman/ui/component/network/q$a;->WIRED:Lcom/ui/wifiman/ui/component/network/q$a;

    :goto_0
    return-object p1
.end method

.method private final l(Lb8/a;)Lcom/ui/wifiman/ui/component/network/L;
    .locals 1

    instance-of v0, p1, Lb8/a$b;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ui/wifiman/ui/component/network/L;->CHECKING:Lcom/ui/wifiman/ui/component/network/L;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lb8/a$c;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/ui/wifiman/ui/component/network/L;->UNREACHABLE:Lcom/ui/wifiman/ui/component/network/L;

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lb8/a$a;

    if-eqz p1, :cond_2

    sget-object p1, Lcom/ui/wifiman/ui/component/network/L;->REACHABLE:Lcom/ui/wifiman/ui/component/network/L;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final m(Ljd/a$b;I)Lcom/ui/wifiman/ui/component/network/M;
    .locals 18

    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->d()Ljd/a$c;

    move-result-object v0

    sget-object v1, LD8/v$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v0, v5, :cond_4

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_2

    if-ne v0, v2, :cond_1

    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->k()Ls9/b;

    move-result-object v0

    :cond_0
    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    invoke-direct/range {p0 .. p0}, LD8/v;->o()Lmc/a;

    move-result-object v0

    invoke-interface {v0}, Lmc/a;->d()LCc/b;

    move-result-object v0

    invoke-static {v0}, Lk8/b;->b(LCc/b;)Ls9/a$b;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ls9/c$a;

    const v7, 0x7f0703e5

    invoke-direct {v0, v7, v6, v4, v6}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_3
    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->c()Ls9/b;

    move-result-object v0

    goto :goto_0

    :cond_4
    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->o()Ls9/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-direct/range {p0 .. p2}, LD8/v;->v(Ljd/a$b;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v7

    if-eqz v7, :cond_6

    sget-object v8, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {v7, v8, v9}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v7

    if-nez v7, :cond_5

    goto :goto_2

    :cond_5
    move-object v12, v7

    goto :goto_3

    :cond_6
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->e()Ljd/a$d;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljd/a$d;->b()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_7

    sget-object v8, LL8/j;->a:LL8/j;

    invoke-virtual {v8, v7}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v8

    if-eqz v8, :cond_7

    new-instance v14, Ls9/c$b;

    const/16 v12, 0xc

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v14

    invoke-direct/range {v7 .. v13}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v14

    goto :goto_3

    :cond_7
    move-object v12, v9

    :goto_3
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-interface {v7}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v7}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_4
    move-object v13, v1

    goto :goto_5

    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->e()Ljd/a$d;

    move-result-object v7

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Ljd/a$d;->a()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_9

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v7}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->d()Ljd/a$c;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v1, v1, v7

    if-eq v1, v5, :cond_d

    if-eq v1, v4, :cond_c

    if-eq v1, v3, :cond_b

    if-ne v1, v2, :cond_a

    new-instance v1, Ls9/d$b;

    const v2, 0x7f1100af

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    goto :goto_4

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    new-instance v1, Ls9/d$b;

    const v2, 0x7f1101f9

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    goto :goto_4

    :cond_c
    new-instance v1, Ls9/d$b;

    const v2, 0x7f1101fa

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    goto :goto_4

    :cond_d
    new-instance v1, Ls9/d$b;

    const v2, 0x7f1101fb

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    goto :goto_4

    :goto_5
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-interface {v1}, LCc/a;->m()Ljava/util/TreeSet;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lle/i;

    invoke-virtual {v3}, Lle/i;->l()LS8/a;

    move-result-object v3

    sget-object v4, LS8/a;->BE:LS8/a;

    if-ne v3, v4, :cond_e

    goto :goto_6

    :cond_f
    move-object v2, v6

    :goto_6
    check-cast v2, Lle/i;

    if-eqz v2, :cond_10

    sget-object v1, LAf/v$a;->a:LAf/v$a;

    move-object v14, v1

    goto :goto_7

    :cond_10
    move-object v14, v6

    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->c()Linet/ipaddr/g;

    move-result-object v1

    if-nez v1, :cond_12

    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-interface {v1}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v1

    goto :goto_8

    :cond_11
    move-object v1, v6

    :cond_12
    :goto_8
    if-eqz v1, :cond_14

    invoke-virtual {v1}, Linet/ipaddr/g;->f1()Z

    move-result v2

    if-eqz v2, :cond_13

    new-instance v1, Ls9/d$b;

    const v2, 0x7f110138

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    goto :goto_9

    :cond_13
    invoke-static {v1}, LL8/f;->a(Linet/ipaddr/g;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ls9/d$c;

    invoke-direct {v2, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v1, v2

    :goto_9
    move-object v15, v1

    goto :goto_a

    :cond_14
    move-object v15, v6

    :goto_a
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->e()Ljd/a$d;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Ljd/a$d;->d()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_19

    :cond_15
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-interface {v1}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-virtual {v1}, LDc/j;->z()LFc/a$b;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-virtual {v1}, LFc/a$b;->l()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_18

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_16
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lle/i;

    invoke-virtual {v4}, Lle/i;->m()Lke/a;

    move-result-object v4

    instance-of v4, v4, Lke/a$a;

    if-eqz v4, :cond_16

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_17
    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v1

    if-eqz v1, :cond_18

    new-instance v2, LD8/u;

    invoke-direct {v2}, LD8/u;-><init>()V

    invoke-static {v1, v2}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-static {v1}, Lzi/m;->E(Lzi/j;)Lzi/j;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-static {v1}, Lzi/m;->U(Lzi/j;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_c

    :cond_18
    move-object v1, v6

    :cond_19
    :goto_c
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->e()Ljd/a$d;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Ljd/a$d;->c()LS8/g;

    move-result-object v2

    if-nez v2, :cond_1c

    :cond_1a
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-interface {v2}, LCc/a;->j()LDc/j;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-virtual {v2}, LDc/j;->N()LS8/g;

    move-result-object v2

    goto :goto_d

    :cond_1b
    move-object v2, v6

    :cond_1c
    :goto_d
    if-eqz v2, :cond_1d

    invoke-static {v2, v5}, LNe/k;->b(LS8/g;Z)Ls9/d;

    move-result-object v2

    goto :goto_e

    :cond_1d
    move-object v2, v6

    :goto_e
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1f

    invoke-interface {v3}, LCc/a;->f()Lxa/a$d;

    move-result-object v3

    if-eqz v3, :cond_1f

    invoke-static {v3}, LCc/m;->a(Lxa/a$d;)Z

    move-result v3

    xor-int/2addr v3, v5

    if-ne v3, v5, :cond_1f

    :cond_1e
    move v3, v4

    goto :goto_f

    :cond_1f
    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v3

    if-eqz v3, :cond_20

    invoke-interface {v3}, LCc/a;->j()LDc/j;

    move-result-object v3

    if-eqz v3, :cond_20

    invoke-virtual {v3}, LDc/j;->J()LQc/a$b;

    move-result-object v6

    :cond_20
    if-eqz v6, :cond_1e

    move v3, v5

    :goto_f
    new-instance v6, Lcom/ui/wifiman/ui/component/network/K$a;

    invoke-direct {v6, v1, v2, v3}, Lcom/ui/wifiman/ui/component/network/K$a;-><init>(Ljava/lang/Integer;Ls9/d;Z)V

    invoke-virtual/range {p1 .. p1}, Ljd/a$b;->b()LCc/a;

    move-result-object v1

    if-eqz v1, :cond_21

    move/from16 v17, v5

    goto :goto_10

    :cond_21
    move/from16 v17, v4

    :goto_10
    new-instance v1, Lcom/ui/wifiman/ui/component/network/M;

    move-object v10, v1

    move-object v11, v0

    move-object/from16 v16, v6

    invoke-direct/range {v10 .. v17}, Lcom/ui/wifiman/ui/component/network/M;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;LAf/v;Ls9/d;Lcom/ui/wifiman/ui/component/network/K;Z)V

    return-object v1
.end method

.method private static final n(Lle/i;)Ljava/lang/Integer;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lle/i;->g()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private final o()Lmc/a;
    .locals 1

    iget-object v0, p0, LD8/v;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmc/a;

    return-object v0
.end method

.method private final p(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;Lkd/e;Lb8/a;)Lcom/ui/wifiman/ui/component/network/M;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lkd/e;->a()Ljava/net/URL;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    sget-object v2, LL8/j;->a:LL8/j;

    invoke-virtual {v2, v1}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v4

    if-eqz v4, :cond_3

    new-instance v1, Ls9/c$b;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v4, v1

    goto :goto_2

    :cond_3
    sget-object v1, LN9/b;->a:LN9/b;

    invoke-virtual {v1}, LN9/b;->B()Ls9/b;

    move-result-object v1

    goto :goto_1

    :goto_2
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;->d()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_6

    :cond_4
    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lkd/e;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_5
    move-object p1, v0

    :cond_6
    :goto_3
    if-eqz p1, :cond_7

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v5, v1

    goto :goto_4

    :cond_7
    new-instance p1, Ls9/d$b;

    const v1, 0x7f110134

    invoke-direct {p1, v1}, Ls9/d$b;-><init>(I)V

    move-object v5, p1

    :goto_4
    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lkd/e;->c()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_8
    move-object v7, v0

    new-instance v8, Lcom/ui/wifiman/ui/component/network/K$b;

    invoke-direct {v8, p3}, Lcom/ui/wifiman/ui/component/network/K$b;-><init>(Lb8/a;)V

    new-instance p1, Lcom/ui/wifiman/ui/component/network/M;

    const-string/jumbo v3, "internet"

    const/4 v6, 0x0

    const/4 v9, 0x1

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Lcom/ui/wifiman/ui/component/network/M;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;LAf/v;Ls9/d;Lcom/ui/wifiman/ui/component/network/K;Z)V

    return-object p1
.end method

.method private final q()LZc/f;
    .locals 1

    iget-object v0, p0, LD8/v;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method

.method private final r()Lkd/d;
    .locals 1

    iget-object v0, p0, LD8/v;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkd/d;

    return-object v0
.end method

.method private final s()Ljd/b;
    .locals 1

    iget-object v0, p0, LD8/v;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/b;

    return-object v0
.end method

.method private final t()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;
    .locals 1

    iget-object v0, p0, LD8/v;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    return-object v0
.end method

.method private final u()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/v;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final v(Ljd/a$b;I)Ljava/lang/String;
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "tplItem:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LD8/v;->h:Lgg/i;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lgg/b;
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LD8/v;->s()Ljd/b;

    move-result-object v0

    invoke-interface {v0}, Ljd/b;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LD8/v$g;

    invoke-direct {v1, p0, p1}, LD8/v$g;-><init>(LD8/v;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    sget-object v0, LD8/v$h;->a:LD8/v$h;

    invoke-virtual {p1, v0}, Lgg/n;->j(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v0, LD8/v$i;

    invoke-direct {v0, p0}, LD8/v$i;-><init>(LD8/v;)V

    invoke-virtual {p1, v0}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lgg/b;
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "internet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LD8/v;->u()Li8/a;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Li8/a$b;

    sget-object v1, Li8/a$b$l;->a:Li8/a$b$l;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LD8/v;->s()Ljd/b;

    move-result-object v0

    invoke-interface {v0}, Ljd/b;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LD8/v$d;

    invoke-direct {v1, p0, p1}, LD8/v$d;-><init>(LD8/v;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    sget-object v0, LD8/v$e;->a:LD8/v$e;

    invoke-virtual {p1, v0}, Lgg/n;->j(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v0, LD8/v$f;

    invoke-direct {v0, p0}, LD8/v$f;-><init>(LD8/v;)V

    invoke-virtual {p1, v0}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method
