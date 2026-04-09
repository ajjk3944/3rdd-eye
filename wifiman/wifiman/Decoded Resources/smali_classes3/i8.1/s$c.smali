.class public final Li8/s$c;
.super Li8/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/s$c$a;,
        Li8/s$c$b;
    }
.end annotation


# static fields
.field public static final c:Li8/s$c$a;


# instance fields
.field private final b:LQe/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/s$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li8/s$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li8/s$c;->c:Li8/s$c$a;

    return-void
.end method

.method public constructor <init>(LQe/c$a;)V
    .locals 1

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li8/s;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Li8/s$c;->b:LQe/c$a;

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 3

    sget-object v0, Li8/s;->a:Li8/s$a;

    invoke-static {v0}, Li8/s$a;->a(Li8/s$a;)Landroid/net/Uri$Builder;

    move-result-object v0

    iget-object v1, p0, Li8/s$c;->b:LQe/c$a;

    sget-object v2, Li8/s$c$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    sget-object v1, Li8/s$b;->HOME_TELEPORT:Li8/s$b;

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v1, Li8/s$b;->HOME_DISCOVERY:Li8/s$b;

    goto :goto_0

    :cond_2
    sget-object v1, Li8/s$b;->HOME_SCAN:Li8/s$b;

    goto :goto_0

    :cond_3
    sget-object v1, Li8/s$b;->HOME_SIGNAL:Li8/s$b;

    goto :goto_0

    :cond_4
    sget-object v1, Li8/s$b;->HOME_SPEED:Li8/s$b;

    :goto_0
    invoke-virtual {v1}, Li8/s$b;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    const-string/jumbo v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()LQe/c$a;
    .locals 1

    iget-object v0, p0, Li8/s$c;->b:LQe/c$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li8/s$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li8/s$c;

    iget-object v1, p0, Li8/s$c;->b:LQe/c$a;

    iget-object p1, p1, Li8/s$c;->b:LQe/c$a;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Li8/s$c;->b:LQe/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Li8/s$c;->b:LQe/c$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Home(tab="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
