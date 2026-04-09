.class final enum LA5/r;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final enum zza:LA5/r;

.field private static final synthetic zzb:[LA5/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LA5/r;

    const-string/jumbo v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LA5/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA5/r;->zza:LA5/r;

    filled-new-array {v0}, [LA5/r;

    move-result-object v0

    sput-object v0, LA5/r;->zzb:[LA5/r;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    const-string/jumbo p1, "INSTANCE"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[LA5/r;
    .locals 1

    sget-object v0, LA5/r;->zzb:[LA5/r;

    invoke-virtual {v0}, [LA5/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LA5/r;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, LA5/g;->a()LA5/g;

    move-result-object v0

    invoke-static {v0}, LA5/g;->e(LA5/g;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
