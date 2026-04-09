.class final LN/q0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/q0;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZLR0/c0;LF/D;LF/C;ZIILy/m;Lm0/i1;LN/S0;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LR0/Q;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:LR0/c0;

.field final synthetic e:Ly/m;

.field final synthetic f:Z

.field final synthetic g:Lmh/p;

.field final synthetic h:Lmh/p;

.field final synthetic i:Lmh/p;

.field final synthetic j:Lmh/p;

.field final synthetic k:Lm0/i1;

.field final synthetic l:LN/S0;


# direct methods
.method constructor <init>(LR0/Q;ZZLR0/c0;Ly/m;ZLmh/p;Lmh/p;Lmh/p;Lmh/p;Lm0/i1;LN/S0;)V
    .locals 0

    iput-object p1, p0, LN/q0$c;->a:LR0/Q;

    iput-boolean p2, p0, LN/q0$c;->b:Z

    iput-boolean p3, p0, LN/q0$c;->c:Z

    iput-object p4, p0, LN/q0$c;->d:LR0/c0;

    iput-object p5, p0, LN/q0$c;->e:Ly/m;

    iput-boolean p6, p0, LN/q0$c;->f:Z

    iput-object p7, p0, LN/q0$c;->g:Lmh/p;

    iput-object p8, p0, LN/q0$c;->h:Lmh/p;

    iput-object p9, p0, LN/q0$c;->i:Lmh/p;

    iput-object p10, p0, LN/q0$c;->j:Lmh/p;

    iput-object p11, p0, LN/q0$c;->k:Lm0/i1;

    iput-object p12, p0, LN/q0$c;->l:LN/S0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmh/p;LT/l;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    and-int/lit8 v1, p3, 0x6

    move-object/from16 v15, p1

    if-nez v1, :cond_1

    invoke-interface {v3, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    move v14, v1

    goto :goto_1

    :cond_1
    move/from16 v14, p3

    :goto_1
    and-int/lit8 v1, v14, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:410)"

    const v4, -0x3bb21dc7

    invoke-static {v4, v14, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v1, LN/T0;->a:LN/T0;

    iget-object v2, v0, LN/q0$c;->a:LR0/Q;

    invoke-virtual {v2}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v2

    iget-boolean v13, v0, LN/q0$c;->b:Z

    move v4, v13

    iget-boolean v5, v0, LN/q0$c;->c:Z

    iget-object v6, v0, LN/q0$c;->d:LR0/c0;

    iget-object v12, v0, LN/q0$c;->e:Ly/m;

    move-object v7, v12

    iget-boolean v11, v0, LN/q0$c;->f:Z

    move v8, v11

    iget-object v9, v0, LN/q0$c;->g:Lmh/p;

    iget-object v10, v0, LN/q0$c;->h:Lmh/p;

    move/from16 v16, v11

    iget-object v11, v0, LN/q0$c;->i:Lmh/p;

    move/from16 v18, v16

    move-object/from16 v16, v12

    iget-object v12, v0, LN/q0$c;->j:Lmh/p;

    move-object/from16 v19, v16

    iget-object v15, v0, LN/q0$c;->k:Lm0/i1;

    move/from16 v17, v13

    move-object v13, v15

    move-object/from16 p3, v1

    iget-object v1, v0, LN/q0$c;->l:LN/S0;

    move/from16 v22, v14

    move-object v14, v1

    new-instance v0, LN/q0$c$a;

    move-object/from16 v16, v0

    move-object/from16 v20, v1

    move-object/from16 v21, v15

    invoke-direct/range {v16 .. v21}, LN/q0$c$a;-><init>(ZZLy/m;LN/S0;Lm0/i1;)V

    const/16 v1, 0x36

    const v15, -0x2f5c1f5f

    move-object/from16 v21, v2

    const/4 v2, 0x1

    invoke-static {v15, v2, v0, v3, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    shl-int/lit8 v0, v22, 0x3

    and-int/lit8 v18, v0, 0x70

    const v19, 0x36000

    const/16 v20, 0x2000

    const/4 v15, 0x0

    move-object/from16 v3, p1

    move-object/from16 v17, p2

    move-object/from16 v1, p3

    move-object/from16 v2, v21

    invoke-virtual/range {v1 .. v20}, LN/T0;->b(Ljava/lang/String;Lmh/p;ZZLR0/c0;Ly/k;ZLmh/p;Lmh/p;Lmh/p;Lmh/p;Lm0/i1;LN/S0;Lz/N;Lmh/p;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmh/p;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/q0$c;->a(Lmh/p;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
