.class final Landroidx/compose/ui/platform/r$y;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;->w(Lmh/p;Ldh/e;)Ljava/lang/Object;
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

    iput-object p1, p0, Landroidx/compose/ui/platform/r$y;->a:Landroidx/compose/ui/platform/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LIi/N;)Landroidx/compose/ui/platform/O;
    .locals 3

    new-instance v0, Landroidx/compose/ui/platform/O;

    iget-object v1, p0, Landroidx/compose/ui/platform/r$y;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/r;->getTextInputService()LR0/T;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Landroidx/compose/ui/platform/O;-><init>(Landroid/view/View;LR0/T;LIi/N;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r$y;->a(LIi/N;)Landroidx/compose/ui/platform/O;

    move-result-object p1

    return-object p1
.end method
