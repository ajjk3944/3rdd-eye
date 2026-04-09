.class final LN/R0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/R0;->i(Ljava/lang/Object;Lr/i;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:LN/R0;

.field final synthetic c:Lr/i;


# direct methods
.method constructor <init>(Ljava/lang/Object;LN/R0;Lr/i;)V
    .locals 0

    iput-object p1, p0, LN/R0$c;->a:Ljava/lang/Object;

    iput-object p2, p0, LN/R0$c;->b:LN/R0;

    iput-object p3, p0, LN/R0$c;->c:Lr/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, LN/R0$c;->b(Ljava/util/Map;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Map;Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, LN/R0$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LN/R0$c$a;

    iget v1, v0, LN/R0$c$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/R0$c$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/R0$c$a;

    invoke-direct {v0, p0, p2}, LN/R0$c$a;-><init>(LN/R0$c;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LN/R0$c$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/R0$c$a;->e:I

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, LN/R0$c$a;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object v0, v0, LN/R0$c$a;->a:Ljava/lang/Object;

    check-cast v0, LN/R0$c;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, LN/R0$c;->a:Ljava/lang/Object;

    invoke-static {p1, p2}, LN/Q0;->b(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p2

    if-eqz p2, :cond_7

    iget-object v2, p0, LN/R0$c;->b:LN/R0;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v5, p0, LN/R0$c;->c:Lr/i;

    iput-object p0, v0, LN/R0$c$a;->a:Ljava/lang/Object;

    iput-object p1, v0, LN/R0$c$a;->b:Ljava/lang/Object;

    iput v4, v0, LN/R0$c$a;->e:I

    invoke-static {v2, p2, v5, v0}, LN/R0;->a(LN/R0;FLr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, LN/R0$c;->b:LN/R0;

    invoke-static {p2}, LN/R0;->b(LN/R0;)LT/m0;

    move-result-object p2

    invoke-interface {p2}, LT/m0;->c()F

    move-result p2

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    sub-float/2addr v4, p2

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v4, v4, v3

    if-gez v4, :cond_4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    iget-object p1, v0, LN/R0$c;->b:LN/R0;

    invoke-virtual {p1}, LN/R0;->o()Ljava/lang/Object;

    move-result-object p1

    :cond_6
    iget-object p2, v0, LN/R0$c;->b:LN/R0;

    invoke-static {p2, p1}, LN/R0;->g(LN/R0;Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception p2

    move-object v0, p0

    goto :goto_3

    :cond_7
    :try_start_2
    const-string p2, "The target value must have an associated anchor."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    iget-object v1, v0, LN/R0$c;->b:LN/R0;

    invoke-static {v1}, LN/R0;->b(LN/R0;)LT/m0;

    move-result-object v1

    invoke-interface {v1}, LT/m0;->c()F

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    sub-float/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v5, v5, v3

    if-gez v5, :cond_8

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_9
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_a

    iget-object p1, v0, LN/R0$c;->b:LN/R0;

    invoke-virtual {p1}, LN/R0;->o()Ljava/lang/Object;

    move-result-object p1

    :cond_a
    iget-object v0, v0, LN/R0$c;->b:LN/R0;

    invoke-static {v0, p1}, LN/R0;->g(LN/R0;Ljava/lang/Object;)V

    throw p2
.end method
