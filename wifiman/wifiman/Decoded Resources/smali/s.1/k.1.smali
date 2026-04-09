.class public abstract Ls/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Ls/k;->a:J

    return-void
.end method

.method public static final a()J
    .locals 2

    sget-wide v0, Ls/k;->a:J

    return-wide v0
.end method

.method public static final b(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-static {p0}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v1}, Lw0/c$a;->b()I

    move-result v1

    invoke-static {v0, v1}, Lw0/c;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ls/k;->d(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(LE0/j;)Z
    .locals 0

    invoke-static {p0}, LE0/l;->a(LE0/j;)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Ls/k;->e(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method private static final d(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-static {p0}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lw0/f;->b(J)I

    move-result p0

    const/16 v0, 0x17

    if-eq p0, v0, :cond_0

    const/16 v0, 0x42

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa0

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method private static final e(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final f(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-static {p0}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v1}, Lw0/c$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Lw0/c;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ls/k;->d(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
