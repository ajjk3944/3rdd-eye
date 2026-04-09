.class final Lb1/o$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/o;->e(Lb1/B;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lb1/o;

.field final synthetic c:Lb1/B;


# direct methods
.method constructor <init>(Ljava/util/List;Lb1/o;Lb1/B;)V
    .locals 0

    iput-object p1, p0, Lb1/o$a;->a:Ljava/util/List;

    iput-object p2, p0, Lb1/o$a;->b:Lb1/o;

    iput-object p3, p0, Lb1/o$a;->c:Lb1/B;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, Lb1/o$a;->a:Ljava/util/List;

    iget-object v1, p0, Lb1/o$a;->b:Lb1/o;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    invoke-interface {v4}, LC0/n;->b()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lb1/k;

    if-eqz v5, :cond_0

    check-cast v4, Lb1/k;

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lb1/k;->b()Lb1/f;

    move-result-object v5

    invoke-virtual {v1}, Lb1/o;->i()Lb1/l;

    move-result-object v6

    invoke-virtual {v6, v5}, Lb1/i;->b(Lb1/x;)Landroidx/constraintlayout/core/parser/d;

    move-result-object v6

    new-instance v7, Lb1/e;

    invoke-virtual {v5}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v7, v5, v6}, Lb1/e;-><init>(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/d;)V

    invoke-virtual {v4}, Lb1/k;->a()Lmh/l;

    move-result-object v5

    invoke-interface {v5, v7}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {v1}, Lb1/o;->g(Lb1/o;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lb1/o$a;->b:Lb1/o;

    invoke-virtual {v0}, Lb1/o;->i()Lb1/l;

    move-result-object v0

    iget-object v1, p0, Lb1/o$a;->c:Lb1/B;

    invoke-virtual {v0, v1}, Lb1/i;->a(Lb1/B;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb1/o$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
