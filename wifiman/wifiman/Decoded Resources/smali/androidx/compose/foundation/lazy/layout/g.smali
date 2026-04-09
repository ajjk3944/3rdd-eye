.class final Landroidx/compose/foundation/lazy/layout/g;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/v0;


# instance fields
.field private n:Lmh/a;

.field private o:LB/F;

.field private p:Lw/q;

.field private q:Z

.field private r:Z

.field private s:LJ0/h;

.field private final t:Lmh/l;

.field private u:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/a;LB/F;Lw/q;ZZ)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/g;->n:Lmh/a;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/g;->o:LB/F;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/g;->p:Lw/q;

    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/layout/g;->q:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/lazy/layout/g;->r:Z

    new-instance p1, Landroidx/compose/foundation/lazy/layout/g$b;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/lazy/layout/g$b;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/g;->t:Lmh/l;

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/g;->I2()V

    return-void
.end method

.method public static final synthetic D2(Landroidx/compose/foundation/lazy/layout/g;)Lmh/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/g;->n:Lmh/a;

    return-object p0
.end method

.method public static final synthetic E2(Landroidx/compose/foundation/lazy/layout/g;)LB/F;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/g;->o:LB/F;

    return-object p0
.end method

.method private final F2()LJ0/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/g;->o:LB/F;

    invoke-interface {v0}, LB/F;->e()LJ0/b;

    move-result-object v0

    return-object v0
.end method

.method private final G2()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/g;->p:Lw/q;

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final I2()V
    .locals 4

    new-instance v0, LJ0/h;

    new-instance v1, Landroidx/compose/foundation/lazy/layout/g$c;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/layout/g$c;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    new-instance v2, Landroidx/compose/foundation/lazy/layout/g$d;

    invoke-direct {v2, p0}, Landroidx/compose/foundation/lazy/layout/g$d;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    iget-boolean v3, p0, Landroidx/compose/foundation/lazy/layout/g;->r:Z

    invoke-direct {v0, v1, v2, v3}, LJ0/h;-><init>(Lmh/a;Lmh/a;Z)V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/g;->s:LJ0/h;

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/g;->q:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/lazy/layout/g$e;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/g$e;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/g;->u:Lmh/l;

    return-void
.end method


# virtual methods
.method public final H2(Lmh/a;LB/F;Lw/q;ZZ)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/g;->n:Lmh/a;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/g;->o:LB/F;

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/g;->p:Lw/q;

    if-eq p1, p3, :cond_0

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/g;->p:Lw/q;

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_0
    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/g;->q:Z

    if-ne p1, p4, :cond_1

    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/g;->r:Z

    if-eq p1, p5, :cond_2

    :cond_1
    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/layout/g;->q:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/lazy/layout/g;->r:Z

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/g;->I2()V

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_2
    return-void
.end method

.method public i2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public q(LJ0/w;)V
    .locals 4

    const/4 v0, 0x1

    invoke-static {p1, v0}, LJ0/t;->w0(LJ0/w;Z)V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g;->t:Lmh/l;

    invoke-static {p1, v1}, LJ0/t;->v(LJ0/w;Lmh/l;)V

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/g;->G2()Z

    move-result v1

    const-string v2, "scrollAxisRange"

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g;->s:LJ0/h;

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    invoke-static {p1, v1}, LJ0/t;->x0(LJ0/w;LJ0/h;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g;->s:LJ0/h;

    if-nez v1, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    invoke-static {p1, v1}, LJ0/t;->e0(LJ0/w;LJ0/h;)V

    :goto_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g;->u:Lmh/l;

    if-eqz v1, :cond_3

    invoke-static {p1, v3, v1, v0, v3}, LJ0/t;->X(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    :cond_3
    new-instance v1, Landroidx/compose/foundation/lazy/layout/g$a;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/layout/g$a;-><init>(Landroidx/compose/foundation/lazy/layout/g;)V

    invoke-static {p1, v3, v1, v0, v3}, LJ0/t;->s(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/g;->F2()LJ0/b;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/t;->Y(LJ0/w;LJ0/b;)V

    return-void
.end method
