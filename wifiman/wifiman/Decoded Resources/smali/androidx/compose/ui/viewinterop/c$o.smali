.class final Landroidx/compose/ui/viewinterop/c$o;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


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

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$o;->a:Landroidx/compose/ui/viewinterop/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$o;->a:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->getLayoutNode()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->D0()V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c$o;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
