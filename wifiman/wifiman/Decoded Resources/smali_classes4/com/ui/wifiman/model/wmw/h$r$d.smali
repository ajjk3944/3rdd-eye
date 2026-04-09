.class final Lcom/ui/wifiman/model/wmw/h$r$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h$r;->b(LMf/a;)LDj/a;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$r$d;->a:Lcom/ui/wifiman/model/wmw/g$b;

    iput-wide p2, p0, Lcom/ui/wifiman/model/wmw/h$r$d;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LMf/a$b;)Lcom/ui/wifiman/model/wmw/g$c$b$d;
    .locals 12

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LMf/a$b$b;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/wmw/g$c$b$d;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$r$d;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/h$r$d;->b:J

    invoke-virtual {p1}, LMf/a$b;->b()J

    move-result-wide v5

    invoke-virtual {p1}, LMf/a$b;->c()J

    move-result-wide v7

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$b;->UPLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    invoke-virtual {p1}, LMf/a$b;->c()J

    move-result-wide v9

    long-to-float v9, v9

    invoke-virtual {p1}, LMf/a$b;->b()J

    move-result-wide v10

    long-to-float p1, v10

    div-float/2addr v9, p1

    invoke-virtual {v1, v9}, Lcom/ui/wifiman/model/wmw/h$b;->mapStageProgressToTotalProgress(F)F

    move-result v9

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ui/wifiman/model/wmw/g$c$b$d;-><init>(Lcom/ui/common/semver/SemVer;JJJF)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LMf/a$b$a;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/wmw/g$c$b$d;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$r$d;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/h$r$d;->b:J

    check-cast p1, LMf/a$b$a;

    invoke-virtual {p1}, LMf/a$b$a;->b()J

    move-result-wide v5

    invoke-virtual {p1}, LMf/a$b$a;->c()J

    move-result-wide v7

    sget-object p1, Lcom/ui/wifiman/model/wmw/h$b;->UPLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, v1}, Lcom/ui/wifiman/model/wmw/h$b;->mapStageProgressToTotalProgress(F)F

    move-result v9

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ui/wifiman/model/wmw/g$c$b$d;-><init>(Lcom/ui/common/semver/SemVer;JJJF)V

    :goto_0
    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMf/a$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$r$d;->a(LMf/a$b;)Lcom/ui/wifiman/model/wmw/g$c$b$d;

    move-result-object p1

    return-object p1
.end method
