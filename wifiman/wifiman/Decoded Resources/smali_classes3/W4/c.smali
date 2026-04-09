.class public LW4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LW4/a;

.field private final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(LW4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW4/c;->a:LW4/a;

    invoke-static {p1}, LW4/c;->b(LW4/a;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, LW4/c;->b:Landroid/os/Bundle;

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p2, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p3, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static b(LW4/a;)Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p0, :cond_3

    invoke-virtual {p0}, LW4/a;->g()Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LW4/a;->g()Landroid/os/Bundle;

    move-result-object p0

    const-string/jumbo v1, "scionData"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    const-string/jumbo v1, "_cmp"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v0

    :cond_2
    const-string/jumbo v1, "medium"

    const-string/jumbo v2, "utm_medium"

    invoke-static {v1, v2, p0, v0}, LW4/c;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    const-string/jumbo v1, "source"

    const-string/jumbo v2, "utm_source"

    invoke-static {v1, v2, p0, v0}, LW4/c;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    const-string/jumbo v1, "campaign"

    const-string/jumbo v2, "utm_campaign"

    invoke-static {v1, v2, p0, v0}, LW4/c;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    :cond_3
    :goto_0
    return-object v0
.end method
