.class public final LF3/T;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final k:LF3/k;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:LF3/M;

.field private final d:LA5/k;

.field private final e:Lcom/google/android/gms/tasks/Task;

.field private final f:Lcom/google/android/gms/tasks/Task;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:Ljava/util/Map;

.field private final j:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "optional-module-barcode"

    const-string v1, "com.google.android.gms.vision.barcode"

    invoke-static {v0, v1}, LF3/k;->h(Ljava/lang/Object;Ljava/lang/Object;)LF3/k;

    move-result-object v0

    sput-object v0, LF3/T;->k:LF3/k;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LA5/k;LF3/M;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LF3/T;->i:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LF3/T;->j:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LF3/T;->a:Ljava/lang/String;

    invoke-static {p1}, LA5/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LF3/T;->b:Ljava/lang/String;

    iput-object p2, p0, LF3/T;->d:LA5/k;

    iput-object p3, p0, LF3/T;->c:LF3/M;

    invoke-static {}, LF3/j0;->a()LF3/j0;

    iput-object p4, p0, LF3/T;->g:Ljava/lang/String;

    invoke-static {}, LA5/g;->a()LA5/g;

    move-result-object p3

    new-instance v0, LF3/Q;

    invoke-direct {v0, p0}, LF3/Q;-><init>(LF3/T;)V

    invoke-virtual {p3, v0}, LA5/g;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, LF3/T;->e:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, LA5/g;->a()LA5/g;

    move-result-object p3

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LF3/S;

    invoke-direct {v0, p2}, LF3/S;-><init>(LA5/k;)V

    invoke-virtual {p3, v0}, LA5/g;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, LF3/T;->f:Lcom/google/android/gms/tasks/Task;

    sget-object p2, LF3/T;->k:LF3/k;

    invoke-virtual {p2, p4}, LF3/k;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, LF3/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, LF3/T;->h:I

    return-void
.end method


# virtual methods
.method final synthetic a()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ls3/m;->a()Ls3/m;

    move-result-object v0

    iget-object v1, p0, LF3/T;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls3/m;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
