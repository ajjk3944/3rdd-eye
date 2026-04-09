.class public final Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;
.super Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ApiError"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;",
        "",
        "httpCode",
        "apiCode",
        "",
        "apiError",
        "message",
        "",
        "cause",
        "<init>",
        "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "a",
        "I",
        "getHttpCode",
        "()I",
        "b",
        "Ljava/lang/Integer;",
        "getApiCode",
        "()Ljava/lang/Integer;",
        "c",
        "Ljava/lang/String;",
        "getApiError",
        "()Ljava/lang/String;",
        "d",
        "getMessage",
        "e",
        "Ljava/lang/Throwable;",
        "getCause",
        "()Ljava/lang/Throwable;",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/Integer;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;->a:I

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;->e:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;->e:Ljava/lang/Throwable;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;->d:Ljava/lang/String;

    return-object v0
.end method
