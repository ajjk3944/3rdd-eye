.class final Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a$a;
.super Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 2

    const-string v0, "speed-test:update"

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getJsonAdapter(LY6/r;)LY6/h;
    .locals 2

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lth/r;->c:Lth/r$a;

    const-class v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v1

    invoke-virtual {v0, v1}, Lth/r$a;->d(Lth/p;)Lth/r;

    move-result-object v0

    const-class v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Data;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/O;->m(Ljava/lang/Class;Lth/r;)Lth/p;

    move-result-object v0

    invoke-static {p1, v0}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object p1

    return-object p1
.end method
