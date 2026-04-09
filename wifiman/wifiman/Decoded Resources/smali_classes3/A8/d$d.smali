.class final LA8/d$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/d;->b(JLandroid/content/Context;Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:J

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:LA8/d;

.field e:I


# direct methods
.method constructor <init>(LA8/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LA8/d$d;->d:LA8/d;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, LA8/d$d;->c:Ljava/lang/Object;

    iget p1, p0, LA8/d$d;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LA8/d$d;->e:I

    iget-object v0, p0, LA8/d$d;->d:LA8/d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v1, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, LA8/d;->b(JLandroid/content/Context;Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
