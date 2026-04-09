.class public abstract LF1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF1/y$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/view/MenuItem;LF1/b;)Landroid/view/MenuItem;
    .locals 1

    instance-of v0, p0, Ly1/b;

    if-eqz v0, :cond_0

    check-cast p0, Ly1/b;

    invoke-interface {p0, p1}, Ly1/b;->a(LF1/b;)Ly1/b;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p1, "MenuItemCompat"

    const-string v0, "setActionProvider: item does not implement SupportMenuItem; ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method

.method public static b(Landroid/view/MenuItem;CI)V
    .locals 1

    instance-of v0, p0, Ly1/b;

    if-eqz v0, :cond_0

    check-cast p0, Ly1/b;

    invoke-interface {p0, p1, p2}, Ly1/b;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2}, LF1/y$a;->a(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    :goto_0
    return-void
.end method

.method public static c(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V
    .locals 1

    instance-of v0, p0, Ly1/b;

    if-eqz v0, :cond_0

    check-cast p0, Ly1/b;

    invoke-interface {p0, p1}, Ly1/b;->setContentDescription(Ljava/lang/CharSequence;)Ly1/b;

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LF1/y$a;->b(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :goto_0
    return-void
.end method

.method public static d(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V
    .locals 1

    instance-of v0, p0, Ly1/b;

    if-eqz v0, :cond_0

    check-cast p0, Ly1/b;

    invoke-interface {p0, p1}, Ly1/b;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LF1/y$a;->c(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    :goto_0
    return-void
.end method

.method public static e(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    instance-of v0, p0, Ly1/b;

    if-eqz v0, :cond_0

    check-cast p0, Ly1/b;

    invoke-interface {p0, p1}, Ly1/b;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LF1/y$a;->d(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    :goto_0
    return-void
.end method

.method public static f(Landroid/view/MenuItem;CI)V
    .locals 1

    instance-of v0, p0, Ly1/b;

    if-eqz v0, :cond_0

    check-cast p0, Ly1/b;

    invoke-interface {p0, p1, p2}, Ly1/b;->setNumericShortcut(CI)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2}, LF1/y$a;->e(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    :goto_0
    return-void
.end method

.method public static g(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V
    .locals 1

    instance-of v0, p0, Ly1/b;

    if-eqz v0, :cond_0

    check-cast p0, Ly1/b;

    invoke-interface {p0, p1}, Ly1/b;->setTooltipText(Ljava/lang/CharSequence;)Ly1/b;

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LF1/y$a;->f(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :goto_0
    return-void
.end method
