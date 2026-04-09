.class final Lcom/ui/wifiman/model/network/hosts/a$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a$e;->a(Lcom/ui/wifiman/model/network/hosts/a$b$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/network/hosts/a$b$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/network/hosts/a$b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$e$c;->a:Lcom/ui/wifiman/model/network/hosts/a$b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldd/i;)Ldd/i;
    .locals 11

    const-string v0, "stats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$e$c;->a:Lcom/ui/wifiman/model/network/hosts/a$b$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/network/hosts/a$b$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gateway"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const-string v2, "gateway"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Ldd/i;->b(Ldd/i;Ljava/lang/String;Linet/ipaddr/g;Ljava/lang/Boolean;Lb8/b;Lb8/b;Lb8/d;Ljava/util/List;ILjava/lang/Object;)Ldd/i;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldd/i;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/network/hosts/a$e$c;->a(Ldd/i;)Ldd/i;

    move-result-object p1

    return-object p1
.end method
