.class public final LK/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK/f$a;
    }
.end annotation


# static fields
.field public static final d:LK/f$a;

.field public static final e:I


# instance fields
.field private final a:I

.field private b:Landroidx/compose/runtime/snapshots/k;

.field private c:Landroidx/compose/runtime/snapshots/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LK/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LK/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LK/f;->d:LK/f$a;

    const/16 v0, 0x8

    sput v0, LK/f;->e:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p3, p0, LK/f;->a:I

    .line 3
    new-instance v0, Landroidx/compose/runtime/snapshots/k;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/k;-><init>()V

    .line 4
    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/k;->addAll(Ljava/util/Collection;)Z

    .line 5
    iput-object v0, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    .line 6
    new-instance p1, Landroidx/compose/runtime/snapshots/k;

    invoke-direct {p1}, Landroidx/compose/runtime/snapshots/k;-><init>()V

    .line 7
    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Landroidx/compose/runtime/snapshots/k;->addAll(Ljava/util/Collection;)Z

    .line 8
    iput-object p1, p0, LK/f;->c:Landroidx/compose/runtime/snapshots/k;

    if-ltz p3, :cond_1

    .line 9
    invoke-virtual {p0}, LK/f;->g()I

    move-result p1

    if-gt p1, p3, :cond_0

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Initial list of undo and redo operations have a size=("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LK/f;->g()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") greater than the given capacity=("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    const-string p2, ")."

    .line 12
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 13
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 14
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Capacity must be a positive integer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 15
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 16
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/16 p3, 0x64

    .line 17
    :cond_2
    invoke-direct {p0, p1, p2, p3}, LK/f;-><init>(Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method

.method public static final synthetic a(LK/f;)I
    .locals 0

    iget p0, p0, LK/f;->a:I

    return p0
.end method

.method public static final synthetic b(LK/f;)Landroidx/compose/runtime/snapshots/k;
    .locals 0

    iget-object p0, p0, LK/f;->c:Landroidx/compose/runtime/snapshots/k;

    return-object p0
.end method

.method public static final synthetic c(LK/f;)Landroidx/compose/runtime/snapshots/k;
    .locals 0

    iget-object p0, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    return-object p0
.end method


# virtual methods
.method public final d()V
    .locals 1

    iget-object v0, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k;->clear()V

    iget-object v0, p0, LK/f;->c:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k;->clear()V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, LK/f;->c:Landroidx/compose/runtime/snapshots/k;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final g()I
    .locals 2

    iget-object v0, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k;->size()I

    move-result v0

    iget-object v1, p0, LK/f;->c:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LK/f;->c:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k;->clear()V

    :goto_0
    invoke-virtual {p0}, LK/f;->g()I

    move-result v0

    iget v1, p0, LK/f;->a:I

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    invoke-static {v0}, LZg/v;->L(Ljava/util/List;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LK/f;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK/f;->c:Landroidx/compose/runtime/snapshots/k;

    invoke-static {v0}, LZg/v;->N(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "It\'s an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LK/f;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK/f;->b:Landroidx/compose/runtime/snapshots/k;

    invoke-static {v0}, LZg/v;->N(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LK/f;->c:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "It\'s an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
