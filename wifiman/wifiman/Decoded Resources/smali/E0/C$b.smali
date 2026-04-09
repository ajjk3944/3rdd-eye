.class final LE0/C$b;
.super LE0/Q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic v:LE0/C;


# direct methods
.method public constructor <init>(LE0/C;)V
    .locals 0

    iput-object p1, p0, LE0/C$b;->v:LE0/C;

    invoke-direct {p0, p1}, LE0/Q;-><init>(LE0/c0;)V

    return-void
.end method


# virtual methods
.method public R(I)I
    .locals 2

    iget-object v0, p0, LE0/C$b;->v:LE0/C;

    invoke-virtual {v0}, LE0/C;->C3()LE0/B;

    move-result-object v0

    iget-object v1, p0, LE0/C$b;->v:LE0/C;

    invoke-virtual {v1}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->C2()LE0/Q;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LE0/B;->r(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public S(I)I
    .locals 2

    iget-object v0, p0, LE0/C$b;->v:LE0/C;

    invoke-virtual {v0}, LE0/C;->C3()LE0/B;

    move-result-object v0

    iget-object v1, p0, LE0/C$b;->v:LE0/C;

    invoke-virtual {v1}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->C2()LE0/Q;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LE0/B;->A(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public T(J)Landroidx/compose/ui/layout/t;
    .locals 2

    iget-object v0, p0, LE0/C$b;->v:LE0/C;

    invoke-static {p0, p1, p2}, LE0/Q;->W1(LE0/Q;J)V

    invoke-static {p1, p2}, LY0/b;->a(J)LY0/b;

    move-result-object v1

    invoke-virtual {v0, v1}, LE0/C;->H3(LY0/b;)V

    invoke-virtual {v0}, LE0/C;->C3()LE0/B;

    move-result-object v1

    invoke-virtual {v0}, LE0/C;->E3()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v0, p1, p2}, LE0/B;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    invoke-static {p0, p1}, LE0/Q;->Y1(LE0/Q;LC0/D;)V

    return-object p0
.end method

.method public U0(LC0/a;)I
    .locals 3

    invoke-static {p0, p1}, LE0/D;->a(LE0/P;LC0/a;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, LE0/Q;->b2()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method

.method public s(I)I
    .locals 2

    iget-object v0, p0, LE0/C$b;->v:LE0/C;

    invoke-virtual {v0}, LE0/C;->C3()LE0/B;

    move-result-object v0

    iget-object v1, p0, LE0/C$b;->v:LE0/C;

    invoke-virtual {v1}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->C2()LE0/Q;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LE0/B;->v(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public s0(I)I
    .locals 2

    iget-object v0, p0, LE0/C$b;->v:LE0/C;

    invoke-virtual {v0}, LE0/C;->C3()LE0/B;

    move-result-object v0

    iget-object v1, p0, LE0/C$b;->v:LE0/C;

    invoke-virtual {v1}, LE0/C;->E3()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->C2()LE0/Q;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LE0/B;->p(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method
