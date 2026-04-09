.class public final Lp8/f;
.super Lcom/ui/wifiman/ui/discovery/prefs/lan/d;
.source "SourceFile"


# static fields
.field static final synthetic k:[Lth/l;

.field public static final l:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LLi/N;

.field private final j:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getConfigManager()Lcom/ui/wifiman/model/ui/DiscoveryLanListConfigManager;"

    const/4 v2, 0x0

    const-class v3, Lp8/f;

    const-string/jumbo v4, "configManager"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lp8/f;->k:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lp8/f;->l:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 9

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/discovery/prefs/lan/d;-><init>()V

    iput-object p1, p0, Lp8/f;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lp8/f$b;

    invoke-direct {v0}, Lp8/f$b;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lde/w;

    invoke-direct {p1, v0, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v0, Lp8/f;->k:[Lth/l;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/f;->h:LYg/m;

    invoke-direct {p0}, Lp8/f;->t0()Lde/w;

    move-result-object p1

    invoke-interface {p1}, Lee/c;->b()Lgg/i;

    move-result-object p1

    sget-object v0, Lp8/f$c;->a:Lp8/f$c;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    const-string/jumbo p1, "distinctUntilChanged(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, Lp8/f;->i:LLi/N;

    invoke-direct {p0}, Lp8/f;->t0()Lde/w;

    move-result-object v0

    invoke-interface {v0}, Lee/c;->b()Lgg/i;

    move-result-object v0

    sget-object v2, Lp8/f$a;->a:Lp8/f$a;

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ui/wifiman/ui/discovery/prefs/lan/c$a;

    invoke-direct {p1, v1}, Lcom/ui/wifiman/ui/discovery/prefs/lan/c$a;-><init>(Z)V

    new-instance v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/c$b;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/ui/discovery/prefs/lan/c$b;-><init>(Z)V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/ui/wifiman/ui/discovery/prefs/lan/c;

    aput-object p1, v2, v1

    const/4 p1, 0x1

    aput-object v0, v2, p1

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v4

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lp8/f;->j:LLi/N;

    return-void
.end method

.method public static synthetic r0(Lcom/ui/wifiman/ui/discovery/prefs/lan/c;Lde/v;)Lde/v;
    .locals 0

    invoke-static {p0, p1}, Lp8/f;->u0(Lcom/ui/wifiman/ui/discovery/prefs/lan/c;Lde/v;)Lde/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(ZLde/v;)Lde/v;
    .locals 0

    invoke-static {p0, p1}, Lp8/f;->v0(ZLde/v;)Lde/v;

    move-result-object p0

    return-object p0
.end method

.method private final t0()Lde/w;
    .locals 1

    iget-object v0, p0, Lp8/f;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/w;

    return-object v0
.end method

.method private static final u0(Lcom/ui/wifiman/ui/discovery/prefs/lan/c;Lde/v;)Lde/v;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/ui/wifiman/ui/discovery/prefs/lan/c$a;

    if-eqz v0, :cond_0

    sget-object p0, Lfc/b;->IP:Lfc/b;

    goto :goto_0

    :cond_0
    instance-of p0, p0, Lcom/ui/wifiman/ui/discovery/prefs/lan/c$b;

    if-eqz p0, :cond_1

    sget-object p0, Lfc/b;->NAME:Lfc/b;

    :goto_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p0, v2, v0, v1}, Lde/v;->b(Lde/v;Lfc/b;ZILjava/lang/Object;)Lde/v;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final v0(ZLde/v;)Lde/v;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, p0, v1, v0}, Lde/v;->b(Lde/v;Lfc/b;ZILjava/lang/Object;)Lde/v;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lp8/f;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lp8/f;->j:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, Lp8/f;->i:LLi/N;

    return-object v0
.end method

.method public p0(Lcom/ui/wifiman/ui/discovery/prefs/lan/c;)V
    .locals 3

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lp8/f;->t0()Lde/w;

    move-result-object v1

    new-instance v2, Lp8/d;

    invoke-direct {v2, p1}, Lp8/d;-><init>(Lcom/ui/wifiman/ui/discovery/prefs/lan/c;)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public q0(Z)V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lp8/f;->t0()Lde/w;

    move-result-object v1

    new-instance v2, Lp8/e;

    invoke-direct {v2, p1}, Lp8/e;-><init>(Z)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
