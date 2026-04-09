.class public final enum Lkotlin/reflect/jvm/internal/impl/renderer/D;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/D;

.field public static final enum ALL:Lkotlin/reflect/jvm/internal/impl/renderer/D;

.field public static final enum NONE:Lkotlin/reflect/jvm/internal/impl/renderer/D;

.field public static final enum ONLY_NON_SYNTHESIZED:Lkotlin/reflect/jvm/internal/impl/renderer/D;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/renderer/D;
    .locals 3

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;->ALL:Lkotlin/reflect/jvm/internal/impl/renderer/D;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/D;->ONLY_NON_SYNTHESIZED:Lkotlin/reflect/jvm/internal/impl/renderer/D;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/renderer/D;->NONE:Lkotlin/reflect/jvm/internal/impl/renderer/D;

    filled-new-array {v0, v1, v2}, [Lkotlin/reflect/jvm/internal/impl/renderer/D;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/renderer/D;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;->ALL:Lkotlin/reflect/jvm/internal/impl/renderer/D;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;

    const-string v1, "ONLY_NON_SYNTHESIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/renderer/D;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;->ONLY_NON_SYNTHESIZED:Lkotlin/reflect/jvm/internal/impl/renderer/D;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/renderer/D;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;->NONE:Lkotlin/reflect/jvm/internal/impl/renderer/D;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/renderer/D;->$values()[Lkotlin/reflect/jvm/internal/impl/renderer/D;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/D;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/renderer/D;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/renderer/D;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/renderer/D;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/D;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/D;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/renderer/D;

    return-object v0
.end method
