.class public final LE8/m;
.super LE8/i;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lgg/i;Ljava/lang/String;Lorg/kodein/di/DI;)V
    .locals 1

    const-string/jumbo v0, "speedtestStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hostIp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "di"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LE8/i;-><init>(Lgg/i;Ljava/lang/String;Lorg/kodein/di/DI;)V

    return-void
.end method
