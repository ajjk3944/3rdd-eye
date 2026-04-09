.class public final LG/b;
.super LG/a;
.source "SourceFile"

# interfaces
.implements LE0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0, p1}, LG/a;-><init>(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public E1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 11

    invoke-static {}, Landroidx/compose/foundation/text/handwriting/a;->b()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result v0

    invoke-static {}, Landroidx/compose/foundation/text/handwriting/a;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result v1

    mul-int/lit8 v2, v1, 0x2

    mul-int/lit8 v3, v0, 0x2

    invoke-static {p3, p4, v2, v3}, LY0/c;->n(JII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p3

    sub-int v6, p3, v3

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p3

    sub-int v5, p3, v2

    new-instance v8, LG/b$a;

    invoke-direct {v8, p2, v1, v0}, LG/b$a;-><init>(Landroidx/compose/ui/layout/t;II)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
