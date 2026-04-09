.class public final Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;
.super Lcom/ui/wifiman/model/speedtest/Speedtest$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/Speedtest$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

.field private final b:J


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;J)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    iput-wide p2, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->b:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->b:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->b:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->b:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    iget-wide v1, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->b:J

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Ongoing(state="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bitsPerSecond="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
