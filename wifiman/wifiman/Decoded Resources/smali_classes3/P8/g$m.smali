.class final LP8/g$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/g;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lcom/ui/wifiman/model/wmw/d;Lcom/ui/wifiman/model/wmw/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/g$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/g$m;

    invoke-direct {v0}, LP8/g$m;-><init>()V

    sput-object v0, LP8/g$m;->a:LP8/g$m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    check-cast p2, Lcom/ui/wifiman/model/wmw/b$c;

    check-cast p3, Ll9/a;

    check-cast p4, Ljava/lang/Boolean;

    check-cast p5, LP8/f$a;

    check-cast p6, Lcom/ui/wifiman/model/wmw/g$c;

    check-cast p7, Lcom/ui/wifiman/model/wmw/g$a;

    check-cast p8, Ll9/a;

    invoke-virtual/range {p0 .. p8}, LP8/g$m;->b(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;Lcom/ui/wifiman/model/wmw/b$c;Ll9/a;Ljava/lang/Boolean;LP8/f$a;Lcom/ui/wifiman/model/wmw/g$c;Lcom/ui/wifiman/model/wmw/g$a;Ll9/a;)LIf/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;Lcom/ui/wifiman/model/wmw/b$c;Ll9/a;Ljava/lang/Boolean;LP8/f$a;Lcom/ui/wifiman/model/wmw/g$c;Lcom/ui/wifiman/model/wmw/g$a;Ll9/a;)LIf/a;
    .locals 2

    const-string/jumbo v0, "connectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "adoptionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "anyDiscoveredDevices"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "screen"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "fwUpgradeState"

    invoke-static {p6, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "fwUpgradeAvailability"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ui/wifiman/model/wmw/b$c$c;

    invoke-virtual {p8}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p8

    check-cast p8, Lcom/ui/wifiman/model/wmw/g$c$b$b;

    instance-of v0, p6, Lcom/ui/wifiman/model/wmw/g$c$b;

    if-eqz v0, :cond_0

    sget-object p1, LIf/a;->FW_UPDATE_PROGRESS:LIf/a;

    goto/16 :goto_1

    :cond_0
    instance-of p6, p6, Lcom/ui/wifiman/model/wmw/g$c$a;

    if-eqz p6, :cond_d

    instance-of p6, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-eqz p6, :cond_1

    sget-object p1, LIf/a;->REQUIREMENTS_NOT_MET:LIf/a;

    goto :goto_1

    :cond_1
    instance-of p6, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-nez p6, :cond_a

    instance-of p6, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c;

    if-nez p6, :cond_a

    instance-of p6, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-eqz p6, :cond_2

    goto :goto_0

    :cond_2
    instance-of p3, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-eqz p3, :cond_3

    sget-object p1, LIf/a;->CONNECTING:LIf/a;

    goto :goto_1

    :cond_3
    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz p1, :cond_9

    instance-of p1, p2, Lcom/ui/wifiman/model/wmw/b$c$b;

    if-eqz p1, :cond_4

    sget-object p1, LIf/a;->CONNECTING:LIf/a;

    goto :goto_1

    :cond_4
    instance-of p1, p2, Lcom/ui/wifiman/model/wmw/b$c$a;

    if-eqz p1, :cond_5

    sget-object p1, LIf/a;->CONNECTING:LIf/a;

    goto :goto_1

    :cond_5
    if-eqz p8, :cond_6

    sget-object p1, LIf/a;->FW_UPDATE:LIf/a;

    goto :goto_1

    :cond_6
    sget-object p1, LP8/f$a;->FW_UPDATE:LP8/f$a;

    if-ne p5, p1, :cond_7

    instance-of p1, p7, Lcom/ui/wifiman/model/wmw/g$a$a;

    if-eqz p1, :cond_7

    sget-object p1, LIf/a;->FW_UPDATE:LIf/a;

    goto :goto_1

    :cond_7
    sget-object p1, LP8/f$a;->COMPLIANCE:LP8/f$a;

    if-ne p5, p1, :cond_8

    sget-object p1, LIf/a;->COMPLIANCE:LIf/a;

    goto :goto_1

    :cond_8
    sget-object p1, LIf/a;->CONNECTED:LIf/a;

    goto :goto_1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    :goto_0
    instance-of p1, p3, Lcom/ui/wifiman/model/wmw/b$c$c$b;

    if-eqz p1, :cond_b

    sget-object p1, LIf/a;->ADOPTION_FAILED:LIf/a;

    goto :goto_1

    :cond_b
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object p1, LIf/a;->ADOPTION_READY:LIf/a;

    goto :goto_1

    :cond_c
    sget-object p1, LIf/a;->DISCOVERING:LIf/a;

    :goto_1
    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
