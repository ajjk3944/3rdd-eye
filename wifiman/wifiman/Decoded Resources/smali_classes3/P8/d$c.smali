.class final LP8/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/d$c;

    invoke-direct {v0}, LP8/d$c;-><init>()V

    sput-object v0, LP8/d$c;->a:LP8/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPf/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LPf/a;->b()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LP8/d$c;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
