.class public final Lcom/ui/sso/auth/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/auth/c;
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
    invoke-direct {p0}, Lcom/ui/sso/auth/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/ui/sso/auth/c;
    .locals 2

    const-string/jumbo v0, "cookieString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LWa/b;->a:LWa/b;

    invoke-virtual {v0, p1}, LWa/b;->a(Ljava/lang/String;)LWa/b$a;

    move-result-object p1

    new-instance v0, Lcom/ui/sso/auth/c;

    invoke-virtual {p1}, LWa/b$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LWa/b$a;->a()Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/auth/c;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method
