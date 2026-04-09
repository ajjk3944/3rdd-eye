.class public final synthetic Landroidx/compose/ui/platform/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/x;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/v;->a:Landroidx/compose/ui/platform/x;

    return-void
.end method


# virtual methods
.method public final onTouchExplorationStateChanged(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/v;->a:Landroidx/compose/ui/platform/x;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/x;->n(Landroidx/compose/ui/platform/x;Z)V

    return-void
.end method
