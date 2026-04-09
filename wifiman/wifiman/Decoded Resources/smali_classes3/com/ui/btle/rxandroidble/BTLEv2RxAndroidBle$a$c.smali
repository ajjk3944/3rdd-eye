.class final Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;->b(Landroid/content/Context;)Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$c;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$c;->b:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$c;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$c;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
