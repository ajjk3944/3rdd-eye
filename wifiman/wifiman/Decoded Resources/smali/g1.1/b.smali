.class public abstract Lg1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/b$d;,
        Lg1/b$a;,
        Lg1/b$c;,
        Lg1/b$b;
    }
.end annotation


# direct methods
.method static a(Lg1/g;Lg1/b$d;Lg1/a;Landroidx/constraintlayout/core/parser/d;Ljava/lang/String;)V
    .locals 8

    const/16 v0, 0x8

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    const-string v5, "parent"

    const/4 v6, -0x1

    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :goto_0
    move v7, v6

    goto/16 :goto_1

    :sswitch_0
    const-string v7, "visibility"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    const/16 v7, 0x17

    goto/16 :goto_1

    :sswitch_1
    const-string v7, "centerHorizontally"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_0

    :cond_1
    const/16 v7, 0x16

    goto/16 :goto_1

    :sswitch_2
    const-string v7, "hWeight"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_0

    :cond_2
    const/16 v7, 0x15

    goto/16 :goto_1

    :sswitch_3
    const-string v7, "width"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_0

    :cond_3
    const/16 v7, 0x14

    goto/16 :goto_1

    :sswitch_4
    const-string v7, "vBias"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_0

    :cond_4
    const/16 v7, 0x13

    goto/16 :goto_1

    :sswitch_5
    const-string v7, "hBias"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_0

    :cond_5
    const/16 v7, 0x12

    goto/16 :goto_1

    :sswitch_6
    const-string v7, "alpha"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_0

    :cond_6
    const/16 v7, 0x11

    goto/16 :goto_1

    :sswitch_7
    const-string v7, "vWeight"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_0

    :cond_7
    const/16 v7, 0x10

    goto/16 :goto_1

    :sswitch_8
    const-string v7, "hRtlBias"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_0

    :cond_8
    const/16 v7, 0xf

    goto/16 :goto_1

    :sswitch_9
    const-string v7, "scaleY"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v7, 0xe

    goto/16 :goto_1

    :sswitch_a
    const-string v7, "scaleX"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v7, 0xd

    goto/16 :goto_1

    :sswitch_b
    const-string v7, "pivotY"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v7, 0xc

    goto/16 :goto_1

    :sswitch_c
    const-string v7, "pivotX"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v7, 0xb

    goto/16 :goto_1

    :sswitch_d
    const-string v7, "motion"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v7, 0xa

    goto/16 :goto_1

    :sswitch_e
    const-string v7, "height"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v7, 0x9

    goto/16 :goto_1

    :sswitch_f
    const-string v7, "translationZ"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    goto/16 :goto_0

    :cond_f
    move v7, v0

    goto/16 :goto_1

    :sswitch_10
    const-string v7, "translationY"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    goto/16 :goto_0

    :cond_10
    const/4 v7, 0x7

    goto :goto_1

    :sswitch_11
    const-string v7, "translationX"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    goto/16 :goto_0

    :cond_11
    const/4 v7, 0x6

    goto :goto_1

    :sswitch_12
    const-string v7, "rotationZ"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    goto/16 :goto_0

    :cond_12
    const/4 v7, 0x5

    goto :goto_1

    :sswitch_13
    const-string v7, "rotationY"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    goto/16 :goto_0

    :cond_13
    move v7, v1

    goto :goto_1

    :sswitch_14
    const-string v7, "rotationX"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    goto/16 :goto_0

    :cond_14
    const/4 v7, 0x3

    goto :goto_1

    :sswitch_15
    const-string v7, "custom"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    goto/16 :goto_0

    :cond_15
    move v7, v2

    goto :goto_1

    :sswitch_16
    const-string v7, "center"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    goto/16 :goto_0

    :cond_16
    move v7, v3

    goto :goto_1

    :sswitch_17
    const-string v7, "centerVertically"

    invoke-virtual {p4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    goto/16 :goto_0

    :cond_17
    move v7, v4

    :goto_1
    packed-switch v7, :pswitch_data_0

    invoke-static {p0, p1, p3, p2, p4}, Lg1/b;->h(Lg1/g;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;Lg1/a;Ljava/lang/String;)V

    goto/16 :goto_5

    :pswitch_0
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_1

    :goto_2
    move v2, v6

    goto :goto_3

    :sswitch_18
    const-string p1, "visible"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto :goto_2

    :sswitch_19
    const-string p1, "gone"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto :goto_2

    :cond_18
    move v2, v3

    goto :goto_3

    :sswitch_1a
    const-string p1, "invisible"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto :goto_2

    :cond_19
    move v2, v4

    :cond_1a
    :goto_3
    packed-switch v2, :pswitch_data_1

    goto/16 :goto_5

    :pswitch_1
    invoke-virtual {p2, v4}, Lg1/a;->r0(I)Lg1/a;

    goto/16 :goto_5

    :pswitch_2
    invoke-virtual {p2, v0}, Lg1/a;->r0(I)Lg1/a;

    goto/16 :goto_5

    :pswitch_3
    invoke-virtual {p2, v1}, Lg1/a;->r0(I)Lg1/a;

    const/4 p0, 0x0

    invoke-virtual {p2, p0}, Lg1/a;->g(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_4
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1b

    sget-object p1, Lg1/g;->k:Ljava/lang/Integer;

    :cond_1b
    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p0

    invoke-virtual {p2, p0}, Lg1/a;->i0(Ljava/lang/Object;)Lg1/a;

    invoke-virtual {p2, p0}, Lg1/a;->z(Ljava/lang/Object;)Lg1/a;

    goto/16 :goto_5

    :pswitch_5
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->a0(F)V

    goto/16 :goto_5

    :pswitch_6
    invoke-virtual {p0}, Lg1/g;->h()Lg1/c;

    move-result-object p1

    invoke-static {p3, p4, p0, p1}, Lg1/b;->j(Landroidx/constraintlayout/core/parser/d;Ljava/lang/String;Lg1/g;Lg1/c;)Lg1/d;

    move-result-object p0

    invoke-virtual {p2, p0}, Lg1/a;->f0(Lg1/d;)Lg1/a;

    goto/16 :goto_5

    :pswitch_7
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->q0(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_8
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->F(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_9
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->g(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_a
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->d0(F)V

    goto/16 :goto_5

    :pswitch_b
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p3

    invoke-virtual {p1, p3}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p0}, Lg1/g;->r()Z

    move-result p0

    if-eqz p0, :cond_1c

    const/high16 p0, 0x3f800000    # 1.0f

    sub-float p1, p0, p1

    :cond_1c
    invoke-virtual {p2, p1}, Lg1/a;->F(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_c
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->W(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_d
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->V(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_e
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->O(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_f
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->N(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_10
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-static {p0, p2}, Lg1/b;->r(Landroidx/constraintlayout/core/parser/b;Lg1/a;)V

    goto/16 :goto_5

    :pswitch_11
    invoke-virtual {p0}, Lg1/g;->h()Lg1/c;

    move-result-object p1

    invoke-static {p3, p4, p0, p1}, Lg1/b;->j(Landroidx/constraintlayout/core/parser/d;Ljava/lang/String;Lg1/g;Lg1/c;)Lg1/d;

    move-result-object p0

    invoke-virtual {p2, p0}, Lg1/a;->Y(Lg1/d;)Lg1/a;

    goto/16 :goto_5

    :pswitch_12
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p3

    invoke-virtual {p1, p3}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-static {p0, p1}, Lg1/b;->w(Lg1/g;F)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->p0(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_13
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p3

    invoke-virtual {p1, p3}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-static {p0, p1}, Lg1/b;->w(Lg1/g;F)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->o0(F)Lg1/a;

    goto/16 :goto_5

    :pswitch_14
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p3

    invoke-virtual {p1, p3}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-static {p0, p1}, Lg1/b;->w(Lg1/g;F)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->n0(F)Lg1/a;

    goto :goto_5

    :pswitch_15
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->U(F)Lg1/a;

    goto :goto_5

    :pswitch_16
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->T(F)Lg1/a;

    goto :goto_5

    :pswitch_17
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result p0

    invoke-virtual {p2, p0}, Lg1/a;->S(F)Lg1/a;

    goto :goto_5

    :pswitch_18
    invoke-static {p3, p2, p4}, Lg1/b;->i(Landroidx/constraintlayout/core/parser/d;Lg1/a;Ljava/lang/String;)V

    goto :goto_5

    :pswitch_19
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1d

    sget-object p1, Lg1/g;->k:Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p0

    goto :goto_4

    :cond_1d
    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p0

    :goto_4
    invoke-virtual {p2, p0}, Lg1/a;->i0(Ljava/lang/Object;)Lg1/a;

    invoke-virtual {p2, p0}, Lg1/a;->z(Ljava/lang/Object;)Lg1/a;

    invoke-virtual {p2, p0}, Lg1/a;->m0(Ljava/lang/Object;)Lg1/a;

    invoke-virtual {p2, p0}, Lg1/a;->p(Ljava/lang/Object;)Lg1/a;

    goto :goto_5

    :pswitch_1a
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1e

    sget-object p1, Lg1/g;->k:Ljava/lang/Integer;

    :cond_1e
    invoke-virtual {p0, p1}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p0

    invoke-virtual {p2, p0}, Lg1/a;->m0(Ljava/lang/Object;)Lg1/a;

    invoke-virtual {p2, p0}, Lg1/a;->p(Ljava/lang/Object;)Lg1/a;

    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x565a8e48 -> :sswitch_17
        -0x514d33ab -> :sswitch_16
        -0x5069748f -> :sswitch_15
        -0x4a771f66 -> :sswitch_14
        -0x4a771f65 -> :sswitch_13
        -0x4a771f64 -> :sswitch_12
        -0x490b9c39 -> :sswitch_11
        -0x490b9c38 -> :sswitch_10
        -0x490b9c37 -> :sswitch_f
        -0x48c76ed9 -> :sswitch_e
        -0x3fad404a -> :sswitch_d
        -0x3ae243aa -> :sswitch_c
        -0x3ae243a9 -> :sswitch_b
        -0x3621dfb2 -> :sswitch_a
        -0x3621dfb1 -> :sswitch_9
        -0xec32145 -> :sswitch_8
        -0x3aa8172 -> :sswitch_7
        0x589b15e -> :sswitch_6
        0x5d92341 -> :sswitch_5
        0x69e6c4f -> :sswitch_4
        0x6be2dc6 -> :sswitch_3
        0x17be4100 -> :sswitch_2
        0x53b069a6 -> :sswitch_1
        0x73b66312 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x715b4053 -> :sswitch_1a
        0x30809f -> :sswitch_19
        0x1bd1f072 -> :sswitch_18
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static varargs b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    aget-object v1, p1, v0

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method static c(Landroidx/constraintlayout/core/parser/d;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "type"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method static d(Lg1/g;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V
    .locals 9

    const/4 v0, 0x2

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0}, Lg1/g;->r()Z

    move-result v4

    sget-object v5, Lg1/g$c;->END:Lg1/g$c;

    invoke-virtual {p0, p1, v5}, Lg1/g;->b(Ljava/lang/Object;Lg1/g$c;)Lh1/c;

    move-result-object p1

    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v5

    if-nez v5, :cond_0

    return-void

    :cond_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :goto_1
    move v7, v1

    goto :goto_2

    :sswitch_0
    const-string v7, "contains"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    move v7, v0

    goto :goto_2

    :sswitch_1
    const-string v7, "direction"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    move v7, v2

    goto :goto_2

    :sswitch_2
    const-string v7, "margin"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_1

    :cond_4
    move v7, v3

    :goto_2
    packed-switch v7, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p2, v6}, Landroidx/constraintlayout/core/parser/a;->G(Ljava/lang/String;)Lf1/a;

    move-result-object v6

    if-eqz v6, :cond_1

    move v7, v3

    :goto_3
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v8

    if-ge v7, v8, :cond_1

    invoke-virtual {v6, v7}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {p1, v8}, Lg1/e;->s0([Ljava/lang/Object;)Lg1/e;

    add-int/2addr v7, v2

    goto :goto_3

    :pswitch_1
    invoke-virtual {p2, v6}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_1

    :goto_4
    move v6, v1

    goto :goto_5

    :sswitch_3
    const-string v7, "start"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_4

    :cond_5
    const/4 v6, 0x5

    goto :goto_5

    :sswitch_4
    const-string v7, "right"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    const/4 v6, 0x4

    goto :goto_5

    :sswitch_5
    const-string v7, "left"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_4

    :cond_7
    const/4 v6, 0x3

    goto :goto_5

    :sswitch_6
    const-string v7, "top"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_4

    :cond_8
    move v6, v0

    goto :goto_5

    :sswitch_7
    const-string v7, "end"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_4

    :cond_9
    move v6, v2

    goto :goto_5

    :sswitch_8
    const-string v7, "bottom"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_4

    :cond_a
    move v6, v3

    :goto_5
    packed-switch v6, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_2
    if-nez v4, :cond_b

    sget-object v6, Lg1/g$c;->LEFT:Lg1/g$c;

    invoke-virtual {p1, v6}, Lh1/c;->w0(Lg1/g$c;)V

    goto/16 :goto_0

    :cond_b
    sget-object v6, Lg1/g$c;->RIGHT:Lg1/g$c;

    invoke-virtual {p1, v6}, Lh1/c;->w0(Lg1/g$c;)V

    goto/16 :goto_0

    :pswitch_3
    sget-object v6, Lg1/g$c;->RIGHT:Lg1/g$c;

    invoke-virtual {p1, v6}, Lh1/c;->w0(Lg1/g$c;)V

    goto/16 :goto_0

    :pswitch_4
    sget-object v6, Lg1/g$c;->LEFT:Lg1/g$c;

    invoke-virtual {p1, v6}, Lh1/c;->w0(Lg1/g$c;)V

    goto/16 :goto_0

    :pswitch_5
    sget-object v6, Lg1/g$c;->TOP:Lg1/g$c;

    invoke-virtual {p1, v6}, Lh1/c;->w0(Lg1/g$c;)V

    goto/16 :goto_0

    :pswitch_6
    if-nez v4, :cond_c

    sget-object v6, Lg1/g$c;->RIGHT:Lg1/g$c;

    invoke-virtual {p1, v6}, Lh1/c;->w0(Lg1/g$c;)V

    goto/16 :goto_0

    :cond_c
    sget-object v6, Lg1/g$c;->LEFT:Lg1/g$c;

    invoke-virtual {p1, v6}, Lh1/c;->w0(Lg1/g$c;)V

    goto/16 :goto_0

    :pswitch_7
    sget-object v6, Lg1/g$c;->BOTTOM:Lg1/g$c;

    invoke-virtual {p1, v6}, Lh1/c;->w0(Lg1/g$c;)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p2, v6}, Landroidx/constraintlayout/core/parser/a;->L(Ljava/lang/String;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-static {p0, v6}, Lg1/b;->w(Lg1/g;F)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {p1, v6}, Lh1/c;->K(Ljava/lang/Object;)Lg1/a;

    goto/16 :goto_0

    :cond_d
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x40737a52 -> :sswitch_2
        -0x395ff881 -> :sswitch_1
        -0x21d289e1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x527265d5 -> :sswitch_8
        0x188db -> :sswitch_7
        0x1c155 -> :sswitch_6
        0x32a007 -> :sswitch_5
        0x677c21c -> :sswitch_4
        0x68ac462 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method static e(ILg1/g;Lg1/b$d;Lf1/a;)V
    .locals 6

    const/4 v0, 0x1

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lg1/g;->o()Lh1/i;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lg1/g;->A()Lh1/j;

    move-result-object p0

    :goto_0
    invoke-virtual {p3, v0}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v1

    instance-of v2, v1, Lf1/a;

    if-eqz v2, :cond_8

    check-cast v1, Lf1/a;

    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v2

    if-ge v2, v0, :cond_1

    goto/16 :goto_4

    :cond_1
    const/4 v2, 0x0

    move v3, v2

    :goto_1
    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v4}, Lg1/e;->s0([Ljava/lang/Object;)Lg1/e;

    add-int/2addr v3, v0

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v1

    const/4 v3, 0x2

    if-le v1, v3, :cond_8

    invoke-virtual {p3, v3}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object p3

    instance-of v1, p3, Landroidx/constraintlayout/core/parser/d;

    if-nez v1, :cond_3

    return-void

    :cond_3
    check-cast p3, Landroidx/constraintlayout/core/parser/d;

    invoke-virtual {p3}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    const-string v4, "style"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {p1, p2, p3, p0, v3}, Lg1/b;->h(Lg1/g;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;Lg1/a;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p3, v3}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    instance-of v4, v3, Lf1/a;

    if-eqz v4, :cond_5

    move-object v4, v3

    check-cast v4, Lf1/a;

    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v5

    if-le v5, v0, :cond_5

    invoke-virtual {v4, v2}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v0}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v4

    invoke-virtual {p0, v4}, Lh1/d;->x0(F)Lh1/d;

    goto :goto_3

    :cond_5
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v3

    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    const-string v4, "packed"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "spread_inside"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    sget-object v3, Lg1/g$a;->SPREAD:Lg1/g$a;

    invoke-virtual {p0, v3}, Lh1/d;->D0(Lg1/g$a;)Lh1/d;

    goto :goto_2

    :cond_6
    sget-object v3, Lg1/g$a;->SPREAD_INSIDE:Lg1/g$a;

    invoke-virtual {p0, v3}, Lh1/d;->D0(Lg1/g$a;)Lh1/d;

    goto :goto_2

    :cond_7
    sget-object v3, Lg1/g$a;->PACKED:Lg1/g$a;

    invoke-virtual {p0, v3}, Lh1/d;->D0(Lg1/g$a;)Lh1/d;

    goto :goto_2

    :cond_8
    :goto_4
    return-void
.end method

.method private static f(Ljava/lang/String;Lg1/g;Ljava/lang/String;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V
    .locals 21

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    const/4 v3, 0x6

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object/from16 v10, p0

    invoke-virtual {v10, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v11, 0x68

    if-ne v10, v11, :cond_0

    invoke-virtual/range {p1 .. p1}, Lg1/g;->o()Lh1/i;

    move-result-object v10

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lg1/g;->A()Lh1/j;

    move-result-object v10

    :goto_0
    invoke-virtual {v10, v1}, Lg1/a;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p4 .. p4}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_15

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    const/4 v12, -0x1

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v13

    sparse-switch v13, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v13, "style"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v12, 0x7

    goto :goto_2

    :sswitch_1
    const-string v13, "start"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    goto :goto_2

    :cond_2
    move v12, v3

    goto :goto_2

    :sswitch_2
    const-string v13, "right"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    goto :goto_2

    :cond_3
    move v12, v4

    goto :goto_2

    :sswitch_3
    const-string v13, "left"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    goto :goto_2

    :cond_4
    move v12, v5

    goto :goto_2

    :sswitch_4
    const-string v13, "top"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_2

    :cond_5
    move v12, v6

    goto :goto_2

    :sswitch_5
    const-string v13, "end"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_6

    goto :goto_2

    :cond_6
    move v12, v7

    goto :goto_2

    :sswitch_6
    const-string v13, "contains"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    goto :goto_2

    :cond_7
    move v12, v8

    goto :goto_2

    :sswitch_7
    const-string v13, "bottom"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_2

    :cond_8
    move v12, v9

    :goto_2
    packed-switch v12, :pswitch_data_0

    :goto_3
    move-object/from16 v3, p3

    move v9, v6

    goto/16 :goto_9

    :pswitch_0
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    instance-of v12, v11, Lf1/a;

    if-eqz v12, :cond_9

    move-object v12, v11

    check-cast v12, Lf1/a;

    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v13

    if-le v13, v8, :cond_9

    invoke-virtual {v12, v9}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v8}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v12

    invoke-virtual {v10, v12}, Lh1/d;->x0(F)Lh1/d;

    goto :goto_4

    :cond_9
    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v11

    :goto_4
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    const-string v12, "packed"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    const-string v12, "spread_inside"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    sget-object v11, Lg1/g$a;->SPREAD:Lg1/g$a;

    invoke-virtual {v10, v11}, Lh1/d;->D0(Lg1/g$a;)Lh1/d;

    goto :goto_3

    :cond_a
    sget-object v11, Lg1/g$a;->SPREAD_INSIDE:Lg1/g$a;

    invoke-virtual {v10, v11}, Lh1/d;->D0(Lg1/g$a;)Lh1/d;

    goto :goto_3

    :cond_b
    sget-object v11, Lg1/g$a;->PACKED:Lg1/g$a;

    invoke-virtual {v10, v11}, Lh1/d;->D0(Lg1/g$a;)Lh1/d;

    goto :goto_3

    :pswitch_1
    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    instance-of v12, v11, Lf1/a;

    if-eqz v12, :cond_14

    move-object v15, v11

    check-cast v15, Lf1/a;

    invoke-virtual {v15}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v12

    if-ge v12, v8, :cond_c

    goto/16 :goto_8

    :cond_c
    move v14, v9

    :goto_5
    invoke-virtual {v15}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v11

    if-ge v14, v11, :cond_13

    invoke-virtual {v15, v14}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    instance-of v12, v11, Lf1/a;

    if-eqz v12, :cond_12

    check-cast v11, Lf1/a;

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v12

    if-lez v12, :cond_11

    invoke-virtual {v11, v9}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v13

    const/high16 v16, 0x7fc00000    # Float.NaN

    if-eq v13, v7, :cond_10

    if-eq v13, v6, :cond_f

    if-eq v13, v5, :cond_e

    if-eq v13, v3, :cond_d

    move v9, v6

    move/from16 v3, v16

    move v6, v3

    move v13, v6

    move/from16 v17, v13

    goto/16 :goto_6

    :cond_d
    invoke-virtual {v11, v8}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v13

    invoke-virtual {v11, v7}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v3

    invoke-static {v0, v3}, Lg1/b;->w(Lg1/g;F)F

    move-result v3

    invoke-virtual {v11, v6}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v9

    invoke-static {v0, v9}, Lg1/b;->w(Lg1/g;F)F

    move-result v9

    invoke-virtual {v11, v5}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v6

    invoke-static {v0, v6}, Lg1/b;->w(Lg1/g;F)F

    move-result v6

    invoke-virtual {v11, v4}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v11

    invoke-static {v0, v11}, Lg1/b;->w(Lg1/g;F)F

    move-result v11

    move/from16 v16, v3

    move v3, v6

    move v6, v9

    move/from16 v17, v11

    const/4 v9, 0x3

    goto :goto_6

    :cond_e
    invoke-virtual {v11, v8}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v3

    invoke-virtual {v11, v7}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v6

    invoke-static {v0, v6}, Lg1/b;->w(Lg1/g;F)F

    move-result v6

    const/4 v9, 0x3

    invoke-virtual {v11, v9}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v11

    invoke-static {v0, v11}, Lg1/b;->w(Lg1/g;F)F

    move-result v11

    move v13, v3

    move/from16 v3, v16

    move/from16 v17, v3

    move/from16 v16, v6

    move v6, v11

    goto :goto_6

    :cond_f
    move v9, v6

    invoke-virtual {v11, v8}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v3

    invoke-virtual {v11, v7}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v6

    invoke-static {v0, v6}, Lg1/b;->w(Lg1/g;F)F

    move-result v6

    move v13, v3

    move/from16 v3, v16

    move/from16 v17, v3

    move/from16 v16, v6

    goto :goto_6

    :cond_10
    move v9, v6

    invoke-virtual {v11, v8}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v3

    move v13, v3

    move/from16 v3, v16

    move v6, v3

    move/from16 v17, v6

    :goto_6
    move-object v11, v10

    move/from16 v19, v14

    move/from16 v14, v16

    move-object/from16 v20, v15

    move v15, v6

    move/from16 v16, v3

    invoke-virtual/range {v11 .. v17}, Lh1/d;->w0(Ljava/lang/Object;FFFFF)V

    goto :goto_7

    :cond_11
    move v9, v6

    move/from16 v19, v14

    move-object/from16 v20, v15

    goto :goto_7

    :cond_12
    move v9, v6

    move/from16 v19, v14

    move-object/from16 v20, v15

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v10, v3}, Lg1/e;->s0([Ljava/lang/Object;)Lg1/e;

    :goto_7
    add-int/lit8 v14, v19, 0x1

    move v6, v9

    move-object/from16 v15, v20

    const/4 v3, 0x6

    const/4 v9, 0x0

    goto/16 :goto_5

    :cond_13
    move v9, v6

    move-object/from16 v3, p3

    goto :goto_9

    :cond_14
    :goto_8
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " contains should be an array \""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void

    :pswitch_2
    move-object/from16 v3, p3

    move v9, v6

    invoke-static {v0, v3, v2, v10, v11}, Lg1/b;->h(Lg1/g;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;Lg1/a;Ljava/lang/String;)V

    :goto_9
    move v6, v9

    const/4 v3, 0x6

    const/4 v9, 0x0

    goto/16 :goto_1

    :cond_15
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_7
        -0x21d289e1 -> :sswitch_6
        0x188db -> :sswitch_5
        0x1c155 -> :sswitch_4
        0x32a007 -> :sswitch_3
        0x677c21c -> :sswitch_2
        0x68ac462 -> :sswitch_1
        0x68b1db1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method static g(Ljava/lang/String;)J
    .locals 2

    const-string v0, "#"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FF"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_0
    const/16 v0, 0x10

    invoke-static {p0, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    return-wide v0

    :cond_1
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method static h(Lg1/g;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;Lg1/a;Ljava/lang/String;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "right"

    const-string v6, "left"

    const-string v8, "start"

    const-string v9, "end"

    const-string v11, "top"

    const-string v12, "bottom"

    const-string v13, "baseline"

    const/4 v7, 0x0

    const/4 v14, 0x1

    invoke-virtual/range {p0 .. p0}, Lg1/g;->r()Z

    move-result v16

    xor-int/lit8 v17, v16, 0x1

    invoke-virtual {v2, v4}, Landroidx/constraintlayout/core/parser/a;->G(Ljava/lang/String;)Lf1/a;

    move-result-object v10

    const-string v15, "parent"

    if-eqz v10, :cond_1d

    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v2

    if-le v2, v14, :cond_1d

    invoke-virtual {v10, v7}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v14}, Landroidx/constraintlayout/core/parser/a;->W(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v14

    const/16 v19, 0x0

    const/4 v3, 0x2

    if-le v14, v3, :cond_0

    invoke-virtual {v10, v3}, Landroidx/constraintlayout/core/parser/a;->R(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v14

    invoke-virtual {v1, v14}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result v3

    invoke-static {v0, v3}, Lg1/b;->w(Lg1/g;F)F

    move-result v3

    goto :goto_0

    :cond_0
    move/from16 v3, v19

    :goto_0
    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v14

    move/from16 p2, v3

    const/4 v3, 0x3

    if-le v14, v3, :cond_1

    invoke-virtual {v10, v3}, Landroidx/constraintlayout/core/parser/a;->R(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v14

    invoke-virtual {v1, v14}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result v14

    invoke-static {v0, v14}, Lg1/b;->w(Lg1/g;F)F

    move-result v14

    goto :goto_1

    :cond_1
    move/from16 v14, v19

    :goto_1
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    sget-object v2, Lg1/g;->k:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v2

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v2}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v2

    :goto_2
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->hashCode()I

    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_0

    :goto_3
    const/4 v4, -0x1

    goto :goto_4

    :sswitch_0
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    const/4 v4, 0x7

    goto :goto_4

    :sswitch_1
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    const/4 v4, 0x6

    goto :goto_4

    :sswitch_2
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    const/4 v4, 0x5

    goto :goto_4

    :sswitch_3
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    const/4 v4, 0x4

    goto :goto_4

    :sswitch_4
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_3

    :cond_7
    move v4, v3

    goto :goto_4

    :sswitch_5
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    const/4 v4, 0x2

    goto :goto_4

    :sswitch_6
    const-string v15, "circular"

    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_3

    :cond_9
    const/4 v4, 0x1

    goto :goto_4

    :sswitch_7
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_3

    :cond_a
    const/4 v4, 0x0

    :goto_4
    packed-switch v4, :pswitch_data_0

    :goto_5
    move-object/from16 v4, p3

    :goto_6
    const/4 v1, 0x2

    const/4 v15, 0x1

    goto/16 :goto_e

    :pswitch_0
    move-object/from16 v4, p3

    move/from16 v0, v17

    :goto_7
    const/4 v1, 0x2

    const/4 v15, 0x1

    const/16 v18, 0x1

    goto/16 :goto_f

    :pswitch_1
    move-object/from16 v4, p3

    const/4 v0, 0x0

    goto :goto_7

    :pswitch_2
    move-object/from16 v4, p3

    const/4 v0, 0x1

    goto :goto_7

    :pswitch_3
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_1

    :goto_8
    const/4 v1, -0x1

    goto :goto_9

    :sswitch_8
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_8

    :cond_b
    const/4 v1, 0x2

    goto :goto_9

    :sswitch_9
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_8

    :cond_c
    const/4 v1, 0x1

    goto :goto_9

    :sswitch_a
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_8

    :cond_d
    const/4 v1, 0x0

    :goto_9
    packed-switch v1, :pswitch_data_1

    goto :goto_5

    :pswitch_4
    move-object/from16 v4, p3

    invoke-virtual {v4, v2}, Lg1/a;->m0(Ljava/lang/Object;)Lg1/a;

    goto :goto_6

    :pswitch_5
    move-object/from16 v4, p3

    invoke-virtual {v4, v2}, Lg1/a;->l0(Ljava/lang/Object;)Lg1/a;

    goto :goto_6

    :pswitch_6
    move-object/from16 v4, p3

    invoke-virtual {v2}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lg1/a;->k0(Ljava/lang/Object;)Lg1/a;

    goto :goto_6

    :pswitch_7
    move-object/from16 v4, p3

    move/from16 v0, v16

    goto :goto_7

    :pswitch_8
    move-object/from16 v4, p3

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_2

    :goto_a
    const/4 v1, -0x1

    goto :goto_b

    :sswitch_b
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_a

    :cond_e
    const/4 v1, 0x2

    goto :goto_b

    :sswitch_c
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_a

    :cond_f
    const/4 v1, 0x1

    goto :goto_b

    :sswitch_d
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_a

    :cond_10
    const/4 v1, 0x0

    :goto_b
    packed-switch v1, :pswitch_data_2

    goto/16 :goto_6

    :pswitch_9
    invoke-virtual {v4, v2}, Lg1/a;->q(Ljava/lang/Object;)Lg1/a;

    goto/16 :goto_6

    :pswitch_a
    invoke-virtual {v4, v2}, Lg1/a;->p(Ljava/lang/Object;)Lg1/a;

    goto/16 :goto_6

    :pswitch_b
    invoke-virtual {v2}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lg1/a;->o(Ljava/lang/Object;)Lg1/a;

    goto/16 :goto_6

    :pswitch_c
    move-object/from16 v4, p3

    const/4 v15, 0x1

    invoke-virtual {v10, v15}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    invoke-virtual {v1, v11}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result v11

    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v12

    const/4 v13, 0x2

    if-le v12, v13, :cond_11

    invoke-virtual {v10, v13}, Landroidx/constraintlayout/core/parser/a;->R(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v10

    invoke-virtual {v1, v10}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result v1

    invoke-static {v0, v1}, Lg1/b;->w(Lg1/g;F)F

    move-result v19

    :cond_11
    move/from16 v0, v19

    invoke-virtual {v4, v2, v11, v0}, Lg1/a;->r(Ljava/lang/Object;FF)Lg1/a;

    move v1, v13

    goto :goto_e

    :pswitch_d
    move-object/from16 v4, p3

    const/4 v1, 0x2

    const/4 v15, 0x1

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_3

    :goto_c
    const/4 v10, -0x1

    goto :goto_d

    :sswitch_e
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    goto :goto_c

    :cond_12
    move v10, v1

    goto :goto_d

    :sswitch_f
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_13

    goto :goto_c

    :cond_13
    move v10, v15

    goto :goto_d

    :sswitch_10
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    goto :goto_c

    :cond_14
    const/4 v10, 0x0

    :goto_d
    packed-switch v10, :pswitch_data_3

    goto :goto_e

    :pswitch_e
    invoke-virtual/range {p3 .. p3}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0, v10}, Lg1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lg1/a;->m(Ljava/lang/Object;)Lg1/a;

    goto :goto_e

    :pswitch_f
    invoke-virtual/range {p3 .. p3}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0, v10}, Lg1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lg1/a;->l(Ljava/lang/Object;)Lg1/a;

    goto :goto_e

    :pswitch_10
    invoke-virtual/range {p3 .. p3}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0, v10}, Lg1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0, v10}, Lg1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lg1/a;->k(Ljava/lang/Object;)Lg1/a;

    :goto_e
    move v0, v15

    const/16 v18, 0x0

    :goto_f
    if-eqz v18, :cond_1c

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_4

    :goto_10
    const/4 v10, -0x1

    goto :goto_11

    :sswitch_11
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto :goto_10

    :cond_15
    move v10, v3

    goto :goto_11

    :sswitch_12
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    goto :goto_10

    :cond_16
    move v10, v1

    goto :goto_11

    :sswitch_13
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_10

    :cond_17
    move v10, v15

    goto :goto_11

    :sswitch_14
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_10

    :cond_18
    const/4 v10, 0x0

    :goto_11
    packed-switch v10, :pswitch_data_4

    :pswitch_11
    move v7, v15

    goto :goto_12

    :pswitch_12
    move/from16 v7, v17

    goto :goto_12

    :pswitch_13
    const/4 v7, 0x0

    goto :goto_12

    :pswitch_14
    move/from16 v7, v16

    :goto_12
    if-eqz v0, :cond_1a

    if-eqz v7, :cond_19

    invoke-virtual {v4, v2}, Lg1/a;->H(Ljava/lang/Object;)Lg1/a;

    goto :goto_13

    :cond_19
    invoke-virtual {v4, v2}, Lg1/a;->I(Ljava/lang/Object;)Lg1/a;

    goto :goto_13

    :cond_1a
    if-eqz v7, :cond_1b

    invoke-virtual {v4, v2}, Lg1/a;->Q(Ljava/lang/Object;)Lg1/a;

    goto :goto_13

    :cond_1b
    invoke-virtual {v4, v2}, Lg1/a;->R(Ljava/lang/Object;)Lg1/a;

    :cond_1c
    :goto_13
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v4, v0}, Lg1/a;->K(Ljava/lang/Object;)Lg1/a;

    move-result-object v0

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg1/a;->M(Ljava/lang/Object;)Lg1/a;

    goto/16 :goto_17

    :cond_1d
    move-object v2, v3

    move v5, v14

    const/4 v1, 0x2

    const/4 v3, 0x3

    move-object/from16 v6, p2

    invoke-virtual {v6, v4}, Landroidx/constraintlayout/core/parser/a;->X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_26

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1e

    sget-object v6, Lg1/g;->k:Ljava/lang/Integer;

    invoke-virtual {v0, v6}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v6

    goto :goto_14

    :cond_1e
    invoke-virtual {v0, v6}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v6

    :goto_14
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->hashCode()I

    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_5

    :goto_15
    const/4 v7, -0x1

    goto :goto_16

    :sswitch_15
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto :goto_15

    :cond_1f
    const/4 v7, 0x4

    goto :goto_16

    :sswitch_16
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    goto :goto_15

    :cond_20
    move v7, v3

    goto :goto_16

    :sswitch_17
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    goto :goto_15

    :cond_21
    move v7, v1

    goto :goto_16

    :sswitch_18
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    goto :goto_15

    :cond_22
    move v7, v5

    goto :goto_16

    :sswitch_19
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    goto :goto_15

    :cond_23
    const/4 v7, 0x0

    :goto_16
    packed-switch v7, :pswitch_data_5

    goto :goto_17

    :pswitch_15
    if-nez v16, :cond_24

    invoke-virtual {v2, v6}, Lg1/a;->H(Ljava/lang/Object;)Lg1/a;

    goto :goto_17

    :cond_24
    invoke-virtual {v2, v6}, Lg1/a;->R(Ljava/lang/Object;)Lg1/a;

    goto :goto_17

    :pswitch_16
    invoke-virtual {v2, v6}, Lg1/a;->m0(Ljava/lang/Object;)Lg1/a;

    goto :goto_17

    :pswitch_17
    if-nez v16, :cond_25

    invoke-virtual {v2, v6}, Lg1/a;->R(Ljava/lang/Object;)Lg1/a;

    goto :goto_17

    :cond_25
    invoke-virtual {v2, v6}, Lg1/a;->H(Ljava/lang/Object;)Lg1/a;

    goto :goto_17

    :pswitch_18
    invoke-virtual {v2, v6}, Lg1/a;->p(Ljava/lang/Object;)Lg1/a;

    goto :goto_17

    :pswitch_19
    invoke-virtual/range {p3 .. p3}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lg1/a;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v6}, Lg1/a;->k(Ljava/lang/Object;)Lg1/a;

    :cond_26
    :goto_17
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_7
        -0x594af961 -> :sswitch_6
        -0x527265d5 -> :sswitch_5
        0x188db -> :sswitch_4
        0x1c155 -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x669119bb -> :sswitch_a
        -0x527265d5 -> :sswitch_9
        0x1c155 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x669119bb -> :sswitch_d
        -0x527265d5 -> :sswitch_c
        0x1c155 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x669119bb -> :sswitch_10
        -0x527265d5 -> :sswitch_f
        0x1c155 -> :sswitch_e
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        0x188db -> :sswitch_14
        0x32a007 -> :sswitch_13
        0x677c21c -> :sswitch_12
        0x68ac462 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_14
        :pswitch_11
        :pswitch_13
        :pswitch_12
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        -0x669119bb -> :sswitch_19
        -0x527265d5 -> :sswitch_18
        0x188db -> :sswitch_17
        0x1c155 -> :sswitch_16
        0x68ac462 -> :sswitch_15
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch
.end method

.method static i(Landroidx/constraintlayout/core/parser/d;Lg1/a;Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/core/parser/a;->Q(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/d;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v1

    instance-of v2, v1, Lf1/b;

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/b;->f()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lg1/a;->f(Ljava/lang/String;F)V

    goto :goto_0

    :cond_3
    instance-of v2, v1, Lf1/c;

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lg1/b;->g(Ljava/lang/String;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_2

    long-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Lg1/a;->e(Ljava/lang/String;I)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method static j(Landroidx/constraintlayout/core/parser/d;Ljava/lang/String;Lg1/g;Lg1/c;)Lg1/d;
    .locals 3

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lg1/d;->b(I)Lg1/d;

    move-result-object v1

    instance-of v2, v0, Lf1/c;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lg1/b;->k(Ljava/lang/String;)Lg1/d;

    move-result-object v1

    goto/16 :goto_1

    :cond_0
    instance-of v2, v0, Lf1/b;

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/parser/a;->I(Ljava/lang/String;)F

    move-result p0

    invoke-interface {p3, p0}, Lg1/c;->b(F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p2, p0}, Lg1/g;->e(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Lg1/d;->b(I)Lg1/d;

    move-result-object v1

    goto :goto_1

    :cond_1
    instance-of p0, v0, Landroidx/constraintlayout/core/parser/d;

    if-eqz p0, :cond_6

    check-cast v0, Landroidx/constraintlayout/core/parser/d;

    const-string p0, "value"

    invoke-virtual {v0, p0}, Landroidx/constraintlayout/core/parser/a;->X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lg1/b;->k(Ljava/lang/String;)Lg1/d;

    move-result-object v1

    :cond_2
    const-string p0, "min"

    invoke-virtual {v0, p0}, Landroidx/constraintlayout/core/parser/a;->S(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    if-eqz p0, :cond_4

    instance-of p1, p0, Lf1/b;

    if-eqz p1, :cond_3

    check-cast p0, Lf1/b;

    invoke-virtual {p0}, Lf1/b;->f()F

    move-result p0

    invoke-interface {p3, p0}, Lg1/c;->b(F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p2, p0}, Lg1/g;->e(Ljava/lang/Object;)I

    move-result p0

    invoke-virtual {v1, p0}, Lg1/d;->n(I)Lg1/d;

    goto :goto_0

    :cond_3
    instance-of p0, p0, Lf1/c;

    if-eqz p0, :cond_4

    sget-object p0, Lg1/d;->j:Ljava/lang/Object;

    invoke-virtual {v1, p0}, Lg1/d;->o(Ljava/lang/Object;)Lg1/d;

    :cond_4
    :goto_0
    const-string p0, "max"

    invoke-virtual {v0, p0}, Landroidx/constraintlayout/core/parser/a;->S(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object p0

    if-eqz p0, :cond_6

    instance-of p1, p0, Lf1/b;

    if-eqz p1, :cond_5

    check-cast p0, Lf1/b;

    invoke-virtual {p0}, Lf1/b;->f()F

    move-result p0

    invoke-interface {p3, p0}, Lg1/c;->b(F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p2, p0}, Lg1/g;->e(Ljava/lang/Object;)I

    move-result p0

    invoke-virtual {v1, p0}, Lg1/d;->l(I)Lg1/d;

    goto :goto_1

    :cond_5
    instance-of p0, p0, Lf1/c;

    if-eqz p0, :cond_6

    sget-object p0, Lg1/d;->j:Ljava/lang/Object;

    invoke-virtual {v1, p0}, Lg1/d;->m(Ljava/lang/Object;)Lg1/d;

    :cond_6
    :goto_1
    return-object v1
.end method

.method static k(Ljava/lang/String;)Lg1/d;
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Lg1/d;->b(I)Lg1/d;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 v2, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "wrap"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v3, "spread"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v3, "parent"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v3, "preferWrap"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    move v2, v0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const-string v2, "%"

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v1, 0x25

    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1, p0}, Lg1/d;->e(Ljava/lang/Object;F)Lg1/d;

    move-result-object p0

    invoke-virtual {p0, v0}, Lg1/d;->r(I)Lg1/d;

    move-result-object v1

    goto :goto_1

    :cond_4
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p0}, Lg1/d;->f(Ljava/lang/String;)Lg1/d;

    move-result-object p0

    sget-object v0, Lg1/d;->k:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lg1/d;->s(Ljava/lang/Object;)Lg1/d;

    move-result-object v1

    goto :goto_1

    :pswitch_0
    invoke-static {}, Lg1/d;->h()Lg1/d;

    move-result-object v1

    goto :goto_1

    :pswitch_1
    sget-object p0, Lg1/d;->k:Ljava/lang/Object;

    invoke-static {p0}, Lg1/d;->g(Ljava/lang/Object;)Lg1/d;

    move-result-object v1

    goto :goto_1

    :pswitch_2
    invoke-static {}, Lg1/d;->d()Lg1/d;

    move-result-object v1

    goto :goto_1

    :pswitch_3
    sget-object p0, Lg1/d;->j:Ljava/lang/Object;

    invoke-static {p0}, Lg1/d;->g(Ljava/lang/Object;)Lg1/d;

    move-result-object v1

    :cond_5
    :goto_1
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x57099186 -> :sswitch_3
        -0x3b54f756 -> :sswitch_2
        -0x35630e8d -> :sswitch_1
        0x37d04a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static l(Ljava/lang/String;Lg1/g;Ljava/lang/String;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    const/4 v3, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object/from16 v8, p0

    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x76

    const/4 v10, 0x1

    if-ne v8, v9, :cond_0

    move v8, v10

    goto :goto_0

    :cond_0
    move v8, v7

    :goto_0
    invoke-virtual {v0, v1, v8}, Lg1/g;->i(Ljava/lang/Object;Z)Lh1/f;

    move-result-object v8

    invoke-virtual/range {p4 .. p4}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    const/high16 v12, 0x3f000000    # 0.5f

    const-string v13, ""

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_0

    :goto_2
    const/4 v14, -0x1

    goto/16 :goto_3

    :sswitch_0
    const-string v14, "wrap"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1

    goto :goto_2

    :cond_1
    const/16 v14, 0xc

    goto/16 :goto_3

    :sswitch_1
    const-string v14, "vGap"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2

    goto :goto_2

    :cond_2
    const/16 v14, 0xb

    goto/16 :goto_3

    :sswitch_2
    const-string v14, "type"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3

    goto :goto_2

    :cond_3
    const/16 v14, 0xa

    goto/16 :goto_3

    :sswitch_3
    const-string v14, "hGap"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_4

    goto :goto_2

    :cond_4
    const/16 v14, 0x9

    goto/16 :goto_3

    :sswitch_4
    const-string v14, "maxElement"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    goto :goto_2

    :cond_5
    const/16 v14, 0x8

    goto/16 :goto_3

    :sswitch_5
    const-string v14, "contains"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    goto :goto_2

    :cond_6
    const/4 v14, 0x7

    goto :goto_3

    :sswitch_6
    const-string v14, "vFlowBias"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    goto :goto_2

    :cond_7
    const/4 v14, 0x6

    goto :goto_3

    :sswitch_7
    const-string v14, "padding"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    goto :goto_2

    :cond_8
    const/4 v14, 0x5

    goto :goto_3

    :sswitch_8
    const-string v14, "vStyle"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    goto :goto_2

    :cond_9
    move v14, v3

    goto :goto_3

    :sswitch_9
    const-string v14, "vAlign"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_2

    :cond_a
    move v14, v5

    goto :goto_3

    :sswitch_a
    const-string v14, "hFlowBias"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_b

    goto/16 :goto_2

    :cond_b
    move v14, v6

    goto :goto_3

    :sswitch_b
    const-string v14, "hStyle"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_c

    goto/16 :goto_2

    :cond_c
    move v14, v10

    goto :goto_3

    :sswitch_c
    const-string v14, "hAlign"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_d

    goto/16 :goto_2

    :cond_d
    move v14, v7

    :goto_3
    packed-switch v14, :pswitch_data_0

    invoke-virtual/range {p1 .. p2}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v12

    move-object/from16 v14, p3

    invoke-static {v0, v14, v12, v2, v11}, Lg1/b;->a(Lg1/g;Lg1/b$d;Lg1/a;Landroidx/constraintlayout/core/parser/d;Ljava/lang/String;)V

    goto/16 :goto_10

    :pswitch_0
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lg1/g$e;->getValueByString(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v8, v11}, Lh1/f;->R0(I)V

    goto/16 :goto_10

    :pswitch_1
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v11

    invoke-virtual {v8, v11}, Lh1/f;->P0(I)V

    goto/16 :goto_10

    :pswitch_2
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v11

    const-string v12, "hFlow"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-virtual {v8, v7}, Lh1/f;->J0(I)V

    goto/16 :goto_10

    :cond_e
    invoke-virtual {v8, v10}, Lh1/f;->J0(I)V

    goto/16 :goto_10

    :pswitch_3
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v11

    invoke-virtual {v8, v11}, Lh1/f;->C0(I)V

    goto/16 :goto_10

    :pswitch_4
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v11

    invoke-virtual {v8, v11}, Lh1/f;->I0(I)V

    goto/16 :goto_10

    :pswitch_5
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v11

    instance-of v12, v11, Lf1/a;

    if-eqz v12, :cond_15

    move-object v12, v11

    check-cast v12, Lf1/a;

    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v13

    if-ge v13, v10, :cond_f

    goto/16 :goto_8

    :cond_f
    move v11, v7

    :goto_4
    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v13

    if-ge v11, v13, :cond_2b

    invoke-virtual {v12, v11}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v13

    instance-of v15, v13, Lf1/a;

    if-eqz v15, :cond_13

    check-cast v13, Lf1/a;

    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v15

    if-lez v15, :cond_14

    invoke-virtual {v13, v7}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v15

    invoke-virtual {v15}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v4

    const/high16 v16, 0x7fc00000    # Float.NaN

    if-eq v4, v6, :cond_12

    if-eq v4, v5, :cond_11

    if-eq v4, v3, :cond_10

    move/from16 v3, v16

    move v4, v3

    move v13, v4

    goto :goto_6

    :cond_10
    invoke-virtual {v13, v10}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v16

    invoke-virtual {v13, v6}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v4

    invoke-static {v0, v4}, Lg1/b;->w(Lg1/g;F)F

    move-result v4

    invoke-virtual {v13, v5}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v13

    invoke-static {v0, v13}, Lg1/b;->w(Lg1/g;F)F

    move-result v13

    move v3, v13

    move v13, v4

    :goto_5
    move/from16 v4, v16

    goto :goto_6

    :cond_11
    invoke-virtual {v13, v10}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v16

    invoke-virtual {v13, v6}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v4

    invoke-static {v0, v4}, Lg1/b;->w(Lg1/g;F)F

    move-result v4

    move v3, v4

    move v13, v3

    goto :goto_5

    :cond_12
    invoke-virtual {v13, v10}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v4

    move/from16 v3, v16

    move v13, v3

    :goto_6
    invoke-virtual {v8, v15, v4, v13, v3}, Lh1/f;->w0(Ljava/lang/String;FFF)V

    goto :goto_7

    :cond_13
    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v8, v3}, Lg1/e;->s0([Ljava/lang/Object;)Lg1/e;

    :cond_14
    :goto_7
    add-int/2addr v11, v10

    const/4 v3, 0x4

    goto :goto_4

    :cond_15
    :goto_8
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " contains should be an array \""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void

    :pswitch_6
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    instance-of v13, v3, Lf1/a;

    if-eqz v13, :cond_16

    move-object v13, v3

    check-cast v13, Lf1/a;

    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v15

    if-le v15, v10, :cond_16

    invoke-virtual {v13, v7}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v13, v10}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v15

    if-le v15, v6, :cond_17

    invoke-virtual {v13, v6}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    goto :goto_9

    :cond_16
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/b;->f()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    :cond_17
    :goto_9
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8, v3}, Lg1/a;->q0(F)Lg1/a;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    cmpl-float v3, v3, v12

    if-eqz v3, :cond_18

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->z0(F)V

    :cond_18
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v3

    cmpl-float v3, v3, v12

    if-eqz v3, :cond_2b

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->G0(F)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_10

    :pswitch_7
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    instance-of v4, v3, Lf1/a;

    if-eqz v4, :cond_1a

    move-object v4, v3

    check-cast v4, Lf1/a;

    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v11

    if-le v11, v10, :cond_1a

    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v4, v10}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v13

    if-le v13, v6, :cond_19

    invoke-virtual {v4, v6}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v4

    int-to-float v4, v4

    :try_start_1
    check-cast v3, Lf1/a;

    invoke-virtual {v3, v5}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v3
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    int-to-float v3, v3

    goto :goto_a

    :catch_0
    const/4 v3, 0x0

    goto :goto_a

    :cond_19
    move v4, v11

    move v3, v12

    goto :goto_a

    :cond_1a
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v3

    int-to-float v11, v3

    move v3, v11

    move v4, v3

    move v12, v4

    :goto_a
    invoke-static {v0, v11}, Lg1/b;->w(Lg1/g;F)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    invoke-virtual {v8, v11}, Lh1/f;->L0(I)V

    invoke-static {v0, v12}, Lg1/b;->w(Lg1/g;F)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    invoke-virtual {v8, v11}, Lh1/f;->N0(I)V

    invoke-static {v0, v4}, Lg1/b;->w(Lg1/g;F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v8, v4}, Lh1/f;->M0(I)V

    invoke-static {v0, v3}, Lg1/b;->w(Lg1/g;F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->K0(I)V

    goto/16 :goto_10

    :pswitch_8
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    instance-of v4, v3, Lf1/a;

    if-eqz v4, :cond_1c

    move-object v4, v3

    check-cast v4, Lf1/a;

    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v11

    if-le v11, v10, :cond_1c

    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v10}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v12

    if-le v12, v6, :cond_1b

    invoke-virtual {v4, v6}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_b

    :cond_1b
    move-object v4, v13

    goto :goto_b

    :cond_1c
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v11

    move-object v3, v13

    move-object v4, v3

    :goto_b
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1d

    invoke-static {v11}, Lg1/g$a;->getValueByString(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v8, v11}, Lh1/f;->Q0(I)V

    :cond_1d
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1e

    invoke-static {v3}, Lg1/g$a;->getValueByString(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->A0(I)V

    :cond_1e
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    invoke-static {v4}, Lg1/g$a;->getValueByString(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->H0(I)V

    goto/16 :goto_10

    :pswitch_9
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_1

    :goto_c
    const/4 v3, -0x1

    goto :goto_d

    :sswitch_d
    const-string v4, "top"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1f

    goto :goto_c

    :cond_1f
    move v3, v6

    goto :goto_d

    :sswitch_e
    const-string v4, "bottom"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_20

    goto :goto_c

    :cond_20
    move v3, v10

    goto :goto_d

    :sswitch_f
    const-string v4, "baseline"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    goto :goto_c

    :cond_21
    move v3, v7

    :goto_d
    packed-switch v3, :pswitch_data_1

    invoke-virtual {v8, v6}, Lh1/f;->O0(I)V

    goto/16 :goto_10

    :pswitch_a
    invoke-virtual {v8, v7}, Lh1/f;->O0(I)V

    goto/16 :goto_10

    :pswitch_b
    invoke-virtual {v8, v10}, Lh1/f;->O0(I)V

    goto/16 :goto_10

    :pswitch_c
    invoke-virtual {v8, v5}, Lh1/f;->O0(I)V

    goto/16 :goto_10

    :pswitch_d
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    instance-of v13, v3, Lf1/a;

    if-eqz v13, :cond_22

    move-object v13, v3

    check-cast v13, Lf1/a;

    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v15

    if-le v15, v10, :cond_22

    invoke-virtual {v13, v7}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v13, v10}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v13}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v15

    if-le v15, v6, :cond_23

    invoke-virtual {v13, v6}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    goto :goto_e

    :cond_22
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/b;->f()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    :cond_23
    :goto_e
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8, v3}, Lg1/a;->F(F)Lg1/a;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    cmpl-float v3, v3, v12

    if-eqz v3, :cond_24

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->x0(F)V

    :cond_24
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v3

    cmpl-float v3, v3, v12

    if-eqz v3, :cond_2b

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->E0(F)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_10

    :pswitch_e
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    instance-of v4, v3, Lf1/a;

    if-eqz v4, :cond_26

    move-object v4, v3

    check-cast v4, Lf1/a;

    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v11

    if-le v11, v10, :cond_26

    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v10}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v12

    if-le v12, v6, :cond_25

    invoke-virtual {v4, v6}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_f

    :cond_25
    move-object v4, v13

    goto :goto_f

    :cond_26
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v11

    move-object v3, v13

    move-object v4, v3

    :goto_f
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_27

    invoke-static {v11}, Lg1/g$a;->getValueByString(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v8, v11}, Lh1/f;->D0(I)V

    :cond_27
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_28

    invoke-static {v3}, Lg1/g$a;->getValueByString(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->y0(I)V

    :cond_28
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    invoke-static {v4}, Lg1/g$a;->getValueByString(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v8, v3}, Lh1/f;->F0(I)V

    goto :goto_10

    :pswitch_f
    move-object/from16 v14, p3

    invoke-virtual {v2, v11}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    const-string v4, "end"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2a

    const-string v4, "start"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    invoke-virtual {v8, v6}, Lh1/f;->B0(I)V

    goto :goto_10

    :cond_29
    invoke-virtual {v8, v7}, Lh1/f;->B0(I)V

    goto :goto_10

    :cond_2a
    invoke-virtual {v8, v10}, Lh1/f;->B0(I)V

    :catch_1
    :cond_2b
    :goto_10
    const/4 v3, 0x4

    goto/16 :goto_1

    :cond_2c
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4ac15883 -> :sswitch_c
        -0x49bfd1d7 -> :sswitch_b
        -0x47693271 -> :sswitch_a
        -0x32dd7fd1 -> :sswitch_9
        -0x31dbf925 -> :sswitch_8
        -0x300fc3ef -> :sswitch_7
        -0x2bab2063 -> :sswitch_6
        -0x21d289e1 -> :sswitch_5
        -0x1d240708 -> :sswitch_4
        0x305d4e -> :sswitch_3
        0x368f3a -> :sswitch_2
        0x36ba80 -> :sswitch_1
        0x37d04a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x669119bb -> :sswitch_f
        -0x527265d5 -> :sswitch_e
        0x1c155 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method static m(Lg1/g;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V
    .locals 5

    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p2, v1}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v2

    invoke-virtual {p1, v1}, Lg1/b$d;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v3, v2, Landroidx/constraintlayout/core/parser/d;

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object v4, v2

    check-cast v4, Landroidx/constraintlayout/core/parser/d;

    invoke-static {p0, p1, v3, v4}, Lg1/b;->u(Lg1/g;Lg1/b$d;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static n(Ljava/lang/String;Lg1/g;Ljava/lang/String;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V
    .locals 10

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1, p2, p0}, Lg1/g;->j(Ljava/lang/Object;Ljava/lang/String;)Lh1/g;

    move-result-object p0

    invoke-virtual {p4}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    const-string v6, ":"

    const-string v7, ","

    const/4 v8, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v9, "columnWeights"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v8, 0xb

    goto/16 :goto_1

    :sswitch_1
    const-string v9, "columns"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v8, 0xa

    goto/16 :goto_1

    :sswitch_2
    const-string v9, "rowWeights"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v8, 0x9

    goto/16 :goto_1

    :sswitch_3
    const-string v9, "spans"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v8, 0x8

    goto/16 :goto_1

    :sswitch_4
    const-string v9, "skips"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_1

    :cond_5
    const/4 v8, 0x7

    goto :goto_1

    :sswitch_5
    const-string v9, "flags"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_1

    :cond_6
    const/4 v8, 0x6

    goto :goto_1

    :sswitch_6
    const-string v9, "vGap"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    goto :goto_1

    :cond_7
    const/4 v8, 0x5

    goto :goto_1

    :sswitch_7
    const-string v9, "rows"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    goto :goto_1

    :cond_8
    const/4 v8, 0x4

    goto :goto_1

    :sswitch_8
    const-string v9, "hGap"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_1

    :cond_9
    move v8, v0

    goto :goto_1

    :sswitch_9
    const-string v9, "contains"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_1

    :cond_a
    move v8, v1

    goto :goto_1

    :sswitch_a
    const-string v9, "padding"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    goto :goto_1

    :cond_b
    move v8, v3

    goto :goto_1

    :sswitch_b
    const-string v9, "orientation"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_1

    :cond_c
    move v8, v2

    :goto_1
    packed-switch v8, :pswitch_data_0

    invoke-virtual {p1, p2}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v6

    invoke-static {p1, p3, v6, p4, v5}, Lg1/b;->a(Lg1/g;Lg1/b$d;Lg1/a;Landroidx/constraintlayout/core/parser/d;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {p0, v5}, Lh1/g;->w0(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v5

    if-lez v5, :cond_0

    invoke-virtual {p0, v5}, Lh1/g;->x0(I)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {p0, v5}, Lh1/g;->G0(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {p0, v5}, Lh1/g;->J0(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {p0, v5}, Lh1/g;->I0(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_5
    const-string v6, ""

    :try_start_0
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    instance-of v7, v5, Lf1/b;

    if-eqz v7, :cond_d

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v5

    goto :goto_4

    :catch_0
    move-exception v5

    goto :goto_2

    :cond_d
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    sget-object v7, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Error parsing grid flags "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_3
    move v5, v2

    :goto_4
    if-eqz v6, :cond_e

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_e

    invoke-virtual {p0, v6}, Lh1/g;->z0(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_e
    invoke-virtual {p0, v5}, Lh1/g;->y0(I)V

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->f()F

    move-result v5

    invoke-static {p1, v5}, Lg1/b;->w(Lg1/g;F)F

    move-result v5

    invoke-virtual {p0, v5}, Lh1/g;->K0(F)V

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v5

    if-lez v5, :cond_0

    invoke-virtual {p0, v5}, Lh1/g;->H0(I)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->f()F

    move-result v5

    invoke-static {p1, v5}, Lg1/b;->w(Lg1/g;F)F

    move-result v5

    invoke-virtual {p0, v5}, Lh1/g;->A0(F)V

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->G(Ljava/lang/String;)Lf1/a;

    move-result-object v5

    if-eqz v5, :cond_0

    move v6, v2

    :goto_5
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v7

    if-ge v6, v7, :cond_0

    invoke-virtual {v5, v6}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v7}, Lg1/e;->s0([Ljava/lang/Object;)Lg1/e;

    add-int/2addr v6, v3

    goto :goto_5

    :pswitch_a
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    instance-of v6, v5, Lf1/a;

    if-eqz v6, :cond_10

    move-object v6, v5

    check-cast v6, Lf1/a;

    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v7

    if-le v7, v3, :cond_10

    invoke-virtual {v6, v2}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v9

    if-le v9, v1, :cond_f

    invoke-virtual {v6, v1}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v6

    int-to-float v6, v6

    :try_start_1
    check-cast v5, Lf1/a;

    invoke-virtual {v5, v0}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    int-to-float v5, v5

    goto :goto_6

    :catch_1
    const/4 v5, 0x0

    goto :goto_6

    :cond_f
    move v6, v7

    move v5, v8

    goto :goto_6

    :cond_10
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v5

    int-to-float v7, v5

    move v5, v7

    move v6, v5

    move v8, v6

    :goto_6
    invoke-static {p1, v7}, Lg1/b;->w(Lg1/g;F)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    invoke-virtual {p0, v7}, Lh1/g;->E0(I)V

    invoke-static {p1, v8}, Lg1/b;->w(Lg1/g;F)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    invoke-virtual {p0, v7}, Lh1/g;->F0(I)V

    invoke-static {p1, v6}, Lg1/b;->w(Lg1/g;F)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-virtual {p0, v6}, Lh1/g;->D0(I)V

    invoke-static {p1, v5}, Lg1/b;->w(Lg1/g;F)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {p0, v5}, Lh1/g;->C0(I)V

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {p4, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v5

    invoke-virtual {p0, v5}, Lh1/g;->B0(I)V

    goto/16 :goto_0

    :cond_11
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x55cd0a30 -> :sswitch_b
        -0x300fc3ef -> :sswitch_a
        -0x21d289e1 -> :sswitch_9
        0x305d4e -> :sswitch_8
        0x3581d9 -> :sswitch_7
        0x36ba80 -> :sswitch_6
        0x5cfee87 -> :sswitch_5
        0x686cad4 -> :sswitch_4
        0x688f269 -> :sswitch_3
        0x89c01c1 -> :sswitch_2
        0x389b97dd -> :sswitch_1
        0x793284c5 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static o(ILg1/g;Lf1/a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object p2

    instance-of v0, p2, Landroidx/constraintlayout/core/parser/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p2, Landroidx/constraintlayout/core/parser/d;

    const-string v0, "id"

    invoke-virtual {p2, v0}, Landroidx/constraintlayout/core/parser/a;->X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p0, p1, v0, p2}, Lg1/b;->p(ILg1/g;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V

    return-void
.end method

.method static p(ILg1/g;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "start"

    const-string v4, "right"

    const-string v6, "left"

    const-string v7, "end"

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual/range {p3 .. p3}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v11

    if-nez v11, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p2}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object v12

    if-nez p0, :cond_1

    invoke-virtual/range {p1 .. p2}, Lg1/g;->p(Ljava/lang/Object;)Lh1/h;

    goto :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p2}, Lg1/g;->B(Ljava/lang/Object;)Lh1/h;

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lg1/g;->r()Z

    move-result v13

    if-eqz v13, :cond_3

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    move v13, v9

    goto :goto_2

    :cond_3
    :goto_1
    move v13, v10

    :goto_2
    invoke-virtual {v12}, Lg1/a;->c()Lh1/e;

    move-result-object v12

    check-cast v12, Lh1/h;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v14, 0x0

    move v15, v9

    :goto_3
    move/from16 v16, v10

    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v3, v17

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v17

    sparse-switch v17, :sswitch_data_0

    :goto_5
    move v5, v8

    goto :goto_6

    :sswitch_0
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_4

    goto :goto_5

    :cond_4
    const/16 v17, 0x4

    move/from16 v5, v17

    goto :goto_6

    :sswitch_1
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_5

    goto :goto_5

    :cond_5
    const/4 v5, 0x3

    goto :goto_6

    :sswitch_2
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_6

    goto :goto_5

    :cond_6
    const/4 v5, 0x2

    goto :goto_6

    :sswitch_3
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_7

    goto :goto_5

    :cond_7
    move v5, v10

    goto :goto_6

    :sswitch_4
    const-string v5, "percent"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_5

    :cond_8
    move v5, v9

    :goto_6
    packed-switch v5, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->I(Ljava/lang/String;)F

    move-result v3

    invoke-static {v0, v3}, Lg1/b;->w(Lg1/g;F)F

    move-result v3

    move v14, v3

    :goto_7
    move/from16 v16, v13

    goto :goto_4

    :pswitch_1
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->I(Ljava/lang/String;)F

    move-result v3

    invoke-static {v0, v3}, Lg1/b;->w(Lg1/g;F)F

    move-result v3

    move v14, v3

    move/from16 v16, v9

    goto :goto_4

    :pswitch_2
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->I(Ljava/lang/String;)F

    move-result v3

    invoke-static {v0, v3}, Lg1/b;->w(Lg1/g;F)F

    move-result v3

    move v14, v3

    goto :goto_3

    :pswitch_3
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->I(Ljava/lang/String;)F

    move-result v3

    invoke-static {v0, v3}, Lg1/b;->w(Lg1/g;F)F

    move-result v3

    xor-int/lit8 v16, v13, 0x1

    move v14, v3

    goto :goto_4

    :pswitch_4
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->G(Ljava/lang/String;)Lf1/a;

    move-result-object v5

    if-nez v5, :cond_9

    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->I(Ljava/lang/String;)F

    move-result v3

    move v14, v3

    :goto_8
    move v15, v10

    move/from16 v16, v15

    goto/16 :goto_4

    :cond_9
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v3

    if-le v3, v10, :cond_e

    invoke-virtual {v5, v9}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v10}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v5

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_1

    :goto_9
    move v3, v8

    goto :goto_a

    :sswitch_5
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_9

    :cond_a
    const/4 v3, 0x3

    goto :goto_a

    :sswitch_6
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_9

    :cond_b
    const/4 v3, 0x2

    goto :goto_a

    :sswitch_7
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_9

    :cond_c
    move v3, v10

    goto :goto_a

    :sswitch_8
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_9

    :cond_d
    move v3, v9

    :goto_a
    packed-switch v3, :pswitch_data_1

    :goto_b
    move v14, v5

    :cond_e
    :goto_c
    move v15, v10

    goto/16 :goto_4

    :pswitch_5
    move v14, v5

    move v15, v10

    goto :goto_7

    :pswitch_6
    move v14, v5

    move/from16 v16, v9

    goto :goto_c

    :pswitch_7
    move v14, v5

    goto :goto_8

    :pswitch_8
    xor-int/lit8 v16, v13, 0x1

    goto :goto_b

    :cond_f
    if-eqz v15, :cond_11

    if-eqz v16, :cond_10

    invoke-virtual {v12, v14}, Lh1/h;->f(F)Lh1/h;

    goto :goto_d

    :cond_10
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, v14

    invoke-virtual {v12, v0}, Lh1/h;->f(F)Lh1/h;

    goto :goto_d

    :cond_11
    if-eqz v16, :cond_12

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v12, v0}, Lh1/h;->h(Ljava/lang/Object;)Lh1/h;

    goto :goto_d

    :cond_12
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v12, v0}, Lh1/h;->e(Ljava/lang/Object;)Lh1/h;

    :goto_d
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x28779bbb -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x188db -> :sswitch_8
        0x32a007 -> :sswitch_7
        0x677c21c -> :sswitch_6
        0x68ac462 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method static q(Lg1/g;Lg1/b$d;Lf1/a;)V
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    invoke-virtual {p2, v2}, Landroidx/constraintlayout/core/parser/a;->A(I)Landroidx/constraintlayout/core/parser/b;

    move-result-object v3

    instance-of v4, v3, Lf1/a;

    if-eqz v4, :cond_4

    check-cast v3, Lf1/a;

    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v4

    if-le v4, v0, :cond_4

    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v6, "hGuideline"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x3

    goto :goto_1

    :sswitch_1
    const-string v6, "vChain"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    goto :goto_1

    :sswitch_2
    const-string v6, "hChain"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    move v5, v0

    goto :goto_1

    :sswitch_3
    const-string v6, "vGuideline"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    move v5, v1

    :goto_1
    packed-switch v5, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    invoke-static {v1, p0, v3}, Lg1/b;->o(ILg1/g;Lf1/a;)V

    goto :goto_2

    :pswitch_1
    invoke-static {v0, p0, p1, v3}, Lg1/b;->e(ILg1/g;Lg1/b$d;Lf1/a;)V

    goto :goto_2

    :pswitch_2
    invoke-static {v1, p0, p1, v3}, Lg1/b;->e(ILg1/g;Lg1/b$d;Lf1/a;)V

    goto :goto_2

    :pswitch_3
    invoke-static {v0, p0, v3}, Lg1/b;->o(ILg1/g;Lf1/a;)V

    :cond_4
    :goto_2
    add-int/2addr v2, v0

    goto :goto_0

    :cond_5
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6a6caee6 -> :sswitch_3
        -0x4aa718c7 -> :sswitch_2
        -0x32c34015 -> :sswitch_1
        0x398f2168 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static r(Landroidx/constraintlayout/core/parser/b;Lg1/a;)V
    .locals 13

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    instance-of v4, p0, Landroidx/constraintlayout/core/parser/d;

    if-nez v4, :cond_0

    return-void

    :cond_0
    check-cast p0, Landroidx/constraintlayout/core/parser/d;

    new-instance v4, Le1/a;

    invoke-direct {v4}, Le1/a;-><init>()V

    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v5

    if-nez v5, :cond_1

    return-void

    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :goto_1
    move v7, v3

    goto :goto_2

    :sswitch_0
    const-string v7, "relativeTo"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    const/4 v7, 0x4

    goto :goto_2

    :sswitch_1
    const-string v7, "pathArc"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_1

    :cond_4
    const/4 v7, 0x3

    goto :goto_2

    :sswitch_2
    const-string v7, "quantize"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_1

    :cond_5
    move v7, v0

    goto :goto_2

    :sswitch_3
    const-string v7, "easing"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_1

    :cond_6
    move v7, v1

    goto :goto_2

    :sswitch_4
    const-string v7, "stagger"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_1

    :cond_7
    move v7, v2

    :goto_2
    packed-switch v7, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 v7, 0x25d

    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v7, v6}, Le1/a;->c(ILjava/lang/String;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v11, "below"

    const-string v12, "above"

    const-string v7, "none"

    const-string v8, "startVertical"

    const-string v9, "startHorizontal"

    const-string v10, "flip"

    filled-new-array/range {v7 .. v12}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lg1/b;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    if-ne v7, v3, :cond_8

    sget-object v7, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/b;->k()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " pathArc = \'"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\'"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    const/16 v6, 0x25f

    invoke-virtual {v4, v6, v7}, Le1/a;->b(II)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v7

    instance-of v8, v7, Lf1/a;

    const/16 v9, 0x262

    if-eqz v8, :cond_9

    check-cast v7, Lf1/a;

    invoke-virtual {v7}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v6

    if-lez v6, :cond_2

    invoke-virtual {v7, v2}, Landroidx/constraintlayout/core/parser/a;->M(I)I

    move-result v8

    invoke-virtual {v4, v9, v8}, Le1/a;->b(II)V

    if-le v6, v1, :cond_2

    const/16 v8, 0x263

    invoke-virtual {v7, v1}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v8, v9}, Le1/a;->c(ILjava/lang/String;)V

    if-le v6, v0, :cond_2

    const/16 v6, 0x25a

    invoke-virtual {v7, v0}, Landroidx/constraintlayout/core/parser/a;->H(I)F

    move-result v7

    invoke-virtual {v4, v6, v7}, Le1/a;->a(IF)V

    goto/16 :goto_0

    :cond_9
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/parser/a;->N(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v9, v6}, Le1/a;->b(II)V

    goto/16 :goto_0

    :pswitch_3
    const/16 v7, 0x25b

    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v7, v6}, Le1/a;->c(ILjava/lang/String;)V

    goto/16 :goto_0

    :pswitch_4
    const/16 v7, 0x258

    invoke-virtual {p0, v6}, Landroidx/constraintlayout/core/parser/a;->I(Ljava/lang/String;)F

    move-result v6

    invoke-virtual {v4, v7, v6}, Le1/a;->a(IF)V

    goto/16 :goto_0

    :cond_a
    iput-object v4, p1, Lg1/a;->l0:Le1/a;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7119f053 -> :sswitch_4
        -0x4e19c2d5 -> :sswitch_3
        -0x4c979acf -> :sswitch_2
        -0x2f2d1013 -> :sswitch_1
        -0xe1f7d99 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static s(Lg1/g;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V
    .locals 9

    invoke-virtual {p2}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p2, v3}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v1

    instance-of v2, v1, Lf1/b;

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v1

    invoke-virtual {p1, v3, v1}, Lg1/b$d;->e(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Landroidx/constraintlayout/core/parser/d;

    if-eqz v2, :cond_1

    check-cast v1, Landroidx/constraintlayout/core/parser/d;

    const-string v2, "from"

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->Y(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "to"

    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/parser/a;->Y(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v2

    invoke-virtual {p1, v2}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result v5

    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v2

    invoke-virtual {p1, v2}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result v6

    const-string v2, "prefix"

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "postfix"

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/high16 v1, 0x3f800000    # 1.0f

    move-object v2, p1

    move v4, v5

    move v5, v6

    move v6, v1

    invoke-virtual/range {v2 .. v8}, Lg1/b$d;->d(Ljava/lang/String;FFFLjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->Y(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v4, "step"

    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/parser/a;->Y(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v2

    invoke-virtual {p1, v2}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result v2

    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v1

    invoke-virtual {p1, v1}, Lg1/b$d;->a(Ljava/lang/Object;)F

    move-result v1

    invoke-virtual {p1, v3, v2, v1}, Lg1/b$d;->c(Ljava/lang/String;FF)V

    goto :goto_0

    :cond_4
    const-string v2, "ids"

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->Y(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->F(Ljava/lang/String;)Lf1/a;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v5

    if-ge v4, v5, :cond_5

    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/parser/a;->U(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v3, v2}, Lg1/b$d;->f(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    :cond_6
    const-string v2, "tag"

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->Y(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/a;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lg1/g;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1, v3, v1}, Lg1/b$d;->f(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method static t(Lg1/g;Lg1/b$d;Lg1/a;Landroidx/constraintlayout/core/parser/d;)V
    .locals 2

    invoke-virtual {p2}, Lg1/a;->E()Lg1/d;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lg1/d;->h()Lg1/d;

    move-result-object v0

    invoke-virtual {p2, v0}, Lg1/a;->f0(Lg1/d;)Lg1/a;

    :cond_0
    invoke-virtual {p2}, Lg1/a;->C()Lg1/d;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lg1/d;->h()Lg1/d;

    move-result-object v0

    invoke-virtual {p2, v0}, Lg1/a;->Y(Lg1/d;)Lg1/a;

    :cond_1
    invoke-virtual {p3}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p0, p1, p2, p3, v1}, Lg1/b;->a(Lg1/g;Lg1/b$d;Lg1/a;Landroidx/constraintlayout/core/parser/d;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method static u(Lg1/g;Lg1/b$d;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V
    .locals 0

    invoke-virtual {p0, p2}, Lg1/g;->d(Ljava/lang/Object;)Lg1/a;

    move-result-object p2

    invoke-static {p0, p1, p2, p3}, Lg1/b;->t(Lg1/g;Lg1/b$d;Lg1/a;Landroidx/constraintlayout/core/parser/d;)V

    return-void
.end method

.method public static v(Landroidx/constraintlayout/core/parser/d;Lg1/g;Lg1/b$d;)V
    .locals 9

    const/4 v0, 0x2

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/a;->Z()Ljava/util/ArrayList;

    move-result-object v4

    if-nez v4, :cond_0

    return-void

    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p0, v5}, Landroidx/constraintlayout/core/parser/a;->D(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/b;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :goto_1
    move v7, v1

    goto :goto_2

    :sswitch_0
    const-string v7, "Variables"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    move v7, v0

    goto :goto_2

    :sswitch_1
    const-string v7, "Generate"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    move v7, v2

    goto :goto_2

    :sswitch_2
    const-string v7, "Helpers"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_1

    :cond_4
    move v7, v3

    :goto_2
    packed-switch v7, :pswitch_data_0

    instance-of v7, v6, Landroidx/constraintlayout/core/parser/d;

    if-eqz v7, :cond_10

    check-cast v6, Landroidx/constraintlayout/core/parser/d;

    invoke-static {v6}, Lg1/b;->c(Landroidx/constraintlayout/core/parser/d;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_f

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_1

    :goto_3
    move v8, v1

    goto/16 :goto_4

    :sswitch_3
    const-string v8, "hGuideline"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_3

    :cond_5
    const/16 v8, 0x9

    goto/16 :goto_4

    :sswitch_4
    const-string v8, "vFlow"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_3

    :cond_6
    const/16 v8, 0x8

    goto/16 :goto_4

    :sswitch_5
    const-string v8, "hFlow"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_3

    :cond_7
    const/4 v8, 0x7

    goto :goto_4

    :sswitch_6
    const-string v8, "grid"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_3

    :cond_8
    const/4 v8, 0x6

    goto :goto_4

    :sswitch_7
    const-string v8, "row"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_3

    :cond_9
    const/4 v8, 0x5

    goto :goto_4

    :sswitch_8
    const-string v8, "barrier"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_3

    :cond_a
    const/4 v8, 0x4

    goto :goto_4

    :sswitch_9
    const-string v8, "vChain"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_3

    :cond_b
    const/4 v8, 0x3

    goto :goto_4

    :sswitch_a
    const-string v8, "hChain"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_3

    :cond_c
    move v8, v0

    goto :goto_4

    :sswitch_b
    const-string v8, "column"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_3

    :cond_d
    move v8, v2

    goto :goto_4

    :sswitch_c
    const-string v8, "vGuideline"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_3

    :cond_e
    move v8, v3

    :goto_4
    packed-switch v8, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_0
    invoke-static {v3, p1, v5, v6}, Lg1/b;->p(ILg1/g;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-static {v7, p1, v5, p2, v6}, Lg1/b;->l(Ljava/lang/String;Lg1/g;Ljava/lang/String;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :pswitch_2
    invoke-static {p1, v5, v6}, Lg1/b;->d(Lg1/g;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-static {v7, p1, v5, p2, v6}, Lg1/b;->f(Ljava/lang/String;Lg1/g;Ljava/lang/String;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-static {v7, p1, v5, p2, v6}, Lg1/b;->n(Ljava/lang/String;Lg1/g;Ljava/lang/String;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :pswitch_5
    invoke-static {v2, p1, v5, v6}, Lg1/b;->p(ILg1/g;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :cond_f
    invoke-static {p1, p2, v5, v6}, Lg1/b;->u(Lg1/g;Lg1/b$d;Ljava/lang/String;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :cond_10
    instance-of v7, v6, Lf1/b;

    if-eqz v7, :cond_1

    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/b;->i()I

    move-result v6

    invoke-virtual {p2, v5, v6}, Lg1/b$d;->e(Ljava/lang/String;I)V

    goto/16 :goto_0

    :pswitch_6
    instance-of v5, v6, Landroidx/constraintlayout/core/parser/d;

    if-eqz v5, :cond_1

    check-cast v6, Landroidx/constraintlayout/core/parser/d;

    invoke-static {p1, p2, v6}, Lg1/b;->s(Lg1/g;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :pswitch_7
    instance-of v5, v6, Landroidx/constraintlayout/core/parser/d;

    if-eqz v5, :cond_1

    check-cast v6, Landroidx/constraintlayout/core/parser/d;

    invoke-static {p1, p2, v6}, Lg1/b;->m(Lg1/g;Lg1/b$d;Landroidx/constraintlayout/core/parser/d;)V

    goto/16 :goto_0

    :pswitch_8
    instance-of v5, v6, Lf1/a;

    if-eqz v5, :cond_1

    check-cast v6, Lf1/a;

    invoke-static {p1, p2, v6}, Lg1/b;->q(Lg1/g;Lg1/b$d;Lf1/a;)V

    goto/16 :goto_0

    :cond_11
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6cbf819b -> :sswitch_2
        0x6fc27995 -> :sswitch_1
        0x72879d57 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x6a6caee6 -> :sswitch_c
        -0x50c12caa -> :sswitch_b
        -0x4aa718c7 -> :sswitch_a
        -0x32c34015 -> :sswitch_9
        -0x13db5c49 -> :sswitch_8
        0x1b9da -> :sswitch_7
        0x308b46 -> :sswitch_6
        0x5db01b6 -> :sswitch_5
        0x6a04ac4 -> :sswitch_4
        0x398f2168 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static w(Lg1/g;F)F
    .locals 0

    invoke-virtual {p0}, Lg1/g;->h()Lg1/c;

    move-result-object p0

    invoke-interface {p0, p1}, Lg1/c;->b(F)F

    move-result p0

    return p0
.end method
