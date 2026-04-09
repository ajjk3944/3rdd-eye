.class public final LH8/l$b$c;
.super LH8/l$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/l$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:LH8/l$b$c;

.field private static final b:LH8/l$a;

.field private static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/l$b$c;

    invoke-direct {v0}, LH8/l$b$c;-><init>()V

    sput-object v0, LH8/l$b$c;->a:LH8/l$b$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LH8/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-boolean v0, LH8/l$b$c;->c:Z

    return v0
.end method

.method public bridge synthetic c()Ls9/d;
    .locals 1

    invoke-virtual {p0}, LH8/l$b$c;->h()Ls9/d$b;

    move-result-object v0

    return-object v0
.end method

.method protected e()LH8/l$a;
    .locals 1

    sget-object v0, LH8/l$b$c;->b:LH8/l$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LH8/l$b$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public bridge synthetic g()Ls9/d;
    .locals 1

    invoke-virtual {p0}, LH8/l$b$c;->i()Ls9/d$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Ls9/d$b;
    .locals 2

    new-instance v0, Ls9/d$b;

    const v1, 0x7f1102f3

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0xf481842

    return v0
.end method

.method public i()Ls9/d$b;
    .locals 2

    new-instance v0, Ls9/d$b;

    const v1, 0x7f1102f6

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Loading"

    return-object v0
.end method
