.class final LB/K$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/K;-><init>(Lsh/i;LB/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lo/E;

.field final synthetic d:LB/K;


# direct methods
.method constructor <init>(IILo/E;LB/K;)V
    .locals 0

    iput p1, p0, LB/K$a;->a:I

    iput p2, p0, LB/K$a;->b:I

    iput-object p3, p0, LB/K$a;->c:Lo/E;

    iput-object p4, p0, LB/K$a;->d:LB/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB/d$a;)V
    .locals 6

    invoke-virtual {p1}, LB/d$a;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/o$a;

    invoke-interface {v0}, LB/o$a;->getKey()Lmh/l;

    move-result-object v0

    iget v1, p0, LB/K$a;->a:I

    invoke-virtual {p1}, LB/d$a;->b()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v2, p0, LB/K$a;->b:I

    invoke-virtual {p1}, LB/d$a;->b()I

    move-result v3

    invoke-virtual {p1}, LB/d$a;->a()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-gt v1, v2, :cond_2

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {p1}, LB/d$a;->b()I

    move-result v3

    sub-int v3, v1, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    invoke-static {v1}, LB/I;->a(I)Ljava/lang/Object;

    move-result-object v3

    :cond_1
    iget-object v4, p0, LB/K$a;->c:Lo/E;

    invoke-virtual {v4, v3, v1}, Lo/E;->r(Ljava/lang/Object;I)V

    iget-object v4, p0, LB/K$a;->d:LB/K;

    invoke-static {v4}, LB/K;->a(LB/K;)[Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, LB/K$a;->d:LB/K;

    invoke-static {v5}, LB/K;->d(LB/K;)I

    move-result v5

    sub-int v5, v1, v5

    aput-object v3, v4, v5

    if-eq v1, v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB/d$a;

    invoke-virtual {p0, p1}, LB/K$a;->a(LB/d$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
