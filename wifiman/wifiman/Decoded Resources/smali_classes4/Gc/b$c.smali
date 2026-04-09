.class final LGc/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGc/b;-><init>(Led/a;Lcom/ui/wifiman/model/vendor/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LGc/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LGc/b$c;

    invoke-direct {v0}, LGc/b$c;-><init>()V

    sput-object v0, LGc/b$c;->a:LGc/b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Ljava/util/Set;
    .locals 10

    const-string v0, "Failed to parse IP "

    const-string v1, "<destruct>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "component1(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Set;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    const-string v2, "component2(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/vendor/d$a;

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Led/a$a;

    const/4 v4, 0x4

    const/4 v5, 0x0

    :try_start_0
    new-instance v6, LGc/b$a;

    new-instance v7, Linet/ipaddr/n;

    invoke-virtual {v3}, Led/a$a;->a()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Linet/ipaddr/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Linet/ipaddr/n;->p()Linet/ipaddr/g;

    move-result-object v7

    const-string v8, "toAddress(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Led/a$a;->b()Lh9/a;

    move-result-object v8

    invoke-virtual {v3}, Led/a$a;->b()Lh9/a;

    move-result-object v9

    invoke-interface {p1, v9}, Lcom/ui/wifiman/model/vendor/d$a;->a(Lh9/a;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v9

    invoke-direct {v6, v7, v8, v9}, LGc/b$a;-><init>(Linet/ipaddr/g;Lh9/a;Lcom/ui/wifiman/model/vendor/d;)V

    invoke-interface {v2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Linet/ipaddr/AddressStringException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    goto :goto_1

    :catch_1
    move-exception v6

    goto :goto_2

    :goto_1
    invoke-virtual {v3}, Led/a$a;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6, v5, v4, v5}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :goto_2
    invoke-virtual {v3}, Led/a$a;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6, v5, v4, v5}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LGc/b$c;->a(LYg/s;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
