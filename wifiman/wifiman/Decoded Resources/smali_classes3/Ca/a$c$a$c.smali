.class public final LCa/a$c$a$c;
.super LCa/a$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCa/a$c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:LCa/a$c$a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCa/a$c$a$c;

    invoke-direct {v0}, LCa/a$c$a$c;-><init>()V

    sput-object v0, LCa/a$c$a$c;->a:LCa/a$c$a$c;

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

    const-string/jumbo v0, "Radiation Exposure Statement:\n\n- The device has been evaluated to meet general RF exposure requirement. The device can be used in portable exposure condition without restriction.\n\n- This transmitter must not be co-located or operating in conjunction with any other antenna or transmitter.\n\nD\u00e9claration d\u2019exposition aux radiations:\n\n- L\u2019appareil a \u00e9t\u00e9 \u00e9valu\u00e9 pour r\u00e9pondre aux exigences g\u00e9n\u00e9rales d\u2019exposition aux RF. L\u2019appareil peut \u00eatre utilis\u00e9 sans restriction dans des conditions d\u2019exposition portables.\n\n- Cet \u00e9metteur ne doit pas \u00eatre colocalis\u00e9 ou fonctionner en conjonction avec une autre antenne ou \u00e9metteur."

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCa/a$c$a$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x1536cfce

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "SAR"

    return-object v0
.end method
