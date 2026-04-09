.class public final enum Lkotlin/reflect/jvm/internal/impl/renderer/E;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/E;

.field public static final enum DEBUG:Lkotlin/reflect/jvm/internal/impl/renderer/E;

.field public static final enum NONE:Lkotlin/reflect/jvm/internal/impl/renderer/E;

.field public static final enum PRETTY:Lkotlin/reflect/jvm/internal/impl/renderer/E;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/renderer/E;
    .locals 3

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;->PRETTY:Lkotlin/reflect/jvm/internal/impl/renderer/E;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/E;->DEBUG:Lkotlin/reflect/jvm/internal/impl/renderer/E;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/renderer/E;->NONE:Lkotlin/reflect/jvm/internal/impl/renderer/E;

    filled-new-array {v0, v1, v2}, [Lkotlin/reflect/jvm/internal/impl/renderer/E;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;

    const-string v1, "PRETTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/renderer/E;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;->PRETTY:Lkotlin/reflect/jvm/internal/impl/renderer/E;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;

    const-string v1, "DEBUG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/renderer/E;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;->DEBUG:Lkotlin/reflect/jvm/internal/impl/renderer/E;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/renderer/E;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;->NONE:Lkotlin/reflect/jvm/internal/impl/renderer/E;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/renderer/E;->$values()[Lkotlin/reflect/jvm/internal/impl/renderer/E;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/E;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/renderer/E;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/renderer/E;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/renderer/E;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/E;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/E;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/renderer/E;

    return-object v0
.end method
