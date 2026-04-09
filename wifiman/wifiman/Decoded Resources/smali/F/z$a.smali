.class public final LF/z$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

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

    invoke-static {p1}, Lw0/d;->d(Landroid/view/KeyEvent;)Z

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

    sget-object v1, LF/v;->SELECT_LINE_LEFT:LF/v;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LF/I;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, LF/v;->SELECT_LINE_RIGHT:LF/v;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LF/I;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v1, LF/v;->SELECT_HOME:LF/v;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LF/I;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v1, LF/v;->SELECT_END:LF/v;

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lw0/d;->d(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-object v0, LF/I;->a:LF/I;

    invoke-virtual {v0}, LF/I;->i()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v1, LF/v;->LINE_LEFT:LF/v;

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, LF/I;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v1, LF/v;->LINE_RIGHT:LF/v;

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, LF/I;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v1, LF/v;->HOME:LF/v;

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, LF/I;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v1, LF/v;->END:LF/v;

    :cond_7
    :goto_0
    if-nez v1, :cond_8

    invoke-static {}, LF/y;->b()LF/x;

    move-result-object v0

    invoke-interface {v0, p1}, LF/x;->a(Landroid/view/KeyEvent;)LF/v;

    move-result-object v1

    :cond_8
    return-object v1
.end method
