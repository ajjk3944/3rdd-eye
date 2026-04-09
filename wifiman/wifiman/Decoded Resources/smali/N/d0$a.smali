.class final LN/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ls/L;

.field private final b:LIi/y0;


# direct methods
.method public constructor <init>(Ls/L;LIi/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/d0$a;->a:Ls/L;

    iput-object p2, p0, LN/d0$a;->b:LIi/y0;

    return-void
.end method


# virtual methods
.method public final a(LN/d0$a;)Z
    .locals 1

    iget-object v0, p0, LN/d0$a;->a:Ls/L;

    iget-object p1, p1, LN/d0$a;->a:Ls/L;

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, LN/d0$a;->b:LIi/y0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
