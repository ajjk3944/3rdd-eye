.class final Lcom/ui/wifiman/model/network/hosts/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a;-><init>(LRb/a;Ldd/a;LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/network/hosts/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$f;

    invoke-direct {v0}, Lcom/ui/wifiman/model/network/hosts/a$f;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a$f;->a:Lcom/ui/wifiman/model/network/hosts/a$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ConcurrentHashMap;Ldd/i;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    const-string v0, "stats"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ldd/i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    check-cast p2, Ldd/i;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/network/hosts/a$f;->a(Ljava/util/concurrent/ConcurrentHashMap;Ldd/i;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    return-object p1
.end method
