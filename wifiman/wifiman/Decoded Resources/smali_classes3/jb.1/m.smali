.class public final Ljb/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/i;


# instance fields
.field private final a:LGb/f;

.field private final b:LYg/m;

.field private final c:LYg/m;


# direct methods
.method public constructor <init>(Ldb/a;LGb/f;)V
    .locals 1

    const-string/jumbo v0, "configClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ucoreStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ljb/m;->a:LGb/f;

    new-instance p2, Ljb/k;

    invoke-direct {p2, p1, p0}, Ljb/k;-><init>(Ldb/a;Ljb/m;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ljb/m;->b:LYg/m;

    new-instance p1, Ljb/l;

    invoke-direct {p1, p0}, Ljb/l;-><init>(Ljb/m;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ljb/m;->c:LYg/m;

    return-void
.end method

.method public static synthetic a(Ldb/a;Ljb/m;)Lgg/n;
    .locals 0

    invoke-static {p0, p1}, Ljb/m;->h(Ldb/a;Ljb/m;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb/m;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ljb/m;->j(Ljb/m;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb/m;)Lgg/z;
    .locals 0

    invoke-static {p0}, Ljb/m;->g(Ljb/m;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ljb/m;Llb/o;)V
    .locals 0

    invoke-direct {p0, p1}, Ljb/m;->f(Llb/o;)V

    return-void
.end method

.method private final f(Llb/o;)V
    .locals 3

    iget-object v0, p0, Ljb/m;->a:LGb/f;

    sget-object v1, Lub/c;->a:Lub/c;

    invoke-virtual {v1}, Lub/c;->d()Laj/b;

    move-result-object v1

    invoke-virtual {v1}, Laj/b;->a()Lcj/e;

    sget-object v2, Llb/o;->Companion:Llb/o$b;

    invoke-virtual {v2}, Llb/o$b;->serializer()LVi/b;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Laj/b;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LGb/f;->t(Ljava/lang/String;)V

    return-void
.end method

.method private static final g(Ljb/m;)Lgg/z;
    .locals 1

    invoke-direct {p0}, Ljb/m;->k()Lgg/n;

    move-result-object v0

    invoke-direct {p0}, Ljb/m;->i()Lgg/n;

    move-result-object p0

    invoke-static {v0, p0}, Lgg/n;->r(Lgg/r;Lgg/r;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0}, Lgg/i;->o0()Lgg/z;

    move-result-object p0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p0

    const-string/jumbo v0, "subscribeOn(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final h(Ldb/a;Ljb/m;)Lgg/n;
    .locals 1

    invoke-virtual {p0}, Ldb/a;->a()Lgg/z;

    move-result-object p0

    new-instance v0, Ljb/m$a;

    invoke-direct {v0, p1}, Ljb/m$a;-><init>(Ljb/m;)V

    invoke-virtual {p0, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p0

    const-string/jumbo p1, "doOnSuccess(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvb/d;->a(Lgg/z;)Lgg/z;

    move-result-object p0

    invoke-virtual {p0}, Lgg/z;->X()Lgg/n;

    move-result-object p0

    const-string/jumbo p1, "toMaybe(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final i()Lgg/n;
    .locals 2

    new-instance v0, Ljb/j;

    invoke-direct {v0, p0}, Ljb/j;-><init>(Ljb/m;)V

    invoke-static {v0}, Lgg/n;->m(Ljava/util/concurrent/Callable;)Lgg/n;

    move-result-object v0

    sget-object v1, Ljb/m$b;->a:Ljb/m$b;

    invoke-virtual {v0, v1}, Lgg/n;->p(Lkg/n;)Lgg/n;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final j(Ljb/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ljb/m;->a:LGb/f;

    invoke-interface {p0}, LGb/f;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final k()Lgg/n;
    .locals 1

    iget-object v0, p0, Ljb/m;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/n;

    return-object v0
.end method


# virtual methods
.method public e()Lgg/z;
    .locals 1

    iget-object v0, p0, Ljb/m;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/z;

    return-object v0
.end method
