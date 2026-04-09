.class final Lcom/ui/wifiman/model/speedtest/internet/b$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;->p(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/internet/b$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$j;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/internet/b$j;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/b$j;->a:Lcom/ui/wifiman/model/speedtest/internet/b$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$a;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$Error$NoServerAvailable;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p1, v2, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$Error$NoServerAvailable;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$j;->a(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    return-object p1
.end method
