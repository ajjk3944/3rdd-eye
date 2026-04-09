.class final LTd/d$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTd/d;->c(Ljava/lang/String;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LTd/d$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTd/d$j;

    invoke-direct {v0}, LTd/d$j;-><init>()V

    sput-object v0, LTd/d$j;->a:LTd/d$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Response;)LVd/d;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVd/d;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Response;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Response;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {v0, v1, p1}, LVd/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;

    const-string v0, "no token in teleport auth request"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;

    const-string v0, "no secret in teleport auth request"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Response;

    invoke-virtual {p0, p1}, LTd/d$j;->a(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Response;)LVd/d;

    move-result-object p1

    return-object p1
.end method
