.class final Landroidx/compose/ui/viewinterop/c$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LT/q;ILx0/b;Landroid/view/View;LE0/m0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/viewinterop/c;

.field final synthetic b:LE0/G;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/c;LE0/G;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$j;->a:Landroidx/compose/ui/viewinterop/c;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c$j;->b:LE0/G;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/r;)V
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$j;->a:Landroidx/compose/ui/viewinterop/c;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$j;->b:LE0/G;

    invoke-static {p1, v0}, Landroidx/compose/ui/viewinterop/d;->b(Landroid/view/View;LE0/G;)V

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$j;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/c;->e(Landroidx/compose/ui/viewinterop/c;)LE0/m0;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$j;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-interface {p1, v0}, LE0/m0;->l(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC0/r;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$j;->a(LC0/r;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
