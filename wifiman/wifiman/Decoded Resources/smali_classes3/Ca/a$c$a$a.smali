.class public final LCa/a$c$a$a;
.super LCa/a$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCa/a$c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LCa/a$c$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCa/a$c$a$a;

    invoke-direct {v0}, LCa/a$c$a$a;-><init>()V

    sput-object v0, LCa/a$c$a$a;->a:LCa/a$c$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCa/a$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "This device complies with ISED Canada license-exempt RSS standard(s). Operation is subject to the following two conditions:\n      1. This device may not cause interference, and\n      2. This device must accept any interference received, including interference that may cause undesired operation.\n      \nLe pr\u00e9sent appareil est conforme aux CNR d\'ISDE Canada applicables aux appareils radio exempts de licence. L\'exploitation est autoris\u00e9e aux deux conditions suivantes:\n      1. L\'appareil ne doit pas produire de brouillage\n      2. L\'appareil doit accepter tout brouillage radio\u00e9lectrique subi, m\u00eame si le brouillage est susceptible d\'en compromettre le fonctionnement."

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCa/a$c$a$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x11334fd0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "IC"

    return-object v0
.end method
