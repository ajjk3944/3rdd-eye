.class final Lrd/d$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/d;->f()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrd/d$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrd/d$g;

    invoke-direct {v0}, Lrd/d$g;-><init>()V

    sput-object v0, Lrd/d$g;->a:Lrd/d$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ConcurrentHashMap;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 3

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    instance-of v1, p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    if-eqz v1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p2, p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$b;

    if-eqz p2, :cond_1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    check-cast p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;

    invoke-virtual {p0, p1, p2}, Lrd/d$g;->a(Ljava/util/concurrent/ConcurrentHashMap;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    return-object p1
.end method
