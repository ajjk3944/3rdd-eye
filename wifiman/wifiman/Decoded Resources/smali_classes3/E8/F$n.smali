.class final LE8/F$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/F;->t0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/F;


# direct methods
.method constructor <init>(LE8/F;)V
    .locals 0

    iput-object p1, p0, LE8/F$n;->a:LE8/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lgg/f;
    .locals 4

    const-string/jumbo v0, "resultId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/F$n;->a:LE8/F;

    invoke-static {v0}, LE8/F;->w0(LE8/F;)Lcom/ui/wifiman/model/speedtest/result/e;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 p1, 0x1

    new-array p1, p1, [J

    const/4 v3, 0x0

    aput-wide v1, p1, v3

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/speedtest/result/e;->b([J)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LE8/F$n;->a(Ljava/lang/Long;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
