.class public final Lw6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw6/b;


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw6/c;->a:F

    iput p2, p0, Lw6/c;->b:F

    iput p3, p0, Lw6/c;->c:F

    iput p4, p0, Lw6/c;->d:F

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lw6/c;->d:F

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lw6/c;->c:F

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lw6/c;->b:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lw6/c;->a:F

    return v0
.end method

.method public final e()F
    .locals 2

    invoke-virtual {p0}, Lw6/c;->d()F

    move-result v0

    invoke-virtual {p0}, Lw6/c;->b()F

    move-result v1

    add-float/2addr v0, v1

    return v0
.end method

.method public f(Z)F
    .locals 0

    invoke-static {p0, p1}, Lw6/b$a;->a(Lw6/b;Z)F

    move-result p1

    return p1
.end method

.method public g(Z)F
    .locals 0

    invoke-static {p0, p1}, Lw6/b$a;->b(Lw6/b;Z)F

    move-result p1

    return p1
.end method

.method public final h()F
    .locals 2

    invoke-virtual {p0}, Lw6/c;->c()F

    move-result v0

    invoke-virtual {p0}, Lw6/c;->a()F

    move-result v1

    add-float/2addr v0, v1

    return v0
.end method

.method public final i(FFFF)Lw6/c;
    .locals 0

    invoke-virtual {p0, p1}, Lw6/c;->m(F)V

    invoke-virtual {p0, p2}, Lw6/c;->n(F)V

    invoke-virtual {p0, p3}, Lw6/c;->l(F)V

    invoke-virtual {p0, p4}, Lw6/c;->k(F)V

    return-object p0
.end method

.method public final j(Lw6/b;)Lw6/c;
    .locals 3

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lw6/b;->d()F

    move-result v0

    invoke-interface {p1}, Lw6/b;->c()F

    move-result v1

    invoke-interface {p1}, Lw6/b;->b()F

    move-result v2

    invoke-interface {p1}, Lw6/b;->a()F

    move-result p1

    invoke-virtual {p0, v0, v1, v2, p1}, Lw6/c;->i(FFFF)Lw6/c;

    move-result-object p1

    return-object p1
.end method

.method public k(F)V
    .locals 0

    iput p1, p0, Lw6/c;->d:F

    return-void
.end method

.method public l(F)V
    .locals 0

    iput p1, p0, Lw6/c;->c:F

    return-void
.end method

.method public m(F)V
    .locals 0

    iput p1, p0, Lw6/c;->a:F

    return-void
.end method

.method public n(F)V
    .locals 0

    iput p1, p0, Lw6/c;->b:F

    return-void
.end method
