.class public final enum Lkotlin/reflect/jvm/internal/impl/builtins/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/builtins/l$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field public static final enum BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field public static final enum BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field public static final enum CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field public static final Companion:Lkotlin/reflect/jvm/internal/impl/builtins/l$a;

.field public static final enum DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field public static final enum FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field public static final enum INT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field public static final enum LONG:Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field public static final NUMBER_TYPES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/reflect/jvm/internal/impl/builtins/l;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/l;


# instance fields
.field private final arrayTypeFqName$delegate:LYg/m;

.field private final arrayTypeName:LZh/f;

.field private final typeFqName$delegate:LYg/m;

.field private final typeName:LZh/f;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 8

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/l;->CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/l;->SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/l;->INT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/builtins/l;->FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    sget-object v6, Lkotlin/reflect/jvm/internal/impl/builtins/l;->LONG:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    sget-object v7, Lkotlin/reflect/jvm/internal/impl/builtins/l;->DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    filled-new-array/range {v0 .. v7}, [Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const/4 v1, 0x0

    const-string v2, "Boolean"

    const-string v3, "BOOLEAN"

    invoke-direct {v0, v3, v1, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    new-instance v4, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const/4 v0, 0x1

    const-string v1, "Char"

    const-string v2, "CHAR"

    invoke-direct {v4, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/l;->CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    new-instance v5, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const/4 v0, 0x2

    const-string v1, "Byte"

    const-string v2, "BYTE"

    invoke-direct {v5, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    new-instance v6, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const/4 v0, 0x3

    const-string v1, "Short"

    const-string v2, "SHORT"

    invoke-direct {v6, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lkotlin/reflect/jvm/internal/impl/builtins/l;->SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    new-instance v7, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const/4 v0, 0x4

    const-string v1, "Int"

    const-string v2, "INT"

    invoke-direct {v7, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lkotlin/reflect/jvm/internal/impl/builtins/l;->INT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    new-instance v8, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const/4 v0, 0x5

    const-string v1, "Float"

    const-string v2, "FLOAT"

    invoke-direct {v8, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lkotlin/reflect/jvm/internal/impl/builtins/l;->FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    new-instance v9, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const/4 v0, 0x6

    const-string v1, "Long"

    const-string v2, "LONG"

    invoke-direct {v9, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lkotlin/reflect/jvm/internal/impl/builtins/l;->LONG:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    new-instance v10, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const/4 v0, 0x7

    const-string v1, "Double"

    const-string v2, "DOUBLE"

    invoke-direct {v10, v2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lkotlin/reflect/jvm/internal/impl/builtins/l;->DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/l;->$values()[Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->$ENTRIES:Lfh/a;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->Companion:Lkotlin/reflect/jvm/internal/impl/builtins/l$a;

    filled-new-array/range {v4 .. v10}, [Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->NUMBER_TYPES:Ljava/util/Set;

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

    invoke-static {p3}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    const-string p2, "identifier(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->typeName:LZh/f;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "Array"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->arrayTypeName:LZh/f;

    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance p2, Lkotlin/reflect/jvm/internal/impl/builtins/j;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/j;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/l;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->typeFqName$delegate:LYg/m;

    new-instance p2, Lkotlin/reflect/jvm/internal/impl/builtins/k;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/k;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/l;)V

    invoke-static {p1, p2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->arrayTypeFqName$delegate:LYg/m;

    return-void
.end method

.method static synthetic accessor$PrimitiveType$lambda0(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LZh/c;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/l;->typeFqName_delegate$lambda$0(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LZh/c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic accessor$PrimitiveType$lambda1(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LZh/c;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/l;->arrayTypeFqName_delegate$lambda$1(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LZh/c;

    move-result-object p0

    return-object p0
.end method

.method private static final arrayTypeFqName_delegate$lambda$1(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LZh/c;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->arrayTypeName:LZh/f;

    invoke-virtual {v0, p0}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object p0

    const-string v0, "child(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final typeFqName_delegate$lambda$0(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LZh/c;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->typeName:LZh/f;

    invoke-virtual {v0, p0}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object p0

    const-string v0, "child(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/builtins/l;

    return-object v0
.end method


# virtual methods
.method public final getArrayTypeFqName()LZh/c;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->arrayTypeFqName$delegate:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZh/c;

    return-object v0
.end method

.method public final getArrayTypeName()LZh/f;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->arrayTypeName:LZh/f;

    return-object v0
.end method

.method public final getTypeFqName()LZh/c;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->typeFqName$delegate:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZh/c;

    return-object v0
.end method

.method public final getTypeName()LZh/f;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->typeName:LZh/f;

    return-object v0
.end method
