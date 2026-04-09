.class public final enum Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

.field public static final enum TELEPORT:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;


# instance fields
.field private final alias:Ljava/lang/String;

.field private final generator:Lmh/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmh/a;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->TELEPORT:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    filled-new-array {v0}, [Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    new-instance v1, Lsc/a;

    invoke-direct {v1}, Lsc/a;-><init>()V

    const-string v2, "TELEPORT"

    const/4 v3, 0x0

    const-string v4, "teleport"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;-><init>(Ljava/lang/String;ILjava/lang/String;Lmh/a;)V

    sput-object v0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->TELEPORT:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-static {}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->$values()[Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->$VALUES:[Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lmh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lmh/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->alias:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->generator:Lmh/a;

    return-void
.end method

.method private static final _init_$lambda$0()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->_init_$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->$VALUES:[Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    return-object v0
.end method


# virtual methods
.method public final getAlias()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->alias:Ljava/lang/String;

    return-object v0
.end method

.method public final getGenerator()Lmh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->generator:Lmh/a;

    return-object v0
.end method
