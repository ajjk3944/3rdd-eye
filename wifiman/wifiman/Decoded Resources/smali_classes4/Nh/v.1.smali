.class LNh/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LBh/f0;

.field private final b:LNh/z;


# direct methods
.method public constructor <init>(LBh/f0;LNh/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/v;->a:LBh/f0;

    iput-object p2, p0, LNh/v;->b:LNh/z;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LNh/v;->a:LBh/f0;

    iget-object v1, p0, LNh/v;->b:LNh/z;

    check-cast p1, LZh/f;

    invoke-static {v0, v1, p1}, LNh/z;->o0(LBh/f0;LNh/z;LZh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
