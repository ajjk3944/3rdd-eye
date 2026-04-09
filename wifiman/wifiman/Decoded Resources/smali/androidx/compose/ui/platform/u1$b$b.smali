.class public final Landroidx/compose/ui/platform/u1$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/u1$b;->a(Landroidx/compose/ui/platform/a;)Lmh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/a;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/u1$b$b;->a:Landroidx/compose/ui/platform/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/u1$b$b;->a:Landroidx/compose/ui/platform/a;

    invoke-static {p1}, LK1/a;->d(Landroid/view/View;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/u1$b$b;->a:Landroidx/compose/ui/platform/a;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/a;->e()V

    :cond_0
    return-void
.end method
