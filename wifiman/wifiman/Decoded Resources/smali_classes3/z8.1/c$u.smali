.class final Lz8/c$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lz8/c$u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz8/c$u;

    invoke-direct {v0}, Lz8/c$u;-><init>()V

    sput-object v0, Lz8/c$u;->a:Lz8/c$u;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lcom/ui/wifiman/ui/signal/f;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/ui/signal/f;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lcom/ui/wifiman/ui/signal/f;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lz8/c$u;->a(Ljava/util/Set;)Lcom/ui/wifiman/ui/signal/f;

    move-result-object p1

    return-object p1
.end method
