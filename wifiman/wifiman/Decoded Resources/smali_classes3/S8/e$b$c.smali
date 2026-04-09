.class final LS8/e$b$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS8/e$b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LS8/e$b;


# direct methods
.method constructor <init>(LS8/e$b;)V
    .locals 0

    iput-object p1, p0, LS8/e$b$c;->a:LS8/e$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LS8/e$b$c;->a:LS8/e$b;

    instance-of v2, v1, LS8/e$b$b;

    if-eqz v2, :cond_0

    new-instance v2, Lsh/i;

    invoke-virtual {v1}, LS8/e$b;->a()I

    move-result v3

    move-object v4, v1

    check-cast v4, LS8/e$b$b;

    invoke-virtual {v4}, LS8/e$b$b;->c()LS8/d;

    move-result-object v5

    invoke-virtual {v5}, LS8/d;->getWidth()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v3, v5

    invoke-virtual {v1}, LS8/e$b;->a()I

    move-result v1

    invoke-virtual {v4}, LS8/e$b$b;->c()LS8/d;

    move-result-object v4

    invoke-virtual {v4}, LS8/d;->getWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v4

    invoke-direct {v2, v3, v1}, Lsh/i;-><init>(II)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v2, v1, LS8/e$b$a;

    if-eqz v2, :cond_1

    check-cast v1, LS8/e$b$a;

    invoke-virtual {v1}, LS8/e$b$a;->c()LS8/d;

    move-result-object v2

    invoke-virtual {v2}, LS8/d;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x4

    new-instance v3, Lsh/i;

    invoke-virtual {v1}, LS8/e$b$a;->d()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {v1}, LS8/e$b$a;->d()I

    move-result v5

    add-int/2addr v5, v2

    invoke-direct {v3, v4, v5}, Lsh/i;-><init>(II)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lsh/i;

    invoke-virtual {v1}, LS8/e$b$a;->e()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {v1}, LS8/e$b$a;->e()I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {v3, v4, v1}, Lsh/i;-><init>(II)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS8/e$b$c;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
