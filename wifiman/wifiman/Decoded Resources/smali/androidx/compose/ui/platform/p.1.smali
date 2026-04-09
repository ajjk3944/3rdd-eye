.class public final synthetic Landroidx/compose/ui/platform/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/r;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/p;->a:Landroidx/compose/ui/platform/r;

    return-void
.end method


# virtual methods
.method public final onTouchModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/p;->a:Landroidx/compose/ui/platform/r;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/r;->D(Landroidx/compose/ui/platform/r;Z)V

    return-void
.end method
