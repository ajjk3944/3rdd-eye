.class public LM6/e;
.super LI6/t;
.source "SourceFile"


# instance fields
.field private final e:I

.field private final f:LM6/x;


# direct methods
.method constructor <init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LM6/x;ILM6/x;)V
    .locals 1

    sget-object v0, LH6/a;->o:LH6/a;

    invoke-direct {p0, p2, p1, v0, p3}, LI6/t;-><init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;LH6/a;LM6/x;)V

    iput p4, p0, LM6/e;->e:I

    iput-object p5, p0, LM6/e;->f:LM6/x;

    return-void
.end method

.method private static j(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string p0, "CONNECTION_PRIORITY_HIGH"

    return-object p0

    :cond_0
    const-string p0, "CONNECTION_PRIORITY_LOW_POWER"

    return-object p0

    :cond_1
    const-string p0, "CONNECTION_PRIORITY_BALANCED"

    return-object p0
.end method


# virtual methods
.method protected d(LK6/l0;)Lgg/z;
    .locals 3

    iget-object p1, p0, LM6/e;->f:LM6/x;

    iget-wide v0, p1, LM6/x;->a:J

    iget-object v2, p1, LM6/x;->b:Ljava/util/concurrent/TimeUnit;

    iget-object p1, p1, LM6/x;->c:Lgg/y;

    invoke-static {v0, v1, v2, p1}, Lgg/z;->V(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method protected g(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 1

    iget v0, p0, LM6/e;->e:I

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->requestConnectionPriority(I)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectionPriorityChangeOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LI6/t;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", connectionPriority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM6/e;->e:I

    invoke-static {v1}, LM6/e;->j(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", successTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM6/e;->f:LM6/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
