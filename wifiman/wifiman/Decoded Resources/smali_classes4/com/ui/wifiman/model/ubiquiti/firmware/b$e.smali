.class final Lcom/ui/wifiman/model/ubiquiti/firmware/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/firmware/b;->a(Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/firmware/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/firmware/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b$e;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;)Lgg/D;
    .locals 3

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;->a()Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/b$e;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;

    invoke-static {v0, v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->f(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;)Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$InvalidResponse;

    const-string v0, "Missing firmwares in response"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b$e;->a(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
