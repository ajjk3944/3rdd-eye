.class final Lc/G$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;
.implements Lc/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "h"
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/k;

.field private final b:Lc/F;

.field private c:Lc/c;

.field final synthetic d:Lc/G;


# direct methods
.method public constructor <init>(Lc/G;Landroidx/lifecycle/k;Lc/F;)V
    .locals 1

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lc/G$h;->d:Lc/G;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc/G$h;->a:Landroidx/lifecycle/k;

    iput-object p3, p0, Lc/G$h;->b:Lc/F;

    invoke-virtual {p2, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lc/G$h;->a:Landroidx/lifecycle/k;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    iget-object v0, p0, Lc/G$h;->b:Lc/F;

    invoke-virtual {v0, p0}, Lc/F;->i(Lc/c;)V

    iget-object v0, p0, Lc/G$h;->c:Lc/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc/c;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lc/G$h;->c:Lc/c;

    return-void
.end method

.method public j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lc/G$h;->d:Lc/G;

    iget-object p2, p0, Lc/G$h;->b:Lc/F;

    invoke-virtual {p1, p2}, Lc/G;->j(Lc/F;)Lc/c;

    move-result-object p1

    iput-object p1, p0, Lc/G$h;->c:Lc/c;

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lc/G$h;->c:Lc/c;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lc/c;->cancel()V

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_2

    invoke-virtual {p0}, Lc/G$h;->cancel()V

    :cond_2
    :goto_0
    return-void
.end method
