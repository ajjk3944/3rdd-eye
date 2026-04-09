.class public Lf2/t;
.super Lf2/r;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/t$a;
    }
.end annotation


# static fields
.field public static final q:Lf2/t$a;


# instance fields
.field private final m:Lo/W;

.field private n:I

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf2/t;->q:Lf2/t$a;

    return-void
.end method

.method public constructor <init>(Lf2/D;)V
    .locals 3

    const-string v0, "navGraphNavigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lf2/r;-><init>(Lf2/D;)V

    new-instance p1, Lo/W;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, v2, v0, v1}, Lo/W;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lf2/t;->m:Lo/W;

    return-void
.end method

.method public static synthetic S(Lf2/t;ILf2/r;ZLf2/r;ILjava/lang/Object;)Lf2/r;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lf2/t;->R(ILf2/r;ZLf2/r;)Lf2/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: findNodeComprehensive"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final e0(I)V
    .locals 2

    invoke-virtual {p0}, Lf2/r;->s()I

    move-result v0

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lf2/t;->p:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, v1}, Lf2/t;->g0(Ljava/lang/String;)V

    :cond_0
    iput p1, p0, Lf2/t;->n:I

    iput-object v1, p0, Lf2/t;->o:Ljava/lang/String;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Start destination "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " cannot use the same id as the graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final g0(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf2/r;->w()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lf2/r;->k:Lf2/r$a;

    invoke-virtual {v0, p1}, Lf2/r$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    iput v0, p0, Lf2/t;->n:I

    iput-object p1, p0, Lf2/t;->p:Ljava/lang/String;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot have an empty start destination route"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Start destination "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot use the same route as the graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final L(Lf2/r;)V
    .locals 4

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf2/r;->s()I

    move-result v0

    invoke-virtual {p1}, Lf2/r;->w()Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lf2/r;->w()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Destination "

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lf2/r;->w()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot have the same route as graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lf2/r;->s()I

    move-result v1

    if-eq v0, v1, :cond_7

    iget-object v1, p0, Lf2/t;->m:Lo/W;

    invoke-virtual {v1, v0}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/r;

    if-ne v0, p1, :cond_4

    return-void

    :cond_4
    invoke-virtual {p1}, Lf2/r;->v()Lf2/t;

    move-result-object v1

    if-nez v1, :cond_6

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lf2/r;->H(Lf2/t;)V

    :cond_5
    invoke-virtual {p1, p0}, Lf2/r;->H(Lf2/t;)V

    iget-object v0, p0, Lf2/t;->m:Lo/W;

    invoke-virtual {p1}, Lf2/r;->s()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lo/W;->l(ILjava/lang/Object;)V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot have the same id as graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final M(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "nodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/r;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lf2/t;->L(Lf2/r;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final N(I)Lf2/r;
    .locals 7

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p0

    invoke-static/range {v0 .. v6}, Lf2/t;->S(Lf2/t;ILf2/r;ZLf2/r;ILjava/lang/Object;)Lf2/r;

    move-result-object p1

    return-object p1
.end method

.method public final O(Ljava/lang/String;)Lf2/r;
    .locals 1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lf2/t;->Q(Ljava/lang/String;Z)Lf2/r;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final Q(Ljava/lang/String;Z)Lf2/r;
    .locals 7

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/t;->m:Lo/W;

    invoke-static {v0}, Lo/Y;->b(Lo/W;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object v0

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lf2/r;

    invoke-virtual {v3}, Lf2/r;->w()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v4, p1, v5, v6, v2}, Lkotlin/text/t;->D(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3, p1}, Lf2/r;->A(Ljava/lang/String;)Lf2/r$b;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :cond_2
    :goto_0
    check-cast v1, Lf2/r;

    if-nez v1, :cond_3

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lf2/r;->v()Lf2/t;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lf2/r;->v()Lf2/t;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Lf2/t;->O(Ljava/lang/String;)Lf2/r;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v1

    :cond_4
    :goto_1
    return-object v2
.end method

.method public final R(ILf2/r;ZLf2/r;)Lf2/r;
    .locals 4

    iget-object v0, p0, Lf2/t;->m:Lo/W;

    invoke-virtual {v0, p1}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/r;

    const/4 v1, 0x0

    if-eqz p4, :cond_1

    invoke-static {v0, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lf2/r;->v()Lf2/t;

    move-result-object v2

    invoke-virtual {p4}, Lf2/r;->v()Lf2/t;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    if-eqz p3, :cond_6

    iget-object v0, p0, Lf2/t;->m:Lo/W;

    invoke-static {v0}, Lo/Y;->b(Lo/W;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object v0

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/r;

    instance-of v3, v2, Lf2/t;

    if-eqz v3, :cond_4

    invoke-static {v2, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    check-cast v2, Lf2/t;

    const/4 v3, 0x1

    invoke-virtual {v2, p1, p0, v3, p4}, Lf2/t;->R(ILf2/r;ZLf2/r;)Lf2/r;

    move-result-object v2

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_3

    move-object v0, v2

    goto :goto_2

    :cond_5
    move-object v0, v1

    :cond_6
    :goto_2
    if-nez v0, :cond_7

    invoke-virtual {p0}, Lf2/r;->v()Lf2/t;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lf2/r;->v()Lf2/t;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    invoke-virtual {p0}, Lf2/r;->v()Lf2/t;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2, p1, p0, p3, p4}, Lf2/t;->R(ILf2/r;ZLf2/r;)Lf2/r;

    move-result-object v1

    goto :goto_3

    :cond_7
    move-object v1, v0

    :cond_8
    :goto_3
    return-object v1
.end method

.method public final T()Lo/W;
    .locals 1

    iget-object v0, p0, Lf2/t;->m:Lo/W;

    return-object v0
.end method

.method public final U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/t;->o:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/t;->p:Ljava/lang/String;

    if-nez v0, :cond_0

    iget v0, p0, Lf2/t;->n:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Lf2/t;->o:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lf2/t;->o:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final V()I
    .locals 1

    iget v0, p0, Lf2/t;->n:I

    return v0
.end method

.method public final W()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/t;->p:Ljava/lang/String;

    return-object v0
.end method

.method public final X(Lf2/q;ZZLf2/r;)Lf2/r$b;
    .locals 6

    const-string v0, "navDeepLinkRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastVisited"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf2/r;->z(Lf2/q;)Lf2/r$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf2/r;

    invoke-static {v4, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4, p1}, Lf2/r;->z(Lf2/q;)Lf2/r$b;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz v4, :cond_0

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v2}, LZg/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Lf2/r$b;

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    invoke-virtual {p0}, Lf2/r;->v()Lf2/t;

    move-result-object v3

    if-eqz v3, :cond_4

    if-eqz p3, :cond_4

    invoke-static {v3, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    const/4 p3, 0x1

    invoke-virtual {v3, p1, p2, p3, p0}, Lf2/t;->X(Lf2/q;ZZLf2/r;)Lf2/r$b;

    move-result-object v1

    :cond_4
    filled-new-array {v0, v2, v1}, [Lf2/r$b;

    move-result-object p1

    invoke-static {p1}, LZg/v;->q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Lf2/r$b;

    return-object p1
.end method

.method public final Y(Ljava/lang/String;ZZLf2/r;)Lf2/r$b;
    .locals 7

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastVisited"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lf2/r;->A(Ljava/lang/String;)Lf2/r$b;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf2/r;

    invoke-static {v5, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    instance-of v6, v5, Lf2/t;

    if-eqz v6, :cond_2

    check-cast v5, Lf2/t;

    const/4 v6, 0x0

    invoke-virtual {v5, p1, v1, v6, p0}, Lf2/t;->Y(Ljava/lang/String;ZZLf2/r;)Lf2/r$b;

    move-result-object v5

    goto :goto_1

    :cond_2
    invoke-virtual {v5, p1}, Lf2/r;->A(Ljava/lang/String;)Lf2/r$b;

    move-result-object v5

    :goto_1
    if-eqz v5, :cond_0

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v3}, LZg/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Lf2/r$b;

    goto :goto_2

    :cond_4
    move-object v3, v2

    :goto_2
    invoke-virtual {p0}, Lf2/r;->v()Lf2/t;

    move-result-object v4

    if-eqz v4, :cond_5

    if-eqz p3, :cond_5

    invoke-static {v4, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    invoke-virtual {v4, p1, p2, v1, p0}, Lf2/t;->Y(Ljava/lang/String;ZZLf2/r;)Lf2/r$b;

    move-result-object v2

    :cond_5
    filled-new-array {v0, v3, v2}, [Lf2/r$b;

    move-result-object p1

    invoke-static {p1}, LZg/v;->q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Lf2/r$b;

    return-object p1
.end method

.method public final Z(I)V
    .locals 0

    invoke-direct {p0, p1}, Lf2/t;->e0(I)V

    return-void
.end method

.method public final a0(LVi/b;Lmh/l;)V
    .locals 2

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parseRoute"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lh2/c;->b(LVi/b;)I

    move-result v0

    invoke-virtual {p0, v0}, Lf2/t;->N(I)Lf2/r;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p2, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lf2/t;->g0(Ljava/lang/String;)V

    iput v0, p0, Lf2/t;->n:I

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot find startDestination "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LVi/b;->a()LXi/f;

    move-result-object p1

    invoke-interface {p1}, LXi/f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " from NavGraph. Ensure the starting NavDestination was added with route from KClass."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final b0(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "startDestRoute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {v0}, LVi/w;->d(Lth/d;)LVi/b;

    move-result-object v0

    new-instance v1, Lf2/t$c;

    invoke-direct {v1, p1}, Lf2/t$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v1}, Lf2/t;->a0(LVi/b;Lmh/l;)V

    return-void
.end method

.method public final c0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "startDestRoute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lf2/t;->g0(Ljava/lang/String;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    instance-of v2, p1, Lf2/t;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lf2/r;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lf2/t;->m:Lo/W;

    invoke-virtual {v2}, Lo/W;->p()I

    move-result v2

    check-cast p1, Lf2/t;

    iget-object v3, p1, Lf2/t;->m:Lo/W;

    invoke-virtual {v3}, Lo/W;->p()I

    move-result v3

    if-ne v2, v3, :cond_3

    invoke-virtual {p0}, Lf2/t;->V()I

    move-result v2

    invoke-virtual {p1}, Lf2/t;->V()I

    move-result v3

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lf2/t;->m:Lo/W;

    invoke-static {v2}, Lo/Y;->b(Lo/W;)Ljava/util/Iterator;

    move-result-object v2

    invoke-static {v2}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object v2

    invoke-interface {v2}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/r;

    iget-object v4, p1, Lf2/t;->m:Lo/W;

    invoke-virtual {v3}, Lf2/r;->s()I

    move-result v5

    invoke-virtual {v4, v5}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_3
    move v0, v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 6

    invoke-virtual {p0}, Lf2/t;->V()I

    move-result v0

    iget-object v1, p0, Lf2/t;->m:Lo/W;

    invoke-virtual {v1}, Lo/W;->p()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Lo/W;->k(I)I

    move-result v4

    invoke-virtual {v1, v3}, Lo/W;->q(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf2/r;

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v5}, Lf2/r;->hashCode()I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lf2/t$b;

    invoke-direct {v0, p0}, Lf2/t$b;-><init>(Lf2/t;)V

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lf2/r;->s()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lf2/r;->q()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "the root navigation"

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lf2/r;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf2/t;->p:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lf2/t;->O(Ljava/lang/String;)Lf2/r;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lf2/t;->V()I

    move-result v1

    invoke-virtual {p0, v1}, Lf2/t;->N(I)Lf2/r;

    move-result-object v1

    :cond_0
    const-string v2, " startDestination="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_3

    iget-object v1, p0, Lf2/t;->p:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lf2/t;->o:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lf2/t;->n:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    const-string v2, "{"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lf2/r;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public z(Lf2/q;)Lf2/r$b;
    .locals 2

    const-string v0, "navDeepLinkRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1, p0}, Lf2/t;->X(Lf2/q;ZZLf2/r;)Lf2/r$b;

    move-result-object p1

    return-object p1
.end method
