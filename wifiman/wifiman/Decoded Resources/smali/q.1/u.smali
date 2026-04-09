.class public abstract Lq/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1, v0}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object v0

    sput-object v0, Lq/u;->a:Lr/h0;

    return-void
.end method

.method public static final a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;
    .locals 10

    move-object v6, p5

    move/from16 v0, p6

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_0

    sget-object v1, Lq/u;->a:Lr/h0;

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_1

    const-string v1, "ColorAnimation"

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v3, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)"

    const v7, -0x1aef6ee4

    invoke-static {v7, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {p0, p1}, Lm0/v0;->p(J)Ln0/c;

    move-result-object v1

    invoke-interface {p5, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_4

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_5

    :cond_4
    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-static {v1}, Lq/h;->a(Lm0/v0$a;)Lmh/l;

    move-result-object v1

    invoke-static {p0, p1}, Lm0/v0;->p(J)Ln0/c;

    move-result-object v3

    invoke-interface {v1, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lr/s0;

    invoke-interface {p5, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v1, v3

    check-cast v1, Lr/s0;

    invoke-static {p0, p1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    and-int/lit8 v7, v0, 0xe

    shl-int/lit8 v8, v0, 0x3

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v7, v8

    shl-int/lit8 v0, v0, 0x6

    const v8, 0xe000

    and-int/2addr v8, v0

    or-int/2addr v7, v8

    const/high16 v8, 0x70000

    and-int/2addr v0, v8

    or-int/2addr v7, v0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v0, v3

    move-object v3, v9

    move-object v6, p5

    invoke-static/range {v0 .. v8}, Lr/c;->f(Ljava/lang/Object;Lr/s0;Lr/i;Ljava/lang/Object;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-object v0
.end method
