.class final Landroidx/compose/ui/platform/r$p;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;-><init>(Landroid/content/Context;Ldh/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/r;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/r$p;->a:Landroidx/compose/ui/platform/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/platform/r$p;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/r;->n0(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/d;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {p1}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result p1

    sget-object v1, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v1}, Lw0/c$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Lw0/c;->e(II)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/platform/r$p;->a:Landroidx/compose/ui/platform/r;

    invoke-static {p1}, Landroidx/compose/ui/platform/r;->S(Landroidx/compose/ui/platform/r;)Ll0/i;

    move-result-object p1

    iget-object v1, p0, Landroidx/compose/ui/platform/r$p;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d;->o()I

    move-result v2

    new-instance v3, Landroidx/compose/ui/platform/r$p$b;

    invoke-direct {v3, v0}, Landroidx/compose/ui/platform/r$p$b;-><init>(Landroidx/compose/ui/focus/d;)V

    invoke-interface {v1, v2, p1, v3}, Lk0/g;->p(ILl0/i;Lmh/l;)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d;->o()I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/focus/j;->a(I)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d;->o()I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/focus/h;->c(I)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    invoke-static {p1}, Lm0/b1;->b(Ll0/i;)Landroid/graphics/Rect;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v3

    :goto_1
    if-eqz p1, :cond_9

    iget-object v4, p0, Landroidx/compose/ui/platform/r$p;->a:Landroidx/compose/ui/platform/r;

    invoke-static {v4, v1}, Landroidx/compose/ui/platform/r;->J(Landroidx/compose/ui/platform/r;I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/compose/ui/platform/r$p;->a:Landroidx/compose/ui/platform/r;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    move-object v4, v3

    :goto_2
    if-eqz v4, :cond_6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v4, v1, p1}, Landroidx/compose/ui/focus/h;->b(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_6
    iget-object p1, p0, Landroidx/compose/ui/platform/r$p;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object p1

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d;->o()I

    move-result v1

    const/4 v4, 0x0

    invoke-interface {p1, v4, v2, v4, v1}, Lk0/g;->e(ZZZI)Z

    move-result p1

    if-nez p1, :cond_7

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_7
    iget-object p1, p0, Landroidx/compose/ui/platform/r$p;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object p1

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d;->o()I

    move-result v1

    new-instance v4, Landroidx/compose/ui/platform/r$p$a;

    invoke-direct {v4, v0}, Landroidx/compose/ui/platform/r$p$a;-><init>(Landroidx/compose/ui/focus/d;)V

    invoke-interface {p1, v1, v3, v4}, Lk0/g;->p(ILl0/i;Lmh/l;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid rect"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid focus direction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw0/b;

    invoke-virtual {p1}, Lw0/b;->f()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r$p;->a(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
