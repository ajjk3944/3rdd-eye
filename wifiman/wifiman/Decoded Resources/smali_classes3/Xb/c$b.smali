.class public final LXb/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXb/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXb/c$b$a;
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
    invoke-direct {p0}, LXb/c$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(LXb/c$b;Ljava/lang/String;)LXb/c$a;
    .locals 0

    invoke-direct {p0, p1}, LXb/c$b;->g(Ljava/lang/String;)LXb/c$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LXb/c$b;LXb/c$a;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LXb/c$b;->h(LXb/c$a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LXb/c$b;LXb/c$c;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LXb/c$b;->i(LXb/c$c;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LXb/c$b;LXb/c$d;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LXb/c$b;->j(LXb/c$d;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LXb/c$b;Ljava/lang/String;)LXb/c$c;
    .locals 0

    invoke-direct {p0, p1}, LXb/c$b;->k(Ljava/lang/String;)LXb/c$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LXb/c$b;Ljava/lang/String;)LXb/c$d;
    .locals 0

    invoke-direct {p0, p1}, LXb/c$b;->l(Ljava/lang/String;)LXb/c$d;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;)LXb/c$a;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string/jumbo v0, "PHONE_IOS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$a;->PHONE_IOS:LXb/c$a;

    goto :goto_0

    :sswitch_1
    const-string/jumbo v0, "TABLE_IOS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$a;->TABLE_IOS:LXb/c$a;

    goto :goto_0

    :sswitch_2
    const-string/jumbo v0, "TABLET_ANDROID"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$a;->TABLET_ANDROID:LXb/c$a;

    goto :goto_0

    :sswitch_3
    const-string/jumbo v0, "PHONE_ANDROID"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$a;->PHONE_ANDROID:LXb/c$a;

    :goto_0
    return-object p1

    :cond_0
    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unknown App2AppServerType type `"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "`"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x71ae7fa2 -> :sswitch_3
        -0x22002a8a -> :sswitch_2
        0x2fa507dc -> :sswitch_1
        0x68d6397c -> :sswitch_0
    .end sparse-switch
.end method

.method private final h(LXb/c$a;)Ljava/lang/String;
    .locals 1

    sget-object v0, LXb/c$b$a;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "TABLET_ANDROID"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "TABLE_IOS"

    goto :goto_0

    :cond_2
    const-string/jumbo p1, "PHONE_ANDROID"

    goto :goto_0

    :cond_3
    const-string/jumbo p1, "PHONE_IOS"

    :goto_0
    return-object p1
.end method

.method private final i(LXb/c$c;)Ljava/lang/String;
    .locals 1

    sget-object v0, LXb/c$b$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "app2app"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "local"

    goto :goto_0

    :cond_2
    const-string/jumbo p1, "internet_isp"

    goto :goto_0

    :cond_3
    const-string/jumbo p1, "internet"

    :goto_0
    return-object p1
.end method

.method private final j(LXb/c$d;)Ljava/lang/String;
    .locals 1

    sget-object v0, LXb/c$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "console"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "local"

    goto :goto_0

    :cond_2
    const-string/jumbo p1, "localNetwork"

    goto :goto_0

    :cond_3
    const-string/jumbo p1, "internet"

    :goto_0
    return-object p1
.end method

.method private final k(Ljava/lang/String;)LXb/c$c;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string/jumbo v0, "internet"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$c;->INTERNET:LXb/c$c;

    goto :goto_0

    :sswitch_1
    const-string/jumbo v0, "local"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$c;->LOCAL_SERVER:LXb/c$c;

    goto :goto_0

    :sswitch_2
    const-string/jumbo v0, "internet_isp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$c;->INTERNET_ISP:LXb/c$c;

    goto :goto_0

    :sswitch_3
    const-string/jumbo v0, "app2app"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$c;->WIFIMAN_APP:LXb/c$c;

    :goto_0
    return-object p1

    :cond_0
    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unknown speedtest type `"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "`"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x2f6249b0 -> :sswitch_3
        0x2850688 -> :sswitch_2
        0x625df6b -> :sswitch_1
        0x21ffc741 -> :sswitch_0
    .end sparse-switch
.end method

.method private final l(Ljava/lang/String;)LXb/c$d;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string/jumbo v0, "console"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$d;->CONSOLE:LXb/c$d;

    goto :goto_0

    :sswitch_1
    const-string/jumbo v0, "internet"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$d;->INTERNET:LXb/c$d;

    goto :goto_0

    :sswitch_2
    const-string/jumbo v0, "localNetwork"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$d;->LOCAL:LXb/c$d;

    goto :goto_0

    :sswitch_3
    const-string/jumbo v0, "local"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LXb/c$d;->APP_TO_APP:LXb/c$d;

    :goto_0
    return-object p1

    :cond_0
    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unknown speedtest type `"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "`"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x625df6b -> :sswitch_3
        0x1888f443 -> :sswitch_2
        0x21ffc741 -> :sswitch_1
        0x38b6e557 -> :sswitch_0
    .end sparse-switch
.end method
