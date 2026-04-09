.class public abstract LQb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQb/a$a;
    }
.end annotation


# direct methods
.method public static final a(LS8/a;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LQb/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const-string/jumbo p0, "be"

    goto :goto_0

    :pswitch_1
    const-string/jumbo p0, "ax"

    goto :goto_0

    :pswitch_2
    const-string/jumbo p0, "ad"

    goto :goto_0

    :pswitch_3
    const-string/jumbo p0, "ac"

    goto :goto_0

    :pswitch_4
    const-string/jumbo p0, "n"

    goto :goto_0

    :pswitch_5
    const-string/jumbo p0, "g"

    goto :goto_0

    :pswitch_6
    const-string/jumbo p0, "b"

    goto :goto_0

    :pswitch_7
    const-string/jumbo p0, "a"

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Ljava/lang/String;)LS8/a;
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x61

    if-eq v0, v1, :cond_6

    const/16 v1, 0x62

    if-eq v0, v1, :cond_5

    const/16 v1, 0x67

    if-eq v0, v1, :cond_4

    const/16 v1, 0x6e

    if-eq v0, v1, :cond_3

    const/16 v1, 0xc37

    if-eq v0, v1, :cond_2

    const/16 v1, 0xc43

    if-eq v0, v1, :cond_1

    const/16 v1, 0xc22

    if-eq v0, v1, :cond_0

    const/16 v1, 0xc23

    if-ne v0, v1, :cond_7

    const-string/jumbo v0, "ad"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LS8/a;->AD:LS8/a;

    goto :goto_0

    :cond_0
    const-string/jumbo v0, "ac"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LS8/a;->AC:LS8/a;

    goto :goto_0

    :cond_1
    const-string/jumbo v0, "be"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LS8/a;->BE:LS8/a;

    goto :goto_0

    :cond_2
    const-string/jumbo v0, "ax"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LS8/a;->AX:LS8/a;

    goto :goto_0

    :cond_3
    const-string/jumbo v0, "n"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LS8/a;->N:LS8/a;

    goto :goto_0

    :cond_4
    const-string/jumbo v0, "g"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LS8/a;->G:LS8/a;

    goto :goto_0

    :cond_5
    const-string/jumbo v0, "b"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LS8/a;->B:LS8/a;

    goto :goto_0

    :cond_6
    const-string/jumbo v0, "a"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LS8/a;->A:LS8/a;

    :goto_0
    return-object p0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unknown ieee mode `"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p0, "`"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
