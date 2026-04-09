.class final Ln8/a$D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/a$D;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$D;

    invoke-direct {v0}, Ln8/a$D;-><init>()V

    sput-object v0, Ln8/a$D;->a:Ln8/a$D;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-interface {p1}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p1}, LCc/a;->i()Linet/ipaddr/ipv6/b;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$D;->a(LCc/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
