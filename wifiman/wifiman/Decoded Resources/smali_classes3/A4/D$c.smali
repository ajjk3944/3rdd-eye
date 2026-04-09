.class public final LA4/D$c;
.super Lcom/google/crypto/tink/shaded/protobuf/w;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA4/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/D$c$a;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LA4/D$c;

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/V; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/V;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I

.field private typeUrl_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA4/D$c;

    invoke-direct {v0}, LA4/D$c;-><init>()V

    sput-object v0, LA4/D$c;->DEFAULT_INSTANCE:LA4/D$c;

    const-class v1, LA4/D$c;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->P(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/w;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/w;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LA4/D$c;->typeUrl_:Ljava/lang/String;

    return-void
.end method

.method static synthetic T()LA4/D$c;
    .locals 1

    sget-object v0, LA4/D$c;->DEFAULT_INSTANCE:LA4/D$c;

    return-object v0
.end method

.method static synthetic U(LA4/D$c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, LA4/D$c;->d0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V(LA4/D$c;LA4/I;)V
    .locals 0

    invoke-direct {p0, p1}, LA4/D$c;->b0(LA4/I;)V

    return-void
.end method

.method static synthetic W(LA4/D$c;LA4/z;)V
    .locals 0

    invoke-direct {p0, p1}, LA4/D$c;->c0(LA4/z;)V

    return-void
.end method

.method static synthetic X(LA4/D$c;I)V
    .locals 0

    invoke-direct {p0, p1}, LA4/D$c;->a0(I)V

    return-void
.end method

.method public static Z()LA4/D$c$a;
    .locals 1

    sget-object v0, LA4/D$c;->DEFAULT_INSTANCE:LA4/D$c;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->o()Lcom/google/crypto/tink/shaded/protobuf/w$a;

    move-result-object v0

    check-cast v0, LA4/D$c$a;

    return-object v0
.end method

.method private a0(I)V
    .locals 0

    iput p1, p0, LA4/D$c;->keyId_:I

    return-void
.end method

.method private b0(LA4/I;)V
    .locals 0

    invoke-virtual {p1}, LA4/I;->getNumber()I

    move-result p1

    iput p1, p0, LA4/D$c;->outputPrefixType_:I

    return-void
.end method

.method private c0(LA4/z;)V
    .locals 0

    invoke-virtual {p1}, LA4/z;->getNumber()I

    move-result p1

    iput p1, p0, LA4/D$c;->status_:I

    return-void
.end method

.method private d0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LA4/D$c;->typeUrl_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public Y()I
    .locals 1

    iget v0, p0, LA4/D$c;->keyId_:I

    return v0
.end method

.method public bridge synthetic c()Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/w;->u()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/google/crypto/tink/shaded/protobuf/M$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/w;->G()Lcom/google/crypto/tink/shaded/protobuf/w$a;

    move-result-object v0

    return-object v0
.end method

.method protected final r(Lcom/google/crypto/tink/shaded/protobuf/w$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LA4/D$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, LA4/D$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    if-nez p1, :cond_1

    const-class p2, LA4/D$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, LA4/D$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w$b;

    sget-object p3, LA4/D$c;->DEFAULT_INSTANCE:LA4/D$c;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/w$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V

    sput-object p1, LA4/D$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_3
    sget-object p1, LA4/D$c;->DEFAULT_INSTANCE:LA4/D$c;

    return-object p1

    :pswitch_4
    const-string/jumbo p1, "typeUrl_"

    const-string/jumbo p2, "status_"

    const-string/jumbo p3, "keyId_"

    const-string/jumbo v0, "outputPrefixType_"

    filled-new-array {p1, p2, p3, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object p3, LA4/D$c;->DEFAULT_INSTANCE:LA4/D$c;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->H(Lcom/google/crypto/tink/shaded/protobuf/M;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LA4/D$c$a;

    invoke-direct {p1, p2}, LA4/D$c$a;-><init>(LA4/D$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LA4/D$c;

    invoke-direct {p1}, LA4/D$c;-><init>()V

    return-object p1

    nop

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
