.class final Landroidx/compose/ui/window/j$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/j;-><init>(Lmh/a;Landroidx/compose/ui/window/i;Landroid/view/View;LY0/t;LY0/d;Ljava/util/UUID;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/j;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/j$b;->a:Landroidx/compose/ui/window/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc/F;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/window/j$b;->a:Landroidx/compose/ui/window/j;

    invoke-static {p1}, Landroidx/compose/ui/window/j;->j(Landroidx/compose/ui/window/j;)Landroidx/compose/ui/window/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/window/i;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/window/j$b;->a:Landroidx/compose/ui/window/j;

    invoke-static {p1}, Landroidx/compose/ui/window/j;->i(Landroidx/compose/ui/window/j;)Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc/F;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/j$b;->a(Lc/F;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
