.class LF1/w0$g;
.super LF1/w0$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
.end annotation


# instance fields
.field private m:Lw1/f;


# direct methods
.method constructor <init>(LF1/w0;LF1/w0$g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, LF1/w0$f;-><init>(LF1/w0;LF1/w0$f;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, LF1/w0$g;->m:Lw1/f;

    .line 5
    iget-object p1, p2, LF1/w0$g;->m:Lw1/f;

    iput-object p1, p0, LF1/w0$g;->m:Lw1/f;

    return-void
.end method

.method constructor <init>(LF1/w0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LF1/w0$f;-><init>(LF1/w0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LF1/w0$g;->m:Lw1/f;

    return-void
.end method


# virtual methods
.method b()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LF1/w0;->w(Landroid/view/WindowInsets;)LF1/w0;

    move-result-object v0

    return-object v0
.end method

.method c()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LF1/w0;->w(Landroid/view/WindowInsets;)LF1/w0;

    move-result-object v0

    return-object v0
.end method

.method final j()Lw1/f;
    .locals 4

    iget-object v0, p0, LF1/w0$g;->m:Lw1/f;

    if-nez v0, :cond_0

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lw1/f;->b(IIII)Lw1/f;

    move-result-object v0

    iput-object v0, p0, LF1/w0$g;->m:Lw1/f;

    :cond_0
    iget-object v0, p0, LF1/w0$g;->m:Lw1/f;

    return-object v0
.end method

.method o()Z
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public u(Lw1/f;)V
    .locals 0

    iput-object p1, p0, LF1/w0$g;->m:Lw1/f;

    return-void
.end method
