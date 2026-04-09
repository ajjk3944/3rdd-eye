.class LBh/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LBh/L;


# direct methods
.method public constructor <init>(LBh/L;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBh/J;->a:LBh/L;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBh/J;->a:LBh/L;

    check-cast p1, LZh/c;

    invoke-static {v0, p1}, LBh/L;->a(LBh/L;LZh/c;)LBh/M;

    move-result-object p1

    return-object p1
.end method
