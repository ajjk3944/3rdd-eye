.class final enum Lme/E$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lme/E$a;

.field public static final enum EHT_CAPABILITIES:Lme/E$a;

.field public static final enum EHT_OPERATION:Lme/E$a;

.field public static final enum ERP:Lme/E$a;

.field public static final enum HE_CAPABILITIES:Lme/E$a;

.field public static final enum HT_CAPABILITIES:Lme/E$a;

.field public static final enum HT_RATES:Lme/E$a;

.field public static final enum HT_RATES_EXTENDED:Lme/E$a;

.field public static final enum QBSS_LOAD:Lme/E$a;

.field public static final enum TRANSMIT_POWER:Lme/E$a;

.field public static final enum VHT_CAPABILITIES:Lme/E$a;


# instance fields
.field private final coordinates:Lme/E$b;

.field private final id:I

.field private final idExt:I

.field private final length:Ljava/lang/Integer;


# direct methods
.method private static final synthetic $values()[Lme/E$a;
    .locals 10

    sget-object v0, Lme/E$a;->HT_RATES:Lme/E$a;

    sget-object v1, Lme/E$a;->HT_RATES_EXTENDED:Lme/E$a;

    sget-object v2, Lme/E$a;->QBSS_LOAD:Lme/E$a;

    sget-object v3, Lme/E$a;->ERP:Lme/E$a;

    sget-object v4, Lme/E$a;->TRANSMIT_POWER:Lme/E$a;

    sget-object v5, Lme/E$a;->HT_CAPABILITIES:Lme/E$a;

    sget-object v6, Lme/E$a;->VHT_CAPABILITIES:Lme/E$a;

    sget-object v7, Lme/E$a;->HE_CAPABILITIES:Lme/E$a;

    sget-object v8, Lme/E$a;->EHT_OPERATION:Lme/E$a;

    sget-object v9, Lme/E$a;->EHT_CAPABILITIES:Lme/E$a;

    filled-new-array/range {v0 .. v9}, [Lme/E$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lme/E$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v1, "HT_RATES"

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v6, Lme/E$a;->HT_RATES:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v8, "HT_RATES_EXTENDED"

    const/4 v9, 0x1

    const/16 v10, 0x32

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->HT_RATES_EXTENDED:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v2, "QBSS_LOAD"

    const/4 v3, 0x2

    const/16 v4, 0xb

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->QBSS_LOAD:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const-string v8, "ERP"

    const/4 v9, 0x3

    const/16 v10, 0x2a

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->ERP:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v2, "TRANSMIT_POWER"

    const/4 v3, 0x4

    const/16 v4, 0x23

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->TRANSMIT_POWER:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const-string v8, "HT_CAPABILITIES"

    const/4 v9, 0x5

    const/16 v10, 0x2d

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->HT_CAPABILITIES:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v2, "VHT_CAPABILITIES"

    const/4 v3, 0x6

    const/16 v4, 0xbf

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->VHT_CAPABILITIES:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/16 v11, 0x23

    const/4 v12, 0x0

    const-string v8, "HE_CAPABILITIES"

    const/4 v9, 0x7

    const/16 v10, 0xff

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->HE_CAPABILITIES:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/16 v5, 0x6a

    const/4 v6, 0x0

    const-string v2, "EHT_OPERATION"

    const/16 v3, 0x8

    const/16 v4, 0xff

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->EHT_OPERATION:Lme/E$a;

    new-instance v0, Lme/E$a;

    const/16 v11, 0x6c

    const-string v8, "EHT_CAPABILITIES"

    const/16 v9, 0x9

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lme/E$a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;)V

    sput-object v0, Lme/E$a;->EHT_CAPABILITIES:Lme/E$a;

    invoke-static {}, Lme/E$a;->$values()[Lme/E$a;

    move-result-object v0

    sput-object v0, Lme/E$a;->$VALUES:[Lme/E$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lme/E$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIILjava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lme/E$a;->id:I

    iput p4, p0, Lme/E$a;->idExt:I

    iput-object p5, p0, Lme/E$a;->length:Ljava/lang/Integer;

    new-instance p1, Lme/E$b;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p3, p2, p5}, Lme/E$b;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;)V

    iput-object p1, p0, Lme/E$a;->coordinates:Lme/E$b;

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lme/E$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lme/E$a;
    .locals 1

    const-class v0, Lme/E$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lme/E$a;

    return-object p0
.end method

.method public static values()[Lme/E$a;
    .locals 1

    sget-object v0, Lme/E$a;->$VALUES:[Lme/E$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lme/E$a;

    return-object v0
.end method


# virtual methods
.method public final getCoordinates()Lme/E$b;
    .locals 1

    iget-object v0, p0, Lme/E$a;->coordinates:Lme/E$b;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lme/E$a;->id:I

    return v0
.end method

.method public final getIdExt()I
    .locals 1

    iget v0, p0, Lme/E$a;->idExt:I

    return v0
.end method

.method public final getLength()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lme/E$a;->length:Ljava/lang/Integer;

    return-object v0
.end method
