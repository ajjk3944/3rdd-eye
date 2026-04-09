.class public final Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;
.super Lcom/ui/wifiman/model/speedtest/Speedtest$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/Speedtest$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/util/ArrayList;

.field private final c:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;


# direct methods
.method public constructor <init>(JLjava/util/ArrayList;)V
    .locals 1

    const-string v0, "measurementHistory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-wide p1, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->a:J

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b:Ljava/util/ArrayList;

    sget-object p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->FINISHED:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->a:J

    return-wide v0
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    iget-wide v3, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->a:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b:Ljava/util/ArrayList;

    iget-object p1, p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b:Ljava/util/ArrayList;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->a:J

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b:Ljava/util/ArrayList;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Finished(bitsPerSecond="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", measurementHistory="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
