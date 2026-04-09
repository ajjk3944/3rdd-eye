.class public abstract LI/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Landroid/view/KeyEvent;I)Z
    .locals 0

    invoke-static {p0, p1}, LI/h1;->d(Landroid/view/KeyEvent;I)Z

    move-result p0

    return p0
.end method

.method public static final b()LI/g1;
    .locals 1

    new-instance v0, LI/b;

    invoke-direct {v0}, LI/b;-><init>()V

    return-object v0
.end method

.method public static final c(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getFlags()I

    move-result p0

    const/4 v0, 0x2

    and-int/2addr p0, v0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final d(Landroid/view/KeyEvent;I)Z
    .locals 2

    invoke-static {p0}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lw0/f;->b(J)I

    move-result p0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
