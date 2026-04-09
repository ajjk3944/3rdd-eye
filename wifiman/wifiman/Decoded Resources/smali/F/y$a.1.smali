.class public final LF/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/y;->a(Lmh/l;)LF/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LF/y$a;->a:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;)LF/v;
    .locals 6

    iget-object v0, p0, LF/y$a;->a:Lmh/l;

    invoke-static {p1}, Lw0/b;->a(Landroid/view/KeyEvent;)Lw0/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lw0/d;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LF/I;->a:LF/I;

    invoke-virtual {p1}, LF/I;->x()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, LF/v;->REDO:LF/v;

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LF/y$a;->a:Lmh/l;

    invoke-static {p1}, Lw0/b;->a(Landroid/view/KeyEvent;)Lw0/b;

    move-result-object v2

    invoke-interface {v0, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LF/I;->a:LF/I;

    invoke-virtual {p1}, LF/I;->d()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LF/I;->n()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_2

    sget-object v1, LF/v;->COPY:LF/v;

    goto/16 :goto_1

    :cond_2
    invoke-virtual {p1}, LF/I;->u()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v1, LF/v;->PASTE:LF/v;

    goto/16 :goto_1

    :cond_3
    invoke-virtual {p1}, LF/I;->v()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v1, LF/v;->CUT:LF/v;

    goto/16 :goto_1

    :cond_4
    invoke-virtual {p1}, LF/I;->a()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v1, LF/v;->SELECT_ALL:LF/v;

    goto/16 :goto_1

    :cond_5
    invoke-virtual {p1}, LF/I;->w()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v1, LF/v;->REDO:LF/v;

    goto/16 :goto_1

    :cond_6
    invoke-virtual {p1}, LF/I;->x()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, LF/v;->UNDO:LF/v;

    goto/16 :goto_1

    :cond_7
    invoke-static {p1}, Lw0/d;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_1

    :cond_8
    invoke-static {p1}, Lw0/d;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LF/I;->a:LF/I;

    invoke-virtual {p1}, LF/I;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v1, LF/v;->SELECT_LEFT_CHAR:LF/v;

    goto/16 :goto_1

    :cond_9
    invoke-virtual {p1}, LF/I;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v1, LF/v;->SELECT_RIGHT_CHAR:LF/v;

    goto/16 :goto_1

    :cond_a
    invoke-virtual {p1}, LF/I;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v1, LF/v;->SELECT_UP:LF/v;

    goto/16 :goto_1

    :cond_b
    invoke-virtual {p1}, LF/I;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v1, LF/v;->SELECT_DOWN:LF/v;

    goto/16 :goto_1

    :cond_c
    invoke-virtual {p1}, LF/I;->r()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v1, LF/v;->SELECT_PAGE_UP:LF/v;

    goto/16 :goto_1

    :cond_d
    invoke-virtual {p1}, LF/I;->q()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v1, LF/v;->SELECT_PAGE_DOWN:LF/v;

    goto/16 :goto_1

    :cond_e
    invoke-virtual {p1}, LF/I;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LF/v;->SELECT_LINE_START:LF/v;

    goto/16 :goto_1

    :cond_f
    invoke-virtual {p1}, LF/I;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v1, LF/v;->SELECT_LINE_END:LF/v;

    goto/16 :goto_1

    :cond_10
    invoke-virtual {p1}, LF/I;->n()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, LF/v;->PASTE:LF/v;

    goto/16 :goto_1

    :cond_11
    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object p1, LF/I;->a:LF/I;

    invoke-virtual {p1}, LF/I;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_12

    sget-object v1, LF/v;->LEFT_CHAR:LF/v;

    goto/16 :goto_1

    :cond_12
    invoke-virtual {p1}, LF/I;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_13

    sget-object v1, LF/v;->RIGHT_CHAR:LF/v;

    goto/16 :goto_1

    :cond_13
    invoke-virtual {p1}, LF/I;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v1, LF/v;->UP:LF/v;

    goto/16 :goto_1

    :cond_14
    invoke-virtual {p1}, LF/I;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_15

    sget-object v1, LF/v;->DOWN:LF/v;

    goto/16 :goto_1

    :cond_15
    invoke-virtual {p1}, LF/I;->r()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_16

    sget-object v1, LF/v;->PAGE_UP:LF/v;

    goto/16 :goto_1

    :cond_16
    invoke-virtual {p1}, LF/I;->q()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_17

    sget-object v1, LF/v;->PAGE_DOWN:LF/v;

    goto/16 :goto_1

    :cond_17
    invoke-virtual {p1}, LF/I;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_18

    sget-object v1, LF/v;->LINE_START:LF/v;

    goto/16 :goto_1

    :cond_18
    invoke-virtual {p1}, LF/I;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_19

    sget-object v1, LF/v;->LINE_END:LF/v;

    goto :goto_1

    :cond_19
    invoke-virtual {p1}, LF/I;->l()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1a

    sget-object v1, LF/v;->NEW_LINE:LF/v;

    goto :goto_1

    :cond_1a
    invoke-virtual {p1}, LF/I;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1b

    sget-object v1, LF/v;->DELETE_PREV_CHAR:LF/v;

    goto :goto_1

    :cond_1b
    invoke-virtual {p1}, LF/I;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1c

    sget-object v1, LF/v;->DELETE_NEXT_CHAR:LF/v;

    goto :goto_1

    :cond_1c
    invoke-virtual {p1}, LF/I;->s()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1d

    sget-object v1, LF/v;->PASTE:LF/v;

    goto :goto_1

    :cond_1d
    invoke-virtual {p1}, LF/I;->f()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1e

    sget-object v1, LF/v;->CUT:LF/v;

    goto :goto_1

    :cond_1e
    invoke-virtual {p1}, LF/I;->e()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_1f

    sget-object v1, LF/v;->COPY:LF/v;

    goto :goto_1

    :cond_1f
    invoke-virtual {p1}, LF/I;->t()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v1, LF/v;->TAB:LF/v;

    :cond_20
    :goto_1
    return-object v1
.end method
