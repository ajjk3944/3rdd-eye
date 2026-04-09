.class public final Ltd/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd/a;->b(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(Ljava/util/LinkedList;)V
    .locals 0

    iput-object p1, p0, Ltd/a$b;->a:Ljava/util/LinkedList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 8

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/16 v2, 0x32

    invoke-static {v1, v2}, Lsh/m;->s(II)Lsh/i;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    move-result v2

    iget-object v5, p0, Ltd/a$b;->a:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-ge v5, v6, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Ltd/a$b;->a:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v4

    int-to-double v4, v4

    const-wide/high16 v6, 0x4049000000000000L    # 50.0

    div-double/2addr v4, v6

    int-to-double v6, v2

    mul-double/2addr v4, v6

    invoke-static {v4, v5}, Loh/b;->d(D)I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v3

    :goto_1
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    iget-object v5, p0, Ltd/a$b;->a:Ljava/util/LinkedList;

    invoke-static {v5}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v3

    :cond_2
    invoke-direct {v2, v3, v4, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;-><init>(JLjava/util/ArrayList;)V

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
