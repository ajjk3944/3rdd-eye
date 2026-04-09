.class final LE0/w$b;
.super LE0/Q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic v:LE0/w;


# direct methods
.method public constructor <init>(LE0/w;)V
    .locals 0

    iput-object p1, p0, LE0/w$b;->v:LE0/w;

    invoke-direct {p0, p1}, LE0/Q;-><init>(LE0/c0;)V

    return-void
.end method


# virtual methods
.method public R(I)I
    .locals 1

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->d1(I)I

    move-result p1

    return p1
.end method

.method public S(I)I
    .locals 1

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->Z0(I)I

    move-result p1

    return p1
.end method

.method public T(J)Landroidx/compose/ui/layout/t;
    .locals 5

    invoke-static {p0, p1, p2}, LE0/Q;->W1(LE0/Q;J)V

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->Z()LE0/L$a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v4, LE0/G$g;->NotUsed:LE0/G$g;

    invoke-virtual {v3, v4}, LE0/L$a;->Y1(LE0/G$g;)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->e0()LC0/C;

    move-result-object v0

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->F()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, LC0/C;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-static {p0, p1}, LE0/Q;->Y1(LE0/Q;LC0/D;)V

    return-object p0
.end method

.method public U0(LC0/a;)I
    .locals 3

    invoke-virtual {p0}, LE0/Q;->Z1()LE0/b;

    move-result-object v0

    invoke-interface {v0}, LE0/b;->v()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x80000000

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, LE0/Q;->b2()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method

.method protected g2()V
    .locals 1

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->Z()LE0/L$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/L$a;->O1()V

    return-void
.end method

.method public s(I)I
    .locals 1

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->Y0(I)I

    move-result p1

    return p1
.end method

.method public s0(I)I
    .locals 1

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->c1(I)I

    move-result p1

    return p1
.end method
