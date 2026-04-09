.class public abstract Landroidx/compose/ui/platform/coreshims/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/coreshims/d$c;,
        Landroidx/compose/ui/platform/coreshims/d$b;,
        Landroidx/compose/ui/platform/coreshims/d$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/a;
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/coreshims/d$a;->a(Landroid/view/View;)Landroid/view/autofill/AutofillId;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/ui/platform/coreshims/a;->b(Landroid/view/autofill/AutofillId;)Landroidx/compose/ui/platform/coreshims/a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/c;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Landroidx/compose/ui/platform/coreshims/d$b;->a(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    invoke-static {v0, p0}, Landroidx/compose/ui/platform/coreshims/c;->f(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/c;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v2
.end method

.method public static c(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/coreshims/d$c;->a(Landroid/view/View;I)V

    :cond_0
    return-void
.end method
