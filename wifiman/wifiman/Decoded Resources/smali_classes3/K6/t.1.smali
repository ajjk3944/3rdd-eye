.class public LK6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK6/o;


# instance fields
.field private final a:LO6/a;

.field final b:LK6/c$a;

.field final c:Lgg/y;


# direct methods
.method public constructor <init>(LO6/a;LK6/c$a;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/t;->a:LO6/a;

    iput-object p2, p0, LK6/t;->b:LK6/c$a;

    iput-object p3, p0, LK6/t;->c:Lgg/y;

    return-void
.end method

.method public static synthetic b(Ljava/util/Set;)V
    .locals 0

    invoke-static {p0}, LK6/t;->g(Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic c(Ljava/util/Set;Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, LK6/t;->f(Ljava/util/Set;Lhg/c;)V

    return-void
.end method

.method public static synthetic d(LK6/t;LG6/z;)Lgg/v;
    .locals 0

    invoke-direct {p0, p1}, LK6/t;->h(LG6/z;)Lgg/v;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f(Ljava/util/Set;Lhg/c;)V
    .locals 0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK6/n;

    invoke-interface {p1}, LK6/n;->c()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static synthetic g(Ljava/util/Set;)V
    .locals 1

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK6/n;

    invoke-interface {v0}, LK6/n;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private synthetic h(LG6/z;)Lgg/v;
    .locals 3

    iget-object v0, p0, LK6/t;->b:LK6/c$a;

    iget-boolean v1, p1, LG6/z;->a:Z

    invoke-interface {v0, v1}, LK6/c$a;->b(Z)LK6/c$a;

    move-result-object v0

    iget-boolean v1, p1, LG6/z;->b:Z

    invoke-interface {v0, v1}, LK6/c$a;->c(Z)LK6/c$a;

    move-result-object v0

    iget-object p1, p1, LG6/z;->c:LG6/S;

    invoke-interface {v0, p1}, LK6/c$a;->d(LG6/S;)LK6/c$a;

    move-result-object p1

    invoke-interface {p1}, LK6/c$a;->a()LK6/c;

    move-result-object p1

    invoke-interface {p1}, LK6/c;->a()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, LK6/t;->j(LK6/c;)Lgg/s;

    move-result-object v1

    invoke-static {p1}, LK6/t;->i(LK6/c;)Lgg/s;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/s;->m0(Lgg/v;)Lgg/s;

    move-result-object v1

    invoke-virtual {p0, p1}, LK6/t;->e(LK6/c;)Lgg/s;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgg/s;->u(Lgg/v;)Lgg/s;

    move-result-object p1

    new-instance v1, LK6/q;

    invoke-direct {v1, v0}, LK6/q;-><init>(Ljava/util/Set;)V

    invoke-virtual {p1, v1}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object p1

    new-instance v1, LK6/r;

    invoke-direct {v1, v0}, LK6/r;-><init>(Ljava/util/Set;)V

    invoke-virtual {p1, v1}, Lgg/s;->y(Lkg/a;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, LK6/t;->c:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, LK6/t;->c:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/s;->e1(Lgg/y;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method static i(LK6/c;)Lgg/s;
    .locals 0

    invoke-interface {p0}, LK6/c;->c()LK6/l0;

    move-result-object p0

    invoke-virtual {p0}, LK6/l0;->k()Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method static j(LK6/c;)Lgg/s;
    .locals 1

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LK6/s;

    invoke-direct {v0, p0}, LK6/s;-><init>(LK6/c;)V

    invoke-static {v0}, Lgg/s;->b0(Ljava/util/concurrent/Callable;)Lgg/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LG6/z;)Lgg/s;
    .locals 1

    new-instance v0, LK6/p;

    invoke-direct {v0, p0, p1}, LK6/p;-><init>(LK6/t;LG6/z;)V

    invoke-static {v0}, Lgg/s;->r(Lkg/q;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method e(LK6/c;)Lgg/s;
    .locals 1

    iget-object v0, p0, LK6/t;->a:LO6/a;

    invoke-interface {p1}, LK6/c;->b()LM6/c;

    move-result-object p1

    invoke-interface {v0, p1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
