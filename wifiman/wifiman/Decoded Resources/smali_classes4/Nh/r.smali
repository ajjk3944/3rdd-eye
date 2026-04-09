.class LNh/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LMh/k;

.field private final b:LNh/z;


# direct methods
.method public constructor <init>(LMh/k;LNh/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/r;->a:LMh/k;

    iput-object p2, p0, LNh/r;->b:LNh/z;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LNh/r;->a:LMh/k;

    iget-object v1, p0, LNh/r;->b:LNh/z;

    invoke-static {v0, v1}, LNh/z;->k0(LMh/k;LNh/z;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
