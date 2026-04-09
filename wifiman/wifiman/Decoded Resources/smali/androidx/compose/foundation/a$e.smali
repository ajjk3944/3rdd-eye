.class final Landroidx/compose/foundation/a$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/a;->X2(Lw/r;JLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Z

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Lw/r;

.field final synthetic e:J

.field final synthetic f:Ly/m;

.field final synthetic g:Landroidx/compose/foundation/a;


# direct methods
.method constructor <init>(Lw/r;JLy/m;Landroidx/compose/foundation/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/a$e;->d:Lw/r;

    iput-wide p2, p0, Landroidx/compose/foundation/a$e;->e:J

    iput-object p4, p0, Landroidx/compose/foundation/a$e;->f:Ly/m;

    iput-object p5, p0, Landroidx/compose/foundation/a$e;->g:Landroidx/compose/foundation/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, Landroidx/compose/foundation/a$e;

    iget-object v1, p0, Landroidx/compose/foundation/a$e;->d:Lw/r;

    iget-wide v2, p0, Landroidx/compose/foundation/a$e;->e:J

    iget-object v4, p0, Landroidx/compose/foundation/a$e;->f:Ly/m;

    iget-object v5, p0, Landroidx/compose/foundation/a$e;->g:Landroidx/compose/foundation/a;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/a$e;-><init>(Lw/r;JLy/m;Landroidx/compose/foundation/a;Ldh/e;)V

    iput-object p1, v7, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/a$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/a$e;->b:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v2, v0, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    check-cast v2, Ly/o$c;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-boolean v2, v0, Landroidx/compose/foundation/a$e;->a:Z

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v2, v0, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    check-cast v2, LIi/y0;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, LIi/N;

    new-instance v2, Landroidx/compose/foundation/a$e$a;

    iget-object v11, v0, Landroidx/compose/foundation/a$e;->g:Landroidx/compose/foundation/a;

    iget-wide v12, v0, Landroidx/compose/foundation/a$e;->e:J

    iget-object v14, v0, Landroidx/compose/foundation/a$e;->f:Ly/m;

    const/4 v15, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, Landroidx/compose/foundation/a$e$a;-><init>(Landroidx/compose/foundation/a;JLy/m;Ldh/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v12, v2

    invoke-static/range {v9 .. v14}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object v2

    iget-object v9, v0, Landroidx/compose/foundation/a$e;->d:Lw/r;

    iput-object v2, v0, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    iput v7, v0, Landroidx/compose/foundation/a$e;->b:I

    invoke-interface {v9, v0}, Lw/r;->q0(Ldh/e;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_6

    return-object v1

    :cond_6
    :goto_1
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-interface {v2}, LIi/y0;->isActive()Z

    move-result v9

    if-eqz v9, :cond_9

    iput-object v8, v0, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    iput-boolean v7, v0, Landroidx/compose/foundation/a$e;->a:Z

    iput v6, v0, Landroidx/compose/foundation/a$e;->b:I

    invoke-static {v2, v0}, LIi/A0;->g(LIi/y0;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    return-object v1

    :cond_7
    move v2, v7

    :goto_2
    if-eqz v2, :cond_b

    new-instance v2, Ly/o$b;

    iget-wide v6, v0, Landroidx/compose/foundation/a$e;->e:J

    invoke-direct {v2, v6, v7, v8}, Ly/o$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ly/o$c;

    invoke-direct {v3, v2}, Ly/o$c;-><init>(Ly/o$b;)V

    iget-object v6, v0, Landroidx/compose/foundation/a$e;->f:Ly/m;

    iput-object v3, v0, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    iput v5, v0, Landroidx/compose/foundation/a$e;->b:I

    invoke-interface {v6, v2, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v2, v3

    :goto_3
    iget-object v3, v0, Landroidx/compose/foundation/a$e;->f:Ly/m;

    iput-object v8, v0, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    iput v4, v0, Landroidx/compose/foundation/a$e;->b:I

    invoke-interface {v3, v2, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    return-object v1

    :cond_9
    iget-object v2, v0, Landroidx/compose/foundation/a$e;->g:Landroidx/compose/foundation/a;

    invoke-static {v2}, Landroidx/compose/foundation/a;->N2(Landroidx/compose/foundation/a;)Ly/o$b;

    move-result-object v2

    if-eqz v2, :cond_b

    iget-object v4, v0, Landroidx/compose/foundation/a$e;->f:Ly/m;

    if-eqz v7, :cond_a

    new-instance v5, Ly/o$c;

    invoke-direct {v5, v2}, Ly/o$c;-><init>(Ly/o$b;)V

    goto :goto_4

    :cond_a
    new-instance v5, Ly/o$a;

    invoke-direct {v5, v2}, Ly/o$a;-><init>(Ly/o$b;)V

    :goto_4
    iput-object v8, v0, Landroidx/compose/foundation/a$e;->c:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/a$e;->b:I

    invoke-interface {v4, v5, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    return-object v1

    :cond_b
    :goto_5
    iget-object v1, v0, Landroidx/compose/foundation/a$e;->g:Landroidx/compose/foundation/a;

    invoke-static {v1, v8}, Landroidx/compose/foundation/a;->O2(Landroidx/compose/foundation/a;Ly/o$b;)V

    sget-object v1, LYg/J;->a:LYg/J;

    return-object v1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/a$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/a$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
