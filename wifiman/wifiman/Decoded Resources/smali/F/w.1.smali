.class public abstract LF/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result p0

    sget-object v0, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v0}, Lw0/c$a;->b()I

    move-result v0

    invoke-static {p0, v0}, Lw0/c;->e(II)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b()V
    .locals 0

    return-void
.end method
