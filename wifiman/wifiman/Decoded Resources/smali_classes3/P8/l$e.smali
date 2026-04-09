.class final LP8/l$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/l;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/l$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/l$e;

    invoke-direct {v0}, LP8/l$e;-><init>()V

    sput-object v0, LP8/l$e;->a:LP8/l$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)Lgg/r;
    .locals 1

    const-string/jumbo v0, "wizardState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$d;

    if-eqz v0, :cond_0

    sget-object p1, LP8/l$a;->LOCATION_DISABLED:LP8/l$a;

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$b;

    if-eqz v0, :cond_1

    sget-object p1, LP8/l$a;->BLUETOOTH_ADAPTER_UNAVAILABLE:LP8/l$a;

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$a;

    if-eqz v0, :cond_2

    sget-object p1, LP8/l$a;->BLUETOOTH_ADAPTER_DISABLED:LP8/l$a;

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;

    if-eqz v0, :cond_3

    sget-object p1, LP8/l$a;->PERMISSIONS:LP8/l$a;

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;

    if-nez v0, :cond_5

    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p0, p1}, LP8/l$e;->a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
