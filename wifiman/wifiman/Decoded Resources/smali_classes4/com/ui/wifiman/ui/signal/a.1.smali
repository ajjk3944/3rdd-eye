.class public final Lcom/ui/wifiman/ui/signal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/signal/a;

.field public static b:Lmh/r;

.field public static c:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/signal/a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/signal/a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/signal/a;->a:Lcom/ui/wifiman/ui/signal/a;

    sget-object v0, Lcom/ui/wifiman/ui/signal/a$a;->a:Lcom/ui/wifiman/ui/signal/a$a;

    const v1, 0x6b6f8b86

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/signal/a;->b:Lmh/r;

    const v0, 0x5c70c56a

    sget-object v1, Lcom/ui/wifiman/ui/signal/a$b;->a:Lcom/ui/wifiman/ui/signal/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/signal/a;->c:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/r;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/signal/a;->b:Lmh/r;

    return-object v0
.end method
