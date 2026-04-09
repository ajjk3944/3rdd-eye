.class public final Landroidx/compose/runtime/snapshots/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/snapshots/o;->listIterator(I)Ljava/util/ListIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:Landroidx/compose/runtime/snapshots/o;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;Landroidx/compose/runtime/snapshots/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    iput-object p2, p0, Landroidx/compose/runtime/snapshots/o$a;->b:Landroidx/compose/runtime/snapshots/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/o$a;->d(Ljava/lang/Object;)Ljava/lang/Void;

    return-void
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Ld0/h;->c()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public e()Ljava/lang/Void;
    .locals 1

    invoke-static {}, Ld0/h;->c()Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Ld0/h;->c()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public hasNext()Z
    .locals 3

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/o$a;->b:Landroidx/compose/runtime/snapshots/o;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/o;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public hasPrevious()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/o$a;->b:Landroidx/compose/runtime/snapshots/o;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/o;->size()I

    move-result v1

    invoke-static {v0, v1}, Ld0/h;->d(II)V

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    iput v0, v1, Lkotlin/jvm/internal/L;->a:I

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/o$a;->b:Landroidx/compose/runtime/snapshots/o;

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/o;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/o$a;->b:Landroidx/compose/runtime/snapshots/o;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/o;->size()I

    move-result v1

    invoke-static {v0, v1}, Ld0/h;->d(II)V

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    add-int/lit8 v2, v0, -0x1

    iput v2, v1, Lkotlin/jvm/internal/L;->a:I

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/o$a;->b:Landroidx/compose/runtime/snapshots/o;

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/o;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/o$a;->a:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    return v0
.end method

.method public bridge synthetic remove()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/o$a;->e()Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/o$a;->f(Ljava/lang/Object;)Ljava/lang/Void;

    return-void
.end method
