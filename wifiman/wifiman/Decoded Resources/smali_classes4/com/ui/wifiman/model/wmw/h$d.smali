.class final Lcom/ui/wifiman/model/wmw/h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/wmw/WifimanWizard;Lcc/b;LWd/f;Lse/a;LP7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/h$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$d;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/h$d;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$d;->a:Lcom/ui/wifiman/model/wmw/h$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LDj/a;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;->b()Lcom/ui/wmw/g;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/g;->a()Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/wmw/h$d$a;->a:Lcom/ui/wifiman/model/wmw/h$d$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$d;->a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
