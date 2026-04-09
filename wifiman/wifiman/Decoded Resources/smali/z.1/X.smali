.class public final Lz/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;
.implements Lz/T;


# instance fields
.field private final a:Lz/c$e;

.field private final b:Lf0/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz/c$e;Lf0/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/X;->a:Lz/c$e;

    iput-object p2, p0, Lz/X;->b:Lf0/c$c;

    return-void
.end method

.method public static final synthetic q(Lz/X;Landroidx/compose/ui/layout/t;Lz/V;II)I
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lz/X;->r(Landroidx/compose/ui/layout/t;Lz/V;II)I

    move-result p0

    return p0
.end method

.method private final r(Landroidx/compose/ui/layout/t;Lz/V;II)I
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lz/V;->a()Lz/m;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    sub-int/2addr p3, v0

    sget-object v0, LY0/t;->Ltr:LY0/t;

    invoke-virtual {p2, p3, v0, p1, p4}, Lz/m;->a(ILY0/t;Landroidx/compose/ui/layout/t;I)I

    move-result p1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lz/X;->b:Lf0/c$c;

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p1

    sub-int/2addr p3, p1

    const/4 p1, 0x0

    invoke-interface {p2, p1, p3}, Lf0/c$c;->a(II)I

    move-result p1

    :goto_1
    return p1
.end method


# virtual methods
.method public a(I[I[ILandroidx/compose/ui/layout/m;)V
    .locals 6

    iget-object v0, p0, Lz/X;->a:Lz/c$e;

    invoke-interface {p4}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    move-object v1, p4

    move v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lz/c$e;->c(LY0/d;I[ILY0/t;[I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 16

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v2

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v4

    move-object/from16 v15, p0

    iget-object v0, v15, Lz/X;->a:Lz/c$e;

    invoke-interface {v0}, Lz/c$e;->a()F

    move-result v0

    move-object/from16 v6, p1

    invoke-interface {v6, v0}, LY0/d;->x1(F)I

    move-result v5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v8, v0, [Landroidx/compose/ui/layout/t;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    const/16 v13, 0xc00

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v14}, Lz/U;->b(Lz/T;IIIIILandroidx/compose/ui/layout/m;Ljava/util/List;[Landroidx/compose/ui/layout/t;II[IIILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method public c(LC0/o;Ljava/util/List;I)I
    .locals 2

    sget-object v0, Lz/I;->a:Lz/I;

    iget-object v1, p0, Lz/X;->a:Lz/c$e;

    invoke-interface {v1}, Lz/c$e;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lz/I;->a(Ljava/util/List;II)I

    move-result p1

    return p1
.end method

.method public d([Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;I[III[IIII)LC0/D;
    .locals 8

    new-instance v6, Lz/X$a;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    move v3, p6

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lz/X$a;-><init>([Landroidx/compose/ui/layout/t;Lz/X;II[I)V

    const/4 v5, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    move v1, p5

    move v2, p6

    move-object v4, v6

    move-object v6, v7

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method public e(LC0/o;Ljava/util/List;I)I
    .locals 2

    sget-object v0, Lz/I;->a:Lz/I;

    iget-object v1, p0, Lz/X;->a:Lz/c$e;

    invoke-interface {v1}, Lz/c$e;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lz/I;->b(Ljava/util/List;II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz/X;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz/X;

    iget-object v1, p0, Lz/X;->a:Lz/c$e;

    iget-object v3, p1, Lz/X;->a:Lz/c$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lz/X;->b:Lf0/c$c;

    iget-object p1, p1, Lz/X;->b:Lf0/c$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public f(LC0/o;Ljava/util/List;I)I
    .locals 2

    sget-object v0, Lz/I;->a:Lz/I;

    iget-object v1, p0, Lz/X;->a:Lz/c$e;

    invoke-interface {v1}, Lz/c$e;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lz/I;->d(Ljava/util/List;II)I

    move-result p1

    return p1
.end method

.method public g(IIIIZ)J
    .locals 0

    invoke-static {p5, p1, p2, p3, p4}, Lz/W;->a(ZIIII)J

    move-result-wide p1

    return-wide p1
.end method

.method public h(Landroidx/compose/ui/layout/t;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lz/X;->a:Lz/c$e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lz/X;->b:Lf0/c$c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i(LC0/o;Ljava/util/List;I)I
    .locals 2

    sget-object v0, Lz/I;->a:Lz/I;

    iget-object v1, p0, Lz/X;->a:Lz/c$e;

    invoke-interface {v1}, Lz/c$e;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lz/I;->c(Ljava/util/List;II)I

    move-result p1

    return p1
.end method

.method public k(Landroidx/compose/ui/layout/t;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RowMeasurePolicy(horizontalArrangement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/X;->a:Lz/c$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/X;->b:Lf0/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
