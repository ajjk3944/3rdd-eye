.class final Lcom/ubnt/usurvey/ui/signal/floorplan/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/floorplan/a;->n(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(J)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d;->c(J)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(J)LYg/J;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "FloorplanControllerMgr - Controller init took "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " millis"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d;->b(Lcom/ui/wifiman/model/signalmapper/floorplan/b;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/signalmapper/floorplan/b;)Lgg/D;
    .locals 2

    const-string/jumbo v0, "floorplanSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    new-instance v1, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;

    invoke-direct {v1, v0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$d$a;-><init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;Lcom/ui/wifiman/model/signalmapper/floorplan/b;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/floorplan/b;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/floorplan/b;-><init>()V

    invoke-static {p1, v0}, Lk9/e;->f(Lgg/z;Lmh/l;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
