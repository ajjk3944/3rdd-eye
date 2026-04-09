.class final Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;
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


# static fields
.field public static final a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;

    invoke-direct {v0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;-><init>()V

    sput-object v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;->a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "Creating default BTLEManager instance"

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
