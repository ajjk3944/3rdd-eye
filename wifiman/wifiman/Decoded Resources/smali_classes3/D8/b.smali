.class public abstract LD8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;)Lb8/b;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0.0.0.0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c()Ldd/i;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ldd/i;->d()Lb8/b;

    move-result-object v1

    :cond_1
    :goto_0
    return-object v1
.end method
