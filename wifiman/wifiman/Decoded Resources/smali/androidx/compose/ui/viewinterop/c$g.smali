.class public final Landroidx/compose/ui/viewinterop/c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LT/q;ILx0/b;Landroid/view/View;LE0/m0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/viewinterop/c;

.field final synthetic b:LE0/G;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/c;LE0/G;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c$g;->b:LE0/G;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(I)I
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v1}, Landroidx/compose/ui/viewinterop/c;->q(Landroidx/compose/ui/viewinterop/c;III)I

    move-result p1

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/view/View;->measure(II)V

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    return p1
.end method

.method private final d(I)I
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    iget-object v3, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {v3}, Landroidx/compose/ui/viewinterop/c;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v3, v1, p1, v4}, Landroidx/compose/ui/viewinterop/c;->q(Landroidx/compose/ui/viewinterop/c;III)I

    move-result p1

    invoke-virtual {v0, v2, p1}, Landroid/view/View;->measure(II)V

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    return p1
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 7

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v2

    sget-object v4, Landroidx/compose/ui/viewinterop/c$g$a;->a:Landroidx/compose/ui/viewinterop/c$g$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setMinimumWidth(I)V

    :cond_1
    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_2
    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {v2}, Landroidx/compose/ui/viewinterop/c;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/ui/viewinterop/c;->q(Landroidx/compose/ui/viewinterop/c;III)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v2

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    iget-object p4, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p4}, Landroidx/compose/ui/viewinterop/c;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget p4, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v1, v2, p3, p4}, Landroidx/compose/ui/viewinterop/c;->q(Landroidx/compose/ui/viewinterop/c;III)I

    move-result p3

    invoke-virtual {p2, v0, p3}, Landroid/view/View;->measure(II)V

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    new-instance v4, Landroidx/compose/ui/viewinterop/c$g$b;

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c$g;->a:Landroidx/compose/ui/viewinterop/c;

    iget-object p3, p0, Landroidx/compose/ui/viewinterop/c$g;->b:LE0/G;

    invoke-direct {v4, p2, p3}, Landroidx/compose/ui/viewinterop/c$g$b;-><init>(Landroidx/compose/ui/viewinterop/c;LE0/G;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public c(LC0/o;Ljava/util/List;I)I
    .locals 0

    invoke-direct {p0, p3}, Landroidx/compose/ui/viewinterop/c$g;->a(I)I

    move-result p1

    return p1
.end method

.method public e(LC0/o;Ljava/util/List;I)I
    .locals 0

    invoke-direct {p0, p3}, Landroidx/compose/ui/viewinterop/c$g;->d(I)I

    move-result p1

    return p1
.end method

.method public f(LC0/o;Ljava/util/List;I)I
    .locals 0

    invoke-direct {p0, p3}, Landroidx/compose/ui/viewinterop/c$g;->d(I)I

    move-result p1

    return p1
.end method

.method public i(LC0/o;Ljava/util/List;I)I
    .locals 0

    invoke-direct {p0, p3}, Landroidx/compose/ui/viewinterop/c$g;->a(I)I

    move-result p1

    return p1
.end method
