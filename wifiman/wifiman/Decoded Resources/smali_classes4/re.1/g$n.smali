.class final Lre/g$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/g;-><init>(Ljava/lang/String;Lcom/ui/wifiman/model/wmw/WifimanWizard;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lre/g$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/g$n;

    invoke-direct {v0}, Lre/g$n;-><init>()V

    sput-object v0, Lre/g$n;->a:Lre/g$n;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)Ll9/a;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz v0, :cond_0

    new-instance v0, Ll9/a;

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;->b()Lcom/ui/wmw/g;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-nez v0, :cond_2

    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    new-instance v0, Ll9/a;

    const/4 p1, 0x0

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p0, p1}, Lre/g$n;->a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
