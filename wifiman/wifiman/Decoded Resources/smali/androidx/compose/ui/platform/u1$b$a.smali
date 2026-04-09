.class final Landroidx/compose/ui/platform/u1$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/u1$b;->a(Landroidx/compose/ui/platform/a;)Lmh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/a;

.field final synthetic b:Landroidx/compose/ui/platform/u1$b$b;

.field final synthetic c:LK1/b;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/a;Landroidx/compose/ui/platform/u1$b$b;LK1/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/u1$b$a;->a:Landroidx/compose/ui/platform/a;

    iput-object p2, p0, Landroidx/compose/ui/platform/u1$b$a;->b:Landroidx/compose/ui/platform/u1$b$b;

    iput-object p3, p0, Landroidx/compose/ui/platform/u1$b$a;->c:LK1/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/u1$b$a;->a:Landroidx/compose/ui/platform/a;

    iget-object v1, p0, Landroidx/compose/ui/platform/u1$b$a;->b:Landroidx/compose/ui/platform/u1$b$b;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/u1$b$a;->a:Landroidx/compose/ui/platform/a;

    iget-object v1, p0, Landroidx/compose/ui/platform/u1$b$a;->c:LK1/b;

    invoke-static {v0, v1}, LK1/a;->e(Landroid/view/View;LK1/b;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/u1$b$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
