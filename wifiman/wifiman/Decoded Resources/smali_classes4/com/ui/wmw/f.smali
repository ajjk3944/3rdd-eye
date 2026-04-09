.class public abstract Lcom/ui/wmw/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/f;->d(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lgg/b;)Lgg/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wmw/f$a;->a:Lcom/ui/wmw/f$a;

    invoke-virtual {p0, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p0

    const-string v0, "onErrorResumeNext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lgg/i;Z)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wmw/f$b;

    invoke-direct {v0, p1}, Lcom/ui/wmw/f$b;-><init>(Z)V

    invoke-virtual {p0, v0}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p0

    const-string p1, "onErrorResumeNext(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final d(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p0, Lcom/ui/btle/v2/BTLEv2$Error$Connection;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Connection$Btle;

    const-string v1, "BTLE Connection failed"

    invoke-direct {v0, v1, p0}, Lcom/ui/wmw/WMWizard$Error$Connection$Btle;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    move-object p0, v0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Lcom/ui/btle/v2/BTLEv2$Error$Protocol;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Connection$Protocol;

    const-string v1, "BTLE Protocol error"

    invoke-direct {v0, v1, p0}, Lcom/ui/wmw/WMWizard$Error$Connection$Protocol;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-object p0
.end method

.method public static synthetic e(Lgg/i;ZILjava/lang/Object;)Lgg/i;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/ui/wmw/f;->c(Lgg/i;Z)Lgg/i;

    move-result-object p0

    return-object p0
.end method
