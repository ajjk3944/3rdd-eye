.class public final Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/floorplan/a$d;->b(Lcom/ui/wifiman/model/signalmapper/floorplan/b;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

.field final synthetic b:Lcom/ui/wifiman/model/signalmapper/floorplan/b;


# direct methods
.method public constructor <init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;Lcom/ui/wifiman/model/signalmapper/floorplan/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    iput-object p2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;->b:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 11

    :try_start_0
    new-instance v0, LA8/z;

    new-instance v1, Lh7/a;

    iget-object v2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    invoke-static {v2}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->i(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh7/a$b;

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v10}, Lh7/a$b;-><init>(IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v2, v3}, Lh7/a;-><init>(Landroid/content/Context;Lh7/a$b;)V

    iget-object v2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;->b:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;->b:Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    iget-object v3, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    invoke-static {v3}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->h(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)Lcom/ubnt/mlkit/product/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, LA8/z;-><init>(Lh7/a;Lcom/ui/wifiman/model/signalmapper/floorplan/b;Lcom/ubnt/mlkit/product/a;)V

    sget-object v1, Lod/g;->c:Lod/g$a;

    invoke-virtual {v1}, Lod/g$a;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lh7/g;->R(I)V

    sget-object v1, Lgc/b;->SIGNAL:Lgc/b;

    invoke-virtual {v0, v1}, LA8/z;->u0(Lgc/b;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
