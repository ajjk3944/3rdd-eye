.class public final enum Lb3/w$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lb3/w$b;

.field public static final enum CDMA:Lb3/w$b;

.field public static final enum COMBINED:Lb3/w$b;

.field public static final enum EDGE:Lb3/w$b;

.field public static final enum EHRPD:Lb3/w$b;

.field public static final enum EVDO_0:Lb3/w$b;

.field public static final enum EVDO_A:Lb3/w$b;

.field public static final enum EVDO_B:Lb3/w$b;

.field public static final enum GPRS:Lb3/w$b;

.field public static final enum GSM:Lb3/w$b;

.field public static final enum HSDPA:Lb3/w$b;

.field public static final enum HSPA:Lb3/w$b;

.field public static final enum HSPAP:Lb3/w$b;

.field public static final enum HSUPA:Lb3/w$b;

.field public static final enum IDEN:Lb3/w$b;

.field public static final enum IWLAN:Lb3/w$b;

.field public static final enum LTE:Lb3/w$b;

.field public static final enum LTE_CA:Lb3/w$b;

.field public static final enum RTT:Lb3/w$b;

.field public static final enum TD_SCDMA:Lb3/w$b;

.field public static final enum UMTS:Lb3/w$b;

.field public static final enum UNKNOWN_MOBILE_SUBTYPE:Lb3/w$b;

