.class public final Lcom/ubnt/usurvey/product/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ubnt/usurvey/product/j;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ubnt/usurvey/product/j;

    invoke-direct {v0}, Lcom/ubnt/usurvey/product/j;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/product/j;->a:Lcom/ubnt/usurvey/product/j;

    const-string/jumbo v0, "a6eb5d54f2ac1c7182b44d24bc9be7c58c2505ad"

    sput-object v0, Lcom/ubnt/usurvey/product/j;->b:Ljava/lang/String;

    const-string v0, "\"f677015021bd3ecc6d46302ab2e9de37\""

    sput-object v0, Lcom/ubnt/usurvey/product/j;->c:Ljava/lang/String;

    const-wide v0, 0x196c9643585L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/product/j;->d:Ljava/lang/Long;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/product/j;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/Long;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/product/j;->d:Ljava/lang/Long;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/product/j;->b:Ljava/lang/String;

    return-object v0
.end method
