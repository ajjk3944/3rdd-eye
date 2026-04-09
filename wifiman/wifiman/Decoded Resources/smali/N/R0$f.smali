.class final LN/R0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/R0;->y(FLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/R0;

.field final synthetic b:F


# direct methods
.method constructor <init>(LN/R0;F)V
    .locals 0

    iput-object p1, p0, LN/R0$f;->a:LN/R0;

    iput p2, p0, LN/R0$f;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, LN/R0$f;->b(Ljava/util/Map;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Map;Ldh/e;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LN/R0$f;->a:LN/R0;

    invoke-virtual {v0}, LN/R0;->o()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, LN/Q0;->b(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, LN/R0$f;->a:LN/R0;

    invoke-virtual {v1}, LN/R0;->s()LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    iget-object v2, p0, LN/R0$f;->a:LN/R0;

    invoke-virtual {v2}, LN/R0;->v()Lmh/p;

    move-result-object v4

    iget v5, p0, LN/R0$f;->b:F

    iget-object v2, p0, LN/R0$f;->a:LN/R0;

    invoke-virtual {v2}, LN/R0;->w()F

    move-result v6

    move v2, v0

    invoke-static/range {v1 .. v6}, LN/Q0;->a(FFLjava/util/Set;Lmh/p;FF)F

    move-result v1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object p1, p0, LN/R0$f;->a:LN/R0;

    invoke-virtual {p1}, LN/R0;->n()Lmh/l;

    move-result-object p1

    invoke-interface {p1, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object v2, p0, LN/R0$f;->a:LN/R0;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, LN/R0;->j(LN/R0;Ljava/lang/Object;Lr/i;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    iget-object p1, p0, LN/R0$f;->a:LN/R0;

    invoke-virtual {p1}, LN/R0;->m()Lr/i;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, LN/R0;->a(LN/R0;FLr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
