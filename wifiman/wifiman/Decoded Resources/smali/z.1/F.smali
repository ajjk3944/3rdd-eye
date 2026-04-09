.class public final Lz/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/x;
.implements LD0/d;
.implements LD0/j;


# instance fields
.field private final a:Lz/f0;

.field private final b:LT/q0;

.field private final c:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz/f0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/F;->a:Lz/f0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    iput-object v2, p0, Lz/F;->b:LT/q0;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lz/F;->c:LT/q0;

    return-void
.end method

.method private final a()Lz/f0;
    .locals 1

    iget-object v0, p0, Lz/F;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/f0;

    return-object v0
.end method

.method private final c()Lz/f0;
    .locals 1

    iget-object v0, p0, Lz/F;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/f0;

    return-object v0
.end method

.method private final e(Lz/f0;)V
    .locals 1

    iget-object v0, p0, Lz/F;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final f(Lz/f0;)V
    .locals 1

    iget-object v0, p0, Lz/F;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public Z0(LD0/k;)V
    .locals 1

    invoke-static {}, Lz/i0;->b()LD0/l;

    move-result-object v0

    invoke-interface {p1, v0}, LD0/k;->z(LD0/c;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz/f0;

    iget-object v0, p0, Lz/F;->a:Lz/f0;

    invoke-static {v0, p1}, Lz/h0;->g(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object v0

    invoke-direct {p0, v0}, Lz/F;->f(Lz/f0;)V

    iget-object v0, p0, Lz/F;->a:Lz/f0;

    invoke-static {p1, v0}, Lz/h0;->h(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object p1

    invoke-direct {p0, p1}, Lz/F;->e(Lz/f0;)V

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 9

    invoke-direct {p0}, Lz/F;->c()Lz/f0;

    move-result-object v3

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    invoke-interface {v3, p1, v4}, Lz/f0;->d(LY0/d;LY0/t;)I

    move-result v3

    invoke-direct {p0}, Lz/F;->c()Lz/f0;

    move-result-object v4

    invoke-interface {v4, p1}, Lz/f0;->c(LY0/d;)I

    move-result v4

    invoke-direct {p0}, Lz/F;->c()Lz/f0;

    move-result-object v5

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v6

    invoke-interface {v5, p1, v6}, Lz/f0;->a(LY0/d;LY0/t;)I

    move-result v5

    invoke-direct {p0}, Lz/F;->c()Lz/f0;

    move-result-object v6

    invoke-interface {v6, p1}, Lz/f0;->b(LY0/d;)I

    move-result v6

    add-int/2addr v5, v3

    add-int/2addr v6, v4

    neg-int v7, v5

    neg-int v8, v6

    invoke-static {p3, p4, v7, v8}, LY0/c;->n(JII)J

    move-result-wide v7

    invoke-interface {p2, v7, v8}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v8

    add-int/2addr v8, v5

    invoke-static {p3, p4, v8}, LY0/c;->i(JI)I

    move-result v5

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v8

    add-int/2addr v8, v6

    invoke-static {p3, p4, v8}, LY0/c;->h(JI)I

    move-result v2

    new-instance v6, Lz/F$a;

    invoke-direct {v6, v7, v3, v4}, Lz/F$a;-><init>(Landroidx/compose/ui/layout/t;II)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move v1, v5

    move-object v4, v6

    move v5, v7

    move-object v6, v8

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method public d()Lz/f0;
    .locals 1

    invoke-direct {p0}, Lz/F;->a()Lz/f0;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lz/F;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lz/F;

    iget-object p1, p1, Lz/F;->a:Lz/f0;

    iget-object v0, p0, Lz/F;->a:Lz/f0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getKey()LD0/l;
    .locals 1

    invoke-static {}, Lz/i0;->b()LD0/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz/F;->d()Lz/f0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lz/F;->a:Lz/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
