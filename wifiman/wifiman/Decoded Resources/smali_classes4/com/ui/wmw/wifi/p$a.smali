.class public abstract Lcom/ui/wmw/wifi/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/wifi/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/wifi/p$a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/wifi/p$a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lcom/ui/wmw/wifi/p;Ljava/lang/String;)[B
    .locals 5

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "0x"

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, p0, v0, v1, v2}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p0, LQf/d;

    invoke-direct {p0, p1}, LQf/d;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v2, v1, v2}, LNf/a;->c(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-object v2

    :cond_0
    :try_start_0
    invoke-static {p1, p0}, Lkotlin/text/t;->G0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/2addr v0, v1

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "0"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_1
    invoke-static {p0, v1}, Lkotlin/text/t;->s1(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/16 v4, 0x10

    invoke-static {v4}, Lkotlin/text/a;->a(I)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    int-to-byte v3, v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, LZg/v;->d1(Ljava/util/Collection;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, LQf/e;

    invoke-direct {p0, p1}, LQf/e;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v2, v1, v2}, LNf/a;->c(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-object v2
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t decode HEX \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'- Must start with 0x"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t decode HEX \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'- Not in hex format"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lcom/ui/wmw/wifi/p;I)LS8/d;
    .locals 0

    if-eqz p1, :cond_4

    const/4 p0, 0x1

    if-eq p1, p0, :cond_3

    const/4 p0, 0x2

    if-eq p1, p0, :cond_2

    const/4 p0, 0x3

    if-eq p1, p0, :cond_1

    const/4 p0, 0x4

    if-eq p1, p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    sget-object p0, LS8/d;->MHZ_80_80:LS8/d;

    goto :goto_0

    :cond_1
    sget-object p0, LS8/d;->MHZ_160:LS8/d;

    goto :goto_0

    :cond_2
    sget-object p0, LS8/d;->MHZ_80:LS8/d;

    goto :goto_0

    :cond_3
    sget-object p0, LS8/d;->MHZ_40:LS8/d;

    goto :goto_0

    :cond_4
    sget-object p0, LS8/d;->MHZ_20:LS8/d;

    :goto_0
    return-object p0
.end method

.method public static g(Lcom/ui/wmw/wifi/p;I)LS8/a;
    .locals 1

    const/4 v0, 0x5

    invoke-interface {p0, p1, v0}, Lcom/ui/wmw/wifi/p;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LS8/a;->BE:LS8/a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    invoke-interface {p0, p1, v0}, Lcom/ui/wmw/wifi/p;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, LS8/a;->AX:LS8/a;

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p0, p1, v0}, Lcom/ui/wmw/wifi/p;->b(II)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LS8/a;->AC:LS8/a;

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    invoke-interface {p0, p1, v0}, Lcom/ui/wmw/wifi/p;->b(II)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, LS8/a;->N:LS8/a;

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    invoke-interface {p0, p1, v0}, Lcom/ui/wmw/wifi/p;->b(II)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, LS8/a;->A:LS8/a;

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lcom/ui/wmw/wifi/p;->b(II)Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, LS8/a;->G:LS8/a;

    goto :goto_0

    :cond_5
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static h(Lcom/ui/wmw/wifi/p;I)Ljava/util/Set;
    .locals 4

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    if-nez p1, :cond_0

    sget-object p0, LS8/j$b$b;->a:LS8/j$b$b;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_0
    const/4 v1, 0x0

    const/16 v2, 0x20

    invoke-static {v1, v2}, Lsh/m;->s(II)Lsh/i;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    move-result v2

    invoke-interface {p0, p1, v2}, Lcom/ui/wmw/wifi/p;->b(II)Z

    move-result v3

    if-eqz v3, :cond_1

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    sget-object v2, LS8/j$b$f$b;->a:LS8/j$b$f$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_2
    sget-object v2, LS8/j$b$f$a;->a:LS8/j$b$f$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_3
    sget-object v2, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_4
    sget-object v2, LS8/j$b$h$a;->a:LS8/j$b$h$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_5
    sget-object v2, LS8/j$b$h$c;->a:LS8/j$b$h$c;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_6
    sget-object v2, LS8/j$b$a;->a:LS8/j$b$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_7
    sget-object v2, LS8/j$b$a;->a:LS8/j$b$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_8
    sget-object v2, LS8/j$b$a;->a:LS8/j$b$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_9
    sget-object v2, LS8/j$b$a;->a:LS8/j$b$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_a
    sget-object v2, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_b
    sget-object v2, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_c
    sget-object v2, LS8/j$b$c;->a:LS8/j$b$c;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_d
    sget-object v2, LS8/j$b$d;->a:LS8/j$b$d;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_e
    sget-object v2, LS8/j$b$d;->a:LS8/j$b$d;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_f
    sget-object v2, LS8/j$b$h$d;->a:LS8/j$b$h$d;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_10
    sget-object v2, LS8/j$b$h$d;->a:LS8/j$b$h$d;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_11
    sget-object v2, LS8/j$b$i;->a:LS8/j$b$i;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_12
    sget-object v2, LS8/j$b$g$b;->a:LS8/j$b$g$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_13
    sget-object v2, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_14
    sget-object v2, LS8/j$b$g$b;->a:LS8/j$b$g$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_15
    sget-object v2, LS8/j$b$g$a;->a:LS8/j$b$g$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_16
    sget-object v2, LS8/j$b$g$b;->a:LS8/j$b$g$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_17
    sget-object v2, LS8/j$b$e;->a:LS8/j$b$e;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_18
    sget-object v2, LS8/j$b$e;->a:LS8/j$b$e;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_19
    sget-object v2, LS8/j$b$g$b;->a:LS8/j$b$g$b;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1a
    sget-object v2, LS8/j$b$g$a;->a:LS8/j$b$g$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_2
    :goto_1
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static i(Lcom/ui/wmw/wifi/p;I)Ljava/util/Set;
    .locals 2

    new-instance v0, Lsh/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lsh/i;-><init>(II)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LZg/Q;

    invoke-virtual {v1}, LZg/Q;->d()I

    move-result v1

    invoke-interface {p0, v1}, Lcom/ui/wmw/wifi/p;->a(I)LS8/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p1}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lcom/ui/wmw/wifi/p;I)Ljava/util/Set;
    .locals 4

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v1, Lsh/i;

    const/4 v2, 0x0

    const/16 v3, 0xd

    invoke-direct {v1, v2, v3}, Lsh/i;-><init>(II)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    move-result v2

    invoke-interface {p0, p1, v2}, Lcom/ui/wmw/wifi/p;->b(II)Z

    move-result v3

    if-eqz v3, :cond_0

    packed-switch v2, :pswitch_data_0

    const/4 v2, 0x0

    goto/16 :goto_1

    :pswitch_0
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0x36

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto/16 :goto_1

    :pswitch_1
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0x30

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto/16 :goto_1

    :pswitch_2
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0x24

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_3
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_4
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0x12

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_5
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0xc

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_6
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0x9

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_7
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/4 v3, 0x6

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_8
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0x21

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_9
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0x16

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_a
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/16 v3, 0xb

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_b
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/high16 v3, 0x40b00000    # 5.5f

    invoke-virtual {v2, v3}, LW7/a$a;->c(F)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_c
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    goto :goto_1

    :pswitch_d
    sget-object v2, LW7/a;->b:LW7/a$a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public static k(Lcom/ui/wmw/wifi/p;II)Z
    .locals 0

    shr-int p0, p1, p2

    const/4 p1, 0x1

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
