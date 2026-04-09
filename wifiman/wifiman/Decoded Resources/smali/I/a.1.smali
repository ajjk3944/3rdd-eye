.class public final LI/a;
.super LI/N0;
.source "SourceFile"


# instance fields
.field private b:LIi/y0;

.field private c:LI/P0;

.field private d:LLi/y;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LI/N0;-><init>()V

    return-void
.end method

.method public static final synthetic m(LI/a;)LLi/y;
    .locals 0

    invoke-direct {p0}, LI/a;->p()LLi/y;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LI/a;LI/P0;)V
    .locals 0

    iput-object p1, p0, LI/a;->c:LI/P0;

    return-void
.end method

.method public static final synthetic o(LI/N0$a;[F)V
    .locals 0

    invoke-static {p0, p1}, LI/a;->r(LI/N0$a;[F)V

    return-void
.end method

.method private final p()LLi/y;
    .locals 5

    iget-object v0, p0, LI/a;->d:LLi/y;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, LG/c;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v0, LKi/a;->DROP_LATEST:LKi/a;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v2, v1}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object v0

    iput-object v0, p0, LI/a;->d:LLi/y;

    return-object v0
.end method

.method private final q(Lmh/l;)V
    .locals 3

    invoke-virtual {p0}, LI/N0;->i()LI/N0$a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, LI/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v0, v2}, LI/a$b;-><init>(Lmh/l;LI/a;LI/N0$a;Ldh/e;)V

    invoke-interface {v0, v1}, LI/N0$a;->U0(Lmh/p;)LIi/y0;

    move-result-object p1

    iput-object p1, p0, LI/a;->b:LIi/y0;

    return-void
.end method

.method private static final r(LI/N0$a;[F)V
    .locals 1

    invoke-interface {p0}, LI/N0$a;->o1()LC0/r;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, LC0/r;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0, p1}, LC0/r;->O([F)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public a(LR0/Q;LR0/s;Lmh/l;Lmh/l;)V
    .locals 7

    new-instance v6, LI/a$a;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LI/a$a;-><init>(LR0/Q;LI/a;LR0/s;Lmh/l;Lmh/l;)V

    invoke-direct {p0, v6}, LI/a;->q(Lmh/l;)V

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LI/a;->q(Lmh/l;)V

    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, LI/a;->b:LIi/y0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, LI/a;->b:LIi/y0;

    invoke-direct {p0}, LI/a;->p()LLi/y;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LLi/y;->h()V

    :cond_1
    return-void
.end method

.method public e(LR0/Q;LR0/H;LL0/M;Lmh/l;Ll0/i;Ll0/i;)V
    .locals 6

    iget-object v0, p0, LI/a;->c:LI/P0;

    if-eqz v0, :cond_0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, LI/P0;->n(LR0/Q;LR0/H;LL0/M;Ll0/i;Ll0/i;)V

    :cond_0
    return-void
.end method

.method public f(LR0/Q;LR0/Q;)V
    .locals 1

    iget-object v0, p0, LI/a;->c:LI/P0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LI/P0;->m(LR0/Q;LR0/Q;)V

    :cond_0
    return-void
.end method

.method public h(Ll0/i;)V
    .locals 1

    iget-object v0, p0, LI/a;->c:LI/P0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LI/P0;->j(Ll0/i;)V

    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    invoke-direct {p0}, LI/a;->p()LLi/y;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
