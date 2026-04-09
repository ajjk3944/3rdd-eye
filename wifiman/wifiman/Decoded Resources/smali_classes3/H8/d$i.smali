.class final LH8/d$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/d$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/d$i;

    invoke-direct {v0}, LH8/d$i;-><init>()V

    sput-object v0, LH8/d$i;->a:LH8/d$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)LH8/d$c;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v0, :cond_0

    sget-object p1, LH8/d$c;->CONNECTED:LH8/d$c;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    if-eqz v0, :cond_1

    sget-object p1, LH8/d$c;->CONNECTING:LH8/d$c;

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz p1, :cond_2

    sget-object p1, LH8/d$c;->DISCONNECTED:LH8/d$c;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1}, LH8/d$i;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)LH8/d$c;

    move-result-object p1

    return-object p1
.end method
