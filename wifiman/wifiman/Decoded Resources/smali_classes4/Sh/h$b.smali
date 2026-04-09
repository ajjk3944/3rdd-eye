.class public final LSh/h$b;
.super LSh/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSh/h;->x(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final b:Ljava/util/HashMap;

.field final synthetic c:LSh/h;

.field final synthetic d:LBh/e;

.field final synthetic e:LZh/b;

.field final synthetic f:Ljava/util/List;

.field final synthetic g:LBh/g0;


# direct methods
.method constructor <init>(LSh/h;LBh/e;LZh/b;Ljava/util/List;LBh/g0;)V
    .locals 0

    iput-object p1, p0, LSh/h$b;->c:LSh/h;

    iput-object p2, p0, LSh/h$b;->d:LBh/e;

    iput-object p3, p0, LSh/h$b;->e:LZh/b;

    iput-object p4, p0, LSh/h$b;->f:Ljava/util/List;

    iput-object p5, p0, LSh/h$b;->g:LBh/g0;

    invoke-direct {p0, p1}, LSh/h$a;-><init>(LSh/h;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LSh/h$b;->b:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, LSh/h$b;->c:LSh/h;

    iget-object v1, p0, LSh/h$b;->e:LZh/b;

    iget-object v2, p0, LSh/h$b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2}, LSh/d;->F(LZh/b;Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LSh/h$b;->c:LSh/h;

    iget-object v1, p0, LSh/h$b;->e:LZh/b;

    invoke-virtual {v0, v1}, LSh/e;->w(LZh/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LSh/h$b;->f:Ljava/util/List;

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/d;

    iget-object v2, p0, LSh/h$b;->d:LBh/e;

    invoke-interface {v2}, LBh/e;->u()Lpi/d0;

    move-result-object v2

    iget-object v3, p0, LSh/h$b;->b:Ljava/util/HashMap;

    iget-object v4, p0, LSh/h$b;->g:LBh/g0;

    invoke-direct {v1, v2, v3, v4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/d;-><init>(Lpi/S;Ljava/util/Map;LBh/g0;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(LZh/f;Ljava/util/ArrayList;)V
    .locals 4

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LSh/h$b;->d:LBh/e;

    invoke-static {p1, v0}, LKh/a;->b(LZh/f;LBh/e;)LBh/s0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LSh/h$b;->b:Ljava/util/HashMap;

    sget-object v2, Ldi/i;->a:Ldi/i;

    invoke-static {p2}, Lxi/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p2

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    const-string v3, "getType(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p2, v0}, Ldi/i;->c(Ljava/util/List;Lpi/S;)Ldi/b;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    iget-object v0, p0, LSh/h$b;->c:LSh/h;

    iget-object v1, p0, LSh/h$b;->e:LZh/b;

    invoke-virtual {v0, v1}, LSh/e;->w(LZh/b;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ldi/a;

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object p2, p0, LSh/h$b;->f:Ljava/util/List;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldi/a;

    invoke-virtual {v0}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public h(LZh/f;Ldi/g;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, LSh/h$b;->b:Ljava/util/HashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
