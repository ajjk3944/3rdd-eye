.class final Landroidx/compose/ui/platform/P$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/P;-><init>(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/P;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/P;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/P$a;->a:Landroidx/compose/ui/platform/P;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/P$a;->a:Landroidx/compose/ui/platform/P;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/P;->d(Landroidx/compose/ui/platform/P;Landroid/view/ActionMode;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/P$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
