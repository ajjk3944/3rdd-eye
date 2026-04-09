.class public final enum Lw5/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lw5/b;

.field public static final enum BEGIN_ARRAY:Lw5/b;

.field public static final enum BEGIN_OBJECT:Lw5/b;

.field public static final enum BOOLEAN:Lw5/b;

.field public static final enum END_ARRAY:Lw5/b;

.field public static final enum END_DOCUMENT:Lw5/b;

.field public static final enum END_OBJECT:Lw5/b;

.field public static final enum NAME:Lw5/b;

.field public static final enum NULL:Lw5/b;

.field public static final enum NUMBER:Lw5/b;

.field public static final enum STRING:Lw5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lw5/b;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw5/b;->BEGIN_ARRAY:Lw5/b;

    new-instance v1, Lw5/b;

    const-string/jumbo v2, "END_ARRAY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw5/b;->END_ARRAY:Lw5/b;

    new-instance v2, Lw5/b;

    const-string v3, "BEGIN_OBJECT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lw5/b;->BEGIN_OBJECT:Lw5/b;

    new-instance v3, Lw5/b;

    const-string/jumbo v4, "END_OBJECT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw5/b;->END_OBJECT:Lw5/b;

    new-instance v4, Lw5/b;

    const-string/jumbo v5, "NAME"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lw5/b;->NAME:Lw5/b;

    new-instance v5, Lw5/b;

    const-string/jumbo v6, "STRING"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw5/b;->STRING:Lw5/b;

    new-instance v6, Lw5/b;

    const-string/jumbo v7, "NUMBER"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lw5/b;->NUMBER:Lw5/b;

    new-instance v7, Lw5/b;

    const-string v8, "BOOLEAN"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lw5/b;->BOOLEAN:Lw5/b;

    new-instance v8, Lw5/b;

    const-string/jumbo v9, "NULL"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lw5/b;->NULL:Lw5/b;

    new-instance v9, Lw5/b;

    const-string/jumbo v10, "END_DOCUMENT"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11}, Lw5/b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lw5/b;->END_DOCUMENT:Lw5/b;

    filled-new-array/range {v0 .. v9}, [Lw5/b;

    move-result-object v0

    sput-object v0, Lw5/b;->$VALUES:[Lw5/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lw5/b;
    .locals 1

    const-class v0, Lw5/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw5/b;

    return-object p0
.end method

.method public static values()[Lw5/b;
    .locals 1

    sget-object v0, Lw5/b;->$VALUES:[Lw5/b;

    invoke-virtual {v0}, [Lw5/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw5/b;

    return-object v0
.end method
