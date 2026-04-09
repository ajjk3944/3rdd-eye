.class final Lfa/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfa/q;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lfa/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfa/q$a;

    invoke-direct {v0}, Lfa/q$a;-><init>()V

    sput-object v0, Lfa/q$a;->a:Lfa/q$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/g;Ljava/lang/Boolean;)Lfa/f;
    .locals 2

    const-string/jumbo v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "isLoading"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfa/e;

    invoke-virtual {p1}, LEb/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LEb/g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lfa/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    new-instance v1, Lfa/f;

    invoke-direct {v1, p2, p1, v0}, Lfa/f;-><init>(ZZLfa/e;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/g;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lfa/q$a;->a(LEb/g;Ljava/lang/Boolean;)Lfa/f;

    move-result-object p1

    return-object p1
.end method
