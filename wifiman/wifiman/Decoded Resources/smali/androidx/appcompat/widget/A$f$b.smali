.class Landroidx/appcompat/widget/A$f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/A$f;->n(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/widget/A$f;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/A$f;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/A$f$b;->a:Landroidx/appcompat/widget/A$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/A$f$b;->a:Landroidx/appcompat/widget/A$f;

    iget-object v1, v0, Landroidx/appcompat/widget/A$f;->Y:Landroidx/appcompat/widget/A;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/A$f;->V(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/A$f$b;->a:Landroidx/appcompat/widget/A$f;

    invoke-virtual {v0}, Landroidx/appcompat/widget/P;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/A$f$b;->a:Landroidx/appcompat/widget/A$f;

    invoke-virtual {v0}, Landroidx/appcompat/widget/A$f;->T()V

    iget-object v0, p0, Landroidx/appcompat/widget/A$f$b;->a:Landroidx/appcompat/widget/A$f;

    invoke-static {v0}, Landroidx/appcompat/widget/A$f;->S(Landroidx/appcompat/widget/A$f;)V

    :goto_0
    return-void
.end method
