.class final Lw/B$f$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/B$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:J

.field f:I

.field private synthetic g:Ljava/lang/Object;

.field final synthetic h:LIi/N;

.field final synthetic i:Lmh/q;

.field final synthetic j:Lmh/l;

.field final synthetic k:Lmh/l;

.field final synthetic l:Lmh/l;

.field final synthetic m:Lw/s;


# direct methods
.method constructor <init>(LIi/N;Lmh/q;Lmh/l;Lmh/l;Lmh/l;Lw/s;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/B$f$a;->h:LIi/N;

    iput-object p2, p0, Lw/B$f$a;->i:Lmh/q;

    iput-object p3, p0, Lw/B$f$a;->j:Lmh/l;

    iput-object p4, p0, Lw/B$f$a;->k:Lmh/l;

    iput-object p5, p0, Lw/B$f$a;->l:Lmh/l;

    iput-object p6, p0, Lw/B$f$a;->m:Lw/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 9

    new-instance v8, Lw/B$f$a;

    iget-object v1, p0, Lw/B$f$a;->h:LIi/N;

    iget-object v2, p0, Lw/B$f$a;->i:Lmh/q;

    iget-object v3, p0, Lw/B$f$a;->j:Lmh/l;

    iget-object v4, p0, Lw/B$f$a;->k:Lmh/l;

    iget-object v5, p0, Lw/B$f$a;->l:Lmh/l;

    iget-object v6, p0, Lw/B$f$a;->m:Lw/s;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lw/B$f$a;-><init>(LIi/N;Lmh/q;Lmh/l;Lmh/l;Lmh/l;Lw/s;Ldh/e;)V

    iput-object p1, v8, Lw/B$f$a;->g:Ljava/lang/Object;

    return-object v8
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/B$f$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v6, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v7

    iget v0, v6, Lw/B$f$a;->f:I

    const/4 v8, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget-object v0, v6, Lw/B$f$a;->c:Ljava/lang/Object;

    check-cast v0, Ly0/y;

    iget-object v1, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    iget-object v2, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    check-cast v2, Ly0/b;

    :try_start_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_4

    goto/16 :goto_8

    :pswitch_2
    iget-wide v0, v6, Lw/B$f$a;->e:J

    iget-object v2, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v3, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    check-cast v3, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v4, v2

    move-object/from16 v2, p1

    goto/16 :goto_6

    :pswitch_3
    iget-wide v0, v6, Lw/B$f$a;->e:J

    iget-object v2, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v3, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    check-cast v3, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    iget-wide v0, v6, Lw/B$f$a;->e:J

    iget-object v2, v6, Lw/B$f$a;->d:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v3, v6, Lw/B$f$a;->c:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/N;

    iget-object v4, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    check-cast v4, Ly0/y;

    iget-object v5, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    check-cast v5, Ly0/b;

    :try_start_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v9, v5

    move-object v5, v4

    move-object v4, v3

    move-object/from16 v3, p1

    goto/16 :goto_2

    :catch_0
    move-object v2, v3

    :catch_1
    move-object v3, v5

    goto/16 :goto_3

    :pswitch_5
    iget-object v0, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    check-cast v0, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v5, v0

    move-object/from16 v0, p1

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v0, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ly0/b;

    iput-object v9, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, v6, Lw/B$f$a;->f:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, v9

    move-object/from16 v3, p0

    invoke-static/range {v0 .. v5}, Lw/B;->f(Ly0/b;ZLy0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    return-object v7

    :cond_0
    move-object v5, v9

    :goto_0
    move-object v4, v0

    check-cast v4, Ly0/y;

    invoke-virtual {v4}, Ly0/y;->a()V

    iget-object v9, v6, Lw/B$f$a;->h:LIi/N;

    new-instance v12, Lw/B$f$a$b;

    iget-object v0, v6, Lw/B$f$a;->m:Lw/s;

    invoke-direct {v12, v0, v8}, Lw/B$f$a$b;-><init>(Lw/s;Ldh/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iget-object v0, v6, Lw/B$f$a;->i:Lmh/q;

    invoke-static {}, Lw/B;->c()Lmh/q;

    move-result-object v1

    if-eq v0, v1, :cond_1

    iget-object v9, v6, Lw/B$f$a;->h:LIi/N;

    new-instance v12, Lw/B$f$a$c;

    iget-object v0, v6, Lw/B$f$a;->i:Lmh/q;

    iget-object v1, v6, Lw/B$f$a;->m:Lw/s;

    invoke-direct {v12, v0, v1, v4, v8}, Lw/B$f$a$c;-><init>(Lmh/q;Lw/s;Ly0/y;Ldh/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_1
    iget-object v0, v6, Lw/B$f$a;->j:Lmh/l;

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/platform/w1;->c()J

    move-result-wide v0

    goto :goto_1

    :cond_2
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    :goto_1
    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    :try_start_2
    new-instance v3, Lw/B$f$a$d;

    invoke-direct {v3, v8}, Lw/B$f$a$d;-><init>(Ldh/e;)V

    iput-object v5, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    iput-object v4, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    iput-object v2, v6, Lw/B$f$a;->c:Ljava/lang/Object;

    iput-object v2, v6, Lw/B$f$a;->d:Ljava/lang/Object;

    iput-wide v0, v6, Lw/B$f$a;->e:J

    const/4 v9, 0x2

    iput v9, v6, Lw/B$f$a;->f:I

    invoke-interface {v5, v0, v1, v3, v6}, Ly0/b;->O0(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v3, v7, :cond_3

    return-object v7

    :cond_3
    move-object v9, v5

    move-object v5, v4

    move-object v4, v2

    :goto_2
    :try_start_3
    iput-object v3, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v2, :cond_4

    iget-object v10, v6, Lw/B$f$a;->h:LIi/N;

    new-instance v13, Lw/B$f$a$e;

    iget-object v2, v6, Lw/B$f$a;->m:Lw/s;

    invoke-direct {v13, v2, v8}, Lw/B$f$a$e;-><init>(Lw/s;Ldh/e;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_5

    :catch_2
    move-object v2, v4

    move-object v4, v5

    move-object v3, v9

    goto :goto_3

    :cond_4
    check-cast v2, Ly0/y;

    invoke-virtual {v2}, Ly0/y;->a()V

    iget-object v10, v6, Lw/B$f$a;->h:LIi/N;

    new-instance v13, Lw/B$f$a$f;

    iget-object v2, v6, Lw/B$f$a;->m:Lw/s;

    invoke-direct {v13, v2, v8}, Lw/B$f$a$f;-><init>(Lw/s;Ldh/e;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;
    :try_end_3
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_5

    :goto_3
    iget-object v5, v6, Lw/B$f$a;->j:Lmh/l;

    if-eqz v5, :cond_5

    invoke-virtual {v4}, Ly0/y;->h()J

    move-result-wide v9

    invoke-static {v9, v10}, Ll0/g;->d(J)Ll0/g;

    move-result-object v4

    invoke-interface {v5, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iput-object v3, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    iput-object v2, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    iput-object v8, v6, Lw/B$f$a;->c:Ljava/lang/Object;

    iput-object v8, v6, Lw/B$f$a;->d:Ljava/lang/Object;

    iput-wide v0, v6, Lw/B$f$a;->e:J

    const/4 v4, 0x3

    iput v4, v6, Lw/B$f$a;->f:I

    invoke-static {v3, v6}, Lw/B;->b(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_6

    return-object v7

    :cond_6
    :goto_4
    iget-object v9, v6, Lw/B$f$a;->h:LIi/N;

    new-instance v12, Lw/B$f$a$g;

    iget-object v4, v6, Lw/B$f$a;->m:Lw/s;

    invoke-direct {v12, v4, v8}, Lw/B$f$a$g;-><init>(Lw/s;Ldh/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-object v4, v2

    move-object v9, v3

    :goto_5
    iget-object v2, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v2, :cond_e

    iget-object v3, v6, Lw/B$f$a;->k:Lmh/l;

    if-nez v3, :cond_7

    iget-object v0, v6, Lw/B$f$a;->l:Lmh/l;

    if-eqz v0, :cond_e

    check-cast v2, Ly0/y;

    invoke-virtual {v2}, Ly0/y;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_7
    check-cast v2, Ly0/y;

    iput-object v9, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    iput-object v4, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    iput-object v8, v6, Lw/B$f$a;->c:Ljava/lang/Object;

    iput-object v8, v6, Lw/B$f$a;->d:Ljava/lang/Object;

    iput-wide v0, v6, Lw/B$f$a;->e:J

    const/4 v3, 0x4

    iput v3, v6, Lw/B$f$a;->f:I

    invoke-static {v9, v2, v6}, Lw/B;->a(Ly0/b;Ly0/y;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_8

    return-object v7

    :cond_8
    move-object v3, v9

    :goto_6
    check-cast v2, Ly0/y;

    if-nez v2, :cond_9

    iget-object v0, v6, Lw/B$f$a;->l:Lmh/l;

    if-eqz v0, :cond_e

    iget-object v1, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, Ly0/y;

    invoke-virtual {v1}, Ly0/y;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_9
    iget-object v9, v6, Lw/B$f$a;->h:LIi/N;

    new-instance v12, Lw/B$f$a$h;

    iget-object v5, v6, Lw/B$f$a;->m:Lw/s;

    invoke-direct {v12, v5, v8}, Lw/B$f$a$h;-><init>(Lw/s;Ldh/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iget-object v5, v6, Lw/B$f$a;->i:Lmh/q;

    invoke-static {}, Lw/B;->c()Lmh/q;

    move-result-object v9

    if-eq v5, v9, :cond_a

    iget-object v10, v6, Lw/B$f$a;->h:LIi/N;

    new-instance v13, Lw/B$f$a$i;

    iget-object v5, v6, Lw/B$f$a;->i:Lmh/q;

    iget-object v9, v6, Lw/B$f$a;->m:Lw/s;

    invoke-direct {v13, v5, v9, v2, v8}, Lw/B$f$a$i;-><init>(Lmh/q;Lw/s;Ly0/y;Ldh/e;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_a
    :try_start_4
    new-instance v5, Lw/B$f$a$j;

    iget-object v10, v6, Lw/B$f$a;->h:LIi/N;

    iget-object v11, v6, Lw/B$f$a;->k:Lmh/l;

    iget-object v12, v6, Lw/B$f$a;->l:Lmh/l;

    iget-object v14, v6, Lw/B$f$a;->m:Lw/s;

    const/4 v15, 0x0

    move-object v9, v5

    move-object v13, v4

    invoke-direct/range {v9 .. v15}, Lw/B$f$a$j;-><init>(LIi/N;Lmh/l;Lmh/l;Lkotlin/jvm/internal/N;Lw/s;Ldh/e;)V

    iput-object v3, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    iput-object v4, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    iput-object v2, v6, Lw/B$f$a;->c:Ljava/lang/Object;

    const/4 v9, 0x5

    iput v9, v6, Lw/B$f$a;->f:I

    invoke-interface {v3, v0, v1, v5, v6}, Ly0/b;->O0(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_4 .. :try_end_4} :catch_3

    if-ne v0, v7, :cond_e

    return-object v7

    :catch_3
    move-object v0, v2

    move-object v2, v3

    move-object v1, v4

    :catch_4
    iget-object v3, v6, Lw/B$f$a;->l:Lmh/l;

    if-eqz v3, :cond_b

    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, Ly0/y;

    invoke-virtual {v1}, Ly0/y;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/g;->d(J)Ll0/g;

    move-result-object v1

    invoke-interface {v3, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget-object v1, v6, Lw/B$f$a;->j:Lmh/l;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ly0/y;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iput-object v8, v6, Lw/B$f$a;->g:Ljava/lang/Object;

    iput-object v8, v6, Lw/B$f$a;->b:Ljava/lang/Object;

    iput-object v8, v6, Lw/B$f$a;->c:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, v6, Lw/B$f$a;->f:I

    invoke-static {v2, v6}, Lw/B;->b(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_d

    return-object v7

    :cond_d
    :goto_7
    iget-object v9, v6, Lw/B$f$a;->h:LIi/N;

    new-instance v12, Lw/B$f$a$a;

    iget-object v0, v6, Lw/B$f$a;->m:Lw/s;

    invoke-direct {v12, v0, v8}, Lw/B$f$a$a;-><init>(Lw/s;Ldh/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_e
    :goto_8
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/B$f$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/B$f$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/B$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
