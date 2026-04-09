.class public final LF/y$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/x;


# direct methods
.method constructor <init>(LF/x;)V
    .locals 0

    iput-object p1, p0, LF/y$c;->a:LF/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;)LF/v;
    .locals 6

    invoke-static {p1}, Lw0/d;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lw0/d;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LF/I;->a:LF/I;

    invoke-virtual {v0}, LF/I;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, LF/v;->SELECT_LEFT_WORD:LF/v;

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0}, LF/I;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, LF/v;->SELECT_RIGHT_WORD:LF/v;

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v0}, LF/I;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v1, LF/v;->SELECT_PREV_PARAGRAPH:LF/v;

    goto/16 :goto_0

    :cond_2
    invoke-virtual {v0}, LF/I;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LF/v;->SELECT_NEXT_PARAGRAPH:LF/v;

    goto/16 :goto_0

    :cond_3
    invoke-static {p1}, Lw0/d;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LF/I;->a:LF/I;

    invoke-virtual {v0}, LF/I;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v1, LF/v;->LEFT_WORD:LF/v;

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, LF/I;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v1, LF/v;->RIGHT_WORD:LF/v;

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v0}, LF/I;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v1, LF/v;->PREV_PARAGRAPH:LF/v;

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v0}, LF/I;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v1, LF/v;->NEXT_PARAGRAPH:LF/v;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v0}, LF/I;->m()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v1, LF/v;->DELETE_PREV_CHAR:LF/v;

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v0}, LF/I;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v1, LF/v;->DELETE_NEXT_WORD:LF/v;

    goto :goto_0

    :cond_9
    invoke-virtual {v0}, LF/I;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v1, LF/v;->DELETE_PREV_WORD:LF/v;

    goto :goto_0

    :cond_a
    invoke-virtual {v0}, LF/I;->b()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LF/v;->DESELECT:LF/v;

    goto :goto_0

    :cond_b
    invoke-static {p1}, Lw0/d;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LF/I;->a:LF/I;

    invoke-virtual {v0}, LF/I;->p()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v1, LF/v;->SELECT_LINE_LEFT:LF/v;

    goto :goto_0

    :cond_c
    invoke-virtual {v0}, LF/I;->o()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LF/v;->SELECT_LINE_RIGHT:LF/v;

    goto :goto_0

    :cond_d
    invoke-static {p1}, Lw0/d;->d(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LF/I;->a:LF/I;

    invoke-virtual {v0}, LF/I;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v1, LF/v;->DELETE_FROM_LINE_START:LF/v;

    goto :goto_0

    :cond_e
    invoke-virtual {v0}, LF/I;->g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v1, LF/v;->DELETE_TO_LINE_END:LF/v;

    :cond_f
    :goto_0
    if-nez v1, :cond_10

    iget-object v0, p0, LF/y$c;->a:LF/x;

    invoke-interface {v0, p1}, LF/x;->a(Landroid/view/KeyEvent;)LF/v;

    move-result-object v1

    :cond_10
    return-object v1
.end method
