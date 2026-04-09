.class public final Lo4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/l$b;
    }
.end annotation


# instance fields
.field private final a:LA4/A;


# direct methods
.method private constructor <init>(LA4/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/l;->a:LA4/A;

    return-void
.end method

.method public static a(Ljava/lang/String;[BLo4/l$b;)Lo4/l;
    .locals 2

    new-instance v0, Lo4/l;

    invoke-static {}, LA4/A;->b0()LA4/A$b;

    move-result-object v1

    invoke-virtual {v1, p0}, LA4/A$b;->u(Ljava/lang/String;)LA4/A$b;

    move-result-object p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p0, p1}, LA4/A$b;->w(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/A$b;

    move-result-object p0

    invoke-static {p2}, Lo4/l;->c(Lo4/l$b;)LA4/I;

    move-result-object p1

    invoke-virtual {p0, p1}, LA4/A$b;->t(LA4/I;)LA4/A$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/A;

    invoke-direct {v0, p0}, Lo4/l;-><init>(LA4/A;)V

    return-object v0
.end method

.method static c(Lo4/l$b;)LA4/I;
    .locals 1

    sget-object v0, Lo4/l$a;->b:[I

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

    sget-object p0, LA4/I;->CRUNCHY:LA4/I;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "Unknown output prefix type"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, LA4/I;->RAW:LA4/I;

    return-object p0

    :cond_2
    sget-object p0, LA4/I;->LEGACY:LA4/I;

    return-object p0

    :cond_3
    sget-object p0, LA4/I;->TINK:LA4/I;

    return-object p0
.end method


# virtual methods
.method b()LA4/A;
    .locals 1

    iget-object v0, p0, Lo4/l;->a:LA4/A;

    return-object v0
.end method
