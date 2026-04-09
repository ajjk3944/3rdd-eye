.class public final enum Lorg/tensorflow/lite/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lorg/tensorflow/lite/a;

.field public static final enum BOOL:Lorg/tensorflow/lite/a;

.field public static final enum FLOAT32:Lorg/tensorflow/lite/a;

.field public static final enum INT32:Lorg/tensorflow/lite/a;

.field public static final enum INT64:Lorg/tensorflow/lite/a;

.field public static final enum INT8:Lorg/tensorflow/lite/a;

.field public static final enum STRING:Lorg/tensorflow/lite/a;

.field public static final enum UINT8:Lorg/tensorflow/lite/a;

.field private static final values:[Lorg/tensorflow/lite/a;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lorg/tensorflow/lite/a;

    const-string v1, "FLOAT32"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lorg/tensorflow/lite/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/tensorflow/lite/a;->FLOAT32:Lorg/tensorflow/lite/a;

    new-instance v1, Lorg/tensorflow/lite/a;

    const-string v2, "INT32"

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4}, Lorg/tensorflow/lite/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/tensorflow/lite/a;->INT32:Lorg/tensorflow/lite/a;

    new-instance v2, Lorg/tensorflow/lite/a;

    const-string v3, "UINT8"

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Lorg/tensorflow/lite/a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/tensorflow/lite/a;->UINT8:Lorg/tensorflow/lite/a;

    new-instance v3, Lorg/tensorflow/lite/a;

    const-string v4, "INT64"

    const/4 v6, 0x4

    invoke-direct {v3, v4, v5, v6}, Lorg/tensorflow/lite/a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lorg/tensorflow/lite/a;->INT64:Lorg/tensorflow/lite/a;

    new-instance v4, Lorg/tensorflow/lite/a;

    const-string v5, "STRING"

    const/4 v7, 0x5

    invoke-direct {v4, v5, v6, v7}, Lorg/tensorflow/lite/a;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lorg/tensorflow/lite/a;->STRING:Lorg/tensorflow/lite/a;

    new-instance v5, Lorg/tensorflow/lite/a;

    const-string v6, "BOOL"

    const/4 v8, 0x6

    invoke-direct {v5, v6, v7, v8}, Lorg/tensorflow/lite/a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lorg/tensorflow/lite/a;->BOOL:Lorg/tensorflow/lite/a;

    new-instance v6, Lorg/tensorflow/lite/a;

    const-string v7, "INT8"

    const/16 v9, 0x9

    invoke-direct {v6, v7, v8, v9}, Lorg/tensorflow/lite/a;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lorg/tensorflow/lite/a;->INT8:Lorg/tensorflow/lite/a;

    filled-new-array/range {v0 .. v6}, [Lorg/tensorflow/lite/a;

    move-result-object v0

    sput-object v0, Lorg/tensorflow/lite/a;->$VALUES:[Lorg/tensorflow/lite/a;

    invoke-static {}, Lorg/tensorflow/lite/a;->values()[Lorg/tensorflow/lite/a;

    move-result-object v0

    sput-object v0, Lorg/tensorflow/lite/a;->values:[Lorg/tensorflow/lite/a;

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

    iput p3, p0, Lorg/tensorflow/lite/a;->value:I

    return-void
.end method

.method static fromC(I)Lorg/tensorflow/lite/a;
    .locals 5

    sget-object v0, Lorg/tensorflow/lite/a;->values:[Lorg/tensorflow/lite/a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lorg/tensorflow/lite/a;->value:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DataType error: DataType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is not recognized in Java (version "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lorg/tensorflow/lite/TensorFlowLite;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/tensorflow/lite/a;
    .locals 1

    const-class v0, Lorg/tensorflow/lite/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/tensorflow/lite/a;

    return-object p0
.end method

.method public static values()[Lorg/tensorflow/lite/a;
    .locals 1

    sget-object v0, Lorg/tensorflow/lite/a;->$VALUES:[Lorg/tensorflow/lite/a;

    invoke-virtual {v0}, [Lorg/tensorflow/lite/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/tensorflow/lite/a;

    return-object v0
.end method


# virtual methods
.method public byteSize()I
    .locals 3

    sget-object v0, Lorg/tensorflow/lite/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, -0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DataType error: DataType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not supported yet"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    return v1

    :pswitch_1
    const/16 v0, 0x8

    return v0

    :pswitch_2
    const/4 v0, 0x1

    return v0

    :pswitch_3
    const/4 v0, 0x4

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method c()I
    .locals 1

    iget v0, p0, Lorg/tensorflow/lite/a;->value:I

    return v0
.end method

.method toStringName()Ljava/lang/String;
    .locals 3

    sget-object v0, Lorg/tensorflow/lite/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DataType error: DataType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not supported yet"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string v0, "string"

    return-object v0

    :pswitch_1
    const-string v0, "bool"

    return-object v0

    :pswitch_2
    const-string v0, "long"

    return-object v0

    :pswitch_3
    const-string v0, "byte"

    return-object v0

    :pswitch_4
    const-string v0, "int"

    return-object v0

    :pswitch_5
    const-string v0, "float"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
