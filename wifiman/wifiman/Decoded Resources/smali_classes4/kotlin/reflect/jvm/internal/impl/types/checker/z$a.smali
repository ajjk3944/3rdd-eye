.class abstract enum Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/types/checker/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$a;,
        Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$b;,
        Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$c;,
        Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$d;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

.field public static final enum ACCEPT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

.field public static final enum NOT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

.field public static final enum START:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

.field public static final enum UNKNOWN:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
    .locals 4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->START:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->ACCEPT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->UNKNOWN:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->NOT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    filled-new-array {v0, v1, v2, v3}, [Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$c;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->START:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$a;

    const-string v1, "ACCEPT_NULL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->ACCEPT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$d;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->UNKNOWN:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$b;

    const-string v1, "NOT_NULL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->NOT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->$values()[Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    return-object v0
.end method


# virtual methods
.method public abstract combine(Lpi/M0;)Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
.end method

.method protected final getResultNullability(Lpi/M0;)Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/S;->O0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->ACCEPT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lpi/y;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lpi/y;

    invoke-virtual {v0}, Lpi/y;->Z0()Lpi/d0;

    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/r;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/r;

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/r;->a(Lpi/M0;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->NOT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    goto :goto_0

    :cond_2
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;->UNKNOWN:Lkotlin/reflect/jvm/internal/impl/types/checker/z$a;

    :goto_0
    return-object p1
.end method
