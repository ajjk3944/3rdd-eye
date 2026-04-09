.class final Lcom/ubnt/usurvey/ui/signal/floorplan/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/floorplan/a;->b(LA8/z;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/signal/floorplan/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$g;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    iput-object p2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$g;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 7

    const-string/jumbo v0, "gpx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$g;->a:Lcom/ubnt/usurvey/ui/signal/floorplan/a;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/signal/floorplan/a;->k(Lcom/ubnt/usurvey/ui/signal/floorplan/a;)Lod/b;

    move-result-object v1

    iget-object v2, p0, Lcom/ubnt/usurvey/ui/signal/floorplan/a$g;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object v6, p1

    invoke-interface/range {v1 .. v6}, Lod/b;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/floorplan/a$g;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
