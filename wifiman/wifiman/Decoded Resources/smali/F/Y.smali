.class public abstract LF/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Landroid/view/KeyEvent;I)Z
    .locals 0

    invoke-static {p0, p1}, LF/Y;->c(Landroid/view/KeyEvent;I)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroidx/compose/ui/e;LF/E;Lk0/e;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, LF/Y$a;

    invoke-direct {v0, p2, p1}, LF/Y$a;-><init>(Lk0/e;LF/E;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroid/view/KeyEvent;I)Z
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
