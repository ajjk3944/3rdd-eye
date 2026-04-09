.class public final LCa/a$g$a$b;
.super LCa/a$g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCa/a$g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LCa/a$g$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCa/a$g$a$b;

    invoke-direct {v0}, LCa/a$g$a$b;-><init>()V

    sput-object v0, LCa/a$g$a$b;->a:LCa/a$g$a$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCa/a$g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "Changes or modifications not expressly approved by the party responsible for compliance could void the user\'s authority to operate the equipment.\nNOTE: This equipment has been tested and found to comply with the limits for a Class B digital device, pursuant to part 15 of the FCC Rules. These limits are designed to provide reasonable protection against harmful interference in a residential installation. This equipment generates, uses and can radiate radio frequency energy and, if not installed and used in accordance with the instructions, may cause harmful interference to radio communications. However, there is no guarantee that interference will not occur in a particular installation. If this equipment does cause harmful interference to radio or television reception, which can be determined by turning the equipment off and on, the user is encouraged to try to correct the interference by one or more of the following measures:\n      \u2014 Reorient or relocate the receiving antenna.\n      \u2014 Increase the separation between the equipment and receiver.\n      \u2014 Connect the equipment into an outlet on a circuit different from that to which the receiver is connected.\n      \u2014 Consult the dealer or an experienced radio/TV technician for help."

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCa/a$g$a$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x14703016

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "FCC_B"

    return-object v0
.end method
