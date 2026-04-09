.class final enum Lnd/h$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnd/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lnd/h$a;

.field public static final enum G2_CDMA:Lnd/h$a;

.field public static final enum G2_EDGE:Lnd/h$a;

.field public static final enum G2_GPRS:Lnd/h$a;

.field public static final enum G2_IDEN:Lnd/h$a;

.field public static final enum G2_RTXX1:Lnd/h$a;

.field public static final enum G3_EVDO_0:Lnd/h$a;

.field public static final enum G3_EVDO_A:Lnd/h$a;

.field public static final enum G3_EVDO_B:Lnd/h$a;

.field public static final enum G3_HSDPA:Lnd/h$a;

.field public static final enum G3_HSPA:Lnd/h$a;

.field public static final enum G3_HSPAP:Lnd/h$a;

.field public static final enum G3_HSUPA:Lnd/h$a;

.field public static final enum G3_TD_Scma:Lnd/h$a;

.field public static final enum G3_UMTS:Lnd/h$a;

.field public static final enum G4_EHRPD:Lnd/h$a;

.field public static final enum G4_LTE:Lnd/h$a;

.field public static final enum G4_LTE_ADVANCED:Lnd/h$a;

.field public static final enum G4_LTE_CA:Lnd/h$a;

.field public static final enum G5_IWLAN:Lnd/h$a;

.field public static final enum G5_NR:Lnd/h$a;

.field public static final enum G5_NR_ADVANCED:Lnd/h$a;

.field public static final enum GSM:Lnd/h$a;


# instance fields
.field private final dbId:Ljava/lang/String;

.field private final type:LV7/b;


