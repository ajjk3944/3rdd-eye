.class public final LD8/c;
.super Lcf/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/c$a;
    }
.end annotation


# static fields
.field public static final m:LD8/c$a;

.field static final synthetic n:[Lth/l;

.field public static final o:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LFg/a;

.field private final k:Lgg/i;

.field private final l:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/c;

    const-string/jumbo v2, "favoriteHostsManager"

    const-string/jumbo v3, "getFavoriteHostsManager()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LD8/c;->n:[Lth/l;

    new-instance v0, LD8/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD8/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LD8/c;->m:LD8/c$a;

    const/16 v0, 0x8

    sput v0, LD8/c;->o:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcf/a;-><init>()V

    iput-object p1, p0, LD8/c;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LD8/c$e;

    invoke-direct {v0}, LD8/c$e;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LD8/c;->n:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/c;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LD8/c$f;

    invoke-direct {v4}, LD8/c$f;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v1, v2, v0

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/c;->i:LYg/m;

    const-string p1, ""

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v1, "createDefault(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/c;->j:LFg/a;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p1, v1, v3, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/c;->k:Lgg/i;

    new-instance v0, LD8/c$d;

    invoke-direct {v0, p0}, LD8/c$d;-><init>(LD8/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo p1, "map(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LD8/c;->l:LLi/N;

    return-void
.end method

.method private final A0(Ljava/lang/String;)Z
    .locals 8

    const-string/jumbo v0, "`: "

    const-string/jumbo v1, "NetworkHosts: invalid ip `"

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    new-instance v5, Linet/ipaddr/n;

    new-instance v6, Linet/ipaddr/o$a;

    invoke-direct {v6}, Linet/ipaddr/o$a;-><init>()V

    invoke-virtual {v6, v4}, Linet/ipaddr/o$a;->k(Z)Linet/ipaddr/o$a;

    move-result-object v6

    invoke-virtual {v6, v4}, Linet/ipaddr/o$a;->q(Z)Linet/ipaddr/o$a;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Linet/ipaddr/o$a;->l(Z)Linet/ipaddr/o$a;

    move-result-object v6

    invoke-virtual {v6, v7}, Linet/ipaddr/o$a;->m(Z)Linet/ipaddr/o$a;

    move-result-object v6

    invoke-virtual {v6, v4}, Linet/ipaddr/o$a;->n(Z)Linet/ipaddr/o$a;

    move-result-object v6

    invoke-virtual {v6, v7}, Linet/ipaddr/o$a;->r(Z)Linet/ipaddr/o$a;

    move-result-object v6

    invoke-virtual {v6, v4}, Linet/ipaddr/o$a;->o(Z)Linet/ipaddr/o$a;

    move-result-object v6

    invoke-virtual {v6, v4}, Linet/ipaddr/o$a;->s(Z)Linet/ipaddr/o$a;

    move-result-object v6

    invoke-virtual {v6}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v6

    invoke-direct {v5, p1, v6}, Linet/ipaddr/n;-><init>(Ljava/lang/String;Linet/ipaddr/o;)V

    invoke-virtual {v5}, Linet/ipaddr/n;->p()Linet/ipaddr/g;
    :try_end_0
    .catch Linet/ipaddr/AddressStringException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_0 .. :try_end_0} :catch_0

    return v7

    :catch_0
    move-exception v5

    goto :goto_0

    :catch_1
    move-exception v5

    goto :goto_1

    :goto_0
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return v4

    :goto_1
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return v4
.end method

.method private final B0(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v0

    const-string/jumbo v1, "host"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LD8/c;->j:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic q0(LD8/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LD8/c;->u0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r0(LD8/c;)Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;
    .locals 0

    invoke-direct {p0}, LD8/c;->v0()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LD8/c;)Li8/a;
    .locals 0

    invoke-direct {p0}, LD8/c;->w0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LD8/c;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, LD8/c;->y0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final u0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final v0()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;
    .locals 1

    iget-object v0, p0, LD8/c;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    return-object v0
.end method

.method private final w0()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/c;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final x0()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v0

    const-string/jumbo v1, "host"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method private final y0(Ljava/lang/String;)Z
    .locals 1

    invoke-direct {p0, p1}, LD8/c;->z0(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LD8/c;->A0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final z0(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Linet/ipaddr/e;

    new-instance v2, Linet/ipaddr/f$a;

    invoke-direct {v2}, Linet/ipaddr/f$a;-><init>()V

    invoke-virtual {v2, v0}, Linet/ipaddr/f$a;->j(Z)Linet/ipaddr/f$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Linet/ipaddr/f$a;->k(Z)Linet/ipaddr/f$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Linet/ipaddr/f$a;->l(Z)Linet/ipaddr/f$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/f$a;->n()Linet/ipaddr/f;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Linet/ipaddr/e;-><init>(Ljava/lang/String;Linet/ipaddr/f;)V

    invoke-virtual {v1}, Linet/ipaddr/e;->B()V
    :try_end_0
    .catch Linet/ipaddr/HostNameException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "NetworkHosts: invalid host `"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "`: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LD8/c;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 2

    invoke-super {p0}, Lye/g;->l0()V

    iget-object v0, p0, LD8/c;->j:LFg/a;

    invoke-direct {p0}, LD8/c;->x0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/c;->l:LLi/N;

    return-object v0
.end method

.method public o0(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LD8/c;->B0(Ljava/lang/String;)V

    return-void
.end method

.method public p0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LD8/c;->k:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LD8/c$b;

    invoke-direct {v2, p0}, LD8/c$b;-><init>(LD8/c;)V

    invoke-virtual {v1, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v2, LD8/c$c;

    invoke-direct {v2, p0}, LD8/c$c;-><init>(LD8/c;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
