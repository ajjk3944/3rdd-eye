.class final Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;-><init>(LG6/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;


# direct methods
.method constructor <init>(Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$d;->a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LG6/G$a;)LT8/a$d;
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$d;->a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    invoke-static {v0, p1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->b(Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;LG6/G$a;)LT8/a$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6/G$a;

    invoke-virtual {p0, p1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$d;->a(LG6/G$a;)LT8/a$d;

    move-result-object p1

    return-object p1
.end method
