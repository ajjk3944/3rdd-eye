.class public final LF/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/B;


# instance fields
.field private final a:Landroidx/compose/ui/platform/n1;

.field public b:LF/C;

.field public c:Lk0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/A;->a:Landroidx/compose/ui/platform/n1;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    sget-object v0, LR0/r;->b:LR0/r$a;

    invoke-virtual {v0}, LR0/r$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LF/A;->b()Lk0/e;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->e()I

    move-result v0

    invoke-interface {p1, v0}, Lk0/e;->k(I)Z

    goto :goto_3

    :cond_0
    invoke-virtual {v0}, LR0/r$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LF/A;->b()Lk0/e;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->f()I

    move-result v0

    invoke-interface {p1, v0}, Lk0/e;->k(I)Z

    goto :goto_3

    :cond_1
    invoke-virtual {v0}, LR0/r$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, LF/A;->a:Landroidx/compose/ui/platform/n1;

    if-eqz p1, :cond_7

    invoke-interface {p1}, Landroidx/compose/ui/platform/n1;->c()V

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, LR0/r$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, LR0/r$a;->g()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LR0/r$a;->h()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, LR0/r$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, LR0/r$a;->e()I

    move-result v0

    invoke-static {p1, v0}, LR0/r;->m(II)Z

    :cond_7
    :goto_3
    return-void
.end method

.method public final b()Lk0/e;
    .locals 1

    iget-object v0, p0, LF/A;->c:Lk0/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "focusManager"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()LF/C;
    .locals 1

    iget-object v0, p0, LF/A;->b:LF/C;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "keyboardActions"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(I)V
    .locals 3

    sget-object v0, LR0/r;->b:LR0/r$a;

    invoke-virtual {v0}, LR0/r$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LF/A;->c()LF/C;

    move-result-object v0

    invoke-virtual {v0}, LF/C;->b()Lmh/l;

    move-result-object v0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0}, LR0/r$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LF/A;->c()LF/C;

    move-result-object v0

    invoke-virtual {v0}, LF/C;->c()Lmh/l;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LR0/r$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LF/A;->c()LF/C;

    move-result-object v0

    invoke-virtual {v0}, LF/C;->d()Lmh/l;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LR0/r$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LF/A;->c()LF/C;

    move-result-object v0

    invoke-virtual {v0}, LF/C;->e()Lmh/l;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LR0/r$a;->g()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LF/A;->c()LF/C;

    move-result-object v0

    invoke-virtual {v0}, LF/C;->f()Lmh/l;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LR0/r$a;->h()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LF/A;->c()LF/C;

    move-result-object v0

    invoke-virtual {v0}, LF/C;->g()Lmh/l;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, LR0/r$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v0, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, LR0/r$a;->e()I

    move-result v0

    invoke-static {p1, v0}, LR0/r;->m(II)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_9

    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_7

    invoke-interface {v0, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, LYg/J;->a:LYg/J;

    :cond_7
    if-nez v2, :cond_8

    invoke-virtual {p0, p1}, LF/A;->a(I)V

    :cond_8
    return-void

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid ImeAction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lk0/e;)V
    .locals 0

    iput-object p1, p0, LF/A;->c:Lk0/e;

    return-void
.end method

.method public final f(LF/C;)V
    .locals 0

    iput-object p1, p0, LF/A;->b:LF/C;

    return-void
.end method
