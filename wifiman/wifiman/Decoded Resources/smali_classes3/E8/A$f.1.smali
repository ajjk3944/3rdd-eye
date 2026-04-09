.class final LE8/A$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/A$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/A$f;

    invoke-direct {v0}, LE8/A$f;-><init>()V

    sput-object v0, LE8/A$f;->a:LE8/A$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ljf/d;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b;

    if-eqz p1, :cond_0

    sget-object p1, Ljf/d$a;->a:Ljf/d$a;

    goto :goto_0

    :cond_0
    sget-object p1, Ljf/d$b;->a:Ljf/d$b;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LE8/A$f;->a(Ll9/a;)Ljf/d;

    move-result-object p1

    return-object p1
.end method
