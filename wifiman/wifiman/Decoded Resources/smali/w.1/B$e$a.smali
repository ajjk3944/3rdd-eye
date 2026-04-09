.class final Lw/B$e$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/B$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LIi/N;

.field final synthetic e:Lmh/q;

.field final synthetic f:Lmh/l;

.field final synthetic g:Lw/s;


# direct methods
.method constructor <init>(LIi/N;Lmh/q;Lmh/l;Lw/s;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/B$e$a;->d:LIi/N;

    iput-object p2, p0, Lw/B$e$a;->e:Lmh/q;

    iput-object p3, p0, Lw/B$e$a;->f:Lmh/l;

    iput-object p4, p0, Lw/B$e$a;->g:Lw/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Lw/B$e$a;

    iget-object v1, p0, Lw/B$e$a;->d:LIi/N;

    iget-object v2, p0, Lw/B$e$a;->e:Lmh/q;

    iget-object v3, p0, Lw/B$e$a;->f:Lmh/l;

    iget-object v4, p0, Lw/B$e$a;->g:Lw/s;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lw/B$e$a;-><init>(LIi/N;Lmh/q;Lmh/l;Lw/s;Ldh/e;)V

    iput-object p1, v6, Lw/B$e$a;->c:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/B$e$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v6, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v7

    iget v0, v6, Lw/B$e$a;->b:I

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v9, :cond_1

    if-ne v0, v8, :cond_0

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v6, Lw/B$e$a;->c:Ljava/lang/Object;

    check-cast v0, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v11, v0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v0, v6, Lw/B$e$a;->c:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ly0/b;

    iget-object v0, v6, Lw/B$e$a;->d:LIi/N;

    new-instance v3, Lw/B$e$a$a;

    iget-object v1, v6, Lw/B$e$a;->g:Lw/s;

    invoke-direct {v3, v1, v10}, Lw/B$e$a$a;-><init>(Lw/s;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iput-object v11, v6, Lw/B$e$a;->c:Ljava/lang/Object;

    iput v9, v6, Lw/B$e$a;->b:I

    const/4 v1, 0x0

    move-object v0, v11

    move-object/from16 v3, p0

    invoke-static/range {v0 .. v5}, Lw/B;->f(Ly0/b;ZLy0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    return-object v7

    :cond_3
    :goto_0
    check-cast v0, Ly0/y;

    invoke-virtual {v0}, Ly0/y;->a()V

    iget-object v1, v6, Lw/B$e$a;->e:Lmh/q;

    invoke-static {}, Lw/B;->c()Lmh/q;

    move-result-object v2

    if-eq v1, v2, :cond_4

    iget-object v12, v6, Lw/B$e$a;->d:LIi/N;

    new-instance v15, Lw/B$e$a$b;

    iget-object v1, v6, Lw/B$e$a;->e:Lmh/q;

    iget-object v2, v6, Lw/B$e$a;->g:Lw/s;

    invoke-direct {v15, v1, v2, v0, v10}, Lw/B$e$a$b;-><init>(Lmh/q;Lw/s;Ly0/y;Ldh/e;)V

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_4
    iput-object v10, v6, Lw/B$e$a;->c:Ljava/lang/Object;

    iput v8, v6, Lw/B$e$a;->b:I

    invoke-static {v11, v10, v6, v9, v10}, Lw/B;->m(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    return-object v7

    :cond_5
    :goto_1
    check-cast v0, Ly0/y;

    if-nez v0, :cond_6

    iget-object v11, v6, Lw/B$e$a;->d:LIi/N;

    new-instance v14, Lw/B$e$a$c;

    iget-object v0, v6, Lw/B$e$a;->g:Lw/s;

    invoke-direct {v14, v0, v10}, Lw/B$e$a$c;-><init>(Lw/s;Ldh/e;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Ly0/y;->a()V

    iget-object v1, v6, Lw/B$e$a;->d:LIi/N;

    new-instance v2, Lw/B$e$a$d;

    iget-object v3, v6, Lw/B$e$a;->g:Lw/s;

    invoke-direct {v2, v3, v10}, Lw/B$e$a$d;-><init>(Lw/s;Ldh/e;)V

    const/16 v21, 0x3

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v1

    move-object/from16 v20, v2

    invoke-static/range {v17 .. v22}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iget-object v1, v6, Lw/B$e$a;->f:Lmh/l;

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Ly0/y;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_2
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/B$e$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/B$e$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/B$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
