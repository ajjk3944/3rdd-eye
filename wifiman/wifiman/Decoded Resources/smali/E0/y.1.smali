.class public final LE0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE0/G;

.field private final b:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/G;LC0/C;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/y;->a:LE0/G;

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p2, p1, v0, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LE0/y;->b:LT/q0;

    return-void
.end method

.method private final a()LC0/C;
    .locals 1

    iget-object v0, p0, LE0/y;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/C;

    return-object v0
.end method

.method private final j(LC0/C;)V
    .locals 1

    iget-object v0, p0, LE0/y;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(I)I
    .locals 3

    invoke-direct {p0}, LE0/y;->a()LC0/C;

    move-result-object v0

    iget-object v1, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    iget-object v2, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->G()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LC0/C;->c(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final c(I)I
    .locals 3

    invoke-direct {p0}, LE0/y;->a()LC0/C;

    move-result-object v0

    iget-object v1, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    iget-object v2, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->G()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LC0/C;->e(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final d(I)I
    .locals 3

    invoke-direct {p0}, LE0/y;->a()LC0/C;

    move-result-object v0

    iget-object v1, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    iget-object v2, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LC0/C;->c(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final e(I)I
    .locals 3

    invoke-direct {p0}, LE0/y;->a()LC0/C;

    move-result-object v0

    iget-object v1, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    iget-object v2, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LC0/C;->e(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final f(I)I
    .locals 3

    invoke-direct {p0}, LE0/y;->a()LC0/C;

    move-result-object v0

    iget-object v1, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    iget-object v2, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->G()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LC0/C;->i(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final g(I)I
    .locals 3

    invoke-direct {p0}, LE0/y;->a()LC0/C;

    move-result-object v0

    iget-object v1, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    iget-object v2, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->G()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LC0/C;->f(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final h(I)I
    .locals 3

    invoke-direct {p0}, LE0/y;->a()LC0/C;

    move-result-object v0

    iget-object v1, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    iget-object v2, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LC0/C;->i(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final i(I)I
    .locals 3

    invoke-direct {p0}, LE0/y;->a()LC0/C;

    move-result-object v0

    iget-object v1, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    iget-object v2, p0, LE0/y;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LC0/C;->f(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final k(LC0/C;)V
    .locals 0

    invoke-direct {p0, p1}, LE0/y;->j(LC0/C;)V

    return-void
.end method
