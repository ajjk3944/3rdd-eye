.class final Lcom/google/gson/internal/sql/b;
.super Lcom/google/gson/p;
.source "SourceFile"


# static fields
.field static final b:Lcom/google/gson/q;


# instance fields
.field private final a:Ljava/text/DateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/gson/internal/sql/b$a;

    invoke-direct {v0}, Lcom/google/gson/internal/sql/b$a;-><init>()V

    sput-object v0, Lcom/google/gson/internal/sql/b;->b:Lcom/google/gson/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    .line 3
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string/jumbo v1, "hh:mm:ss a"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/gson/internal/sql/b;->a:Ljava/text/DateFormat;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/gson/internal/sql/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/gson/internal/sql/b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lw5/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/sql/b;->e(Lw5/a;)Ljava/sql/Time;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lw5/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/sql/Time;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/sql/b;->f(Lw5/c;Ljava/sql/Time;)V

    return-void
.end method

.method public e(Lw5/a;)Ljava/sql/Time;
    .locals 6

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    sget-object v1, Lw5/b;->NULL:Lw5/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lw5/a;->r0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lw5/a;->t0()Ljava/lang/String;

    move-result-object v0

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/google/gson/internal/sql/b;->a:Ljava/text/DateFormat;

    invoke-virtual {v1}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lcom/google/gson/internal/sql/b;->a:Ljava/text/DateFormat;

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    new-instance v3, Ljava/sql/Time;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/sql/Time;-><init>(J)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object p1, p0, Lcom/google/gson/internal/sql/b;->a:Ljava/text/DateFormat;

    invoke-virtual {p1, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v3

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_3
    new-instance v3, Lcom/google/gson/JsonSyntaxException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Failed parsing \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' as SQL Time; at path "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw5/a;->P()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1, v2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_0
    :try_start_4
    iget-object v0, p0, Lcom/google/gson/internal/sql/b;->a:Ljava/text/DateFormat;

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public f(Lw5/c;Ljava/sql/Time;)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lw5/c;->b0()Lw5/c;

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/gson/internal/sql/b;->a:Ljava/text/DateFormat;

    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, p2}, Lw5/c;->x0(Ljava/lang/String;)Lw5/c;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
