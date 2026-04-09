.class public final Lcom/ui/wifiman/model/bluetooth/le/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lh9/a;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/ui/wifiman/model/vendor/d;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:J

.field private final h:Ljava/util/Map;

.field private final i:La8/b;


# direct methods
.method public constructor <init>(Lh9/a;Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V
    .locals 1

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristics"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->a:Lh9/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->d:Lcom/ui/wifiman/model/vendor/d;

    iput-object p5, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->f:Ljava/lang/String;

    iput-wide p7, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->g:J

    iput-object p9, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->h:Ljava/util/Map;

    sget-object p2, La8/b;->c:La8/b$a;

    invoke-virtual {p2, p1}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->i:La8/b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final c()La8/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->i:La8/b;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->a:Lh9/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;->a:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->d:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;->d:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->g:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;->g:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->h:Ljava/util/Map;

    iget-object p1, p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;->h:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->d:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->a:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->a:Lh9/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->d:Lcom/ui/wifiman/model/vendor/d;

    iget-object v4, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->f:Ljava/lang/String;

    iget-wide v6, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->g:J

    iget-object v8, p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;->h:Ljava/util/Map;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Device(mac="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", model="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", vendor="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", batteryLevel="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", firmwareVersion="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", characteristics="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
