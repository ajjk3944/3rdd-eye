.class LJh/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LJh/M;


# direct methods
.method public constructor <init>(LJh/M;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJh/L;->a:LJh/M;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LJh/L;->a:LJh/M;

    check-cast p1, LZh/c;

    invoke-static {v0, p1}, LJh/M;->b(LJh/M;LZh/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
