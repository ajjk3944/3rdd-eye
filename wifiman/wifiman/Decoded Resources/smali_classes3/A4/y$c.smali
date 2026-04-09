.class public final enum LA4/y$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA4/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/y$c$b;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[LA4/y$c;

.field public static final enum ASYMMETRIC_PRIVATE:LA4/y$c;

.field public static final ASYMMETRIC_PRIVATE_VALUE:I = 0x2

.field public static final enum ASYMMETRIC_PUBLIC:LA4/y$c;

.field public static final ASYMMETRIC_PUBLIC_VALUE:I = 0x3

.field public static final enum REMOTE:LA4/y$c;

.field public static final REMOTE_VALUE:I = 0x4

.field public static final enum SYMMETRIC:LA4/y$c;

.field public static final SYMMETRIC_VALUE:I = 0x1

.field public static final enum UNKNOWN_KEYMATERIAL:LA4/y$c;

.field public static final UNKNOWN_KEYMATERIAL_VALUE:I

.field public static final enum UNRECOGNIZED:LA4/y$c;

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
    .locals 9

    new-instance v0, LA4/y$c;

    const-string/jumbo v1, "UNKNOWN_KEYMATERIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LA4/y$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LA4/y$c;->UNKNOWN_KEYMATERIAL:LA4/y$c;

    new-instance v1, LA4/y$c;

    const-string/jumbo v2, "SYMMETRIC"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, LA4/y$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, LA4/y$c;->SYMMETRIC:LA4/y$c;

    new-instance v2, LA4/y$c;

    const-string v3, "ASYMMETRIC_PRIVATE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, LA4/y$c;-><init>(Ljava/lang/String;II)V

    sput-object v2, LA4/y$c;->ASYMMETRIC_PRIVATE:LA4/y$c;

    new-instance v3, LA4/y$c;

    const-string v4, "ASYMMETRIC_PUBLIC"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, LA4/y$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, LA4/y$c;->ASYMMETRIC_PUBLIC:LA4/y$c;

    new-instance v4, LA4/y$c;

    const-string/jumbo v5, "REMOTE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, LA4/y$c;-><init>(Ljava/lang/String;II)V

    sput-object v4, LA4/y$c;->REMOTE:LA4/y$c;

    new-instance v5, LA4/y$c;

    const/4 v6, 0x5

    const/4 v7, -0x1

    const-string/jumbo v8, "UNRECOGNIZED"

    invoke-direct {v5, v8, v6, v7}, LA4/y$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, LA4/y$c;->UNRECOGNIZED:LA4/y$c;

    filled-new-array/range {v0 .. v5}, [LA4/y$c;

    move-result-object v0

    sput-object v0, LA4/y$c;->$VALUES:[LA4/y$c;

    new-instance v0, LA4/y$c$a;

    invoke-direct {v0}, LA4/y$c$a;-><init>()V

    sput-object v0, LA4/y$c;->internalValueMap:Lcom/google/crypto/tink/shaded/protobuf/y$b;

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

    iput p3, p0, LA4/y$c;->value:I

    return-void
.end method

.method public static forNumber(I)LA4/y$c;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LA4/y$c;->REMOTE:LA4/y$c;

    return-object p0

    :cond_1
    sget-object p0, LA4/y$c;->ASYMMETRIC_PUBLIC:LA4/y$c;

    return-object p0

    :cond_2
    sget-object p0, LA4/y$c;->ASYMMETRIC_PRIVATE:LA4/y$c;

    return-object p0

    :cond_3
    sget-object p0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object p0

    :cond_4
    sget-object p0, LA4/y$c;->UNKNOWN_KEYMATERIAL:LA4/y$c;

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

    sget-object v0, LA4/y$c;->internalValueMap:Lcom/google/crypto/tink/shaded/protobuf/y$b;

    return-object v0
.end method

.method public static internalGetVerifier()Lcom/google/crypto/tink/shaded/protobuf/y$c;
    .locals 1

    sget-object v0, LA4/y$c$b;->a:Lcom/google/crypto/tink/shaded/protobuf/y$c;

    return-object v0
.end method

.method public static valueOf(I)LA4/y$c;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, LA4/y$c;->forNumber(I)LA4/y$c;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LA4/y$c;
    .locals 1

    .line 1
    const-class v0, LA4/y$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LA4/y$c;

    return-object p0
.end method

.method public static values()[LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->$VALUES:[LA4/y$c;

    invoke-virtual {v0}, [LA4/y$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LA4/y$c;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, LA4/y$c;->UNRECOGNIZED:LA4/y$c;

    if-eq p0, v0, :cond_0

    iget v0, p0, LA4/y$c;->value:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
