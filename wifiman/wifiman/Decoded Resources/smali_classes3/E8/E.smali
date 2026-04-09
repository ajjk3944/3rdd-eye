.class public final LE8/E;
.super Lk8/m;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, LE8/D;

    invoke-direct {v0}, LE8/D;-><init>()V

    invoke-direct {p0, v0}, Lk8/m;-><init>(Lmh/p;)V

    return-void
.end method

.method public static synthetic h(Lcom/ui/wifiman/model/speedtest/result/b;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, LE8/E;->i(Lcom/ui/wifiman/model/speedtest/result/b;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final i(Lcom/ui/wifiman/model/speedtest/result/b;Ljava/lang/String;)Z
    .locals 1

    const-string/jumbo v0, "result"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/result/b$d;->h()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    invoke-static {p0, p1, v0}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    :cond_0
    return v0
.end method
