.class public final Lcom/ui/comm/v4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/comm/v4/d$a;,
        Lcom/ui/comm/v4/d$b;,
        Lcom/ui/comm/v4/d$c;,
        Lcom/ui/comm/v4/d$d;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer;

.field private final c:Lcom/ui/binme/BinaryMessage$e;

.field private final d:Lg9/a;

.field private final e:Ljava/util/Map;


# direct methods
.method public constructor <init>(Z)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/ui/comm/v4/d;->a:Z

    new-instance p1, Lcom/ui/comm/v4/c;

    invoke-direct {p1}, Lcom/ui/comm/v4/c;-><init>()V

    iput-object p1, p0, Lcom/ui/comm/v4/d;->b:Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer;

    sget-object p1, Lcom/ui/binme/BinaryMessage$e;->a:Lcom/ui/binme/BinaryMessage$e$a;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$e$a;->a()Lcom/ui/binme/BinaryMessage$e;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/comm/v4/d;->c:Lcom/ui/binme/BinaryMessage$e;

    new-instance p1, Lg9/b;

    invoke-direct {p1}, Lg9/b;-><init>()V

    iput-object p1, p0, Lcom/ui/comm/v4/d;->d:Lg9/a;

    invoke-static {}, Lcom/ui/comm/v4/a$h$a;->values()[Lcom/ui/comm/v4/a$h$a;

    move-result-object p1

    array-length v0, p1

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    invoke-direct {p0, v3}, Lcom/ui/comm/v4/d;->c(Lcom/ui/comm/v4/a$h$a;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/ui/comm/v4/d;->e:Ljava/util/Map;

    return-void
.end method

.method private final c(Lcom/ui/comm/v4/a$h$a;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;
    .locals 1

    sget-object v0, Lcom/ui/comm/v4/d$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->CRITICAL:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    goto :goto_0

    :pswitch_1
    sget-object p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->ERROR:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    goto :goto_0

    :pswitch_2
    sget-object p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->WARN:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    goto :goto_0

    :pswitch_3
    sget-object p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->INFO:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    goto :goto_0

    :pswitch_4
    sget-object p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->VERBOSE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    goto :goto_0

    :pswitch_5
    sget-object p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->DEBUG:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    goto :goto_0

    :pswitch_6
    sget-object p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->SILLY:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final d(Lcom/ui/comm/v4/UiCommV4Specs$Header;[B)Le9/c$a;
    .locals 3

    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;

    :goto_0
    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;

    :goto_1
    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;

    :goto_2
    if-eqz v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    :goto_3
    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    instance-of v1, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;

    :goto_4
    if-eqz v1, :cond_5

    new-instance v0, Lcom/ui/comm/v4/d$a;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->b()Lg9/c;

    move-result-object p1

    invoke-virtual {p1}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, v1, p1, p2}, Lcom/ui/comm/v4/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_5

    :cond_5
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;

    if-eqz v0, :cond_6

    new-instance v0, Lcom/ui/comm/v4/d$b;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lg9/c;->REQUEST:Lg9/c;

    invoke-virtual {v1}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lg9/c;->RESPONSE:Lg9/c;

    invoke-virtual {v2}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p1, v1, v2, p2}, Lcom/ui/comm/v4/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_5

    :cond_6
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;

    if-eqz v0, :cond_7

    new-instance v0, Lcom/ui/comm/v4/d$b;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lg9/c;->HTTP_REQUEST:Lg9/c;

    invoke-virtual {v1}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lg9/c;->HTTP_RESPONSE:Lg9/c;

    invoke-virtual {v2}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p1, v1, v2, p2}, Lcom/ui/comm/v4/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_5

    :cond_7
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Cmd;

    if-eqz v0, :cond_8

    new-instance v0, Lcom/ui/comm/v4/d$b;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lg9/c;->CMD:Lg9/c;

    invoke-virtual {v1}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lg9/c;->CMD_RESPONSE:Lg9/c;

    invoke-virtual {v2}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p1, v1, v2, p2}, Lcom/ui/comm/v4/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    :goto_5
    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Lcom/ui/comm/v4/UiCommV4Specs$Header;Lcom/ui/comm/v4/b;)Lcom/ui/comm/v4/a;
    .locals 3

    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/comm/v4/a$i;

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/ui/comm/v4/a$i;-><init>(Ljava/lang/String;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;->d()I

    move-result v0

    if-nez v0, :cond_1

    new-instance p1, Lcom/ui/comm/v4/a$j$b;

    invoke-direct {p1, p2}, Lcom/ui/comm/v4/a$j$b;-><init>(Lcom/ui/comm/v4/b;)V

    :goto_0
    move-object v0, p1

    goto/16 :goto_1

    :cond_1
    new-instance v0, Lcom/ui/comm/v4/a$j$a;

    new-instance v1, Lcom/ui/comm/v4/a$d;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;->d()I

    move-result v2

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/ui/comm/v4/a$d;-><init>(ILjava/lang/String;)V

    invoke-direct {v0, v1, p2}, Lcom/ui/comm/v4/a$j$a;-><init>(Lcom/ui/comm/v4/a$d;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_1

    :cond_2
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/ui/comm/v4/a$f;

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;->c()Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p1

    :cond_3
    invoke-direct {v0, v1, v2, p1, p2}, Lcom/ui/comm/v4/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_1

    :cond_4
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;

    if-eqz v0, :cond_6

    new-instance v0, Lcom/ui/comm/v4/a$g;

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->d()I

    move-result v1

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->c()Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_5

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p1

    :cond_5
    invoke-direct {v0, v1, p1, p2}, Lcom/ui/comm/v4/a$g;-><init>(ILjava/util/Map;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_1

    :cond_6
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;

    if-eqz v0, :cond_8

    new-instance v0, Lcom/ui/comm/v4/a$h;

    iget-object v1, p0, Lcom/ui/comm/v4/d;->e:Ljava/util/Map;

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/comm/v4/a$h$a;

    if-eqz v1, :cond_7

    invoke-direct {v0, v1, p2}, Lcom/ui/comm/v4/a$h;-><init>(Lcom/ui/comm/v4/a$h$a;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_1

    :cond_7
    new-instance p2, Lcom/ui/comm/v4/UiCommV4Error$HeaderSerialization;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t deserialize UiCommC4 header. Unkown log level "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p2, p1, v1, v0, v1}, Lcom/ui/comm/v4/UiCommV4Error$HeaderSerialization;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p2

    :cond_8
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;

    if-eqz v0, :cond_9

    new-instance v0, Lcom/ui/comm/v4/a$e;

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/ui/comm/v4/a$e;-><init>(Ljava/lang/String;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_1

    :cond_9
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    if-eqz v0, :cond_e

    new-instance v0, Lcom/ui/comm/v4/a$d;

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->d()I

    move-result v1

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/ui/comm/v4/a$d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$d;->a()I

    move-result p1

    sget-object v1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->UNKNOWN_TYPE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    invoke-virtual {v1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->getCode()I

    move-result v1

    if-ne p1, v1, :cond_a

    new-instance p1, Lcom/ui/comm/v4/a$c$c;

    invoke-direct {p1, v0, p2}, Lcom/ui/comm/v4/a$c$c;-><init>(Lcom/ui/comm/v4/a$d;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_0

    :cond_a
    sget-object v1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->UNSUPPORTED:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    invoke-virtual {v1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->getCode()I

    move-result v1

    if-ne p1, v1, :cond_b

    new-instance p1, Lcom/ui/comm/v4/a$c$a;

    invoke-direct {p1, v0, p2}, Lcom/ui/comm/v4/a$c$a;-><init>(Lcom/ui/comm/v4/a$d;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_0

    :cond_b
    sget-object v1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->NO_REQUEST:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    invoke-virtual {v1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->getCode()I

    move-result v1

    if-ne p1, v1, :cond_c

    new-instance p1, Lcom/ui/comm/v4/a$c$d;

    invoke-direct {p1, v0, p2}, Lcom/ui/comm/v4/a$c$d;-><init>(Lcom/ui/comm/v4/a$d;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_0

    :cond_c
    sget-object v1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->MISMATCHED_TYPE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    invoke-virtual {v1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->getCode()I

    move-result v1

    if-ne p1, v1, :cond_d

    new-instance p1, Lcom/ui/comm/v4/a$c$e;

    invoke-direct {p1, v0, p2}, Lcom/ui/comm/v4/a$c$e;-><init>(Lcom/ui/comm/v4/a$d;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_0

    :cond_d
    new-instance p1, Lcom/ui/comm/v4/a$c$b;

    invoke-direct {p1, v0, p2}, Lcom/ui/comm/v4/a$c$b;-><init>(Lcom/ui/comm/v4/a$d;Lcom/ui/comm/v4/b;)V

    goto/16 :goto_0

    :cond_e
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Cmd;

    if-eqz v0, :cond_f

    new-instance v0, Lcom/ui/comm/v4/a$a;

    invoke-direct {v0, p2}, Lcom/ui/comm/v4/a$a;-><init>(Lcom/ui/comm/v4/b;)V

    goto :goto_1

    :cond_f
    instance-of v0, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;

    if-eqz v0, :cond_10

    new-instance v0, Lcom/ui/comm/v4/a$b;

    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;->c()I

    move-result p1

    invoke-direct {v0, p1, p2}, Lcom/ui/comm/v4/a$b;-><init>(ILcom/ui/comm/v4/b;)V

    :goto_1
    return-object v0

    :cond_10
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lcom/ui/comm/v4/a;Ljava/lang/String;J)Lcom/ui/comm/v4/UiCommV4Specs$Header;
    .locals 8

    instance-of v0, p1, Lcom/ui/comm/v4/a$i;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;

    check-cast p1, Lcom/ui/comm/v4/a$i;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$i;->f()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p2, p3, p4, p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/comm/v4/a$j$b;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p2

    move-wide v3, p3

    invoke-direct/range {v1 .. v6}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;-><init>(Ljava/lang/String;JLjava/lang/String;I)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/comm/v4/a$j$a;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/comm/v4/a$j$a;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$j$a;->f()Lcom/ui/comm/v4/a$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$d;->a()I

    move-result v6

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$j$a;->f()Lcom/ui/comm/v4/a$d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$d;->b()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;

    move-object v1, v0

    move-object v2, p2

    move-wide v3, p3

    invoke-direct/range {v1 .. v6}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;-><init>(Ljava/lang/String;JLjava/lang/String;I)V

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, Lcom/ui/comm/v4/a$f;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;

    check-cast p1, Lcom/ui/comm/v4/a$f;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$f;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$f;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$f;->f()Ljava/util/Map;

    move-result-object v7

    move-object v1, v0

    move-object v2, p2

    move-wide v3, p3

    invoke-direct/range {v1 .. v7}, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, Lcom/ui/comm/v4/a$g;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;

    check-cast p1, Lcom/ui/comm/v4/a$g;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$g;->g()I

    move-result v5

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$g;->f()Ljava/util/Map;

    move-result-object v6

    move-object v1, v0

    move-object v2, p2

    move-wide v3, p3

    invoke-direct/range {v1 .. v6}, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;-><init>(Ljava/lang/String;JILjava/util/Map;)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/ui/comm/v4/a$h;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;

    check-cast p1, Lcom/ui/comm/v4/a$h;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$h;->f()Lcom/ui/comm/v4/a$h$a;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ui/comm/v4/d;->c(Lcom/ui/comm/v4/a$h$a;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p2, p3, p4, p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lcom/ui/comm/v4/a$e;

    if-eqz v0, :cond_6

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;

    check-cast p1, Lcom/ui/comm/v4/a$e;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$e;->f()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p2, p3, p4, p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    goto :goto_0

    :cond_6
    instance-of v0, p1, Lcom/ui/comm/v4/a$c;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/ui/comm/v4/a$c;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$c;->f()Lcom/ui/comm/v4/a$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$d;->a()I

    move-result v6

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$c;->f()Lcom/ui/comm/v4/a$d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$d;->b()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    move-object v1, v0

    move-object v2, p2

    move-wide v3, p3

    invoke-direct/range {v1 .. v6}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;-><init>(Ljava/lang/String;JLjava/lang/String;I)V

    goto :goto_0

    :cond_7
    instance-of v0, p1, Lcom/ui/comm/v4/a$a;

    if-eqz v0, :cond_8

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Cmd;

    invoke-direct {v0, p2, p3, p4}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Cmd;-><init>(Ljava/lang/String;J)V

    goto :goto_0

    :cond_8
    instance-of v0, p1, Lcom/ui/comm/v4/a$b;

    if-eqz v0, :cond_9

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;

    check-cast p1, Lcom/ui/comm/v4/a$b;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$b;->f()I

    move-result p1

    invoke-direct {v0, p2, p3, p4, p1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;-><init>(Ljava/lang/String;JI)V

    :goto_0
    return-object v0

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a([B)Le9/c$b;
    .locals 7

    const-string/jumbo v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/ui/comm/v4/d;->c:Lcom/ui/binme/BinaryMessage$e;

    invoke-interface {v0, p1}, Lcom/ui/binme/BinaryMessage$e;->b([B)Lcom/ui/binme/BinaryMessage;

    move-result-object p1
    :try_end_0
    .catch Lcom/ui/binme/BinaryMessage$Error; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, p0, Lcom/ui/comm/v4/d;->b:Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer;

    new-instance v1, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->b()Lcom/ui/binme/BinaryMessage$d$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/binme/BinaryMessage$d$b;->b()[B

    move-result-object v2

    sget-object v3, Lcom/ui/binme/BinaryMessage;->c:Lcom/ui/binme/BinaryMessage$a;

    invoke-virtual {v3}, Lcom/ui/binme/BinaryMessage$a;->b()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-interface {v0, v1}, Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer;->a(Ljava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header;

    move-result-object v0
    :try_end_1
    .catch Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer$Error; {:try_start_1 .. :try_end_1} :catch_0

    new-instance v1, Lcom/ui/comm/v4/d$c;

    invoke-virtual {v0}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->b()Lg9/c;

    move-result-object v3

    invoke-virtual {v3}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/ui/comm/v4/b;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->a()Lcom/ui/binme/BinaryMessage$d$a;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ui/binme/BinaryMessage$d$a;->c()Lcom/ui/binme/BinaryMessage$c;

    move-result-object v5

    sget-object v6, Lcom/ui/comm/v4/d$d;->b:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_2

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1

    const/4 v6, 0x3

    if-ne v5, v6, :cond_0

    sget-object v5, Lcom/ui/comm/v4/b$a;->BINARY:Lcom/ui/comm/v4/b$a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object v5, Lcom/ui/comm/v4/b$a;->JSON:Lcom/ui/comm/v4/b$a;

    goto :goto_0

    :cond_2
    sget-object v5, Lcom/ui/comm/v4/b$a;->STRING:Lcom/ui/comm/v4/b$a;

    :goto_0
    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->a()Lcom/ui/binme/BinaryMessage$d$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d$a;->b()[B

    move-result-object p1

    invoke-direct {v4, v5, p1}, Lcom/ui/comm/v4/b;-><init>(Lcom/ui/comm/v4/b$a;[B)V

    invoke-direct {p0, v0, v4}, Lcom/ui/comm/v4/d;->f(Lcom/ui/comm/v4/UiCommV4Specs$Header;Lcom/ui/comm/v4/b;)Lcom/ui/comm/v4/a;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Lcom/ui/comm/v4/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ui/comm/v4/a;)V

    return-object v1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Error$HeaderSerialization;

    const-string/jumbo v1, "Failed to deserialized incoming UiCommunication v4 message header"

    invoke-direct {v0, v1, p1}, Lcom/ui/comm/v4/UiCommV4Error$HeaderSerialization;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;

    const-string/jumbo v1, "Failed to deserialized incoming Binme message"

    invoke-direct {v0, v1, p1}, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;-><init>(Ljava/lang/String;Lcom/ui/binme/BinaryMessage$Error;)V

    throw v0
.end method

.method public bridge synthetic b(Le9/a;)Le9/c$a;
    .locals 0

    check-cast p1, Lcom/ui/comm/v4/a;

    invoke-virtual {p0, p1}, Lcom/ui/comm/v4/d;->e(Lcom/ui/comm/v4/a;)Le9/c$a;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/ui/comm/v4/a;)Le9/c$a;
    .locals 7

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/comm/v4/d;->d:Lg9/a;

    invoke-interface {v0}, Lg9/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/ui/comm/v4/d;->g(Lcom/ui/comm/v4/a;Ljava/lang/String;J)Lcom/ui/comm/v4/UiCommV4Specs$Header;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/ui/comm/v4/d;->b:Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer;

    invoke-interface {v1, v0}, Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer;->b(Lcom/ui/comm/v4/UiCommV4Specs$Header;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Lcom/ui/comm/v4/UiCommV4MessageHeaderJsonSerializer$Error; {:try_start_0 .. :try_end_0} :catch_1

    new-instance v2, Lcom/ui/binme/BinaryMessage;

    new-instance v3, Lcom/ui/binme/BinaryMessage$d$b;

    sget-object v4, Lcom/ui/binme/BinaryMessage$c;->JSON:Lcom/ui/binme/BinaryMessage$c;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a;->c()Lcom/ui/binme/BinaryMessage$b;

    move-result-object v5

    if-nez v5, :cond_1

    iget-boolean v5, p0, Lcom/ui/comm/v4/d;->a:Z

    if-eqz v5, :cond_0

    sget-object v5, Lcom/ui/binme/BinaryMessage$b;->ENABLED:Lcom/ui/binme/BinaryMessage$b;

    goto :goto_0

    :cond_0
    sget-object v5, Lcom/ui/binme/BinaryMessage$b;->DISABLED:Lcom/ui/binme/BinaryMessage$b;

    :cond_1
    :goto_0
    sget-object v6, Lcom/ui/binme/BinaryMessage;->c:Lcom/ui/binme/BinaryMessage$a;

    invoke-virtual {v6}, Lcom/ui/binme/BinaryMessage$a;->b()Ljava/nio/charset/Charset;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string/jumbo v6, "this as java.lang.String).getBytes(charset)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4, v5, v1}, Lcom/ui/binme/BinaryMessage$d$b;-><init>(Lcom/ui/binme/BinaryMessage$c;Lcom/ui/binme/BinaryMessage$b;[B)V

    new-instance v1, Lcom/ui/binme/BinaryMessage$d$a;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a;->a()Lcom/ui/comm/v4/b;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ui/comm/v4/b;->b()Lcom/ui/comm/v4/b$a;

    move-result-object v5

    sget-object v6, Lcom/ui/comm/v4/d$d;->c:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_3

    const/4 v6, 0x2

    if-eq v5, v6, :cond_4

    const/4 v4, 0x3

    if-ne v5, v4, :cond_2

    sget-object v4, Lcom/ui/binme/BinaryMessage$c;->BINARY:Lcom/ui/binme/BinaryMessage$c;

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    sget-object v4, Lcom/ui/binme/BinaryMessage$c;->STRING:Lcom/ui/binme/BinaryMessage$c;

    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/ui/comm/v4/a;->b()Lcom/ui/binme/BinaryMessage$b;

    move-result-object v5

    if-nez v5, :cond_6

    iget-boolean v5, p0, Lcom/ui/comm/v4/d;->a:Z

    if-eqz v5, :cond_5

    sget-object v5, Lcom/ui/binme/BinaryMessage$b;->ENABLED:Lcom/ui/binme/BinaryMessage$b;

    goto :goto_2

    :cond_5
    sget-object v5, Lcom/ui/binme/BinaryMessage$b;->DISABLED:Lcom/ui/binme/BinaryMessage$b;

    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/ui/comm/v4/a;->a()Lcom/ui/comm/v4/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/b;->a()[B

    move-result-object p1

    invoke-direct {v1, v4, v5, p1}, Lcom/ui/binme/BinaryMessage$d$a;-><init>(Lcom/ui/binme/BinaryMessage$c;Lcom/ui/binme/BinaryMessage$b;[B)V

    invoke-direct {v2, v3, v1}, Lcom/ui/binme/BinaryMessage;-><init>(Lcom/ui/binme/BinaryMessage$d$b;Lcom/ui/binme/BinaryMessage$d$a;)V

    :try_start_1
    iget-object p1, p0, Lcom/ui/comm/v4/d;->c:Lcom/ui/binme/BinaryMessage$e;

    invoke-interface {p1, v2}, Lcom/ui/binme/BinaryMessage$e;->a(Lcom/ui/binme/BinaryMessage;)[B

    move-result-object p1
    :try_end_1
    .catch Lcom/ui/binme/BinaryMessage$Error; {:try_start_1 .. :try_end_1} :catch_0

    invoke-direct {p0, v0, p1}, Lcom/ui/comm/v4/d;->d(Lcom/ui/comm/v4/UiCommV4Specs$Header;[B)Le9/c$a;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v1, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;

    invoke-virtual {v0}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ui/comm/v4/UiCommV4Specs$Header;->b()Lg9/c;

    move-result-object v0

    invoke-virtual {v0}, Lg9/c;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Failed to serialize outgoing Binme message. Guid: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", type: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;-><init>(Ljava/lang/String;Lcom/ui/binme/BinaryMessage$Error;)V

    throw v1

    :catch_1
    move-exception p1

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Error$HeaderSerialization;

    const-string/jumbo v1, "Failed to serialize UiCommunication v4 message header"

    invoke-direct {v0, v1, p1}, Lcom/ui/comm/v4/UiCommV4Error$HeaderSerialization;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
