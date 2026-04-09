.class public final LD3/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final i:LD3/h;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:LD3/y;

.field private final d:LA5/k;

.field private final e:Lcom/google/android/gms/tasks/Task;

.field private final f:Lcom/google/android/gms/tasks/Task;

.field private final g:Ljava/lang/String;

.field private final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "optional-module-barcode"

    const-string v1, "com.google.android.gms.vision.barcode"

    invoke-static {v0, v1}, LD3/h;->h(Ljava/lang/Object;Ljava/lang/Object;)LD3/h;

    move-result-object v0

    sput-object v0, LD3/F;->i:LD3/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LA5/k;LD3/y;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LD3/F;->a:Ljava/lang/String;

    invoke-static {p1}, LA5/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LD3/F;->b:Ljava/lang/String;

    iput-object p2, p0, LD3/F;->d:LA5/k;

    iput-object p3, p0, LD3/F;->c:LD3/y;

    invoke-static {}, LD3/O;->a()LD3/O;

    iput-object p4, p0, LD3/F;->g:Ljava/lang/String;

    invoke-static {}, LA5/g;->a()LA5/g;

    move-result-object p3

    new-instance v0, LD3/D;

    invoke-direct {v0, p0}, LD3/D;-><init>(LD3/F;)V

    invoke-virtual {p3, v0}, LA5/g;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, LD3/F;->e:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, LA5/g;->a()LA5/g;

    move-result-object p3

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LD3/E;

    invoke-direct {v0, p2}, LD3/E;-><init>(LA5/k;)V

    invoke-virtual {p3, v0}, LA5/g;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, LD3/F;->f:Lcom/google/android/gms/tasks/Task;

    sget-object p2, LD3/F;->i:LD3/h;

    invoke-virtual {p2, p4}, LD3/h;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, LD3/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, LD3/F;->h:I

    return-void
.end method


# virtual methods
.method final synthetic a()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ls3/m;->a()Ls3/m;

    move-result-object v0

    iget-object v1, p0, LD3/F;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls3/m;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
