.class public final Lcom/ui/wifiman/ui/speedtest/feedback/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/speedtest/feedback/a;

.field public static b:Lmh/q;

.field public static c:Lmh/q;

.field public static d:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/speedtest/feedback/a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/speedtest/feedback/a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/a;

    sget-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a$a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/a$a;

    const v1, -0x569561f1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a;->b:Lmh/q;

    const v0, -0x65739b8a

    sget-object v1, Lcom/ui/wifiman/ui/speedtest/feedback/a$b;->a:Lcom/ui/wifiman/ui/speedtest/feedback/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a;->c:Lmh/q;

    const v0, -0x6334ce8f

    sget-object v1, Lcom/ui/wifiman/ui/speedtest/feedback/a$c;->a:Lcom/ui/wifiman/ui/speedtest/feedback/a$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a;->d:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/q;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a;->b:Lmh/q;

    return-object v0
.end method

.method public final b()Lmh/q;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a;->c:Lmh/q;

    return-object v0
.end method
