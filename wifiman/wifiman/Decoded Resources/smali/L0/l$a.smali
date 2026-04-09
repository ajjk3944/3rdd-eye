.class final LL0/l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL0/l;-><init>(LL0/d;LL0/U;Ljava/util/List;LY0/d;LQ0/k$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL0/l;


# direct methods
.method constructor <init>(LL0/l;)V
    .locals 0

    iput-object p1, p0, LL0/l$a;->a:LL0/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 8

    iget-object v0, p0, LL0/l$a;->a:LL0/l;

    invoke-virtual {v0}, LL0/l;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LL0/r;

    invoke-virtual {v2}, LL0/r;->b()LL0/s;

    move-result-object v2

    invoke-interface {v2}, LL0/s;->b()F

    move-result v2

    invoke-static {v0}, LZg/v;->n(Ljava/util/List;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_2

    :goto_0
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LL0/r;

    invoke-virtual {v6}, LL0/r;->b()LL0/s;

    move-result-object v6

    invoke-interface {v6}, LL0/s;->b()F

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-gez v7, :cond_1

    move-object v1, v5

    move v2, v6

    :cond_1
    if-eq v4, v3, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, LL0/r;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LL0/r;->b()LL0/s;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LL0/s;->b()F

    move-result v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL0/l$a;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
