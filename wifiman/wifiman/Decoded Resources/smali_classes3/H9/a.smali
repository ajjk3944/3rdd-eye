.class public abstract LH9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x491fcf84    # 654584.25f

    invoke-interface {v1, v3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.component.shimmer.uiShimmer (Shimmer.kt:15)"

    invoke-static {v3, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v3, Lcom/valentinilk/shimmer/a$b;->a:Lcom/valentinilk/shimmer/a$b;

    invoke-static {}, LVf/j;->c()LVf/h;

    move-result-object v4

    sget-object v5, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v5}, Lm0/v0$a;->e()J

    move-result-wide v6

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    invoke-virtual {v5}, Lm0/v0$a;->e()J

    move-result-wide v7

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/high16 v9, 0x3e800000    # 0.25f

    const/4 v12, 0x0

    invoke-static/range {v7 .. v14}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    invoke-virtual {v5}, Lm0/v0$a;->e()J

    move-result-wide v8

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v8

    invoke-static {v8, v9}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    filled-new-array {v6, v7, v5}, [Lm0/v0;

    move-result-object v5

    invoke-static {v5}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v5

    const/16 v6, 0x4b0

    const/4 v13, 0x0

    invoke-static {v6, v13, v5}, Lr/j;->k(IILr/E;)Lr/r0;

    move-result-object v14

    sget-object v15, Lr/b0;->Restart:Lr/b0;

    const/16 v18, 0x4

    const/16 v19, 0x0

    const-wide/16 v16, 0x0

    invoke-static/range {v14 .. v19}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v5

    const/16 v11, 0x36

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, LVf/h;->b(LVf/h;Lr/i;IFLjava/util/List;Ljava/util/List;FILjava/lang/Object;)LVf/h;

    move-result-object v4

    sget v5, Lcom/valentinilk/shimmer/a$b;->b:I

    sget v6, LVf/h;->g:I

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v5, v6

    invoke-static {v3, v4, v1, v5, v13}, LVf/f;->a(Lcom/valentinilk/shimmer/a;LVf/h;LT/l;II)LVf/b;

    move-result-object v3

    and-int/lit8 v2, v2, 0xe

    sget v4, LVf/b;->d:I

    shl-int/lit8 v4, v4, 0x3

    or-int/2addr v2, v4

    invoke-static {v0, v3, v1, v2, v13}, Lcom/valentinilk/shimmer/c;->a(Landroidx/compose/ui/e;LVf/b;LT/l;II)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    return-object v0
.end method
