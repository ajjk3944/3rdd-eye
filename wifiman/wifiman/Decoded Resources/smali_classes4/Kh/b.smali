.class LKh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LMh/k;

.field private final b:LKh/c;


# direct methods
.method public constructor <init>(LMh/k;LKh/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKh/b;->a:LMh/k;

    iput-object p2, p0, LKh/b;->b:LKh/c;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LKh/b;->a:LMh/k;

    iget-object v1, p0, LKh/b;->b:LKh/c;

    invoke-static {v0, v1}, LKh/c;->b(LMh/k;LKh/c;)Lpi/d0;

    move-result-object v0

    return-object v0
.end method
