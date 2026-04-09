.class final Landroidx/compose/foundation/n;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/v0;


# instance fields
.field private n:Landroidx/compose/foundation/o;

.field private o:Z

.field private p:Lw/n;

.field private q:Z

.field private r:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/o;ZLw/n;ZZ)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/n;->n:Landroidx/compose/foundation/o;

    iput-boolean p2, p0, Landroidx/compose/foundation/n;->o:Z

    iput-object p3, p0, Landroidx/compose/foundation/n;->p:Lw/n;

    iput-boolean p4, p0, Landroidx/compose/foundation/n;->q:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/n;->r:Z

    return-void
.end method


# virtual methods
.method public final D2()Landroidx/compose/foundation/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/n;->n:Landroidx/compose/foundation/o;

    return-object v0
.end method

.method public final E2(Lw/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/n;->p:Lw/n;

    return-void
.end method

.method public final F2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/n;->o:Z

    return-void
.end method

.method public final G2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/n;->q:Z

    return-void
.end method

.method public final H2(Landroidx/compose/foundation/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/n;->n:Landroidx/compose/foundation/o;

    return-void
.end method

.method public final I2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/n;->r:Z

    return-void
.end method

.method public q(LJ0/w;)V
    .locals 4

    const/4 v0, 0x1

    invoke-static {p1, v0}, LJ0/t;->w0(LJ0/w;Z)V

    new-instance v0, LJ0/h;

    new-instance v1, Landroidx/compose/foundation/n$a;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/n$a;-><init>(Landroidx/compose/foundation/n;)V

    new-instance v2, Landroidx/compose/foundation/n$b;

    invoke-direct {v2, p0}, Landroidx/compose/foundation/n$b;-><init>(Landroidx/compose/foundation/n;)V

    iget-boolean v3, p0, Landroidx/compose/foundation/n;->o:Z

    invoke-direct {v0, v1, v2, v3}, LJ0/h;-><init>(Lmh/a;Lmh/a;Z)V

    iget-boolean v1, p0, Landroidx/compose/foundation/n;->r:Z

    if-eqz v1, :cond_0

    invoke-static {p1, v0}, LJ0/t;->x0(LJ0/w;LJ0/h;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, LJ0/t;->e0(LJ0/w;LJ0/h;)V

    :goto_0
    return-void
.end method
