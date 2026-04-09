.class final LI/c$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c;->c(Landroidx/compose/ui/platform/O0;LI/o1;LI/l1;LR0/s;Lu/a;Lmh/l;LI/q;LLi/y;Landroidx/compose/ui/platform/w1;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LLi/y;

.field final synthetic d:LI/o1;

.field final synthetic e:LI/l1;

.field final synthetic f:LI/q;

.field final synthetic g:Landroidx/compose/ui/platform/O0;

.field final synthetic h:LR0/s;

.field final synthetic i:Lmh/l;

.field final synthetic j:Landroidx/compose/ui/platform/w1;


# direct methods
.method constructor <init>(LLi/y;LI/o1;LI/l1;LI/q;Landroidx/compose/ui/platform/O0;LR0/s;Lu/a;Lmh/l;Landroidx/compose/ui/platform/w1;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/c$c;->c:LLi/y;

    iput-object p2, p0, LI/c$c;->d:LI/o1;

    iput-object p3, p0, LI/c$c;->e:LI/l1;

    iput-object p4, p0, LI/c$c;->f:LI/q;

    iput-object p5, p0, LI/c$c;->g:Landroidx/compose/ui/platform/O0;

    iput-object p6, p0, LI/c$c;->h:LR0/s;

    iput-object p8, p0, LI/c$c;->i:Lmh/l;

    iput-object p9, p0, LI/c$c;->j:Landroidx/compose/ui/platform/w1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(LI/o1;LR0/s;Lu/a;LI/q;Lmh/l;LI/F;LI/l1;Landroidx/compose/ui/platform/w1;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    invoke-static/range {p0 .. p8}, LI/c$c;->t(LI/o1;LR0/s;Lu/a;LI/q;Lmh/l;LI/F;LI/l1;Landroidx/compose/ui/platform/w1;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p0

    return-object p0
.end method

.method private static final t(LI/o1;LR0/s;Lu/a;LI/q;Lmh/l;LI/F;LI/l1;Landroidx/compose/ui/platform/w1;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 10

    new-instance v0, LI/c$c$c;

    move-object v9, p0

    invoke-direct {v0, p0}, LI/c$c$c;-><init>(LI/o1;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LI/c;->b(Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    new-instance v0, LI/c$c$d;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p2

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, LI/c$c$d;-><init>(LI/o1;LI/q;Lmh/l;Lu/a;LI/F;LI/l1;Landroidx/compose/ui/platform/w1;)V

    invoke-virtual {p0}, LI/o1;->l()LH/h;

    move-result-object v1

    invoke-virtual {p0}, LI/o1;->l()LH/h;

    move-result-object v2

    invoke-virtual {v2}, LH/h;->f()J

    move-result-wide v2

    const/4 v4, 0x0

    move-object/from16 p2, p8

    move-object p3, v1

    move-wide p4, v2

    move-object/from16 p6, p1

    move-object/from16 p7, v4

    invoke-static/range {p2 .. p7}, LI/V;->b(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLR0/s;[Ljava/lang/String;)V

    new-instance v1, LI/Z0;

    move-object/from16 v2, p8

    invoke-direct {v1, v0, v2}, LI/Z0;-><init>(LI/k1;Landroid/view/inputmethod/EditorInfo;)V

    return-object v1
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 12

    new-instance v11, LI/c$c;

    iget-object v1, p0, LI/c$c;->c:LLi/y;

    iget-object v2, p0, LI/c$c;->d:LI/o1;

    iget-object v3, p0, LI/c$c;->e:LI/l1;

    iget-object v4, p0, LI/c$c;->f:LI/q;

    iget-object v5, p0, LI/c$c;->g:Landroidx/compose/ui/platform/O0;

    iget-object v6, p0, LI/c$c;->h:LR0/s;

    iget-object v8, p0, LI/c$c;->i:Lmh/l;

    iget-object v9, p0, LI/c$c;->j:Landroidx/compose/ui/platform/w1;

    const/4 v7, 0x0

    move-object v0, v11

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, LI/c$c;-><init>(LLi/y;LI/o1;LI/l1;LI/q;Landroidx/compose/ui/platform/O0;LR0/s;Lu/a;Lmh/l;Landroidx/compose/ui/platform/w1;Ldh/e;)V

    iput-object p1, v11, LI/c$c;->b:Ljava/lang/Object;

    return-object v11
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/c$c;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI/c$c;->a:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-eq v2, v3, :cond_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v0, LI/c$c;->b:Ljava/lang/Object;

    check-cast v2, LIi/N;

    sget-object v6, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v7, LI/c$c$a;

    iget-object v4, v0, LI/c$c;->d:LI/o1;

    iget-object v5, v0, LI/c$c;->f:LI/q;

    const/4 v10, 0x0

    invoke-direct {v7, v4, v5, v10}, LI/c$c$a;-><init>(LI/o1;LI/q;Ldh/e;)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iget-object v4, v0, LI/c$c;->c:LLi/y;

    if-eqz v4, :cond_2

    iget-object v5, v0, LI/c$c;->f:LI/q;

    new-instance v7, LI/c$c$b;

    invoke-direct {v7, v4, v5, v10}, LI/c$c$b;-><init>(LLi/y;LI/q;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_2
    new-instance v4, LI/F;

    iget-object v5, v0, LI/c$c;->d:LI/o1;

    iget-object v6, v0, LI/c$c;->e:LI/l1;

    iget-object v7, v0, LI/c$c;->f:LI/q;

    invoke-direct {v4, v5, v6, v7, v2}, LI/F;-><init>(LI/o1;LI/l1;LI/q;LIi/N;)V

    iget-object v2, v0, LI/c$c;->g:Landroidx/compose/ui/platform/O0;

    iget-object v11, v0, LI/c$c;->d:LI/o1;

    iget-object v12, v0, LI/c$c;->h:LR0/s;

    iget-object v14, v0, LI/c$c;->f:LI/q;

    iget-object v15, v0, LI/c$c;->i:Lmh/l;

    iget-object v5, v0, LI/c$c;->e:LI/l1;

    iget-object v6, v0, LI/c$c;->j:Landroidx/compose/ui/platform/w1;

    new-instance v7, LI/d;

    const/4 v13, 0x0

    move-object v10, v7

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    invoke-direct/range {v10 .. v18}, LI/d;-><init>(LI/o1;LR0/s;Lu/a;LI/q;Lmh/l;LI/F;LI/l1;Landroidx/compose/ui/platform/w1;)V

    iput v3, v0, LI/c$c;->a:I

    invoke-interface {v2, v7, v0}, Landroidx/compose/ui/platform/O0;->b(Landroidx/compose/ui/platform/L0;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI/c$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/c$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
