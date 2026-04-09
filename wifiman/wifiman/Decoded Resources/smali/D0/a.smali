.class public final LD0/a;
.super LD0/g;
.source "SourceFile"


# instance fields
.field private a:LD0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LD0/j;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LD0/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LD0/a;->a:LD0/j;

    return-void
.end method


# virtual methods
.method public a(LD0/c;)Z
    .locals 1

    iget-object v0, p0, LD0/a;->a:LD0/j;

    invoke-interface {v0}, LD0/j;->getKey()LD0/l;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(LD0/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD0/a;->a:LD0/j;

    invoke-interface {v0}, LD0/j;->getKey()LD0/l;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "Check failed."

    invoke-static {p1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, LD0/a;->a:LD0/j;

    invoke-interface {p1}, LD0/j;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(LD0/j;)V
    .locals 0

    iput-object p1, p0, LD0/a;->a:LD0/j;

    return-void
.end method
