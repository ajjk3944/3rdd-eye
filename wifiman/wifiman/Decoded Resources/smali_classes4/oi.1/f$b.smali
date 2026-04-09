.class Loi/f$b;
.super Loi/f$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/f;->g(Lmh/a;Ljava/lang/Object;)Loi/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Loi/f;


# direct methods
.method constructor <init>(Loi/f;Loi/f;Lmh/a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Loi/f$b;->e:Loi/f;

    iput-object p4, p0, Loi/f$b;->d:Ljava/lang/Object;

    invoke-direct {p0, p2, p3}, Loi/f$j;-><init>(Loi/f;Lmh/a;)V

    return-void
.end method

.method private static synthetic a(I)V
    .locals 1

    const-string p0, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4"

    const-string v0, "recursionDetected"

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "@NotNull method %s.%s must not return null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected c(Z)Loi/f$o;
    .locals 1

    iget-object p1, p0, Loi/f$b;->d:Ljava/lang/Object;

    invoke-static {p1}, Loi/f$o;->d(Ljava/lang/Object;)Loi/f$o;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Loi/f$b;->a(I)V

    :cond_0
    return-object p1
.end method
