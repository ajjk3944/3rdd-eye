.class final Lcom/ui/wifiman/model/bluetooth/le/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/c;-><init>(Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader;Lcom/ui/wifiman/model/vendor/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c$a;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/util/Map$Entry;)Lcom/ui/wifiman/model/bluetooth/le/a$a;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/c$a;->c(Ljava/util/Map$Entry;)Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/util/Map$Entry;)Lcom/ui/wifiman/model/bluetooth/le/a$a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/bluetooth/le/a$a;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/c$a;->b(LYg/J;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final b(LYg/J;)Ljava/util/Set;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c$a;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    invoke-static {p1}, Lcom/ui/wifiman/model/bluetooth/le/c;->d(Lcom/ui/wifiman/model/bluetooth/le/c;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/c$a;->a:Lcom/ui/wifiman/model/bluetooth/le/c;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, Lcom/ui/wifiman/model/bluetooth/le/c;->d(Lcom/ui/wifiman/model/bluetooth/le/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, LZg/U;->y(Ljava/util/Map;)Lzi/j;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/b;

    invoke-direct {v1}, Lcom/ui/wifiman/model/bluetooth/le/b;-><init>()V

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method
