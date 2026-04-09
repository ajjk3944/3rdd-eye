.class final Landroidx/compose/foundation/layout/p;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:Z


# direct methods
.method private constructor <init>(FFFFZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/foundation/layout/p;->n:F

    .line 4
    iput p2, p0, Landroidx/compose/foundation/layout/p;->o:F

    .line 5
    iput p3, p0, Landroidx/compose/foundation/layout/p;->p:F

    .line 6
    iput p4, p0, Landroidx/compose/foundation/layout/p;->q:F

    .line 7
    iput-boolean p5, p0, Landroidx/compose/foundation/layout/p;->r:Z

    return-void
.end method

.method public synthetic constructor <init>(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/layout/p;-><init>(FFFFZ)V

    return-void
.end method


# virtual methods
.method public final D2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/p;->r:Z

    return v0
.end method

.method public final E2()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/p;->n:F

    return v0
.end method

.method public final F2()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/p;->o:F

    return v0
.end method

.method public final G2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/p;->q:F

    return-void
.end method

.method public final H2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/p;->p:F

    return-void
.end method

.method public final I2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/p;->r:Z

    return-void
.end method

.method public final J2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/p;->n:F

    return-void
.end method

.method public final K2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/p;->o:F

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 10

    iget v0, p0, Landroidx/compose/foundation/layout/p;->n:F

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result v0

    iget v1, p0, Landroidx/compose/foundation/layout/p;->p:F

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Landroidx/compose/foundation/layout/p;->o:F

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result v1

    iget v2, p0, Landroidx/compose/foundation/layout/p;->q:F

    invoke-interface {p1, v2}, LY0/d;->x1(F)I

    move-result v2

    add-int/2addr v1, v2

    neg-int v2, v0

    neg-int v3, v1

    invoke-static {p3, p4, v2, v3}, LY0/c;->n(JII)J

    move-result-wide v2

    invoke-interface {p2, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {p3, p4, v2}, LY0/c;->i(JI)I

    move-result v4

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    add-int/2addr v0, v1

    invoke-static {p3, p4, v0}, LY0/c;->h(JI)I

    move-result v5

    new-instance v7, Landroidx/compose/foundation/layout/p$a;

    invoke-direct {v7, p0, p2, p1}, Landroidx/compose/foundation/layout/p$a;-><init>(Landroidx/compose/foundation/layout/p;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
