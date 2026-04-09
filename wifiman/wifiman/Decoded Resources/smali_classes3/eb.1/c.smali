.class public abstract Leb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/g;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LGb/f;

.field private final c:LYg/m;

.field private final d:LYg/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;LGb/f;Leb/g$b;)V
    .locals 0

    const-string/jumbo p3, "storage"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/c;->a:Ljava/lang/String;

    iput-object p2, p0, Leb/c;->b:LGb/f;

    new-instance p1, Leb/a;

    invoke-direct {p1, p0}, Leb/a;-><init>(Leb/c;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Leb/c;->c:LYg/m;

    new-instance p1, Leb/b;

    invoke-direct {p1, p0}, Leb/b;-><init>(Leb/c;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Leb/c;->d:LYg/m;

    return-void
.end method

.method public static synthetic d(Leb/c;)Lgg/i;
    .locals 0

    invoke-static {p0}, Leb/c;->p(Leb/c;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Leb/c;)Lgg/z;
    .locals 0

    invoke-static {p0}, Leb/c;->i(Leb/c;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Leb/c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Leb/c;->h(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic g(Leb/c;Lgb/k;)V
    .locals 0

    invoke-direct {p0, p1}, Leb/c;->o(Lgb/k;)V

    return-void
.end method

.method private final h(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Leb/c;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Leb/c;->b:LGb/f;

    invoke-interface {v1, v0, p1}, LGb/f;->F(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final i(Leb/c;)Lgg/z;
    .locals 0

    invoke-direct {p0}, Leb/c;->n()Lgg/z;

    move-result-object p0

    invoke-static {p0}, Lvb/d;->a(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final n()Lgg/z;
    .locals 2

    invoke-interface {p0}, Leb/g;->b()Lgg/z;

    move-result-object v0

    sget-object v1, Leb/c$e;->a:Leb/c$e;

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Leb/c$f;->a:Leb/c$f;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Leb/c$g;

    invoke-direct {v1, p0}, Leb/c$g;-><init>(Leb/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, Leb/c$h;->a:Leb/c$h;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Leb/c$i;

    invoke-direct {v1, p0}, Leb/c$i;-><init>(Leb/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "doOnSuccess(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final o(Lgb/k;)V
    .locals 2

    iget-object v0, p0, Leb/c;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lgb/k;->f()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Leb/c;->b:LGb/f;

    invoke-interface {v1, v0, p1}, LGb/f;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final p(Leb/c;)Lgg/i;
    .locals 1

    invoke-interface {p0}, Leb/g;->b()Lgg/z;

    move-result-object p0

    sget-object v0, Leb/c$j;->a:Leb/c$j;

    invoke-virtual {p0, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p0

    sget-object v0, Leb/c$k;->a:Leb/c$k;

    invoke-virtual {p0, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0}, Lgg/i;->h1()Ljg/a;

    move-result-object p0

    invoke-virtual {p0}, Ljg/a;->i2()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method protected final j()Lgg/z;
    .locals 2

    invoke-virtual {p0}, Leb/c;->k()Lgg/z;

    move-result-object v0

    sget-object v1, Leb/c$a;->a:Leb/c$a;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Leb/c$b;->a:Leb/c$b;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public k()Lgg/z;
    .locals 1

    invoke-direct {p0}, Leb/c;->n()Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public l()Lgg/z;
    .locals 2

    invoke-interface {p0}, Leb/g;->b()Lgg/z;

    move-result-object v0

    sget-object v1, Leb/c$c;->a:Leb/c$c;

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Leb/c$d;->a:Leb/c$d;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method protected final m(Leb/g$a;)V
    .locals 1

    const-string/jumbo v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
