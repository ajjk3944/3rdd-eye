.class public final Lcom/ui/wifiman/ui/wifi/channel/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/wifi/channel/a;

.field public static b:Lmh/p;

.field public static c:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/wifi/channel/a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/wifi/channel/a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/wifi/channel/a;->a:Lcom/ui/wifiman/ui/wifi/channel/a;

    sget-object v0, Lcom/ui/wifiman/ui/wifi/channel/a$a;->a:Lcom/ui/wifiman/ui/wifi/channel/a$a;

    const v1, -0x2de209a1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/wifi/channel/a;->b:Lmh/p;

    const v0, 0x7d3a0c32

    sget-object v1, Lcom/ui/wifiman/ui/wifi/channel/a$b;->a:Lcom/ui/wifiman/ui/wifi/channel/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/wifi/channel/a;->c:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/wifi/channel/a;->b:Lmh/p;

    return-object v0
.end method
