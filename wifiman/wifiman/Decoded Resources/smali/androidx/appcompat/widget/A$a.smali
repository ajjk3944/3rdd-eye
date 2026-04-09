.class Landroidx/appcompat/widget/A$a;
.super Landroidx/appcompat/widget/N;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/A;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Landroidx/appcompat/widget/A$f;

.field final synthetic k:Landroidx/appcompat/widget/A;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/A;Landroid/view/View;Landroidx/appcompat/widget/A$f;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/A$a;->k:Landroidx/appcompat/widget/A;

    iput-object p3, p0, Landroidx/appcompat/widget/A$a;->j:Landroidx/appcompat/widget/A$f;

    invoke-direct {p0, p2}, Landroidx/appcompat/widget/N;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Ll/e;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/A$a;->j:Landroidx/appcompat/widget/A$f;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/A$a;->k:Landroidx/appcompat/widget/A;

    invoke-virtual {v0}, Landroidx/appcompat/widget/A;->getInternalPopup()Landroidx/appcompat/widget/A$h;

    move-result-object v0

    invoke-interface {v0}, Landroidx/appcompat/widget/A$h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/A$a;->k:Landroidx/appcompat/widget/A;

    invoke-virtual {v0}, Landroidx/appcompat/widget/A;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
