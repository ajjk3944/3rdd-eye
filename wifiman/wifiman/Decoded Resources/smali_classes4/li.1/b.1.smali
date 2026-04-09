.class Lli/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lli/c;


# direct methods
.method public constructor <init>(Lli/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/b;->a:Lli/c;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lli/b;->a:Lli/c;

    check-cast p1, LZh/c;

    invoke-static {v0, p1}, Lli/c;->d(Lli/c;LZh/c;)LBh/M;

    move-result-object p1

    return-object p1
.end method
