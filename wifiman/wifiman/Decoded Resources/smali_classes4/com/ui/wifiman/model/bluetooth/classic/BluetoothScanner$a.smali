.class public final Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lh9/a;

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:LU7/a;

.field private final e:LCc/b;

.field private final f:Lcom/ui/wifiman/model/vendor/d;

.field private final g:Ljava/util/Set;

.field private final h:J


# direct methods
.method public constructor <init>(Lh9/a;Ljava/lang/String;ZLU7/a;LCc/b;Lcom/ui/wifiman/model/vendor/d;Ljava/util/Set;J)V
    .locals 1

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedTypes"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->a:Lh9/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->c:Z

    iput-object p4, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->d:LU7/a;

    iput-object p5, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->e:LCc/b;

    iput-object p6, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->f:Lcom/ui/wifiman/model/vendor/d;

    iput-object p7, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->g:Ljava/util/Set;

    iput-wide p8, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->h:J

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->c:Z

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->h:J

    return-wide v0
.end method

.method public final c()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->a:Lh9/a;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()LU7/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->d:LU7/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->a:Lh9/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->a:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->c:Z

    iget-boolean v3, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->d:LU7/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->d:LU7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->e:LCc/b;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->e:LCc/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->f:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->f:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->g:Ljava/util/Set;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->g:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->h:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->h:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->g:Ljava/util/Set;

    return-object v0
.end method

.method public final g()LCc/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->e:LCc/b;

    return-object v0
.end method

.method public final h()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->f:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->a:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->a:Lh9/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->c:Z

    iget-object v3, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->d:LU7/a;

    iget-object v4, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->e:LCc/b;

    iget-object v5, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->f:Lcom/ui/wifiman/model/vendor/d;

    iget-object v6, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->g:Ljava/util/Set;

    iget-wide v7, p0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->h:J

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Result(mac="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", connected="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", signalStrength="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vendor="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", supportedTypes="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastSeenAt="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
