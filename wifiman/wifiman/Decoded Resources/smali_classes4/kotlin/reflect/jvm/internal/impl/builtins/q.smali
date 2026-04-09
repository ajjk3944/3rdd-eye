.class public final enum Lkotlin/reflect/jvm/internal/impl/builtins/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/q;

.field public static final enum UBYTEARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

.field public static final enum UINTARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

.field public static final enum ULONGARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

.field public static final enum USHORTARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;


# instance fields
.field private final classId:LZh/b;

.field private final typeName:LZh/f;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/builtins/q;
    .locals 4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->UBYTEARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/q;->USHORTARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/q;->UINTARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/q;->ULONGARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    filled-new-array {v0, v1, v2, v3}, [Lkotlin/reflect/jvm/internal/impl/builtins/q;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;

    sget-object v1, LZh/b;->d:LZh/b$a;

    const-string v2, "kotlin/UByteArray"

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, LZh/b$a;->b(LZh/b$a;Ljava/lang/String;ZILjava/lang/Object;)LZh/b;

    move-result-object v2

    const-string v6, "UBYTEARRAY"

    invoke-direct {v0, v6, v3, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/q;-><init>(Ljava/lang/String;ILZh/b;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->UBYTEARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;

    const-string v2, "kotlin/UShortArray"

    invoke-static {v1, v2, v3, v4, v5}, LZh/b$a;->b(LZh/b$a;Ljava/lang/String;ZILjava/lang/Object;)LZh/b;

    move-result-object v2

    const-string v6, "USHORTARRAY"

    const/4 v7, 0x1

    invoke-direct {v0, v6, v7, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/q;-><init>(Ljava/lang/String;ILZh/b;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->USHORTARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;

    const-string v2, "kotlin/UIntArray"

    invoke-static {v1, v2, v3, v4, v5}, LZh/b$a;->b(LZh/b$a;Ljava/lang/String;ZILjava/lang/Object;)LZh/b;

    move-result-object v2

    const-string v6, "UINTARRAY"

    invoke-direct {v0, v6, v4, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/q;-><init>(Ljava/lang/String;ILZh/b;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->UINTARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;

    const-string v2, "kotlin/ULongArray"

    invoke-static {v1, v2, v3, v4, v5}, LZh/b$a;->b(LZh/b$a;Ljava/lang/String;ZILjava/lang/Object;)LZh/b;

    move-result-object v1

    const-string v2, "ULONGARRAY"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/q;-><init>(Ljava/lang/String;ILZh/b;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->ULONGARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/q;->$values()[Lkotlin/reflect/jvm/internal/impl/builtins/q;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/q;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILZh/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZh/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->classId:LZh/b;

    invoke-virtual {p3}, LZh/b;->h()LZh/f;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->typeName:LZh/f;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/builtins/q;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/builtins/q;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/builtins/q;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/builtins/q;

    return-object v0
.end method


# virtual methods
.method public final getTypeName()LZh/f;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->typeName:LZh/f;

    return-object v0
.end method
