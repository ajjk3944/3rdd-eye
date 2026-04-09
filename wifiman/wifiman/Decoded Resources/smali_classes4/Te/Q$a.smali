.class public final LTe/Q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/Q;->e(LTe/J;FFLT/l;I)Lx6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:F


# direct methods
.method constructor <init>(LTe/J;FF)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, LTe/J;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTe/H;

    invoke-virtual {v2}, LTe/H;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LTe/G;

    invoke-virtual {v4}, LTe/G;->a()F

    move-result v5

    invoke-virtual {v4}, LTe/G;->b()F

    move-result v4

    new-instance v6, Lx6/c;

    invoke-direct {v6, v5, v4}, Lx6/c;-><init>(FF)V

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LTe/J;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, LTe/J;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTe/K;

    new-instance v4, Lx6/c;

    invoke-virtual {v3}, LTe/K;->b()F

    move-result v5

    invoke-direct {v4, v5, p2}, Lx6/c;-><init>(FF)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lx6/c;

    invoke-virtual {v3}, LTe/K;->b()F

    move-result v5

    invoke-direct {v4, v5, p3}, Lx6/c;-><init>(FF)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lx6/c;

    invoke-virtual {v3}, LTe/K;->a()F

    move-result v5

    invoke-direct {v4, v5, p3}, Lx6/c;-><init>(FF)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lx6/c;

    invoke-virtual {v3}, LTe/K;->a()F

    move-result v3

    invoke-direct {v4, v3, p2}, Lx6/c;-><init>(FF)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    iput-object v0, p0, LTe/Q$a;->a:Ljava/util/List;

    invoke-virtual {p1}, LTe/J;->e()LTe/L;

    move-result-object v0

    invoke-virtual {v0}, LTe/L;->b()F

    move-result v0

    iput v0, p0, LTe/Q$a;->b:F

    invoke-virtual {p1}, LTe/J;->e()LTe/L;

    move-result-object p1

    invoke-virtual {p1}, LTe/L;->a()F

    move-result p1

    iput p1, p0, LTe/Q$a;->c:F

    iput p2, p0, LTe/Q$a;->d:F

    iput p3, p0, LTe/Q$a;->e:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, LTe/Q$a;->g:F

    iput p1, p0, LTe/Q$a;->h:F

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, LTe/Q$a;->e:F

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, LTe/Q$a;->c:F

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, LTe/Q$a;->d:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, LTe/Q$a;->h:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, LTe/Q$a;->b:F

    return v0
.end method

.method public f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LTe/Q$a;->a:Ljava/util/List;

    return-object v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, LTe/Q$a;->g:F

    return v0
.end method

.method public getId()I
    .locals 1

    invoke-static {p0}, Lx6/b$a;->a(Lx6/b;)I

    move-result v0

    return v0
.end method

.method public h()F
    .locals 1

    iget v0, p0, LTe/Q$a;->f:F

    return v0
.end method
