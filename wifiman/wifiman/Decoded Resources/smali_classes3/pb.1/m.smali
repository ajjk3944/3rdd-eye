.class public final Lpb/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpb/m$a;
    }
.end annotation


# instance fields
.field private final a:Lpb/m$a;

.field private b:I

.field private final c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lpb/m$a;)V
    .locals 1

    const-string/jumbo v0, "onMqttResponseListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/m;->a:Lpb/m$a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lpb/m;->c:Ljava/util/Map;

    return-void
.end method

.method private final a(Lnb/f;)Z
    .locals 2

    invoke-virtual {p1}, Lnb/f;->a()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lnb/f;->a()Ljava/lang/Integer;

    move-result-object p1

    iget v0, p0, Lpb/m;->b:I

    add-int/2addr v0, v1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    :goto_1
    return v1
.end method

.method private final b()V
    .locals 2

    :cond_0
    iget-object v0, p0, Lpb/m;->c:Ljava/util/Map;

    iget v1, p0, Lpb/m;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/f;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lpb/m;->c(Lnb/f;)V

    :cond_1
    if-nez v0, :cond_0

    return-void
.end method

.method private final c(Lnb/f;)V
    .locals 1

    invoke-virtual {p1}, Lnb/f;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, p0, Lpb/m;->b:I

    :cond_0
    iget-object v0, p0, Lpb/m;->a:Lpb/m$a;

    invoke-interface {v0, p1}, Lpb/m$a;->a(Lnb/f;)V

    return-void
.end method

.method private final e(Lnb/f;)V
    .locals 2

    invoke-virtual {p1}, Lnb/f;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpb/m;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lnb/f;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/String;[B)V
    .locals 3

    const-string/jumbo v0, "topic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v0, p2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object p2, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onMessageArrived topic: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " data: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p2, p1, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    sget-object p1, Lub/c;->a:Lub/c;

    sget-object p2, Lnb/g;->c:Lnb/g;

    invoke-virtual {p1}, Lub/c;->d()Laj/b;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/f;

    invoke-direct {p0, p1}, Lpb/m;->a(Lnb/f;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lpb/m;->c(Lnb/f;)V

    invoke-direct {p0}, Lpb/m;->b()V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lpb/m;->e(Lnb/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    sget-object p2, LSj/a;->a:LSj/a$b;

    const-string/jumbo v0, "Uh oh!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, p1, v0, v1}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
