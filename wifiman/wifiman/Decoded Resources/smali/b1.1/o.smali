.class public final Lb1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/n;
.implements LT/S0;


# instance fields
.field private final a:Lb1/l;

.field private b:Landroid/os/Handler;

.field private final c:Landroidx/compose/runtime/snapshots/l;

.field private d:Z

.field private final e:Lmh/l;

.field private final f:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lb1/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/o;->a:Lb1/l;

    new-instance p1, Landroidx/compose/runtime/snapshots/l;

    new-instance v0, Lb1/o$b;

    invoke-direct {v0, p0}, Lb1/o$b;-><init>(Lb1/o;)V

    invoke-direct {p1, v0}, Landroidx/compose/runtime/snapshots/l;-><init>(Lmh/l;)V

    iput-object p1, p0, Lb1/o;->c:Landroidx/compose/runtime/snapshots/l;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb1/o;->d:Z

    new-instance p1, Lb1/o$c;

    invoke-direct {p1, p0}, Lb1/o$c;-><init>(Lb1/o;)V

    iput-object p1, p0, Lb1/o;->e:Lmh/l;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb1/o;->f:Ljava/util/List;

    return-void
.end method

.method public static final synthetic f(Lb1/o;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lb1/o;->b:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic g(Lb1/o;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lb1/o;->f:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic h(Lb1/o;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lb1/o;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Z
    .locals 6

    iget-boolean v0, p0, Lb1/o;->d:Z

    const/4 v1, 0x1

    if-nez v0, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v2, p0, Lb1/o;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v0, v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    invoke-interface {v4}, LC0/n;->b()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lb1/k;

    if-eqz v5, :cond_1

    check-cast v4, Lb1/k;

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget-object v5, p0, Lb1/o;->f:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    return v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_2
    return v1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lb1/o;->c:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->t()V

    iget-object v0, p0, Lb1/o;->c:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->j()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lb1/o;->c:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->s()V

    return-void
.end method

.method public e(Lb1/B;Ljava/util/List;)V
    .locals 4

    iget-object v0, p0, Lb1/o;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lb1/o;->c:Landroidx/compose/runtime/snapshots/l;

    sget-object v1, LYg/J;->a:LYg/J;

    iget-object v2, p0, Lb1/o;->e:Lmh/l;

    new-instance v3, Lb1/o$a;

    invoke-direct {v3, p2, p0, p1}, Lb1/o$a;-><init>(Ljava/util/List;Lb1/o;Lb1/B;)V

    invoke-virtual {v0, v1, v2, v3}, Landroidx/compose/runtime/snapshots/l;->o(Ljava/lang/Object;Lmh/l;Lmh/a;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lb1/o;->d:Z

    return-void
.end method

.method public final i()Lb1/l;
    .locals 1

    iget-object v0, p0, Lb1/o;->a:Lb1/l;

    return-object v0
.end method

.method public final j(Z)V
    .locals 0

    iput-boolean p1, p0, Lb1/o;->d:Z

    return-void
.end method
