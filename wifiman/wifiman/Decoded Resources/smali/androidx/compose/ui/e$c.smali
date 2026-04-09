.class public abstract Landroidx/compose/ui/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private a:Landroidx/compose/ui/e$c;

.field private b:LIi/N;

.field private c:I

.field private d:I

.field private e:Landroidx/compose/ui/e$c;

.field private f:Landroidx/compose/ui/e$c;

.field private g:LE0/j0;

.field private h:LE0/c0;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Landroidx/compose/ui/e$c;->a:Landroidx/compose/ui/e$c;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/compose/ui/e$c;->d:I

    return-void
.end method


# virtual methods
.method public final A2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/e$c;->j:Z

    return-void
.end method

.method public final B2(Lmh/a;)V
    .locals 1

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v0

    invoke-interface {v0, p1}, LE0/m0;->k(Lmh/a;)V

    return-void
.end method

.method public C2(LE0/c0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/e$c;->h:LE0/c0;

    return-void
.end method

.method public final a2()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/e$c;->d:I

    return v0
.end method

.method public final b2()Landroidx/compose/ui/e$c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/e$c;->f:Landroidx/compose/ui/e$c;

    return-object v0
.end method

.method public final c2()LE0/c0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/e$c;->h:LE0/c0;

    return-object v0
.end method

.method public final d2()LIi/N;
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/e$c;->b:LIi/N;

    if-nez v0, :cond_0

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getCoroutineContext()Ldh/i;

    move-result-object v0

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v1

    invoke-interface {v1}, LE0/m0;->getCoroutineContext()Ldh/i;

    move-result-object v1

    sget-object v2, LIi/y0;->O:LIi/y0$b;

    invoke-interface {v1, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v1

    check-cast v1, LIi/y0;

    invoke-static {v1}, LIi/A0;->a(LIi/y0;)LIi/A;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/e$c;->b:LIi/N;

    :cond_0
    return-object v0
.end method

.method public final e2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->i:Z

    return v0
.end method

.method public final f2()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/e$c;->c:I

    return v0
.end method

.method public final g2()LE0/j0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/e$c;->g:LE0/j0;

    return-object v0
.end method

.method public final h1()Landroidx/compose/ui/e$c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/e$c;->a:Landroidx/compose/ui/e$c;

    return-object v0
.end method

.method public final h2()Landroidx/compose/ui/e$c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/e$c;->e:Landroidx/compose/ui/e$c;

    return-object v0
.end method

.method public i2()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->j:Z

    return v0
.end method

.method public final k2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->m:Z

    return v0
.end method

.method public l2()V
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->m:Z

    if-eqz v0, :cond_0

    const-string v0, "node attached multiple times"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/e$c;->h:LE0/c0;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "attach invoked on a node without a coordinator"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_2
    iput-boolean v1, p0, Landroidx/compose/ui/e$c;->m:Z

    iput-boolean v1, p0, Landroidx/compose/ui/e$c;->k:Z

    return-void
.end method

.method public m2()V
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->m:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot detach a node that is not attached"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->k:Z

    if-eqz v0, :cond_1

    const-string v0, "Must run runAttachLifecycle() before markAsDetached()"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->l:Z

    if-eqz v0, :cond_2

    const-string v0, "Must run runDetachLifecycle() before markAsDetached()"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/e$c;->m:Z

    iget-object v0, p0, Landroidx/compose/ui/e$c;->b:LIi/N;

    if-eqz v0, :cond_3

    new-instance v1, Landroidx/compose/ui/ModifierNodeDetachedCancellationException;

    invoke-direct {v1}, Landroidx/compose/ui/ModifierNodeDetachedCancellationException;-><init>()V

    invoke-static {v0, v1}, LIi/O;->d(LIi/N;Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/e$c;->b:LIi/N;

    :cond_3
    return-void
.end method

.method public n2()V
    .locals 0

    return-void
.end method

.method public o2()V
    .locals 0

    return-void
.end method

.method public p2()V
    .locals 0

    return-void
.end method

.method public q2()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->m:Z

    if-nez v0, :cond_0

    const-string v0, "reset() called on an unattached node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->p2()V

    return-void
.end method

.method public r2()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->m:Z

    if-nez v0, :cond_0

    const-string v0, "Must run markAsAttached() prior to runAttachLifecycle"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->k:Z

    if-nez v0, :cond_1

    const-string v0, "Must run runAttachLifecycle() only once after markAsAttached()"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/e$c;->k:Z

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->n2()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/e$c;->l:Z

    return-void
.end method

.method public s2()V
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->m:Z

    if-nez v0, :cond_0

    const-string v0, "node detached multiple times"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/e$c;->h:LE0/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "detach invoked on a node without a coordinator"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-boolean v0, p0, Landroidx/compose/ui/e$c;->l:Z

    if-nez v0, :cond_3

    const-string v0, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_3
    iput-boolean v1, p0, Landroidx/compose/ui/e$c;->l:Z

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->o2()V

    return-void
.end method

.method public final t2(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/e$c;->d:I

    return-void
.end method

.method public u2(Landroidx/compose/ui/e$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/e$c;->a:Landroidx/compose/ui/e$c;

    return-void
.end method

.method public final v2(Landroidx/compose/ui/e$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/e$c;->f:Landroidx/compose/ui/e$c;

    return-void
.end method

.method public final w2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/e$c;->i:Z

    return-void
.end method

.method public final x2(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/e$c;->c:I

    return-void
.end method

.method public final y2(LE0/j0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/e$c;->g:LE0/j0;

    return-void
.end method

.method public final z2(Landroidx/compose/ui/e$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/e$c;->e:Landroidx/compose/ui/e$c;

    return-void
.end method
