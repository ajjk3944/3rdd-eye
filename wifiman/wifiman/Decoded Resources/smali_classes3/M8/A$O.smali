.class final LM8/A$O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/A$O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/A$O;

    invoke-direct {v0}, LM8/A$O;-><init>()V

    sput-object v0, LM8/A$O;->a:LM8/A$O;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LDj/a;
    .locals 3

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    const-string/jumbo v1, "just(...)"

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-eqz v0, :cond_1

    sget-object p1, LAf/H$b;->a:LAf/H$b;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;->b()Lcom/ui/wmw/g;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/g;->a()Lgg/i;

    move-result-object p1

    sget-object v0, LM8/A$O$a;->a:LM8/A$O$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, LAf/H$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LAf/H$a;-><init>(Ljava/lang/Float;Z)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object p1, LAf/H$c;->a:LAf/H$c;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p0, p1}, LM8/A$O;->a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
