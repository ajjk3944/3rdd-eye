.class final Lz/E;
.super LF1/j0$b;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements LF1/F;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private final c:Lz/g0;

.field private d:Z

.field private e:Z

.field private f:LF1/w0;


# direct methods
.method public constructor <init>(Lz/g0;)V
    .locals 1

    invoke-virtual {p1}, Lz/g0;->c()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, LF1/j0$b;-><init>(I)V

    iput-object p1, p0, Lz/E;->c:Lz/g0;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LF1/w0;)LF1/w0;
    .locals 3

    iput-object p2, p0, Lz/E;->f:LF1/w0;

    iget-object v0, p0, Lz/E;->c:Lz/g0;

    invoke-virtual {v0, p2}, Lz/g0;->l(LF1/w0;)V

    iget-boolean v0, p0, Lz/E;->d:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lz/E;->e:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lz/E;->c:Lz/g0;

    invoke-virtual {p1, p2}, Lz/g0;->k(LF1/w0;)V

    iget-object p1, p0, Lz/E;->c:Lz/g0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p2, v2, v0, v1}, Lz/g0;->j(Lz/g0;LF1/w0;IILjava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lz/E;->c:Lz/g0;

    invoke-virtual {p1}, Lz/g0;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p2, LF1/w0;->b:LF1/w0;

    :cond_2
    return-object p2
.end method

.method public c(LF1/j0;)V
    .locals 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/E;->d:Z

    iput-boolean v0, p0, Lz/E;->e:Z

    iget-object v1, p0, Lz/E;->f:LF1/w0;

    invoke-virtual {p1}, LF1/j0;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Lz/E;->c:Lz/g0;

    invoke-virtual {v2, v1}, Lz/g0;->k(LF1/w0;)V

    iget-object v2, p0, Lz/E;->c:Lz/g0;

    invoke-virtual {v2, v1}, Lz/g0;->l(LF1/w0;)V

    iget-object v2, p0, Lz/E;->c:Lz/g0;

    const/4 v4, 0x2

    invoke-static {v2, v1, v0, v4, v3}, Lz/g0;->j(Lz/g0;LF1/w0;IILjava/lang/Object;)V

    :cond_0
    iput-object v3, p0, Lz/E;->f:LF1/w0;

    invoke-super {p0, p1}, LF1/j0$b;->c(LF1/j0;)V

    return-void
.end method

.method public d(LF1/j0;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz/E;->d:Z

    iput-boolean v0, p0, Lz/E;->e:Z

    invoke-super {p0, p1}, LF1/j0$b;->d(LF1/j0;)V

    return-void
.end method

.method public e(LF1/w0;Ljava/util/List;)LF1/w0;
    .locals 3

    iget-object p2, p0, Lz/E;->c:Lz/g0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, p1, v2, v0, v1}, Lz/g0;->j(Lz/g0;LF1/w0;IILjava/lang/Object;)V

    iget-object p2, p0, Lz/E;->c:Lz/g0;

    invoke-virtual {p2}, Lz/g0;->c()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, LF1/w0;->b:LF1/w0;

    :cond_0
    return-object p1
.end method

.method public f(LF1/j0;LF1/j0$a;)LF1/j0$a;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/E;->d:Z

    invoke-super {p0, p1, p2}, LF1/j0$b;->f(LF1/j0;LF1/j0$a;)LF1/j0$a;

    move-result-object p1

    return-object p1
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public run()V
    .locals 5

    iget-boolean v0, p0, Lz/E;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/E;->d:Z

    iput-boolean v0, p0, Lz/E;->e:Z

    iget-object v1, p0, Lz/E;->f:LF1/w0;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lz/E;->c:Lz/g0;

    invoke-virtual {v2, v1}, Lz/g0;->k(LF1/w0;)V

    iget-object v2, p0, Lz/E;->c:Lz/g0;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v1, v0, v3, v4}, Lz/g0;->j(Lz/g0;LF1/w0;IILjava/lang/Object;)V

    iput-object v4, p0, Lz/E;->f:LF1/w0;

    :cond_0
    return-void
.end method
