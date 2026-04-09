.class final LA8/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/d;->a(JLcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/n;


# direct methods
.method constructor <init>(LIi/n;)V
    .locals 0

    iput-object p1, p0, LA8/d$b;->a:LIi/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA8/z;)V
    .locals 2

    const-string/jumbo v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/d$b;->a:LIi/n;

    sget-object v1, LYg/u;->b:LYg/u$a;

    new-instance v1, LA8/c;

    invoke-direct {v1, p1}, LA8/c;-><init>(LA8/z;)V

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LA8/z;

    invoke-virtual {p0, p1}, LA8/d$b;->a(LA8/z;)V

    return-void
.end method
