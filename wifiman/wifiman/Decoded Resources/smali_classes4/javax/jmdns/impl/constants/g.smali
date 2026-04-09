.class public final enum Ljavax/jmdns/impl/constants/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljavax/jmdns/impl/constants/g$b;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ljavax/jmdns/impl/constants/g;

.field public static final enum ANNOUNCED:Ljavax/jmdns/impl/constants/g;

.field public static final enum ANNOUNCING_1:Ljavax/jmdns/impl/constants/g;

.field public static final enum ANNOUNCING_2:Ljavax/jmdns/impl/constants/g;

.field public static final enum CANCELED:Ljavax/jmdns/impl/constants/g;

.field public static final enum CANCELING_1:Ljavax/jmdns/impl/constants/g;

.field public static final enum CANCELING_2:Ljavax/jmdns/impl/constants/g;

.field public static final enum CANCELING_3:Ljavax/jmdns/impl/constants/g;

.field public static final enum CLOSED:Ljavax/jmdns/impl/constants/g;

.field public static final enum CLOSING:Ljavax/jmdns/impl/constants/g;

.field public static final enum PROBING_1:Ljavax/jmdns/impl/constants/g;

.field public static final enum PROBING_2:Ljavax/jmdns/impl/constants/g;

.field public static final enum PROBING_3:Ljavax/jmdns/impl/constants/g;


# instance fields
.field private final _name:Ljava/lang/String;

.field private final _state:Ljavax/jmdns/impl/constants/g$b;


