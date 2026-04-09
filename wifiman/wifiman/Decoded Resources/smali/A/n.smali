.class final LA/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/m;


# instance fields
.field private final a:LA/B;

.field private final b:LA/k;

.field private final c:LA/d;

.field private final d:Landroidx/compose/foundation/lazy/layout/c;


# direct methods
.method public constructor <init>(LA/B;LA/k;LA/d;Landroidx/compose/foundation/lazy/layout/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/n;->a:LA/B;

    iput-object p2, p0, LA/n;->b:LA/k;

    iput-object p3, p0, LA/n;->c:LA/d;

    iput-object p4, p0, LA/n;->d:Landroidx/compose/foundation/lazy/layout/c;

    return-void
.end method

.method public static final synthetic i(LA/n;)LA/k;
    .locals 0

    iget-object p0, p0, LA/n;->b:LA/k;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LA/n;->b:LA/k;

    invoke-virtual {v0}, LB/o;->d()I

    move-result v0

    return v0
.end method

.method public b(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA/n;->f()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/foundation/lazy/layout/c;->b(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LA/n;->b:LA/k;

    invoke-virtual {v0, p1}, LB/o;->e(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public c(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, LA/n;->f()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/foundation/lazy/layout/c;->c(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public d(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LA/n;->b:LA/k;

    invoke-virtual {v0, p1}, LB/o;->b(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e()LA/d;
    .locals 1

    iget-object v0, p0, LA/n;->c:LA/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LA/n;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, LA/n;->b:LA/k;

    check-cast p1, LA/n;

    iget-object p1, p1, LA/n;->b:LA/k;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Landroidx/compose/foundation/lazy/layout/c;
    .locals 1

    iget-object v0, p0, LA/n;->d:Landroidx/compose/foundation/lazy/layout/c;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LA/n;->b:LA/k;

    invoke-virtual {v0}, LA/k;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public h(ILjava/lang/Object;LT/l;I)V
    .locals 7

    const v0, -0x1b900aca

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p1}, LT/l;->i(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    iget-object v0, p0, LA/n;->a:LA/B;

    invoke-virtual {v0}, LA/B;->z()LB/E;

    move-result-object v3

    new-instance v0, LA/n$a;

    invoke-direct {v0, p0, p1}, LA/n$a;-><init>(LA/n;I)V

    const/16 v2, 0x36

    const v4, -0x3128503e

    const/4 v5, 0x1

    invoke-static {v4, v5, v0, p3, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xc00

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int v6, v0, v1

    move-object v1, p2

    move v2, p1

    move-object v5, p3

    invoke-static/range {v1 .. v6}, LB/D;->a(Ljava/lang/Object;ILB/E;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_5
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v0, LA/n$b;

    invoke-direct {v0, p0, p1, p2, p4}, LA/n$b;-><init>(LA/n;ILjava/lang/Object;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LA/n;->b:LA/k;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
