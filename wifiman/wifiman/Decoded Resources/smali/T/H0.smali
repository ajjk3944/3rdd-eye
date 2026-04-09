.class public abstract LT/H0;
.super LT/u;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LT/u;-><init>(Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private final f(LT/I0;)LT/F1;
    .locals 2

    invoke-virtual {p1}, LT/I0;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, LT/N;

    invoke-virtual {p1}, LT/I0;->f()LT/q0;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, LT/I0;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, LT/I0;->e()LT/n1;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object p1

    :cond_0
    invoke-static {v1, p1}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v1

    :cond_1
    invoke-direct {v0, v1}, LT/N;-><init>(LT/q0;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LT/I0;->c()Lmh/l;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, LT/D;

    invoke-virtual {p1}, LT/I0;->c()Lmh/l;

    move-result-object p1

    invoke-direct {v0, p1}, LT/D;-><init>(Lmh/l;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, LT/I0;->f()LT/q0;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v0, LT/N;

    invoke-virtual {p1}, LT/I0;->f()LT/q0;

    move-result-object p1

    invoke-direct {v0, p1}, LT/N;-><init>(LT/q0;)V

    goto :goto_0

    :cond_4
    new-instance v0, LT/B1;

    invoke-virtual {p1}, LT/I0;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, LT/B1;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method


# virtual methods
.method public b(LT/I0;LT/F1;)LT/F1;
    .locals 3

    instance-of v0, p2, LT/N;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LT/I0;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v1, p2

    check-cast v1, LT/N;

    invoke-virtual {v1}, LT/N;->b()LT/q0;

    move-result-object p2

    invoke-virtual {p1}, LT/I0;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0}, LT/q0;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, LT/B1;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LT/I0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LT/I0;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast p2, LT/B1;

    invoke-virtual {p2}, LT/B1;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    move-object v1, p2

    goto :goto_1

    :cond_1
    instance-of v0, p2, LT/D;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LT/I0;->c()Lmh/l;

    move-result-object v0

    check-cast p2, LT/D;

    invoke-virtual {p2}, LT/D;->b()Lmh/l;

    move-result-object v2

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    invoke-direct {p0, p1}, LT/H0;->f(LT/I0;)LT/F1;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method public abstract c(Ljava/lang/Object;)LT/I0;
.end method

.method public final d(Ljava/lang/Object;)LT/I0;
    .locals 0

    invoke-virtual {p0, p1}, LT/H0;->c(Ljava/lang/Object;)LT/I0;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Object;)LT/I0;
    .locals 0

    invoke-virtual {p0, p1}, LT/H0;->c(Ljava/lang/Object;)LT/I0;

    move-result-object p1

    invoke-virtual {p1}, LT/I0;->h()LT/I0;

    move-result-object p1

    return-object p1
.end method