# direct methods
.method private static synthetic $values()[Ljavax/jmdns/impl/constants/g;
    .locals 12

    sget-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_1:Ljavax/jmdns/impl/constants/g;

    sget-object v1, Ljavax/jmdns/impl/constants/g;->PROBING_2:Ljavax/jmdns/impl/constants/g;

    sget-object v2, Ljavax/jmdns/impl/constants/g;->PROBING_3:Ljavax/jmdns/impl/constants/g;

    sget-object v3, Ljavax/jmdns/impl/constants/g;->ANNOUNCING_1:Ljavax/jmdns/impl/constants/g;

    sget-object v4, Ljavax/jmdns/impl/constants/g;->ANNOUNCING_2:Ljavax/jmdns/impl/constants/g;

    sget-object v5, Ljavax/jmdns/impl/constants/g;->ANNOUNCED:Ljavax/jmdns/impl/constants/g;

    sget-object v6, Ljavax/jmdns/impl/constants/g;->CANCELING_1:Ljavax/jmdns/impl/constants/g;

    sget-object v7, Ljavax/jmdns/impl/constants/g;->CANCELING_2:Ljavax/jmdns/impl/constants/g;

    sget-object v8, Ljavax/jmdns/impl/constants/g;->CANCELING_3:Ljavax/jmdns/impl/constants/g;

    sget-object v9, Ljavax/jmdns/impl/constants/g;->CANCELED:Ljavax/jmdns/impl/constants/g;

    sget-object v10, Ljavax/jmdns/impl/constants/g;->CLOSING:Ljavax/jmdns/impl/constants/g;

    sget-object v11, Ljavax/jmdns/impl/constants/g;->CLOSED:Ljavax/jmdns/impl/constants/g;

    filled-new-array/range {v0 .. v11}, [Ljavax/jmdns/impl/constants/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->probing:Ljavax/jmdns/impl/constants/g$b;

    const-string v2, "PROBING_1"

    const/4 v3, 0x0

    const-string v4, "probing 1"

    invoke-direct {v0, v2, v3, v4, v1}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_1:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const/4 v2, 0x1

    const-string v3, "probing 2"

    const-string v4, "PROBING_2"

    invoke-direct {v0, v4, v2, v3, v1}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_2:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const/4 v2, 0x2

    const-string v3, "probing 3"

    const-string v4, "PROBING_3"

    invoke-direct {v0, v4, v2, v3, v1}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_3:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->announcing:Ljavax/jmdns/impl/constants/g$b;

    const-string v2, "ANNOUNCING_1"

    const/4 v3, 0x3

    const-string v4, "announcing 1"

    invoke-direct {v0, v2, v3, v4, v1}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->ANNOUNCING_1:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const/4 v2, 0x4

    const-string v3, "announcing 2"

    const-string v4, "ANNOUNCING_2"

    invoke-direct {v0, v4, v2, v3, v1}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->ANNOUNCING_2:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const-string v1, "announced"

    sget-object v2, Ljavax/jmdns/impl/constants/g$b;->announced:Ljavax/jmdns/impl/constants/g$b;

    const-string v3, "ANNOUNCED"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->ANNOUNCED:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->canceling:Ljavax/jmdns/impl/constants/g$b;

    const-string v2, "CANCELING_1"

    const/4 v3, 0x6

    const-string v4, "canceling 1"

    invoke-direct {v0, v2, v3, v4, v1}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->CANCELING_1:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const/4 v2, 0x7

    const-string v3, "canceling 2"

    const-string v4, "CANCELING_2"

    invoke-direct {v0, v4, v2, v3, v1}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->CANCELING_2:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const/16 v2, 0x8

    const-string v3, "canceling 3"

    const-string v4, "CANCELING_3"

    invoke-direct {v0, v4, v2, v3, v1}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->CANCELING_3:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const-string v1, "canceled"

    sget-object v2, Ljavax/jmdns/impl/constants/g$b;->canceled:Ljavax/jmdns/impl/constants/g$b;

    const-string v3, "CANCELED"

    const/16 v4, 0x9

    invoke-direct {v0, v3, v4, v1, v2}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->CANCELED:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const-string v1, "closing"

    sget-object v2, Ljavax/jmdns/impl/constants/g$b;->closing:Ljavax/jmdns/impl/constants/g$b;

    const-string v3, "CLOSING"

    const/16 v4, 0xa

    invoke-direct {v0, v3, v4, v1, v2}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->CLOSING:Ljavax/jmdns/impl/constants/g;

    new-instance v0, Ljavax/jmdns/impl/constants/g;

    const-string v1, "closed"

    sget-object v2, Ljavax/jmdns/impl/constants/g$b;->closed:Ljavax/jmdns/impl/constants/g$b;

    const-string v3, "CLOSED"

    const/16 v4, 0xb

    invoke-direct {v0, v3, v4, v1, v2}, Ljavax/jmdns/impl/constants/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V

    sput-object v0, Ljavax/jmdns/impl/constants/g;->CLOSED:Ljavax/jmdns/impl/constants/g;

    invoke-static {}, Ljavax/jmdns/impl/constants/g;->$values()[Ljavax/jmdns/impl/constants/g;

    move-result-object v0

    sput-object v0, Ljavax/jmdns/impl/constants/g;->$VALUES:[Ljavax/jmdns/impl/constants/g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljavax/jmdns/impl/constants/g$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljavax/jmdns/impl/constants/g$b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljavax/jmdns/impl/constants/g;->_name:Ljava/lang/String;

    iput-object p4, p0, Ljavax/jmdns/impl/constants/g;->_state:Ljavax/jmdns/impl/constants/g$b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ljavax/jmdns/impl/constants/g;
    .locals 1

    const-class v0, Ljavax/jmdns/impl/constants/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljavax/jmdns/impl/constants/g;

    return-object p0
.end method

.method public static values()[Ljavax/jmdns/impl/constants/g;
    .locals 1

    sget-object v0, Ljavax/jmdns/impl/constants/g;->$VALUES:[Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, [Ljavax/jmdns/impl/constants/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljavax/jmdns/impl/constants/g;

    return-object v0
.end method


# virtual methods
.method public final advance()Ljavax/jmdns/impl/constants/g;
    .locals 2

    sget-object v0, Ljavax/jmdns/impl/constants/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    return-object p0

    :pswitch_0
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CLOSED:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_1
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CLOSED:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_2
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CANCELED:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_3
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CANCELED:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_4
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CANCELING_3:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_5
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CANCELING_2:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_6
    sget-object v0, Ljavax/jmdns/impl/constants/g;->ANNOUNCED:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_7
    sget-object v0, Ljavax/jmdns/impl/constants/g;->ANNOUNCED:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_8
    sget-object v0, Ljavax/jmdns/impl/constants/g;->ANNOUNCING_2:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_9
    sget-object v0, Ljavax/jmdns/impl/constants/g;->ANNOUNCING_1:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_a
    sget-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_3:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_b
    sget-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_2:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
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

.method public final isAnnounced()Z
    .locals 2

    iget-object v0, p0, Ljavax/jmdns/impl/constants/g;->_state:Ljavax/jmdns/impl/constants/g$b;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->announced:Ljavax/jmdns/impl/constants/g$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isAnnouncing()Z
    .locals 2

    iget-object v0, p0, Ljavax/jmdns/impl/constants/g;->_state:Ljavax/jmdns/impl/constants/g$b;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->announcing:Ljavax/jmdns/impl/constants/g$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isCanceled()Z
    .locals 2

    iget-object v0, p0, Ljavax/jmdns/impl/constants/g;->_state:Ljavax/jmdns/impl/constants/g$b;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->canceled:Ljavax/jmdns/impl/constants/g$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isCanceling()Z
    .locals 2

    iget-object v0, p0, Ljavax/jmdns/impl/constants/g;->_state:Ljavax/jmdns/impl/constants/g$b;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->canceling:Ljavax/jmdns/impl/constants/g$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isClosed()Z
    .locals 2

    iget-object v0, p0, Ljavax/jmdns/impl/constants/g;->_state:Ljavax/jmdns/impl/constants/g$b;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->closed:Ljavax/jmdns/impl/constants/g$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isClosing()Z
    .locals 2

    iget-object v0, p0, Ljavax/jmdns/impl/constants/g;->_state:Ljavax/jmdns/impl/constants/g$b;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->closing:Ljavax/jmdns/impl/constants/g$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isProbing()Z
    .locals 2

    iget-object v0, p0, Ljavax/jmdns/impl/constants/g;->_state:Ljavax/jmdns/impl/constants/g$b;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->probing:Ljavax/jmdns/impl/constants/g$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final revert()Ljavax/jmdns/impl/constants/g;
    .locals 2

    sget-object v0, Ljavax/jmdns/impl/constants/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    return-object p0

    :pswitch_0
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CLOSED:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_1
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CLOSING:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_2
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CANCELED:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_3
    sget-object v0, Ljavax/jmdns/impl/constants/g;->CANCELING_1:Ljavax/jmdns/impl/constants/g;

    return-object v0

    :pswitch_4
    sget-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_1:Ljavax/jmdns/impl/constants/g;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljavax/jmdns/impl/constants/g;->_name:Ljava/lang/String;

    return-object v0
.end method
