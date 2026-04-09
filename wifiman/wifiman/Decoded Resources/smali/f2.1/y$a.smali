.class public final Lf2/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Lth/d;

.field private f:Ljava/lang/Object;

.field private g:Z

.field private h:Z

.field private i:I

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lf2/y$a;->c:I

    iput v0, p0, Lf2/y$a;->i:I

    iput v0, p0, Lf2/y$a;->j:I

    iput v0, p0, Lf2/y$a;->k:I

    iput v0, p0, Lf2/y$a;->l:I

    return-void
.end method

.method public static synthetic k(Lf2/y$a;IZZILjava/lang/Object;)Lf2/y$a;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lf2/y$a;->g(IZZ)Lf2/y$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lf2/y;
    .locals 26

    move-object/from16 v0, p0

    iget-object v4, v0, Lf2/y$a;->d:Ljava/lang/String;

    if-eqz v4, :cond_0

    new-instance v11, Lf2/y;

    iget-boolean v2, v0, Lf2/y$a;->a:Z

    iget-boolean v3, v0, Lf2/y$a;->b:Z

    iget-boolean v5, v0, Lf2/y$a;->g:Z

    iget-boolean v6, v0, Lf2/y$a;->h:Z

    iget v7, v0, Lf2/y$a;->i:I

    iget v8, v0, Lf2/y$a;->j:I

    iget v9, v0, Lf2/y$a;->k:I

    iget v10, v0, Lf2/y$a;->l:I

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lf2/y;-><init>(ZZLjava/lang/String;ZZIIII)V

    goto/16 :goto_0

    :cond_0
    iget-object v15, v0, Lf2/y$a;->e:Lth/d;

    if-eqz v15, :cond_1

    new-instance v11, Lf2/y;

    iget-boolean v13, v0, Lf2/y$a;->a:Z

    iget-boolean v14, v0, Lf2/y$a;->b:Z

    iget-boolean v1, v0, Lf2/y$a;->g:Z

    iget-boolean v2, v0, Lf2/y$a;->h:Z

    iget v3, v0, Lf2/y$a;->i:I

    iget v4, v0, Lf2/y$a;->j:I

    iget v5, v0, Lf2/y$a;->k:I

    iget v6, v0, Lf2/y$a;->l:I

    move-object v12, v11

    move/from16 v16, v1

    move/from16 v17, v2

    move/from16 v18, v3

    move/from16 v19, v4

    move/from16 v20, v5

    move/from16 v21, v6

    invoke-direct/range {v12 .. v21}, Lf2/y;-><init>(ZZLth/d;ZZIIII)V

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lf2/y$a;->f:Ljava/lang/Object;

    if-eqz v1, :cond_2

    new-instance v11, Lf2/y;

    iget-boolean v2, v0, Lf2/y$a;->a:Z

    iget-boolean v3, v0, Lf2/y$a;->b:Z

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-boolean v4, v0, Lf2/y$a;->g:Z

    iget-boolean v5, v0, Lf2/y$a;->h:Z

    iget v6, v0, Lf2/y$a;->i:I

    iget v7, v0, Lf2/y$a;->j:I

    iget v8, v0, Lf2/y$a;->k:I

    iget v9, v0, Lf2/y$a;->l:I

    move-object/from16 v16, v11

    move/from16 v17, v2

    move/from16 v18, v3

    move-object/from16 v19, v1

    move/from16 v20, v4

    move/from16 v21, v5

    move/from16 v22, v6

    move/from16 v23, v7

    move/from16 v24, v8

    move/from16 v25, v9

    invoke-direct/range {v16 .. v25}, Lf2/y;-><init>(ZZLjava/lang/Object;ZZIIII)V

    goto :goto_0

    :cond_2
    new-instance v11, Lf2/y;

    iget-boolean v13, v0, Lf2/y$a;->a:Z

    iget-boolean v14, v0, Lf2/y$a;->b:Z

    iget v15, v0, Lf2/y$a;->c:I

    iget-boolean v1, v0, Lf2/y$a;->g:Z

    iget-boolean v2, v0, Lf2/y$a;->h:Z

    iget v3, v0, Lf2/y$a;->i:I

    iget v4, v0, Lf2/y$a;->j:I

    iget v5, v0, Lf2/y$a;->k:I

    iget v6, v0, Lf2/y$a;->l:I

    move-object v12, v11

    move/from16 v16, v1

    move/from16 v17, v2

    move/from16 v18, v3

    move/from16 v19, v4

    move/from16 v20, v5

    move/from16 v21, v6

    invoke-direct/range {v12 .. v21}, Lf2/y;-><init>(ZZIZZIIII)V

    :goto_0
    return-object v11
.end method

.method public final b(I)Lf2/y$a;
    .locals 0

    iput p1, p0, Lf2/y$a;->i:I

    return-object p0
.end method

.method public final c(I)Lf2/y$a;
    .locals 0

    iput p1, p0, Lf2/y$a;->j:I

    return-object p0
.end method

.method public final d(Z)Lf2/y$a;
    .locals 0

    iput-boolean p1, p0, Lf2/y$a;->a:Z

    return-object p0
.end method

.method public final e(I)Lf2/y$a;
    .locals 0

    iput p1, p0, Lf2/y$a;->k:I

    return-object p0
.end method

.method public final f(I)Lf2/y$a;
    .locals 0

    iput p1, p0, Lf2/y$a;->l:I

    return-object p0
.end method

.method public final g(IZZ)Lf2/y$a;
    .locals 0

    iput p1, p0, Lf2/y$a;->c:I

    const/4 p1, 0x0

    iput-object p1, p0, Lf2/y$a;->d:Ljava/lang/String;

    iput-boolean p2, p0, Lf2/y$a;->g:Z

    iput-boolean p3, p0, Lf2/y$a;->h:Z

    return-object p0
.end method

.method public final h(Ljava/lang/Object;ZZ)Lf2/y$a;
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/y$a;->f:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p1

    invoke-static {p1}, LVi/w;->d(Lth/d;)LVi/b;

    move-result-object p1

    invoke-static {p1}, Lh2/c;->b(LVi/b;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lf2/y$a;->g(IZZ)Lf2/y$a;

    return-object p0
.end method

.method public final i(Ljava/lang/String;ZZ)Lf2/y$a;
    .locals 0

    iput-object p1, p0, Lf2/y$a;->d:Ljava/lang/String;

    const/4 p1, -0x1

    iput p1, p0, Lf2/y$a;->c:I

    iput-boolean p2, p0, Lf2/y$a;->g:Z

    iput-boolean p3, p0, Lf2/y$a;->h:Z

    return-object p0
.end method

.method public final j(Lth/d;ZZ)Lf2/y$a;
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/y$a;->e:Lth/d;

    const/4 p1, -0x1

    iput p1, p0, Lf2/y$a;->c:I

    iput-boolean p2, p0, Lf2/y$a;->g:Z

    iput-boolean p3, p0, Lf2/y$a;->h:Z

    return-object p0
.end method

.method public final l(Z)Lf2/y$a;
    .locals 0

    iput-boolean p1, p0, Lf2/y$a;->b:Z

    return-object p0
.end method
