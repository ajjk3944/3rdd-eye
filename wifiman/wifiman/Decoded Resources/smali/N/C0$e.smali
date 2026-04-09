.class final LN/C0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/C0;->b(Lz/f0;Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/p0;

.field final synthetic b:Lz/f0;

.field final synthetic c:J

.field final synthetic d:J

.field final synthetic e:Z

.field final synthetic f:I

.field final synthetic g:Lmh/p;

.field final synthetic h:Lmh/q;

.field final synthetic i:Lmh/p;

.field final synthetic j:Lmh/p;

.field final synthetic k:Lmh/q;

.field final synthetic l:LN/E0;


# direct methods
.method constructor <init>(LN/p0;Lz/f0;JJZILmh/p;Lmh/q;Lmh/p;Lmh/p;Lmh/q;LN/E0;)V
    .locals 0

    iput-object p1, p0, LN/C0$e;->a:LN/p0;

    iput-object p2, p0, LN/C0$e;->b:Lz/f0;

    iput-wide p3, p0, LN/C0$e;->c:J

    iput-wide p5, p0, LN/C0$e;->d:J

    iput-boolean p7, p0, LN/C0$e;->e:Z

    iput p8, p0, LN/C0$e;->f:I

    iput-object p9, p0, LN/C0$e;->g:Lmh/p;

    iput-object p10, p0, LN/C0$e;->h:Lmh/q;

    iput-object p11, p0, LN/C0$e;->i:Lmh/p;

    iput-object p12, p0, LN/C0$e;->j:Lmh/p;

    iput-object p13, p0, LN/C0$e;->k:Lmh/q;

    iput-object p14, p0, LN/C0$e;->l:LN/E0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:207)"

    const v5, -0xd1a6358

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LN/C0$e;->a:LN/p0;

    invoke-interface {v10, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, LN/C0$e;->b:Lz/f0;

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, LN/C0$e;->a:LN/p0;

    iget-object v4, v0, LN/C0$e;->b:Lz/f0;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_5

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_6

    :cond_5
    new-instance v5, LN/C0$e$a;

    invoke-direct {v5, v3, v4}, LN/C0$e$a;-><init>(LN/p0;Lz/f0;)V

    invoke-interface {v10, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lmh/l;

    invoke-static {v1, v5}, Lz/i0;->c(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-wide v3, v0, LN/C0$e;->c:J

    iget-wide v5, v0, LN/C0$e;->d:J

    new-instance v2, LN/C0$e$b;

    iget-boolean v12, v0, LN/C0$e;->e:Z

    iget v13, v0, LN/C0$e;->f:I

    iget-object v14, v0, LN/C0$e;->g:Lmh/p;

    iget-object v15, v0, LN/C0$e;->h:Lmh/q;

    iget-object v7, v0, LN/C0$e;->i:Lmh/p;

    iget-object v8, v0, LN/C0$e;->a:LN/p0;

    iget-object v9, v0, LN/C0$e;->j:Lmh/p;

    iget-object v11, v0, LN/C0$e;->k:Lmh/q;

    move-wide/from16 v21, v5

    iget-object v5, v0, LN/C0$e;->l:LN/E0;

    move-object v6, v11

    move-object v11, v2

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    move-object/from16 v18, v9

    move-object/from16 v19, v6

    move-object/from16 v20, v5

    invoke-direct/range {v11 .. v20}, LN/C0$e$b;-><init>(ZILmh/p;Lmh/q;Lmh/p;LN/p0;Lmh/p;Lmh/q;LN/E0;)V

    const/16 v5, 0x36

    const v6, 0x69ad25e4

    const/4 v7, 0x1

    invoke-static {v6, v7, v2, v10, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0x180000

    const/16 v12, 0x32

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide/from16 v5, v21

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/C0$e;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
