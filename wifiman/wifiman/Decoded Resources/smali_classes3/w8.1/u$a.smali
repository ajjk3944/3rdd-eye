.class final Lw8/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/u;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw8/u$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw8/u$a;

    invoke-direct {v0}, Lw8/u$a;-><init>()V

    sput-object v0, Lw8/u$a;->a:Lw8/u$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Ljava/lang/Boolean;)Ll9/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "isTrusted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSd/d$b;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LSd/d$b;->b()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, LL8/f;->a(Linet/ipaddr/g;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    move-object v0, p1

    :cond_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lw8/u$a;->a(Ll9/a;Ljava/lang/Boolean;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
