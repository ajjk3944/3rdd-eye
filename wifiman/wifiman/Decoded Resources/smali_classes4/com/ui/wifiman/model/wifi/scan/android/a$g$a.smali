.class final Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/android/a$g;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lfe/u;


# direct methods
.method constructor <init>(JLfe/u;)V
    .locals 0

    iput-wide p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;->a:J

    iput-object p3, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;->b:Lfe/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 12

    const-string v0, "lastScanAtTimestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;->a:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    const-wide/16 v4, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_0

    :cond_0
    move-wide v6, v4

    :goto_0
    sub-long/2addr v2, v6

    sub-long/2addr v0, v2

    cmp-long p1, v0, v4

    const-string v2, "WifiScanner"

    if-lez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Scan scheduled at "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " ms"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    move-wide v6, v0

    goto :goto_1

    :cond_1
    const-string p1, "Scan scheduled immediately"

    invoke-static {p1, v2}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    move-wide v6, v4

    :goto_1
    iget-wide v8, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;->a:J

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;->b:Lfe/u;

    invoke-interface {p1}, Lfe/u;->a()Lgg/y;

    move-result-object v11

    invoke-static/range {v6 .. v11}, Lgg/i;->G0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a$a;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$g$a$a;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/a$g$a;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
