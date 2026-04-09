.class public final Lcom/ui/wifiman/ui/signal/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/signal/b;

.field public static b:Lmh/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/signal/b;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/signal/b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/signal/b;->a:Lcom/ui/wifiman/ui/signal/b;

    const/4 v0, 0x0

    sget-object v1, Lcom/ui/wifiman/ui/signal/b$a;->a:Lcom/ui/wifiman/ui/signal/b$a;

    const v2, -0x522551f9

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/signal/b;->b:Lmh/r;

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

    sget-object v0, Lcom/ui/wifiman/ui/signal/b;->b:Lmh/r;

    return-object v0
.end method
