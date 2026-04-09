.class final Landroidx/compose/foundation/layout/b;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:LC0/a;

.field private o:F

.field private p:F


# direct methods
.method private constructor <init>(LC0/a;FF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/layout/b;->n:LC0/a;

    .line 4
    iput p2, p0, Landroidx/compose/foundation/layout/b;->o:F

    .line 5
    iput p3, p0, Landroidx/compose/foundation/layout/b;->p:F

    return-void
.end method

.method public synthetic constructor <init>(LC0/a;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/b;-><init>(LC0/a;FF)V

    return-void
.end method


# virtual methods
.method public final D2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/b;->p:F

    return-void
.end method

.method public final E2(LC0/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/b;->n:LC0/a;

    return-void
.end method

.method public final F2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/b;->o:F

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    iget-object v1, p0, Landroidx/compose/foundation/layout/b;->n:LC0/a;

    iget v2, p0, Landroidx/compose/foundation/layout/b;->o:F

    iget v3, p0, Landroidx/compose/foundation/layout/b;->p:F

    move-object v0, p1

    move-object v4, p2

    move-wide v5, p3

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->a(Landroidx/compose/ui/layout/m;LC0/a;FFLC0/B;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
