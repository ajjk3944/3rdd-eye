.class public final Lk7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le7/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/d$a;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:LFg/c;

.field private final c:Lgg/y;

.field private d:Ljava/lang/Long;

.field private e:Lcom/google/ar/core/Frame;

.field private final f:LD7/d;

.field private final g:LD7/b;

.field private h:Z

.field private i:J

.field private final j:Lgg/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;FJ)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p3, p0, Lk7/d;->a:J

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p3

    const-string/jumbo p4, "create(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lk7/d;->b:LFg/c;

    sget-object p4, Lm9/c;->a:Lm9/c;

    const-string/jumbo v0, "FloorplanObjectDetectionScheduler"

    invoke-virtual {p4, v0}, Lm9/c;->h(Ljava/lang/String;)Lgg/y;

    move-result-object p4

    iput-object p4, p0, Lk7/d;->c:Lgg/y;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lk7/d;->d:Ljava/lang/Long;

    new-instance v0, LD7/d;

    const-string/jumbo v1, "model.tflite"

    invoke-direct {v0, p1, v1, p2}, LD7/d;-><init>(Landroid/content/Context;Ljava/lang/String;F)V

    iput-object v0, p0, Lk7/d;->f:LD7/d;

    new-instance p1, LD7/a;

    invoke-direct {p1}, LD7/a;-><init>()V

    iput-object p1, p0, Lk7/d;->g:LD7/b;

    invoke-virtual {p3, p4}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    new-instance p2, Lk7/d$b;

    invoke-direct {p2, p0}, Lk7/d$b;-><init>(Lk7/d;)V

    invoke-virtual {p1, p2}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance p2, Lk7/d$c;

    invoke-direct {p2, p0}, Lk7/d$c;-><init>(Lk7/d;)V

    invoke-virtual {p1, p2}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p2, Lk7/c;

    invoke-direct {p2, p0}, Lk7/c;-><init>(Lk7/d;)V

    invoke-virtual {p1, p2}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->h1()Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk7/d;->j:Lgg/i;

    return-void
.end method

.method public static synthetic b(Lk7/d;)V
    .locals 0

    invoke-static {p0}, Lk7/d;->h(Lk7/d;)V

    return-void
.end method

.method public static final synthetic c(Lk7/d;)LD7/d;
    .locals 0

    iget-object p0, p0, Lk7/d;->f:LD7/d;

    return-object p0
.end method

.method public static final synthetic d(Lk7/d;)Lcom/google/ar/core/Frame;
    .locals 0

    iget-object p0, p0, Lk7/d;->e:Lcom/google/ar/core/Frame;

    return-object p0
.end method

.method public static final synthetic e(Lk7/d;)LD7/b;
    .locals 0

    iget-object p0, p0, Lk7/d;->g:LD7/b;

    return-object p0
.end method

.method public static final synthetic f(Lk7/d;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lk7/d;->j(Z)V

    return-void
.end method

.method public static final synthetic g(Lk7/d;Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lk7/d;->d:Ljava/lang/Long;

    return-void
.end method

.method private static final h(Lk7/d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lk7/d;->j(Z)V

    return-void
.end method

.method private final j(Z)V
    .locals 2

    iput-boolean p1, p0, Lk7/d;->h:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Floorplan object detection enabled "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/ar/core/Frame;I)V
    .locals 6

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk7/d;->e:Lcom/google/ar/core/Frame;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lk7/d;->i:J

    iget-boolean v0, p0, Lk7/d;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk7/d;->d:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-wide v2, p0, Lk7/d;->i:J

    iget-wide v4, p0, Lk7/d;->a:J

    add-long/2addr v0, v4

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/ar/core/Frame;->acquireCameraImage()Landroid/media/Image;

    move-result-object p1

    const-string/jumbo v0, "acquireCameraImage(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lk7/d;->d:Ljava/lang/Long;

    iget-object v0, p0, Lk7/d;->b:LFg/c;

    new-instance v1, Lk7/d$a;

    invoke-direct {v1, p1, p2}, Lk7/d$a;-><init>(Landroid/media/Image;I)V

    invoke-virtual {v0, v1}, LFg/c;->h(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/ar/core/exceptions/NotYetAvailableException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lk7/d;->d:Ljava/lang/Long;

    :cond_0
    :goto_0
    return-void
.end method

.method public i()Lgg/i;
    .locals 1

    iget-object v0, p0, Lk7/d;->j:Lgg/i;

    return-object v0
.end method
