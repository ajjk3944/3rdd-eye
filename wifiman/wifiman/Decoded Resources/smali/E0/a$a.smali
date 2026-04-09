.class final LE0/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/a;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/a;


# direct methods
.method constructor <init>(LE0/a;)V
    .locals 0

    iput-object p1, p0, LE0/a$a;->a:LE0/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/b;)V
    .locals 5

    invoke-interface {p1}, LE0/b;->q()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LE0/b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LE0/b;->g0()V

    :cond_1
    invoke-interface {p1}, LE0/b;->p()LE0/a;

    move-result-object v0

    invoke-static {v0}, LE0/a;->b(LE0/a;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LE0/a$a;->a:LE0/a;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC0/a;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {p1}, LE0/b;->B()LE0/c0;

    move-result-object v4

    invoke-static {v1, v3, v2, v4}, LE0/a;->a(LE0/a;LC0/a;ILE0/c0;)V

    goto :goto_0

    :cond_2
    invoke-interface {p1}, LE0/b;->B()LE0/c0;

    move-result-object p1

    invoke-virtual {p1}, LE0/c0;->I2()LE0/c0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_1
    iget-object v0, p0, LE0/a$a;->a:LE0/a;

    invoke-virtual {v0}, LE0/a;->f()LE0/b;

    move-result-object v0

    invoke-interface {v0}, LE0/b;->B()LE0/c0;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LE0/a$a;->a:LE0/a;

    invoke-virtual {v0, p1}, LE0/a;->e(LE0/c0;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LE0/a$a;->a:LE0/a;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC0/a;

    invoke-virtual {v1, p1, v2}, LE0/a;->i(LE0/c0;LC0/a;)I

    move-result v3

    invoke-static {v1, v2, v3, p1}, LE0/a;->a(LE0/a;LC0/a;ILE0/c0;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, LE0/c0;->I2()LE0/c0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/b;

    invoke-virtual {p0, p1}, LE0/a$a;->a(LE0/b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
