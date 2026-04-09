.class final LM8/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/d$e;

    invoke-direct {v0}, LM8/d$e;-><init>()V

    sput-object v0, LM8/d$e;->a:LM8/d$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/ui/wifi/channel/b;)LS8/e;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/channel/b;->a()LS8/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/wifi/channel/b;

    invoke-virtual {p0, p1}, LM8/d$e;->a(Lcom/ui/wifiman/ui/wifi/channel/b;)LS8/e;

    move-result-object p1

    return-object p1
.end method
