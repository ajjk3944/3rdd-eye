.class final Lcom/ui/wifiman/model/wifi/scan/android/a$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/android/a;-><init>(Landroid/net/wifi/WifiManager;Ltc/a;Lcom/ui/wifiman/model/android/permissions/d;Lfe/n;Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wifi/scan/android/a$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/android/a$m;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$m;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wifi/scan/android/a$m;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ConcurrentHashMap;LYg/s;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 6

    const-string v0, "accumulator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wifi/scan/android/a$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$b;->b()Lme/k;

    move-result-object v3

    invoke-virtual {v3}, Lme/k;->b()Lh9/a;

    move-result-object v3

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wifi/scan/android/a$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$b;->a()J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-gez v1, :cond_1

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$b;->b()Lme/k;

    move-result-object v1

    invoke-virtual {v1}, Lme/k;->i()Lke/c;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$b;->b()Lme/k;

    move-result-object v0

    invoke-virtual {v0}, Lme/k;->b()Lh9/a;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Removed "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "] because it reached cache timeout"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    check-cast p2, LYg/s;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/wifi/scan/android/a$m;->a(Ljava/util/concurrent/ConcurrentHashMap;LYg/s;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    return-object p1
.end method
