.class final Ln8/k$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/k;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/k$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/k$e;

    invoke-direct {v0}, Ln8/k$e;-><init>()V

    sput-object v0, Ln8/k$e;->a:Ln8/k$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La8/b;La8/a;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "devices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-virtual {p2, p1}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, LCc/a;

    if-eqz p2, :cond_0

    check-cast p1, LCc/a;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La8/b;

    check-cast p2, La8/a;

    invoke-virtual {p0, p1, p2}, Ln8/k$e;->a(La8/b;La8/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
