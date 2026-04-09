.class final Lcom/ui/wifiman/model/bluetooth/le/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/c;->a(Lh9/a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/c;

.field final synthetic b:Lh9/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/c;Lh9/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c$e;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/c$e;->b:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/bluetooth/le/a$a;)V
    .locals 6

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/c$e;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    invoke-static {v0}, Lcom/ui/wifiman/model/bluetooth/le/c;->d(Lcom/ui/wifiman/model/bluetooth/le/c;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/c$e;->b:Lh9/a;

    iget-object v2, p0, Lcom/ui/wifiman/model/bluetooth/le/c$e;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    monitor-enter v0

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BleCommonCharacteristic - Storing result for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v5}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {v2}, Lcom/ui/wifiman/model/bluetooth/le/c;->d(Lcom/ui/wifiman/model/bluetooth/le/c;)Ljava/util/HashMap;

    move-result-object v3

    invoke-interface {v3, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lcom/ui/wifiman/model/bluetooth/le/c;->c(Lcom/ui/wifiman/model/bluetooth/le/c;)LFg/a;

    move-result-object p1

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v1}, LFg/a;->h(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/c$e;->a(Lcom/ui/wifiman/model/bluetooth/le/a$a;)V

    return-void
.end method
