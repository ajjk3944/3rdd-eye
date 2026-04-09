.class final LB/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/L;
.implements LC0/L$a;
.implements LB/E$a;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LB/E;

.field private final c:LT/n0;

.field private final d:LT/n0;

.field private final e:LT/q0;

.field private final f:LT/q0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LB/E;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB/C;->a:Ljava/lang/Object;

    iput-object p2, p0, LB/C;->b:LB/E;

    const/4 p1, -0x1

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p1

    iput-object p1, p0, LB/C;->c:LT/n0;

    const/4 p1, 0x0

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p1

    iput-object p1, p0, LB/C;->d:LT/n0;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LB/C;->e:LT/q0;

    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LB/C;->f:LT/q0;

    return-void
.end method

.method private final b()LC0/L$a;
    .locals 1

    iget-object v0, p0, LB/C;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/L$a;

    return-object v0
.end method

.method private final d()I
    .locals 1

    iget-object v0, p0, LB/C;->d:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method private final e()LC0/L;
    .locals 1

    iget-object v0, p0, LB/C;->f:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/L;

    return-object v0
.end method

.method private final h(LC0/L$a;)V
    .locals 1

    iget-object v0, p0, LB/C;->e:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final j(I)V
    .locals 1

    iget-object v0, p0, LB/C;->d:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method private final k(LC0/L;)V
    .locals 1

    iget-object v0, p0, LB/C;->f:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()LC0/L$a;
    .locals 1

    invoke-direct {p0}, LB/C;->d()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LB/C;->b:LB/E;

    invoke-virtual {v0, p0}, LB/E;->j(LB/E$a;)V

    invoke-virtual {p0}, LB/C;->c()LC0/L;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC0/L;->a()LC0/L$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, LB/C;->h(LC0/L$a;)V

    :cond_1
    invoke-direct {p0}, LB/C;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, LB/C;->j(I)V

    return-object p0
.end method

.method public final c()LC0/L;
    .locals 1

    invoke-direct {p0}, LB/C;->e()LC0/L;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 2

    invoke-direct {p0}, LB/C;->d()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0}, LB/C;->release()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public g(I)V
    .locals 1

    iget-object v0, p0, LB/C;->c:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method public getIndex()I
    .locals 1

    iget-object v0, p0, LB/C;->c:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB/C;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final i(LC0/L;)V
    .locals 6

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    :try_start_0
    invoke-direct {p0}, LB/C;->e()LC0/L;

    move-result-object v5

    if-eq p1, v5, :cond_3

    invoke-direct {p0, p1}, LB/C;->k(LC0/L;)V

    invoke-direct {p0}, LB/C;->d()I

    move-result v5

    if-lez v5, :cond_3

    invoke-direct {p0}, LB/C;->b()LC0/L$a;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v5}, LC0/L$a;->release()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, LC0/L;->a()LC0/L$a;

    move-result-object v2

    :cond_2
    invoke-direct {p0, v2}, LB/C;->h(LC0/L$a;)V

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v4, v3}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    return-void

    :goto_2
    invoke-virtual {v0, v1, v4, v3}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1
.end method

.method public release()V
    .locals 2

    invoke-direct {p0}, LB/C;->d()I

    move-result v0

    if-lez v0, :cond_2

    invoke-direct {p0}, LB/C;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, LB/C;->j(I)V

    invoke-direct {p0}, LB/C;->d()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LB/C;->b:LB/E;

    invoke-virtual {v0, p0}, LB/E;->k(LB/E$a;)V

    invoke-direct {p0}, LB/C;->b()LC0/L$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC0/L$a;->release()V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, LB/C;->h(LC0/L$a;)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Release should only be called once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
