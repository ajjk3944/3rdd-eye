.class public final LA4/g;
.super Lcom/google/crypto/tink/shaded/protobuf/w;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/g$b;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LA4/g;

.field public static final KEY_SIZE_FIELD_NUMBER:I = 0x2

.field public static final PARAMS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/V;"
        }
    .end annotation
.end field


# instance fields
.field private keySize_:I

.field private params_:LA4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA4/g;

    invoke-direct {v0}, LA4/g;-><init>()V

    sput-object v0, LA4/g;->DEFAULT_INSTANCE:LA4/g;

    const-class v1, LA4/g;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->P(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/w;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/w;-><init>()V

    return-void
.end method

.method static synthetic T()LA4/g;
    .locals 1

    sget-object v0, LA4/g;->DEFAULT_INSTANCE:LA4/g;

    return-object v0
.end method

.method static synthetic U(LA4/g;LA4/h;)V
    .locals 0

    invoke-direct {p0, p1}, LA4/g;->c0(LA4/h;)V

    return-void
.end method

.method static synthetic V(LA4/g;I)V
    .locals 0

    invoke-direct {p0, p1}, LA4/g;->b0(I)V

    return-void
.end method

.method public static W()LA4/g;
    .locals 1

    sget-object v0, LA4/g;->DEFAULT_INSTANCE:LA4/g;

    return-object v0
.end method

.method public static Z()LA4/g$b;
    .locals 1

    sget-object v0, LA4/g;->DEFAULT_INSTANCE:LA4/g;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->o()Lcom/google/crypto/tink/shaded/protobuf/w$a;

    move-result-object v0

    check-cast v0, LA4/g$b;

    return-object v0
.end method

.method public static a0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/g;
    .locals 1

    sget-object v0, LA4/g;->DEFAULT_INSTANCE:LA4/g;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->J(Lcom/google/crypto/tink/shaded/protobuf/w;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/g;

    return-object p0
.end method

.method private b0(I)V
    .locals 0

    iput p1, p0, LA4/g;->keySize_:I

    return-void
.end method

.method private c0(LA4/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LA4/g;->params_:LA4/h;

    return-void
.end method


# virtual methods
.method public X()I
    .locals 1

    iget v0, p0, LA4/g;->keySize_:I

    return v0
.end method

.method public Y()LA4/h;
    .locals 1

    iget-object v0, p0, LA4/g;->params_:LA4/h;

    if-nez v0, :cond_0

    invoke-static {}, LA4/h;->V()LA4/h;

    move-result-object v0

    :cond_0
    return-object v0
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
    .locals 0

    sget-object p2, LA4/g$a;->a:[I

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
    sget-object p1, LA4/g;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    if-nez p1, :cond_1

    const-class p2, LA4/g;

    monitor-enter p2

    :try_start_0
    sget-object p1, LA4/g;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w$b;

    sget-object p3, LA4/g;->DEFAULT_INSTANCE:LA4/g;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/w$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V

    sput-object p1, LA4/g;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

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
    sget-object p1, LA4/g;->DEFAULT_INSTANCE:LA4/g;

    return-object p1

    :pswitch_4
    const-string/jumbo p1, "params_"

    const-string/jumbo p2, "keySize_"

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b"

    sget-object p3, LA4/g;->DEFAULT_INSTANCE:LA4/g;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->H(Lcom/google/crypto/tink/shaded/protobuf/M;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LA4/g$b;

    invoke-direct {p1, p2}, LA4/g$b;-><init>(LA4/g$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LA4/g;

    invoke-direct {p1}, LA4/g;-><init>()V

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
