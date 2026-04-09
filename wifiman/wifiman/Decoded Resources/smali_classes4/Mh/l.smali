.class LMh/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LMh/m;


# direct methods
.method public constructor <init>(LMh/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMh/l;->a:LMh/m;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LMh/l;->a:LMh/m;

    check-cast p1, LQh/y;

    invoke-static {v0, p1}, LMh/m;->b(LMh/m;LQh/y;)LNh/c0;

    move-result-object p1

    return-object p1
.end method
