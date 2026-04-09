.class final Lcom/ui/wifiman/model/wmw/h$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->w(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$p;->a:Lcom/ui/wifiman/model/wmw/g$b;

    iput-wide p2, p0, Lcom/ui/wifiman/model/wmw/h$p;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Float;)Lcom/ui/wifiman/model/wmw/g$c$b$a;
    .locals 10

    const-string v0, "progress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/wmw/g$c$b$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$p;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/h$p;->b:J

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$p;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/g$b;->a()Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c()J

    move-result-wide v5

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$p;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/g$b;->a()Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c()J

    move-result-wide v7

    long-to-float v1, v7

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v7

    mul-float/2addr v1, v7

    invoke-static {v1}, Loh/b;->g(F)J

    move-result-wide v7

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$b;->DOWNLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v1, p1}, Lcom/ui/wifiman/model/wmw/h$b;->mapStageProgressToTotalProgress(F)F

    move-result v9

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ui/wifiman/model/wmw/g$c$b$a;-><init>(Lcom/ui/common/semver/SemVer;JJJF)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$p;->a(Ljava/lang/Float;)Lcom/ui/wifiman/model/wmw/g$c$b$a;

    move-result-object p1

    return-object p1
.end method
