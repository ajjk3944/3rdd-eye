.class final LL0/k$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL0/k;->a(J[FI)[F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:[F

.field final synthetic c:Lkotlin/jvm/internal/L;

.field final synthetic d:Lkotlin/jvm/internal/K;


# direct methods
.method constructor <init>(J[FLkotlin/jvm/internal/L;Lkotlin/jvm/internal/K;)V
    .locals 0

    iput-wide p1, p0, LL0/k$a;->a:J

    iput-object p3, p0, LL0/k$a;->b:[F

    iput-object p4, p0, LL0/k$a;->c:Lkotlin/jvm/internal/L;

    iput-object p5, p0, LL0/k$a;->d:Lkotlin/jvm/internal/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/q;)V
    .locals 8

    iget-wide v0, p0, LL0/k$a;->a:J

    iget-object v2, p0, LL0/k$a;->b:[F

    iget-object v3, p0, LL0/k$a;->c:Lkotlin/jvm/internal/L;

    iget-object v4, p0, LL0/k$a;->d:Lkotlin/jvm/internal/K;

    invoke-virtual {p1}, LL0/q;->f()I

    move-result v5

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v6

    if-le v5, v6, :cond_0

    invoke-virtual {p1}, LL0/q;->f()I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v5

    :goto_0
    invoke-virtual {p1}, LL0/q;->b()I

    move-result v6

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result v7

    if-ge v6, v7, :cond_1

    invoke-virtual {p1}, LL0/q;->b()I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result v0

    :goto_1
    invoke-virtual {p1, v5}, LL0/q;->r(I)I

    move-result v1

    invoke-virtual {p1, v0}, LL0/q;->r(I)I

    move-result v0

    invoke-static {v1, v0}, LL0/T;->b(II)J

    move-result-wide v0

    invoke-virtual {p1}, LL0/q;->e()LL0/p;

    move-result-object v5

    iget v6, v3, Lkotlin/jvm/internal/L;->a:I

    invoke-interface {v5, v0, v1, v2, v6}, LL0/p;->c(J[FI)V

    iget v5, v3, Lkotlin/jvm/internal/L;->a:I

    invoke-static {v0, v1}, LL0/S;->j(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    add-int/2addr v5, v0

    iget v0, v3, Lkotlin/jvm/internal/L;->a:I

    :goto_2
    if-ge v0, v5, :cond_2

    add-int/lit8 v1, v0, 0x1

    aget v6, v2, v1

    iget v7, v4, Lkotlin/jvm/internal/K;->a:F

    add-float/2addr v6, v7

    aput v6, v2, v1

    add-int/lit8 v1, v0, 0x3

    aget v6, v2, v1

    add-float/2addr v6, v7

    aput v6, v2, v1

    add-int/lit8 v0, v0, 0x4

    goto :goto_2

    :cond_2
    iput v5, v3, Lkotlin/jvm/internal/L;->a:I

    iget v0, v4, Lkotlin/jvm/internal/K;->a:F

    invoke-virtual {p1}, LL0/q;->e()LL0/p;

    move-result-object p1

    invoke-interface {p1}, LL0/p;->getHeight()F

    move-result p1

    add-float/2addr v0, p1

    iput v0, v4, Lkotlin/jvm/internal/K;->a:F

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/q;

    invoke-virtual {p0, p1}, LL0/k$a;->a(LL0/q;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