# direct methods
.method private static final synthetic $values()[Lnd/h$a;
    .locals 22

    sget-object v0, Lnd/h$a;->GSM:Lnd/h$a;

    sget-object v1, Lnd/h$a;->G2_EDGE:Lnd/h$a;

    sget-object v2, Lnd/h$a;->G2_GPRS:Lnd/h$a;

    sget-object v3, Lnd/h$a;->G2_CDMA:Lnd/h$a;

    sget-object v4, Lnd/h$a;->G2_IDEN:Lnd/h$a;

    sget-object v5, Lnd/h$a;->G2_RTXX1:Lnd/h$a;

    sget-object v6, Lnd/h$a;->G3_UMTS:Lnd/h$a;

    sget-object v7, Lnd/h$a;->G3_HSDPA:Lnd/h$a;

    sget-object v8, Lnd/h$a;->G3_HSPA:Lnd/h$a;

    sget-object v9, Lnd/h$a;->G3_HSPAP:Lnd/h$a;

    sget-object v10, Lnd/h$a;->G3_EVDO_0:Lnd/h$a;

    sget-object v11, Lnd/h$a;->G3_EVDO_A:Lnd/h$a;

    sget-object v12, Lnd/h$a;->G3_EVDO_B:Lnd/h$a;

    sget-object v13, Lnd/h$a;->G3_TD_Scma:Lnd/h$a;

    sget-object v14, Lnd/h$a;->G3_HSUPA:Lnd/h$a;

    sget-object v15, Lnd/h$a;->G4_EHRPD:Lnd/h$a;

    sget-object v16, Lnd/h$a;->G4_LTE:Lnd/h$a;

    sget-object v17, Lnd/h$a;->G4_LTE_CA:Lnd/h$a;

    sget-object v18, Lnd/h$a;->G4_LTE_ADVANCED:Lnd/h$a;

    sget-object v19, Lnd/h$a;->G5_IWLAN:Lnd/h$a;

    sget-object v20, Lnd/h$a;->G5_NR:Lnd/h$a;

    sget-object v21, Lnd/h$a;->G5_NR_ADVANCED:Lnd/h$a;

    filled-new-array/range {v0 .. v21}, [Lnd/h$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lnd/h$a;

    const-string v1, "gsm"

    sget-object v2, LV7/b$e;->a:LV7/b$e;

    const-string v3, "GSM"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->GSM:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g2_edge"

    sget-object v2, LV7/b$a$b;->a:LV7/b$a$b;

    const-string v3, "G2_EDGE"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G2_EDGE:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g2_gprs"

    sget-object v2, LV7/b$a$c;->a:LV7/b$a$c;

    const-string v3, "G2_GPRS"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G2_GPRS:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g2_cdma"

    sget-object v2, LV7/b$a$a;->a:LV7/b$a$a;

    const-string v3, "G2_CDMA"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G2_CDMA:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g2_iden"

    sget-object v2, LV7/b$a$d;->a:LV7/b$a$d;

    const-string v3, "G2_IDEN"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G2_IDEN:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g2_rttx1"

    sget-object v2, LV7/b$a$e;->a:LV7/b$a$e;

    const-string v3, "G2_RTXX1"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G2_RTXX1:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_umts"

    sget-object v2, LV7/b$b$i;->a:LV7/b$b$i;

    const-string v3, "G3_UMTS"

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_UMTS:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_hdspa"

    sget-object v2, LV7/b$b$d;->a:LV7/b$b$d;

    const-string v3, "G3_HSDPA"

    const/4 v4, 0x7

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_HSDPA:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_hspa"

    sget-object v2, LV7/b$b$e;->a:LV7/b$b$e;

    const-string v3, "G3_HSPA"

    const/16 v4, 0x8

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_HSPA:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_hspap"

    sget-object v2, LV7/b$b$f;->a:LV7/b$b$f;

    const-string v3, "G3_HSPAP"

    const/16 v4, 0x9

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_HSPAP:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_evdo_0"

    sget-object v2, LV7/b$b$a;->a:LV7/b$b$a;

    const-string v3, "G3_EVDO_0"

    const/16 v4, 0xa

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_EVDO_0:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_evdo_a"

    sget-object v2, LV7/b$b$b;->a:LV7/b$b$b;

    const-string v3, "G3_EVDO_A"

    const/16 v4, 0xb

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_EVDO_A:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_evdo_b"

    sget-object v2, LV7/b$b$c;->a:LV7/b$b$c;

    const-string v3, "G3_EVDO_B"

    const/16 v4, 0xc

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_EVDO_B:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_td_scma"

    sget-object v2, LV7/b$b$h;->a:LV7/b$b$h;

    const-string v3, "G3_TD_Scma"

    const/16 v4, 0xd

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_TD_Scma:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g3_hsupa"

    sget-object v2, LV7/b$b$g;->a:LV7/b$b$g;

    const-string v3, "G3_HSUPA"

    const/16 v4, 0xe

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G3_HSUPA:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g4_ehrpd"

    sget-object v2, LV7/b$c$a;->a:LV7/b$c$a;

    const-string v3, "G4_EHRPD"

    const/16 v4, 0xf

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G4_EHRPD:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g4_lte"

    sget-object v2, LV7/b$c$b;->a:LV7/b$c$b;

    const-string v3, "G4_LTE"

    const/16 v4, 0x10

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G4_LTE:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g4_lte_ca"

    sget-object v2, LV7/b$c$d;->a:LV7/b$c$d;

    const-string v3, "G4_LTE_CA"

    const/16 v4, 0x11

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G4_LTE_CA:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g4_lte_advanced"

    sget-object v2, LV7/b$c$c;->a:LV7/b$c$c;

    const-string v3, "G4_LTE_ADVANCED"

    const/16 v4, 0x12

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G4_LTE_ADVANCED:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const-string v1, "g5_iwlan"

    sget-object v2, LV7/b$d$a;->a:LV7/b$d$a;

    const-string v3, "G5_IWLAN"

    const/16 v4, 0x13

    invoke-direct {v0, v3, v4, v1, v2}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G5_IWLAN:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    sget-object v1, LV7/b$d$b;->a:LV7/b$d$b;

    const-string v2, "G5_NR"

    const/16 v3, 0x14

    const-string v4, "g5_nr"

    invoke-direct {v0, v2, v3, v4, v1}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G5_NR:Lnd/h$a;

    new-instance v0, Lnd/h$a;

    const/16 v2, 0x15

    const-string v3, "g5_nr_advanced"

    const-string v4, "G5_NR_ADVANCED"

    invoke-direct {v0, v4, v2, v3, v1}, Lnd/h$a;-><init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V

    sput-object v0, Lnd/h$a;->G5_NR_ADVANCED:Lnd/h$a;

    invoke-static {}, Lnd/h$a;->$values()[Lnd/h$a;

    move-result-object v0

    sput-object v0, Lnd/h$a;->$VALUES:[Lnd/h$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lnd/h$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;LV7/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LV7/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnd/h$a;->dbId:Ljava/lang/String;

    iput-object p4, p0, Lnd/h$a;->type:LV7/b;

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

    sget-object v0, Lnd/h$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnd/h$a;
    .locals 1

    const-class v0, Lnd/h$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnd/h$a;

    return-object p0
.end method

.method public static values()[Lnd/h$a;
    .locals 1

    sget-object v0, Lnd/h$a;->$VALUES:[Lnd/h$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnd/h$a;

    return-object v0
.end method


# virtual methods
.method public final getDbId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnd/h$a;->dbId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()LV7/b;
    .locals 1

    iget-object v0, p0, Lnd/h$a;->type:LV7/b;

    return-object v0
.end method
