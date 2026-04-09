.class final Lcom/ui/wifiman/model/bluetooth/le/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/d;->q(Lgg/s;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:Lcom/ui/wifiman/model/bluetooth/le/d;

.field final synthetic d:Lkotlin/jvm/internal/N;

.field final synthetic e:Ljava/util/Set;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lcom/ui/wifiman/model/bluetooth/le/d;Lkotlin/jvm/internal/N;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->b:Lkotlin/jvm/internal/N;

    iput-object p3, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->c:Lcom/ui/wifiman/model/bluetooth/le/d;

    iput-object p4, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->d:Lkotlin/jvm/internal/N;

    iput-object p5, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->e:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/bluetooth/le/d$a;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/d$d;->c(Lcom/ui/wifiman/model/bluetooth/le/d$a;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/model/bluetooth/le/d$a;)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/model/bluetooth/le/d$a;->b()Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/d$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d$d;->b(Lcom/ui/wifiman/model/bluetooth/le/d$c;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/bluetooth/le/d$c;)Ljava/util/Set;
    .locals 12

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/bluetooth/le/d$c$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->a:Lkotlin/jvm/internal/N;

    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/d$c$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/bluetooth/le/d$c$b;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/bluetooth/le/d$c$c;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->b:Lkotlin/jvm/internal/N;

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->c:Lcom/ui/wifiman/model/bluetooth/le/d;

    iget-object v3, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->a:Lkotlin/jvm/internal/N;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Landroid/bluetooth/BluetoothGatt;

    invoke-static {v0, v3}, Lcom/ui/wifiman/model/bluetooth/le/d;->i(Lcom/ui/wifiman/model/bluetooth/le/d;Landroid/bluetooth/BluetoothGatt;)Ljava/util/Queue;

    move-result-object v0

    iput-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->b:Lkotlin/jvm/internal/N;

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v9, Lcom/ui/wifiman/model/bluetooth/le/e;

    invoke-direct {v9}, Lcom/ui/wifiman/model/bluetooth/le/e;-><init>()V

    const/16 v10, 0x1e

    const/4 v11, 0x0

    const-string v4, ", "

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Characteristic read QUEUE initiated "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/bluetooth/le/d$c$a$b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->d:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Lcom/ui/wifiman/model/bluetooth/le/d$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/bluetooth/le/d$a;->b()Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Characteristic read SUCCESS "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->c:Lcom/ui/wifiman/model/bluetooth/le/d;

    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/d$c$a$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/bluetooth/le/d$c$a$b;->a()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->d:Lkotlin/jvm/internal/N;

    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, Lcom/ui/wifiman/model/bluetooth/le/d$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/bluetooth/le/d$a;->b()Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/ui/wifiman/model/bluetooth/le/d;->A(Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/ui/wifiman/model/bluetooth/le/i$a;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->e:Ljava/util/Set;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->d:Lkotlin/jvm/internal/N;

    new-instance v3, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, Lcom/ui/wifiman/model/bluetooth/le/d$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/bluetooth/le/d$a;->b()Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object v1

    invoke-direct {v3, v1, p1}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;-><init>(Lcom/ui/wifiman/model/bluetooth/le/i$a;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string p1, "Failed to read characteristic"

    const/4 v0, 0x6

    invoke-static {p1, v2, v2, v0, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->d:Lkotlin/jvm/internal/N;

    iput-object v2, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no characteristic read requested"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    instance-of p1, p1, Lcom/ui/wifiman/model/bluetooth/le/d$c$a$a;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->d:Lkotlin/jvm/internal/N;

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/d$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/bluetooth/le/d$a;->b()Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FAILED to read characteristic "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->d:Lkotlin/jvm/internal/N;

    iput-object v2, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :goto_1
    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->a:Lkotlin/jvm/internal/N;

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->b:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->d:Lkotlin/jvm/internal/N;

    invoke-static {p1, v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/d;->k(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$d;->e:Ljava/util/Set;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
