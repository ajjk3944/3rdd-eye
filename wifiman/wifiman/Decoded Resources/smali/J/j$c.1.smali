.class final LJ/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/U;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Lmh/a;

.field private b:I

.field private c:J

.field private d:J

.field private e:LF/p;

.field final synthetic f:LJ/j;


# direct methods
.method public constructor <init>(LJ/j;Lmh/a;)V
    .locals 2

    iput-object p1, p0, LJ/j$c;->f:LJ/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LJ/j$c;->a:Lmh/a;

    const/4 p1, -0x1

    iput p1, p0, LJ/j$c;->b:I

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide v0

    iput-wide v0, p0, LJ/j$c;->c:J

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, LJ/j$c;->d:J

    sget-object p1, LF/p;->SelectionEnd:LF/p;

    iput-object p1, p0, LJ/j$c;->e:LF/p;

    return-void
.end method

.method private final f()V
    .locals 4

    iget-wide v0, p0, LJ/j$c;->c:J

    invoke-static {v0, v1}, Ll0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LJ/j$c$b;->a:LJ/j$c$b;

    invoke-static {v0}, LJ/k;->a(Lmh/a;)V

    iget-object v0, p0, LJ/j$c;->f:LJ/j;

    invoke-virtual {v0}, LJ/j;->D()V

    const/4 v0, -0x1

    iput v0, p0, LJ/j$c;->b:I

    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->b()J

    move-result-wide v2

    iput-wide v2, p0, LJ/j$c;->c:J

    invoke-virtual {v1}, Ll0/g$a;->c()J

    move-result-wide v1

    iput-wide v1, p0, LJ/j$c;->d:J

    iget-object v1, p0, LJ/j$c;->f:LJ/j;

    invoke-static {v1, v0}, LJ/j;->u(LJ/j;I)V

    iget-object v0, p0, LJ/j$c;->f:LJ/j;

    sget-object v1, LJ/j$a;->None:LJ/j$a;

    invoke-virtual {v0, v1}, LJ/j;->t0(LJ/j$a;)V

    iget-object v0, p0, LJ/j$c;->a:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, LJ/j$c;->f()V

    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method public c(J)V
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v1}, LJ/j;->f(LJ/j;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    new-instance v1, LJ/j$c$c;

    invoke-direct {v1, v2, v3}, LJ/j$c$c;-><init>(J)V

    invoke-static {v1}, LJ/k;->a(Lmh/a;)V

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    iget-object v4, v0, LJ/j$c;->e:LF/p;

    invoke-virtual {v1, v4, v2, v3}, LJ/j;->F0(LF/p;J)V

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    const/4 v4, 0x0

    invoke-static {v1, v4}, LJ/j;->v(LJ/j;Z)V

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    sget-object v4, LJ/j$a;->Touch:LJ/j$a;

    invoke-virtual {v1, v4}, LJ/j;->t0(LJ/j$a;)V

    iput-wide v2, v0, LJ/j$c;->c:J

    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->c()J

    move-result-wide v4

    iput-wide v4, v0, LJ/j$c;->d:J

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    const/4 v4, -0x1

    invoke-static {v1, v4}, LJ/j;->u(LJ/j;I)V

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v1}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, LI/l1;->k(J)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v1}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-wide/from16 v2, p1

    invoke-static/range {v1 .. v6}, LI/l1;->i(LI/l1;JZILjava/lang/Object;)I

    move-result v1

    iget-object v2, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v2}, LJ/j;->h(LJ/j;)Lu0/a;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object v3, Lu0/b;->a:Lu0/b$a;

    invoke-virtual {v3}, Lu0/b$a;->b()I

    move-result v3

    invoke-interface {v2, v3}, Lu0/a;->a(I)V

    :cond_1
    iget-object v2, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v2}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v2

    invoke-virtual {v2, v1}, LI/o1;->q(I)V

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    const/4 v2, 0x1

    invoke-static {v1, v2}, LJ/j;->v(LJ/j;Z)V

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    sget-object v2, LJ/n;->Cursor:LJ/n;

    invoke-virtual {v1, v2}, LJ/j;->I0(LJ/n;)V

    goto :goto_0

    :cond_2
    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v1}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v1

    invoke-virtual {v1}, LI/o1;->l()LH/h;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v1}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-wide/from16 v2, p1

    invoke-static/range {v1 .. v6}, LI/l1;->i(LI/l1;JZILjava/lang/Object;)I

    move-result v10

    iget-object v7, v0, LJ/j$c;->f:LJ/j;

    new-instance v8, LH/h;

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v1}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v1

    invoke-virtual {v1}, LI/o1;->l()LH/h;

    move-result-object v12

    sget-object v1, LL0/S;->b:LL0/S$a;

    invoke-virtual {v1}, LL0/S$a;->a()J

    move-result-wide v13

    const/16 v17, 0xc

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v11, v8

    invoke-direct/range {v11 .. v18}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, LM/r;->a:LM/r$a;

    invoke-virtual {v1}, LM/r$a;->o()LM/r;

    move-result-object v12

    const/16 v15, 0x60

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v9, v10

    invoke-static/range {v7 .. v16}, LJ/j;->H0(LJ/j;LH/h;IIZLM/r;ZZILjava/lang/Object;)J

    move-result-wide v1

    iget-object v3, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v3}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, LI/o1;->y(J)V

    iget-object v3, v0, LJ/j$c;->f:LJ/j;

    sget-object v4, LJ/n;->Selection:LJ/n;

    invoke-virtual {v3, v4}, LJ/j;->I0(LJ/n;)V

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v1

    iput v1, v0, LJ/j$c;->b:I

    :goto_0
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(J)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v1}, LJ/j;->f(LJ/j;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v1}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v1

    invoke-virtual {v1}, LI/o1;->l()LH/h;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-wide v1, v0, LJ/j$c;->d:J

    move-wide/from16 v3, p1

    invoke-static {v1, v2, v3, v4}, Ll0/g;->r(JJ)J

    move-result-wide v1

    iput-wide v1, v0, LJ/j$c;->d:J

    iget-wide v3, v0, LJ/j$c;->c:J

    invoke-static {v3, v4, v1, v2}, Ll0/g;->r(JJ)J

    move-result-wide v1

    new-instance v3, LJ/j$c$a;

    invoke-direct {v3, v1, v2}, LJ/j$c$a;-><init>(J)V

    invoke-static {v3}, LJ/k;->a(Lmh/a;)V

    iget v3, v0, LJ/j$c;->b:I

    if-gez v3, :cond_2

    iget-object v3, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v3}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, LI/l1;->k(J)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v3}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v4

    iget-wide v5, v0, LJ/j$c;->c:J

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, LI/l1;->i(LI/l1;JZILjava/lang/Object;)I

    move-result v3

    iget-object v4, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v4}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v5

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-wide v6, v1

    invoke-static/range {v5 .. v10}, LI/l1;->i(LI/l1;JZILjava/lang/Object;)I

    move-result v4

    if-ne v3, v4, :cond_1

    sget-object v5, LM/r;->a:LM/r$a;

    invoke-virtual {v5}, LM/r$a;->m()LM/r;

    move-result-object v5

    goto :goto_0

    :cond_1
    sget-object v5, LM/r;->a:LM/r$a;

    invoke-virtual {v5}, LM/r$a;->o()LM/r;

    move-result-object v5

    :goto_0
    move v10, v3

    move v11, v4

    move-object v13, v5

    goto :goto_3

    :cond_2
    iget v3, v0, LJ/j$c;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-ltz v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_2

    :cond_4
    iget-object v3, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v3}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v3

    iget-wide v5, v0, LJ/j$c;->c:J

    invoke-virtual {v3, v5, v6, v4}, LI/l1;->h(JZ)I

    move-result v3

    :goto_2
    iget-object v5, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v5}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v5

    invoke-virtual {v5, v1, v2, v4}, LI/l1;->h(JZ)I

    move-result v4

    iget v5, v0, LJ/j$c;->b:I

    if-gez v5, :cond_5

    if-ne v3, v4, :cond_5

    return-void

    :cond_5
    sget-object v5, LM/r;->a:LM/r$a;

    invoke-virtual {v5}, LM/r$a;->o()LM/r;

    move-result-object v5

    iget-object v6, v0, LJ/j$c;->f:LJ/j;

    sget-object v7, LJ/n;->Selection:LJ/n;

    invoke-virtual {v6, v7}, LJ/j;->I0(LJ/n;)V

    goto :goto_0

    :goto_3
    iget-object v3, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v3}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v3

    invoke-virtual {v3}, LI/o1;->l()LH/h;

    move-result-object v3

    invoke-virtual {v3}, LH/h;->f()J

    move-result-wide v3

    iget-object v8, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v8}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v5

    invoke-virtual {v5}, LI/o1;->l()LH/h;

    move-result-object v9

    const/16 v16, 0x40

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v8 .. v17}, LJ/j;->H0(LJ/j;LH/h;IIZLM/r;ZZILjava/lang/Object;)J

    move-result-wide v5

    iget v7, v0, LJ/j$c;->b:I

    const/4 v8, -0x1

    if-ne v7, v8, :cond_6

    invoke-static {v5, v6}, LL0/S;->h(J)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-static {v5, v6}, LL0/S;->n(J)I

    move-result v7

    iput v7, v0, LJ/j$c;->b:I

    :cond_6
    invoke-static {v5, v6}, LL0/S;->m(J)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-static {v5, v6}, LJ/k;->b(J)J

    move-result-wide v5

    :cond_7
    invoke-static {v5, v6, v3, v4}, LL0/S;->g(JJ)Z

    move-result v7

    if-nez v7, :cond_b

    invoke-static {v5, v6}, LL0/S;->n(J)I

    move-result v7

    invoke-static {v3, v4}, LL0/S;->n(J)I

    move-result v8

    if-eq v7, v8, :cond_8

    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v7

    invoke-static {v3, v4}, LL0/S;->i(J)I

    move-result v8

    if-ne v7, v8, :cond_8

    sget-object v7, LF/p;->SelectionStart:LF/p;

    goto :goto_4

    :cond_8
    invoke-static {v5, v6}, LL0/S;->n(J)I

    move-result v7

    invoke-static {v3, v4}, LL0/S;->n(J)I

    move-result v8

    if-ne v7, v8, :cond_9

    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v7

    invoke-static {v3, v4}, LL0/S;->i(J)I

    move-result v8

    if-eq v7, v8, :cond_9

    sget-object v7, LF/p;->SelectionEnd:LF/p;

    goto :goto_4

    :cond_9
    invoke-static {v5, v6}, LL0/S;->n(J)I

    move-result v7

    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v8

    add-int/2addr v7, v8

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-static {v3, v4}, LL0/S;->n(J)I

    move-result v9

    invoke-static {v3, v4}, LL0/S;->i(J)I

    move-result v10

    add-int/2addr v9, v10

    int-to-float v9, v9

    div-float/2addr v9, v8

    cmpl-float v7, v7, v9

    if-lez v7, :cond_a

    sget-object v7, LF/p;->SelectionEnd:LF/p;

    goto :goto_4

    :cond_a
    sget-object v7, LF/p;->SelectionStart:LF/p;

    :goto_4
    iput-object v7, v0, LJ/j$c;->e:LF/p;

    :cond_b
    invoke-static {v3, v4}, LL0/S;->h(J)Z

    move-result v3

    if-nez v3, :cond_c

    invoke-static {v5, v6}, LL0/S;->h(J)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    iget-object v3, v0, LJ/j$c;->f:LJ/j;

    invoke-static {v3}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v3

    invoke-virtual {v3, v5, v6}, LI/o1;->y(J)V

    :cond_d
    iget-object v3, v0, LJ/j$c;->f:LJ/j;

    iget-object v4, v0, LJ/j$c;->e:LF/p;

    invoke-virtual {v3, v4, v1, v2}, LJ/j;->F0(LF/p;J)V

    :cond_e
    :goto_5
    return-void
.end method

.method public onCancel()V
    .locals 0

    invoke-direct {p0}, LJ/j$c;->f()V

    return-void
.end method
