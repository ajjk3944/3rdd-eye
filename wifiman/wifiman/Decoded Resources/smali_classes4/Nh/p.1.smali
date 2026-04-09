.class LNh/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/z;

.field private final b:LMh/k;


# direct methods
.method public constructor <init>(LNh/z;LMh/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/p;->a:LNh/z;

    iput-object p2, p0, LNh/p;->b:LMh/k;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LNh/p;->a:LNh/z;

    iget-object v1, p0, LNh/p;->b:LMh/k;

    invoke-static {v0, v1}, LNh/z;->i0(LNh/z;LMh/k;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
