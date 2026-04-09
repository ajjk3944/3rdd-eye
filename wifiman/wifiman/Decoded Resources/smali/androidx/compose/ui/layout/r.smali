.class final Landroidx/compose/ui/layout/r;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/A;


# instance fields
.field private n:Lmh/l;

.field private final o:Z

.field private p:J


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 2

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/r;->n:Lmh/l;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/layout/r;->o:Z

    const/high16 p1, -0x80000000

    invoke-static {p1, p1}, LY0/s;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/layout/r;->p:J

    return-void
.end method


# virtual methods
.method public final D2(Lmh/l;)V
    .locals 2

    iput-object p1, p0, Landroidx/compose/ui/layout/r;->n:Lmh/l;

    const/high16 p1, -0x80000000

    invoke-static {p1, p1}, LY0/s;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/layout/r;->p:J

    return-void
.end method

.method public a0(J)V
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/r;->p:J

    invoke-static {v0, v1, p1, p2}, LY0/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/layout/r;->n:Lmh/l;

    invoke-static {p1, p2}, LY0/r;->b(J)LY0/r;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput-wide p1, p0, Landroidx/compose/ui/layout/r;->p:J

    :cond_0
    return-void
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/layout/r;->o:Z

    return v0
.end method
