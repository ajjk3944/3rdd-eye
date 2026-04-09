.class final Landroidx/compose/ui/platform/r$c;
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

    iput-object p1, p0, Landroidx/compose/ui/platform/r$c;->a:Landroidx/compose/ui/platform/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Boolean;
    .locals 2

    sget-object v0, Lv0/a;->b:Lv0/a$a;

    invoke-virtual {v0}, Lv0/a$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lv0/a;->f(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/r$c;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroid/view/View;->isInTouchMode()Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lv0/a$a;->a()I

    move-result v0

    invoke-static {p1, v0}, Lv0/a;->f(II)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/compose/ui/platform/r$c;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroid/view/View;->isInTouchMode()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/compose/ui/platform/r$c;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroid/view/View;->requestFocusFromTouch()Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv0/a;

    invoke-virtual {p1}, Lv0/a;->i()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r$c;->a(I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
