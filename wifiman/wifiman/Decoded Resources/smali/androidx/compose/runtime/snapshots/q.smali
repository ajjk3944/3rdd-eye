.class public final Landroidx/compose/runtime/snapshots/q;
.super Landroidx/compose/runtime/snapshots/g;
.source "SourceFile"


# instance fields
.field private final g:Landroidx/compose/runtime/snapshots/g;

.field private final h:Z

.field private final i:Z

.field private j:Lmh/l;

.field private final k:Lmh/l;

.field private final l:J

.field private final m:Landroidx/compose/runtime/snapshots/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/snapshots/g;Lmh/l;ZZ)V
    .locals 3

    sget-object v0, Landroidx/compose/runtime/snapshots/i;->e:Landroidx/compose/runtime/snapshots/i$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/i$a;->a()Landroidx/compose/runtime/snapshots/i;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/compose/runtime/snapshots/g;-><init>(ILandroidx/compose/runtime/snapshots/i;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/q;->g:Landroidx/compose/runtime/snapshots/g;

    iput-boolean p3, p0, Landroidx/compose/runtime/snapshots/q;->h:Z

    iput-boolean p4, p0, Landroidx/compose/runtime/snapshots/q;->i:Z

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/runtime/snapshots/a;

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/b;->H()Lmh/l;

    move-result-object p1

    :cond_1
    invoke-static {p2, p1, p3}, Landroidx/compose/runtime/snapshots/j;->l(Lmh/l;Lmh/l;Z)Lmh/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/q;->j:Lmh/l;

    invoke-static {}, LT/c;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/runtime/snapshots/q;->l:J

    iput-object p0, p0, Landroidx/compose/runtime/snapshots/q;->m:Landroidx/compose/runtime/snapshots/g;

    return-void
.end method

.method private final A()Landroidx/compose/runtime/snapshots/g;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/q;->g:Landroidx/compose/runtime/snapshots/g;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/g;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public B()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/q;->j:Lmh/l;

    return-object v0
.end method

.method public final C()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/q;->l:J

    return-wide v0
.end method

.method public D(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Ld0/i;->a()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public E(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Ld0/i;->a()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public F(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/q;->j:Lmh/l;

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/compose/runtime/snapshots/g;->t(Z)V

    iget-boolean v0, p0, Landroidx/compose/runtime/snapshots/q;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/q;->g:Landroidx/compose/runtime/snapshots/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g;->d()V

    :cond_0
    return-void
.end method

.method public f()I
    .locals 1

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/q;->A()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g;->f()I

    move-result v0

    return v0
.end method

.method public g()Landroidx/compose/runtime/snapshots/i;
    .locals 1

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/q;->A()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g;->g()Landroidx/compose/runtime/snapshots/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lmh/l;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/q;->B()Lmh/l;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/q;->A()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g;->i()Z

    move-result v0

    return v0
.end method

.method public k()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/q;->k:Lmh/l;

    return-object v0
.end method

.method public bridge synthetic m(Landroidx/compose/runtime/snapshots/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/q;->D(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic n(Landroidx/compose/runtime/snapshots/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/q;->E(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;

    return-void
.end method

.method public o()V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/q;->A()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g;->o()V

    return-void
.end method

.method public p(Ld0/k;)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/q;->A()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/g;->p(Ld0/k;)V

    return-void
.end method

.method public x(Lmh/l;)Landroidx/compose/runtime/snapshots/g;
    .locals 4

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/q;->B()Lmh/l;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Landroidx/compose/runtime/snapshots/j;->L(Lmh/l;Lmh/l;ZILjava/lang/Object;)Lmh/l;

    move-result-object p1

    iget-boolean v0, p0, Landroidx/compose/runtime/snapshots/q;->h:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/q;->A()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/compose/runtime/snapshots/g;->x(Lmh/l;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroidx/compose/runtime/snapshots/j;->d(Landroidx/compose/runtime/snapshots/g;Lmh/l;Z)Landroidx/compose/runtime/snapshots/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/q;->A()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/g;->x(Lmh/l;)Landroidx/compose/runtime/snapshots/g;

    move-result-object p1

    :goto_0
    return-object p1
.end method
