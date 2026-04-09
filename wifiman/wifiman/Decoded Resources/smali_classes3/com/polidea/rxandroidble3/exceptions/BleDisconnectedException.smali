.class public Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;
.super Lcom/polidea/rxandroidble3/exceptions/BleException;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const-string v0, ""

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 5
    invoke-static {p1, p2}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/polidea/rxandroidble3/exceptions/BleException;-><init>(Ljava/lang/String;)V

    .line 6
    iput-object p1, p0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;->a:Ljava/lang/String;

    .line 7
    iput p2, p0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;I)V
    .locals 1

    .line 2
    invoke-static {p2, p3}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/polidea/rxandroidble3/exceptions/BleException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    iput-object p2, p0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;->a:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;->b:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;

    new-instance v1, Lcom/polidea/rxandroidble3/exceptions/BleAdapterDisabledException;

    invoke-direct {v1}, Lcom/polidea/rxandroidble3/exceptions/BleAdapterDisabledException;-><init>()V

    const/4 v2, -0x1

    invoke-direct {v0, v1, p0, v2}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;I)V

    return-object v0
.end method

.method private static c(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    invoke-static {p1}, LR6/a;->a(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Disconnected from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LL6/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " with status "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " ("

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
