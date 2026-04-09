.class final Landroidx/compose/ui/platform/x$e;
.super LG1/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Landroidx/compose/ui/platform/x;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/x;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/x$e;->b:Landroidx/compose/ui/platform/x;

    invoke-direct {p0}, LG1/u;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILG1/t;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x$e;->b:Landroidx/compose/ui/platform/x;

    invoke-static {v0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/x;->r(Landroidx/compose/ui/platform/x;ILG1/t;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public b(I)LG1/t;
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/x$e;->b:Landroidx/compose/ui/platform/x;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/x;->t(Landroidx/compose/ui/platform/x;I)LG1/t;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/x$e;->b:Landroidx/compose/ui/platform/x;

    invoke-static {v1}, Landroidx/compose/ui/platform/x;->D(Landroidx/compose/ui/platform/x;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Landroidx/compose/ui/platform/x;->y(Landroidx/compose/ui/platform/x;)I

    move-result v2

    if-ne p1, v2, :cond_0

    invoke-static {v1, v0}, Landroidx/compose/ui/platform/x;->J(Landroidx/compose/ui/platform/x;LG1/t;)V

    :cond_0
    return-object v0
.end method

.method public d(I)LG1/t;
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/x$e;->b:Landroidx/compose/ui/platform/x;

    invoke-static {p1}, Landroidx/compose/ui/platform/x;->y(Landroidx/compose/ui/platform/x;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/x$e;->b(I)LG1/t;

    move-result-object p1

    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x$e;->b:Landroidx/compose/ui/platform/x;

    invoke-static {v0, p1, p2, p3}, Landroidx/compose/ui/platform/x;->G(Landroidx/compose/ui/platform/x;IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
