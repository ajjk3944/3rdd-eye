.class public final enum LBh/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LBh/f;

.field public static final enum ANNOTATION_CLASS:LBh/f;

.field public static final enum CLASS:LBh/f;

.field public static final enum ENUM_CLASS:LBh/f;

.field public static final enum ENUM_ENTRY:LBh/f;

.field public static final enum INTERFACE:LBh/f;

.field public static final enum OBJECT:LBh/f;


# instance fields
.field private final codeRepresentation:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LBh/f;
    .locals 6

    sget-object v0, LBh/f;->CLASS:LBh/f;

    sget-object v1, LBh/f;->INTERFACE:LBh/f;

    sget-object v2, LBh/f;->ENUM_CLASS:LBh/f;

    sget-object v3, LBh/f;->ENUM_ENTRY:LBh/f;

    sget-object v4, LBh/f;->ANNOTATION_CLASS:LBh/f;

    sget-object v5, LBh/f;->OBJECT:LBh/f;

    filled-new-array/range {v0 .. v5}, [LBh/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LBh/f;

    const/4 v1, 0x0

    const-string v2, "class"

    const-string v3, "CLASS"

    invoke-direct {v0, v3, v1, v2}, LBh/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LBh/f;->CLASS:LBh/f;

    new-instance v0, LBh/f;

    const/4 v1, 0x1

    const-string v2, "interface"

    const-string v3, "INTERFACE"

    invoke-direct {v0, v3, v1, v2}, LBh/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LBh/f;->INTERFACE:LBh/f;

    new-instance v0, LBh/f;

    const/4 v1, 0x2

    const-string v2, "enum class"

    const-string v3, "ENUM_CLASS"

    invoke-direct {v0, v3, v1, v2}, LBh/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LBh/f;->ENUM_CLASS:LBh/f;

    new-instance v0, LBh/f;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const-string v3, "ENUM_ENTRY"

    invoke-direct {v0, v3, v1, v2}, LBh/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LBh/f;->ENUM_ENTRY:LBh/f;

    new-instance v0, LBh/f;

    const/4 v1, 0x4

    const-string v2, "annotation class"

    const-string v3, "ANNOTATION_CLASS"

    invoke-direct {v0, v3, v1, v2}, LBh/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LBh/f;->ANNOTATION_CLASS:LBh/f;

    new-instance v0, LBh/f;

    const/4 v1, 0x5

    const-string v2, "object"

    const-string v3, "OBJECT"

    invoke-direct {v0, v3, v1, v2}, LBh/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LBh/f;->OBJECT:LBh/f;

    invoke-static {}, LBh/f;->$values()[LBh/f;

    move-result-object v0

    sput-object v0, LBh/f;->$VALUES:[LBh/f;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LBh/f;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LBh/f;->codeRepresentation:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LBh/f;
    .locals 1

    const-class v0, LBh/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LBh/f;

    return-object p0
.end method

.method public static values()[LBh/f;
    .locals 1

    sget-object v0, LBh/f;->$VALUES:[LBh/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBh/f;

    return-object v0
.end method


# virtual methods
.method public final isSingleton()Z
    .locals 1

    sget-object v0, LBh/f;->OBJECT:LBh/f;

    if-eq p0, v0, :cond_1

    sget-object v0, LBh/f;->ENUM_ENTRY:LBh/f;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
