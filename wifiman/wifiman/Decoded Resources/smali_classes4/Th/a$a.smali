.class public final enum LTh/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTh/a$a$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LTh/a$a;

.field public static final enum CLASS:LTh/a$a;

.field public static final Companion:LTh/a$a$a;

.field public static final enum FILE_FACADE:LTh/a$a;

.field public static final enum MULTIFILE_CLASS:LTh/a$a;

.field public static final enum MULTIFILE_CLASS_PART:LTh/a$a;

.field public static final enum SYNTHETIC_CLASS:LTh/a$a;

.field public static final enum UNKNOWN:LTh/a$a;

.field private static final entryById:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "LTh/a$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final id:I


# direct methods
.method private static final synthetic $values()[LTh/a$a;
    .locals 6

    sget-object v0, LTh/a$a;->UNKNOWN:LTh/a$a;

    sget-object v1, LTh/a$a;->CLASS:LTh/a$a;

    sget-object v2, LTh/a$a;->FILE_FACADE:LTh/a$a;

    sget-object v3, LTh/a$a;->SYNTHETIC_CLASS:LTh/a$a;

    sget-object v4, LTh/a$a;->MULTIFILE_CLASS:LTh/a$a;

    sget-object v5, LTh/a$a;->MULTIFILE_CLASS_PART:LTh/a$a;

    filled-new-array/range {v0 .. v5}, [LTh/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LTh/a$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LTh/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTh/a$a;->UNKNOWN:LTh/a$a;

    new-instance v0, LTh/a$a;

    const-string v1, "CLASS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, LTh/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTh/a$a;->CLASS:LTh/a$a;

    new-instance v0, LTh/a$a;

    const-string v1, "FILE_FACADE"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v3}, LTh/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTh/a$a;->FILE_FACADE:LTh/a$a;

    new-instance v0, LTh/a$a;

    const-string v1, "SYNTHETIC_CLASS"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v3}, LTh/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTh/a$a;->SYNTHETIC_CLASS:LTh/a$a;

    new-instance v0, LTh/a$a;

    const-string v1, "MULTIFILE_CLASS"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v3}, LTh/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTh/a$a;->MULTIFILE_CLASS:LTh/a$a;

    new-instance v0, LTh/a$a;

    const-string v1, "MULTIFILE_CLASS_PART"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v3}, LTh/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTh/a$a;->MULTIFILE_CLASS_PART:LTh/a$a;

    invoke-static {}, LTh/a$a;->$values()[LTh/a$a;

    move-result-object v0

    sput-object v0, LTh/a$a;->$VALUES:[LTh/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LTh/a$a;->$ENTRIES:Lfh/a;

    new-instance v0, LTh/a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LTh/a$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LTh/a$a;->Companion:LTh/a$a$a;

    invoke-static {}, LTh/a$a;->values()[LTh/a$a;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v3, 0x10

    invoke-static {v1, v3}, Lsh/m;->d(II)I

    move-result v1

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    iget v5, v4, LTh/a$a;->id:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sput-object v3, LTh/a$a;->entryById:Ljava/util/Map;

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

    iput p3, p0, LTh/a$a;->id:I

    return-void
.end method

.method public static final synthetic access$getEntryById$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, LTh/a$a;->entryById:Ljava/util/Map;

    return-object v0
.end method

.method public static final getById(I)LTh/a$a;
    .locals 1

    sget-object v0, LTh/a$a;->Companion:LTh/a$a$a;

    invoke-virtual {v0, p0}, LTh/a$a$a;->a(I)LTh/a$a;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LTh/a$a;
    .locals 1

    const-class v0, LTh/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTh/a$a;

    return-object p0
.end method

.method public static values()[LTh/a$a;
    .locals 1

    sget-object v0, LTh/a$a;->$VALUES:[LTh/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTh/a$a;

    return-object v0
.end method
