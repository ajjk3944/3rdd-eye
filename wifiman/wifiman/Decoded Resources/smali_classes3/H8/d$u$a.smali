.class final LH8/d$u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/d$u;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/d$u$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/d$u$a;

    invoke-direct {v0}, LH8/d$u$a;-><init>()V

    sput-object v0, LH8/d$u$a;->a:LH8/d$u$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/console/b$a;)LH8/d$d;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;->a()Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;

    move-result-object p1

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$Unauthorized;

    if-eqz v0, :cond_0

    sget-object p1, LH8/d$d;->UNAUTHORIZED:LH8/d$d;

    goto :goto_1

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$IO;

    if-eqz p1, :cond_1

    sget-object p1, LH8/d$d;->IN_PROGRESS:LH8/d$d;

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a$b;

    if-nez v0, :cond_5

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a$c;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a$d;

    if-eqz p1, :cond_4

    sget-object p1, LH8/d$d;->DONE:LH8/d$d;

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    sget-object p1, LH8/d$d;->IN_PROGRESS:LH8/d$d;

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a;

    invoke-virtual {p0, p1}, LH8/d$u$a;->a(Lcom/ui/wifiman/model/ubiquiti/console/b$a;)LH8/d$d;

    move-result-object p1

    return-object p1
.end method
