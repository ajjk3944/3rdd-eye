.class public final Lcom/ui/btle/rxandroidble/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/rxandroidble/a$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/btle/rxandroidble/a;

.field private static b:Z

.field private static c:Z

.field private static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/btle/rxandroidble/a;

    invoke-direct {v0}, Lcom/ui/btle/rxandroidble/a;-><init>()V

    sput-object v0, Lcom/ui/btle/rxandroidble/a;->a:Lcom/ui/btle/rxandroidble/a;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/ui/btle/rxandroidble/a;->c:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ne v0, v1, :cond_0

    const/16 v0, 0x203

    goto :goto_0

    :cond_0
    const/16 v0, 0x205

    :goto_0
    return v0
.end method

.method public final b()Z
    .locals 1

    sget-boolean v0, Lcom/ui/btle/rxandroidble/a;->c:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    sget-boolean v0, Lcom/ui/btle/rxandroidble/a;->d:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    sget-boolean v0, Lcom/ui/btle/rxandroidble/a;->b:Z

    return v0
.end method

.method public final e(Ljava/lang/Throwable;)Z
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/btle/v2/BTLEv2$Error;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/polidea/rxandroidble3/exceptions/BleException;

    :goto_0
    return p1
.end method
