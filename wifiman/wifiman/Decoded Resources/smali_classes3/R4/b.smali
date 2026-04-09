.class public LR4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:LO4/j;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:La3/g;


# instance fields
.field private final a:LR4/e;

.field private final b:La3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO4/j;

    invoke-direct {v0}, LO4/j;-><init>()V

    sput-object v0, LR4/b;->c:LO4/j;

    const-string/jumbo v0, "hts/cahyiseot-agolai.o/1frlglgc/aclg"

    const-string/jumbo v1, "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho"

    invoke-static {v0, v1}, LR4/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LR4/b;->d:Ljava/lang/String;

    const-string v0, "AzSBpY4F0rHiHFdinTvM"

    const-string/jumbo v1, "IayrSTFL9eJ69YeSUO2"

    invoke-static {v0, v1}, LR4/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LR4/b;->e:Ljava/lang/String;

    new-instance v0, LR4/a;

    invoke-direct {v0}, LR4/a;-><init>()V

    sput-object v0, LR4/b;->f:La3/g;

    return-void
.end method

.method constructor <init>(LR4/e;La3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR4/b;->a:LR4/e;

    iput-object p2, p0, LR4/b;->b:La3/g;

    return-void
.end method

.method public static synthetic a(LN4/F;)[B
    .locals 0

    invoke-static {p0}, LR4/b;->d(LN4/F;)[B

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;LS4/j;Lcom/google/firebase/crashlytics/internal/common/Q;)LR4/b;
    .locals 4

    invoke-static {p0}, Lc3/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lc3/u;->c()Lc3/u;

    move-result-object p0

    new-instance v0, Lcom/google/android/datatransport/cct/a;

    sget-object v1, LR4/b;->d:Ljava/lang/String;

    sget-object v2, LR4/b;->e:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/google/android/datatransport/cct/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lc3/u;->g(Lc3/f;)La3/i;

    move-result-object p0

    const-string/jumbo v0, "json"

    invoke-static {v0}, La3/b;->b(Ljava/lang/String;)La3/b;

    move-result-object v0

    sget-object v1, LR4/b;->f:La3/g;

    const-string/jumbo v2, "FIREBASE_CRASHLYTICS_REPORT"

    const-class v3, LN4/F;

    invoke-interface {p0, v2, v3, v0, v1}, La3/i;->a(Ljava/lang/String;Ljava/lang/Class;La3/b;La3/g;)La3/h;

    move-result-object p0

    new-instance v0, LR4/e;

    invoke-interface {p1}, LS4/j;->b()LS4/d;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2}, LR4/e;-><init>(La3/h;LS4/d;Lcom/google/firebase/crashlytics/internal/common/Q;)V

    new-instance p0, LR4/b;

    invoke-direct {p0, v0, v1}, LR4/b;-><init>(LR4/e;La3/g;)V

    return-object p0
.end method

.method private static synthetic d(LN4/F;)[B
    .locals 1

    sget-object v0, LR4/b;->c:LO4/j;

    invoke-virtual {v0, p0}, LO4/j;->M(LN4/F;)Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p1, "Invalid input received"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Lcom/google/firebase/crashlytics/internal/common/D;Z)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, LR4/b;->a:LR4/e;

    invoke-virtual {v0, p1, p2}, LR4/e;->i(Lcom/google/firebase/crashlytics/internal/common/D;Z)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
