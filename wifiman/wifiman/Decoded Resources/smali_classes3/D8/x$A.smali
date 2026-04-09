.class final LD8/x$A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/x$A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/x$A;

    invoke-direct {v0}, LD8/x$A;-><init>()V

    sput-object v0, LD8/x$A;->a:LD8/x$A;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/ui/component/network/N;)Laf/q0;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laf/q0$a;

    invoke-direct {v0, p1}, Laf/q0$a;-><init>(Lcom/ui/wifiman/ui/component/network/N;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/component/network/N;

    invoke-virtual {p0, p1}, LD8/x$A;->a(Lcom/ui/wifiman/ui/component/network/N;)Laf/q0;

    move-result-object p1

    return-object p1
.end method
