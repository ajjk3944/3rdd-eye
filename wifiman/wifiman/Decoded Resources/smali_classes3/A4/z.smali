.class public final enum LA4/z;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/y$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/z$b;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[LA4/z;

.field public static final enum DESTROYED:LA4/z;

.field public static final DESTROYED_VALUE:I = 0x3

.field public static final enum DISABLED:LA4/z;

.field public static final DISABLED_VALUE:I = 0x2

.field public static final enum ENABLED:LA4/z;

.field public static final ENABLED_VALUE:I = 0x1

.field public static final enum UNKNOWN_STATUS:LA4/z;

.field public static final UNKNOWN_STATUS_VALUE:I

.field public static final enum UNRECOGNIZED:LA4/z;

.field private static final internalValueMap:Lcom/google/crypto/tink/shaded/protobuf/y$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/y$b;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LA4/z;

    const-string/jumbo v1, "UNKNOWN_STATUS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LA4/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, LA4/z;->UNKNOWN_STATUS:LA4/z;

    new-instance v1, LA4/z;

    const-string/jumbo v2, "ENABLED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, LA4/z;-><init>(Ljava/lang/String;II)V

    sput-object v1, LA4/z;->ENABLED:LA4/z;

    new-instance v2, LA4/z;

    const-string v3, "DISABLED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, LA4/z;-><init>(Ljava/lang/String;II)V

    sput-object v2, LA4/z;->DISABLED:LA4/z;

    new-instance v3, LA4/z;

    const-string v4, "DESTROYED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, LA4/z;-><init>(Ljava/lang/String;II)V

    sput-object v3, LA4/z;->DESTROYED:LA4/z;

    new-instance v4, LA4/z;

    const/4 v5, 0x4

    const/4 v6, -0x1

    const-string/jumbo v7, "UNRECOGNIZED"

    invoke-direct {v4, v7, v5, v6}, LA4/z;-><init>(Ljava/lang/String;II)V

    sput-object v4, LA4/z;->UNRECOGNIZED:LA4/z;

    filled-new-array {v0, v1, v2, v3, v4}, [LA4/z;

    move-result-object v0

    sput-object v0, LA4/z;->$VALUES:[LA4/z;

    new-instance v0, LA4/z$a;

    invoke-direct {v0}, LA4/z$a;-><init>()V

    sput-object v0, LA4/z;->internalValueMap:Lcom/google/crypto/tink/shaded/protobuf/y$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LA4/z;->value:I

    return-void
.end method

.method public static forNumber(I)LA4/z;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LA4/z;->DESTROYED:LA4/z;

    return-object p0

    :cond_1
    sget-object p0, LA4/z;->DISABLED:LA4/z;

    return-object p0

    :cond_2
    sget-object p0, LA4/z;->ENABLED:LA4/z;

    return-object p0

    :cond_3
    sget-object p0, LA4/z;->UNKNOWN_STATUS:LA4/z;

    return-object p0
.end method

.method public static internalGetValueMap()Lcom/google/crypto/tink/shaded/protobuf/y$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/y$b;"
        }
    .end annotation

    sget-object v0, LA4/z;->internalValueMap:Lcom/google/crypto/tink/shaded/protobuf/y$b;

    return-object v0
.end method

.method public static internalGetVerifier()Lcom/google/crypto/tink/shaded/protobuf/y$c;
    .locals 1

    sget-object v0, LA4/z$b;->a:Lcom/google/crypto/tink/shaded/protobuf/y$c;

    return-object v0
.end method

.method public static valueOf(I)LA4/z;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, LA4/z;->forNumber(I)LA4/z;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LA4/z;
    .locals 1

    .line 1
    const-class v0, LA4/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LA4/z;

    return-object p0
.end method

.method public static values()[LA4/z;
    .locals 1

    sget-object v0, LA4/z;->$VALUES:[LA4/z;

    invoke-virtual {v0}, [LA4/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LA4/z;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, LA4/z;->UNRECOGNIZED:LA4/z;

    if-eq p0, v0, :cond_0

    iget v0, p0, LA4/z;->value:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
