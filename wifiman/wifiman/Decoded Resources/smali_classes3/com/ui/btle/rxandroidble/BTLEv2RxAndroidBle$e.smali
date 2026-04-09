.class final Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;-><init>(LG6/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;

    invoke-direct {v0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;-><init>()V

    sput-object v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;->a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT8/a$d;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e$a;

    invoke-direct {v0, p1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e$a;-><init>(LT8/a$d;)V

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LT8/a$d;

    invoke-virtual {p0, p1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;->a(LT8/a$d;)V

    return-void
.end method
