.class public abstract Lq/B;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lr/O;JJLr/N;Ljava/lang/String;LT/l;II)LT/z1;
    .locals 11

    move/from16 v0, p8

    and-int/lit8 v1, p9, 0x8

    if-eqz v1, :cond_0

    const-string v1, "ColorAnimation"

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p6

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.animateColor (Transition.kt:101)"

    const v3, 0x715da90d

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface/range {p7 .. p7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-static {v1}, Lq/h;->a(Lm0/v0$a;)Lmh/l;

    move-result-object v1

    invoke-static {p3, p4}, Lm0/v0;->p(J)Ln0/c;

    move-result-object v2

    invoke-interface {v1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr/s0;

    move-object/from16 v8, p7

    invoke-interface {v8, v1}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    move-object/from16 v8, p7

    :goto_1
    move-object v5, v1

    check-cast v5, Lr/s0;

    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    invoke-static {p3, p4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v4

    sget v1, Lr/O;->f:I

    and-int/lit8 v2, v0, 0xe

    or-int/2addr v1, v2

    and-int/lit8 v2, v0, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x380

    or-int/2addr v1, v2

    sget v2, Lr/N;->d:I

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x3

    const v2, 0xe000

    and-int/2addr v2, v0

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v0, v2

    or-int v9, v1, v0

    const/4 v10, 0x0

    move-object v2, p0

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    invoke-static/range {v2 .. v10}, Lr/P;->b(Lr/O;Ljava/lang/Object;Ljava/lang/Object;Lr/s0;Lr/N;Ljava/lang/String;LT/l;II)LT/z1;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-object v0
.end method
