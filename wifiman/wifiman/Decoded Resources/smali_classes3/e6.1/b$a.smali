.class public final Le6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le6/a;
.implements Lu6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le6/b;->a(Landroid/graphics/Canvas;ILu6/e;LD6/a;Lj6/b;Landroid/graphics/RectF;FLi6/a;)Le6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:Lu6/e;

.field private final b:Landroid/graphics/RectF;

.field private c:Landroid/graphics/Canvas;

.field private final d:J

.field private final e:LD6/a;

.field private final f:F

.field private final g:Lj6/b;

.field private final h:F

.field final synthetic i:Lu6/e;

.field final synthetic j:Landroid/graphics/RectF;

.field final synthetic k:Lj6/b;

.field final synthetic l:Li6/a;


# direct methods
.method constructor <init>(Lu6/e;Landroid/graphics/RectF;Landroid/graphics/Canvas;ILD6/a;Lj6/b;FLi6/a;)V
    .locals 0

    iput-object p1, p0, Le6/b$a;->i:Lu6/e;

    iput-object p2, p0, Le6/b$a;->j:Landroid/graphics/RectF;

    iput-object p6, p0, Le6/b$a;->k:Lj6/b;

    iput-object p8, p0, Le6/b$a;->l:Li6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le6/b$a;->a:Lu6/e;

    iput-object p2, p0, Le6/b$a;->b:Landroid/graphics/RectF;

    iput-object p3, p0, Le6/b$a;->c:Landroid/graphics/Canvas;

    int-to-long p1, p4

    iput-wide p1, p0, Le6/b$a;->d:J

    iput-object p5, p0, Le6/b$a;->e:LD6/a;

    invoke-direct {p0}, Le6/b$a;->r()F

    move-result p1

    iput p1, p0, Le6/b$a;->f:F

    invoke-virtual {p0}, Le6/b$a;->l()F

    move-result p1

    invoke-interface {p6, p1}, Lj6/b;->c(F)Lj6/b;

    move-result-object p1

    iput-object p1, p0, Le6/b$a;->g:Lj6/b;

    iput p7, p0, Le6/b$a;->h:F

    return-void
.end method

.method private final r()F
    .locals 5

    iget-object v0, p0, Le6/b$a;->k:Lj6/b;

    invoke-interface {v0}, Lj6/b;->a()F

    move-result v0

    invoke-virtual {p0}, Le6/b$a;->c()Lk6/c;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lk6/c;->b(Lk6/c;LY5/c$b;ILjava/lang/Object;)Lk6/d;

    move-result-object v1

    invoke-virtual {v1}, Lk6/d;->g()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Le6/b$a;->j:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    cmpg-float v1, v0, v1

    const/4 v2, 0x0

    if-gez v1, :cond_0

    iget-object v1, p0, Le6/b$a;->l:Li6/a;

    sget-object v4, Li6/a;->None:Li6/a;

    if-ne v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {p0}, Le6/b$a;->f()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Le6/b$a;->j:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v4

    cmpl-float v4, v0, v4

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-nez v1, :cond_3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p0, Le6/b$a;->j:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v1, v0

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v0, p0, Le6/b$a;->i:Lu6/e;

    invoke-interface {v0}, Lu6/e;->l()F

    move-result v1

    :goto_3
    return v1
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Le6/b$a;->d:J

    return-wide v0
.end method

.method public b(F)F
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0, p1}, Lu6/e;->b(F)F

    move-result p1

    return p1
.end method

.method public c()Lk6/c;
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0}, Lu6/e;->c()Lk6/c;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/graphics/Canvas;
    .locals 1

    iget-object v0, p0, Le6/b$a;->c:Landroid/graphics/Canvas;

    return-object v0
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0, p1, p2}, Lu6/c;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0}, Lu6/e;->f()Z

    move-result v0

    return v0
.end method

.method public g(F)F
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0, p1}, Lu6/e;->g(F)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0}, Lu6/e;->getDensity()F

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0}, Lu6/e;->h()Z

    move-result v0

    return v0
.end method

.method public i()Lj6/b;
    .locals 1

    iget-object v0, p0, Le6/b$a;->g:Lj6/b;

    return-object v0
.end method

.method public j()F
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0}, Lu6/e;->j()F

    move-result v0

    return v0
.end method

.method public k()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Le6/b$a;->b:Landroid/graphics/RectF;

    return-object v0
.end method

.method public l()F
    .locals 1

    iget v0, p0, Le6/b$a;->f:F

    return v0
.end method

.method public m(F)F
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0, p1}, Lu6/e;->m(F)F

    move-result p1

    return p1
.end method

.method public n()F
    .locals 1

    iget v0, p0, Le6/b$a;->h:F

    return v0
.end method

.method public o(F)I
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0, p1}, Lu6/e;->o(F)I

    move-result p1

    return p1
.end method

.method public p(Ljava/lang/Object;)Z
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0, p1}, Lu6/c;->p(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0, p1}, Lu6/c;->q(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Le6/b$a;->a:Lu6/e;

    invoke-interface {v0}, Lu6/e;->y()F

    move-result v0

    return v0
.end method
