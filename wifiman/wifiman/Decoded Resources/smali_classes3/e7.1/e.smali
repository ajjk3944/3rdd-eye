.class public final Le7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le7/d;


# instance fields
.field private final a:LFg/a;

.field private b:[F

.field private final c:Lgg/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LFg/a;->j2()LFg/a;

    move-result-object v0

    const-string/jumbo v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Le7/e;->a:LFg/a;

    const/4 v1, 0x3

    new-array v1, v1, [F

    iput-object v1, p0, Le7/e;->b:[F

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Le7/e;->c:Lgg/i;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/ar/core/Frame;I)V
    .locals 2

    const-string/jumbo p2, "frame"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/ar/core/Frame;->getCamera()Lcom/google/ar/core/Camera;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/ar/core/Camera;->getTrackingState()Lcom/google/ar/core/TrackingState;

    move-result-object p2

    sget-object v0, Lcom/google/ar/core/TrackingState;->TRACKING:Lcom/google/ar/core/TrackingState;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Le7/e;->b:[F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v1, p2, v0

    const/4 v0, 0x1

    aput v1, p2, v0

    const/4 v0, 0x2

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p2, v0

    iget-object v0, p0, Le7/e;->a:LFg/a;

    sget-object v1, Le7/c;->a:Le7/c;

    invoke-virtual {v1, p1, p2}, Le7/c;->a(Lcom/google/ar/core/Frame;[F)Le7/a;

    move-result-object p1

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Le7/e;->c:Lgg/i;

    return-object v0
.end method
