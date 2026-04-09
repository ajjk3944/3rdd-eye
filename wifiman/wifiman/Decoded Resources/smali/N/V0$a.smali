.class final LN/V0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0;->a(LN/Z0;Ljava/lang/String;Lmh/p;LR0/c0;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZZZLy/k;Lz/N;Lm0/i1;LN/S0;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/V0$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:Lmh/p;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:LN/S0;

.field final synthetic e:Z

.field final synthetic f:Z

.field final synthetic g:Ly/k;

.field final synthetic h:Lmh/p;

.field final synthetic i:Lmh/p;

.field final synthetic j:Lm0/i1;

.field final synthetic k:LN/Z0;

.field final synthetic l:Lmh/p;

.field final synthetic m:Z

.field final synthetic n:Lz/N;

.field final synthetic o:Z

.field final synthetic p:Lmh/p;


# direct methods
.method constructor <init>(Lmh/p;Lmh/p;Ljava/lang/String;LN/S0;ZZLy/k;Lmh/p;Lmh/p;Lm0/i1;LN/Z0;Lmh/p;ZLz/N;ZLmh/p;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LN/V0$a;->a:Lmh/p;

    move-object v1, p2

    iput-object v1, v0, LN/V0$a;->b:Lmh/p;

    move-object v1, p3

    iput-object v1, v0, LN/V0$a;->c:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, LN/V0$a;->d:LN/S0;

    move v1, p5

    iput-boolean v1, v0, LN/V0$a;->e:Z

    move v1, p6

    iput-boolean v1, v0, LN/V0$a;->f:Z

    move-object v1, p7

    iput-object v1, v0, LN/V0$a;->g:Ly/k;

    move-object v1, p8

    iput-object v1, v0, LN/V0$a;->h:Lmh/p;

    move-object v1, p9

    iput-object v1, v0, LN/V0$a;->i:Lmh/p;

    move-object v1, p10

    iput-object v1, v0, LN/V0$a;->j:Lm0/i1;

    move-object v1, p11

    iput-object v1, v0, LN/V0$a;->k:LN/Z0;

    move-object v1, p12

    iput-object v1, v0, LN/V0$a;->l:Lmh/p;

    move v1, p13

    iput-boolean v1, v0, LN/V0$a;->m:Z

    move-object/from16 v1, p14

    iput-object v1, v0, LN/V0$a;->n:Lz/N;

    move/from16 v1, p15

    iput-boolean v1, v0, LN/V0$a;->o:Z

    move-object/from16 v1, p16

    iput-object v1, v0, LN/V0$a;->p:Lmh/p;

    const/4 v1, 0x6

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    check-cast p2, Lm0/v0;

    invoke-virtual {p2}, Lm0/v0;->u()J

    move-result-wide v2

    check-cast p3, Lm0/v0;

    invoke-virtual {p3}, Lm0/v0;->u()J

    move-result-wide v4

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result v6

    move-object v7, p5

    check-cast v7, LT/l;

    check-cast p6, Ljava/lang/Number;

    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, LN/V0$a;->a(FJJFLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final a(FJJFLT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v9, p1

    move/from16 v10, p6

    move-object/from16 v15, p7

    move/from16 v1, p8

    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_1

    invoke-interface {v15, v9}, LT/l;->g(F)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v3, v1, 0x30

    move-wide/from16 v7, p2

    if-nez v3, :cond_3

    invoke-interface {v15, v7, v8}, LT/l;->j(J)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v1, 0x180

    if-nez v3, :cond_5

    move-wide/from16 v3, p4

    invoke-interface {v15, v3, v4}, LT/l;->j(J)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v2, v5

    goto :goto_4

    :cond_5
    move-wide/from16 v3, p4

    :goto_4
    and-int/lit16 v1, v1, 0xc00

    if-nez v1, :cond_7

    invoke-interface {v15, v10}, LT/l;->g(F)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_5

    :cond_6
    const/16 v1, 0x400

    :goto_5
    or-int/2addr v2, v1

    :cond_7
    move v13, v2

    and-int/lit16 v1, v13, 0x2493

    const/16 v2, 0x2492

    if-ne v1, v2, :cond_9

    invoke-interface/range {p7 .. p7}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface/range {p7 .. p7}, LT/l;->C()V

    goto/16 :goto_d

    :cond_9
    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:122)"

    const v5, 0xd71bbe3

    invoke-static {v5, v13, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    iget-object v5, v0, LN/V0$a;->a:Lmh/p;

    const/16 v14, 0x36

    const/4 v6, 0x0

    const/4 v2, 0x1

    if-nez v5, :cond_b

    const v1, -0x5db8664f

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    move v12, v2

    move-object v7, v6

    goto :goto_7

    :cond_b
    const v1, -0x5db8664e

    invoke-interface {v15, v1}, LT/l;->U(I)V

    iget-boolean v1, v0, LN/V0$a;->o:Z

    new-instance v11, LN/V0$a$c;

    move/from16 v17, v1

    move-object v1, v11

    move v12, v2

    move/from16 v2, p1

    move-wide/from16 v3, p4

    move/from16 v6, v17

    move-wide/from16 v7, p2

    invoke-direct/range {v1 .. v8}, LN/V0$a$c;-><init>(FJLmh/p;ZJ)V

    const v1, -0x6f2a07d7

    invoke-static {v1, v12, v11, v15, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    move-object v7, v1

    :goto_7
    iget-object v1, v0, LN/V0$a;->b:Lmh/p;

    if-eqz v1, :cond_c

    iget-object v1, v0, LN/V0$a;->c:Ljava/lang/String;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_c

    const/4 v1, 0x0

    cmpl-float v1, v10, v1

    if-lez v1, :cond_c

    const v1, -0x5dac82bc

    invoke-interface {v15, v1}, LT/l;->U(I)V

    new-instance v1, LN/V0$a$e;

    iget-object v2, v0, LN/V0$a;->d:LN/S0;

    iget-boolean v3, v0, LN/V0$a;->e:Z

    iget-object v4, v0, LN/V0$a;->b:Lmh/p;

    invoke-direct {v1, v10, v2, v3, v4}, LN/V0$a$e;-><init>(FLN/S0;ZLmh/p;)V

    const v2, -0x18a5eeab

    invoke-static {v2, v12, v1, v15, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    move-object v8, v1

    goto :goto_8

    :cond_c
    const v1, -0x5da6028c

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    const/4 v8, 0x0

    :goto_8
    iget-object v1, v0, LN/V0$a;->d:LN/S0;

    iget-boolean v2, v0, LN/V0$a;->e:Z

    iget-boolean v3, v0, LN/V0$a;->f:Z

    iget-object v4, v0, LN/V0$a;->g:Ly/k;

    const/4 v6, 0x0

    move-object/from16 v5, p7

    invoke-interface/range {v1 .. v6}, LN/S0;->h(ZZLy/k;LT/l;I)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v1

    iget-object v3, v0, LN/V0$a;->h:Lmh/p;

    if-nez v3, :cond_d

    const v1, -0x5da34d49

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    const/4 v10, 0x0

    goto :goto_9

    :cond_d
    const v4, -0x5da34d48

    invoke-interface {v15, v4}, LT/l;->U(I)V

    new-instance v4, LN/V0$a$d;

    invoke-direct {v4, v1, v2, v3}, LN/V0$a$d;-><init>(JLmh/p;)V

    const v1, -0x4572b205

    invoke-static {v1, v12, v4, v15, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    move-object v10, v1

    :goto_9
    iget-object v1, v0, LN/V0$a;->d:LN/S0;

    iget-boolean v2, v0, LN/V0$a;->e:Z

    iget-boolean v3, v0, LN/V0$a;->f:Z

    iget-object v4, v0, LN/V0$a;->g:Ly/k;

    const/4 v6, 0x0

    move-object/from16 v5, p7

    invoke-interface/range {v1 .. v6}, LN/S0;->c(ZZLy/k;LT/l;I)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v1

    iget-object v3, v0, LN/V0$a;->i:Lmh/p;

    if-nez v3, :cond_e

    const v1, -0x5d9eb32a

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    const/4 v6, 0x0

    goto :goto_a

    :cond_e
    const v4, -0x5d9eb329

    invoke-interface {v15, v4}, LT/l;->U(I)V

    new-instance v4, LN/V0$a$f;

    invoke-direct {v4, v1, v2, v3}, LN/V0$a$f;-><init>(JLmh/p;)V

    const v1, 0x64fa50ef

    invoke-static {v1, v12, v4, v15, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    move-object v6, v1

    :goto_a
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v2, v0, LN/V0$a;->d:LN/S0;

    iget-boolean v3, v0, LN/V0$a;->e:Z

    const/4 v4, 0x0

    invoke-interface {v2, v3, v15, v4}, LN/S0;->a(ZLT/l;I)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v2

    iget-object v5, v0, LN/V0$a;->j:Lm0/i1;

    invoke-static {v1, v2, v3, v5}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, LN/V0$a;->k:LN/Z0;

    sget-object v3, LN/V0$a$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    if-eq v2, v12, :cond_14

    const/4 v5, 0x2

    if-eq v2, v5, :cond_f

    const v1, -0x5d7b5b47

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    goto/16 :goto_c

    :cond_f
    const v2, -0x5d911f49

    invoke-interface {v15, v2}, LT/l;->U(I)V

    invoke-interface/range {p7 .. p7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v2, v11, :cond_10

    sget-object v2, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v2}, Ll0/m$a;->b()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ll0/m;->c(J)Ll0/m;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v11, 0x2

    invoke-static {v2, v4, v11, v4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, LT/q0;

    new-instance v4, LN/V0$a$g;

    iget-object v11, v0, LN/V0$a;->n:Lz/N;

    iget-object v3, v0, LN/V0$a;->p:Lmh/p;

    invoke-direct {v4, v2, v11, v3}, LN/V0$a$g;-><init>(LT/q0;Lz/N;Lmh/p;)V

    const v3, -0x484c62b2

    invoke-static {v3, v12, v4, v15, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    iget-object v3, v0, LN/V0$a;->l:Lmh/p;

    iget-boolean v14, v0, LN/V0$a;->m:Z

    and-int/lit8 v4, v13, 0xe

    const/4 v12, 0x4

    if-ne v4, v12, :cond_11

    const/16 v17, 0x1

    goto :goto_b

    :cond_11
    const/16 v17, 0x0

    :goto_b
    invoke-interface/range {p7 .. p7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v17, :cond_12

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_13

    :cond_12
    new-instance v4, LN/V0$a$a;

    invoke-direct {v4, v9, v2}, LN/V0$a$a;-><init>(FLT/q0;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    move-object v12, v4

    check-cast v12, Lmh/l;

    iget-object v5, v0, LN/V0$a;->n:Lz/N;

    shl-int/lit8 v2, v13, 0x15

    const/high16 v4, 0x1c00000

    and-int/2addr v2, v4

    const/high16 v4, 0x30000000

    or-int v13, v2, v4

    const/16 v16, 0x0

    move-object v2, v3

    move-object v3, v8

    move-object v4, v7

    move-object/from16 v17, v5

    move-object v5, v10

    move v7, v14

    move/from16 v8, p1

    move-object v9, v12

    move-object v10, v11

    move-object/from16 v11, v17

    move-object/from16 v12, p7

    move/from16 v14, v16

    invoke-static/range {v1 .. v14}, LN/q0;->b(Landroidx/compose/ui/e;Lmh/p;Lmh/q;Lmh/p;Lmh/p;Lmh/p;ZFLmh/l;Lmh/p;Lz/N;LT/l;II)V

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    goto :goto_c

    :cond_14
    const v2, -0x5d99f269

    invoke-interface {v15, v2}, LT/l;->U(I)V

    iget-object v2, v0, LN/V0$a;->l:Lmh/p;

    iget-boolean v11, v0, LN/V0$a;->m:Z

    iget-object v12, v0, LN/V0$a;->n:Lz/N;

    shl-int/lit8 v3, v13, 0x15

    const/high16 v4, 0x1c00000

    and-int v13, v3, v4

    move-object v3, v7

    move-object v4, v8

    move-object v5, v10

    move v7, v11

    move/from16 v8, p1

    move-object v9, v12

    move-object/from16 v10, p7

    move v11, v13

    invoke-static/range {v1 .. v11}, LN/W0;->a(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;Lmh/p;Lmh/p;ZFLz/N;LT/l;I)V

    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    :goto_c
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    :goto_d
    return-void
.end method
