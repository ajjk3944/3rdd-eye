.class public abstract LI/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/g1$a;
    }
.end annotation


# instance fields
.field private final a:LJ/i;

.field private final b:LF/n;

.field private final c:LF/x;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LJ/i;

    invoke-direct {v0}, LJ/i;-><init>()V

    iput-object v0, p0, LI/g1;->a:LJ/i;

    new-instance v0, LF/n;

    invoke-direct {v0}, LF/n;-><init>()V

    iput-object v0, p0, LI/g1;->b:LF/n;

    invoke-static {}, LF/z;->a()LF/x;

    move-result-object v0

    iput-object v0, p0, LI/g1;->c:LF/x;

    return-void
.end method

.method private final a(LI/l1;)F
    .locals 4

    invoke-virtual {p1}, LI/l1;->j()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p1}, LI/l1;->e()LC0/r;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, LC0/r;->M()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_2

    const/4 v1, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v0, v1, v3, v2}, LC0/r;->c0(LC0/r;LC0/r;ZILjava/lang/Object;)Ll0/i;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ll0/i;->m()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result p1

    goto :goto_2

    :cond_3
    const/high16 p1, 0x7fc00000    # Float.NaN

    :goto_2
    return p1
.end method


# virtual methods
.method public b(Landroid/view/KeyEvent;LI/o1;LI/l1;LJ/j;ZZLmh/a;)Z
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    invoke-static/range {p1 .. p1}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result v2

    sget-object v3, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v3}, Lw0/c$a;->a()I

    move-result v3

    invoke-static {v2, v3}, Lw0/c;->e(II)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    invoke-static/range {p1 .. p1}, LF/c0;->a(Landroid/view/KeyEvent;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    iget-object v2, v0, LI/g1;->b:LF/n;

    invoke-virtual {v2, v1}, LF/n;->a(Landroid/view/KeyEvent;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v5, v2}, LF/O;->a(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz p5, :cond_1

    invoke-static/range {p1 .. p1}, LI/h1;->c(Landroid/view/KeyEvent;)Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static/range {p2 .. p2}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v3

    invoke-static/range {p2 .. p2}, LI/o1;->b(LI/o1;)LH/b;

    move-result-object v5

    sget-object v6, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v3}, LH/l;->g()LI/I;

    move-result-object v7

    invoke-virtual {v7}, LI/I;->f()LI/m;

    move-result-object v7

    invoke-virtual {v7}, LI/m;->e()V

    invoke-virtual {v3}, LH/l;->g()LI/I;

    move-result-object v7

    invoke-virtual {v7}, LI/I;->c()V

    invoke-static {v7, v2, v4}, LI/H;->a(LI/I;Ljava/lang/String;I)V

    invoke-static {v3, v5, v1, v6}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    iget-object v1, v0, LI/g1;->a:LJ/i;

    invoke-virtual {v1}, LJ/i;->b()V

    move v3, v4

    :cond_1
    return v3

    :cond_2
    iget-object v2, v0, LI/g1;->c:LF/x;

    invoke-interface {v2, v1}, LF/x;->a(Landroid/view/KeyEvent;)LF/v;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, LF/v;->getEditsText()Z

    move-result v5

    if-eqz v5, :cond_3

    if-nez p5, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, LI/h1;->c(Landroid/view/KeyEvent;)Z

    move-result v9

    invoke-virtual/range {p3 .. p3}, LI/l1;->f()LL0/M;

    move-result-object v8

    move-object/from16 v1, p3

    invoke-direct {p0, v1}, LI/g1;->a(LI/l1;)F

    move-result v10

    new-instance v1, LJ/h;

    iget-object v11, v0, LI/g1;->a:LJ/i;

    move-object v6, v1

    move-object/from16 v7, p2

    invoke-direct/range {v6 .. v11}, LJ/h;-><init>(LI/o1;LL0/M;ZFLJ/i;)V

    sget-object v5, LI/g1$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    const/4 v5, -0x1

    const/4 v6, 0x0

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-static {}, LF/w;->b()V

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual/range {p2 .. p2}, LI/o1;->r()V

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual/range {p2 .. p2}, LI/o1;->B()V

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {v1}, LJ/h;->h()LJ/h;

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {v1}, LJ/h;->N()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {v1}, LJ/h;->O()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {v1}, LJ/h;->C()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {v1}, LJ/h;->U()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {v1}, LJ/h;->B()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {v1}, LJ/h;->T()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {v1}, LJ/h;->R()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {v1}, LJ/h;->Q()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {v1}, LJ/h;->P()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {v1}, LJ/h;->S()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {v1}, LJ/h;->G()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {v1}, LJ/h;->J()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {v1}, LJ/h;->M()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {v1}, LJ/h;->E()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_12
    invoke-virtual {v1}, LJ/h;->L()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_13
    invoke-virtual {v1}, LJ/h;->D()LJ/h;

    move-result-object v2

    invoke-virtual {v2}, LJ/h;->W()LJ/h;

    goto/16 :goto_2

    :pswitch_14
    invoke-virtual {v1}, LJ/h;->V()LJ/h;

    goto/16 :goto_2

    :pswitch_15
    if-nez p6, :cond_10

    invoke-static/range {p2 .. p2}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v2

    invoke-static/range {p2 .. p2}, LI/o1;->b(LI/o1;)LH/b;

    move-result-object v3

    sget-object v5, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v2}, LH/l;->g()LI/I;

    move-result-object v6

    invoke-virtual {v6}, LI/I;->f()LI/m;

    move-result-object v6

    invoke-virtual {v6}, LI/m;->e()V

    invoke-virtual {v2}, LH/l;->g()LI/I;

    move-result-object v6

    invoke-virtual {v6}, LI/I;->c()V

    const-string v7, "\t"

    invoke-static {v6, v7, v4}, LI/H;->a(LI/I;Ljava/lang/String;I)V

    invoke-static {v2, v3, v4, v5}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    goto/16 :goto_2

    :pswitch_16
    if-nez p6, :cond_4

    invoke-static/range {p2 .. p2}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v2

    invoke-static/range {p2 .. p2}, LI/o1;->b(LI/o1;)LH/b;

    move-result-object v3

    sget-object v5, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v2}, LH/l;->g()LI/I;

    move-result-object v6

    invoke-virtual {v6}, LI/I;->f()LI/m;

    move-result-object v6

    invoke-virtual {v6}, LI/m;->e()V

    invoke-virtual {v2}, LH/l;->g()LI/I;

    move-result-object v6

    invoke-virtual {v6}, LI/I;->c()V

    const-string v7, "\n"

    invoke-static {v6, v7, v4}, LI/H;->a(LI/I;Ljava/lang/String;I)V

    invoke-static {v2, v3, v4, v5}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    goto/16 :goto_2

    :cond_4
    invoke-interface/range {p7 .. p7}, Lmh/a;->invoke()Ljava/lang/Object;

    goto/16 :goto_2

    :pswitch_17
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v5

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v7

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v10, v2, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :cond_5
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v2

    invoke-virtual {v1}, LJ/h;->j()I

    move-result v3

    invoke-static {v2, v3}, LL0/T;->b(II)J

    move-result-wide v7

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v5

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v10, v2, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_18
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v5

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v7

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v10, v2, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :cond_6
    invoke-virtual {v1}, LJ/h;->m()I

    move-result v2

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v3

    invoke-static {v2, v3}, LL0/T;->b(II)J

    move-result-wide v7

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v5

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v10, v2, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_19
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v5

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v7

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v10, v2, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :cond_7
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v2

    invoke-virtual {v1}, LJ/h;->q()I

    move-result v3

    invoke-static {v2, v3}, LL0/T;->b(II)J

    move-result-wide v7

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v5

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v10, v2, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1a
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v5

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v7

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v10, v2, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :cond_8
    invoke-virtual {v1}, LJ/h;->w()I

    move-result v2

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v3

    invoke-static {v2, v3}, LL0/T;->b(II)J

    move-result-wide v7

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v5

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v10, v2, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1b
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-nez v2, :cond_9

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v7

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v9

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v12, v2, 0x1

    const/4 v13, 0x4

    const/4 v14, 0x0

    const-string v8, ""

    const/4 v11, 0x0

    invoke-static/range {v7 .. v14}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :cond_9
    invoke-virtual {v1}, LJ/h;->p()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-eq v3, v5, :cond_a

    goto :goto_0

    :cond_a
    move-object v2, v6

    :goto_0
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->n(J)I

    move-result v3

    invoke-static {v3, v2}, LL0/T;->b(II)J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->b(J)LL0/S;

    move-result-object v6

    :cond_b
    if-eqz v6, :cond_f

    invoke-virtual {v6}, LL0/S;->r()J

    move-result-wide v9

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v7

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v12, v2, 0x1

    const/4 v13, 0x4

    const/4 v14, 0x0

    const-string v8, ""

    const/4 v11, 0x0

    invoke-static/range {v7 .. v14}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1c
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v7

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v9

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v12, v2, 0x1

    const/4 v13, 0x4

    const/4 v14, 0x0

    const-string v8, ""

    const/4 v11, 0x0

    invoke-static/range {v7 .. v14}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto/16 :goto_2

    :cond_c
    invoke-virtual {v1}, LJ/h;->t()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-eq v3, v5, :cond_d

    goto :goto_1

    :cond_d
    move-object v2, v6

    :goto_1
    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v3

    invoke-static {v2, v3}, LL0/T;->b(II)J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->b(J)LL0/S;

    move-result-object v6

    :cond_e
    if-eqz v6, :cond_f

    invoke-virtual {v6}, LL0/S;->r()J

    move-result-wide v9

    invoke-static {v1}, LJ/h;->a(LJ/h;)LI/o1;

    move-result-object v7

    invoke-static {v1}, LJ/h;->d(LJ/h;)Z

    move-result v2

    xor-int/lit8 v12, v2, 0x1

    const/4 v13, 0x4

    const/4 v14, 0x0

    const-string v8, ""

    const/4 v11, 0x0

    invoke-static/range {v7 .. v14}, LI/o1;->w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V

    goto :goto_2

    :pswitch_1d
    invoke-virtual {v1}, LJ/h;->N()LJ/h;

    goto :goto_2

    :pswitch_1e
    invoke-virtual {v1}, LJ/h;->O()LJ/h;

    goto :goto_2

    :pswitch_1f
    invoke-virtual {v1}, LJ/h;->R()LJ/h;

    goto :goto_2

    :pswitch_20
    invoke-virtual {v1}, LJ/h;->Q()LJ/h;

    goto :goto_2

    :pswitch_21
    invoke-virtual {v1}, LJ/h;->P()LJ/h;

    goto :goto_2

    :pswitch_22
    invoke-virtual {v1}, LJ/h;->S()LJ/h;

    goto :goto_2

    :pswitch_23
    invoke-virtual {v1}, LJ/h;->C()LJ/h;

    goto :goto_2

    :pswitch_24
    invoke-virtual {v1}, LJ/h;->U()LJ/h;

    goto :goto_2

    :pswitch_25
    invoke-virtual {v1}, LJ/h;->B()LJ/h;

    goto :goto_2

    :pswitch_26
    invoke-virtual {v1}, LJ/h;->T()LJ/h;

    goto :goto_2

    :pswitch_27
    invoke-virtual {v1}, LJ/h;->G()LJ/h;

    goto :goto_2

    :pswitch_28
    invoke-virtual {v1}, LJ/h;->J()LJ/h;

    goto :goto_2

    :pswitch_29
    invoke-virtual {v1}, LJ/h;->M()LJ/h;

    goto :goto_2

    :pswitch_2a
    invoke-virtual {v1}, LJ/h;->E()LJ/h;

    goto :goto_2

    :pswitch_2b
    sget-object v2, LI/g1$c;->a:LI/g1$c;

    invoke-virtual {v1, v2}, LJ/h;->g(Lmh/l;)LJ/h;

    goto :goto_2

    :pswitch_2c
    sget-object v2, LI/g1$b;->a:LI/g1$b;

    invoke-virtual {v1, v2}, LJ/h;->f(Lmh/l;)LJ/h;

    goto :goto_2

    :pswitch_2d
    invoke-virtual/range {p4 .. p4}, LJ/j;->H()V

    goto :goto_2

    :pswitch_2e
    invoke-virtual/range {p4 .. p4}, LJ/j;->o0()V

    goto :goto_2

    :pswitch_2f
    move-object/from16 v2, p4

    invoke-virtual {v2, v3}, LJ/j;->E(Z)V

    :cond_f
    :goto_2
    move v3, v4

    :cond_10
    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v4

    invoke-virtual {v1}, LJ/h;->i()LH/h;

    move-result-object v2

    invoke-virtual {v2}, LH/h;->f()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, LL0/S;->g(JJ)Z

    move-result v2

    if-nez v2, :cond_11

    invoke-virtual {v1}, LJ/h;->x()J

    move-result-wide v1

    move-object/from16 v4, p2

    invoke-virtual {v4, v1, v2}, LI/o1;->y(J)V

    :cond_11
    :goto_3
    return v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/view/KeyEvent;LI/o1;LJ/j;Lk0/e;Landroidx/compose/ui/platform/n1;)Z
    .locals 0

    invoke-virtual {p2}, LI/o1;->l()LH/h;

    move-result-object p2

    invoke-virtual {p2}, LH/h;->f()J

    move-result-wide p4

    invoke-static {p4, p5}, LL0/S;->h(J)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p1}, LF/w;->a(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, LJ/j;->I()V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
