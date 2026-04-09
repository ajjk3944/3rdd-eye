.class public final enum Lkotlin/reflect/jvm/internal/impl/renderer/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/renderer/v$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum ACTUAL:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final ALL:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/reflect/jvm/internal/impl/renderer/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final ALL_EXCEPT_ANNOTATIONS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/reflect/jvm/internal/impl/renderer/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum ANNOTATIONS:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum CONST:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final Companion:Lkotlin/reflect/jvm/internal/impl/renderer/v$a;

.field public static final enum DATA:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum EXPECT:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum FUN:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum INLINE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum INNER:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum LATEINIT:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum MEMBER_KIND:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum MODALITY:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum OVERRIDE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum VALUE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

.field public static final enum VISIBILITY:Lkotlin/reflect/jvm/internal/impl/renderer/v;


# instance fields
.field private final includeByDefault:Z


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/renderer/v;
    .locals 14

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->VISIBILITY:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/v;->MODALITY:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/renderer/v;->OVERRIDE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/renderer/v;->ANNOTATIONS:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/renderer/v;->INNER:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/renderer/v;->MEMBER_KIND:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v6, Lkotlin/reflect/jvm/internal/impl/renderer/v;->DATA:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v7, Lkotlin/reflect/jvm/internal/impl/renderer/v;->INLINE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v8, Lkotlin/reflect/jvm/internal/impl/renderer/v;->EXPECT:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v9, Lkotlin/reflect/jvm/internal/impl/renderer/v;->ACTUAL:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v10, Lkotlin/reflect/jvm/internal/impl/renderer/v;->CONST:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v11, Lkotlin/reflect/jvm/internal/impl/renderer/v;->LATEINIT:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v12, Lkotlin/reflect/jvm/internal/impl/renderer/v;->FUN:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    sget-object v13, Lkotlin/reflect/jvm/internal/impl/renderer/v;->VALUE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    filled-new-array/range {v0 .. v13}, [Lkotlin/reflect/jvm/internal/impl/renderer/v;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "VISIBILITY"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->VISIBILITY:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "MODALITY"

    invoke-direct {v0, v1, v3, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->MODALITY:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "OVERRIDE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->OVERRIDE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "ANNOTATIONS"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v2}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->ANNOTATIONS:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "INNER"

    const/4 v4, 0x4

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->INNER:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "MEMBER_KIND"

    const/4 v4, 0x5

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->MEMBER_KIND:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "DATA"

    const/4 v4, 0x6

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->DATA:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "INLINE"

    const/4 v4, 0x7

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->INLINE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "EXPECT"

    const/16 v4, 0x8

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->EXPECT:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "ACTUAL"

    const/16 v4, 0x9

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->ACTUAL:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "CONST"

    const/16 v4, 0xa

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->CONST:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "LATEINIT"

    const/16 v4, 0xb

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->LATEINIT:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "FUN"

    const/16 v4, 0xc

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->FUN:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    const-string v1, "VALUE"

    const/16 v4, 0xd

    invoke-direct {v0, v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->VALUE:Lkotlin/reflect/jvm/internal/impl/renderer/v;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/renderer/v;->$values()[Lkotlin/reflect/jvm/internal/impl/renderer/v;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/v;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->$ENTRIES:Lfh/a;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/renderer/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->Companion:Lkotlin/reflect/jvm/internal/impl/renderer/v$a;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/renderer/v;->values()[Lkotlin/reflect/jvm/internal/impl/renderer/v;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    iget-boolean v5, v4, Lkotlin/reflect/jvm/internal/impl/renderer/v;->includeByDefault:Z

    if-eqz v5, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->ALL_EXCEPT_ANNOTATIONS:Ljava/util/Set;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/renderer/v;->values()[Lkotlin/reflect/jvm/internal/impl/renderer/v;

    move-result-object v0

    invoke-static {v0}, LZg/n;->p1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->ALL:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->includeByDefault:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/renderer/v;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/renderer/v;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/renderer/v;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/v;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/v;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/renderer/v;

    return-object v0
.end method
