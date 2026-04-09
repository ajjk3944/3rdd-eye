.class final LA8/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/f;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/f;


# direct methods
.method constructor <init>(LA8/f;)V
    .locals 0

    iput-object p1, p0, LA8/f$c;->a:LA8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWe/a;)Lgg/D;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/f$c;->a:LA8/f;

    invoke-static {v0}, LA8/f;->u0(LA8/f;)Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    move-result-object v0

    invoke-virtual {p1}, LWe/a;->a()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;->c(J)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWe/a;

    invoke-virtual {p0, p1}, LA8/f$c;->a(LWe/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
