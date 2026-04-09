.class public abstract LH8/l$b$b;
.super LH8/l$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/l$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/l$b$b$a;,
        LH8/l$b$b$b;,
        LH8/l$b$b$c;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LH8/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH8/l$b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic g()Ls9/d;
    .locals 1

    invoke-virtual {p0}, LH8/l$b$b;->h()Ls9/d$a;

    move-result-object v0

    return-object v0
.end method

.method public h()Ls9/d$a;
    .locals 3

    new-instance v0, Ls9/d$a;

    invoke-virtual {p0}, LH8/l$b;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LH8/l$b$b$d;

    invoke-direct {v2, p0}, LH8/l$b$b$d;-><init>(LH8/l$b$b;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method
