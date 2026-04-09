.class public abstract Lcom/ui/wmw/WMWizard$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/WMWizard$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/WMWizard$a$a$a;,
        Lcom/ui/wmw/WMWizard$a$a$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wmw/WMWizard$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$b$a;

    if-eqz v0, :cond_0

    instance-of p1, p1, Lcom/ui/wmw/WMWizard$a$a$b$a;

    goto :goto_1

    :cond_0
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$b$b;

    if-eqz v0, :cond_1

    instance-of p1, p1, Lcom/ui/wmw/WMWizard$a$a$b$b;

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$b$c;

    if-eqz v0, :cond_2

    instance-of p1, p1, Lcom/ui/wmw/WMWizard$a$a$b$c;

    goto :goto_1

    :cond_2
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$a$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$a$b;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/ui/wmw/WMWizard$a$a$a$b;

    invoke-virtual {p1}, Lcom/ui/wmw/WMWizard$a$a$a$b;->a()Lcom/ui/wmw/g;

    move-result-object p1

    move-object v0, p0

    check-cast v0, Lcom/ui/wmw/WMWizard$a$a$a$b;

    invoke-virtual {v0}, Lcom/ui/wmw/WMWizard$a$a$a$b;->a()Lcom/ui/wmw/g;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    move p1, v2

    goto :goto_1

    :cond_3
    move p1, v1

    goto :goto_1

    :cond_4
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$a$a;

    if-eqz v0, :cond_5

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$a;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/ui/wmw/WMWizard$a$a$a;

    invoke-virtual {p1}, Lcom/ui/wmw/WMWizard$a$a$a;->a()Lcom/ui/wmw/g;

    move-result-object p1

    move-object v0, p0

    check-cast v0, Lcom/ui/wmw/WMWizard$a$a$a$a;

    invoke-virtual {v0}, Lcom/ui/wmw/WMWizard$a$a$a$a;->a()Lcom/ui/wmw/g;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :goto_1
    return p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public hashCode()I
    .locals 1

    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/ui/wmw/WMWizard$a$a$b;

    invoke-super {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$a;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/ui/wmw/WMWizard$a$a$a;

    invoke-virtual {v0}, Lcom/ui/wmw/WMWizard$a$a$a;->a()Lcom/ui/wmw/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wmw/g;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wmw/g$a;->c(Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$b$a;

    if-eqz v0, :cond_0

    const-string v0, "CONNECTING [Btle]"

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$b$b;

    if-eqz v0, :cond_1

    const-string v0, "CONNECTING [Handshake]"

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$b$c;

    if-eqz v0, :cond_2

    const-string v0, "CONNECTING [Session]"

    goto :goto_0

    :cond_2
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$a$b;

    const-string v1, "CONNECTED "

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Lcom/ui/wmw/WMWizard$a$a$a$b;

    invoke-virtual {v0}, Lcom/ui/wmw/WMWizard$a$a$a$b;->a()Lcom/ui/wmw/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wmw/g;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wmw/g$a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " [Reconnection]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    instance-of v0, p0, Lcom/ui/wmw/WMWizard$a$a$a$a;

    if-eqz v0, :cond_4

    move-object v0, p0

    check-cast v0, Lcom/ui/wmw/WMWizard$a$a$a$a;

    invoke-virtual {v0}, Lcom/ui/wmw/WMWizard$a$a$a$a;->a()Lcom/ui/wmw/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wmw/g;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wmw/g$a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WMWizard Conection State "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
