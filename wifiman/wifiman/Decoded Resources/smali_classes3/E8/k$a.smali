.class final LE8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/k$a$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lmh/l;

.field private final c:J

.field private final d:Ljava/util/LinkedList;

.field private e:J

.field final synthetic f:LE8/k;


# direct methods
.method public constructor <init>(LE8/k;IILmh/l;)V
    .locals 1

    const-string/jumbo v0, "clearAtStep"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, LE8/k$a;->f:LE8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p3, p0, LE8/k$a;->a:I

    .line 3
    iput-object p4, p0, LE8/k$a;->b:Lmh/l;

    int-to-long p1, p2

    const-wide/32 p3, 0xf4240

    mul-long/2addr p1, p3

    .line 4
    iput-wide p1, p0, LE8/k$a;->c:J

    .line 5
    new-instance p3, Ljava/util/LinkedList;

    invoke-direct {p3}, Ljava/util/LinkedList;-><init>()V

    iput-object p3, p0, LE8/k$a;->d:Ljava/util/LinkedList;

    .line 6
    iput-wide p1, p0, LE8/k$a;->e:J

    return-void
.end method

.method public synthetic constructor <init>(LE8/k;IILmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/16 p2, 0xa

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/16 p3, 0x3c

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    .line 7
    new-instance p4, LE8/j;

    invoke-direct {p4}, LE8/j;-><init>()V

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LE8/k$a;-><init>(LE8/k;IILmh/l;)V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Z
    .locals 0

    invoke-static {p0}, LE8/k$a;->b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Z

    move-result p0

    return p0
.end method

.method private static final b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object p0

    sget-object v0, LE8/k$a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const/4 p0, 0x0

    goto :goto_0

    :pswitch_1
    const/4 p0, 0x1

    :goto_0
    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static final synthetic c(LE8/k$a;)Lmh/l;
    .locals 0

    iget-object p0, p0, LE8/k$a;->b:Lmh/l;

    return-object p0
.end method

.method public static final synthetic d(LE8/k$a;)Ljava/util/LinkedList;
    .locals 0

    iget-object p0, p0, LE8/k$a;->d:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static final synthetic e(LE8/k$a;)I
    .locals 0

    iget p0, p0, LE8/k$a;->a:I

    return p0
.end method

.method public static final synthetic f(LE8/k$a;)J
    .locals 2

    iget-wide v0, p0, LE8/k$a;->e:J

    return-wide v0
.end method

.method public static final synthetic g(LE8/k$a;Lff/a;)Lhf/h;
    .locals 0

    invoke-direct {p0, p1}, LE8/k$a;->i(Lff/a;)Lhf/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LE8/k$a;J)V
    .locals 0

    iput-wide p1, p0, LE8/k$a;->e:J

    return-void
.end method

.method private final i(Lff/a;)Lhf/h;
    .locals 11

    monitor-enter p0

    :try_start_0
    iget v0, p0, LE8/k$a;->a:I

    new-array v1, v0, [F

    iget-wide v2, p0, LE8/k$a;->e:J

    long-to-double v2, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    iget-object v5, p0, LE8/k$a;->d:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    iget v7, p0, LE8/k$a;->a:I

    sub-int/2addr v6, v7

    add-int/2addr v6, v4

    invoke-static {v5, v6}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    long-to-double v5, v5

    div-double/2addr v5, v2

    const-wide v7, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v7, v5

    const/16 v9, 0xa

    int-to-double v9, v9

    mul-double/2addr v5, v9

    const-wide v9, 0x3fc999999999999aL    # 0.2

    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    add-double/2addr v7, v5

    double-to-float v5, v7

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 v5, 0x0

    :goto_1
    aput v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lhf/h;

    invoke-direct {v0, p1, v1}, Lhf/h;-><init>(Lff/a;[F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_2
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final j(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/k$a;->f:LE8/k;

    new-instance v1, LE8/k$a$b;

    invoke-direct {v1, p0, v0, p1}, LE8/k$a$b;-><init>(LE8/k$a;LE8/k;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
