.class final Landroidx/compose/ui/viewinterop/c$c;
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
.field final synthetic a:LE0/G;

.field final synthetic b:Landroidx/compose/ui/e;


# direct methods
.method constructor <init>(LE0/G;Landroidx/compose/ui/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$c;->a:LE0/G;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c$c;->b:Landroidx/compose/ui/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$c;->a:LE0/G;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c$c;->b:Landroidx/compose/ui/e;

    invoke-interface {p1, v1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-virtual {v0, p1}, LE0/G;->g(Landroidx/compose/ui/e;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$c;->a(Landroidx/compose/ui/e;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
