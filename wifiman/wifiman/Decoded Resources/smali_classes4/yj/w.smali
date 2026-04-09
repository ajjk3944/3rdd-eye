.class public final enum Lyj/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lyj/w;

.field public static final enum ARRAY:Lyj/w;

.field public static final enum BINARY:Lyj/w;

.field public static final enum BOOLEAN:Lyj/w;

.field public static final enum EXTENSION:Lyj/w;

.field public static final enum FLOAT:Lyj/w;

.field public static final enum INTEGER:Lyj/w;

.field public static final enum MAP:Lyj/w;

.field public static final enum NIL:Lyj/w;

.field public static final enum STRING:Lyj/w;


# instance fields
.field private final numberType:Z

.field private final rawType:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lyj/w;

    const-string v1, "NIL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lyj/w;->NIL:Lyj/w;

    new-instance v1, Lyj/w;

    const-string v3, "BOOLEAN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2, v2}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v1, Lyj/w;->BOOLEAN:Lyj/w;

    new-instance v3, Lyj/w;

    const-string v5, "INTEGER"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4, v2}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v3, Lyj/w;->INTEGER:Lyj/w;

    new-instance v5, Lyj/w;

    const-string v6, "FLOAT"

    const/4 v7, 0x3

    invoke-direct {v5, v6, v7, v4, v2}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v5, Lyj/w;->FLOAT:Lyj/w;

    new-instance v6, Lyj/w;

    const-string v7, "STRING"

    const/4 v8, 0x4

    invoke-direct {v6, v7, v8, v2, v4}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v6, Lyj/w;->STRING:Lyj/w;

    new-instance v7, Lyj/w;

    const-string v8, "BINARY"

    const/4 v9, 0x5

    invoke-direct {v7, v8, v9, v2, v4}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v7, Lyj/w;->BINARY:Lyj/w;

    new-instance v8, Lyj/w;

    const-string v4, "ARRAY"

    const/4 v9, 0x6

    invoke-direct {v8, v4, v9, v2, v2}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v8, Lyj/w;->ARRAY:Lyj/w;

    new-instance v9, Lyj/w;

    const-string v4, "MAP"

    const/4 v10, 0x7

    invoke-direct {v9, v4, v10, v2, v2}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v9, Lyj/w;->MAP:Lyj/w;

    new-instance v10, Lyj/w;

    const-string v4, "EXTENSION"

    const/16 v11, 0x8

    invoke-direct {v10, v4, v11, v2, v2}, Lyj/w;-><init>(Ljava/lang/String;IZZ)V

    sput-object v10, Lyj/w;->EXTENSION:Lyj/w;

    move-object v2, v3

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    filled-new-array/range {v0 .. v8}, [Lyj/w;

    move-result-object v0

    sput-object v0, Lyj/w;->$VALUES:[Lyj/w;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lyj/w;->numberType:Z

    iput-boolean p4, p0, Lyj/w;->rawType:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyj/w;
    .locals 1

    const-class v0, Lyj/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyj/w;

    return-object p0
.end method

.method public static values()[Lyj/w;
    .locals 1

    sget-object v0, Lyj/w;->$VALUES:[Lyj/w;

    invoke-virtual {v0}, [Lyj/w;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyj/w;

    return-object v0
.end method


# virtual methods
.method public isArrayType()Z
    .locals 1

    sget-object v0, Lyj/w;->ARRAY:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isBinaryType()Z
    .locals 1

    sget-object v0, Lyj/w;->BINARY:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isBooleanType()Z
    .locals 1

    sget-object v0, Lyj/w;->BOOLEAN:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isExtensionType()Z
    .locals 1

    sget-object v0, Lyj/w;->EXTENSION:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isFloatType()Z
    .locals 1

    sget-object v0, Lyj/w;->FLOAT:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isIntegerType()Z
    .locals 1

    sget-object v0, Lyj/w;->INTEGER:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isMapType()Z
    .locals 1

    sget-object v0, Lyj/w;->MAP:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isNilType()Z
    .locals 1

    sget-object v0, Lyj/w;->NIL:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isNumberType()Z
    .locals 1

    iget-boolean v0, p0, Lyj/w;->numberType:Z

    return v0
.end method

.method public isRawType()Z
    .locals 1

    iget-boolean v0, p0, Lyj/w;->rawType:Z

    return v0
.end method

.method public isStringType()Z
    .locals 1

    sget-object v0, Lyj/w;->STRING:Lyj/w;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
