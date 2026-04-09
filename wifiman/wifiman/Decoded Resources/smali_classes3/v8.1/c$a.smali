.class final Lv8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lv8/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv8/c$a;

    invoke-direct {v0}, Lv8/c$a;-><init>()V

    sput-object v0, Lv8/c$a;->a:Lv8/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ljava/lang/String;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSd/d$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LSd/d$b;->b()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, LL8/f;->a(Linet/ipaddr/g;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lv8/c$a;->a(Ll9/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
