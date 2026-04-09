.class final Lcom/ui/wifiman/model/wmw/h$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->y(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/g$b;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/g$b;J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$s;->a:Lcom/ui/wifiman/model/wmw/g$b;

    iput-wide p2, p0, Lcom/ui/wifiman/model/wmw/h$s;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lcom/ui/wifiman/model/wmw/g$c$b$c;
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0xc8

    mul-long/2addr v0, v2

    new-instance p1, Lcom/ui/wifiman/model/wmw/g$c$b$c;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$s;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/h$s;->b:J

    sget-object v5, Lcom/ui/wifiman/model/wmw/h$b;->UPGRADE:Lcom/ui/wifiman/model/wmw/h$b;

    long-to-float v0, v0

    const-wide/32 v6, 0x2bf20

    long-to-float v1, v6

    div-float/2addr v0, v1

    invoke-virtual {v5, v0}, Lcom/ui/wifiman/model/wmw/h$b;->mapStageProgressToTotalProgress(F)F

    move-result v0

    invoke-direct {p1, v2, v3, v4, v0}, Lcom/ui/wifiman/model/wmw/g$c$b$c;-><init>(Lcom/ui/common/semver/SemVer;JF)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$s;->a(Ljava/lang/Long;)Lcom/ui/wifiman/model/wmw/g$c$b$c;

    move-result-object p1

    return-object p1
.end method
