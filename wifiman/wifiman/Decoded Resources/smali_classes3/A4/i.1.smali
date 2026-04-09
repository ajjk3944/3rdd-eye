.class public final LA4/i;
.super Lcom/google/crypto/tink/shaded/protobuf/w;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/i$b;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LA4/i;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x3

.field public static final PARAMS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/V; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/V;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private params_:LA4/k;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA4/i;

    invoke-direct {v0}, LA4/i;-><init>()V

    sput-object v0, LA4/i;->DEFAULT_INSTANCE:LA4/i;

    const-class v1, LA4/i;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->P(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/w;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/w;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, LA4/i;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method static synthetic T()LA4/i;
    .locals 1

    sget-object v0, LA4/i;->DEFAULT_INSTANCE:LA4/i;

    return-object v0
.end method

.method static synthetic U(LA4/i;I)V
    .locals 0

    invoke-direct {p0, p1}, LA4/i;->e0(I)V

    return-void
.end method

.method static synthetic V(LA4/i;LA4/k;)V
    .locals 0

    invoke-direct {p0, p1}, LA4/i;->d0(LA4/k;)V

    return-void
.end method

.method static synthetic W(LA4/i;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-direct {p0, p1}, LA4/i;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static a0()LA4/i$b;
    .locals 1

    sget-object v0, LA4/i;->DEFAULT_INSTANCE:LA4/i;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->o()Lcom/google/crypto/tink/shaded/protobuf/w$a;

    move-result-object v0

    check-cast v0, LA4/i$b;

    return-object v0
.end method

.method public static b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/i;
    .locals 1

    sget-object v0, LA4/i;->DEFAULT_INSTANCE:LA4/i;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->J(Lcom/google/crypto/tink/shaded/protobuf/w;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/i;

    return-object p0
.end method

.method private c0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LA4/i;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method private d0(LA4/k;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LA4/i;->params_:LA4/k;

    return-void
.end method

.method private e0(I)V
    .locals 0

    iput p1, p0, LA4/i;->version_:I

    return-void
.end method


# virtual methods
.method public X()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, LA4/i;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public Y()LA4/k;
    .locals 1

    iget-object v0, p0, LA4/i;->params_:LA4/k;

    if-nez v0, :cond_0

    invoke-static {}, LA4/k;->V()LA4/k;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public Z()I
    .locals 1

    iget v0, p0, LA4/i;->version_:I

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
    .locals 0

    sget-object p2, LA4/i$a;->a:[I

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
    sget-object p1, LA4/i;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    if-nez p1, :cond_1

    const-class p2, LA4/i;

    monitor-enter p2

    :try_start_0
    sget-object p1, LA4/i;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w$b;

    sget-object p3, LA4/i;->DEFAULT_INSTANCE:LA4/i;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/w$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V

    sput-object p1, LA4/i;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

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
    sget-object p1, LA4/i;->DEFAULT_INSTANCE:LA4/i;

    return-object p1

    :pswitch_4
    const-string/jumbo p1, "version_"

    const-string/jumbo p2, "params_"

    const-string/jumbo p3, "keyValue_"

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"

    sget-object p3, LA4/i;->DEFAULT_INSTANCE:LA4/i;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->H(Lcom/google/crypto/tink/shaded/protobuf/M;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LA4/i$b;

    invoke-direct {p1, p2}, LA4/i$b;-><init>(LA4/i$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LA4/i;

    invoke-direct {p1}, LA4/i;-><init>()V

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
