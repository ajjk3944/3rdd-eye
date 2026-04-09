.class final Landroidx/compose/foundation/layout/n;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:Lmh/l;

.field private o:Z


# direct methods
.method public constructor <init>(Lmh/l;Z)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/n;->n:Lmh/l;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/n;->o:Z

    return-void
.end method


# virtual methods
.method public final D2()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/n;->n:Lmh/l;

    return-object v0
.end method

.method public final E2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/n;->o:Z

    return v0
.end method

.method public final F2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/n;->n:Lmh/l;

    return-void
.end method

.method public final G2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/n;->o:Z

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

    new-instance v4, Landroidx/compose/foundation/layout/n$a;

    invoke-direct {v4, p0, p1, p2}, Landroidx/compose/foundation/layout/n$a;-><init>(Landroidx/compose/foundation/layout/n;Landroidx/compose/ui/layout/m;Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
