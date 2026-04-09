.class public Lf2/u;
.super Lf2/s;
.source "SourceFile"


# instance fields
.field private final h:Lf2/E;

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Lth/d;

.field private l:Ljava/lang/Object;

.field private final m:Ljava/util/List;


# direct methods
.method public constructor <init>(Lf2/E;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDestination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lf2/v;

    invoke-virtual {p1, v0}, Lf2/E;->d(Ljava/lang/Class;)Lf2/D;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lf2/s;-><init>(Lf2/D;Ljava/lang/String;)V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lf2/u;->m:Ljava/util/List;

    iput-object p1, p0, Lf2/u;->h:Lf2/E;

    iput-object p2, p0, Lf2/u;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Lf2/r;
    .locals 1

    invoke-virtual {p0}, Lf2/u;->f()Lf2/t;

    move-result-object v0

    return-object v0
.end method

.method public f()Lf2/t;
    .locals 3

    invoke-super {p0}, Lf2/s;->b()Lf2/r;

    move-result-object v0

    check-cast v0, Lf2/t;

    iget-object v1, p0, Lf2/u;->m:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Lf2/t;->M(Ljava/util/Collection;)V

    iget v1, p0, Lf2/u;->i:I

    if-nez v1, :cond_1

    iget-object v2, p0, Lf2/u;->j:Ljava/lang/String;

    if-nez v2, :cond_1

    iget-object v2, p0, Lf2/u;->k:Lth/d;

    if-nez v2, :cond_1

    iget-object v2, p0, Lf2/u;->l:Ljava/lang/Object;

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lf2/s;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must set a start destination route"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must set a start destination id"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, p0, Lf2/u;->j:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lf2/t;->c0(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lf2/u;->k:Lth/d;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v2}, LVi/w;->d(Lth/d;)LVi/b;

    move-result-object v1

    sget-object v2, Lf2/u$a;->a:Lf2/u$a;

    invoke-virtual {v0, v1, v2}, Lf2/t;->a0(LVi/b;Lmh/l;)V

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lf2/u;->l:Ljava/lang/Object;

    if-eqz v2, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lf2/t;->b0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0, v1}, Lf2/t;->Z(I)V

    :goto_0
    return-object v0
.end method

.method public final g(Lf2/s;)V
    .locals 1

    const-string v0, "navDestination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/u;->m:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lf2/s;->b()Lf2/r;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h()Lf2/E;
    .locals 1

    iget-object v0, p0, Lf2/u;->h:Lf2/E;

    return-object v0
.end method
