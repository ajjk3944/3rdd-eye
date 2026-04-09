.class final Lo/I$a$a$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/I$a$a;-><init>(Lo/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:I

.field f:I

.field g:I

.field h:I

.field i:J

.field j:I

.field private synthetic k:Ljava/lang/Object;

.field final synthetic l:Lo/I;

.field final synthetic m:Lo/I$a$a;


# direct methods
.method constructor <init>(Lo/I;Lo/I$a$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lo/I$a$a$a;->l:Lo/I;

    iput-object p2, p0, Lo/I$a$a$a;->m:Lo/I$a$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lo/I$a$a$a;

    iget-object v1, p0, Lo/I$a$a$a;->l:Lo/I;

    iget-object v2, p0, Lo/I$a$a$a;->m:Lo/I$a$a;

    invoke-direct {v0, v1, v2, p2}, Lo/I$a$a$a;-><init>(Lo/I;Lo/I$a$a;Ldh/e;)V

    iput-object p1, v0, Lo/I$a$a$a;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzi/l;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lo/I$a$a$a;->n(Lzi/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo/I$a$a$a;->j:I

    const/16 v4, 0x8

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v5, :cond_0

    iget v2, v0, Lo/I$a$a$a;->h:I

    iget v6, v0, Lo/I$a$a$a;->g:I

    iget-wide v7, v0, Lo/I$a$a$a;->i:J

    iget v9, v0, Lo/I$a$a$a;->f:I

    iget v10, v0, Lo/I$a$a$a;->e:I

    iget-object v11, v0, Lo/I$a$a$a;->d:Ljava/lang/Object;

    check-cast v11, [J

    iget-object v12, v0, Lo/I$a$a$a;->c:Ljava/lang/Object;

    check-cast v12, Lo/I;

    iget-object v13, v0, Lo/I$a$a$a;->b:Ljava/lang/Object;

    check-cast v13, Lo/I$a$a;

    iget-object v14, v0, Lo/I$a$a$a;->k:Ljava/lang/Object;

    check-cast v14, Lzi/l;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lo/I$a$a$a;->k:Ljava/lang/Object;

    check-cast v2, Lzi/l;

    iget-object v6, v0, Lo/I$a$a$a;->l:Lo/I;

    iget-object v7, v0, Lo/I$a$a$a;->m:Lo/I$a$a;

    iget-object v8, v6, Lo/T;->a:[J

    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    if-ltz v9, :cond_5

    const/4 v10, 0x0

    :goto_0
    aget-wide v11, v8, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_4

    sub-int v13, v10, v9

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    rsub-int/lit8 v13, v13, 0x8

    move-object v14, v2

    const/4 v2, 0x0

    move-wide/from16 v19, v11

    move-object v12, v6

    move-object v11, v8

    move v6, v13

    move-object v13, v7

    move-wide/from16 v7, v19

    move/from16 v21, v10

    move v10, v9

    move/from16 v9, v21

    :goto_1
    if-ge v2, v6, :cond_3

    const-wide/16 v15, 0xff

    and-long/2addr v15, v7

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_2

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v2

    invoke-virtual {v13, v15}, Lo/I$a$a;->d(I)V

    iget-object v3, v12, Lo/T;->b:[Ljava/lang/Object;

    aget-object v3, v3, v15

    iput-object v14, v0, Lo/I$a$a$a;->k:Ljava/lang/Object;

    iput-object v13, v0, Lo/I$a$a$a;->b:Ljava/lang/Object;

    iput-object v12, v0, Lo/I$a$a$a;->c:Ljava/lang/Object;

    iput-object v11, v0, Lo/I$a$a$a;->d:Ljava/lang/Object;

    iput v10, v0, Lo/I$a$a$a;->e:I

    iput v9, v0, Lo/I$a$a$a;->f:I

    iput-wide v7, v0, Lo/I$a$a$a;->i:J

    iput v6, v0, Lo/I$a$a$a;->g:I

    iput v2, v0, Lo/I$a$a$a;->h:I

    iput v5, v0, Lo/I$a$a$a;->j:I

    invoke-virtual {v14, v3, v0}, Lzi/l;->d(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    :goto_2
    shr-long/2addr v7, v4

    add-int/2addr v2, v5

    goto :goto_1

    :cond_3
    if-ne v6, v4, :cond_5

    move-object v8, v11

    move-object v6, v12

    move-object v7, v13

    move-object v2, v14

    move/from16 v19, v10

    move v10, v9

    move/from16 v9, v19

    :cond_4
    if-eq v10, v9, :cond_5

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_5
    sget-object v1, LYg/J;->a:LYg/J;

    return-object v1
.end method

.method public final n(Lzi/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lo/I$a$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lo/I$a$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lo/I$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
