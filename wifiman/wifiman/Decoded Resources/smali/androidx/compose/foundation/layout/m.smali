.class final Landroidx/compose/foundation/layout/m;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:F

.field private o:F

.field private p:Z


# direct methods
.method private constructor <init>(FFZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/foundation/layout/m;->n:F

    .line 4
    iput p2, p0, Landroidx/compose/foundation/layout/m;->o:F

    .line 5
    iput-boolean p3, p0, Landroidx/compose/foundation/layout/m;->p:Z

    return-void
.end method

.method public synthetic constructor <init>(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/m;-><init>(FFZ)V

    return-void
.end method


# virtual methods
.method public final D2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/m;->p:Z

    return v0
.end method

.method public final E2()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/m;->n:F

    return v0
.end method

.method public final F2()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/m;->o:F

    return v0
.end method

.method public final G2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/m;->p:Z

    return-void
.end method

.method public final H2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/m;->n:F

    return-void
.end method

.method public final I2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/m;->o:F

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/m$a;

    invoke-direct {v4, p0, p2, p1}, Landroidx/compose/foundation/layout/m$a;-><init>(Landroidx/compose/foundation/layout/m;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
