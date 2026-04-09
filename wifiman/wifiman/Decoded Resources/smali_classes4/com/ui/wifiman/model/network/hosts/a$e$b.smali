.class final Lcom/ui/wifiman/model/network/hosts/a$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


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

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$e$b;->a:Lcom/ui/wifiman/model/network/hosts/a$b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/network/hosts/a$b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/network/hosts/a$b$b;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/network/hosts/a$b$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/network/hosts/a$b$b;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$e$b;->a:Lcom/ui/wifiman/model/network/hosts/a$b$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/network/hosts/a$b$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/network/hosts/a$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/network/hosts/a$e$b;->a(Lcom/ui/wifiman/model/network/hosts/a$b;)Z

    move-result p1

    return p1
.end method
