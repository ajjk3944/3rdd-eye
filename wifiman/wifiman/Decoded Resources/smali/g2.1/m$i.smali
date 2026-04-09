.class final Lg2/m$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lg2/e;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lmh/l;

.field final synthetic e:Lmh/l;

.field final synthetic f:LT/z1;

.field final synthetic g:LT/q0;


# direct methods
.method constructor <init>(Ljava/util/Map;Lg2/e;Lmh/l;Lmh/l;Lmh/l;LT/z1;LT/q0;)V
    .locals 0

    iput-object p1, p0, Lg2/m$i;->a:Ljava/util/Map;

    iput-object p2, p0, Lg2/m$i;->b:Lg2/e;

    iput-object p3, p0, Lg2/m$i;->c:Lmh/l;

    iput-object p4, p0, Lg2/m$i;->d:Lmh/l;

    iput-object p5, p0, Lg2/m$i;->e:Lmh/l;

    iput-object p6, p0, Lg2/m$i;->f:LT/z1;

    iput-object p7, p0, Lg2/m$i;->g:LT/q0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/animation/d;)Lq/i;
    .locals 5

    iget-object v0, p0, Lg2/m$i;->f:LT/z1;

    invoke-static {v0}, Lg2/m;->m(LT/z1;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lg2/m$i;->a:Ljava/util/Map;

    invoke-interface {p1}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    invoke-virtual {v1}, Lf2/k;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg2/m$i;->a:Ljava/util/Map;

    invoke-interface {p1}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    invoke-virtual {v1}, Lf2/k;->i()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v2

    :goto_0
    invoke-interface {p1}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    invoke-virtual {v1}, Lf2/k;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lg2/m$i;->b:Lg2/e;

    invoke-virtual {v1}, Lg2/e;->n()LT/q0;

    move-result-object v1

    invoke-interface {v1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v1, :cond_3

    iget-object v1, p0, Lg2/m$i;->g:LT/q0;

    invoke-static {v1}, Lg2/m;->j(LT/q0;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    add-float/2addr v0, v2

    goto :goto_2

    :cond_3
    :goto_1
    sub-float/2addr v0, v2

    :goto_2
    iget-object v1, p0, Lg2/m$i;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {p1}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/k;

    invoke-virtual {v3}, Lf2/k;->i()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lq/i;

    iget-object v2, p0, Lg2/m$i;->c:Lmh/l;

    invoke-interface {v2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/animation/i;

    iget-object v3, p0, Lg2/m$i;->d:Lmh/l;

    invoke-interface {v3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/animation/k;

    iget-object v4, p0, Lg2/m$i;->e:Lmh/l;

    invoke-interface {v4, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq/v;

    invoke-direct {v1, v2, v3, v0, p1}, Lq/i;-><init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;FLq/v;)V

    goto :goto_3

    :cond_4
    sget-object p1, Landroidx/compose/animation/i;->a:Landroidx/compose/animation/i$a;

    invoke-virtual {p1}, Landroidx/compose/animation/i$a;->a()Landroidx/compose/animation/i;

    move-result-object p1

    sget-object v0, Landroidx/compose/animation/k;->a:Landroidx/compose/animation/k$a;

    invoke-virtual {v0}, Landroidx/compose/animation/k$a;->a()Landroidx/compose/animation/k;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->e(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)Lq/i;

    move-result-object v1

    :goto_3
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/animation/d;

    invoke-virtual {p0, p1}, Lg2/m$i;->a(Landroidx/compose/animation/d;)Lq/i;

    move-result-object p1

    return-object p1
.end method
