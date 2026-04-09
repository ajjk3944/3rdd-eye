.class public abstract LI/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "image/*"

    const-string v1, "video/*"

    const-string v2, "*/*"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LI/c;->a:[Ljava/lang/String;

    return-void
.end method

.method private static final a(Ljava/lang/String;Lmh/a;)V
    .locals 0

    return-void
.end method

.method static synthetic b(Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p0, "AndroidTextInputSession"

    :cond_0
    invoke-static {p0, p1}, LI/c;->a(Ljava/lang/String;Lmh/a;)V

    return-void
.end method

.method public static final c(Landroidx/compose/ui/platform/O0;LI/o1;LI/l1;LR0/s;Lu/a;Lmh/l;LI/q;LLi/y;Landroidx/compose/ui/platform/w1;Ldh/e;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p9

    instance-of v1, v0, LI/c$b;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LI/c$b;

    iget v2, v1, LI/c$b;->b:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, LI/c$b;->b:I

    goto :goto_0

    :cond_0
    new-instance v1, LI/c$b;

    invoke-direct {v1, v0}, LI/c$b;-><init>(Ldh/e;)V

    :goto_0
    iget-object v0, v1, LI/c$b;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, LI/c$b;->b:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance v0, LI/c$c;

    const/4 v15, 0x0

    move-object v5, v0

    move-object/from16 v6, p7

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p6

    move-object/from16 v10, p0

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p8

    invoke-direct/range {v5 .. v15}, LI/c$c;-><init>(LLi/y;LI/o1;LI/l1;LI/q;Landroidx/compose/ui/platform/O0;LR0/s;Lu/a;Lmh/l;Landroidx/compose/ui/platform/w1;Ldh/e;)V

    iput v4, v1, LI/c$b;->b:I

    invoke-static {v0, v1}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public static final d(Landroidx/compose/ui/platform/O0;LI/o1;LI/l1;LR0/s;Lu/a;Lmh/l;LLi/y;Landroidx/compose/ui/platform/w1;Ldh/e;)Ljava/lang/Object;
    .locals 12

    move-object/from16 v0, p8

    instance-of v1, v0, LI/c$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LI/c$a;

    iget v2, v1, LI/c$a;->b:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, LI/c$a;->b:I

    :goto_0
    move-object v11, v1

    goto :goto_1

    :cond_0
    new-instance v1, LI/c$a;

    invoke-direct {v1, v0}, LI/c$a;-><init>(Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object v0, v11, LI/c$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v11, LI/c$a;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-interface {p0}, Landroidx/compose/ui/platform/O0;->a()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, LI/v;->a(Landroid/view/View;)LI/q;

    move-result-object v8

    iput v3, v11, LI/c$a;->b:I

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-static/range {v2 .. v11}, LI/c;->c(Landroidx/compose/ui/platform/O0;LI/o1;LI/l1;LR0/s;Lu/a;Lmh/l;LI/q;LLi/y;Landroidx/compose/ui/platform/w1;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method
