.class final Lw/h$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/h;->a(Lw/v;FLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:F

.field final synthetic e:Lw/h;

.field final synthetic f:Lw/v;


# direct methods
.method constructor <init>(FLw/h;Lw/v;Ldh/e;)V
    .locals 0

    iput p1, p0, Lw/h$a;->d:F

    iput-object p2, p0, Lw/h$a;->e:Lw/h;

    iput-object p3, p0, Lw/h$a;->f:Lw/v;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lw/h$a;

    iget v0, p0, Lw/h$a;->d:F

    iget-object v1, p0, Lw/h$a;->e:Lw/h;

    iget-object v2, p0, Lw/h$a;->f:Lw/v;

    invoke-direct {p1, v0, v1, v2, p2}, Lw/h$a;-><init>(FLw/h;Lw/v;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/h$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v7, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v8

    iget v0, v7, Lw/h$a;->c:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, v7, Lw/h$a;->b:Ljava/lang/Object;

    check-cast v0, Lr/k;

    iget-object v1, v7, Lw/h$a;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/K;

    :try_start_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget v0, v7, Lw/h$a;->d:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    new-instance v9, Lkotlin/jvm/internal/K;

    invoke-direct {v9}, Lkotlin/jvm/internal/K;-><init>()V

    iget v0, v7, Lw/h$a;->d:F

    iput v0, v9, Lkotlin/jvm/internal/K;->a:F

    new-instance v0, Lkotlin/jvm/internal/K;

    invoke-direct {v0}, Lkotlin/jvm/internal/K;-><init>()V

    iget v11, v7, Lw/h$a;->d:F

    const/16 v17, 0x1c

    const/16 v18, 0x0

    const/4 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, Lr/l;->c(FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v10

    :try_start_1
    iget-object v2, v7, Lw/h$a;->e:Lw/h;

    invoke-virtual {v2}, Lw/h;->d()Lr/z;

    move-result-object v2

    new-instance v3, Lw/h$a$a;

    iget-object v4, v7, Lw/h$a;->f:Lw/v;

    iget-object v5, v7, Lw/h$a;->e:Lw/h;

    invoke-direct {v3, v0, v4, v9, v5}, Lw/h$a$a;-><init>(Lkotlin/jvm/internal/K;Lw/v;Lkotlin/jvm/internal/K;Lw/h;)V

    iput-object v9, v7, Lw/h$a;->a:Ljava/lang/Object;

    iput-object v10, v7, Lw/h$a;->b:Ljava/lang/Object;

    iput v1, v7, Lw/h$a;->c:I

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v10

    move-object v1, v2

    move v2, v4

    move-object/from16 v4, p0

    invoke-static/range {v0 .. v6}, Lr/m0;->h(Lr/k;Lr/z;ZLmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v8, :cond_2

    return-object v8

    :cond_2
    move-object v1, v9

    goto :goto_0

    :catch_0
    move-object v1, v9

    move-object v0, v10

    :catch_1
    invoke-virtual {v0}, Lr/k;->p()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iput v0, v1, Lkotlin/jvm/internal/K;->a:F

    :goto_0
    iget v0, v1, Lkotlin/jvm/internal/K;->a:F

    goto :goto_1

    :cond_3
    iget v0, v7, Lw/h$a;->d:F

    :goto_1
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/h$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/h$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
