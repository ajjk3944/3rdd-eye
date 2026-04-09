.class final Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;->a(LT8/a$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT8/a$d;


# direct methods
.method constructor <init>(LT8/a$d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e$a;->a:LT8/a$d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e$a;->a:LT8/a$d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BTLE Manager state - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
