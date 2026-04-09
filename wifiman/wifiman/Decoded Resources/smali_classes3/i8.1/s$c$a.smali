.class public final Li8/s$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/s$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, Li8/s$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;)Li8/s$c;
    .locals 1

    const-string/jumbo v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Li8/s$b;->HOME_SPEED:Li8/s$b;

    invoke-virtual {v0}, Li8/s$b;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Li8/s$c;

    sget-object v0, LQe/c$a;->SPEED:LQe/c$a;

    invoke-direct {p1, v0}, Li8/s$c;-><init>(LQe/c$a;)V

    goto :goto_0

    :cond_0
    sget-object v0, Li8/s$b;->HOME_SIGNAL:Li8/s$b;

    invoke-virtual {v0}, Li8/s$b;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Li8/s$c;

    sget-object v0, LQe/c$a;->SIGNAL:LQe/c$a;

    invoke-direct {p1, v0}, Li8/s$c;-><init>(LQe/c$a;)V

    goto :goto_0

    :cond_1
    sget-object v0, Li8/s$b;->HOME_SCAN:Li8/s$b;

    invoke-virtual {v0}, Li8/s$b;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Li8/s$c;

    sget-object v0, LQe/c$a;->SCAN:LQe/c$a;

    invoke-direct {p1, v0}, Li8/s$c;-><init>(LQe/c$a;)V

    goto :goto_0

    :cond_2
    sget-object v0, Li8/s$b;->HOME_DISCOVERY:Li8/s$b;

    invoke-virtual {v0}, Li8/s$b;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p1, Li8/s$c;

    sget-object v0, LQe/c$a;->DISCOVERY:LQe/c$a;

    invoke-direct {p1, v0}, Li8/s$c;-><init>(LQe/c$a;)V

    goto :goto_0

    :cond_3
    sget-object v0, Li8/s$b;->HOME_TELEPORT:Li8/s$b;

    invoke-virtual {v0}, Li8/s$b;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Li8/s$c;

    sget-object v0, LQe/c$a;->TELEPORT:LQe/c$a;

    invoke-direct {p1, v0}, Li8/s$c;-><init>(LQe/c$a;)V

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
