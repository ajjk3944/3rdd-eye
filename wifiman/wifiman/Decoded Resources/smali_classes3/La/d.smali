.class public abstract LLa/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LLa/c;)Lspeedtest/SpeedtestApplicationInfo;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lspeedtest/SpeedtestApplicationInfo;

    invoke-direct {v0}, Lspeedtest/SpeedtestApplicationInfo;-><init>()V

    invoke-virtual {p0}, LLa/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/SpeedtestApplicationInfo;->setAppName(Ljava/lang/String;)V

    invoke-virtual {p0}, LLa/c;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lspeedtest/SpeedtestApplicationInfo;->setAppVersion(Ljava/lang/String;)V

    const-string/jumbo p0, "android"

    invoke-virtual {v0, p0}, Lspeedtest/SpeedtestApplicationInfo;->setOs(Ljava/lang/String;)V

    sget-object p0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lspeedtest/SpeedtestApplicationInfo;->setOsVersion(Ljava/lang/String;)V

    return-object v0
.end method
