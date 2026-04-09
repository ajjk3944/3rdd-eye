.class public final Lokhttp3/internal/platform/Platform$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/platform/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\t\u0010\u0006J!\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001fR\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lokhttp3/internal/platform/Platform$Companion;",
        "",
        "<init>",
        "()V",
        "Lokhttp3/internal/platform/Platform;",
        "f",
        "()Lokhttp3/internal/platform/Platform;",
        "d",
        "e",
        "g",
        "",
        "Lokhttp3/Protocol;",
        "protocols",
        "",
        "b",
        "(Ljava/util/List;)Ljava/util/List;",
        "",
        "c",
        "(Ljava/util/List;)[B",
        "",
        "j",
        "()Z",
        "isConscryptPreferred",
        "k",
        "isOpenJSSEPreferred",
        "i",
        "isBouncyCastlePreferred",
        "h",
        "isAndroid",
        "",
        "INFO",
        "I",
        "WARN",
        "Ljava/util/logging/Logger;",
        "kotlin.jvm.PlatformType",
        "logger",
        "Ljava/util/logging/Logger;",
        "platform",
        "Lokhttp3/internal/platform/Platform;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
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
    invoke-direct {p0}, Lokhttp3/internal/platform/Platform$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lokhttp3/internal/platform/Platform$Companion;)Lokhttp3/internal/platform/Platform;
    .locals 0

    invoke-direct {p0}, Lokhttp3/internal/platform/Platform$Companion;->f()Lokhttp3/internal/platform/Platform;

    move-result-object p0

    return-object p0
.end method

.method private final d()Lokhttp3/internal/platform/Platform;
    .locals 1

    sget-object v0, Lokhttp3/internal/platform/android/AndroidLog;->a:Lokhttp3/internal/platform/android/AndroidLog;

    invoke-virtual {v0}, Lokhttp3/internal/platform/android/AndroidLog;->b()V

    sget-object v0, Lokhttp3/internal/platform/Android10Platform;->e:Lokhttp3/internal/platform/Android10Platform$Companion;

    invoke-virtual {v0}, Lokhttp3/internal/platform/Android10Platform$Companion;->a()Lokhttp3/internal/platform/Platform;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lokhttp3/internal/platform/AndroidPlatform;->f:Lokhttp3/internal/platform/AndroidPlatform$Companion;

    invoke-virtual {v0}, Lokhttp3/internal/platform/AndroidPlatform$Companion;->a()Lokhttp3/internal/platform/Platform;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method private final e()Lokhttp3/internal/platform/Platform;
    .locals 1

    invoke-direct {p0}, Lokhttp3/internal/platform/Platform$Companion;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lokhttp3/internal/platform/ConscryptPlatform;->e:Lokhttp3/internal/platform/ConscryptPlatform$Companion;

    invoke-virtual {v0}, Lokhttp3/internal/platform/ConscryptPlatform$Companion;->b()Lokhttp3/internal/platform/ConscryptPlatform;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lokhttp3/internal/platform/Platform$Companion;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lokhttp3/internal/platform/BouncyCastlePlatform;->e:Lokhttp3/internal/platform/BouncyCastlePlatform$Companion;

    invoke-virtual {v0}, Lokhttp3/internal/platform/BouncyCastlePlatform$Companion;->a()Lokhttp3/internal/platform/BouncyCastlePlatform;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-direct {p0}, Lokhttp3/internal/platform/Platform$Companion;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lokhttp3/internal/platform/OpenJSSEPlatform;->e:Lokhttp3/internal/platform/OpenJSSEPlatform$Companion;

    invoke-virtual {v0}, Lokhttp3/internal/platform/OpenJSSEPlatform$Companion;->a()Lokhttp3/internal/platform/OpenJSSEPlatform;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Lokhttp3/internal/platform/Jdk9Platform;->d:Lokhttp3/internal/platform/Jdk9Platform$Companion;

    invoke-virtual {v0}, Lokhttp3/internal/platform/Jdk9Platform$Companion;->a()Lokhttp3/internal/platform/Jdk9Platform;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    sget-object v0, Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;->i:Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;

    invoke-virtual {v0}, Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;->a()Lokhttp3/internal/platform/Platform;

    move-result-object v0

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    new-instance v0, Lokhttp3/internal/platform/Platform;

    invoke-direct {v0}, Lokhttp3/internal/platform/Platform;-><init>()V

    return-object v0
.end method

.method private final f()Lokhttp3/internal/platform/Platform;
    .locals 1

    invoke-virtual {p0}, Lokhttp3/internal/platform/Platform$Companion;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lokhttp3/internal/platform/Platform$Companion;->d()Lokhttp3/internal/platform/Platform;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lokhttp3/internal/platform/Platform$Companion;->e()Lokhttp3/internal/platform/Platform;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private final i()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BC"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final j()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Conscrypt"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final k()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OpenJSSE"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 4

    const-string v0, "protocols"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lokhttp3/Protocol;

    sget-object v3, Lokhttp3/Protocol;->HTTP_1_0:Lokhttp3/Protocol;

    if-eq v2, v3, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/Protocol;

    invoke-virtual {v1}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public final c(Ljava/util/List;)[B
    .locals 3

    const-string v0, "protocols"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    invoke-virtual {p0, p1}, Lokhttp3/internal/platform/Platform$Companion;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Lej/e;->L0(I)Lej/e;

    invoke-virtual {v0, v1}, Lej/e;->S0(Ljava/lang/String;)Lej/e;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lej/e;->r()[B

    move-result-object p1

    return-object p1
.end method

.method public final g()Lokhttp3/internal/platform/Platform;
    .locals 1

    invoke-static {}, Lokhttp3/internal/platform/Platform;->a()Lokhttp3/internal/platform/Platform;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 2

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Dalvik"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
