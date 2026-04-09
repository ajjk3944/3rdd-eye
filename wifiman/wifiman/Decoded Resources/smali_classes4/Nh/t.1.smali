.class LNh/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LNh/z;

.field private final b:LMh/k;


# direct methods
.method public constructor <init>(LNh/z;LMh/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/t;->a:LNh/z;

    iput-object p2, p0, LNh/t;->b:LMh/k;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LNh/t;->a:LNh/z;

    iget-object v1, p0, LNh/t;->b:LMh/k;

    check-cast p1, LZh/f;

    invoke-static {v0, v1, p1}, LNh/z;->m0(LNh/z;LMh/k;LZh/f;)LBh/e;

    move-result-object p1

    return-object p1
.end method
