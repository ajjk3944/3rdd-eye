.class final LC/D$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/D;->d(LB/h;IFLr/i;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/p;

.field final synthetic d:I

.field final synthetic e:LB/h;

.field final synthetic f:F

.field final synthetic g:Lr/i;


# direct methods
.method constructor <init>(Lmh/p;ILB/h;FLr/i;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LC/D$c;->c:Lmh/p;

    iput p2, p0, LC/D$c;->d:I

    iput-object p3, p0, LC/D$c;->e:LB/h;

    iput p4, p0, LC/D$c;->f:F

    iput-object p5, p0, LC/D$c;->g:Lr/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, LC/D$c;

    iget-object v1, p0, LC/D$c;->c:Lmh/p;

    iget v2, p0, LC/D$c;->d:I

    iget-object v3, p0, LC/D$c;->e:LB/h;

    iget v4, p0, LC/D$c;->f:F

    iget-object v5, p0, LC/D$c;->g:Lr/i;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LC/D$c;-><init>(Lmh/p;ILB/h;FLr/i;Ldh/e;)V

    iput-object p1, v7, LC/D$c;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/v;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LC/D$c;->n(Lw/v;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LC/D$c;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LC/D$c;->b:Ljava/lang/Object;

    check-cast p1, Lw/v;

    iget-object v1, p0, LC/D$c;->c:Lmh/p;

    iget v3, p0, LC/D$c;->d:I

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->d(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, p1, v3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, LC/D$c;->d:I

    iget-object v3, p0, LC/D$c;->e:LB/h;

    invoke-interface {v3}, LB/h;->g()I

    move-result v3

    const/4 v4, 0x0

    if-le v1, v3, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move v1, v4

    :goto_0
    iget-object v3, p0, LC/D$c;->e:LB/h;

    invoke-interface {v3}, LB/h;->c()I

    move-result v3

    iget-object v5, p0, LC/D$c;->e:LB/h;

    invoke-interface {v5}, LB/h;->g()I

    move-result v5

    sub-int/2addr v3, v5

    add-int/2addr v3, v2

    if-eqz v1, :cond_3

    iget v5, p0, LC/D$c;->d:I

    iget-object v6, p0, LC/D$c;->e:LB/h;

    invoke-interface {v6}, LB/h;->c()I

    move-result v6

    if-gt v5, v6, :cond_4

    :cond_3
    if-nez v1, :cond_6

    iget v5, p0, LC/D$c;->d:I

    iget-object v6, p0, LC/D$c;->e:LB/h;

    invoke-interface {v6}, LB/h;->g()I

    move-result v6

    if-ge v5, v6, :cond_6

    :cond_4
    iget v5, p0, LC/D$c;->d:I

    iget-object v6, p0, LC/D$c;->e:LB/h;

    invoke-interface {v6}, LB/h;->g()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/4 v6, 0x3

    if-lt v5, v6, :cond_6

    if-eqz v1, :cond_5

    iget v1, p0, LC/D$c;->d:I

    sub-int/2addr v1, v3

    iget-object v3, p0, LC/D$c;->e:LB/h;

    invoke-interface {v3}, LB/h;->g()I

    move-result v3

    invoke-static {v1, v3}, Lsh/m;->d(II)I

    move-result v1

    goto :goto_1

    :cond_5
    iget v1, p0, LC/D$c;->d:I

    add-int/2addr v1, v3

    iget-object v3, p0, LC/D$c;->e:LB/h;

    invoke-interface {v3}, LB/h;->g()I

    move-result v3

    invoke-static {v1, v3}, Lsh/m;->g(II)I

    move-result v1

    :goto_1
    iget-object v3, p0, LC/D$c;->e:LB/h;

    invoke-interface {v3, p1, v1, v4}, LB/h;->b(Lw/v;II)V

    :cond_6
    iget-object v1, p0, LC/D$c;->e:LB/h;

    iget v3, p0, LC/D$c;->d:I

    invoke-interface {v1, v3}, LB/h;->f(I)F

    move-result v1

    iget v3, p0, LC/D$c;->f:F

    add-float v5, v1, v3

    new-instance v1, Lkotlin/jvm/internal/K;

    invoke-direct {v1}, Lkotlin/jvm/internal/K;-><init>()V

    iget-object v7, p0, LC/D$c;->g:Lr/i;

    new-instance v8, LC/D$c$a;

    invoke-direct {v8, v1, p1}, LC/D$c$a;-><init>(Lkotlin/jvm/internal/K;Lw/v;)V

    iput v2, p0, LC/D$c;->a:I

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v4 .. v11}, Lr/m0;->e(FFFLr/i;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/v;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LC/D$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LC/D$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LC/D$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
