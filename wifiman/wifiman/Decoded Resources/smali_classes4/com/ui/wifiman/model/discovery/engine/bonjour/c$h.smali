.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/c$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$h;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/ui/wifiman/model/discovery/engine/bonjour/c$h;Ljava/lang/String;)LCc/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$h;->b(Ljava/lang/String;)LCc/b;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/lang/String;)LCc/b;
    .locals 4

    const-string v0, "Mac14,2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "Mac14,7"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "Mac13,1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, LCc/b$b$a;->c:LCc/b$b$a;

    goto :goto_2

    :cond_1
    const-string v0, "Macmini"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "iMac"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "MacPro"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "MacBook"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, LCc/b$b$b;->c:LCc/b$b$b;

    goto :goto_2

    :cond_3
    const-string v0, "MacBookPro"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, LCc/b$b$b;->c:LCc/b$b$b;

    goto :goto_2

    :cond_4
    move-object p1, v3

    goto :goto_2

    :cond_5
    :goto_0
    sget-object p1, LCc/b$b$a;->c:LCc/b$b$a;

    goto :goto_2

    :cond_6
    :goto_1
    sget-object p1, LCc/b$b$b;->c:LCc/b$b$b;

    :goto_2
    return-object p1
.end method
