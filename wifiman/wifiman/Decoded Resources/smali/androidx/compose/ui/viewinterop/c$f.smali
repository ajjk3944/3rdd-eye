.class final Landroidx/compose/ui/viewinterop/c$f;
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


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$f;->a:Landroidx/compose/ui/viewinterop/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/m0;)V
    .locals 1

    instance-of v0, p1, Landroidx/compose/ui/platform/r;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/ui/platform/r;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$f;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/r;->K0(Landroidx/compose/ui/viewinterop/c;)V

    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$f;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/m0;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$f;->a(LE0/m0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
