.class final LTd/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTd/d;-><init>(Ljava/lang/String;LTd/a$a;LUd/a;Lxa/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LTd/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTd/d$c;

    invoke-direct {v0}, LTd/d$c;-><init>()V

    sput-object v0, LTd/d$c;->a:LTd/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwa/a;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;)Ljava/util/List;
    .locals 10

    const-string v0, "catalogBrowser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiDevices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;->a()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;->c()Lh9/a;

    move-result-object v4

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;->b()Linet/ipaddr/g;

    move-result-object v5

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;->f()LVd/a$a;

    move-result-object v9

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p1, v1}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object v1

    check-cast v1, Lxa/a$d;

    :goto_1
    move-object v8, v1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    new-instance v1, LVd/a;

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, LVd/a;-><init>(Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;LVd/a$a;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwa/a;

    check-cast p2, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;

    invoke-virtual {p0, p1, p2}, LTd/d$c;->a(Lwa/a;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
