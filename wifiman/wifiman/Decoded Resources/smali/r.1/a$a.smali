.class final Lr/a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/a;->q(Lr/d;Ljava/lang/Object;Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lr/a;

.field final synthetic e:Ljava/lang/Object;

.field final synthetic f:Lr/d;

.field final synthetic g:J

.field final synthetic h:Lmh/l;


# direct methods
.method constructor <init>(Lr/a;Ljava/lang/Object;Lr/d;JLmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/a$a;->d:Lr/a;

    iput-object p2, p0, Lr/a$a;->e:Ljava/lang/Object;

    iput-object p3, p0, Lr/a$a;->f:Lr/d;

    iput-wide p4, p0, Lr/a$a;->g:J

    iput-object p6, p0, Lr/a$a;->h:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 9

    new-instance v8, Lr/a$a;

    iget-object v1, p0, Lr/a$a;->d:Lr/a;

    iget-object v2, p0, Lr/a$a;->e:Ljava/lang/Object;

    iget-object v3, p0, Lr/a$a;->f:Lr/d;

    iget-wide v4, p0, Lr/a$a;->g:J

    iget-object v6, p0, Lr/a$a;->h:Lmh/l;

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lr/a$a;-><init>(Lr/a;Ljava/lang/Object;Lr/d;JLmh/l;Ldh/e;)V

    return-object v8
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lr/a$a;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v7, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v7, Lr/a$a;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, v7, Lr/a$a;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/J;

    iget-object v1, v7, Lr/a$a;->a:Ljava/lang/Object;

    check-cast v1, Lr/k;

    :try_start_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, v7, Lr/a$a;->d:Lr/a;

    invoke-virtual {v1}, Lr/a;->j()Lr/k;

    move-result-object v1

    iget-object v3, v7, Lr/a$a;->d:Lr/a;

    invoke-virtual {v3}, Lr/a;->l()Lr/s0;

    move-result-object v3

    invoke-interface {v3}, Lr/s0;->a()Lmh/l;

    move-result-object v3

    iget-object v4, v7, Lr/a$a;->e:Ljava/lang/Object;

    invoke-interface {v3, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr/q;

    invoke-virtual {v1, v3}, Lr/k;->w(Lr/q;)V

    iget-object v1, v7, Lr/a$a;->d:Lr/a;

    iget-object v3, v7, Lr/a$a;->f:Lr/d;

    invoke-interface {v3}, Lr/d;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lr/a;->d(Lr/a;Ljava/lang/Object;)V

    iget-object v1, v7, Lr/a$a;->d:Lr/a;

    invoke-static {v1, v2}, Lr/a;->c(Lr/a;Z)V

    iget-object v1, v7, Lr/a$a;->d:Lr/a;

    invoke-virtual {v1}, Lr/a;->j()Lr/k;

    move-result-object v8

    const/16 v16, 0x17

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/high16 v13, -0x8000000000000000L

    const/4 v15, 0x0

    invoke-static/range {v8 .. v17}, Lr/l;->h(Lr/k;Ljava/lang/Object;Lr/q;JJZILjava/lang/Object;)Lr/k;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/J;

    invoke-direct {v9}, Lkotlin/jvm/internal/J;-><init>()V

    iget-object v3, v7, Lr/a$a;->f:Lr/d;

    iget-wide v4, v7, Lr/a$a;->g:J

    new-instance v6, Lr/a$a$a;

    iget-object v1, v7, Lr/a$a;->d:Lr/a;

    iget-object v10, v7, Lr/a$a;->h:Lmh/l;

    invoke-direct {v6, v1, v8, v10, v9}, Lr/a$a$a;-><init>(Lr/a;Lr/k;Lmh/l;Lkotlin/jvm/internal/J;)V

    iput-object v8, v7, Lr/a$a;->a:Ljava/lang/Object;

    iput-object v9, v7, Lr/a$a;->b:Ljava/lang/Object;

    iput v2, v7, Lr/a$a;->c:I

    move-object v1, v8

    move-object v2, v3

    move-wide v3, v4

    move-object v5, v6

    move-object/from16 v6, p0

    invoke-static/range {v1 .. v6}, Lr/m0;->c(Lr/k;Lr/d;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v1, v8

    move-object v0, v9

    :goto_0
    iget-boolean v0, v0, Lkotlin/jvm/internal/J;->a:Z

    if-eqz v0, :cond_3

    sget-object v0, Lr/e;->BoundReached:Lr/e;

    goto :goto_1

    :cond_3
    sget-object v0, Lr/e;->Finished:Lr/e;

    :goto_1
    iget-object v2, v7, Lr/a$a;->d:Lr/a;

    invoke-static {v2}, Lr/a;->b(Lr/a;)V

    new-instance v2, Lr/g;

    invoke-direct {v2, v1, v0}, Lr/g;-><init>(Lr/k;Lr/e;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :goto_2
    iget-object v1, v7, Lr/a$a;->d:Lr/a;

    invoke-static {v1}, Lr/a;->b(Lr/a;)V

    throw v0
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lr/a$a;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/a$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lr/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
