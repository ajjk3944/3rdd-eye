.class final synthetic LC3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/l;


# static fields
.field static final synthetic a:LC3/i;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LC3/i;

    invoke-direct {v0}, LC3/i;-><init>()V

    sput-object v0, LC3/i;->a:LC3/i;

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

    new-instance v0, LI3/d$a;

    invoke-direct {v0}, LI3/d$a;-><init>()V

    invoke-virtual {v0}, LI3/d$a;->a()LI3/d;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, LC3/s;->l0(LI3/d;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