.field private static final valueMap:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lb3/w$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 61

    new-instance v15, Lb3/w$b;

    move-object v0, v15

    const-string v1, "UNKNOWN_MOBILE_SUBTYPE"

    const/4 v14, 0x0

    invoke-direct {v15, v1, v14, v14}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lb3/w$b;->UNKNOWN_MOBILE_SUBTYPE:Lb3/w$b;

    new-instance v13, Lb3/w$b;

    move-object v1, v13

    const-string v2, "GPRS"

    const/4 v12, 0x1

    invoke-direct {v13, v2, v12, v12}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lb3/w$b;->GPRS:Lb3/w$b;

    new-instance v11, Lb3/w$b;

    move-object v2, v11

    const-string v3, "EDGE"

    const/4 v10, 0x2

    invoke-direct {v11, v3, v10, v10}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lb3/w$b;->EDGE:Lb3/w$b;

    new-instance v9, Lb3/w$b;

    move-object v3, v9

    const-string v4, "UMTS"

    const/4 v8, 0x3

    invoke-direct {v9, v4, v8, v8}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lb3/w$b;->UMTS:Lb3/w$b;

    new-instance v7, Lb3/w$b;

    move-object v4, v7

    const-string v5, "CDMA"

    const/4 v6, 0x4

    invoke-direct {v7, v5, v6, v6}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lb3/w$b;->CDMA:Lb3/w$b;

    new-instance v5, Lb3/w$b;

    move-object/from16 v21, v5

    const-string v6, "EVDO_0"

    move-object/from16 v22, v0

    const/4 v0, 0x5

    move-object/from16 v23, v1

    move-object/from16 v1, v21

    invoke-direct {v1, v6, v0, v0}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb3/w$b;->EVDO_0:Lb3/w$b;

    new-instance v6, Lb3/w$b;

    move-object/from16 v21, v6

    const-string v0, "EVDO_A"

    move-object/from16 v24, v1

    const/4 v1, 0x6

    move-object/from16 v25, v2

    move-object/from16 v2, v21

    invoke-direct {v2, v0, v1, v1}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lb3/w$b;->EVDO_A:Lb3/w$b;

    new-instance v0, Lb3/w$b;

    move-object/from16 v26, v7

    move-object v7, v0

    const-string v1, "RTT"

    move-object/from16 v27, v2

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb3/w$b;->RTT:Lb3/w$b;

    new-instance v1, Lb3/w$b;

    move-object v8, v1

    const-string v2, "HSDPA"

    move-object/from16 v28, v0

    const/16 v0, 0x8

    invoke-direct {v1, v2, v0, v0}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb3/w$b;->HSDPA:Lb3/w$b;

    new-instance v2, Lb3/w$b;

    move-object/from16 v29, v9

    move-object v9, v2

    const-string v0, "HSUPA"

    move-object/from16 v30, v1

    const/16 v1, 0x9

    invoke-direct {v2, v0, v1, v1}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lb3/w$b;->HSUPA:Lb3/w$b;

    new-instance v0, Lb3/w$b;

    move-object v10, v0

    const-string v1, "HSPA"

    move-object/from16 v31, v2

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v2}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb3/w$b;->HSPA:Lb3/w$b;

    new-instance v1, Lb3/w$b;

    move-object/from16 v32, v11

    move-object v11, v1

    const-string v2, "IDEN"

    move-object/from16 v33, v0

    const/16 v0, 0xb

    invoke-direct {v1, v2, v0, v0}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb3/w$b;->IDEN:Lb3/w$b;

    new-instance v2, Lb3/w$b;

    move-object v12, v2

    const-string v0, "EVDO_B"

    move-object/from16 v34, v1

    const/16 v1, 0xc

    invoke-direct {v2, v0, v1, v1}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lb3/w$b;->EVDO_B:Lb3/w$b;

    new-instance v0, Lb3/w$b;

    move-object/from16 v35, v13

    move-object v13, v0

    const-string v1, "LTE"

    move-object/from16 v36, v2

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, v2}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb3/w$b;->LTE:Lb3/w$b;

    new-instance v1, Lb3/w$b;

    move-object v14, v1

    const-string v2, "EHRPD"

    move-object/from16 v37, v0

    const/16 v0, 0xe

    invoke-direct {v1, v2, v0, v0}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb3/w$b;->EHRPD:Lb3/w$b;

    new-instance v2, Lb3/w$b;

    move-object/from16 v38, v15

    move-object v15, v2

    const-string v0, "HSPAP"

    move-object/from16 v39, v1

    const/16 v1, 0xf

    invoke-direct {v2, v0, v1, v1}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lb3/w$b;->HSPAP:Lb3/w$b;

    new-instance v0, Lb3/w$b;

    move-object/from16 v16, v0

    const-string v1, "GSM"

    move-object/from16 v40, v2

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2, v2}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb3/w$b;->GSM:Lb3/w$b;

    new-instance v1, Lb3/w$b;

    move-object/from16 v17, v1

    const-string v2, "TD_SCDMA"

    move-object/from16 v41, v0

    const/16 v0, 0x11

    invoke-direct {v1, v2, v0, v0}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb3/w$b;->TD_SCDMA:Lb3/w$b;

    new-instance v2, Lb3/w$b;

    move-object/from16 v18, v2

    const-string v0, "IWLAN"

    move-object/from16 v42, v1

    const/16 v1, 0x12

    invoke-direct {v2, v0, v1, v1}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lb3/w$b;->IWLAN:Lb3/w$b;

    new-instance v0, Lb3/w$b;

    move-object/from16 v19, v0

    const-string v1, "LTE_CA"

    move-object/from16 v43, v2

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2, v2}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb3/w$b;->LTE_CA:Lb3/w$b;

    new-instance v1, Lb3/w$b;

    move-object/from16 v20, v1

    const/16 v2, 0x14

    move-object/from16 v44, v0

    const/16 v0, 0x64

    move-object/from16 v45, v3

    const-string v3, "COMBINED"

    invoke-direct {v1, v3, v2, v0}, Lb3/w$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb3/w$b;->COMBINED:Lb3/w$b;

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move-object/from16 v46, v24

    move-object/from16 v2, v25

    move-object/from16 v47, v27

    move-object/from16 v48, v28

    move-object/from16 v49, v30

    move-object/from16 v50, v31

    move-object/from16 v51, v33

    move-object/from16 v52, v34

    move-object/from16 v53, v36

    move-object/from16 v54, v37

    move-object/from16 v55, v39

    move-object/from16 v56, v40

    move-object/from16 v57, v41

    move-object/from16 v58, v42

    move-object/from16 v59, v43

    move-object/from16 v60, v44

    move-object/from16 v3, v45

    filled-new-array/range {v0 .. v20}, [Lb3/w$b;

    move-result-object v0

    sput-object v0, Lb3/w$b;->$VALUES:[Lb3/w$b;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lb3/w$b;->valueMap:Landroid/util/SparseArray;

    move-object/from16 v1, v38

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v35

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v32

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v29

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v26

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v46

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v47

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v48

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v49

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v50

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v51

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v52

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v53

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v54

    const/16 v2, 0xd

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v55

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v56

    const/16 v2, 0xf

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v57

    const/16 v2, 0x10

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v58

    const/16 v2, 0x11

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v59

    const/16 v2, 0x12

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v60

    const/16 v2, 0x13

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

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

    iput p3, p0, Lb3/w$b;->value:I

    return-void
.end method

.method public static forNumber(I)Lb3/w$b;
    .locals 1

    sget-object v0, Lb3/w$b;->valueMap:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb3/w$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lb3/w$b;
    .locals 1

    const-class v0, Lb3/w$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb3/w$b;

    return-object p0
.end method

.method public static values()[Lb3/w$b;
    .locals 1

    sget-object v0, Lb3/w$b;->$VALUES:[Lb3/w$b;

    invoke-virtual {v0}, [Lb3/w$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb3/w$b;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lb3/w$b;->value:I

    return v0
.end method
