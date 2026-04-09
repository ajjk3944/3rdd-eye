.class public abstract LQb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQb/d$a;
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;)LS8/d;
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x63e

    if-eq v0, v1, :cond_4

    const/16 v1, 0x67c

    if-eq v0, v1, :cond_3

    const/16 v1, 0x6f8

    if-eq v0, v1, :cond_2

    const v1, 0xbeab

    if-eq v0, v1, :cond_1

    const v1, 0xc5b1

    if-eq v0, v1, :cond_0

    const v1, 0x32c619f

    if-ne v0, v1, :cond_5

    const-string v0, "80_80"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, LS8/d;->MHZ_80_80:LS8/d;

    goto :goto_0

    :cond_0
    const-string v0, "320"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, LS8/d;->MHZ_320:LS8/d;

    goto :goto_0

    :cond_1
    const-string v0, "160"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, LS8/d;->MHZ_160:LS8/d;

    goto :goto_0

    :cond_2
    const-string v0, "80"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, LS8/d;->MHZ_80:LS8/d;

    goto :goto_0

    :cond_3
    const-string v0, "40"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, LS8/d;->MHZ_40:LS8/d;

    goto :goto_0

    :cond_4
    const-string v0, "20"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, LS8/d;->MHZ_20:LS8/d;

    :goto_0
    return-object p0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unexpected channel width `"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p0, "`"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(LS8/d;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LQb/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const-string p0, "320"

    goto :goto_0

    :pswitch_1
    const-string p0, "80_80"

    goto :goto_0

    :pswitch_2
    const-string p0, "160"

    goto :goto_0

    :pswitch_3
    const-string p0, "80"

    goto :goto_0

    :pswitch_4
    const-string p0, "40"

    goto :goto_0

    :pswitch_5
    const-string p0, "20"

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
