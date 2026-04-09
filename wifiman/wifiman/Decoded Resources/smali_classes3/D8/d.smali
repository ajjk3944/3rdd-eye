.class public final LD8/d;
.super Lbf/k;
.source "SourceFile"


# static fields
.field static final synthetic q:[Lth/l;

.field public static final r:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LFg/a;

.field private final m:Lgg/i;

.field private final n:Ls9/b;

.field private final o:LLi/N;

.field private final p:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/d;

    const-string/jumbo v2, "favoriteHostsManager"

    const-string/jumbo v3, "getFavoriteHostsManager()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "topologyService"

    const-string/jumbo v5, "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "viewRouter"

    const-string/jumbo v6, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "toastService"

    const-string/jumbo v7, "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

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

    sput-object v5, LD8/d;->q:[Lth/l;

    const/16 v0, 0x8

    sput v0, LD8/d;->r:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lbf/k;-><init>()V

    iput-object p1, p0, LD8/d;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LD8/d$l;

    invoke-direct {v0}, LD8/d$l;-><init>()V

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

    sget-object v2, LD8/d;->q:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/d;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LD8/d$m;

    invoke-direct {v4}, LD8/d$m;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Ljd/b;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x1

    aget-object v5, v2, v4

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/d;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LD8/d$n;

    invoke-direct {v5}, LD8/d$n;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Li8/a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x2

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/d;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LD8/d$o;

    invoke-direct {v5}, LD8/d$o;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lhc/b;

    invoke-direct {p1, v5, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/d;->k:LYg/m;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/d;->l:LFg/a;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0, v3, v4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/d;->m:Lgg/i;

    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->B()Ls9/b;

    move-result-object v0

    iput-object v0, p0, LD8/d;->n:Ls9/b;

    invoke-direct {p0}, LD8/d;->x0()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;->c()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LD8/d;->z0()Ljd/b;

    move-result-object v1

    invoke-interface {v1}, Ljd/b;->d()Lgg/i;

    move-result-object v1

    new-instance v2, LD8/d$a;

    invoke-direct {v2, p0}, LD8/d$a;-><init>(LD8/d;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    sget-object v1, LD8/d$b;->a:LD8/d$b;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lbf/k$a;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Lbf/k$a;-><init>(Ljava/util/List;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LD8/d;->o:LLi/N;

    sget-object v1, LD8/d$c;->a:LD8/d$c;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lbf/j;->DEFAULT:Lbf/j;

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LD8/d;->p:LLi/N;

    return-void
.end method

.method private final A0()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/d;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method public static final synthetic t0(LD8/d;)Ls9/b;
    .locals 0

    iget-object p0, p0, LD8/d;->n:Ls9/b;

    return-object p0
.end method

.method public static final synthetic u0(LD8/d;)Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;
    .locals 0

    invoke-direct {p0}, LD8/d;->x0()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(LD8/d;)Lhc/b;
    .locals 0

    invoke-direct {p0}, LD8/d;->y0()Lhc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(LD8/d;)LFg/a;
    .locals 0

    iget-object p0, p0, LD8/d;->l:LFg/a;

    return-object p0
.end method

.method private final x0()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;
    .locals 1

    iget-object v0, p0, LD8/d;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    return-object v0
.end method

.method private final y0()Lhc/b;
    .locals 1

    iget-object v0, p0, LD8/d;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhc/b;

    return-object v0
.end method

.method private final z0()Ljd/b;
    .locals 1

    iget-object v0, p0, LD8/d;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/b;

    return-object v0
.end method


# virtual methods
.method public C()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/d;->p:LLi/N;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LD8/d;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/d;->o:LLi/N;

    return-object v0
.end method

.method public o0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/d;->A0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/i;->a:Li8/i;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public p0(Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, LD8/d$d;

    invoke-direct {v1, p1}, LD8/d$d;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object v1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LD8/d$e;

    invoke-direct {v2, p0}, LD8/d$e;-><init>(LD8/d;)V

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v1

    new-instance v2, LD8/d$f;

    invoke-direct {v2, p1, p0}, LD8/d$f;-><init>(Ljava/lang/String;LD8/d;)V

    invoke-virtual {v1, v2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "onErrorResumeNext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public q0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, LD8/d$g;

    invoke-direct {v1, p0}, LD8/d$g;-><init>(LD8/d;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public r0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, LD8/d$h;

    invoke-direct {v1, p0}, LD8/d$h;-><init>(LD8/d;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public s0(Ljava/lang/String;I)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, LD8/d$i;

    invoke-direct {v1, p1}, LD8/d$i;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LD8/d$j;

    invoke-direct {v1, p0, p2}, LD8/d$j;-><init>(LD8/d;I)V

    invoke-virtual {p1, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance p2, LD8/d$k;

    invoke-direct {p2, p0}, LD8/d$k;-><init>(LD8/d;)V

    invoke-virtual {p1, p2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "onErrorResumeNext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
