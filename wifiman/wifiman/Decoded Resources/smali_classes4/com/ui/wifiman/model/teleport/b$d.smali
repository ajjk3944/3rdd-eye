.class final Lcom/ui/wifiman/model/teleport/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b;->p(Lgg/i;J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$d;->a:Lkotlin/jvm/internal/N;

    iput-wide p2, p0, Lcom/ui/wifiman/model/teleport/b$d;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 14

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance p1, Lkotlin/jvm/internal/K;

    invoke-direct {p1}, Lkotlin/jvm/internal/K;-><init>()V

    iget-object v3, p0, Lcom/ui/wifiman/model/teleport/b$d;->a:Lkotlin/jvm/internal/N;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Float;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    iput v3, p1, Lkotlin/jvm/internal/K;->a:F

    cmpg-float v4, v3, v0

    if-gez v4, :cond_1

    iget-wide v3, p0, Lcom/ui/wifiman/model/teleport/b$d;->b:J

    div-long/2addr v1, v3

    const-wide/16 v3, 0x1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget v1, p1, Lkotlin/jvm/internal/K;->a:F

    sub-float v1, v0, v1

    long-to-float v2, v7

    div-float/2addr v1, v2

    iget-wide v11, p0, Lcom/ui/wifiman/model/teleport/b$d;->b:J

    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v5 .. v13}, Lgg/i;->I0(JJJJLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/model/teleport/b$d$a;

    invoke-direct {v3, p1, v1}, Lcom/ui/wifiman/model/teleport/b$d$a;-><init>(Lkotlin/jvm/internal/K;F)V

    invoke-virtual {v2, v3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/teleport/b$d$b;

    invoke-direct {v2, p1}, Lcom/ui/wifiman/model/teleport/b$d$b;-><init>(Lkotlin/jvm/internal/K;)V

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->M(Lgg/D;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_1
    cmpl-float p1, v3, v0

    if-lez p1, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$d;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
