.class final synthetic LC3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/l;


# static fields
.field static final synthetic a:LC3/h;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LC3/h;

    invoke-direct {v0}, LC3/h;-><init>()V

    sput-object v0, LC3/h;->a:LC3/h;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    check-cast p1, LC3/s;

    sget-object v0, LC3/g;->l:Lcom/google/android/gms/common/api/a;

    invoke-static {}, LI3/m;->a()LI3/n;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, LC3/s;->k0(LI3/n;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
