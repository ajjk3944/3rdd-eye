.class public final LI/b;
.super LI/g1;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LI/g1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/KeyEvent;LI/o1;LI/l1;LJ/j;ZZLmh/a;)Z
    .locals 2

    invoke-static {p1}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v1}, Lw0/c$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Lw0/c;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x101

    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LI/h1;->c(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p4, v0}, LJ/j;->w0(Z)V

    :cond_0
    invoke-super/range {p0 .. p7}, LI/g1;->b(Landroid/view/KeyEvent;LI/o1;LI/l1;LJ/j;ZZLmh/a;)Z

    move-result p1

    return p1
.end method

.method public c(Landroid/view/KeyEvent;LI/o1;LJ/j;Lk0/e;Landroidx/compose/ui/platform/n1;)Z
    .locals 2

    invoke-super/range {p0 .. p5}, LI/g1;->c(Landroid/view/KeyEvent;LI/o1;LJ/j;Lk0/e;Landroidx/compose/ui/platform/n1;)Z

    move-result p2

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    return p3

    :cond_0
    invoke-virtual {p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_2

    :cond_1
    :goto_0
    move p3, v0

    goto/16 :goto_1

    :cond_2
    const/16 v1, 0x201

    invoke-virtual {p2, v1}, Landroid/view/InputDevice;->supportsSource(I)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Landroid/view/InputDevice;->isVirtual()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result p2

    sget-object v1, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v1}, Lw0/c$a;->a()I

    move-result v1

    invoke-static {p2, v1}, Lw0/c;->e(II)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    move-result p2

    const/16 v1, 0x101

    if-ne p2, v1, :cond_6

    goto :goto_0

    :cond_6
    const/16 p2, 0x13

    invoke-static {p1, p2}, LI/h1;->a(Landroid/view/KeyEvent;I)Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->h()I

    move-result p1

    invoke-interface {p4, p1}, Lk0/e;->k(I)Z

    move-result p3

    goto :goto_1

    :cond_7
    const/16 p2, 0x14

    invoke-static {p1, p2}, LI/h1;->a(Landroid/view/KeyEvent;I)Z

    move-result p2

    if-eqz p2, :cond_8

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->a()I

    move-result p1

    invoke-interface {p4, p1}, Lk0/e;->k(I)Z

    move-result p3

    goto :goto_1

    :cond_8
    const/16 p2, 0x15

    invoke-static {p1, p2}, LI/h1;->a(Landroid/view/KeyEvent;I)Z

    move-result p2

    if-eqz p2, :cond_9

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->d()I

    move-result p1

    invoke-interface {p4, p1}, Lk0/e;->k(I)Z

    move-result p3

    goto :goto_1

    :cond_9
    const/16 p2, 0x16

    invoke-static {p1, p2}, LI/h1;->a(Landroid/view/KeyEvent;I)Z

    move-result p2

    if-eqz p2, :cond_a

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->g()I

    move-result p1

    invoke-interface {p4, p1}, Lk0/e;->k(I)Z

    move-result p3

    goto :goto_1

    :cond_a
    const/16 p2, 0x17

    invoke-static {p1, p2}, LI/h1;->a(Landroid/view/KeyEvent;I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p5}, Landroidx/compose/ui/platform/n1;->b()V

    :goto_1
    return p3
.end method
