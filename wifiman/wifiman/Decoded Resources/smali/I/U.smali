.class final LI/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI/U;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/U;

    invoke-direct {v0}, LI/U;-><init>()V

    sput-object v0, LI/U;->a:LI/U;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/EditorInfo;)V
    .locals 7

    invoke-static {}, LI/K;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, LI/O;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-static {}, LI/L;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-static {}, LI/M;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-static {}, LI/P;->a()Ljava/lang/Class;

    move-result-object v4

    invoke-static {}, LI/Q;->a()Ljava/lang/Class;

    move-result-object v5

    invoke-static {}, LI/S;->a()Ljava/lang/Class;

    move-result-object v6

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, LI/T;->a(Landroid/view/inputmethod/EditorInfo;Ljava/util/List;)V

    invoke-static {}, LI/K;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, LI/O;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-static {}, LI/L;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-static {}, LI/M;->a()Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v0}, LI/N;->a(Landroid/view/inputmethod/EditorInfo;Ljava/util/Set;)V

    return-void
.end method
