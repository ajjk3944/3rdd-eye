.class public final Lqd/d;
.super Lcom/ui/wifiman/model/speedtest/Speedtest$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/d$a;,
        Lqd/d$b;,
        Lqd/d$c;
    }
.end annotation


# static fields
.field public static final m:Lqd/d$a;


# instance fields
.field private final a:Lqd/a$a;

.field private final b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final j:Lpd/s;

.field private final k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqd/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqd/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqd/d;->m:Lqd/d$a;

    return-void
.end method

.method public constructor <init>(Lqd/a$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)V
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "evaluation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadInitialization"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "download"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadInitialization"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upload"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultReported"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultReportStored"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;-><init>()V

    iput-object p1, p0, Lqd/d;->a:Lqd/a$a;

    iput-object p2, p0, Lqd/d;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object p3, p0, Lqd/d;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object p4, p0, Lqd/d;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object p5, p0, Lqd/d;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object p6, p0, Lqd/d;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object p7, p0, Lqd/d;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object p8, p0, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object p9, p0, Lqd/d;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    sget-object p1, Lpd/s;->APP_TO_APP:Lpd/s;

    iput-object p1, p0, Lqd/d;->j:Lpd/s;

    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    goto :goto_0

    :cond_0
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    if-eqz p1, :cond_1

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {p1, p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz p1, :cond_2

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    move-object p4, p2

    check-cast p4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {p4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lqd/a$b;

    invoke-virtual {p4}, Lqd/a$b;->b()I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p1, p4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz p1, :cond_3

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    move-object p4, p2

    check-cast p4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {p4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object p4

    invoke-direct {p1, p4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-eqz p1, :cond_9

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    invoke-direct {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;-><init>()V

    :goto_0
    iput-object p1, p0, Lqd/d;->k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    if-eqz p1, :cond_4

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    goto :goto_1

    :cond_4
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    if-eqz p1, :cond_5

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {p1, p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz p1, :cond_6

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    check-cast p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lqd/a$b;

    invoke-virtual {p2}, Lqd/a$b;->a()Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz p1, :cond_7

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    check-cast p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_7
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-eqz p1, :cond_8

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    invoke-direct {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;-><init>()V

    :goto_1
    iput-object p1, p0, Lqd/d;->l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-void

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic k(Lqd/d;Lqd/a$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lqd/d;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lqd/d;->a:Lqd/a$a;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lqd/d;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lqd/d;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lqd/d;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lqd/d;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lqd/d;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lqd/d;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lqd/d;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lqd/d;->j(Lqd/a$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)Lqd/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;
    .locals 3

    iget-object v0, p0, Lqd/d;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Lqd/d;->m()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lqd/d;->m()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lqd/d;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lqd/d;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lqd/d;->q()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lqd/d;->q()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lqd/d;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lqd/d;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lqd/d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lqd/d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_6

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lqd/d;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_7

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_7
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_9

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    if-eqz v1, :cond_8

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-object v2, v0

    goto :goto_1

    :cond_8
    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;-><init>(Ljava/lang/Throwable;)V

    move-object v2, v1

    :cond_9
    :goto_1
    return-object v2
.end method

.method public c()Z
    .locals 3

    invoke-virtual {p0}, Lqd/d;->l()Lqd/d$b;

    move-result-object v0

    sget-object v1, Lqd/d$b;->END:Lqd/d$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lqd/d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public d()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqd/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lqd/d;

    iget-object v1, p0, Lqd/d;->a:Lqd/a$a;

    iget-object v3, p1, Lqd/d;->a:Lqd/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lqd/d;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lqd/d;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lqd/d;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lqd/d;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lqd/d;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lqd/d;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lqd/d;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lqd/d;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lqd/d;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lqd/d;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lqd/d;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lqd/d;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lqd/d;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object p1, p1, Lqd/d;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public g()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 6

    invoke-virtual {p0}, Lqd/d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqd/d;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {p0}, Lqd/d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b;->f()J

    move-result-wide v1

    invoke-virtual {p0}, Lqd/d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lqd/d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/ui/wifiman/model/speedtest/Speedtest$c;

    invoke-direct {v5, v1, v2, v4, v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$c;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v5}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    :goto_0
    return-object v0
.end method

.method public h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;
    .locals 2

    invoke-virtual {p0}, Lqd/d;->l()Lqd/d$b;

    move-result-object v0

    sget-object v1, Lqd/d$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->END:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->RESULT_PROCESSING:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_5
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_6
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->LATENCY_CHECK:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lqd/d;->a:Lqd/a$a;

    invoke-virtual {v0}, Lqd/a$a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqd/d;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqd/d;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqd/d;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqd/d;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqd/d;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqd/d;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqd/d;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final j(Lqd/a$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)Lqd/d;
    .locals 11

    const-string v0, "params"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "evaluation"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadInitialization"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "download"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadInitialization"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upload"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultReported"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultReportStored"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqd/d;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lqd/d;-><init>(Lqd/a$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)V

    return-object v0
.end method

.method public final l()Lqd/d$b;
    .locals 1

    iget-object v0, p0, Lqd/d;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lqd/d$b;->EVALUATION:Lqd/d$b;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lqd/d;->m()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lqd/d$b;->DOWNLOAD_SETUP:Lqd/d$b;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lqd/d;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lqd/d$b;->DOWNLOAD:Lqd/d$b;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lqd/d;->q()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lqd/d$b;->UPLOAD_SETUP:Lqd/d$b;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lqd/d;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lqd/d$b;->UPLOAD:Lqd/d$b;

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lqd/d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lqd/d$b;->RESULT_SAVE:Lqd/d$b;

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lqd/d$b;->RESULT_REPORT:Lqd/d$b;

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lqd/d;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lqd/d$b;->RESULT_UPDATE_WITH_REPORT:Lqd/d$b;

    goto :goto_0

    :cond_7
    sget-object v0, Lqd/d$b;->END:Lqd/d$b;

    :goto_0
    return-object v0
.end method

.method public m()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final n()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final o()Lqd/a$a;
    .locals 1

    iget-object v0, p0, Lqd/d;->a:Lqd/a$a;

    return-object v0
.end method

.method public final p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public q()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lqd/d;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
