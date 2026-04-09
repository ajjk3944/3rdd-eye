.class final Lcom/ui/wifiman/model/wmw/h$r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h$r;->b(LMf/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/h$r$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$r$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/h$r$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$r$a;->a:Lcom/ui/wifiman/model/wmw/h$r$a;

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

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;->b()Lcom/ui/wmw/g;

    move-result-object p1

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_1
    new-instance p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$NoDeviceAdopted;

    const-string v0, "No device adopted while doing FW upgrade"

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$NoDeviceAdopted;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$r$a;->a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
