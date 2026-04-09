.class public final enum Lkotlin/text/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkotlin/text/r;

.field public static final enum CANON_EQ:Lkotlin/text/r;

.field public static final enum COMMENTS:Lkotlin/text/r;

.field public static final enum DOT_MATCHES_ALL:Lkotlin/text/r;

.field public static final enum IGNORE_CASE:Lkotlin/text/r;

.field public static final enum LITERAL:Lkotlin/text/r;

.field public static final enum MULTILINE:Lkotlin/text/r;

.field public static final enum UNIX_LINES:Lkotlin/text/r;


# instance fields
.field private final mask:I

.field private final value:I


# direct methods
.method private static final synthetic $values()[Lkotlin/text/r;
    .locals 7

    sget-object v0, Lkotlin/text/r;->IGNORE_CASE:Lkotlin/text/r;

    sget-object v1, Lkotlin/text/r;->MULTILINE:Lkotlin/text/r;

    sget-object v2, Lkotlin/text/r;->LITERAL:Lkotlin/text/r;

    sget-object v3, Lkotlin/text/r;->UNIX_LINES:Lkotlin/text/r;

    sget-object v4, Lkotlin/text/r;->COMMENTS:Lkotlin/text/r;

    sget-object v5, Lkotlin/text/r;->DOT_MATCHES_ALL:Lkotlin/text/r;

    sget-object v6, Lkotlin/text/r;->CANON_EQ:Lkotlin/text/r;

    filled-new-array/range {v0 .. v6}, [Lkotlin/text/r;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 15

    new-instance v7, Lkotlin/text/r;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v1, "IGNORE_CASE"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lkotlin/text/r;-><init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lkotlin/text/r;->IGNORE_CASE:Lkotlin/text/r;

    new-instance v0, Lkotlin/text/r;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const-string v9, "MULTILINE"

    const/4 v10, 0x1

    const/16 v11, 0x8

    const/4 v12, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lkotlin/text/r;-><init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/text/r;->MULTILINE:Lkotlin/text/r;

    new-instance v0, Lkotlin/text/r;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v2, "LITERAL"

    const/16 v4, 0x10

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lkotlin/text/r;-><init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/text/r;->LITERAL:Lkotlin/text/r;

    new-instance v0, Lkotlin/text/r;

    const-string v9, "UNIX_LINES"

    const/4 v10, 0x3

    const/4 v11, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lkotlin/text/r;-><init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/text/r;->UNIX_LINES:Lkotlin/text/r;

    new-instance v0, Lkotlin/text/r;

    const-string v2, "COMMENTS"

    const/4 v3, 0x4

    const/4 v4, 0x4

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lkotlin/text/r;-><init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/text/r;->COMMENTS:Lkotlin/text/r;

    new-instance v0, Lkotlin/text/r;

    const-string v9, "DOT_MATCHES_ALL"

    const/4 v10, 0x5

    const/16 v11, 0x20

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lkotlin/text/r;-><init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/text/r;->DOT_MATCHES_ALL:Lkotlin/text/r;

    new-instance v0, Lkotlin/text/r;

    const-string v2, "CANON_EQ"

    const/4 v3, 0x6

    const/16 v4, 0x80

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lkotlin/text/r;-><init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/text/r;->CANON_EQ:Lkotlin/text/r;

    invoke-static {}, Lkotlin/text/r;->$values()[Lkotlin/text/r;

    move-result-object v0

    sput-object v0, Lkotlin/text/r;->$VALUES:[Lkotlin/text/r;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkotlin/text/r;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lkotlin/text/r;->value:I

    iput p4, p0, Lkotlin/text/r;->mask:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    move p4, p3

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlin/text/r;-><init>(Ljava/lang/String;III)V

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lkotlin/text/r;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/text/r;
    .locals 1

    const-class v0, Lkotlin/text/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/text/r;

    return-object p0
.end method

.method public static values()[Lkotlin/text/r;
    .locals 1

    sget-object v0, Lkotlin/text/r;->$VALUES:[Lkotlin/text/r;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/text/r;

    return-object v0
.end method


# virtual methods
.method public getMask()I
    .locals 1

    iget v0, p0, Lkotlin/text/r;->mask:I

    return v0
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, Lkotlin/text/r;->value:I

    return v0
.end method
