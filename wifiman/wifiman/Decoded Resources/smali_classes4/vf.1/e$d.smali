.class final Lvf/e$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvf/e;->f(LL0/d;J)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field private synthetic d:Ljava/lang/Object;

.field final synthetic e:LL0/d;

.field final synthetic f:Lvf/e;

.field final synthetic g:J


# direct methods
.method constructor <init>(LL0/d;Lvf/e;JLdh/e;)V
    .locals 0

    iput-object p1, p0, Lvf/e$d;->e:LL0/d;

    iput-object p2, p0, Lvf/e$d;->f:Lvf/e;

    iput-wide p3, p0, Lvf/e$d;->g:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Lvf/e$d;

    iget-object v1, p0, Lvf/e$d;->e:LL0/d;

    iget-object v2, p0, Lvf/e$d;->f:Lvf/e;

    iget-wide v3, p0, Lvf/e$d;->g:J

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lvf/e$d;-><init>(LL0/d;Lvf/e;JLdh/e;)V

    iput-object p1, v6, Lvf/e$d;->d:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lvf/e$d;->n(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lvf/e$d;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lvf/e$d;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v7, v0, Lvf/e$d;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v0, Lvf/e$d;->d:Ljava/lang/Object;

    check-cast v8, LLi/h;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lvf/e$d;->d:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, LLi/h;

    iget-object v2, v0, Lvf/e$d;->e:LL0/d;

    new-instance v7, Lkotlin/text/p;

    const-string v9, "\\s+"

    invoke-direct {v7, v9}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2, v3}, Lkotlin/text/p;->p(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    sget-object v11, Landroid/util/Patterns;->WEB_URL:Ljava/util/regex/Pattern;

    invoke-virtual {v11, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v9, Lvf/e$d$a;

    iget-object v10, v0, Lvf/e$d;->f:Lvf/e;

    invoke-direct {v9, v7, v10, v2, v6}, Lvf/e$d$a;-><init>(Ljava/util/List;Lvf/e;Ljava/util/concurrent/ConcurrentHashMap;Ldh/e;)V

    iput-object v8, v0, Lvf/e$d;->d:Ljava/lang/Object;

    iput-object v7, v0, Lvf/e$d;->a:Ljava/lang/Object;

    iput-object v2, v0, Lvf/e$d;->b:Ljava/lang/Object;

    iput v5, v0, Lvf/e$d;->c:I

    invoke-static {v9, v0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    iget-object v15, v0, Lvf/e$d;->e:LL0/d;

    iget-wide v13, v0, Lvf/e$d;->g:J

    new-instance v12, LL0/d$a;

    invoke-direct {v12, v3, v5, v6}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12, v15}, LL0/d$a;->g(LL0/d;)V

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_6

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/16 v18, 0x0

    move-object v9, v15

    move-object v10, v5

    move-object v4, v12

    move/from16 v12, v18

    move-wide/from16 v39, v13

    move/from16 v13, v16

    move-object/from16 v14, v17

    invoke-static/range {v9 .. v14}, Lkotlin/text/t;->k0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v9

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v9

    new-instance v10, LL0/D;

    move-object/from16 v16, v10

    sget-object v11, LW0/k;->b:LW0/k$a;

    invoke-virtual {v11}, LW0/k$a;->c()LW0/k;

    move-result-object v33

    const v37, 0xeffe

    const/16 v38, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-wide/from16 v17, v39

    invoke-direct/range {v16 .. v38}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v10, v9, v5}, LL0/d$a;->c(LL0/D;II)V

    check-cast v7, Ljava/net/URL;

    invoke-virtual {v7}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v10, "toString(...)"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "hostAddress"

    invoke-virtual {v4, v10, v7, v9, v5}, LL0/d$a;->a(Ljava/lang/String;Ljava/lang/String;II)V

    goto :goto_3

    :cond_6
    move-object v4, v12

    move-wide/from16 v39, v13

    :goto_3
    move-object v12, v4

    move-wide/from16 v13, v39

    const/4 v4, 0x2

    goto :goto_2

    :cond_7
    move-object v4, v12

    invoke-virtual {v4}, LL0/d$a;->p()LL0/d;

    move-result-object v2

    iput-object v6, v0, Lvf/e$d;->d:Ljava/lang/Object;

    iput-object v6, v0, Lvf/e$d;->a:Ljava/lang/Object;

    iput-object v6, v0, Lvf/e$d;->b:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v0, Lvf/e$d;->c:I

    invoke-interface {v8, v2, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    :goto_4
    sget-object v1, LYg/J;->a:LYg/J;

    return-object v1
.end method

.method public final n(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lvf/e$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lvf/e$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lvf/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
