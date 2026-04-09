.class public final Landroidx/compose/runtime/snapshots/d;
.super Landroidx/compose/runtime/snapshots/g;
.source "SourceFile"


# instance fields
.field private final g:Lmh/l;

.field private final h:Landroidx/compose/runtime/snapshots/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILandroidx/compose/runtime/snapshots/i;Lmh/l;Landroidx/compose/runtime/snapshots/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/compose/runtime/snapshots/g;-><init>(ILandroidx/compose/runtime/snapshots/i;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Landroidx/compose/runtime/snapshots/d;->g:Lmh/l;

    iput-object p4, p0, Landroidx/compose/runtime/snapshots/d;->h:Landroidx/compose/runtime/snapshots/g;

    invoke-virtual {p4, p0}, Landroidx/compose/runtime/snapshots/g;->m(Landroidx/compose/runtime/snapshots/g;)V

    return-void
.end method


# virtual methods
.method public A()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/d;->g:Lmh/l;

    return-object v0
.end method

.method public B(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Ld0/i;->a()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public C(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Ld0/i;->a()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public D(Ld0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->r()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public E(Lmh/l;)Landroidx/compose/runtime/snapshots/d;
    .locals 7

    new-instance v0, Landroidx/compose/runtime/snapshots/d;

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/g;->f()I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/g;->g()Landroidx/compose/runtime/snapshots/i;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/d;->A()Lmh/l;

    move-result-object v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p1, v3, v6, v4, v5}, Landroidx/compose/runtime/snapshots/j;->L(Lmh/l;Lmh/l;ZILjava/lang/Object;)Lmh/l;

    move-result-object p1

    iget-object v3, p0, Landroidx/compose/runtime/snapshots/d;->h:Landroidx/compose/runtime/snapshots/g;

    invoke-direct {v0, v1, v2, p1, v3}, Landroidx/compose/runtime/snapshots/d;-><init>(ILandroidx/compose/runtime/snapshots/i;Lmh/l;Landroidx/compose/runtime/snapshots/g;)V

    return-object v0
.end method

.method public d()V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/g;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/g;->f()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/d;->h:Landroidx/compose/runtime/snapshots/g;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->f()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/g;->b()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/d;->h:Landroidx/compose/runtime/snapshots/g;

    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/g;->n(Landroidx/compose/runtime/snapshots/g;)V

    invoke-super {p0}, Landroidx/compose/runtime/snapshots/g;->d()V

    :cond_1
    return-void
.end method

.method public bridge synthetic h()Lmh/l;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/d;->A()Lmh/l;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k()Lmh/l;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic m(Landroidx/compose/runtime/snapshots/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/d;->B(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic n(Landroidx/compose/runtime/snapshots/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/d;->C(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;

    return-void
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public bridge synthetic p(Ld0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/d;->D(Ld0/k;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic x(Lmh/l;)Landroidx/compose/runtime/snapshots/g;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/d;->E(Lmh/l;)Landroidx/compose/runtime/snapshots/d;

    move-result-object p1

    return-object p1
.end method
