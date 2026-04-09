.class final Lk7/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lg7/e$a;

.field private c:Ljava/nio/FloatBuffer;

.field final synthetic d:Lk7/f;


# direct methods
.method public constructor <init>(Lk7/f;Ljava/lang/String;II)V
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk7/f$c;->d:Lk7/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk7/f$c;->a:Ljava/lang/String;

    sget-object p2, Lg7/e;->a:Lg7/e;

    invoke-static {p1}, Lk7/f;->d(Lk7/f;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p2, v0, p3, p4}, Lg7/e;->c(Landroid/content/Context;ILjava/lang/Integer;)Lg7/e$a;

    move-result-object p2

    iput-object p2, p0, Lk7/f$c;->b:Lg7/e$a;

    invoke-direct {p0}, Lk7/f$c;->b()[F

    move-result-object p2

    array-length p2, p2

    invoke-static {p1, p2}, Lk7/f;->c(Lk7/f;I)Ljava/nio/FloatBuffer;

    move-result-object p1

    invoke-direct {p0}, Lk7/f$c;->b()[F

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iput-object p1, p0, Lk7/f$c;->c:Ljava/nio/FloatBuffer;

    return-void
.end method

.method private final b()[F
    .locals 1

    const/16 v0, 0xc

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a()Ljava/nio/FloatBuffer;
    .locals 1

    iget-object v0, p0, Lk7/f$c;->c:Ljava/nio/FloatBuffer;

    return-object v0
.end method

.method public final c()Lg7/e$a;
    .locals 1

    iget-object v0, p0, Lk7/f$c;->b:Lg7/e$a;

    return-object v0
.end method
