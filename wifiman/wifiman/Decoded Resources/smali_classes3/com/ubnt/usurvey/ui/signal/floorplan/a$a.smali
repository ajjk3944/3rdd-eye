.class final Lcom/ubnt/usurvey/ui/signal/floorplan/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/floorplan/a;->c(J)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/ubnt/usurvey/ui/signal/floorplan/a;


# direct methods
.method constructor <init>(JLcom/ubnt/usurvey/ui/signal/floorplan/a;)V
    .locals 0

    iput-wide p1, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$a;->a:J

    iput-object p3, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$a;->b:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/D;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$a;->b:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->l(Lcom/ubnt/usurvey/ui/signal/floorplan/a;Ljava/lang/String;)Lgg/z;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager$Error$RecordNotFound;

    iget-wide v0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$a;->a:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Floorplan record "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " not found"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager$Error$RecordNotFound;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$a;->a(Ll9/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
