.class public abstract Lrd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd/f$a;
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;)Lrd/b$a$a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "ios_phone"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lrd/b$a$a;->PHONE_IOS:Lrd/b$a$a;

    goto :goto_1

    :sswitch_1
    const-string v0, "android_tablet"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lrd/b$a$a;->TABLET_ANDROID:Lrd/b$a$a;

    goto :goto_1

    :sswitch_2
    const-string v0, "android_phone"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Lrd/b$a$a;->PHONE_ANDROID:Lrd/b$a$a;

    goto :goto_1

    :sswitch_3
    const-string v0, "ios_tablet"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_3
    sget-object p0, Lrd/b$a$a;->TABLE_IOS:Lrd/b$a$a;

    :goto_1
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d261528 -> :sswitch_3
        -0x288cf862 -> :sswitch_2
        0x1d58ba36 -> :sswitch_1
        0x46983abc -> :sswitch_0
    .end sparse-switch
.end method

.method public static final b(Lrd/b$a$a;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrd/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    const-string p0, "ios_phone"

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "ios_tablet"

    goto :goto_0

    :cond_2
    const-string p0, "android_phone"

    goto :goto_0

    :cond_3
    const-string p0, "android_tablet"

    :goto_0
    return-object p0
.end method
