.class public final Lcom/ubnt/usurvey/ui/signal/floorplan/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/floorplan/a;->b(LA8/z;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

.field final synthetic b:LA8/z;


# direct methods
.method public constructor <init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;LA8/z;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$f;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    iput-object p2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$f;->b:LA8/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$f;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->j(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$f;->b:LA8/z;

    invoke-virtual {v1}, LA8/z;->m0()Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer;->b(Lod/d;)Ljava/lang/String;

    move-result-object v0

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
