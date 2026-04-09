.class public final Lcom/ui/wifiman/model/bluetooth/le/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/c;->a(Lh9/a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/c;

.field final synthetic b:Lh9/a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/c;Lh9/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c$b;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/c$b;->b:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/c$b;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/bluetooth/le/c;->b()Lgg/i;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/c$b;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    invoke-static {v1}, Lcom/ui/wifiman/model/bluetooth/le/c;->d(Lcom/ui/wifiman/model/bluetooth/le/c;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/bluetooth/le/c$b;->b:Lh9/a;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/bluetooth/le/a$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0

    if-eqz v1, :cond_0

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lgg/o;->a()V

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
