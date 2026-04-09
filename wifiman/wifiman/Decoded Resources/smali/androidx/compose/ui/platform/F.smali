.class final Landroidx/compose/ui/platform/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/translation/ViewTranslationCallback;


# static fields
.field public static final a:Landroidx/compose/ui/platform/F;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/F;

    invoke-direct {v0}, Landroidx/compose/ui/platform/F;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/F;->a:Landroidx/compose/ui/platform/F;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClearTranslation(Landroid/view/View;)Z
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getContentCaptureManager$ui_release()Lh0/b;

    move-result-object p1

    invoke-virtual {p1}, Lh0/b;->r()V

    const/4 p1, 0x1

    return p1
.end method

.method public onHideTranslation(Landroid/view/View;)Z
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getContentCaptureManager$ui_release()Lh0/b;

    move-result-object p1

    invoke-virtual {p1}, Lh0/b;->t()V

    const/4 p1, 0x1

    return p1
.end method

.method public onShowTranslation(Landroid/view/View;)Z
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getContentCaptureManager$ui_release()Lh0/b;

    move-result-object p1

    invoke-virtual {p1}, Lh0/b;->w()V

    const/4 p1, 0x1

    return p1
.end method
