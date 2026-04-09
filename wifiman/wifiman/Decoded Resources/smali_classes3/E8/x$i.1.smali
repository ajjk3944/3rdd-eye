.class final LE8/x$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/x;->c1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/x$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/x$i;

    invoke-direct {v0}, LE8/x$i;-><init>()V

    sput-object v0, LE8/x$i;->a:LE8/x$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->END:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {p0, p1}, LE8/x$i;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Z

    move-result p1

    return p1
.end method
