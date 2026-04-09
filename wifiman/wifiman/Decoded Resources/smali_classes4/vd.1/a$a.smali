.class public final Lvd/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

.field private final b:J


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;J)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvd/a$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    .line 3
    iput-wide p2, p0, Lvd/a$a;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x7d0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lvd/a$a;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;J)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/speedtest/Speedtest$d;
    .locals 1

    iget-object v0, p0, Lvd/a$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lvd/a$a;->b:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvd/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvd/a$a;

    iget-object v1, p0, Lvd/a$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    iget-object v3, p1, Lvd/a$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lvd/a$a;->b:J

    iget-wide v5, p1, Lvd/a$a;->b:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lvd/a$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lvd/a$a;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lvd/a$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    iget-wide v1, p0, Lvd/a$a;->b:J

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Params(state="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeoutMillis="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
