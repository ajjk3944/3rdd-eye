.class abstract enum Lvj/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvj/c$a$a;,
        Lvj/c$a$b;,
        Lvj/c$a$c;,
        Lvj/c$a$d;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lvj/c$a;

.field public static final enum ALLOW_EXPLICIT:Lvj/c$a;

.field public static final enum ALLOW_SILENT:Lvj/c$a;

.field public static final Companion:Lvj/c$a$c;

.field public static final enum FORBID:Lvj/c$a;


# direct methods
.method private static final synthetic $values()[Lvj/c$a;
    .locals 3

    sget-object v0, Lvj/c$a;->ALLOW_SILENT:Lvj/c$a;

    sget-object v1, Lvj/c$a;->ALLOW_EXPLICIT:Lvj/c$a;

    sget-object v2, Lvj/c$a;->FORBID:Lvj/c$a;

    filled-new-array {v0, v1, v2}, [Lvj/c$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvj/c$a$b;

    const-string v1, "ALLOW_SILENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvj/c$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvj/c$a;->ALLOW_SILENT:Lvj/c$a;

    new-instance v0, Lvj/c$a$a;

    const-string v1, "ALLOW_EXPLICIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lvj/c$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvj/c$a;->ALLOW_EXPLICIT:Lvj/c$a;

    new-instance v0, Lvj/c$a$d;

    const-string/jumbo v1, "FORBID"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lvj/c$a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvj/c$a;->FORBID:Lvj/c$a;

    invoke-static {}, Lvj/c$a;->$values()[Lvj/c$a;

    move-result-object v0

    sput-object v0, Lvj/c$a;->$VALUES:[Lvj/c$a;

    new-instance v0, Lvj/c$a$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvj/c$a$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvj/c$a;->Companion:Lvj/c$a$c;

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
    invoke-direct {p0, p1, p2}, Lvj/c$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lvj/c$a;
    .locals 1

    const-class v0, Lvj/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvj/c$a;

    return-object p0
.end method

.method public static values()[Lvj/c$a;
    .locals 1

    sget-object v0, Lvj/c$a;->$VALUES:[Lvj/c$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvj/c$a;

    return-object v0
.end method


# virtual methods
.method public abstract isAllowed()Z
.end method

.method public abstract must(Ljava/lang/Boolean;)Ljava/lang/Boolean;
.end method
