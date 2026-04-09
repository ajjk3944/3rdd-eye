.class public final enum Lkotlin/reflect/jvm/internal/impl/builtins/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/r;

.field public static final enum UBYTE:Lkotlin/reflect/jvm/internal/impl/builtins/r;

.field public static final enum UINT:Lkotlin/reflect/jvm/internal/impl/builtins/r;

.field public static final enum ULONG:Lkotlin/reflect/jvm/internal/impl/builtins/r;

.field public static final enum USHORT:Lkotlin/reflect/jvm/internal/impl/builtins/r;


# instance fields
.field private final arrayClassId:LZh/b;

.field private final classId:LZh/b;

.field private final typeName:LZh/f;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/builtins/r;
    .locals 4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->UBYTE:Lkotlin/reflect/jvm/internal/impl/builtins/r;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/r;->USHORT:Lkotlin/reflect/jvm/internal/impl/builtins/r;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/r;->UINT:Lkotlin/reflect/jvm/internal/impl/builtins/r;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/r;->ULONG:Lkotlin/reflect/jvm/internal/impl/builtins/r;

    filled-new-array {v0, v1, v2, v3}, [Lkotlin/reflect/jvm/internal/impl/builtins/r;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;

    sget-object v1, LZh/b;->d:LZh/b$a;

    const-string v2, "kotlin/UByte"

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, LZh/b$a;->b(LZh/b$a;Ljava/lang/String;ZILjava/lang/Object;)LZh/b;

    move-result-object v2

    const-string v6, "UBYTE"

    invoke-direct {v0, v6, v3, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/r;-><init>(Ljava/lang/String;ILZh/b;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->UBYTE:Lkotlin/reflect/jvm/internal/impl/builtins/r;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;

    const-string v2, "kotlin/UShort"

    invoke-static {v1, v2, v3, v4, v5}, LZh/b$a;->b(LZh/b$a;Ljava/lang/String;ZILjava/lang/Object;)LZh/b;

    move-result-object v2

    const-string v6, "USHORT"

    const/4 v7, 0x1

    invoke-direct {v0, v6, v7, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/r;-><init>(Ljava/lang/String;ILZh/b;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->USHORT:Lkotlin/reflect/jvm/internal/impl/builtins/r;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;

    const-string v2, "kotlin/UInt"

    invoke-static {v1, v2, v3, v4, v5}, LZh/b$a;->b(LZh/b$a;Ljava/lang/String;ZILjava/lang/Object;)LZh/b;

    move-result-object v2

    const-string v6, "UINT"

    invoke-direct {v0, v6, v4, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/r;-><init>(Ljava/lang/String;ILZh/b;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->UINT:Lkotlin/reflect/jvm/internal/impl/builtins/r;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;

    const-string v2, "kotlin/ULong"

    invoke-static {v1, v2, v3, v4, v5}, LZh/b$a;->b(LZh/b$a;Ljava/lang/String;ZILjava/lang/Object;)LZh/b;

    move-result-object v1

    const-string v2, "ULONG"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/r;-><init>(Ljava/lang/String;ILZh/b;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->ULONG:Lkotlin/reflect/jvm/internal/impl/builtins/r;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->$values()[Lkotlin/reflect/jvm/internal/impl/builtins/r;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/r;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILZh/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZh/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->classId:LZh/b;

    invoke-virtual {p3}, LZh/b;->h()LZh/f;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->typeName:LZh/f;

    new-instance p2, LZh/b;

    invoke-virtual {p3}, LZh/b;->f()LZh/c;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "Array"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    const-string v0, "identifier(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p3, p1}, LZh/b;-><init>(LZh/c;LZh/f;)V

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->arrayClassId:LZh/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/builtins/r;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/builtins/r;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/builtins/r;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/r;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/builtins/r;

    return-object v0
.end method


# virtual methods
.method public final getArrayClassId()LZh/b;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->arrayClassId:LZh/b;

    return-object v0
.end method

.method public final getClassId()LZh/b;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->classId:LZh/b;

    return-object v0
.end method

.method public final getTypeName()LZh/f;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/r;->typeName:LZh/f;

    return-object v0
.end method
