.class final Lg2/m$l;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lr/o0;

.field final synthetic c:Lf2/w;

.field final synthetic d:Ljava/util/Map;

.field final synthetic e:LT/z1;

.field final synthetic f:Lg2/e;


# direct methods
.method constructor <init>(Lr/o0;Lf2/w;Ljava/util/Map;LT/z1;Lg2/e;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lg2/m$l;->b:Lr/o0;

    iput-object p2, p0, Lg2/m$l;->c:Lf2/w;

    iput-object p3, p0, Lg2/m$l;->d:Ljava/util/Map;

    iput-object p4, p0, Lg2/m$l;->e:LT/z1;

    iput-object p5, p0, Lg2/m$l;->f:Lg2/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance p1, Lg2/m$l;

    iget-object v1, p0, Lg2/m$l;->b:Lr/o0;

    iget-object v2, p0, Lg2/m$l;->c:Lf2/w;

    iget-object v3, p0, Lg2/m$l;->d:Ljava/util/Map;

    iget-object v4, p0, Lg2/m$l;->e:LT/z1;

    iget-object v5, p0, Lg2/m$l;->f:Lg2/e;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lg2/m$l;-><init>(Lr/o0;Lf2/w;Ljava/util/Map;LT/z1;Lg2/e;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lg2/m$l;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lg2/m$l;->a:I

    if-nez v0, :cond_5

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lg2/m$l;->b:Lr/o0;

    invoke-virtual {p1}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lg2/m$l;->b:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lg2/m$l;->c:Lf2/w;

    invoke-virtual {p1}, Lf2/n;->F()Lf2/k;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lg2/m$l;->b:Lr/o0;

    invoke-virtual {p1}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lg2/m$l;->c:Lf2/w;

    invoke-virtual {v0}, Lf2/n;->F()Lf2/k;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_0
    iget-object p1, p0, Lg2/m$l;->e:LT/z1;

    invoke-static {p1}, Lg2/m;->m(LT/z1;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lg2/m$l;->f:Lg2/e;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    invoke-virtual {v0, v1}, Lg2/e;->o(Lf2/k;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lg2/m$l;->d:Ljava/util/Map;

    iget-object v0, p0, Lg2/m$l;->b:Lr/o0;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf2/k;

    invoke-virtual {v4}, Lf2/k;->i()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lg2/m$l;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg2/m$l;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lg2/m$l;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lg2/m$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
