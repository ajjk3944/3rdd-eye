.class public final LA4/C;
.super Lcom/google/crypto/tink/shaded/protobuf/w;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/C$b;,
        LA4/C$c;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LA4/C;

.field public static final KEY_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/V; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/V;"
        }
    .end annotation
.end field

.field public static final PRIMARY_KEY_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private key_:Lcom/google/crypto/tink/shaded/protobuf/y$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/y$d;"
        }
    .end annotation
.end field

.field private primaryKeyId_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA4/C;

    invoke-direct {v0}, LA4/C;-><init>()V

    sput-object v0, LA4/C;->DEFAULT_INSTANCE:LA4/C;

    const-class v1, LA4/C;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->P(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/w;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/w;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/w;->s()Lcom/google/crypto/tink/shaded/protobuf/y$d;

    move-result-object v0

    iput-object v0, p0, LA4/C;->key_:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    return-void
.end method

.method static synthetic T()LA4/C;
    .locals 1

    sget-object v0, LA4/C;->DEFAULT_INSTANCE:LA4/C;

    return-object v0
.end method

.method static synthetic U(LA4/C;I)V
    .locals 0

    invoke-direct {p0, p1}, LA4/C;->f0(I)V

    return-void
.end method

.method static synthetic V(LA4/C;LA4/C$c;)V
    .locals 0

    invoke-direct {p0, p1}, LA4/C;->W(LA4/C$c;)V

    return-void
.end method

.method private W(LA4/C$c;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, LA4/C;->X()V

    iget-object v0, p0, LA4/C;->key_:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private X()V
    .locals 2

    iget-object v0, p0, LA4/C;->key_:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->E()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->F(Lcom/google/crypto/tink/shaded/protobuf/y$d;)Lcom/google/crypto/tink/shaded/protobuf/y$d;

    move-result-object v0

    iput-object v0, p0, LA4/C;->key_:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    :cond_0
    return-void
.end method

.method public static c0()LA4/C$b;
    .locals 1

    sget-object v0, LA4/C;->DEFAULT_INSTANCE:LA4/C;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->o()Lcom/google/crypto/tink/shaded/protobuf/w$a;

    move-result-object v0

    check-cast v0, LA4/C$b;

    return-object v0
.end method

.method public static d0(Ljava/io/InputStream;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/C;
    .locals 1

    sget-object v0, LA4/C;->DEFAULT_INSTANCE:LA4/C;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->K(Lcom/google/crypto/tink/shaded/protobuf/w;Ljava/io/InputStream;Lcom/google/crypto/tink/shaded/protobuf/o;)Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/C;

    return-object p0
.end method

.method public static e0([BLcom/google/crypto/tink/shaded/protobuf/o;)LA4/C;
    .locals 1

    sget-object v0, LA4/C;->DEFAULT_INSTANCE:LA4/C;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->L(Lcom/google/crypto/tink/shaded/protobuf/w;[BLcom/google/crypto/tink/shaded/protobuf/o;)Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/C;

    return-object p0
.end method

.method private f0(I)V
    .locals 0

    iput p1, p0, LA4/C;->primaryKeyId_:I

    return-void
.end method


# virtual methods
.method public Y(I)LA4/C$c;
    .locals 1

    iget-object v0, p0, LA4/C;->key_:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA4/C$c;

    return-object p1
.end method

.method public Z()I
    .locals 1

    iget-object v0, p0, LA4/C;->key_:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public a0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LA4/C;->key_:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    return-object v0
.end method

.method public b0()I
    .locals 1

    iget v0, p0, LA4/C;->primaryKeyId_:I

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

    sget-object p2, LA4/C$a;->a:[I

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
    sget-object p1, LA4/C;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    if-nez p1, :cond_1

    const-class p2, LA4/C;

    monitor-enter p2

    :try_start_0
    sget-object p1, LA4/C;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/w$b;

    sget-object p3, LA4/C;->DEFAULT_INSTANCE:LA4/C;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/w$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V

    sput-object p1, LA4/C;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/V;

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
    sget-object p1, LA4/C;->DEFAULT_INSTANCE:LA4/C;

    return-object p1

    :pswitch_4
    const-string/jumbo p1, "primaryKeyId_"

    const-string/jumbo p2, "key_"

    const-class p3, LA4/C$c;

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object p3, LA4/C;->DEFAULT_INSTANCE:LA4/C;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->H(Lcom/google/crypto/tink/shaded/protobuf/M;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LA4/C$b;

    invoke-direct {p1, p2}, LA4/C$b;-><init>(LA4/C$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LA4/C;

    invoke-direct {p1}, LA4/C;-><init>()V

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
