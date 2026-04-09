.class LF1/w0$h;
.super LF1/w0$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# direct methods
.method constructor <init>(LF1/w0;LF1/w0$h;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LF1/w0$g;-><init>(LF1/w0;LF1/w0$g;)V

    return-void
.end method

.method constructor <init>(LF1/w0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LF1/w0$g;-><init>(LF1/w0;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method a()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LF1/F0;->a(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LF1/w0;->w(Landroid/view/WindowInsets;)LF1/w0;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LF1/w0$h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LF1/w0$h;

    iget-object v1, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    iget-object v3, p1, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LF1/w0$f;->g:Lw1/f;

    iget-object p1, p1, LF1/w0$f;->g:Lw1/f;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method f()LF1/r;
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LF1/E0;->a(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    move-result-object v0

    invoke-static {v0}, LF1/r;->f(Landroid/view/DisplayCutout;)LF1/r;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method
