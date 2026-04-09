.class public interface abstract Lk0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk0/e;


# direct methods
.method public static synthetic d(Lk0/g;Landroid/view/KeyEvent;Lmh/a;ILjava/lang/Object;)Z
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lk0/g$a;->a:Lk0/g$a;

    :cond_0
    invoke-interface {p0, p1, p2}, Lk0/g;->h(Landroid/view/KeyEvent;Lmh/a;)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(Landroidx/compose/ui/focus/FocusTargetNode;)V
.end method

.method public abstract b()Landroidx/compose/ui/e;
.end method

.method public abstract e(ZZZI)Z
.end method

.method public abstract f()Lk0/l;
.end method

.method public abstract g()Lk0/q;
.end method

.method public abstract h(Landroid/view/KeyEvent;Lmh/a;)Z
.end method

.method public abstract i()Ll0/i;
.end method

.method public abstract j(Lk0/b;)V
.end method

.method public abstract l(LA0/b;)Z
.end method

.method public abstract m(Landroid/view/KeyEvent;)Z
.end method

.method public abstract n()V
.end method

.method public abstract o(Lk0/h;)V
.end method

.method public abstract p(ILl0/i;Lmh/l;)Ljava/lang/Boolean;
.end method

.method public abstract q(Landroidx/compose/ui/focus/d;Ll0/i;)Z
.end method
