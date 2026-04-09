.class LG1/u$b;
.super LG1/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>(LG1/u;)V
    .locals 0

    invoke-direct {p0, p1}, LG1/u$a;-><init>(LG1/u;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LG1/u$a;->a:LG1/u;

    invoke-static {p2}, LG1/t;->V0(Landroid/view/accessibility/AccessibilityNodeInfo;)LG1/t;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3, p4}, LG1/u;->a(ILG1/t;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
